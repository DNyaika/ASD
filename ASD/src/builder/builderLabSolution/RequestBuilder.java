package builder.builderLabSolution;

public interface RequestBuilder {
	public void availRequestIDANDAgent();

	public String getCallerPhn();

	public void retrieveCustomer();

	public void createCustomer(String phone);

	public void getRequestContent();

	public void responseContent();

	public void isanswered();

	public void needCallBack();

	public void saveRequest();

	public Request getRequest();
}
