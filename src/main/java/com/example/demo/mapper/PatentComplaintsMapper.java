package com.example.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Pageable;
import java.util.List;
import com.example.demo.model.PatentComplaints;

public interface PatentComplaintsMapper {

    PatentComplaints queryByuserId(Integer userId);

    Integer insertComplaint(PatentComplaints patentComplaints);

    Integer updateComplaint(PatentComplaints patentComplaints);

    Integer deleteByuserId(Integer userId);

    List<PatentComplaints> queryAll();
}
