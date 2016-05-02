package cor;

import java.util.ArrayList;
import java.util.List;

import cor.domain.CallRecord;

public class Validator extends AbstractAgent {

	@Override
	public void handleRequest(CallRecord req) {
		DataWasher dataWasher = new DataWasher();
		if (req instanceof CallRecord) {
			if (req.getCustomer().getAddress() != null && !req.getCustomer().getPhone().equals("")
					&& !req.getCustomer().getEmail().equals("")) {
				req.setValid(true);
					dataWasher.handleRequest(req);				
			}
		}
	}

}
