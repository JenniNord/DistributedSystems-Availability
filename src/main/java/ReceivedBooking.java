public class ReceivedBooking {
    public long userid;
    public long requestid;
    public long dentistid;
    public long issuance;
    public String time;

    public ReceivedBooking(long userid, long requestid, long dentistid, long issuance, String time) {
        this.userid = userid;
        this.requestid = requestid;
        this.dentistid = dentistid;
        this.issuance = issuance;
        this.time = time;
    }
}
