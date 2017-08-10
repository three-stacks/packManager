package io.threestacks.packerapi.budget;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "http://localhost:8100")
@RestController
public class BudgetController {
	
	@Autowired
	private BudgetService budgetService;
	
	
	@RequestMapping("/budgets")
	public List<Budget> getAllBudgets(){
		return budgetService.getAllBudgets();
	}
	
	@RequestMapping("/budgets/{packId}")
	public List<Budget> getBudgetById(@PathVariable int packId) {
		return budgetService.getPacksBudget(packId);
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/budgets")
    public Budget addBudget(@RequestBody Budget budget){
        Budget newBudget = budgetService.addBudget(budget);
        return newBudget;
    }
	
	@RequestMapping(method= RequestMethod.DELETE, value="/budgets/{id}")
	public Budget deleteBudget(@PathVariable long id) {
		return budgetService.deleteBudget(id);
	}
	
}
