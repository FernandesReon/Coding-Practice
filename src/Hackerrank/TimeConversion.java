package Hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "01:05:45PM";
        String result = timeConversion(time);
        System.out.println(result);
    }

    /*
     * Convert a 12-hour time format (with AM/PM) to a 24-hour time format.
     *
     * Steps:
     * 1. Extract the hour, minutes, seconds, and the period (AM/PM) from the input.
     * 2. If the hour is "12" and the period is "AM", change the hour to "00" (midnight).
     * 3. If the period is "PM" and the hour is not "12", add 12 to the hour.
     * 4. Combine the modified hour with minutes and seconds to form the final time.
     */


    public static String timeConversion(String s) {
        String[] parts = s.split(":");
        String hour = parts[0];
        String minutes = parts[1];
        String seconds = parts[2].substring(0, 2);
        String phase = parts[2].substring(2);

        if (hour.equals("12")){
            if (phase.equalsIgnoreCase("AM")){
                hour = "00";
            }
        }
        else {
            if (phase.equalsIgnoreCase("PM")){
                int hr = Integer.parseInt(hour) + 12;
                hour = String.valueOf(hr);
            }
        }

        return hour + ":" + minutes + ":" + seconds;
    }
}
