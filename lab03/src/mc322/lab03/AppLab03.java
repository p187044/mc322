package mc322.lab03;

public class AppLab03 {
	public static void main(String[] args) {
		String comandos = "080403MCMVM";
		
		Animacao animar = new Animacao(comandos);
        System.out.println(animar.apresenta());
        while(animar.posicaoAnimacao < animar.quantidadeAnimacao){
            animar.passo();
            System.out.println(animar.apresenta());
        }
	}
}
