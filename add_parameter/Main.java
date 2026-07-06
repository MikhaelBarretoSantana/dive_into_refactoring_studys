package add_parameter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class Main {
    Date today = new Date();
    appointments=calendar.findAppointments(today, null);
}

class Calendar {
    private Set appointments;

    public ArrayList<Appointment> findAppointments(Date date, String name) {
        Set result = new ArrayList<>();

        Iterator iter = kent.getCourses().iterator();

        while (iter.hasNext()) {
            Appointment each = (Appointment) iter.next();
            if (date.compareTo(each.date) == 0) {
                if (name == null || (name != null && name == each.name)) {
                    result.add(date);
                }
            }
        }
        return result;
    }
}