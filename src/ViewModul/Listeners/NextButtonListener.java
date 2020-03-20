package ViewModul.Listeners;

import Controller.Controller;
import Controller.PageController;
import ViewModul.SeeTable;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

public class NextButtonListener extends SelectionAdapter
{
    PageController pageControl=null;
    Table tableView= null;
    Controller controller= null;
    Label pagesLabel=null;
    public NextButtonListener(Table table, PageController tempValue, Controller tempController, Label tempLabel)
    {
        tableView=table;
        controller=tempController;
        pagesLabel=tempLabel;
        pageControl=tempValue;
    }

    public void widgetSelected(SelectionEvent event1) {
        pageControl.nextPage(controller);
        SeeTable view=new SeeTable();
        view.seeTable(tableView,pageControl.getPage(),controller.getTable(),pagesLabel);
    }
}
