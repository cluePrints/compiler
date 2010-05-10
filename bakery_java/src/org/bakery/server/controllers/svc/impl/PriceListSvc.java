package org.bakery.server.controllers.svc.impl;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bakery.server.controllers.svc.ISvcController;
import org.bakery.server.controllers.svc.SvcController;
import org.bakery.server.controllers.svc.beans.AbstractFormMode;
import org.bakery.server.controllers.svc.helper.SvcHelper;
import org.bakery.server.domain.pricing.PriceList;

public class PriceListSvc extends AbstractAdminCommand {

	@Override
	public void init(SvcController controller) throws Exception {
		setMainDAO(controller.getDAOFacade().getPriceListDAO());
		setCommand(new PriceList());
	}
	@Override
	protected void executeInternal(HttpServletRequest request,
			HttpServletResponse response, ISvcController controller,
			AbstractFormMode mode) throws Exception {
		PrintWriter out = response.getWriter();
		SvcHelper.write(out, controller.getDAOFacade().getAddressDAO(), "addresses");
		SvcHelper.write(out, controller.getDAOFacade().getContragentDAO(), "contragents");
		SvcHelper.write(out, controller.getDAOFacade().getPriceListItemDAO(), "priceListItems");
		SvcHelper.write(out, controller.getDAOFacade().getProductTypeDAO(), "productTypes");
		SvcHelper.write(out, controller.getDAOFacade().getUnitDAO(), "units");
	}
}