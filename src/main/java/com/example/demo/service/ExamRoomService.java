Service 
ExamRoomService 
package com.example.demo.service; 
 
import java.util.List; 
 
import com.example.demo.model.ExamRoom; 
 
public interface ExamRoomService{ 
    ExamRoom addRoom(ExamRoom room); 
    List<ExamRoom> getAllRooms(); 
} 
ExamSessionService 
package com.example.demo.service; 
import com.example.demo.model.ExamSession; 
public interface ExamSessionService{ 
ExamSession createSession(ExamSession session); 
ExamSession getSession(Long sessionId); 
} 
SeatingPlanService 
package com.example.demo.service; 
import java.util.List; 
import com.example.demo.model.SeatingPlan; 
public interface SeatingPlanService{ 
SeatingPlan generatePlan(Long sessionId); 
SeatingPlan getPlan(Long planId); 
List<SeatingPlan> getPlansBySession(Long sessionId); 
} 
StudentService 
package com.example.demo.service; 
import java.util.List; 
import com.example.demo.model.Student; 
public interface StudentService { 
Student addStudent(Student student); 
List<Student> getAllStudents(); 
} 
 

