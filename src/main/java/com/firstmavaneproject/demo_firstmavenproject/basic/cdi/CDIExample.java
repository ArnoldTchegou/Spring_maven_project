package com.firstmavaneproject.demo_firstmavenproject.basic.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIExample {
	@Inject
	private CdiDao cdidao;

	public CdiDao getCdidao() {
		return cdidao;
	}

	public void setCdidao(CdiDao cdidao) {
		this.cdidao = cdidao;
	}

}
