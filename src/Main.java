import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;
        String burç = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün : ");
        day = input.nextInt();

        switch(month){
            case 1:
                if(day>=1 && day<=31) {
                    if (day < 22) {
                        burç = "Oğlak";
                    } else {
                        burç = "Kova";
                    }
                }else{
                    isError = true;
                    }
                break;
            case 2:
                if(day>=1 && day<=28) {
                if(day<20){
                    burç = "Kova";
                }else{
                    burç = "Balık";
                }
                }else{
                    isError = true;
                }
                break;

            case 3:
                if(day>=1 && day<=31) {
                    if(day<20){
                        burç = "Balık";
                    }else{
                        burç = "Koç";
                    }
                }else{
                    isError = true;
                }
                break;

            case 4:
                if(day>=1 && day<=30) {
                    if(day<20){
                        burç = "Koç";
                    }else{
                        burç = "Boğa";
                    }
                }else{
                    isError = true;
                }
                break;

            case 5:
                if(day>=1 && day<=31) {
                    if(day<20){
                        burç = "Boğa";
                    }else{
                        burç = "İkizler";
                    }
                }else{
                    isError = true;
                }
                break;

            case 6:
                if(day>=1 && day<=31) {
                    if(day<20){
                        burç = "İkizler";
                    }else{
                        burç = "Yengeç";
                    }
                }else{
                    isError = true;
                }
                break;

            case 7:
                if(day>=1 && day<=30) {
                    if(day<20){
                        burç = "Yengeç";
                    }else{
                        burç = "Aslan";
                    }
                }else{
                    isError = true;
                }
                break;

            case 8:
                if(day>=1 && day<=31) {
                    if(day<20){
                        burç = "Aslan";
                    }else{
                        burç = "Başak";
                    }
                }else{
                    isError = true;
                }
                break;

            case 9:
                if(day>=1 && day<=30) {
                    if(day<20){
                        burç = "Başak";
                    }else{
                        burç = "Terazi";
                    }
                }else{
                    isError = true;
                }
                break;

            case 10:
                if(day>=1 && day<=31) {
                    if(day<20){
                        burç = "Terazi";
                    }else{
                        burç = "Akrep";
                    }
                }else{
                    isError = true;
                }
                break;

            case 11:
                if(day>=1 && day<=30) {
                    if(day<20){
                        burç = "Akrep";
                    }else{
                        burç = "Yay";
                    }
                }else{
                    isError = true;
                }
                break;

            case 12:
                if(day>=1 && day<=31) {
                    if(day<20){
                        burç = "Yay";
                    }else{
                        burç = "Oğlak";
                    }
                }else{
                    isError = true;
                }
                break;

            default:
                isError = true;
        }

        if(isError){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz ! ");
        }else{
            System.out.println("Burcunuz : " + burç);
        }
    }
}