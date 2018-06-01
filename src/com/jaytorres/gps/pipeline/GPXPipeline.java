package com.jaytorres.gps.pipeline;

import java.util.ArrayList;
import java.util.Iterator;

import com.jaytorres.gps.pipeline.data.LatLonData;

public class GPXPipeline {

	public static void main(String[] args) {
		GPXReader gpxReader = new GPXReader();
		try {
			gpxReader.readWaypoints(args[0]);
			GPXWaypointProcessor processor = new GPXWaypointProcessor(gpxReader.getWaypoints());
			
			ArrayList<LatLonData> dataList = processor.getLatLonData();
			Iterator<LatLonData> itr = dataList.iterator();
			while (itr.hasNext()) {
				LatLonData data = itr.next();
				System.out.println(data.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
