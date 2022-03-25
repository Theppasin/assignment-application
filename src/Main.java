import controller.AssignmentController;
import model.AssignmentModel;
import view.HomeView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HomeView view = new HomeView();
        AssignmentModel model = new AssignmentModel();
        model.read();
        AssignmentController controller = new AssignmentController(view, model);
        controller.startApp();
    }

    private static ArrayList<AssignmentModel> mockAssignments() {
        AssignmentModel model = new AssignmentModel();
        ArrayList<AssignmentModel> modelsList = new ArrayList<>();
        modelsList.add(model);
        return modelsList;
    }
}
