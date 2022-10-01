package regtiretionSystemDemo.core.concretes;

import regtiretionSystemDemo.core.abstracts.EmailService;
import regtiretionSystemDemo.otherEmailServices.YandexMail;

public class YandexMailAdapter implements EmailService{

	YandexMail yandexMail = new YandexMail();
	
	@Override
	public String Mail() {
		
		return yandexMail.geteMail();
	}

	@Override
	public String Name() {
		
		return yandexMail.getName();
	}

}
