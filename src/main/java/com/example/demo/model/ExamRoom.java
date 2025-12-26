@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rows;
    private int columns;
}
