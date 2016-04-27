package regex;

/**
 * Câu hỏi tại sao (với các từ "vì", "nguyên nhân"", ...)
 * 
 * @author neo
 *
 */
public class FACTOR_6_WHY {
//	public static String REGEX_CHARACTERACTICS = "(((Đ|đ)ặc điểm (là)?)|(dựa vào)|(ưu thế (gì|nào)|(thuộc (loại|kiểu) (gì)?)|((V|v)ấn đề))|((khó khăn|thuận lợi) (gì)?)|((T|t)ỉ lệ)|(chủ yếu (là|thuộc))|(trong|thuộc) khoảng|địa hình (gì|thế nào|như thế nào)|(đặc điểm|thay đổi) (gì|thế nào|như thế nào)|(đặc trưng (gì.|là.))|((Y|y)ếu tố (gì))|(dấu hiệu (gì|nào)))";
//	public static String REGEX_WHY = "(((V|v)ì.?)|(((T|t)ại)( sao)?)|((N|n)guyên nhân)|((là) do))";
//	public static String REGEX_MEAN = "\\s(((Ý|ý) nghĩa (của|gì.?))|(mục đích (gì|là)?)|(mục đích sử dụng)|(thuận lợi để)|((C|c)hức năng))+(\\s)";

//	public String[] getall() {
//		return new String[] { REGEX_CHARACTERACTICS, REGEX_MEAN, REGEX_WHY };
//	}
	private int totalCount;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public static String REGEX_GENERAL ="(((V|v)ì.?)|(((T|t)ại)( sao)?)|((N|n)guyên nhân)|((là)? do(\\s)?)(\\?))";

}
