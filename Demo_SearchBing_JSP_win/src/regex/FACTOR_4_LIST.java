package regex;

/**
 * 
 * @author neo cau hỏi liệt kê
 */
public class FACTOR_4_LIST {
	public static String REGEX_LIST = "(((Các)|(Mộtsố)|(Những)|(Nêu)|(Kể))\\s.+(là|gồm|làgì)(.+)?\\s?\\?)|([A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ].+((gồm)|(chủ yếu )|(ở)|(các)).+\\s?(nào)\\?)";
	/**
	 * 
	 * @return String[]
	 */
	private int totalCount;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public String[] getall() {
		return new String[] { REGEX_LIST };
	}

}
