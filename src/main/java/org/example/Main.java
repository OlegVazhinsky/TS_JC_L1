package org.example;

import tech_class.Model;
import tech_class.View;

public class Main {
    public static void main(String[] args) {

        Model myModel = new Model();
        View myView = new View();

        myView.ShowResult(myModel.Add(4, 2), '+');
        myView.ShowResult(myModel.Add(4.001, 2.123), '+');

        myView.ShowResult(myModel.Subs(4,2),'-');
        myView.ShowResult(myModel.Subs(4.001, 2.123), '-');

        myView.ShowResult(myModel.Mult(4,2),'*');
        myView.ShowResult(myModel.Mult(4.001, 2.123), '*');

        myView.ShowResult(myModel.Div(4,2),'/');
        myView.ShowResult(myModel.Div(4.001, 2.123), '/');

    }
}