@Service
public class ExamRoomService {

    private final ExamRoomRepository repo;

    public ExamRoomService(ExamRoomRepository repo) {
        this.repo = repo;
    }

    public ExamRoom save(ExamRoom room) {
        return repo.save(room);
    }

    public ExamRoom getByRoomNumber(String roomNumber) {
        return repo.findByRoomNumber(roomNumber);
    }
}
