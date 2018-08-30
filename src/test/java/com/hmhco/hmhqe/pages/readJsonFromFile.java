package com.hmhco.hmhqe.pages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class readJsonFromFile {
	
/*======================================================================================================================================================================
			================================= Reading JSON Data from File for Practice Tab - Student Edition =======================================
========================================================================================================================================================================*/
	
	public void downloadedPdfList() {
		// TODO Auto-generated method stub
		String pdfName = null;
		try{
			// parsing file "DataFile.json"
			Object obj = new JSONParser().parse(new FileReader("JSONFile\\Datafile.json"));

			// Typecasting jsonObject to JSONObject
			JSONObject jsonObject = (JSONObject) obj;

			// getting String grade
			String gradeGK = (String) jsonObject.get("grade");
			System.out.println(gradeGK);

			// getting student array data
			JSONArray jasonArray = (JSONArray) jsonObject.get("student");
//			System.out.println(jasonArray);
			JSONObject jsonObject2;

			//getting jasonArray Data
			for(int i=0; i<jasonArray.size(); i++) {
				jsonObject2 = (JSONObject) jasonArray.get(i);
				//System.out.println(jsonObject2);
//				System.out.println(jsonObject2.size());
				String jsonObject3 = (String) jsonObject2.get("relative_url");
				//System.out.println(jsonObject3);
				pdfName = jsonObject3.replaceAll("/content/hsp/math/mx2018/na/grk/prc_se_9781328786487_/", "");
				System.out.println(pdfName);
				boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
				if(fileDownloadStatus) {
					System.out.println("Correct File downloaded is: " + pdfName);	
				}
				else {
					System.out.println("Correct File not downloaded is: " + pdfName);
				}
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	
/*======================================================================================================================================================================
 			================================= Reading JSON Data from File for Practice Tab - Teacher Edition =======================================
 ========================================================================================================================================================================*/
	public void downaloadedPdfListforTeacher() {

		String pdfName = null;
		try{
			//parsing file "DataFile.json"
			Object obj = new JSONParser().parse(new FileReader("JSONFile\\Datafile.json"));

			//typecasting obj to jsonObject
			JSONObject jsonObject = (JSONObject) obj;

			//getting String grade
			String gradeGK = (String) jsonObject.get("grade");
			System.out.println(gradeGK);

			//getting student array data
			JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
			//System.out.println(jasonArray);
			//System.out.println(jasonArray.size());
			JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
			//System.out.println(jsonObject2);
			System.out.println(jsonObject2.size());
			JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
			//System.out.println(jasonArray2);
			//System.out.println(jasonArray2.size());
			JSONObject jsonObject3;
			//getting jasonArray Data
			for(int i=0; i<jasonArray2.size(); i++) {
				jsonObject3 = (JSONObject) jasonArray2.get(i);
				//System.out.println(jsonObject3);
				System.out.println(jsonObject3.size());
				String jsonObject4 = (String) jsonObject3.get("relative_url");
				//System.out.println(jsonObject4);
				pdfName = jsonObject4.replaceAll("/content/hsp/math/mx2018/na/grk/prc_te_9781328786555_/", "");
				System.out.println(pdfName);
				boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
				if(fileDownloadStatus) {
					System.out.println("Correct File downloaded is: " + pdfName);	
				}
				else {
					System.out.println("File not downloaded is: " + pdfName);
				}
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	
/*======================================================================================================================================================================
	================================= Reading JSON Data from File for Reteach Tab - Student Edition =======================================
========================================================================================================================================================================*/

	public void downloadedReteachPdfListforStudent() {
		// TODO Auto-generated method stub
		String pdfName = null;
		try{
			// parsing file "DataFile.json"
			Object obj = new JSONParser().parse(new FileReader("JSON file\\DatafileReteach.json"));

			// Typecasting jsonObject to JSONObject
			JSONObject jsonObject = (JSONObject) obj;

			// getting String grade
			String gradeGK = (String) jsonObject.get("grade");
			System.out.println(gradeGK);

			// getting student array data
			JSONArray jasonArray = (JSONArray) jsonObject.get("student");
			System.out.println(jasonArray);
			JSONObject jsonObject2;

			//getting jasonArray Data
			for(int i=0; i<jasonArray.size(); i++) {
				jsonObject2 = (JSONObject) jasonArray.get(i);
				System.out.println(jsonObject2);
				System.out.println(jsonObject2.size());
				String jsonObject3 = (String) jsonObject2.get("relative_url");
				System.out.println(jsonObject3);
				pdfName = jsonObject3.replaceAll("/content/hsp/math/mx2018/na/grk/prc_se_9781328786487_/", "");
				System.out.println(pdfName);
				boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
				if(fileDownloadStatus) {
					System.out.println("Correct File downloaded is: " + pdfName);	
				}
				else {
					System.out.println("Correct File not downloaded is: " + pdfName);
				}
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}


/*======================================================================================================================================================================
		================================= Reading JSON Data from File for Reteach Tab - Teacher Edition =======================================
========================================================================================================================================================================*/
public void downloadedReteachPdfListforTeacher() {

	String pdfName = null;
	try{
		//parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileReteach.json"));

		//typecasting obj to jsonObject
		JSONObject jsonObject = (JSONObject) obj;

		//getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		//getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
		System.out.println(jasonArray);
		System.out.println(jasonArray.size());
		JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
		System.out.println(jsonObject2);
		System.out.println(jsonObject2.size());
		JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
		System.out.println(jasonArray2);
		System.out.println(jasonArray2.size());
		JSONObject jsonObject3;
		//getting jasonArray Data
		for(int i=0; i<jasonArray2.size(); i++) {
			jsonObject3 = (JSONObject) jasonArray2.get(i);
			System.out.println(jsonObject3);
			System.out.println(jsonObject3.size());
			String jsonObject4 = (String) jsonObject3.get("relative_url");
			System.out.println(jsonObject4);
			pdfName = jsonObject4.replaceAll("/content/hsp/math/mx2018/na/grk/prc_te_9781328786555_/", "");
			System.out.println(pdfName);
			boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
			if(fileDownloadStatus) {
				System.out.println("Correct File downloaded is: " + pdfName);	
			}
			else {
				System.out.println("File not downloaded is: " + pdfName);
			}
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}

/*======================================================================================================================================================================
			================================= Reading JSON Data from File for Challenge Tab - Student Edition =======================================
========================================================================================================================================================================*/

public void downloadedChallengePdfListforStudent() {
	// TODO Auto-generated method stub
	String pdfName = null;
	try{
		// parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileChallenge.json"));

		// Typecasting jsonObject to JSONObject
		JSONObject jsonObject = (JSONObject) obj;

		// getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		// getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("student");
//		System.out.println(jasonArray);
		JSONObject jsonObject2;

		//getting jasonArray Data
		for(int i=0; i<jasonArray.size(); i++) {
			jsonObject2 = (JSONObject) jasonArray.get(i);
			//System.out.println(jsonObject2);
			System.out.println(jsonObject2.size());
			String jsonObject3 = (String) jsonObject2.get("relative_url");
			//System.out.println(jsonObject3);
			pdfName = jsonObject3.replaceAll("/content/hsp/math/mx2018/na/grk/prc_se_9781328786487_/", "");
			System.out.println(pdfName);
			boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
			if(fileDownloadStatus) {
				System.out.println("Correct File downloaded is: " + pdfName);	
			}
			else {
				System.out.println("Correct File not downloaded is: " + pdfName);
			}
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}


/*======================================================================================================================================================================
				================================= Reading JSON Data from File for Challenge Tab - Teacher Edition =======================================
========================================================================================================================================================================*/
public void downloadedChallengePdfListforTeacher() {

	String pdfName = null;
	try{
		//parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileChallenge.json"));

		//typecasting obj to jsonObject
		JSONObject jsonObject = (JSONObject) obj;

		//getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		//getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
		//System.out.println(jasonArray);
		//System.out.println(jasonArray.size());
		JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
		//System.out.println(jsonObject2);
		System.out.println(jsonObject2.size());
		JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
		//System.out.println(jasonArray2);
		//System.out.println(jasonArray2.size());
		JSONObject jsonObject3;
		//getting jasonArray Data
		for(int i=0; i<jasonArray2.size(); i++) {
			jsonObject3 = (JSONObject) jasonArray2.get(i);
			//System.out.println(jsonObject3);
			System.out.println(jsonObject3.size());
			String jsonObject4 = (String) jsonObject3.get("relative_url");
			//System.out.println(jsonObject4);
			pdfName = jsonObject4.replaceAll("/content/hsp/math/mx2018/na/grk/prc_te_9781328786555_/", "");
			System.out.println(pdfName);
			boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
			if(fileDownloadStatus) {
				System.out.println("Correct File downloaded is: " + pdfName);	
			}
			else {
				System.out.println("File not downloaded is: " + pdfName);
			}
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}
	

/*======================================================================================================================================================================
				================================= Reading JSON Data from File for Teacher Activity Cards Tab =======================================
========================================================================================================================================================================*/

public void downloadedActivityCardsPdfListforTeacher() {

	String pdfName = null;
	try{
		//parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileActivityCards.json"));

		//typecasting obj to jsonObject
		JSONObject jsonObject = (JSONObject) obj;

		//getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		//getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
		//System.out.println(jasonArray);
		//System.out.println(jasonArray.size());
		JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
		//System.out.println(jsonObject2);
		System.out.println(jsonObject2.size());
		JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
		//System.out.println(jasonArray2);
		//System.out.println(jasonArray2.size());
		JSONObject jsonObject3;
		//getting jasonArray Data
		for(int i=0; i<jasonArray2.size(); i++) {
			jsonObject3 = (JSONObject) jasonArray2.get(i);
			//System.out.println(jsonObject3);
			System.out.println(jsonObject3.size());
			String jsonObject4 = (String) jsonObject3.get("relative_url");
			//System.out.println(jsonObject4);
			String pdfNameInitial = jsonObject4.replaceAll("/content/hsp/math/mx2018/na/grk/activity_cards_9781328786623_/", "");
//			StringBuffer sb1 = new StringBuffer(pdfNameInitial);
//		    sb1.delete(11,0);
			pdfName = pdfNameInitial.replaceAll(".pdf#page=", " (");
			System.out.println(pdfName);
			boolean fileDownloadStatus = fileDownload.isFiledownloadActivityCards("C:\\Users\\rahul.shah\\Downloads", pdfName);
			if(fileDownloadStatus) {
				System.out.println("Correct File downloaded is: " + pdfName);	
			}
			else {
				System.out.println("File not downloaded is: " + pdfName);
			}
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}

/*======================================================================================================================================================================
				================================= Reading JSON Data from File for Teacher In-depth Inquiry based Task Tab =======================================
========================================================================================================================================================================*/

public void downloadedInquirybasedTaskPdfListforTeacher() {

	String pdfName = null;
	try{
		//parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileInquirybasedTask.json"));

		//typecasting obj to jsonObject
		JSONObject jsonObject = (JSONObject) obj;

		//getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		//getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
		//System.out.println(jasonArray);
		//System.out.println(jasonArray.size());
		JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
		//System.out.println(jsonObject2);
		System.out.println(jsonObject2.size());
		JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
		//System.out.println(jasonArray2);
		//System.out.println(jasonArray2.size());
		JSONObject jsonObject3;
		//getting jasonArray Data
		for(int i=0; i<jasonArray2.size(); i++) {
			jsonObject3 = (JSONObject) jasonArray2.get(i);
			//System.out.println(jsonObject3);
			System.out.println(jsonObject3.size());
			String jsonObject4 = (String) jsonObject3.get("relative_url");
			//System.out.println(jsonObject4);
			pdfName = jsonObject4.replaceAll("/content/hsp/math/mx2018/na/grk/inquiry_based_tasks_9781328786692_/", "");
			System.out.println(pdfName);
			boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
			if(fileDownloadStatus) {
				System.out.println("Correct File downloaded is: " + pdfName);	
			}
			else {
				System.out.println("File not downloaded is: " + pdfName);
			}
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}

/*======================================================================================================================================================================
			================================= Reading JSON Data from File for Teacher Center Planning Guide Tab =======================================
========================================================================================================================================================================*/

public void downloadedPlanningGuidePdfListforTeacher() {

	String pdfName = null;
	try{
		//parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafilePlanningGuide.json"));

		//typecasting obj to jsonObject
		JSONObject jsonObject = (JSONObject) obj;

		//getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		//getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
		//System.out.println(jasonArray);
		//System.out.println(jasonArray.size());
		JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
		//System.out.println(jsonObject2);
		System.out.println(jsonObject2.size());
		JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
		//System.out.println(jasonArray2);
		//System.out.println(jasonArray2.size());
		JSONObject jsonObject3;
		
		//getting jasonArray Data
		for(int i=0; i<jasonArray2.size(); i++) {
			jsonObject3 = (JSONObject) jasonArray2.get(i);
			//System.out.println(jsonObject3);
			System.out.println(jsonObject3.size());
			String jsonObject4 = (String) jsonObject3.get("relative_url");
			//System.out.println(jsonObject4);
			pdfName = jsonObject4.replaceAll("/content/hsp/math/mx2018/na/grk/planning_guide_9781328786760_/", "");
			System.out.println(pdfName);
			boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
			if(fileDownloadStatus) {
				System.out.println("Correct File downloaded is: " + pdfName);	
			}
			else {
				System.out.println("File not downloaded is: " + pdfName);
			}
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}

/*======================================================================================================================================================================
						================================= Reading JSON Data from File for Games Tab =======================================
========================================================================================================================================================================*/

public void downloadedGamesPdfListforTeacher() {

	String pdfName = null;
	try{
		//parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileGames.json"));

		//typecasting obj to jsonObject
		JSONObject jsonObject = (JSONObject) obj;

		//getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		//getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
		//System.out.println(jasonArray);
		//System.out.println(jasonArray.size());
		JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
		//System.out.println(jsonObject2);
		System.out.println(jsonObject2.size());
		JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
		//System.out.println(jasonArray2);
		//System.out.println(jasonArray2.size());
		JSONObject jsonObject3;

		//getting jasonArray Data
		for(int i=0; i<jasonArray2.size(); i++) {
			jsonObject3 = (JSONObject) jasonArray2.get(i);
			//System.out.println(jsonObject3);
			System.out.println(jsonObject3.size());
			String jsonObject4 = (String) jsonObject3.get("relative_url");
			//System.out.println(jsonObject4);
			pdfName = jsonObject4.replaceAll("/content/hsp/math/mx2018/na/grk/game_boards_9781328787408_/", "");
			System.out.println(pdfName);
			boolean fileDownloadStatus = fileDownload.isFiledownload("C:\\Users\\rahul.shah\\Downloads", pdfName);
			if(fileDownloadStatus) {
				System.out.println("Correct File downloaded is: " + pdfName);	
			}
			else {
				System.out.println("File not downloaded is: " + pdfName);
			}
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}

/*======================================================================================================================================================================
						================================= Reading JSON Data from File for Fluency Builder Tab =======================================
========================================================================================================================================================================*/

public void downloadedFluencyBuilderPdfListforTeacher() {

	String pdfName = null;
	try{
		//parsing file "DataFile.json"
		Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileFluencyBuilder.json"));

		//typecasting obj to jsonObject
		JSONObject jsonObject = (JSONObject) obj;

		//getting String grade
		String gradeGK = (String) jsonObject.get("grade");
		System.out.println(gradeGK);

		//getting student array data
		JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
		//System.out.println(jasonArray);
		//System.out.println(jasonArray.size());
		JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
		//System.out.println(jsonObject2);
		System.out.println(jsonObject2.size());
		JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
		//System.out.println(jasonArray2);
		//System.out.println(jasonArray2.size());
		JSONObject jsonObject3;

		//getting jasonArray Data
		for(int i=0; i<jasonArray2.size(); i++) {
			jsonObject3 = (JSONObject) jasonArray2.get(i);
			//System.out.println(jsonObject3);
			System.out.println(jsonObject3.size());
			pdfName = (String) jsonObject3.get("HMH_ID");
			System.out.println(pdfName);
		}
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (ParseException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}

//End
}

