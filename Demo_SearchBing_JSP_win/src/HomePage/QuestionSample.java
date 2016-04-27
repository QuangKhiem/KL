package HomePage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.TextField;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;

public class QuestionSample {

	public static ArrayList<String> allQuestionSampleFromFile = new ArrayList<>();
	public static ArrayList<String> allQuestionSampleResult = new ArrayList<>();
	public static ArrayList<String> questionSample = new ArrayList<>();
	public static ArrayList<String> resultSample = new ArrayList<>();

	private static void addDoc(IndexWriter w, String title) throws IOException {
		Document doc = new Document();
		doc.add(new TextField("title", title, Store.YES));
		// doc.add(new StringField("isbn", isbn, Store.YES));
		w.addDocument(doc);
	}

	public static void readFile() {
		// READ File
		try {
			FileInputStream inputStream = new FileInputStream("E:\\WORKSPACE_NEON\\Demo_SearchBing_JSP_win\\QuestionSample.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

			String tempQuestion;
			while ((tempQuestion = br.readLine()) != null) {
				tempQuestion = tempQuestion.trim();
				allQuestionSampleFromFile.add(tempQuestion);
			}
			System.out.println("doc file done!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lỗi đọc file!");
		}
	}

	public static void getResultFromSample(String question) throws IOException, ParseException {
		StandardAnalyzer analyzer = new StandardAnalyzer();
		Directory index = new RAMDirectory();
		IndexWriterConfig config = new IndexWriterConfig(analyzer);
		IndexWriter w = new IndexWriter(index, config);
		//call method
		readFile();
		
		//add data to document
		String temp;
		int n = allQuestionSampleFromFile.size();
		for (int i = 0; i < allQuestionSampleFromFile.size(); i++) {
			temp = allQuestionSampleFromFile.get(i);
			addDoc(w, temp);
		}
		w.close();
		
		//String querystr = "Nơi nào đông dân nhất?";
		Query q = new QueryParser("title", analyzer).parse(question);

		// search
		IndexReader reader = DirectoryReader.open(index);
		IndexSearcher searcher = new IndexSearcher(reader);
		// Have a lot of result, but how many result i want to show? -> set n
		TopDocs docs = searcher.search(q, n);
		ScoreDoc[] hits = docs.scoreDocs;
		// Display
		System.out.println("Found " + hits.length + " hits.");
		System.out.println("KET QUA TIM DUOC");
		if (hits.length > 0) {
			for (int i = 0; i < 3; ++i) {
				int docId = hits[i].doc;
				Document d = searcher.doc(docId);
				String getResultSample = d.get("title");
				System.out.println(getResultSample);
				allQuestionSampleResult.add(getResultSample);
			}
		}
		// phanTichKetQuaCauHoiMau
		String tempQ = "", tempA = "", tempGoc = "";
		for (int i = 0; i < allQuestionSampleResult.size(); i++) {
			tempGoc = allQuestionSampleResult.get(i);
			String[] arrListQuestion;
			arrListQuestion = tempGoc.split("\\?");
			if (arrListQuestion.length == 2) {
				tempQ = arrListQuestion[0] + "?";
				tempA = arrListQuestion[1];
			} else {
				tempQ = arrListQuestion[0] + "?";
				tempA = "";
			}
			questionSample.add(tempQ);
			resultSample.add(tempA);
		}
		

	}
	public void ketQuaLayDuoc(){
		for (int i = 0; i < allQuestionSampleResult.size(); i++) {
			System.out.println("CÂU HỎI " + i);
			System.out.println("Câu hỏi mẫu: " + questionSample.get(i));
			System.out.println("Kết quả là: " + resultSample.get(i));
		}
	}
//	 public static void main(String[] args)
//	 {
//		 String q = "nơi đông dân cư nhất ở đâu?";
//		 try {
//			getResultFromSample(q);
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("LOI!");
//			e.printStackTrace();
//		}
//	
//	 }

}
