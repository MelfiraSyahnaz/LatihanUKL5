/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.ukl.pkg5;

/**
 *
 * @author MOKLET-2
 */
public class LatihanUKL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi bentuk MatriksA,dan MatriksB
        int [][] matriksA = {{-5,3},{7,2}}; //deklarasi nilai dari Matriks A
        int [][] matriksB = {{3,1},{5,-2}}; //deklarasi nilai dari Matriks B
        int [][] hasil = new int [2] [2];//membentuk ordo dari kedua matriks (2*2)
        
        int kolom = 2; //jumlah kolom matriks
        int baris = 2; //jumlah baris matriks
        
        //menampilkan Matriks A
        System.out.println ("Matriks A = ");
        for (int a = 0; a < 2; a++){
            for (int b = 0; b < 2; b++){
                System.out.print (matriksA[a][b] + " ");
            }
            System.out.println ();
        }
        //menampilkan Matriks B
        System.out.println ("Matriks B = ");
        for (int m = 0; m < 2; m++){
            for (int n = 0; n < 2; n++) {
                System.out.print (matriksB [m] [n] + " "); 
            }
            System.out.println();
        }
        //proses pengurangan matriks
        for (int x = 0; x < baris; x++){
            for (int y = 0; y < kolom; y++){
                hasil[x][y] = matriksA [x][y] - matriksB[x][y];
            }
        }
        //menampilkan hasil dari proses pengurangan kedua matriks
        System.out.println ("Hasil Pengurangan dari Matriks A dan Matriks B = ");
        
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(hasil[x][y] + "  ");
               
    }
            System.out.println ();
 }
