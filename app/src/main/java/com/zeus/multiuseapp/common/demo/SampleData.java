package com.zeus.multiuseapp.common.demo;

import com.zeus.multiuseapp.models.Notes;
import com.zeus.multiuseapp.models.TodoItem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Zeus on 4/11/2016.
 */
public class SampleData {
    public static List<TodoItem> getSampleTasks() {
        List<TodoItem> items = new ArrayList<TodoItem>();
        TodoItem item1 = new TodoItem();
        item1.setTitle("Get milk");
        item1.setChecked(true);
        Calendar calender1 = GregorianCalendar.getInstance();
        item1.setDateModified(calender1.getTimeInMillis());
        items.add(item1);
        TodoItem item2 = new TodoItem();
        item1.setTitle("Visit Doctor,You have flu");
        item1.setChecked(true);
        Calendar calender2 = GregorianCalendar.getInstance();
        calender2.add(Calendar.DAY_OF_WEEK, 2);
        calender2.add(Calendar.MILLISECOND, 24387923);
        item1.setDateModified(calender2.getTimeInMillis());
        items.add(item2);
        TodoItem item3 = new TodoItem();
        item1.setTitle("Read The Above Task");
        item1.setChecked(false);
        Calendar calender3 = GregorianCalendar.getInstance();
        calender3.add(Calendar.DAY_OF_WEEK, 2);
        calender3.add(Calendar.MILLISECOND, 24387923);
        item1.setDateModified(calender3.getTimeInMillis());
        items.add(item3);
        return items;


    }

    public static List<Notes> getSmapleNote() {
        List<Notes> sampleNotes = new ArrayList<Notes>();
        //crteate some dummy notes


        return sampleNotes;
    }
    }

