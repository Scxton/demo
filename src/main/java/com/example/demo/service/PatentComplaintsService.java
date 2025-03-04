package com.example.demo.service;

import com.example.demo.model.PatentComplaints;

import java.util.List;
import com.example.demo.mapper.PatentComplaintsMapper;
import com.example.demo.mapper.UserRolePermissionsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class PatentComplaintsService {

    @Resource
    private PatentComplaintsMapper patentComplaintsMapper;

    @Resource
    private UserRolePermissionsMapper userRolePermissionsMapper;


    public PatentComplaints queryByuserId(Integer userId){
        return this.patentComplaintsMapper.queryByuserId(userId);
    }

    public Integer insertComplaint(PatentComplaints patentComplaints){
        return this.patentComplaintsMapper.insertComplaint(patentComplaints);
    }

    public Integer updateComplaint(PatentComplaints patentComplaints){
        return this.patentComplaintsMapper.updateComplaint(patentComplaints);
    }

    public Integer deleteByuserId(Integer userId){
        return this.patentComplaintsMapper.deleteByuserId(userId);
    }

    public List<PatentComplaints> queryAll(){
        return this.patentComplaintsMapper.queryAll();
    }
}
