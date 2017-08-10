package io.threestacks.packerapi.budget;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BudgetRepository extends CrudRepository <Budget, Long>{
	List<Budget> findByPackId(int packId);
}
