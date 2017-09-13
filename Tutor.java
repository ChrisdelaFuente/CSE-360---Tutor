/*
 * Date Published: 9/13/2017
 * Programmer: Christopher de la Fuente
 * Tutor.java
 *
 * Displays various .html files depending on the state the program is in.
 */
package tutor;

import javax.swing.JPanel;
import javax.swing.JEditorPane;
import java.io.*;
import java.net.URL;

/**
 *
 * @author power
 */
public class Tutor extends JPanel
{
        //declare variables
        int state = 0;      // state variable to keep track of what html file should be displayed
                            // 0 = author name, 1-4 = html files
        
        // initialize the JPanel
        JPanel display = new JPanel();
        
        Tutor(){
                           // check which of the 4 html files to display in the JPanel
            if (state >= 1 && state <= 4)
            {
                switch(state)
                {
                    case 1:
                        try
                        {
                            File one = new File("resources/P1.html");
                            JEditorPane ed2 = new JEditorPane();
                            ed2.setPage(one.toURI().toURL());
                            display.add(ed2);
                            display.setVisible(true);
                            display.setSize(200,200);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                            System.out.println("Some problem has occured"+e.getMessage());
                        }

                        break;

                    case 2:
                        try
                        {
                            File one = new File("resources/P2.html");
                            JEditorPane ed2 = new JEditorPane();
                            ed2.setPage(one.toURI().toURL());
                            display.add(ed2);
                            display.setVisible(true);
                            display.setSize(200,200);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                            System.out.println("Some problem has occured"+e.getMessage());
                        }

                        break;

                    case 3:
                        try
                        {
                             File one = new File("resources/P3.html");
                            JEditorPane ed2 = new JEditorPane();
                            ed2.setPage(one.toURI().toURL());
                            display.add(ed2);
                            display.setVisible(true);
                            display.setSize(200,200);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                            System.out.println("Some problem has occured"+e.getMessage());
                        }

                        break;

                    case 4:
                        try
                        {
                             File one = new File("resources/P4.html");
                            JEditorPane ed2 = new JEditorPane();
                            ed2.setPage(one.toURI().toURL());
                            display.add(ed2);
                            display.setVisible(true);
                            display.setSize(200,200);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                            System.out.println("Some problem has occured"+e.getMessage());
                        }

                        break;
                }
            }

            // Check if state is 0, signalling the start of the program, which will display author's name
            if (state == 0)
            {
                try
                {
                    String html;
                    html="<html><head><title>Author Page</title></head>";
                    html+="<body bgcolor='#777779'><hr/><font size=50>Christopher de la Fuente</font><hr/>";
                    html+="</body></html>";
                    JEditorPane ed1=new JEditorPane("text/html",html);
                    display.add(ed1);
                    display.setVisible(true);
                    display.setSize(200,200);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                    System.out.println("Some problem has occured"+e.getMessage());
                }
            }
        }
    
    public void changeState(int status)
    {
        if( status >=1 && status <=4)
        {
            state = status;
        }
        else
        {
            state = 1;
        }
        
        // check which of the 4 html files to display in the JPanel
        if (state >= 1 && state <= 4)
        {
            switch(state)
            {
                case 1:
                    try
                    {
                        File one = new File("resources/P1.html");
                        JEditorPane ed2 = new JEditorPane();
                        ed2.setPage(one.toURI().toURL());
                        display.add(ed2);
                        display.setVisible(true);
                        display.setSize(200,200);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        System.out.println("Some problem has occured"+e.getMessage());
                    }

                    break;

                case 2:
                    try
                    {
                        File one = new File("resources/P2.html");
                        JEditorPane ed2 = new JEditorPane();
                        ed2.setPage(one.toURI().toURL());
                        display.add(ed2);
                        display.setVisible(true);
                        display.setSize(200,200);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        System.out.println("Some problem has occured"+e.getMessage());
                    }

                    break;

                case 3:
                    try
                    {
                         File one = new File("resources/P3.html");
                        JEditorPane ed2 = new JEditorPane();
                        ed2.setPage(one.toURI().toURL());
                        display.add(ed2);
                        display.setVisible(true);
                        display.setSize(200,200);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        System.out.println("Some problem has occured"+e.getMessage());
                    }

                    break;

                case 4:
                    try
                    {
                         File one = new File("resources/P4.html");
                        JEditorPane ed2 = new JEditorPane();
                        ed2.setPage(one.toURI().toURL());
                        display.add(ed2);
                        display.setVisible(true);
                        display.setSize(200,200);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        System.out.println("Some problem has occured"+e.getMessage());
                    }

                    break;
            }
        }

        
    }
}
