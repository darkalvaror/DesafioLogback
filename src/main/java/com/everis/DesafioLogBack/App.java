package com.everis.DesafioLogBack;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Desafio 1 de LogBack
 * 
 * @author arivarin
 *
 */
public class App {

	/** LOGGER */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * 
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int suma = 2 + 2;
		LOGGER.info("Inicio del método");
		
		for (int i = 0; i < 5000; i++) {
			LOGGER.debug("Iteración nº: {}", i);
		}
		
		LOGGER.warn("Este es un mensaje de aviso que se mostrará en el root");
		
		LOGGER.info("Fin del método");
		
		LOGGER.trace("Este mensaje se mostrará en el root " + suma);
	}
}
