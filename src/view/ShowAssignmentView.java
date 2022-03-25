package view;

import model.AssignmentModel;
import model.StudentModel;

public class ShowAssignmentView {
    public void print(AssignmentModel assignmentModel) {
        System.out.println("Assignment Title:       " + assignmentModel.getTitle());
        System.out.println("Assignment Description: " + assignmentModel.getDescription());
        System.out.println("Assignment Due Date:    " + assignmentModel.getDueDate());
        System.out.println("Assignment Student List: ");
        int i = 0;
        for (StudentModel studentModel : assignmentModel.getStudentsList()) {
            System.out.println(i + ". " + studentModel.getId());
            i++;
        }
    }
}
