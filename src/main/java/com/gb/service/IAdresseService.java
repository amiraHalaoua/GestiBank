package com.gb.service;

import com.gb.model.Adresse;

public interface IAdresseService {
	public void updateAdresse(Adresse a);
	public Adresse findAdresseById(Integer idAdresse);
}
