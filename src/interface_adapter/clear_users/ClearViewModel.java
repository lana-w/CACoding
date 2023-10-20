package interface_adapter.clear_users;

// TODO Complete me // DONE?

import interface_adapter.ViewModel;
import interface_adapter.clear_users.ClearState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public final String TITLE_LABEL = "Cleared View";

    private ClearState state = new ClearState();

//    public static final String LOGOUT_BUTTON_LABEL = "Log out";
//    private String loggedInUser;

    public ClearViewModel() {
        super("clear");
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    // This is what the Login Presenter will call to let the ViewModel know
    // to alert the View
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }

}
