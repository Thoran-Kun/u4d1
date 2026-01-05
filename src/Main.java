void main(String[] args) {

    //------------------------------ Esercizio 1 -------------------------
    int prodotto = Exe1.multiply(5, 10);
    System.out.println("il prodotto è: " + prodotto);

    String totStringhe = Exe1.printString("Mi chiamo Salvatore e ho anni ", 35);
    System.out.println(totStringhe);

    String[] nomi = {"Salvatore", "Caterina", "Antonio", "Saverio", "Giuseppe"};
    String nuovoNome = "Samuele";
    String[] nuoviNomi = Exe1.inserisciInArray(nomi, nuovoNome);
    System.out.println(Arrays.toString(nuoviNomi));

    //----------------------------------- Esercizio 2 ----------------------------
    //impostiamo lo scanner per poter dialogare con l'utente
    Scanner scanner = new Scanner(System.in);

    //chiedo all'utente di fornirci volta per volta le stringhe
    System.out.println("Ciao dammi la prima stringa");
    String str1 = scanner.nextLine();

    System.out.println("Dammi la seconda stringa");
    String str2 = scanner.nextLine();

    System.out.println("Ora dammi la terza stringa");
    String str3 = scanner.nextLine();

    String fraseCompleta = Exe2.printString(str1, str2, str3);
    System.out.println("la tua frase completa è: " + fraseCompleta);

    //googlando ho trovato questo come metodo per invertire le stringhe
    //si crea una nuova class che estende appunto StringBuilder acompaganta da reverse e toString
    String fraseInvertita = new StringBuilder(fraseCompleta).reverse().toString();
    System.out.println("la tua frase completa sarà così invertita: " + fraseInvertita);

    //--------------------------------- Esercizio 3 ----------------------------

}
