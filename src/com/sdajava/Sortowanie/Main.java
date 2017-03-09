package com.sdajava.Sortowanie;

public class Main {

    public static void main(String[] args) {
	    int [] tab = {1,7,2,3,9,4};
        int a;
        for (int i=0; i <tab.length-1; i++){
            for (int j = 0; j < tab.length-1; j++){
                if(tab[j] > tab[j+1]){
                    a = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = a;
                }
            }
        }
        for (int i=0; i <tab.length; i++)
        System.out.print(tab[i]);

    }
}
