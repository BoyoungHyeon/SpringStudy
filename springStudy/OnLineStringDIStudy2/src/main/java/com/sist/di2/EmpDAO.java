package com.sist.di2;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {
   @Autowired
   private EmpMapper mapper;
   public List<EmpVO> empAllData()
   {
      return mapper.empAllData();
   }
}