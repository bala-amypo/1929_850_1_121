@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;

    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository) {
        this.examSessionRepository = examSessionRepository;
    }

    @Override
    public ExamSession save(ExamSession session) {
        return examSessionRepository.save(session);
    }

    @Override
    public ExamSession get(Long id) {
        return examSessionRepository.findById(id).orElse(null);
    }
}
