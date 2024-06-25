package week3.day1overloadingassignment;

public class APIClient {
	public void sendRequest(String endpoint) {
		//End Pint means a specific location within an API that accepts requests and sends back responses.
		System.out.println("End Point      : " + endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("End Point      : " + endpoint);
		System.out.println("Request Body   : " + requestBody);
		System.out.println("Request Status : " + requestStatus);
		}	

	public static void main(String[] args) {
		APIClient API=new APIClient();
		API.sendRequest("Updated Sender and receiver request data in endpoint");
		//request body is data sent by the client to your API
		API.sendRequest("Successfully updated endpoint data", "Data sent successfully by the client to API", true);
	}

}
