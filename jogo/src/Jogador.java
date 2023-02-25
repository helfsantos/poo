public class Jogador {
    private String nome;
    private int xp = 0;
    private int hp = 100;
    private boolean envenenado = false;

    public Jogador() {
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    // GET DO BOOLEAN - pois vira 'is' quando é do tipo boolean
    public boolean isEnvenenado() {
        return envenenado;
    }

    // recebe dano
    public void receberDano(int pontos) {
        this.hp = this.hp - pontos;
    }

    // recebeCura
    public void receberCura(int pontos) {
        this.hp = this.hp + pontos;
    }

    public void receberExperiencia(int pontos) {
        this.xp = this.xp + pontos;
    }

    public void receberAntidoto() {
      envenenado = !envenenado;

    }

    public String getNome() {
        return nome;
    }

}
