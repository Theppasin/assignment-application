package controller;

import model.AssignmentModel;
import view.CreateAssignmentView;
import view.HomeView;
import view.ShowAssignmentView;

public class AssignmentController {
    private final HomeView homeView;
    private AssignmentModel assignmentModel;

    private boolean appIsRunning = true;

    public AssignmentController(HomeView homeView, AssignmentModel model) {
        this.homeView = homeView;
        this.assignmentModel = model;
    }

    public void startApp() {
        while (appIsRunning) {
            int mode = homeView.selectMode();
            switch (mode) {
                case 1:
                    CreateAssignmentView createAssignmentView = new CreateAssignmentView();
                    ShowAssignmentView showAssignmentView = new ShowAssignmentView();
                    assignmentModel = createAssignmentView.create();
                    assignmentModel.create(assignmentModel);
                    showAssignmentView.print(assignmentModel);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Thank you for using this program!");
                    appIsRunning = false;
            }
        }
    }
}
