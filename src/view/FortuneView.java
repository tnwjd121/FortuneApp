package view;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dto.FortuneDto;

// 콘솔 View를 담당하는 클래스
public class FortuneView {
	
	private Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	
	public String getUpdateStr() {
		System.out.println("--------------수정할 운세를 입력해 주세요.--------------");
		String fortuneStr = scanner.nextLine();
		return fortuneStr;
	}
	
	public int getUpdateIndex() {
		System.out.println("--------------운세를 수정합니다.--------------");
		System.out.println("--------------운세 번호를 입력해 주세요.--------------");
		int index = scanner.nextInt();
		scanner.nextLine();
		return index;
	}
	
	public int getMenu() {
		System.out.println("포춘 쿠키 콘솔 앱입니다.");
		System.out.println("0.종료");
		System.out.println("1. 포춘 쿠키 열기");
		System.out.println("2. 운세 저장");
		System.out.println("3. 운세 전체 출력");
		System.out.println("4. 운세 수정");
		System.out.println("5. 운세 삭제");
		System.out.print("메뉴 선택:");
		int choice = -1;
		choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}
	
	// 모든 운세 출력
	public void getFortunes(List<FortuneDto> fortuneDtos) {
		System.out.println("모든 운세 출력------");
		for(int i=0; i<fortuneDtos.size(); i++) {
			System.out.println(i+" "+fortuneDtos.get(i));
		}
	}
	
	// 하나의 운세 출력 - read
	public void getFortune(List<FortuneDto> fortuneDtos) {
		int randomIndex = random.nextInt(fortuneDtos.size());
		FortuneDto fDto = fortuneDtos.get(randomIndex);
		System.out.println("=========================================");
		System.out.println("=============포춘 쿠키를 열었습니다.===========");
		System.out.println("=========================================");
		System.out.println(fDto.getFortuneStr());
		System.out.println("=========================================");
	}

	// 메뉴에서 운세 저장
	public String putFortune() {
		System.out.println("--------------운세를 저장합니다.--------------");
		System.out.println("--------------운세를 입력해 주세요.--------------");
		String fortuneStr =  scanner.nextLine();
		// 운세를 저장한 포춘 인스턴스 생성 및 배열에 저장 -> 레파지토리 클래스가 담당
		return fortuneStr;
	}

	public int getDeleteIndex() {
		System.out.println("--------------운세를 삭제합니다.--------------");
		System.out.println("--------------삭제 할 운세 번호를 입력해 주세요.--------------");	
		int index = scanner.nextInt();
		scanner.nextLine();
		return index;
	}



}
