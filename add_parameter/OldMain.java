package add_parameter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class OldMain {
    Date today = new Date();
    appointments = calendar.findAppointments();

}

class Calendar {
    private Set appointments;

    public ArrayList<Appointment> findAppointments(Date date) {
        Set result = new ArrayList<>();

        Iterator iter = kent.getCourses().iterator();

        while (iter.hasNext()) {
            Appointment each = (Appointment) iter.next();
            if (date.compareTo(each.date) == 0) {
                result.add(date);
            }
        }
        return result;
    }
    
}