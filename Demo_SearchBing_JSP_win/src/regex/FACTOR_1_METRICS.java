package regex;

/**
 * 
 * @author neo Factor loai mot gom : - độ cao: đơn vị thường là m. - Chiều dài:
 *         đơn vị thường là km. - Nhiệt độ: đơn vị là độ(C). - Diện tích: đơn vị
 *         là ha, hoặc km2. - Dân số: đơn vị là (triệu) người. - Tỉ lệ, cơ cấu:
 *         đơn vị là %
 *
 *
 */
public class FACTOR_1_METRICS {
//	public static String REGEX_SODAN = "((t|T)ổng|bao nhiêu (triệu(\\?)?|dola(\\?)?)|vị trí thứ|(C|c)ó (mấy|bao nhiêu)|mấy|(S|s)ố (lượng|dân))+(\\s)?";
//	public static String REGEX_DOCAO = "([ở|nơi|Nơi|có]+\\s)+(cao|độ cao|thấp|độ thấp)+\\s";
//	public static String REGEX_CHIEUDAI = "(dài|(c|C)hiều dài|(K|k)hoảng cách|km)+\\s";
//	public static String REGEX_NHIETDO = "((n|N)hiệt độ|độ.)+\\s([^cao])";
//
//	public static String REGEX_DIENTIC = "\\s((d|D)iện tích|rộng)+\\s";
//	public static String REGEX_TILE = "(((M|m)ức tăng trưởng)|(chiếm|tăng) (tới|bao nhiêu.?)|nhiêu %.|(t|T)ỉ lệ)+(\\s)";
//	
	private int totalCount;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public FACTOR_1_METRICS() {
		//super();
		// TODO Auto-generated constructor stub
		totalCount = 0;
	}

	public static String REGEX_RATIO = "(((M|m)ức\\/N tăng_trưởng\\/V|chiếm\\/V|(T|t)ỉ_lệ\\/N|(T|t)ỷ_trọng\\/A).+(bao_nhiêu\\/P|là\\/V|từ\\/E|tới\\/T|đến\\/E|chiếm\\/V))|(bao_nhiêu\\/P %\\/%|nhiêu\\/I %\\/%)";
	public static String REGEX_ACREAGE = "((D|d)iện_tích\\/N).+(bao_nhiêu\\/P|là\\/V|từ\\/E|tới\\/T|đến\\/E)";
	public static String REGEX_HUMIDITY = "((Đ|đ)ộ_ẩm\\/N).+(bao_nhiêu\\/P|là\\/V|từ\\/E|tới\\/T|đến\\/E)";
	public static String REGEX_TEMPERATURE = "((N|n)hiệt_độ\\/N).+(bao_nhiêu\\/P|là\\/V|từ\\/E|tới\\/T|đến\\/E)";
	public static String REGEX_MEASURE ="(thấp\\/A|cao\\/A|dài\\/A|rộng\\/A|ngang\\/A|dọc\\/A|(Đ|đ)ộ\\/N cao\\/A|(Đ|đ)ộ\\/N thấp\\/A|chiều_cao\\/N|chiều\\/N dài\\/A).+(bao_nhiêu\\/P|là\\/V|từ\\/E|tới\\/T|đến\\/E)";
	public static String REGEX_GENERAL ="((((((N|n)hiệt độ\\s)|((Đ|đ)ộ\\s)|((C|c)hiều\\s))(cao|thấp|dài|rộng|ngắn|lớn|nhỏ|(T|t)rung bình))|((K|k)hoảng cách)|(T|t)ổng|(S|s)ản lượng|(S|s)ố lượng|(S|s)ố dân|dân cư|(T|t)ỉ lệ).+(khoảng|đến|từ|tới|chiếm|nhiêu).+)|((mấy (tầng|lớp)?).+)|(nhiêu)";
	/**
	 * getall()
	 * 
	 * @return String[] mang tat ca regex co the co cua loai
	 */
	String[] getRegexChild() {
		return new String[] { REGEX_RATIO, REGEX_ACREAGE, REGEX_HUMIDITY, REGEX_TEMPERATURE, REGEX_MEASURE};
	}
}
