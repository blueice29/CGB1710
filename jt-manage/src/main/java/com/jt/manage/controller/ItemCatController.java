package com.jt.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.manage.pojo.ItemCat;
import com.jt.manage.service.ItemCatService;

@Controller
@RequestMapping("/item/cat/")
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;

	@RequestMapping("list")
	@ResponseBody
	public List<ItemCat> findItemCat(@RequestParam(value="id",defaultValue="0")Long parentId) {
//		Long parentId = 0L;
//		if(id!=null)
//			parentId = id;
		return itemCatService.findItemCatByParentId(parentId);
	}
}
