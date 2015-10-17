package org.usfirst.frc.team20.robot;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSON {

	public int travelEncVal=0;
	public void reader() {
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader(
					"C:/Users/Hiren Bhavsar/Documents/JSONEclipseAuto.txt"));

			JSONObject rootObj = (JSONObject) obj;

			JSONArray DriveMove = (JSONArray) rootObj.get("Drive");

			@SuppressWarnings("unchecked")
			Iterator<String> iterator =	DriveMove.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				travelEncVal= Integer.parseInt(iterator.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
