package net.rvanasa.schoology.obj.assignments;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/discussion-thread
 */
@Getter
public class SchoologyGradingCategory extends SchoologyReference<SchoologyGradingCategory>
{
	
	String id;
    String title;
    int delta;
    int calculation_type;
    float default_max_points;
    int default_grading_scale_id;
    int drop_lowest;
	int weight;
	
	
}
