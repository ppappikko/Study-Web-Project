package com.studyboot.sms.dao;

import java.util.List;
import java.util.Map;
import com.studyboot.sms.domain.Rate;

public interface RateDao {
  List<Rate> findAll(Map<String, Object> params);
  int evaluationAdd(Map<String, Object> evaluationMap);
  int rateRequireUpdate(Map<String, Object> rateRequireMap);
}
