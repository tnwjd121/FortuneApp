package service;

import java.util.ArrayList;
import java.util.List;

import dto.FortuneDto;

// 메모리에 운세들을 저장
public class FortuneRepository implements FortuneService {
	
	private List<FortuneDto> fortuneDtos = new ArrayList<>();
	
	@Override
	public void updateFortune(int index, String fortuneStr) {
		FortuneDto fDto = new FortuneDto();
		fDto.setFortuneStr(fortuneStr);
		fortuneDtos.set(index, fDto); 
		
	}
	
	@Override
	public List<FortuneDto> getFortuneDtos() {
		return fortuneDtos;
	}

	@Override
	public void createFortune(String fortuneStr) {
		// 운세 한개 생성 -FortuneDto 인스턴스 한개 생성
		FortuneDto fDto = new FortuneDto();
		// 인스턴스 변수에 데이터 대입
		fDto.setFortuneStr(fortuneStr);
		// 배열(arrayList)에 저장
		fortuneDtos.add(fDto);
	}

	@Override
	public void deleteFortune(int index) {
		// 인덱스 값으로 삭제하기
		fortuneDtos.remove(index);
		
	}


}
