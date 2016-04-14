package org.sid.service;

import org.sid.dao.catalogueDAOimpl;

public class Singletonservice {
	private static CatalogueServiceImpl service;
	static {
		catalogueDAOimpl dao = new catalogueDAOimpl();
		dao.init();
		service = new CatalogueServiceImpl();
		service.setDao(dao);

	}

	public static CatalogueServiceImpl getservice() {

		return service;

	}

}
