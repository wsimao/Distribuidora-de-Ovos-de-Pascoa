import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        iFabrica FabricaGaroto = new garoto();
        iFabrica FabricaNestle = new nestle();
        iFabrica FabricaLacta = new lacta();

        iOvos ovoAlpino = FabricaNestle.ovoDePascoa1();
        iOvos ovoClassic = FabricaNestle.ovoDePascoa2();
        iOvos ovosKitKat = FabricaNestle.ovoDePascoa3();

        iOvos ovoCrocante = FabricaGaroto.ovoDePascoa1();
        iOvos ovoTalento = FabricaGaroto.ovoDePascoa2();
        iOvos ovoBatonAoLeite = FabricaGaroto.ovoDePascoa3();

        iOvos ovoAoLeite = FabricaLacta.ovoDePascoa1();
        iOvos ovoOreo = FabricaLacta.ovoDePascoa2();
        iOvos ovoSonhoDeValsa = FabricaLacta.ovoDePascoa3();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean executando = true;
            while(executando) {
            System.out.println("ESCOLHA UMA FÁBRICA ABAIXO:");
            System.out.println("[1] Nestle");
            System.out.println("[2] Garoto");
            System.out.println("[3] Lacta");
            System.out.println("[4] Sair");
            System.out.println("Digite a opção desejada:");
            String opcao = scanner.nextLine();

            switch (opcao){
                case "1": {
                    System.out.println("ESCOLHA UM OVO DE PÁSCOA ABAIXO:");
                    System.out.println("[1] Alpino");
                    System.out.println("[2] Classic");
                    System.out.println("[3] Kit Kat");
                    System.out.println("[4] Sair");
                    System.out.println("Digite a opção desejada:");
                    String opcaoOvo = scanner.nextLine();

                        switch (opcaoOvo){
                            case "1":{
                                ovoAlpino.exibirInfoOvos();
                                break;
                            }
                            case "2":{
                                ovoClassic.exibirInfoOvos();
                            break;
                            }
                            case "3":{
                                ovosKitKat.exibirInfoOvos();
                            break;
                            }
                            case "4": {
                            executando = false;
                            System.out.println("VOCÊ ESCOLHEU SAIR. OBRIGADO :)");
                            break;
                            }
                        }
                        System.out.println("");
                        //System.out.println("******************************");
                        System.out.println("  OBRIGADO PELA PREFERÊNCIA! ");
                        System.out.println("******************************");
                        System.out.println("");
                        break;
                        }
                case "2":{
                    System.out.println("ESCOLHA UM OVO DE PÁSCOA ABAIXO:");
                    System.out.println("[1] Crocante");
                    System.out.println("[2] Talento");
                    System.out.println("[3] Baton ao Leite");
                    System.out.println("[4] Sair");
                    System.out.println("Digite a opção desejada:");
                    String opcaoOvo = scanner.nextLine();

                    switch (opcaoOvo){
                        case "1":{
                            ovoCrocante.exibirInfoOvos();
                        break;
                        }
                        case "2":{
                            ovoTalento.exibirInfoOvos();
                        break;
                        }
                        case "3":{
                         ovoBatonAoLeite.exibirInfoOvos();
                        break;
                        }
                        case "4": {
                        executando = false;
                        System.out.println("VOCÊ ESCOLHEU SAIR. OBRIGADO :)");
                        break;
                        }
                    }
                    System.out.println("");
                    //System.out.println("******************************");
                    System.out.println("  OBRIGADO PELA PREFERÊNCIA! ");
                    System.out.println("******************************");
                    System.out.println("");
                    break;
                    }
                case "4": {
                    executando = false;
                    System.out.println("VOCÊ ESCOLHEU SAIR. OBRIGADO :)");
                    break;
                }

                case "3": {
                    System.out.println("ESCOLHA UM OVO DE PÁSCOA ABAIXO:");
                    System.out.println("[1] Ao Leite");
                    System.out.println("[2] Oreo");
                    System.out.println("[3] Sonho de Valsa");
                    System.out.println("[4] Sair");
                    System.out.println("Digite a opção desejada:");
                    String opcaoOvo = scanner.nextLine();

                        switch (opcaoOvo){
                            case "1":{
                                ovoAoLeite.exibirInfoOvos();
                                break;
                            }
                            case "2":{
                                ovoOreo.exibirInfoOvos();
                            break;
                            }
                            case "3":{
                                ovoSonhoDeValsa.exibirInfoOvos();
                            break;
                            }
                            case "4": {
                            executando = false;
                            System.out.println("VOCÊ ESCOLHEU SAIR. OBRIGADO :)");
                            break;
                            }
                        }
                        System.out.println("");
                        //System.out.println("******************************");
                        System.out.println("  OBRIGADO PELA PREFERÊNCIA! ");
                        System.out.println("******************************");
                        System.out.println("");
                        break;
                    }
                }   
            }
        }   
    }
}