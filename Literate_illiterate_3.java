package let_us_java;

public class Literate_illiterate_3 {
    public static void main(String args[]){
        int totalPopulation=80000;
        double percentageMen=52.0;
        double percentageTotalLiteracy=48.0;
        double percentageLiterateMen=35.0;

       int totalMen=(int)((percentageMen/100)*totalPopulation);
       int literateMen=(int)((percentageLiterateMen/100)*totalPopulation);
       int literateWomen=(int)((percentageTotalLiteracy/100)*totalPopulation)-literateMen;
       int illiterateMen=totalMen-literateMen;
       int illiterateWomen=totalPopulation-totalMen-literateWomen;


       System.out.println("The illiterate value of the men is:-"+illiterateMen);
       System.out.println("The illiterate value of the women is:-"+illiterateWomen);

}
}