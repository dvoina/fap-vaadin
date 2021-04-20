package com.example.application.views.logout;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.main.MainView;

@Route(value = "logout", layout = MainView.class)
@PageTitle("Log out")
public class LogoutView extends Div {

    public LogoutView() {
        addClassName("logout-view");
        add(new Text("Content placeholder"));
    }

}
