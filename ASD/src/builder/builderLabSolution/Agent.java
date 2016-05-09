package builder.builderLabSolution;

import builder.builderLabSolution.model.Call;
import builder.builderLabSolution.model.CallerPhoneNumber;
import builder.builderLabSolution.model.Customer;

public class Agent implements RequestBuilder {
	Request request;

	public Agent() {
		request = new Request();
	}

	@Override
	public String getCallerPhn() {
		return CallerPhoneNumber.PHONE.phoneNumber();
	}

	@Override
	public void retrieveCustomer() {
		
		String phn = getCallerPhn();
		Customer customer= Database.DATABASE.getCustomer(phn);
		if(customer==null){
			createCustomer(phn);
		}else{
			request.setRequester(customer);
			System.out.println(customer);
		}
	}

	@Override
	public void createCustomer(String phone) {
		Customer customer = new Customer("name", "dob", "email");
		request.setRequester(customer);
			Database.DATABASE.SaveCustomer(phone, customer);
	}

	@Override
	public void getRequestContent() {
		request.setReqContent("");
	}

	@Override
	public void responseContent() {
		request.setRespContent("");
	}

	@Override
	public void isanswered() {
		if (request.getRespContent() == null) {
			request.setAnswered(false);

		} else {
			request.setAnswered(true);
		}
	}

	@Override
	public void needCallBack() {
		if (request.getReqContent() == null) {
			request.setNeedCallBack(false);
		} else {
			request.setNeedCallBack(true);
		}
	}

	@Override
	public void saveRequest() {
		System.out.println("Saving Request"+request);
	}

	@Override
	public Request getRequest() {

		return request;
	}

	@Override
	public void availRequestIDANDAgent() {
		Agent agent = new Agent();
		Call call = new Call();
		call.callPop(agent);
		String reqID = new Call().getRequestId();

		request.setReqId(reqID);
		request.setAgent(agent);
		
	}

}
