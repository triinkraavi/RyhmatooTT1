public class Mäng {
    private String meeskond1;
    private String meeskond2;


    public Mäng(String meeskond1, String meeskond2) {
        this.meeskond1 = meeskond1;
        this.meeskond2 = meeskond2;

    }

    public String getMeeskond1() {
        return meeskond1;
    }

    public String getMeeskond2() {
        return meeskond2;
    }

    @Override
    public String toString() {
        return "Mäng = " + meeskond1 + ":" + meeskond2;
    }


}
