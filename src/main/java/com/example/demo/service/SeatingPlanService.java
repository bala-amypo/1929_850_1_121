@Service
public class SeatingPlanService {

    private final SeatingPlanRepository repo;

    public SeatingPlanService(SeatingPlanRepository repo) {
        this.repo = repo;
    }

    public SeatingPlan save(SeatingPlan plan) {
        return repo.save(plan);
    }
}
