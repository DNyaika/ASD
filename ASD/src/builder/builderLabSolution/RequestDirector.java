package builder.builderLabSolution;


public class RequestDirector {
	private RequestBuilder requestBuilder = null; 

	public RequestDirector(RequestBuilder requestBuilder) {
		this.requestBuilder = requestBuilder;
	}

	public void constructRequest() {
		requestBuilder.availRequestIDANDAgent();
		requestBuilder.retrieveCustomer();
		requestBuilder.getRequestContent();
		requestBuilder.responseContent();
		requestBuilder.isanswered();
		requestBuilder.needCallBack();
		requestBuilder.saveRequest();
		
	}

	public Request getRequest() {
		return requestBuilder.getRequest();
	}
}
