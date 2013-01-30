package pk.edu.pucit.ead.demo.struts.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import pk.edu.pucit.ead.demo.struts.model.EmployeeSearchService;
import pk.edu.pucit.ead.demo.struts.view.SearchForm;

public class SearchAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		// TODO Auto-generated method stub
		EmployeeSearchService service = new EmployeeSearchService();
		ArrayList<?> results;

		SearchForm searchForm = (SearchForm) form;

		// Perform employee search based on what criteria was entered.
		String name = searchForm.getName();
		if (name != null && name.trim().length() > 0) {
			results = service.searchByName(name);
		} else {
			results = service.searchBySsNum(searchForm.getSsNum().trim());
		}

		// Place search results in SearchForm for access by JSP.
		searchForm.setResults(results);

		// Forward control to this Action's input page.
		return mapping.getInputForward();
	}
}
