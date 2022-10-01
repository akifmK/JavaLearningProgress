package regtiretionSystemDemo.core.concretes;

import regtiretionSystemDemo.core.abstracts.EmailService;
import regtiretionSystemDemo.otherEmailServices.GoogleMail;

public class GoogleMailAdapter implements EmailService {

	GoogleMail googleMail = new GoogleMail();
	
	@Override
	public String Mail() {
		
		return googleMail.geteMail();
	}

	@Override
	public String Name() {
		
		return googleMail.getName();
	}

	
}
