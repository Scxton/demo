package com.example.demo.controller;
import com.example.demo.model.IntellectualProperty;
import com.example.demo.model.PatentComplaints;
import com.example.demo.service.IntellectualPropertyService;
import com.example.demo.service.PatentComplaintsService;
import com.example.demo.utils.JSONResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("patentComplaints")

public class PatentComplaintsController {

    @Resource
    private PatentComplaintsService patentComplaintsService;

    // 通过用户id查询投诉信息
    @GetMapping("/queryByuserId")
    public ResponseEntity<JSONResult> queryById(@Param("userId") Integer userId) {
        PatentComplaints res = this.patentComplaintsService.queryByuserId(userId);
        String msg = "查询成功";
        int statusCode = HttpStatus.OK.value();
        JSONResult jsonResult = new JSONResult("success",statusCode,msg,res);
        return ResponseEntity.ok(jsonResult);
    }

    // 新增投诉信息
    @PostMapping("/insertComplaint")
    public ResponseEntity<JSONResult> insertComplaint(@Param("patentComplaints") PatentComplaints patentComplaints) {
        Integer res = this.patentComplaintsService.insertComplaint(patentComplaints);
        String msg = "信息投诉成功";
        int statusCode = HttpStatus.OK.value();
        JSONResult jsonResult = new JSONResult("success",statusCode,msg,res);
        return ResponseEntity.ok(jsonResult);
    }

    // 更新投诉信息
    @PostMapping("/updateComplaint")
    public ResponseEntity<JSONResult> updateComplaint(@Param("patentComplaints") PatentComplaints patentComplaints) {
        Integer res = this.patentComplaintsService.updateComplaint(patentComplaints);
        String msg = "更新投诉信息成功";
        int statusCode = HttpStatus.OK.value();
        JSONResult jsonResult = new JSONResult("success",statusCode,msg,res);
        return ResponseEntity.ok(jsonResult);
    }

    // 通过用户id删除投诉信息
    @GetMapping("/deleteByuserId")
    public ResponseEntity<JSONResult> deleteByuserId(@Param("userId") Integer userId) {
        Integer res = this.patentComplaintsService.deleteByuserId(userId);
        String msg = "删除投诉信息成功";
        int statusCode = HttpStatus.OK.value();
        JSONResult jsonResult = new JSONResult("success",statusCode,msg,res);
        return ResponseEntity.ok(jsonResult);
    }

    // 查询所有投诉信息
    @GetMapping("/queryAll")
    public ResponseEntity<JSONResult> queryAll() {
        List<PatentComplaints> res = this.patentComplaintsService.queryAll();
        String msg = "查询所有投诉信息成功";
        int statusCode = HttpStatus.OK.value();
        JSONResult jsonResult = new JSONResult("success",statusCode,msg,res);
        return ResponseEntity.ok(jsonResult);
    }
}
