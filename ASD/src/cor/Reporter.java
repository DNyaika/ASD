package cor;

import cor.domain.CallRecord;

public class Reporter extends AbstractAgent {

	@Override
	public  void handleRequest(CallRecord req) {
		if(req.isASalesLead()){
			System.out.println(req);
		}
	}

}
