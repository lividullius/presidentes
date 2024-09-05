/**
 * A classe PresidentesBR é uma classe de apllication da clase Presidentes.
 * 
 * Nela são criados um objeto para cada presidente Brasileiro.
 * Então esses objetos são armazenados dentro de um ArrayList
 * de acordo com seu mandato.
 */



import java.util.ArrayList;

public class PresidentesBR
{
   public static void main(String[]args){
   System.out.println("\f");
        System.out.println("\n *Não são inclusas figuras que faleceram ou foram vítimas de golpes de estado antes de assumir a presidência, como, por exemplo, Rodrigues Alves, em seu segundo mandato, Júlio Prestes, em 1930, Pedro Aleixo, em 1969, e Tancredo Neves, em 1985.");
       
        //definição de variaveis tipo String para armazenar diferentes partidos políticos e acontecimentos históricos relacionados à presidencia.
      
        String golpe= "Golpe de Estado.";
        String golpe2= "*Golpe de Estado.";
        String eleitoD= "Eleito diretamente.";
        String eleitoI= "Eleito indiretamente.";
        String renuncia= "Renúncia ou/e impeachment do antecessor.";
        String morte= "Morte do antecessor.";
        String morte2= "*Morte do antecessor.";
        String PartidoouViceNulos= "Nenhum.";
        String prp= "Partido Republicano Paulista(PRP).";
        String prm= "Partido Republicano Mineiro(PRM).";
        String prff= "PR Federal (Partido Republicano Federal)";
        String prf= "Partido Republicano Fluminense(PRF)";
        String prc= "Partido Republicano Conservador(PRC)";
        String ptb= "Partido Trabalhista Brasileiro(PTB).";
        String psd= "Partido Social Democrático(PSD).";
        String psp= "Partido Social Progressista(PSP).";
        String ptn= "Partido Trabalhista Nacional(PTN).";
        String arena= "Aliança Nacional Renovadora(Arena).";
        String pmdb= "Partido do Movimento Democrático Brasileiro(PMDB)/.";
        String prn= "Partido da Reconstrução Nacional(PRN).";
        String psdb= "Partido da Social Democracia Brasileira(PSDB).";
        String pt= "Partido dos Trabalhadores(PT).";

        //cria um objeto Presidentes armazenando-o na variável "a"
        Presidentes a= new Presidentes(1,"Deodoro da Fonseca.","Floriano Peixoto.",PartidoouViceNulos,1889,1891,golpe);
      
        // cria uma lista de Presidentes usando a classe ArrayList. Esta lista armazenará os objetos Presidentes.
        ArrayList<Presidentes> presidentes = new ArrayList<Presidentes>();
       
        //adiciona o objeto à lista presidentes
        presidentes.add(a);
      
        /**
        * A partir daqui o codigo cria um objeto para cada presidente da história
        * do Brasil e addiciona este objeto a lista presidentes
        * A lista acaba no presidente atual.
        */
      
        a= new Presidentes(2,"Floriano Peixoto.",PartidoouViceNulos,PartidoouViceNulos,1891,1894,renuncia);
        presidentes.add(a);
        a=new Presidentes(3,"Prudente de Morais.", "Manuel Vitorino.", prff, 1894,1898,eleitoD);
        presidentes.add(a);
        a=new Presidentes(4,"Campos Sales.", "Rosa e Silva.", prp, 1898, 1902, eleitoD);
        presidentes.add(a);
        a= new Presidentes(5,"Rodrigues Alves.", "Afonso Pena.", prp, 1902,1906,eleitoD);
        presidentes.add(a);
        a= new Presidentes(6,"Afonso Pena.", "Nilo Peçanha.", prp,1906,1909,eleitoD);
        presidentes.add(a);
        a= new Presidentes(7,"Nilo Peçanha.", PartidoouViceNulos, prf,1909,1910,morte);
        presidentes.add(a);
        a= new Presidentes(8,"Hermes da Fonseca.", "Vencelsau Brás.", prc, 1910,1914,eleitoD);
        presidentes.add(a);
        a= new Presidentes(9,"Venceslau Brás.", "Urbano Santos.", prm,1914,1918,eleitoD);
        presidentes.add(a);
        a= new Presidentes(10,"Delfim Moreira.", PartidoouViceNulos, prm,1918,1919,morte2);
        presidentes.add(a);
        a= new Presidentes(11,"Epitácio Pessoa.","Delfim Moreira até 1920 e Bueno de Paiva.",prm,1919,1922,eleitoD);
        presidentes.add(a);
        a= new Presidentes(12,"Arthur Bernardes.","Estácio Coimbra.",prm,1922,1926,eleitoD);
        presidentes.add(a);
        a= new Presidentes(13,"Washington Luís.", "Fernando de Mello Viana.", prp, 1926,1930,eleitoD);
        presidentes.add(a);
        a= new Presidentes(14,"Getúlio Vargas.",PartidoouViceNulos,PartidoouViceNulos,1930,1945,golpe2);
        presidentes.add(a);
        a= new Presidentes(15,"José Linhares.",PartidoouViceNulos,PartidoouViceNulos,1945,1946,golpe);
        presidentes.add(a);
        a= new Presidentes(16,"Eurico Gaspar Dutra.","Nereu Ramos.",psd,1946,1951,eleitoD);
        presidentes.add(a);
        a= new Presidentes(17,"Getúlio Vargas.","Café Filho.",ptb,1951,1954,eleitoD);
        presidentes.add(a);
        a= new Presidentes(18,"Café Filho.",PartidoouViceNulos,psp,1954,1955,morte);
        presidentes.add(a);
        a= new Presidentes(19,"Carlos Luz.",PartidoouViceNulos,psd,1955,1955,"Afastamento do antecessor por problemas de saúde.");
        presidentes.add(a);
        a= new Presidentes(20,"Nereu Ramos.",PartidoouViceNulos,psd,1955,1956,golpe);
        presidentes.add(a);
        a= new Presidentes(21,"Juscelino Kubitscheck.","João Goulart.",psd,1956,1961,eleitoD);
        presidentes.add(a);
        a= new Presidentes(22,"Jânio Quadros.","João Goulart.",ptn,1961,1961,eleitoD);
        presidentes.add(a);
        a= new Presidentes(23,"Ranieri Mazzilli.",PartidoouViceNulos,psd,1961,1961,renuncia);
        presidentes.add(a);
        a= new Presidentes(24,"João Goulart.",PartidoouViceNulos,ptb,1961,1964,"Antecessor devolve o cargo ao legítimo sucessor.");
        presidentes.add(a);
        a= new Presidentes(25,"Ranieri Mazzilli.",PartidoouViceNulos,psd,1964,1964,golpe);
        presidentes.add(a);
        a= new Presidentes(26,"Humberto Castelo Branco.","José Maria Alkmin.","Nenhum até 1966 e Aliança Nacional Renovadora(ARENA) a partir de 1966.",1964,1967,eleitoI);
        presidentes.add(a);
        a= new Presidentes(27,"Artur da Costa e Silva.","Pedro Aleixo.",arena,1967,1969,eleitoI);
        presidentes.add(a);
        a= new Presidentes(28,"Emílio Garrastazu Médici.","Augusto Rademaker.",arena,1969,1974,eleitoI);
        presidentes.add(a);
        a= new Presidentes(29,"Ernesto Geisel.","Adalberto Pereira dos Santos.", arena,1974,1979,eleitoI);
        presidentes.add(a);
        a= new Presidentes(30,"João Figueiredo.","Aureliano Chaves.", "Aliança Nacional Renovadora(Arena) até 1979 e Partido Democrático Social(PDS) a partir de 1980.",1979,1985,eleitoI);
        presidentes.add(a);
        a= new Presidentes(31,"José Sarney.",PartidoouViceNulos,pmdb,1985,1990,morte2);
        presidentes.add(a);
        a= new Presidentes(32,"Fernando Collor.","Itamar Franco.",prn,1990,1992,eleitoD);
        presidentes.add(a);
        a= new Presidentes(33,"Itamar Franco.",PartidoouViceNulos,pmdb,1992,1995,renuncia);
        presidentes.add(a);
        a= new Presidentes(34,"Fernando Henrique Cardoso.","Marco Marciel.",psdb,1995,2003,eleitoD);
        presidentes.add(a);
        a= new Presidentes(35,"Luiz Inácio Lula da Silva.","José Alencar.",pt,2003,2011,eleitoD);
        presidentes.add(a);
        a= new Presidentes(36,"Dilma Rousseff.","Michel Temer.",pt,2011,2016,eleitoD);
        presidentes.add(a);
        a= new Presidentes(37,"Michel Temer.",PartidoouViceNulos,pmdb,2016,2019,renuncia);
        presidentes.add(a);
        a=new Presidentes(38,"Jair Bolsonaro.","Hamilton Mourão","Partido Social Liberal(PSL) até 2019 e Partido Liberal a partir de 2021",2019,2023,eleitoD);
        presidentes.add(a);
        a=new Presidentes(39,"Luiz Inácio Lula da Silva","Geraldo Alckmin", pt, 2023,2026,eleitoD);
        presidentes.add(a);

        //utiliza um for para percorrer toda a lista e imprimi-la
        for(int i=0;i<presidentes.size();i++){
            System.out.println(presidentes.get(i));;
        }
        System.out.println("\n *Espera-se que, idealmente, o governo atual dure até, pelo menos, 2026.");
   }
}
