package regtiretionSystemDemo.core.concretes;

import regtiretionSystemDemo.core.abstracts.BaseCheckService;
import regtiretionSystemDemo.entitites.concretes.User;

public class AlwaysTrueCheckManager  implements BaseCheckService{

	@Override
	public boolean isUsable(User user) {
		return true;
	}

}
