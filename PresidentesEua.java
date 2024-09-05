
/**
 * A classe PresidentesEua é uma classe de apllication da clase Presidentes.
 * De modo similar à classe presidentesBR
 * Nela são criados um objeto para cada presidente estado-unidense.
 * Então esses objetos são armazenados dentro de um ArrayList
 * de acordo com seu mandato.
 */


import java.util.ArrayList;
public class PresidentesEua
{
    public static void main(String[]args){
        System.out.println("\f");
        //definição de variaveis tipo String que armazenam partidos políticos e acontecimentos históricos relacionados á presidencia.
        String PartidoouViceNulos= "Nenhum.";
        String d= "Partido Democrata.";
        String r= "Partido Republicano.";
        String dr= "Partido Democrata-Republicano.";
        String fed= "Partido Federalista.";
        String w= "Partido Whig.";
        String eleitoCE="Eleito pelo Colégio Eleitoral.";
        String morte="Morte do antecessor.";
        String renuncia="Renuncia do antecessor.";
       
        //criação de um objeto Presidentes armazenado na variavel "us".
        Presidentes us= new Presidentes(1,"George Washington.","John Adams.",PartidoouViceNulos,1789,1797,"Primeiro presidente.");
        
        //Cria uma lista, armazenada na variavel "a", da classe ArrayList. Onde nela serão armazenados os objetos 
        ArrayList<Presidentes>a= new ArrayList<Presidentes>();
      
        //adiciona o objeto criado no ArrayList .
        a.add(us);
       
        /**
        * A partir daqui o codigo cria um objeto para cada presidente da história
        * do Brasil e addiciona este objeto a lista presidentes
        * A lista acaba no presidente atual.
        */
      
        us= new Presidentes(2,"John Adams.","Thomas Jefferson.",fed,1797,1801,eleitoCE);
        a.add(us);
        us= new Presidentes(3,"Thomas Jefferson.", "Aaron Burr até 1805 e George Cliton até 1809.",dr,1801,1809,eleitoCE);
        a.add(us);
        us= new Presidentes(4,"James Madison.","George Clinton até 1812, Elbridge Gerry até 1814 e nenhum até o fim do mandato.",dr,1809,1817,eleitoCE);
        a.add(us);
        us= new Presidentes(5,"James Monroe.","Daniel D. Tompkins", dr,1817,1825,eleitoCE);
        a.add(us);
        us= new Presidentes(6,"John Quincy Adams.","John C. Calhoun.","Partido Democrata-Republicano até 1825 e Partido Nacional Republicano desde então.", 1825,1829,"Eleitor por negociações no legislativo após resultados inconclusivos no Colégio Eleitoral.");
        a.add(us);
        us= new Presidentes(7,"Andrew Jackson.","John C. Calhoun até 1832 e Martin Van Buren a partir de 1833.",d, 1829,1837, eleitoCE);
        a.add(us);
        us= new Presidentes(8,"Martin Van Buren.", "Richard Mentor Johnson.",d,1837,1841,eleitoCE);
        a.add(us);
        us= new Presidentes(9,"William Henry Harrison.","John Tyler.",w,1841,1841,eleitoCE);
        a.add(us);
        us= new Presidentes(10,"John Tyler.",PartidoouViceNulos,"Partido Whig até 1841 e nenhum a partir de então.",1841,1845,morte);
        a.add(us);
        us= new Presidentes(11,"James K. Polk.","George M. Dallas.",d,1845,1849,eleitoCE);
        a.add(us);
        us= new Presidentes(12,"Zachary Taylor.","Millard Fillmore.",w,1849,1850,eleitoCE);
        a.add(us);
        us= new Presidentes(13,"Millard Fillmore.",PartidoouViceNulos,w,1850,1853,morte);
        a.add(us);
        us= new Presidentes(14,"Franklin Pierce.","William R.King até 1853 e nenhum até o fim da mandato.",d,1853,1857,eleitoCE);
        a.add(us);
        us= new Presidentes(15,"James Buchanan.","John C. Breckinridge.",d,1857,1861,eleitoCE);
        a.add(us);
        us= new Presidentes(16,"Abraham Lincoln.","Hannibal Hamlin até 1865 e Andrew Johnson durante o resto do mandato.","Partido Republicano até 1864 e Partido da União Nacional até o fim do mandato.",1861,1865,eleitoCE);
        a.add(us);
        us= new Presidentes(17,"Andrew Johnson.",PartidoouViceNulos,"Partido da União Nacional até 1868 e Partido Democrata até o fim do Mandato.",1865,1869,morte);
        a.add(us);
        us= new Presidentes(18,"Ulysses S. Grant.","Schuyler Colfax até 1873, Henry Wilson até 1875 e nenhum até o fim do mandato.", r,1869,1877,eleitoCE);
        a.add(us);
        us= new Presidentes(19,"Rutherford B. Hayes.", "William A. Wheeler.",r,1877,1881,eleitoCE);
        a.add(us);
        us= new Presidentes(20,"James A. Garfield.","Chester A. Arthur.",r,1881,1882,eleitoCE);
        a.add(us);
        us= new Presidentes(21,"Chester A. Arthur.",PartidoouViceNulos,r,1882,1885,morte);
        a.add(us);
        us= new Presidentes(22,"Grover Cleveland.","Thomas A. Hendricks até 1885 e nenhum até o fim do mandato.",d,1885,1889,eleitoCE);
        a.add(us);
        us= new Presidentes(23,"Benjamin Harrison.","Levi P. Morton.",r,1889,1893,eleitoCE);
        a.add(us);
        us= new Presidentes(24,"Grover Cleveland.","Adlai Stevenson I.",d,1893,1897,eleitoCE);
        a.add(us);
        us= new Presidentes(25,"William McKinley.","Garret Hobart até 1899 e Theodore Roosevelt a partir de 1900.",r,1897,1901,eleitoCE);
        a.add(us);
        us= new Presidentes(26,"Theodore Roosevelt.","Nenhum até 1905 e Charles W. Fairbanks a partir de então.",r,1901,1909,morte);
        a.add(us);
        us= new Presidentes(27,"William Howard Taft.","James S. Sherman até 1912 e nenhum até o fim do mandato.",r,1909,1913,eleitoCE);
        a.add(us);
        us= new Presidentes(28,"Woodrow Wilson.", "Thomas R. Marshall.",d,1913,1921,eleitoCE);
        a.add(us);
        us= new Presidentes(29,"Warren G. Harding.","Calvin Coolidge.",r,1921,1923,eleitoCE);
        a.add(us);
        us= new Presidentes(30,"Calvin Coolidge.","Nenhum até 1925 e Charles G. Dawes até o fim do mandato.",r,1923,1929,morte);
        a.add(us);
        us= new Presidentes(31,"Herbert Hoover.","Charles Curtis",r,1929,1933,eleitoCE);
        a.add(us);
        us= new Presidentes(32,"Franklin D. Roosevelt","John Nance Garner até 1941, Henry A. Wallace até 1945 e Harry S. Truman até o fim do mandato.",d,1933,1945,eleitoCE);
        a.add(us);
        us= new Presidentes(33,"Harry S. Truman.", "Nenhum até 1949 e Alben W. Barkley a partir de então.",d,1945,1953,morte);
        a.add(us);
        us= new Presidentes(34,"Dwight D. Eisenhower.","Richard Nixon.",r,1953,1961,eleitoCE);
        a.add(us);
        us= new Presidentes(35,"John F. Kennedy.","Lyndon B. Johnson.",d,1961,1963,eleitoCE);
        a.add(us);
        us= new Presidentes(36,"Lyndon B. Johnson.","Nenhum até 1965 e Humbert Humphrey a partie de então.",d,1963,1969,morte);
        a.add(us);
        us= new Presidentes(37,"Richard Nixon.","Spiro Agnew até 1973 e Gerald Ford até o fim do mandato.",r,1969,1974,eleitoCE);
        a.add(us);
        us= new Presidentes(38,"Gerald Ford.","Nenhum até 1974 e Nelson Rockefeller até o fimo do mandato.",r,1974,1977,renuncia);
        a.add(us);
        us= new Presidentes(39,"Jimmy Carter.","Walter Mondale.",d,1977,1981,eleitoCE);
        a.add(us);
        us= new Presidentes(40,"Ronald Reagan.","George H. W. Bush.",r,1981,1989,eleitoCE);
        a.add(us);
        us= new Presidentes(41,"George H. W. Bush.","Dan Quayle.",r,1989,1993,eleitoCE);
        a.add(us);
        us= new Presidentes(42,"Bill Clinton.","Al Gore.",d,1993,2001,eleitoCE);
        a.add(us);
        us= new Presidentes(43,"George W. Bush.","Dick Cheney.",r,2001,2009,eleitoCE);
        a.add(us);
        us= new Presidentes(44,"Barack Obama.","Joe Biden.",d,2009,2017,eleitoCE);
        a.add(us);
        us= new Presidentes(45,"Donald Trump.","Mike Pence.",r,2017,2021,eleitoCE);
        a.add(us);
        us= new Presidentes(46,"Joe Biden.","Kamala Harris.",d,2021,2025,eleitoCE);
        a.add(us);
        //utilização do for para percorrer a lista e imprimi-la
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println("\n *Espera-se que o Joe Biden consiga cumprir o seu governo até 2025.");
    }
}
