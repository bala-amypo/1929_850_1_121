@Service
public class ExamSessionService {

    private final ExamSessionRepository repo;

    public ExamSessionService(ExamSessionRepository repo) {
        this.repo = repo;
    }

    public ExamSession save(ExamSession s) {
        return repo.save(s);
    }
}
