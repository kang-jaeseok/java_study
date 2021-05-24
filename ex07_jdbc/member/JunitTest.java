package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {
	MemberDAO mdao = new MemberDAO();
	@Test
	void testSelectList() {
		
		List<MemberDTO> mlist = mdao.selectList();
		
		assertNotEquals(0, mlist.size());
	}
	@Test
	void testSelectOne() {
		String userid = "aaaa";
		MemberDTO mdto = mdao.selectOne(userid);
		//System.out.println(mdto);
		assertNotNull(mdto);
	}

	@Test
	void testInsert() {
		
		String userid = "java";
		String passwd = "1111";
		int birthyear = 2006;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.insert(mdto);
		//assertNotEquals(0, cnt);
		assertEquals(1,cnt);

	}

	@Test
	void testUpdate() {
		String userid = "java";
		String passwd = "1111";
		int birthyear = 2006;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.update(mdto);
		assertEquals(1,cnt);
	}

	@Test
	void testDelete() {
		String userid = "park";
		int cnt = mdao.delete(userid);
		assertEquals(1,cnt);
	}



}
