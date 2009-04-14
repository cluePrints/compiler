package org.bakery.server.controllers.svc.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bakery.server.controllers.beans.AbstractFormMode;
import org.bakery.server.controllers.svc.SvcController;
import org.bakery.server.domain.accounting.Address;

public class AddressSvc extends AbstractCommand {


	@Override
	public void init(SvcController controller) {
		setMainDAO(controller.getAddressDAO());
		setCommand(new Address());
	}

	protected void executeInternal(HttpServletRequest request,
			HttpServletResponse response, SvcController controller, AbstractFormMode mode) throws Exception {				
	}
}
