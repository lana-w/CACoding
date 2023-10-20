package use_case.clear_users;

// TODO Complete me
// LAST THING TO DO! Done?

import entity.UserFactory;

import java.util.List;

public class ClearInteractor implements ClearInputBoundary{

    private ClearUserDataAccessInterface CUDI;
    final ClearOutputBoundary clearPresenter;

    final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface CUDI, ClearOutputBoundary clearPresenter, UserFactory userFactory) {
        this.CUDI = CUDI;
        this.clearPresenter = clearPresenter;
        this.userFactory = userFactory;
    }

    public void execute() {
        List accountsDeleted = CUDI.clear();
    }
}
