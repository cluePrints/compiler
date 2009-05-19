package org.bakery.server.controllers.svc.impl.log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bakery.server.controllers.svc.ControllerAwareCommand;
import org.bakery.server.controllers.svc.ISvcController;
import org.bakery.server.persistence.AbstractDAO;

public class SpamReportSvc implements ControllerAwareCommand{
	public static final String DELIM="\n========================================================";
	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response, ISvcController controller)
			throws Exception {
		StringBuilder b = new StringBuilder();
		b.append(DELIM);
		b.append(DELIM);
		b.append("\n			������� ����� � ������� ��������� �������:");
		b.append(DELIM);
		b.append(DELIM);
		int nCTotal = controller.getDAOFacade().getContragentDAO().searchByName("%", 0, 100).size();
		int nCAvailable = controller.getDAOFacade().getContragentDAO().getAvailable().size();
		b.append("\n\n"+DELIM);
		b.append(DELIM);
		b.append("1. �����������");
		b.append(DELIM);
		b.append("\n����� ���������������� ������������:			"+nCTotal);
		b.append("\n-��������� � ������� ����������:				"+nCAvailable);		
		
		b.append("\n"+DELIM);
		b.append("2. ");
		b.append(DELIM);
		b.append("\n");
		b.append("\n����� ���������������� ����������:		"+controller.getDAOFacade().getDeviceParameterDAO().searchByName("%", 0, 200).size());
		b.append("\n-������� ���������������:				"+controller.getDAOFacade().getDeviceParameterDAO().getAvailable().size());

		b.append("\n"+DELIM);
		b.append("3. ���������� ��������");
		b.append(DELIM);
		b.append("\n");
		int nMeasuresTotal = controller.getDAOFacade().getMeasureDAO().searchByName("%", 0, 400).size();
		int nMeasuresDeclined = controller.getDAOFacade().getDeviceParameterDAO().getAvailable().size();
		b.append("\n����� ���������:					"+nMeasuresTotal);
		b.append("\n-��������� ��� ����������������:	"+nMeasuresDeclined);
	}
	private void write(StringBuilder b, String topLabel, AbstractDAO dao){
	}
}