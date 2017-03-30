package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Barbarian extends Character {
	final Logger logger = LoggerFactory.getLogger(Barbarian.class);
	
	/**
	* Constructor of Barbarian thar receives as argument a WeaponBehaviour.
	*
	* @param w Weapon with which the Barbarian will fight
	*/
	public Barbarian(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		logger.info("Estudiante A -linea 1 extra para conflicto.");
		logger.info("You are a strong, hulky barbarian!!!.");
		logger.info("Modificacion realizada desde Github simulando cambios hechos por el estudiante A.");
		logger.info("Estudiante A -linea 2 extra para conflicto.");
	}
}
