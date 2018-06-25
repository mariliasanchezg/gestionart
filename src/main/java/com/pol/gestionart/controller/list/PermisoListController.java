package com.pol.gestionart.controller.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pol.gestionart.dao.Dao;
import com.pol.gestionart.dao.PermisoDao;
import com.pol.gestionart.security.Permiso;

@Controller
@Scope("session")
@RequestMapping("permiso")

public class PermisoListController extends ListController<Permiso>{

	@Autowired
	PermisoDao permisoDao;
	
	@Override
	public String[] getColumnas() {
		
		return new String[] { "id", "codigo", "descripcion" };
	}

	@Override
	public Dao<Permiso> getDao() {
		
		return permisoDao;
	}

}