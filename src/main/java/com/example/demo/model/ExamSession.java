@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseCode;
    private String examTime;
    private LocalDate examDate;

    @ManyToMany
    private Set<Student> students = new HashSet<>();
}
