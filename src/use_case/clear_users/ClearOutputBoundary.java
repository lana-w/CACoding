package use_case.clear_users;

// TODO Complete me
// DONE?

import use_case.signup.SignupOutputData;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData accountsDeleted);

    void prepareFailView(String error);

}
