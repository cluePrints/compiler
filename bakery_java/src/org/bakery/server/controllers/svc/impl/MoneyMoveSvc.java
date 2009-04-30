package org.bakery.server.controllers.svc.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bakery.server.controllers.svc.SvcController;
import org.bakery.server.controllers.svc.beans.AbstractFormMode;
import org.bakery.server.controllers.svc.helper.SvcHelper;
import org.bakery.server.domain.log.ProductMove;

public class MoneyMoveSvc extends AbstractCommand {


	@Override
	public void init(SvcController controller) {
		setMainDAO(controller.getDAOFacade().getProductMoveDAO());
		setCommand(new ProductMove());
	}

	protected void executeInternal(HttpServletRequest request,
			HttpServletResponse response, SvcController controller, AbstractFormMode mode) throws Exception {
		SvcHelper.write(response.getWriter(), controller.getDAOFacade().getOrderDAO(), "orders");
		SvcHelper.write(response.getWriter(), controller.getDAOFacade().getAccountDAO(), "accounts");
		SvcHelper.write(response.getWriter(), controller.getDAOFacade().getPriceListItemDAO(), "priceListItems");
	}
}
