import java.util.Date;


import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


import br.com.trks.dao.ArtigoDao;
import br.com.trks.dao.InscricaoDao;
import br.com.trks.dao.InscricaoEfetuadaDao;
import br.com.trks.dao.ParticipanteDao;
import br.com.trks.entidades.Artigo;
import br.com.trks.entidades.Contato;
import br.com.trks.entidades.Endereco;
import br.com.trks.entidades.Inscricao;
import br.com.trks.entidades.InscricaoEfetuada;
import br.com.trks.entidades.Participante;


@RunWith(Arquillian.class)
public class JpaTest {

	@Inject
	ArtigoDao artigoDao;
	
	@Inject
	InscricaoDao inscricaoDao;
	
	@Inject
	InscricaoEfetuadaDao efetuadaDao;
	
	@Inject
	ParticipanteDao participanteDao;
	

	@Deployment
	public static JavaArchive criarArquivoTeste() {
		return ShrinkWrap.create(JavaArchive.class)
				.addPackage(ParticipanteDao.class.getPackage())
				.addPackage(Participante.class.getPackage())
				.addAsResource("META-INF/persistence.xml");
	}

	@Test
	@InSequence(1)
	@Ignore
	public void testeSalvarParticipante() {
		Participante p1 = new Participante();
		p1.setEmail("carlos@gmail.com");
		p1.setNome_cracha("carlos");
		p1.setInstituicao("IFPB");
		p1.setCpf("09330393492");
		p1.setTipo_usuario("aluno");
		p1.setProfissao("estudante");
		p1.setContato(new Contato("993339933","",""));
		p1.setEndereco(new Endereco("PB","cajazeiras","jardim oasis", "rua do meio","10","58900000"));
		participanteDao.salvar(p1);

	}
	
	@Test
	@InSequence(2)
	@Ignore
	public void salvarArtigo() {
		Artigo a1 = new Artigo();
		a1.setTitulo("a maneira ideal de jogar futebol");
		a1.setOrientador("josé carlos");
		a1.setCoautores("");
		a1.setModalidade("esporte");
		a1.setData_submissao("08/02/2020");
		a1.setUrl_download("");
		artigoDao.salvar(a1);
	}
			
	
	@Test
	@InSequence(3)
	@Ignore
	public void salvarInscricao() {
		Inscricao inscricao = new Inscricao();
		inscricao.setData_inscricao(new Date());
		inscricao.setPreco(10.0);
		inscricao.setTipo_evento("esportivo");
		inscricao.setTipodeparticipacao("palestrante");
		inscricaoDao.salvar(inscricao);
		
		InscricaoEfetuada efetuada = new InscricaoEfetuada();
		efetuada.setQuantidade(efetuada.getQuantidade()+1);
		efetuada.setStatus("concluida");
		efetuada.setTransacao("73844");
		efetuada.setValor(inscricao.getPreco());
		efetuada.setFormaPagamento("a vista");
		efetuadaDao.salvar(efetuada);
		
		inscricao.setId_transacao(efetuada.getTransacao());
		inscricaoDao.atualizar(inscricao);
	}
	
	
}
