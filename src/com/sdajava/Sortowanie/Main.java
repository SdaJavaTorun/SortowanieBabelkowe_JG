package com.sdajava.Sortowanie;

public class Main {

    public static void main(String[] args) {
	    int [] tab = {1,4,2,3,9,8};
        int a; boolean flag = true;
        while (flag){
            int suma = 0;
            for (int j = 0; j < tab.length-1; j++){
                if(tab[j] > tab[j+1]) {
                    a = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = a;
                    suma++;
                }
            }
            if (suma == 0){
                flag = false;
            }

        }
        for (int i=0; i <tab.length; i++)
        System.out.print(tab[i]);

    }
}
