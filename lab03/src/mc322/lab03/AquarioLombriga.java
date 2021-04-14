package mc322.lab03;

public class AquarioLombriga{
    int tamanhoLombriga;
    int tamanhoAquario;
    int posicaoLombriga;
    boolean direcaoCabeca;
    
    public AquarioLombriga(int tamanhoAquario, int tamanhoLombriga, int posicaoLombriga){
        this.tamanhoLombriga = tamanhoLombriga;
        this.tamanhoAquario = tamanhoAquario;
        this.posicaoLombriga = posicaoLombriga;
        this.direcaoCabeca = true;
    }
    
    public void crescer() {
    	this.tamanhoLombriga++;
    }
    
    public void virar() {
    	this.direcaoCabeca = !direcaoCabeca;
        this.posicaoLombriga += this.tamanhoLombriga - 1;
    }
    
    public void mover() {
    	if(this.posicaoLombriga == this.tamanhoAquario)
    		this.virar();
    	else {
            if(this.direcaoCabeca)
    	        this.posicaoLombriga--;
            else
                this.posicaoLombriga++;
        }
    }
    
    public String apresenta() {
    	StringBuilder lombrigaAquario = new StringBuilder();
    	int i = 1;
        int auxTamanhoLombriga = this.tamanhoLombriga - 1;

    	if(this.direcaoCabeca){
            while(lombrigaAquario.length() < this.tamanhoAquario){
                if(this.tamanhoAquario - this.posicaoLombriga == i)
                    lombrigaAquario.append("O");
                else if(i <= (this.tamanhoAquario - i) && (this.tamanhoAquario - this.posicaoLombriga - this.tamanhoLombriga + 2) == i){
                    while(auxTamanhoLombriga != 0){
                        lombrigaAquario.append("@");
                        auxTamanhoLombriga--;
                        i++;
                    }
                    i-=2;
                }
                else
                    lombrigaAquario.append("#");
                i++;
            }
        }
        else{
            while(lombrigaAquario.length() < this.tamanhoAquario) {
                if(this.tamanhoAquario - this.posicaoLombriga + 1 == i)
                    lombrigaAquario.append("O");
                else if(i >= (this.tamanhoAquario - i) && (auxTamanhoLombriga != 0)){
                    while(auxTamanhoLombriga != 0){
                        lombrigaAquario.append("@");
                        auxTamanhoLombriga--;
                    }
                    i += this.tamanhoLombriga - 1;
                }
                else
                    lombrigaAquario.append("#");
                i++;
            }
        }
    	
    	return lombrigaAquario.toString();
    }
}
