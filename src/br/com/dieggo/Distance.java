package br.com.dieggo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.dieggo.entidades.Coordenadas;
import br.com.dieggo.utils.DistanceCalc;

public class Distance {
	
	public static void main(String[] args) {
		Long distancia = 1l;
		Long radius = 6371l;
		Double lat = -30.03084728765900000;
		Double lon = -51.22691719892700000;
		Double resultDistance;
		
		List<Coordenadas> result = new ArrayList<Coordenadas>();
		Coordenadas coo;
		
		coo = new Coordenadas(-30.03079028765900000,-51.22763219892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03076528765900000,-51.22776819892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03155828765900000,-51.22779919892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03251628765900000,-51.22787619892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03363528765900000,-51.22795119892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03495228765900000,-51.22804319892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03606028765900000,-51.22810519892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03700128765900000,-51.22816119892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03782928765900000,-51.22826819892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03871028765900000,-51.22839119892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03978328765900000,-51.22854119892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03997828765900000,-51.22856019892700000);
		result.add(coo);
		coo = new Coordenadas(-30.04005428765900000,-51.22875119892700000);
		result.add(coo);
		coo = new Coordenadas(-30.04010028765900000,-51.22898919892700000);
		result.add(coo);
		coo = new Coordenadas(-30.04006728765900000,-51.22926219892700000);
		result.add(coo);
		coo = new Coordenadas(-30.04003028765900000,-51.22935119892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03998628765900000,-51.22941019892700000);
		result.add(coo);
		coo = new Coordenadas(-30.03914428765900000,-51.23019819892700000);
		result.add(coo);
		
		System.out.println("Antes");
		for (Coordenadas coordenadasAntes : result) {
			System.out.println(coordenadasAntes);
		}
		
		Iterator<Coordenadas> iter = result.iterator();
		while(iter.hasNext()) {
			Coordenadas coordenadas = iter.next();
			resultDistance = DistanceCalc.distance(lat, lon,coordenadas.getLatitude(), coordenadas.getLongitude() );
		    if (resultDistance > distancia) {
		        iter.remove();
		    }
		}
		
		System.out.println("Depois");

		for (Coordenadas coordenadasDois : result) {
			System.out.println(coordenadasDois);
		}
		 
		
	}
	 

 
}
