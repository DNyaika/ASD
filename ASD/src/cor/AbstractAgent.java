package cor;

import cor.domain.CallRecord;

public abstract class AbstractAgent {

	protected AbstractAgent nextAgent;

	abstract public void handleRequest(CallRecord cr);

	<T> boolean canHandleRequest(CallRecord cr) {
		return false;
	}

}
