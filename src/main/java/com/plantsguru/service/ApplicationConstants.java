package com.plantsguru.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationConstants {

	public static Map<Integer, List<String>> PLANT_NAME_MODEL_MAP = new HashMap<>();
	
	public static void loadDataOnStartup(){
		PLANT_NAME_MODEL_MAP.put(279, Arrays.asList("pg-green-plants-ficus-black-plant", "Ficus Black Plant - Ficus Benjamina, Weeping Fig"));
		PLANT_NAME_MODEL_MAP.put(379, Arrays.asList("pg-avenue-tree-peltophorum", "Peltophorum (Peela Gulmohar) Plant"));
		PLANT_NAME_MODEL_MAP.put(395, Arrays.asList("pg-avenue-tree-delonix-regia", "Delonix Regia - Gulmohar Plant"));
		PLANT_NAME_MODEL_MAP.put(419, Arrays.asList("pg-avenue-tree-neem", "Neem - Azadirachta Indica Plant"));
		PLANT_NAME_MODEL_MAP.put(421, Arrays.asList("pg-green-plants-ram-tulsi", "Ram Tulsi - Rama Tulasi, Holy Basil Plant"));
		PLANT_NAME_MODEL_MAP.put(422, Arrays.asList("pg-green-plants-krishna-tulsi", "Krishna Tulsi Plant - Shyama Tulasi, Holy Basil"));
		PLANT_NAME_MODEL_MAP.put(435, Arrays.asList("pg-medicinal-plants-aloe-vera", "Aloe Vera Plant"));
		PLANT_NAME_MODEL_MAP.put(447, Arrays.asList("pg-medicinal-plants-lemon-grass", "Lemon Grass Plant"));
		PLANT_NAME_MODEL_MAP.put(984, Arrays.asList("pg-cactus-and-succulents-jade-plant", "Jade (good luck) plant"));
		PLANT_NAME_MODEL_MAP.put(2075, Arrays.asList("pg-avenue-tree-peepal-tree", "Peepal Tree - Ficus Religiosa, Sacred Fig Plant"));
	}
}