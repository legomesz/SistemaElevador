import java.util.Scanner;

public class AplicacaoElevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador[] elevadores = new Elevador[3];
        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar elevador");
            System.out.println("2 - Consultar elevador");
            System.out.println("3 - Alterar elevador");
            System.out.println("4 - Listar elevadores");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    cadastrarElevador(scanner, elevadores);
                    break;
                case 2:
                    consultarElevador(scanner, elevadores);
                    break;
                case 3:
                    alterarElevador(scanner, elevadores);
                    break;
                case 4:
                    listarElevadores(elevadores);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 0);
    }
    
    public static void cadastrarElevador(Scanner scanner, Elevador[] elevadores) {
        System.out.println("Digite o código do elevador:");
        int codigo = scanner.nextInt();
        
        if (elevadorExiste(codigo, elevadores)) {
            System.out.println("Elevador já cadastrado");
            return;
        }
        
        int andarAtual, capacidadeMaxima;
        System.out.println("Digite o andar atual do elevador:");
        andarAtual = scanner.nextInt();
        System.out.println("Digite a capacidade máxima do elevador:");
        capacidadeMaxima = scanner.nextInt();
        
        for (int i = 0; i < elevadores.length; i++) {
            if (elevadores[i] == null) {
                elevadores[i] = new Elevador(codigo, andarAtual, capacidadeMaxima);
                System.out.println("Elevador cadastrado com sucesso");
                return;
            }
        }
        
        System.out.println("Não foi possível cadastrar o elevador. Array cheio.");
    }
    
    public static void consultarElevador(Scanner scanner, Elevador[] elevadores) {
        if (elevadoresVazio(elevadores)) {
            System.out.println("
