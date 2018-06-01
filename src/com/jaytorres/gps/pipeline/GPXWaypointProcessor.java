package com.jaytorres.gps.pipeline;

import java.util.ArrayList;
import java.util.Iterator;

import com.hs.gpxparser.modal.Waypoint;
import com.jaytorres.gps.pipeline.data.LatLonData;

public class GPXWaypointProcessor {
	
	private ArrayList<LatLonData> latLonData = new ArrayList<LatLonData>();
	
	public GPXWaypointProcessor(ArrayList<Waypoint> wpList) {
		if (wpList != null) {
			try {
				processWaypoints(wpList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void processWaypoints(ArrayList<Waypoint> wpList) {
		Iterator<Waypoint> itr = wpList.iterator();
		while (itr.hasNext()) {
			Waypoint wp = itr.next();
			latLonData.add(new LatLonData(wp.getLatitude(),
										  wp.getLongitude(),
										  wp.getElevation(),
										  wp.getTime()));
		}
	}
	
	public ArrayList<LatLonData> getLatLonData() {
		return latLonData;
	}

}
