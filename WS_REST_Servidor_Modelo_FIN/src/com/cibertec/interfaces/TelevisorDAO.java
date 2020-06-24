package com.cibertec.interfaces;

import java.util.List;

import com.cibertec.entidad.Televisor;

public interface TelevisorDAO {
	public int saveTelevisor(Televisor bean);
	public List<Televisor> listAllTelevisoresXStock(int s1,int s2);
}
