package de.fliegersoftware.amazon.payment.addon.forms;

public class AmazonAjaxResponse {

	private String showMessage;
	private String redirect;

	public String getShowMessage() {
		return showMessage;
	}

	public void setShowMessage(String showMessage) {
		this.showMessage = showMessage;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
}