package net.rvanasa.schoology.adapters;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class BooleanAdapter implements JsonDeserializer<Boolean>
{

	@Override
	public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) 
			throws JsonParseException {
		
		String value = json.getAsString();
		
		try {
			int i = Integer.parseInt(value);
			
			if (i == 0)
				return false;
			else if (i == 1)
				return true;
			else
				return null;
		} catch (Exception e) {
			if (value.equalsIgnoreCase("false"))
				return false;
			else if (value.equalsIgnoreCase("true"))
				return true;
			else
				return null;
			
		}
        
	}

}
