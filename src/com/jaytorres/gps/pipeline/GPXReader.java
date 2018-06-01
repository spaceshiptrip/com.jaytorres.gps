package com.jaytorres.gps.pipeline;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.hs.gpxparser.GPXParser;
import com.hs.gpxparser.modal.GPX;
import com.hs.gpxparser.modal.Track;
import com.hs.gpxparser.modal.TrackSegment;
import com.hs.gpxparser.modal.Waypoint;

public class GPXReader {
	
	private ArrayList <Waypoint> waypoints = new ArrayList<Waypoint>(); 
		
	public void readWaypoints(String gpxFile) throws Exception {
		GPXParser p = new GPXParser();
		FileInputStream in = new FileInputStream(gpxFile);
		GPX gpx = p.parseGPX(in);
		
		HashSet<Track> tracks = gpx.getTracks();
		
		Iterator<Track> itr = tracks.iterator();  
		while(itr.hasNext()){  
		   Track cTrack = itr.next();
		   ArrayList<TrackSegment> cSegment = cTrack.getTrackSegments();
		   Iterator<TrackSegment> segItr = cSegment.iterator();
		   while(segItr.hasNext()) {
			   waypoints = segItr.next().getWaypoints();
		   }
		}  
	}
	
	public ArrayList<Waypoint> getWaypoints() {
		return waypoints;
	}
}
