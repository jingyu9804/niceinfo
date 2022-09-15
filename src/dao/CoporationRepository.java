package dao;

import java.util.ArrayList;
import dto.Coporation;

public class CoporationRepository {
	private ArrayList<Coporation> listOfCop = new ArrayList<Coporation>();
	private static CoporationRepository instance = new CoporationRepository();
	
	public static CoporationRepository getInstance() {
		return instance;
	}
	
	public CoporationRepository() {
		Coporation ahnLab=new Coporation("214-81","AhnLab");
		ahnLab.setRepresentative("������");
		ahnLab.setOfficeAddress("��� ������ �д籸 �Ǳ����� 220");
		ahnLab.setFormOfBusiness("�߰߱��");
		ahnLab.setIndustry("�ý��� ����Ʈ���� ���� �� ���޾�");
		ahnLab.setFoundationDate(19950318);
		ahnLab.setCertification("CISA,CISSP,�������ȱ��");
		ahnLab.setFileName("AhnLab.png");
		ahnLab.setSales("156,550,808��");
		ahnLab.setLocation("ahnLabLoc.png");
		ahnLab.setAvgIncome("7000õ����");
		ahnLab.setComparison("noData.png");
		ahnLab.setEmployee("1187��");
		
		Coporation cisco=new Coporation("ForeignCorporation","CiscoSystems");
		cisco.setRepresentative("Chuck Robbins");
		cisco.setOfficeAddress("San Jose, California");
		cisco.setFormOfBusiness("major company");
		cisco.setIndustry("manufactures and sells networking hardware, software, telecommunications equipment and other high-technology services and products");
		cisco.setFoundationDate(19841210);
		cisco.setCertification("CCNA,CCNP,CCIE");
		cisco.setFileName("Cisco.png");
		cisco.setSales("51.9 billion USD");
		cisco.setLocation("noData.png");
		cisco.setAvgIncome("1��3219����");
		cisco.setComparison("noData.png");
		cisco.setEmployee("71,883��");
		
		Coporation kakao=new Coporation("120-81","KaKao");
		kakao.setRepresentative("���μ�/������");
		kakao.setOfficeAddress("���� ���ֽ� ÷�ܷ� 242");
		kakao.setFormOfBusiness("����");
		kakao.setIndustry("���� �� ��Ÿ ���ͳ� �����Ű� ���񽺾�");
		kakao.setFoundationDate(19950216);
		kakao.setCertification("����");
		kakao.setFileName("KaKao.png");
		kakao.setSales("1,173,924,652��");
		kakao.setLocation("kakaoLoc.png");
		kakao.setAvgIncome("1��");
		kakao.setComparison("kakaoCom.png");
		kakao.setEmployee("2701��");
		
		listOfCop.add(ahnLab);
		listOfCop.add(cisco);
		listOfCop.add(kakao);
		
		
	}
	public ArrayList<Coporation> getAllCops(){
		return listOfCop;
	}
	
	public Coporation getCopById(String copId) {
		
		Coporation copById=null;
		
		for(int i=0;i<listOfCop.size();i++) {
			Coporation cop=listOfCop.get(i);
			if(cop != null && cop.getCopId() != null && cop.getCopId().equals(copId)) {
				copById=cop;
				break;
			}
		}
		
		return copById;
	}
	public void addCorporation(Coporation corporation) {
		listOfCop.add(corporation);
	}
}
