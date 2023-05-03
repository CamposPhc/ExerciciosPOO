package POO;

public class TesteCliente {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("Pedro", "Av. Santa ines, 1129", "11913185795", "49520789101");
		PessoaFisica pf2 = new PessoaFisica("Monica", "Av. Casa verde, 2233", "11957951318", "20647849305");
		PessoaFisica pf3 = new PessoaFisica("Tiago", "rua soldado bentinho, 22", "1195957345", "45966780906");
		PessoaFisica pf4 = new PessoaFisica("Lucio", "rua dos figueiras", "1166557788", "55599966605");
		
		pf1.visualizar();
		pf2.visualizar();
		pf3.visualizar();
		pf4.visualizar();
		      
		
		PessoaJuridica pj1 = new PessoaJuridica("Leadro", "Av. Eng caetano alvares, 6704", "1192594862", "903425105001-80");
		PessoaJuridica pj2 = new PessoaJuridica("João", "av. Tucuruvi, 1122", "11991803145", "8059986440001-50");
		PessoaJuridica pj3 = new PessoaJuridica("Leticia", "rua Pedrolandia, 777", "11991295275", "506952182001-20");
		PessoaJuridica pj4 = new PessoaJuridica("Joaquina", "Av. Leoncio de magalhaes", "13998741254", "605888988001-10");
		
		pj1.visualizar();
		pj2.visualizar();
		pj3.visualizar();
		pj4.visualizar();
     }

}