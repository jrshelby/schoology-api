package net.rvanasa.schoology.obj.assignments;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/discussion-thread
 */
@Getter
public class SchoologyGradesContainer extends SchoologyReference<SchoologyGradesContainer>
{
	SchoologyGradesPage grades;
	
}
