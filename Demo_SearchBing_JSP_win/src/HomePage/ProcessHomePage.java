package HomePage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.lucene.queryparser.classic.ParseException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ProcessAPIBING.AccountKey;
import ProcessAPIBING.GetDataFromAPI;
import regex.RegexCauHoi;

/**
 * Servlet implementation class ProcessLogin
 */
// @WebServlet("/SettingLogin")
public class ProcessHomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList<Integer> stt = new ArrayList<>();
	static ArrayList<String> titleData = new ArrayList<>();
	static ArrayList<String> descriptionData = new ArrayList<>();
	static ArrayList<String> urlWebsite = new ArrayList<>();
	String answer;
	public static String question;
	static QuestionSample obQuestionSample = new QuestionSample();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessHomePage() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter pw = response.getWriter();
//		pw.print("DO Getj");
//		ServletConfig config = this.getServletConfig();
//		ServletContext configContext = this.getServletContext();
//		//GET DATA FROM config-param:
//		String var = config.getInitParameter("VariableFromServlet");
//		//GET DATA FROM context-param:(global)
//		String varGlo = configContext.getInitParameter("varGlobal");
//		pw.println("\nhhhh");
//		pw.println(var);
//		pw.println("\n" + varGlo);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.print("DO POST111\n");
		String questionFromUser = request.getParameter("stringQuestion");
		String valueCheckbox = request.getParameter("ckSuggestion");
		pw.println(valueCheckbox);
		question = questionFromUser;
		pw.print("Câu hỏi của bạn:\n" + questionFromUser);
		resolveQuestion(questionFromUser);
		layCauHoiMau(questionFromUser);
		System.out.println("CHECKBOX: "+valueCheckbox);
		answer = "";
		for (int i = 0; i < stt.size(); i++) {
			answer += "Discription: " + descriptionData.get(i) + "<br>";
		}
		String answerSample="";
		if (valueCheckbox!=null) {
			for (int i = 0; i < obQuestionSample.questionSample.size(); i++) {
				int tempSTT = i+1;
				answerSample+="Câu hỏi "+tempSTT+": "+obQuestionSample.questionSample.get(i)+"<br>"+
							"Trả lời: "+ obQuestionSample.resultSample.get(i)+"<br>"+
							"-----------------------------------------------------<br>";
				
			}
		}
		// truyền các thuộc tính của object sang các servlet or jsp
//		ObjectDemo objectDm = new ObjectDemo("Huynh Quang Khiem", 12520201);
//		request.setAttribute("parameterTemp", objectDm);

		// response.sendRedirect("recieveData.jsp");
		System.out.println("ANSWER: " + answer);
		RequestDispatcher disPatcher = request.getRequestDispatcher("Home.jsp");
		// set attibute to pass between servlet and jsp or servlet and servlet
		// through object disPatcher
		request.setAttribute("myAnswer", answer);
		request.setAttribute("myAnswerSample", answerSample);
		disPatcher.forward(request, response);
		
		//clear data API BING
		stt.clear();
		titleData.clear();
		descriptionData.clear();
		urlWebsite.clear();
		//clear data question and answer sample
		obQuestionSample.allQuestionSampleFromFile.clear();
		obQuestionSample.allQuestionSampleResult.clear();
		obQuestionSample.questionSample.clear();
		obQuestionSample.resultSample.clear();
	}
	

	public static void layCauHoiMau(String searchText){
		//TÌM CÂU HỎI MẪU TRONG DATA
			try {
				obQuestionSample.getResultFromSample(searchText);
			} catch (IOException | ParseException e1) {
				// TODO Auto-generated catch block
				System.out.println("Loi khi goi ham getResultFromSample()_1");
				e1.printStackTrace();
			}
			obQuestionSample.ketQuaLayDuoc();
		
	}
//	public static void main(String[] args){
//		String questionFromUser = "dân số Việt Nam là bao nhiêu";
//		resolveQuestion(questionFromUser);
//		layCauHoiMau(questionFromUser);	
//	}
//	
	public static void resolveQuestion(String searchText) {
		String accountKeyEnc = AccountKey.getAccountKeyAfterEncode();
		//Phân loại câu hỏi
		RegexCauHoi rCauHoi = new RegexCauHoi(searchText);
		rCauHoi.duyetQuaTatCaRegex();
		rCauHoi.ketQuaPhanLoai();
		//Lấy dữ liệu về từ API BING
		String data = GetDataFromAPI.DataFromAPI(searchText, accountKeyEnc);
		
		try {
			JSONObject job = new JSONObject(data);
			String d = job.getString("d");
			JSONObject object2 = new JSONObject(d);
			JSONArray jArray3 = object2.getJSONArray("results");
			for (int i = 0; i < jArray3.length(); i++) {
				JSONObject object3 = jArray3.getJSONObject(i);
				String title = object3.getString("Title");
				String description = object3.getString("Description");
				String urlTemp = object3.getString("Url");
				stt.add(i);
				titleData.add(title);
				descriptionData.add(description);
				urlWebsite.add(urlTemp);

			}
			System.out.println("DATA\n");
			for (int i = 0; i < titleData.size(); i++) {
				System.out.println("STT: " + stt.get(i) + "\n");
				System.out.println("Title: " + titleData.get(i) + "\n");
				System.out.println("Discription: " + descriptionData.get(i) + "\n");
				System.out.println("URL: " + urlWebsite.get(i) + "\n");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
