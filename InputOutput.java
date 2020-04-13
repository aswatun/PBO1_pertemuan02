import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner Scanner = new Scanner(System.in);
  String nama;
  int jumlahSks;
  double IPK;

  System.out.print("Masukkan nama anda");
  nama = Scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.print("Masukkan jumlah SKS yang sudah ditempuh: ");
  jumlahSks = Scanner.nextInt();

  System.out.print("Masukkan IPK Sementara : ");
  IPK = Scanner.nextDouble();

  double jumlah = IPK * jumlahSks;
  System.out.print("Total Nilai = "+jumlah);

 }
}