package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.AssignmentModel;
import model.StudentModel;

public class CreateAssignmentView {
    public AssignmentModel create() {
        Scanner scanner = new Scanner(System.in);
        AssignmentModel assignmentModel = new AssignmentModel();

        // title
        System.out.print("Enter Assignment Title:       ");
        String title = scanner.nextLine();

        // description
        System.out.print("Enter Assignment Description: ");
        String desc = scanner.nextLine();

        // date
        System.out.print("Enter Assignment Due Year:    ");
        String year = scanner.nextLine();

        System.out.print("Enter Assignment Due Month:   ");
        String month = scanner.nextLine();

        System.out.print("Enter Assignment Due Day:     ");
        String day = scanner.nextLine();

        // time
        System.out.print("Enter Assignment Due Hour:    ");
        String hour = scanner.nextLine();

        System.out.print("Enter Assignment Due Minute:  ");
        String min = scanner.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String date = year + "/" + month + "/" + day + " " + hour + ":" + min;
        Date dueDate = new Date();
        try {
            dueDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // student
        System.out.print("Enter Assignment Student Number: ");
        int stuNum = scanner.nextInt();
        scanner.nextLine();

        ArrayList<StudentModel> studentsList = new ArrayList<>();
        for (int i = 0; i < stuNum; i++) {
            StudentModel studentModel = new StudentModel();
            System.out.print("Enter Assignment Student ID [" + (i + 1) + "]: ");
            String id = scanner.nextLine();
            studentModel.setId(id);
            studentsList.add(studentModel);
        }

        assignmentModel.setTitle(title);
        assignmentModel.setDescription(desc);
        assignmentModel.setDueDate(dueDate);
        assignmentModel.setStudentsList(studentsList);
        return assignmentModel;
    }
}
