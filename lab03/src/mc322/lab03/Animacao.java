package mc322.lab03;

public class Animacao {
    String infoAquarioLombriga;
    String comandosAnimacao;
	int posicaoAnimacao;
    int quantidadeAnimacao;
	AquarioLombriga aquarioLombriga;
	
	public Animacao(String animacao) {
		this.posicaoAnimacao = 0;
		
		this.infoAquarioLombriga = animacao.substring(0, 6);
		this.comandosAnimacao = animacao.substring(6);
        this.quantidadeAnimacao = this.comandosAnimacao.length();
		
		int vetorInfo[] = new int[3];
		vetorInfo[0] = 10 * Integer.parseInt(this.infoAquarioLombriga.substring(0, 1)) + Integer.parseInt(this.infoAquarioLombriga.substring(1, 2));
		vetorInfo[1] = 10 * Integer.parseInt(this.infoAquarioLombriga.substring(2, 3)) + Integer.parseInt(this.infoAquarioLombriga.substring(3, 4));
		vetorInfo[2] = 10 * Integer.parseInt(this.infoAquarioLombriga.substring(4, 5)) + Integer.parseInt(this.infoAquarioLombriga.substring(5, 6));
		
		this.aquarioLombriga = new AquarioLombriga(vetorInfo[0], vetorInfo[1], vetorInfo[2]);
	}
	
	public String apresenta() {
		return this.aquarioLombriga.apresenta();
	}
	
	public void passo() {
        if(this.quantidadeAnimacao >= this.posicaoAnimacao){
            char[] comandos = this.comandosAnimacao.toCharArray();
            switch(comandos[this.posicaoAnimacao]) {
                case 'C':
                    this.aquarioLombriga.crescer();
                    break;
                case 'M':
                    this.aquarioLombriga.mover();
                    break;
                case 'V':
                    this.aquarioLombriga.virar();
                    break;
                default:
                    break;
            }
            this.posicaoAnimacao++;
        }
	}
}

