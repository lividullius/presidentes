/**
 * A classe Presidentes representa dados sobre um presidente da história.
 * 
 * Cada presidentes é representado por sete campos de dados.
 * Os dados foram escolhidos com base na lista de presidentes brasileiros / estado-unidenses, dados 
 * encontrados na wikipedia.
 * @see https://pt.wikipedia.org/wiki/Lista_de_presidentes_do_Brasil
 * @see https://en.wikipedia.org/wiki/List_of_presidents_of_the_United_States
 * @author livia.dullius@edu.pucrs.br
 * @author raul.j@edu.pucrs.br
 * @author sophia.danckwardt@edu.pucrs.br
 */

public class Presidentes{
    private int numero; //número em ordem de mandato
    private String nome; //nome do presidente
    private String nomeVice; // nome do vice presidente
    private String partido; //partido do qual pertencia o presidente
    private int anoinicio; //ano inicial do seu mandato
    private int anofim; //ano final do seu mandato
    private String posse; // como chegou ao poder: Golpe de Estado, Renuncia do antecessor, morte do antecessor, eleito diretamente ou indiretamente
    
    public Presidentes(int numero,String nome, String nomeVice,String partido, int anoinicio, int anofim, String posse){
        this.numero=numero;
        this.nome=nome;
        this.nomeVice=nomeVice;
        this.partido=partido;
        this.anoinicio=anoinicio;
        this.anofim=anofim;
        this.posse=posse;
    }
    //metodos getters
    public int getNumero(){
        return numero;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeVice(){
        return nomeVice;
    }
    public String getPartido(){
        return partido;
    }
    public int getAnoInicio(){
        return anoinicio;
    }
    public int getAnoFim(){
        return anofim;
    }
    public String getPosse(){
        return posse;
    }
    //metodos setters
    public void setNumero(int novoNumero){
        numero=novoNumero;
    }
    public void setNome(String novoNome){
        nome=novoNome;
    }
    public void setNomeVice(String novoNomeVice){
        nomeVice=novoNomeVice;
    }
    public void setPartido(String novoPartido){
        partido=novoPartido;
    }
    public void setAnoInicio(int novoAnoInicio){
        anoinicio=novoAnoInicio;
    }
    public void setAnoFim(int novoAnoFim){
        anofim=novoAnoFim;
    }
    public void setPosse(String novaPosse){
        posse=novaPosse;
    }
    public String toString(){ 
        //retorna os dados coletados em formato de texto
        return "\n Presidente Número: " +numero+ "\n Nome do Presidente: " +nome+ "\n Nome do Vice-Presidente: " +nomeVice+ "\n Partido: " +partido+
        "\n Ano de inicio do mandato: " +anoinicio+ "\n Ano de fim de mandato: " +anofim+
        "\n Meio pelo qual assumiu a presidência: " +posse;
    }


}
