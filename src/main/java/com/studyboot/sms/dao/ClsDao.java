package com.studyboot.sms.dao;

import java.util.List;
import com.studyboot.sms.domain.Cls;

public interface ClsDao {
  List<Cls> findMediumClsName(String clsNo);
  List<Cls> findSmallClsName(String clsNo);
  List<String> findClsNoByKeyword(String keyword);
}







