public class TwitchHub {
    public static void main(String [] args) {
        //owner subscriberType set just for future use
        TwitchChannel hq1 = new TwitchChannel("teeeler", "Owner");
        TwitchChannel hq2 = new TwitchChannel("johnnyboy345", "Owner");

        TwitchCustomer tc1 = new TwitchCustomer("tntttom", hq1);
        TwitchCustomer tc2 = new TwitchCustomer("cjose2064", hq1);
        TwitchCustomer tc3 = new TwitchCustomer("ninja", hq2);

        hq1.addObserver(tc1);
        hq1.addObserver(tc2);



        hq1.setSubType("follower");

        hq1.removeObserver(tc1);

        hq1.setSubType("Subscriber");

        hq2.addObserver(tc3);

        hq2.setSubType("prime subscriber");


    }
}
