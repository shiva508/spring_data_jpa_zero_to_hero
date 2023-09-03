package com.comrade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.comrade.domine.Plan;
import com.comrade.model.PlanModel;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {
	@Query(name = "plantitle_description_query", nativeQuery = true)
	public List<PlanModel> getCustomPlanData();
}
