package com.srct.ril.poas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.srct.ril.poas.dbconfig.DS;
import com.srct.ril.poas.dbconfig.DataSourceEnum;
import com.srct.ril.poas.http.CommonResponse;
import com.srct.ril.poas.http.Response;
import com.srct.ril.poas.service.StoreJDService;
import com.srct.ril.poas.utils.ServiceException;

@RestController
@RequestMapping("/JD")
public class StoreJDController {
	
	private static final Logger log = LoggerFactory.getLogger(StoreJDController.class);
	
	@Autowired
    private StoreJDService storeJDService;
	
	//http://127.0.0.1:8004/JD/modelinfo?modelname=N9500&start=2018-02-09 00:00:09&end=2018-02-09 09:44:00
	@RequestMapping("/modelinfo")
	@DS(DataSourceEnum.MODEL)
	public CommonResponse getProduct(
			@RequestParam(value="modelname") String modelName,
			@RequestParam(value="start") String startTime,
			@RequestParam(value="end") String endTime) throws ServiceException {
		log.info("======StoreJDController=========");
        return Response.generateResponse(storeJDService.select(modelName,startTime,endTime));
    }
}