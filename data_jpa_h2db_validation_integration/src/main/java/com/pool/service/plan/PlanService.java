package com.comrade.service.plan;

import java.util.List;
import java.util.stream.Stream;

import com.comrade.domine.Plan;
import com.comrade.model.CommonResponse;
import com.comrade.model.PlanModel;

public interface PlanService {
	public Plan savePlan(Plan plan);

	public List<Plan> getAllPlans();

	public Plan updatePlan(Plan plan);

	public Plan getPlanByPlanId(Integer planId);

	public CommonResponse deletePlanByPlanId(Integer planId);

	public List<PlanModel> getCustomPlanData();
}
