package dto;

// 운세 한문장의 데이터를 저장하는 클래스
public class FortuneDto {
	
	private String fortuneStr;

	public String getFortuneStr() {
		return fortuneStr;
	}

	public void setFortuneStr(String fortuneStr) {
		this.fortuneStr = fortuneStr;
	}

	@Override
	public String toString() {
		return "FortuneDto [fortuneStr=" + fortuneStr + "]";
	}

}
