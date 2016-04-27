package regex;

/**
 * 
 * @author neo Thời gian: - Năm - Thế kỷ
 */
public class FACTOR_3_TIME {
//	public static String REGEX_TIME_1 = "\\b([Tt]hời gian)\\s?.+((là)|(bao lâu))+\\s?\\??";
//	public static String REGEX_TIME_2 = "[A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ].+\\s(((vào)|(những)|(thờigian)){1}ngày|nào|(ngày)|(năm nào)){1}\\s?\\??";

	private int totalCount;
	public int getTotalCount() {
		return totalCount;
	}
	
	public FACTOR_3_TIME() {
		totalCount = 0;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public static String REGEX_GENERAL = "(((vào|những|thời gian)?(ngày|tháng|năm|(T|t)hời gian)\\s(nào|gì|bao lâu))|(năm bao nhiêu))|(bao lâu\\s\\?)";
	
//	public String[] getall() {
//		return new String[] { REGEX_TIME_1, REGEX_TIME_2 };
//	}

}
