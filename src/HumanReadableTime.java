public class HumanReadableTime {
    public String execute (int  timeInput){
        int hour = timeInput/3600;
        int minute = (timeInput-hour*3600)/60;
        int second = timeInput%60;
        return String.format("%02d",hour)+":"+String.format("%02d",minute)+":"+String.format("%02d",second);
    }
}
