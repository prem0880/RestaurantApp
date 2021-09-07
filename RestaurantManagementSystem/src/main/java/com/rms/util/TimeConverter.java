package com.rms.util;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class TimeConverter {
	
	  private static final LocalTime MORNING = LocalTime.of(9, 0, 0);
	  private static final LocalTime AFTER_NOON = LocalTime.of(11, 59, 59);
	  private static final LocalTime EVENING = LocalTime.of(17, 59, 59);
	  private static final LocalTime NIGHT = LocalTime.of(21, 59, 59);
	  
	  private static LocalTime now; 
	  
	  public static String convertTo(Long time)
	  {
		
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		now = LocalTime.parse(sdf.format(date));
		 if (between(MORNING, AFTER_NOON)) {
		      return "Morning";
		 } 
		 else if (between(AFTER_NOON, EVENING)) {
		      return "Afternoon";
	     } 
		 else if (between(EVENING, NIGHT)) {
		     return "Evening";
		 } 
		 else {
		      return "Night";
	     }
		
	  }
	  
	  private static boolean between(LocalTime start, LocalTime end) {
		    return (!now.isBefore(start)) && now.isBefore(end);
	  }
	
}
