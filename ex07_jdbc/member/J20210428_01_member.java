package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;

public class J20210428_01_member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO mdao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		boolean logincheck = false;
		String loginid = "";
		while (true) {
			
			System.out.println("-----------------------------------------");
			System.out.print(logincheck ?  "Longin ID ["+ loginid + "]\n": ""); 
			
			
			System.out.println("0. 로그인");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 수정");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 한명 조회");
			System.out.println("5. 회원 전체 조회");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("-----------------------------------------");
			System.out.print("입력: ");
			int no = sc.nextInt();
			System.out.println("-----------------------------------------");
			// 추가
			if (no == 1) {
				String userid;
				System.out.println("[추가 항목 입력]");
				while (true) {
					System.out.print("UserId: ");
					userid = sc.next();
					
					// 아이디 중복 체크
					MemberDTO mdto = mdao.selectOne(userid);
					

					if (mdto != null) {
						System.out.println("중복된 id입니다.");
					} else {
						break;
					}
					
//					System.out.println(userid + "" + mdto.getUserid());
//					if(userid.equals(mdto.getUserid())) {
//						System.out.println("중복된 id입니다.");
//					}else {
//						break;
//					}
				}

				System.out.print("PassWd: ");
				String passwd = sc.next();
				sc.nextLine();
				System.out.print("BirthYear: ");
				int birthyear = 0;
				
				String birthyearStr = sc.nextLine();
				if (!birthyearStr.equals(""))
					birthyear = Integer.parseInt(birthyearStr);
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				int cnt = mdao.insert(mdto);
				if (cnt > 0)
					System.out.println("회원가입 성공");
				else
					System.out.println("회원가입 실패");
				// 수정
			} else if (no == 2) {
				//로그인된 아이디 정보만 수정가능
				//기존 정보 조회후 수정정보와 같이 전달
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				
					
				//System.out.print("UserId: ");
				//String userid = sc.next();
				String userid = loginid;
				System.out.println("[로그인 id의  정보]");
				MemberDTO beforemdto = mdao.selectOne(userid);
				System.out.printf("%s\t%s\t%d\t%s\n", beforemdto.getUserid(), beforemdto.getPasswd(), beforemdto.getBirthyear(), beforemdto.getRegdate());
				System.out.println("-----------------------------------------");
				System.out.println("[수정 항목 입력]");
				
				//공백일 경우 정보 수정 X
				sc.nextLine(); //버퍼 비우기
				
				//빈칸 처리
				System.out.print("PassWd: ");
				String passwd;
				String tempPasswd = sc.nextLine();
				//빈칸이면 이전값 받아옴
				if(tempPasswd.equals("")) passwd = beforemdto.getPasswd();
				else passwd = tempPasswd;
				
				//빈칸 처리를 위해 String으로 입력받음
				System.out.print("BirthYear: ");
				int birthyear;
				String tempBirthyear = sc.nextLine();
				
				//빈칸이면 이전값 받아옴
				if(tempBirthyear.equals(""))	birthyear = beforemdto.getBirthyear();
				else birthyear = Integer.parseInt(tempBirthyear);
				
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				
				int cnt = 0;
				//둘다 빈칸일때 수정하지 마라
				if( (tempPasswd.equals("")) && (tempBirthyear.equals("")) ) cnt  = 0;
				else cnt = mdao.update(mdto);
				
				if (cnt > 0) {
					System.out.println("회원수정 성공");
					
					//기존정보와 이전정보 출력
					System.out.println("-----------------------------------------");
					System.out.println("[수정이전 정보]");
					System.out.printf("%s\t%s\t%d\t%s\n", beforemdto.getUserid(), beforemdto.getPasswd(), beforemdto.getBirthyear(), beforemdto.getRegdate());
					System.out.println("-----------------------------------------");
					System.out.println("[수정이후  정보]");
					MemberDTO aftermdto = mdao.selectOne(userid);
					System.out.printf("%s\t%s\t%d\t%s\n", aftermdto.getUserid(), aftermdto.getPasswd(), aftermdto.getBirthyear(), aftermdto.getRegdate());
				}
				else {
					System.out.println("[수정할 정보가 없습니다.]");
					System.out.printf("%s\t%s\t%d\t%s\n", beforemdto.getUserid(), beforemdto.getPasswd(), beforemdto.getBirthyear(), beforemdto.getRegdate());
				}
				// 삭제
			} else if (no == 3) {
				//로그인된 아이디 정보만 삭제가능
				//
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				
				System.out.println("[삭제 항목 입력]");
				System.out.print("UserId: ");
				String userid = sc.next();
				if(!userid.equals(loginid)) {
					System.out.println("[삭제 권한 없음]");
					continue;
				}
				int cnt = mdao.delete(userid);
				if (cnt > 0) {
					System.out.println("회원탈퇴 성공");
					logincheck = false;
				}
				else
					System.out.println("회원삭제 실패");
			}
			// 한명 조회
			else if (no == 4) {
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.println("[검색 항목 입력]");
				System.out.print("UserId: ");
				String userid = sc.next();
				
				MemberDTO mdto = mdao.selectOne(userid);
				if (mdto.getUserid() == null)
					System.out.println("검색 실패");
				else
				{
					System.out.printf("%s\t%s\t%d\t%s\n", mdto.getUserid(), mdto.getPasswd(), mdto.getBirthyear(),
							mdto.getRegdate());
					
				}
				// 전체조회
			} else if (no == 5) {
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				List<MemberDTO> mlist = mdao.selectList();
				for (MemberDTO mdto : mlist)
					System.out.printf("%s\t%s\t%d\t%s\n", mdto.getUserid(), mdto.getPasswd(), mdto.getBirthyear(),
							mdto.getRegdate());
			}else if(no == 0) {
				//userid passwd 입력 받기
				//id가 존재하지 않습니다.
				//비밀번호 불일치
				System.out.println("[Login]");
				System.out.print("UserId: ");
				String userid = sc.next();
				MemberDTO mdto = mdao.selectOne(userid);
				if(mdto == null) {
					System.out.println("id가 존재하지 않습니다.");
					logincheck = false;
				}
				else {
					System.out.print("passwd: ");
					String passwd = sc.next();
					if(passwd.equals(mdto.getPasswd())) {
						System.out.println("Login 성공");
						loginid = userid;
						logincheck = true;
					}
					else {
						System.out.println("비밀번호 불일치");
						logincheck = false;
					}
				}
			}else if (no == 9) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}

}
