package jfreechartrcp;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFrame;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.experimental.chart.swt.ChartComposite;

public class ViewPart1 extends ViewPart {
	private static final String CHART_PATH = "E:/test/";

	public ViewPart1() {
		// TODO Auto-generated constructor stub
	}

	// public static void main(String[] args) {
	// ViewPart1 part1 = new ViewPart1();
	// double[][] data = new double[][] { { 672, 766, 223, 540, 126 },
	// { 325, 521, 210, 340, 106 }, { 332, 256, 523, 240, 526 } };
	// String[] rowKeys = { "苹果", "梨子", "葡萄" };
	// String[] columnKeys = { "北京", "上海", "广州", "成都", "深圳" };
	// CategoryDataset dataset = part1.getBarData(data, rowKeys, columnKeys);
	// final JFreeChart viewChart = part1.createTimeXYChar("折线图", "x轴", "y轴",
	// dataset, "lineAndShap.png");
	// ChartPanel panel = new ChartPanel(viewChart);
	// JFrame frame = new JFrame();
	// frame.getContentPane().add(panel);
	// frame.show();
	//
	// }

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.VIRTUAL));
		Text text = new Text(parent, SWT.NONE);
		text.setText("sssss");

		double[][] data = new double[][] { { 672, 766, 223, 540, 126 },
				{ 325, 521, 210, 340, 106 }, { 332, 256, 523, 240, 526 } };
		String[] rowKeys = { "苹果", "梨子", "葡萄" };
		String[] columnKeys = { "北京", "上海", "广州", "成都", "深圳" };
		CategoryDataset dataset = getBarData(data, rowKeys, columnKeys);
		final JFreeChart viewChart = createTimeXYChar("折线图", "x轴", "y轴",
				dataset, "lineAndShap.png");

		final ChartComposite frame1 = new ChartComposite(parent, SWT.NONE,
				viewChart, true);
		frame1.setDisplayToolTips(true);
		frame1.setHorizontalAxisTrace(false);
		frame1.setVerticalAxisTrace(false);
	}

	public CategoryDataset getBarData(double[][] data, String[] rowKeys,
			String[] columnKeys) {
		CategoryDataset ds = DatasetUtilities.createCategoryDataset(rowKeys,
				columnKeys, data);
		System.err.println(ds);
		return ds;

	}

	public JFreeChart createTimeXYChar(String chartTitle, String x, String y,
			CategoryDataset xyDataset, String charName) {

		JFreeChart chart = ChartFactory.createLineChart(chartTitle, x, y,
				xyDataset, PlotOrientation.VERTICAL, true, true, false);

		chart.setTextAntiAlias(false);
		chart.setBackgroundPaint(Color.WHITE);
		// 设置图标题的字体重新设置title
		Font font = new Font("隶书", Font.BOLD, 25);
		TextTitle title = new TextTitle(chartTitle);
		title.setFont(font);
		chart.setTitle(title);
		// 设置面板字体
		Font labelFont = new Font("SansSerif", Font.TRUETYPE_FONT, 12);

		chart.setBackgroundPaint(Color.WHITE);

		CategoryPlot categoryplot = (CategoryPlot) chart.getPlot();
		// x轴 // 分类轴网格是否可见
		categoryplot.setDomainGridlinesVisible(true);
		// y轴 //数据轴网格是否可见
		categoryplot.setRangeGridlinesVisible(true);

		categoryplot.setRangeGridlinePaint(Color.WHITE);// 虚线色彩

		categoryplot.setDomainGridlinePaint(Color.WHITE);// 虚线色彩

		categoryplot.setBackgroundPaint(Color.lightGray);

		// 设置轴和面板之间的距离
		// categoryplot.setAxisOffset(new RectangleInsets(5D, 5D, 5D, 5D));

		CategoryAxis domainAxis = categoryplot.getDomainAxis();

		domainAxis.setLabelFont(labelFont);// 轴标题
		domainAxis.setTickLabelFont(labelFont);// 轴数值

		domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45); // 横轴上的
		// Lable
		// 45度倾斜
		// 设置距离图片左端距离
		domainAxis.setLowerMargin(0.0);
		// 设置距离图片右端距离
		domainAxis.setUpperMargin(0.0);

		NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
		numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		numberaxis.setAutoRangeIncludesZero(true);

		// 获得renderer 注意这里是下嗍造型到lineandshaperenderer！！
		LineAndShapeRenderer lineandshaperenderer = (LineAndShapeRenderer) categoryplot
				.getRenderer();

		lineandshaperenderer.setBaseShapesVisible(true); // series 点（即数据点）可见
		lineandshaperenderer.setBaseLinesVisible(true); // series 点（即数据点）间有连线可见

		// 显示折点数据
		// lineandshaperenderer.setBaseItemLabelGenerator(new
		// StandardCategoryItemLabelGenerator());
		// lineandshaperenderer.setBaseItemLabelsVisible(true);

		FileOutputStream fos_jpg = null;
		try {
			//
			isChartPathExist(CHART_PATH);
			//
			String chartName = CHART_PATH + charName;
			fos_jpg = new FileOutputStream(chartName);

			// 将报表保存为png文件
			ChartUtilities.writeChartAsPNG(fos_jpg, chart, 500, 510);

			return chart;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				fos_jpg.close();
				System.out.println("create time-createTimeXYChar.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void isChartPathExist(String chartPath) {
		File file = new File(chartPath);
		if (!file.exists()) {
			file.mkdirs();
			// log.info("CHART_PATH="+CHART_PATH+"create.");
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
