
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean choiseMain=false;
        while(!choiseMain){


        boolean choise=false;
        boolean choise2=false;
        Calendar kalendar = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);


            System.out.println("Zadej rok ve tvaru 2024,2025 atd..:");

            String scannerRok= sc.nextLine();
            while(!choise2){
                if ((scannerRok.length() != 4)|| !Character.isDigit(scannerRok.charAt(0))||
                        !Character.isDigit(scannerRok.charAt(1))|| !Character.isDigit(scannerRok.charAt(2))||
                        !Character.isDigit(scannerRok.charAt(3))
                        || !Character.isDigit(scannerRok.charAt(scannerRok.length() - 1)))
                {
                System.out.println("nezadal jsi rok ve správném tvaru!");
                System.out.println("zadej znova rok ve tvaru 2024,2025 atd..:");
                scannerRok=sc.nextLine();
                } else{
                    choise2=true;
                }
            }
            //String scanner = new Scanner(System.in).nextLine();
            kalendar.set(Integer.parseInt(scannerRok),0,1);
        while(!choise){
            System.out.println("Zadej měsíc ve tvaru: LEDEN,UNOR,BREZEN,DUBEN,KVETEN,CERVEN,CERVENEC,SRPEN,ZARI,RIJEN,LISTOPAD,PROSINEC" +
                    "\n" +"nebo zadej číslo měsíce od: 1-12");
           String scannerMesic=sc.nextLine().toUpperCase();
            switch (scannerMesic){
                case ("1"):
                case("LEDEN"):
                    kalendar.set(kalendar.get(Calendar.YEAR),0,1);
                    choise=true;
                    break;
                case ("2"):
                case("UNOR"):
                    kalendar.set(kalendar.get(Calendar.YEAR),1,1);
                    choise=true;
                    break;
                case ("3"):
                case("BREZEN"):
                    kalendar.set(kalendar.get(Calendar.YEAR),2,1);
                    choise=true;
                    break;
                case ("4"):
                case("DUBEN"):
                    kalendar.set(kalendar.get(Calendar.YEAR),3,1);
                    choise=true;
                    break;
                case ("5"):
                case("KVETEN"):
                    kalendar.set(kalendar.get(Calendar.YEAR),4,1);
                    choise=true;
                    break;
                case ("6"):
                case("CERVEN"):
                    kalendar.set(kalendar.get(Calendar.YEAR),5,1);
                    choise=true;
                    break;
                case ("7"):
                case("CERVENEC"):
                    kalendar.set(kalendar.get(Calendar.YEAR),6,1);
                    choise=true;
                    break;
                case ("8"):
                case("SRPEN"):
                    kalendar.set(kalendar.get(Calendar.YEAR),7,1);
                    choise=true;
                    break;
                case ("9"):
                case("ZARI"):
                    kalendar.set(kalendar.get(Calendar.YEAR),8,1);
                    choise=true;
                    break;
                case ("10"):
                case("RIJEN"):
                    kalendar.set(kalendar.get(Calendar.YEAR),9,1);
                    choise=true;
                    break;
                case ("11"):
                case("LISTOPAD"):
                    kalendar.set(kalendar.get(Calendar.YEAR),10,1);
                    choise=true;
                    break;
                case ("12"):
                case("PROSINEC"):
                    kalendar.set(kalendar.get(Calendar.YEAR),11,1);
                    choise=true;
                    break;
                default:
                    System.out.println("Nezadal jsi správně měsíc");
                    break;

            }
        }


        //kalendar.set(2024,10,1);

        //String ANSI_YELLOW= "\033[0;91m";

         String ANSI_YELLOW=  "\033[31m";
         String ANSI_RESET ="\033[0m";


        String nyni= (LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        int dnyVmesici= kalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //List<Integer> poleSmesici= new ArrayList<>();
        //if(kalendar.get(Calendar.YEAR)==2024){

            //Calendar calendar2 = Calendar.getInstance();
            //for (int i = 0; i <=11 ; i++) {
              //  kalendar.set(2024,i,1);
                //poleSmesici.add(kalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
           // }
           // for(int s: poleSmesici){
               // System.out.println(s);
           // }
      //  }
       // if(kalendar.get(Calendar.MONTH) == mesic){;
          //  int soucet=0;
           // for (int i = 0; i <= mesic ; i++) {
             //   soucet+= poleSmesici.get(i);

            //}

         //  System.out.println(soucet);


        //LocalDate nyni = (LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        //System.out.println("\n" + nyni);
        String datum = nyni.toString();  // nechat zatim ikdyz reduntant
        String[] split = datum.split("-");

        int den = Integer.parseInt(split[2]);
        String[] mesice = {
                "Leden", "Únor", "Březen", "Duben", "Květen", "Červen",
                "Červenec", "Srpen", "Září", "Říjen", "Listopad", "Prosinec"
        };
        String[] dny = {
                "ne", "po", "út", "st", "čt", "pá", "so",
                "ne", "po", "út", "st", "čt", "pá", "so"
        };

       // System.out.println(kalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        String denvMesici= String.valueOf(kalendar.get(Calendar.MONTH));

        LocalDate prvniDen = LocalDate.of(kalendar.get(Calendar.YEAR), kalendar.get(Calendar.MONTH)+1, kalendar.get(Calendar.DAY_OF_MONTH));
        int prvniDenV2 = kalendar.get(Calendar.DAY_OF_WEEK);
        // System.out.println(mesice[prvniDenV2]);
        //LocalDate posledniDen= LocalDate.of(kalendar.get(Calendar.YEAR), kalendar.get(Calendar.MONTH)+1, kalendar.get(Calendar.DAY_OF_MONTH)+6);
        //  System.out.println("TEST VYPISU PRVNIHO DNE V MESICI: " +prvniDen.getDayOfWeek());
       // System.out.println("TEST VYPISU PRVNIHO DNE V MESICI: " +dny[prvniDenV2-1]);
        //System.out.println("TEST VYPISU POSLEDNIHO DNE V MESICI: " +posledniDen.getDayOfWeek());
        //prvniDen= kalendar.get(Calendar.DAY_OF_WEEK);
       // int pomocnaMesice=-1;
        for (int i = 0; i < mesice.length ; i++) {
            if((i+1) == (Integer.parseInt(denvMesici)+1)){
                System.out.print("    "+mesice[i]);
               // pomocnaMesice=i+1;
            }
        }

        System.out.print(" "+kalendar.get(Calendar.YEAR)+"\n");
       // System.out.println("po"+"\t"+"ut"+"\t"+"st"+"\t"+"ct"+"\t"+"pa"+"\t"+"so"+"\t"+"ne");
        for (int i = 0; i <=6 ; i++) {
            System.out.print(dny[prvniDenV2-1+i]+ "\t");
        }
        System.out.println();

        int deleno =(kalendar.getActualMaximum(Calendar.DAY_OF_MONTH) / 7);
        for (int i = 1; i <= kalendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
      //  for (int i = 1; i <= soucet; i++) {
            if(Integer.parseInt(split[1]) == kalendar.get(Calendar.MONTH)+1 && i == den && Integer.parseInt(split[0])== kalendar.get(Calendar.YEAR)){
                System.out.print(ANSI_YELLOW+ i +ANSI_RESET +"\t");
            }
            else{
                System.out.print(i +"\t");
            }
            if (i % 7== 0){
                System.out.println();
            }

        }

            System.out.println();


            boolean validInput = false;
            while (!validInput) {
                System.out.println("\nChceš znova vypsat kalendář? Zadej ANO či NE. Volba NE ukončí program.");
                String sc3 = sc.nextLine().toUpperCase();  // Ověříme, že vstup je bez ohledu na velikost písmen

                switch (sc3) {
                    case "ANO":
                        validInput = true; // Pokračuj ve smyčce, pokud zadal ANO
                        break;
                    case "NE":
                        choiseMain = true; // Ukončí hlavní smyčku, pokud zadal NE
                        validInput = true;
                        break;
                    default:
                        System.out.println("Nezadal jsi ANO či NE. Zadej správně.");
                        break;
            }
            }
        }
    }
}