package com.gk.service;

import com.gk.model.Adresse;

public interface IAdresseService {
	public void updateAdresse(Adresse a);
	public Adresse findAdresseById(Integer idAdresse);
}
