package doubi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiOperation;

@Controller
@ApiModel("com")
public class Com {

	@ResponseBody
	@RequestMapping(
            value = "sys", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	 @ApiOperation(value = "测试", httpMethod = "POST", response =String.class, notes = "测试输出")
	public String sys(){
		System.out.println("song");
		return "doubi";
	}

}
