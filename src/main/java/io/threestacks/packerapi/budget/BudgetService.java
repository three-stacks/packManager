package io.threestacks.packerapi.budget;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {
	
	@Autowired
	private BudgetRepository budgetRepository;
	
	public List<Budget> getAllBudgets(){
		List<Budget> budgets = new ArrayList<>();
		budgetRepository.findAll().forEach(budgets::add);
		return budgets;
	}
	
	public Budget getBudget(long id){
		return budgetRepository.findOne(id);
	}
	
	public List<Budget> getPacksBudget(int packId){
		List<Budget> budgets = new ArrayList<>();
		budgetRepository.findByPackId(packId).forEach(budgets::add);
		return budgets;
	}
	
	public Budget addBudget(Budget budget) {
		budgetRepository.save(budget);
		return budget;
	}
	
	public Budget deleteBudget(long id) {
		Budget bud = getBudget(id);
		budgetRepository.delete(id);
		return bud;
	}
}
