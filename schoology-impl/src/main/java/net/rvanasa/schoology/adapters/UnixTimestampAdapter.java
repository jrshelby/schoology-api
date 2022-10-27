package net.rvanasa.schoology.adapters;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class UnixTimestampAdapter implements JsonDeserializer<Date>
{
	
	private final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) 
			throws JsonParseException {
		
		String raw = json.getAsString();
		
		
		
		

		//Assume datetime format
		try {
			//System.err.println("Parsing " + raw);
			Date t = dateTimeFormat.parse(raw);
			//System.err.println("Got " + t);
			return t;
		} catch (ParseException e1) {
			return null;
		}


		
	}

}
