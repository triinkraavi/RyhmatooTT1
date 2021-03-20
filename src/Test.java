public class Test {
    public static void main(String[] args) {
        Mäng mäng1 = new Mäng("Eesti", "Saksamaa");
        Tulemus tulemus = new Tulemus();
        System.out.println(mäng1.toString() + ", tulemus: " + tulemus.tulemuseArvutamine(mäng1.getMeeskond1()) + ":" + tulemus.tulemuseArvutamine(mäng1.getMeeskond2()));
    }
}
