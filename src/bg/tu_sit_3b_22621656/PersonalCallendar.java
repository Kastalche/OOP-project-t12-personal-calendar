package bg.tu_sit_3b_22621656;

import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;

import java.util.Date;
import java.util.List;

public class PersonalCallendar {
    List<Event> events;

    public void SaveEvent(Date date, Timestamp startTime, Timestamp endTime, String name, String note){
        //TODO: check if date available
        //events.add(new Event(date, startTime, endTime, name,note));
    }

    public void UnbookEvent(Event event){
        if(events.contains(event)){
            events.remove(event);
        }
    }
}
