package cor;

import java.util.ArrayList;
import java.util.List;

import cor.domain.CallRecord;

public class DataWasher extends AbstractAgent {
	Reporter reporter = new Reporter();

	@Override
	public void handleRequest(CallRecord req) {
		req.setASalesLead(true);
		reporter.handleRequest(req);
	}

}
