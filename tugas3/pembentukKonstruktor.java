package tugas3;

public class pembentukKonstruktor {
    String bingo1="B", bingo2="I", bingo3="N", bingo4="G", bingo5="O";

    public pembentukKonstruktor(String satu, String dua, String tiga, String empat, String lima){
        this.bingo1 = satu;
        this.bingo2 = dua;
        this.bingo3 = tiga;
        this.bingo4 = empat;
        this.bingo5 = lima;
    }

    public pembentukKonstruktor(String string) {
    }

    public pembentukKonstruktor() {
    }

    void tampilkanInfo() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(bingo1+"-"+bingo2+"-"+bingo3+"-"+bingo4+"-"+bingo5);
        System.out.println(bingo1+"-"+bingo2+"-"+bingo3+"-"+bingo4+"-"+bingo5);
        System.out.println(bingo1+"-"+bingo2+"-"+bingo3+"-"+bingo4+"-"+bingo5);
        System.out.println("And Bingo was his name-o.");
    }

    public static void main(String[] args) {
        String aa = "(clap)";
        pembentukKonstruktor bikin = new pembentukKonstruktor();
        bikin.tampilkanInfo();
        pembentukKonstruktor bikin2 = new pembentukKonstruktor(aa,"I","N","G","O");
        bikin2.tampilkanInfo();
        pembentukKonstruktor bikin3 = new pembentukKonstruktor(aa,aa,"N","G","O");
        bikin3.tampilkanInfo();
        pembentukKonstruktor bikin4 = new pembentukKonstruktor(aa,aa,aa,"G","O");
        bikin4.tampilkanInfo();
        pembentukKonstruktor bikin5 = new pembentukKonstruktor(aa,aa,aa,aa,"O");
        bikin5.tampilkanInfo();
        pembentukKonstruktor bikin6 = new pembentukKonstruktor(aa,aa,aa,aa,aa);
        bikin6.tampilkanInfo();
    }
}
