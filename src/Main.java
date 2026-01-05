void main(String[] args) {

    int prodotto = Exe1.multiply(5, 10);
    System.out.println("il prodotto è: " + prodotto);

    String totStringhe = Exe1.printString("Mi chiamo Salvatore e ho anni ", 35);
    System.out.println(totStringhe);

    String[] nomi = {"Salvatore", "Caterina", "Antonio", "Saverio", "Giuseppe"};
    String nuovoNome = "Samuele";
    String[] nuoviNomi = Exe1.inserisciInArray(nomi, nuovoNome);
    System.out.println(Arrays.toString(nuoviNomi));
}
