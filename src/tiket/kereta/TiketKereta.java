/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket.kereta;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class TiketKereta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] JenisKereta = {""
                ,"Ekonomi"
                ,"Bisnis"
                ,"Eksekutif"};
        int [] Harga       = {0
                ,200000
                ,400000
                ,800000};
        String [] Jurusan  = {""
                ,"Jakarta-Malang"
                , "Jakarta-Bandung"
                , "Jakarta-Jogja"};
        
        Scanner input = new Scanner (System.in);
        System.out.print("Nama : ");
        String Nama = input.nextLine();
        System.out.println("");
        
        for (int i=1; i<JenisKereta.length;i++){// perulangan jenis kereta
            System.out.println(i+". "+JenisKereta[i]+" Haraga "+Harga[i]);
        }
        System.out.print("Pilih Jenis Kereta : ");
        int Jenkerpilihan = input.nextInt();
        System.out.println("");
        
        for (int i=1; i<Jurusan.length;i++){ //perulangan jurusan kereta
            System.out.println(i+". "+Jurusan[i]);
        }
        System.out.print("Pilih Jurusan Kereta : ");
        int Jukerpilihan = input.nextInt();
        if (Jukerpilihan > 3| Jenkerpilihan >3){
            System.out.println ("Maaf Pilihan anda blm tersedia");
            return;
        }
        System.out.println("");
        
       
                
        System.out.print("Umur Penumpang : ");
        int Umur = input.nextInt();
        if (Umur<5){//nentukan umur bayi
            System.out.println("Penumpang      : Bayi/Balita");
            System.out.println("Penumpang Tidak memerlukan ticket");
            return;
            
        }
        System.out.println("");
        
        
        System.out.print("Nominal Pembayaran : ");
        int Bayar = input.nextInt();
        
        System.out.println("");
        
        
        System.out.println("    Pembayaran Tiket Kereta Api    "); // nota pembayaran
        System.out.println("–––––––––––––––––––––––––––––––––––");
        System.out.println("Harga : " + Harga[Jenkerpilihan]);
        System.out.println("Total Pembayaran : " + Bayar);
        System.out.println("Kembalian : " + (Bayar - Harga[Jenkerpilihan]));
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println( "                    Tiket Kereta Api                        "); // output tiket kereta
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––  ");
        System.out.println("Nama           : " + Nama);
        if(Umur > 13){ //nentukan umur 
            System.out.println("Penumpang      : Dewasa");
        }else if(Umur >= 5 ){
            System.out.println("Penumpang      : Anak-Anak");
        }
      
        System.out.println("Jurusan Kereta : " + Jurusan[Jukerpilihan]);
        System.out.println("Jenis Kereta   : " + JenisKereta[Jenkerpilihan]);
    }
    
}
