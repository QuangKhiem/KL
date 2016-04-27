package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexCauHoi {

	// reslove kind 1,3,5,6,7,8
	FACTOR_1_METRICS factor1 = new FACTOR_1_METRICS();
	FACTOR_3_TIME factor3 = new FACTOR_3_TIME();
	FACTOR_5_DEFINE factor5 = new FACTOR_5_DEFINE();
	FACTOR_6_WHY factor6 = new FACTOR_6_WHY();
	FACTOR_7_MEANING factor7 = new FACTOR_7_MEANING();
	FACTOR_8_TREND factor8 = new FACTOR_8_TREND();
	FACTOR_9_WHERE factor9 = new FACTOR_9_WHERE();
	
	public String cauhoi;

//	public static enum Loaicauhoi {
//		FACTOR_1, FACTOR_2, FACTOR_3, FACTOR_4, FACTOR_5
//	}

	public RegexCauHoi(String cauhoi) {
		// TODO Auto-generated constructor stub
		this.cauhoi = cauhoi;
	}

	public void duyetQuaTatCaRegex() {
		countFactor1(cauhoi);
		countFactor3(cauhoi);
		countFactor5(cauhoi);
		countFactor6(cauhoi);
		countFactor7(cauhoi);
		countFactor8(cauhoi);
		countFactor9(cauhoi);
	}

	public void xetUuTienPhanLoai(){
		if(factor1.getTotalCount()==1)
		{
			factor3.setTotalCount(0);
			factor5.setTotalCount(0);
			factor8.setTotalCount(0);
			factor7.setTotalCount(0);
			factor9.setTotalCount(0);
		}
		if (factor6.getTotalCount()==1) {
			factor1.setTotalCount(0);
			factor3.setTotalCount(0);
			factor5.setTotalCount(0);
			factor8.setTotalCount(0);
			factor7.setTotalCount(0);
			factor9.setTotalCount(0);
		}
	}
	public void ketQuaPhanLoai(){
		xetUuTienPhanLoai();
		System.out.println("KẾT QUẢ PHÂN LOẠI CÂU HỎI:");
		System.out.println("1_METRICS: "+ factor1.getTotalCount());
		System.out.println("3_TIME: "+ factor3.getTotalCount());
		System.out.println("5_DEFINE: "+factor5.getTotalCount());
		System.out.println("6_WHY: "+factor6.getTotalCount());
		System.out.println("7_MEANING: "+factor7.getTotalCount());
		System.out.println("8_TREND: "+factor8.getTotalCount());
		System.out.println("9_WHERE: "+factor9.getTotalCount());
		
	}

	private void countFactor1(String cauhoi) {
		String regex = factor1.REGEX_GENERAL;
		Pattern pattern;
		Matcher matcher;
		int dem = 0;
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(cauhoi);
		if(matcher.find()){
			dem++;
		}
		factor1.setTotalCount(dem);
	}

	private void countFactor3(String cauhoi) {
		String regex = factor3.REGEX_GENERAL;
		Pattern pattern;
		Matcher matcher;
		int dem = 0;
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(cauhoi);
		if(matcher.find()){
			dem++;
		}
		factor3.setTotalCount(dem);
	}

	private void countFactor5(String cauhoi) {
		String regex = factor5.REGEX_GENERAL;
		Pattern pattern;
		Matcher matcher;
		int dem = 0;
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(cauhoi);
		if(matcher.find()){
			dem++;
		}
		factor5.setTotalCount(dem);
	}

	private void countFactor6(String cauhoi) {
		String regex = factor6.REGEX_GENERAL;
		Pattern pattern;
		Matcher matcher;
		int dem = 0;
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(cauhoi);
		if(matcher.find()){
			dem++;
		}
		factor6.setTotalCount(dem);
	}
	private void countFactor7(String cauhoi) {
		String regex = factor7.REGEX_GENERAL;
		Pattern pattern;
		Matcher matcher;
		int dem = 0;
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(cauhoi);
		if(matcher.find()){
			dem++;
		}
		factor7.setTotalCount(dem);
	}
	private void countFactor8(String cauhoi) {
		String regex = factor8.REGEX_GENERAL;
		Pattern pattern;
		Matcher matcher;
		int dem = 0;
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(cauhoi);
		if(matcher.find()){
			dem++;
		}
		factor8.setTotalCount(dem);
	}
	private void countFactor9(String cauhoi) {
		// TODO Auto-generated method stub
		String regex = factor9.REGEX_GENERAL;
		Pattern pattern;
		Matcher matcher;
		int dem = 0;
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(cauhoi);
		if(matcher.find()){
			dem++;
		}
		factor9.setTotalCount(dem);
	}
	
	
}
