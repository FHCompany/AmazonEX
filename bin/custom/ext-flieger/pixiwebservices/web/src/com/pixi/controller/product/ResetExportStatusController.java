package com.pixi.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pixi.controller.AbstractPixiController;
import com.pixi.dto.SampleResponse;

@Controller
public class ResetExportStatusController extends AbstractPixiController
{
	private static final String ACTION = "reset_export_status";

	@RequestMapping(method = RequestMethod.GET, produces = "text/xml", params="action=" + ACTION)
	public @ResponseBody SampleResponse handle()
	{
		return getResponse(ACTION);
	}
}