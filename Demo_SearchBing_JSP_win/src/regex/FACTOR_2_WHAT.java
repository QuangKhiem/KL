package regex;

/**
 * 
 * @author neo - Tên chủng tộc - Tên người - Tên địa danh - Tên hành tinh - Tên
 *         viết tắt - Tên mùa: xuân, hạ, thu, đông,... - Tên loại gió mùa - Tên
 *         loại khí hậu - Tên hướng: Đông, Tây, Nam, Bắc, Đông Bắc, Đông Nam,
 *         Tây Bắc, Tây Nam. - Tên khoáng sản - Tên loại đất - Tên cây trồng -
 *         Tên động vật - Tên ngành nghề
 * 
 *         cai gi , nhu the nao , dac diem, dia diem, hoi ve huong se phan tich
 *         sau hon o giai doan tim regex tra loi , tam thoi dung regex_tong
 */
public class FACTOR_2_WHAT {
//	public static String REGEX_WHAT = "[A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ)].+((dạng)|(quỹ đạo)|(hiện tượng)|(tỉ lệ)|(theo đạo)|(kiểu khí hậu)|(tác động)|(mặt chiếu)|(vẽ)|(nguồn gốc)|(ảnh hưởng)|(giới hạn)|(viết tắt)|(chủ yếu)|(tên)|(môi trường)|(đặc trưng)|(gọi)|(phổ biến)|(trồng)|(quan trọng))?.+?((là)|(gì))\\s?\\?";
//	public static String REGEX_HOW = "([A-Z].+((như thế nào)|(nào)).+(như thế nào)?\\s?\\?)|([A-Z].+((như thế nào)|(nào))\\s?\\?)";
//	public static String REGEX_LOCATION = "((([A-Z])|(Quốcgia)|(Sông)|(Vùng)|(Dântộc)|(Nghề)|(Hồ))+.+((tậptrung)|(là)|(của)|(các)|(ở)|(thuộc)|(nằm)).+((nơi)|(quốcgia|(cửa)|(vùng)|(tỉnh)|(thànhphố)|(vịtrí)))\\s((nào)){1}\\s?\\?)|(((Ở)|(Vùng)|(Dân cư)|(Thành phố)).+\\s(ở đâu)\\s\\?)|(((Cảng)|(Tỉnh)|(Tây Nguyên)|(Miền)|(Nơi)|(Vào)).+((nơi nào)|(nào)|(về đâu)|(vào nơi nào)).*\\?)|([A-Z].*(tập trung).+(ở đâu)\\s?\\?)";
//	public static String REGEX_TREND = "\\s((theo hướng.?)|((H|h)ướng.?)|(hướng nào.?))+(\\s)";
	/* // phuong // huong */
	/**
	 * 
	 * @return String[] chua cac regex loai 2
	 */
	private int totalCount;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public static String REGEX_CHARACTERISTICS = "((dựa vào|loại|ưu thế|kiểu).+(gì|nào)).+|(((V|v)ấn đề|((Đ|đ)ặc)|(C|c)hủ yếu|(T|t)hay đổi|(Y|y)ếu tố|(D|d)ấu hiệu|(N|n)guồn|(Đ|đ)ịa hình).+(gì|nào|là|theo))|(((Đ|đ)ặc điểm))|(ở).+(gì|nào|theo)|(thay đổi).+(gì|là|nào)|(như thế nào)";
	public static String REGEX_GENERAL = "(((dạng hình|quỹ đạo|hiện tượng|núi|tỉ lệ|tính chất|cái|hàng|khí hậu|đá|môi trường|nguồn nước|(V|v)ật (nuôi)?)(\\s)(gì|nào)))|(([^oi])\\stác động|(L|l)oại hình|Trở ngại|hình học|(P|p)hép chiếu|tín ngưỡng|gọi|viết tắt|thuộc\\s[^(vtk)]).+(gì|nào)|((([^ca])\\s(c|n)ông nghiệp)|(Đ|đ)ường|(Q|q)uốc lộ|(L|l)oại|quan trọng).+(gì|nào|là)(\\s)?(\\?)|((N|n)gành|(N|n)hà ([^k])).+(là|nào|gì)";
//	public String[] getall() {
//		return new String[] { REGEX_HOW, REGEX_LOCATION, REGEX_TREND, REGEX_WHAT };
//	}

}
