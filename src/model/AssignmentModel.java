package model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentModel {
    private String title;
    private String description;
    private Date dueDate;
    private ArrayList<StudentModel> studentsList;

    private FileWriter file;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public ArrayList<StudentModel> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<StudentModel> studentsList) {
        this.studentsList = studentsList;
    }

    public void create(AssignmentModel assignmentModel) {
        JSONArray studentsJsonArray = new JSONArray();
        for (StudentModel i : assignmentModel.studentsList) {
            JSONObject studentObject = new JSONObject();
            studentObject.put("id", i.getId());
            studentObject.put("work", null);
            studentObject.put("send_date", null);
            studentsJsonArray.add(studentObject);
        }

        JSONObject assignmentObject = new JSONObject();
        assignmentObject.put("title", assignmentModel.title);
        assignmentObject.put("desc", assignmentModel.description);
        assignmentObject.put("due_date", assignmentModel.dueDate.toString());
        assignmentObject.put("students", studentsJsonArray);

        JSONArray assignmentsJsonArray = new JSONArray();
        assignmentsJsonArray.add(assignmentObject);

        writeToFile(assignmentsJsonArray);
    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }

    private void writeToFile(JSONArray content) {
        String jsonPath = "src/database/assignments.json";
        try {
            file = new FileWriter(jsonPath);
            file.write(content.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
