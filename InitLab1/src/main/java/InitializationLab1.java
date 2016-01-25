/**
 * Created by simonhamermesh on 1/21/16.
 */

public class InitializationLab1 {

    public static void main(String [ ] args){

      ColorfulThing ct1 = new ColorfulThing("red");
      ColorfulThing ct2 = new ColorfulThing("orange");
      ColorfulThing ct3 = new ColorfulThing("yellow");
      ColorfulThing ct4 = new ColorfulThing("green");
      ColorfulThing ct5 = new ColorfulThing("blue");

      ColorfulThing ct6 = new ColorfulThing(Color.RED );
      ColorfulThing ct7 = new ColorfulThing(Color.ORANGE  );
      ColorfulThing ct8 = new ColorfulThing(Color.YELLOW );
      ColorfulThing ct9 = new ColorfulThing(Color.GREEN );
      ColorfulThing ct10 = new ColorfulThing(Color.BLUE);

        System.out.println(ct1.getStrColor());
        System.out.println(ct2.getStrColor());
        System.out.println(ct3.getStrColor());
        System.out.println(ct4.getStrColor());
        System.out.println(ct5.getStrColor());

        System.out.println(ct6.getEnumColor());
        System.out.println(ct7.getEnumColor());
        System.out.println(ct8.getEnumColor());
        System.out.println(ct9.getEnumColor());
        System.out.println(ct10.getEnumColor());

    }
}
