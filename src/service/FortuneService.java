package service;

import java.util.List;

import dto.FortuneDto;

//Model - 프로그램 데이터와 연관있는 클래스들
public interface FortuneService {
	
	// 운세들이 저장된 배열을 가져 오는 메소드
	List<FortuneDto> getFortuneDtos();
	
	// Create(생성) - 운세를 생성하는 메소드
	void createFortune(String fortuneStr);

	// UPDATE(수정)
	void updateFortune(int index, String fortuneStr);

	//  DELETE(삭제)
	void deleteFortune(int index);
	

}
