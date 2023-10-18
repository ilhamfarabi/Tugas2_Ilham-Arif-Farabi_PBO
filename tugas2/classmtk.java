class classmtk implements interpesMatematika {
    public int pertambahan(int a, int b) {
        return a+b;
    }

    public int pengurangan(int a, int b) {
        return a-b;
    }
    
    public int perkalian(int a, int b) {
        return a*b;
    }

    public int pembagian(int a, int b) {
        return a/b;
    }
    void outputnya(){
        System.out.println("Pertambahan : 20 + 10 = " + pertambahan(20,10));
        System.out.println("Pengurangan : 10 - 5 = " + pengurangan(10,5));
        System.out.println("Perkalian : 10 x 3 = " + perkalian(10, 3));
        System.out.println("Pembagian : 21 / 2 = " + pembagian(21, 2));
    }

}
