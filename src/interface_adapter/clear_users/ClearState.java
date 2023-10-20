package interface_adapter.clear_users;

// TODO Complete me // DONE?

import java.util.List;

public class ClearState {

    private List usersDeleted = null;

    public ClearState(ClearState copy) {
        usersDeleted = copy.usersDeleted;
    }
    public ClearState() {
    }
    public List getUsersDeleted() {
        return usersDeleted;
    }
    public void setUsersDeleted(List usersDeleted) {
        this.usersDeleted = usersDeleted;
    }
    @Override
    public String toString() {
        return "ClearState{" +
                "usersDeleted='" + usersDeleted + '\'' +
                '}';
    }

    // Will contain a string or list of names that we want to currently display
    // In actual view, that's where we want to display

    // In Swing, we have a bunch of panels, one for sign up login, clear, etc..
    // all exists, but only one is shown
    // at any given point, each has a state
    // for clear panel, currently blank
    //

}
