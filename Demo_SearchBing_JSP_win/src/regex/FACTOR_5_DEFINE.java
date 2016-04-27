package regex;

/**
 * 
 * @author neo Câu hỏi định nghĩa (với các từ "là gì"). Chú ý giữa câu hỏi định
 *         nghĩa và câu hỏi thuộc tính, chẳng hạn "chiều cao của núi ... là".
 *         Trong câu hỏi thuộc tính sẽ có một thuộc tính nằm trong các dạng số
 *         liệu. Trường hợp nếu xác định sai khi dùng đặc điểm này sẽ giải quyết
 *         sau nếu còn thời gian hoặc sẽ ghi vào hướng phát triển của khóa luận.
 */
public class FACTOR_5_DEFINE {
//	public static String REGEX_DEFINE = "([A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ)].+(là gì)\\s?\\?)|(((Định nghĩa)|(Khái niệm)).+\\?)|(((Định nghĩa)|(Khái niệm)).+(là gì)\\?)";

	private int totalCount;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
	public static String REGEX_GENERAL = "(.+(là gì))|((T|t)hế nào là).+|(((Đ|đ)ịnh nghĩa|(K|k)hái niệm) của).+";
//	public String[] getall() {
//		return new String[] { REGEX_DEFINE };
//	}

}
