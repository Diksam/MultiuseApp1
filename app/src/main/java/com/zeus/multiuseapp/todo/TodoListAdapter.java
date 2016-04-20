package com.zeus.multiuseapp.todo;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.zeus.multiuseapp.R;
import com.zeus.multiuseapp.models.TodoItem;

import java.util.List;

/**
 * Created by hi on 4/20/2016.
 */
public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ViewHolder> {
    private List<TodoItem> mTodoItems;
    private Context mContext;

    public TodoListAdapter(List<TodoItem> items, Context context) {
        mTodoItems = items;
        mContext = context;
    }

    @Override
    public int getItemCount() {
        return mTodoItems.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_todo_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final TodoItem selectedTodo = mTodoItems.get(position);
        holder.mToDoCheckbox.setText(selectedTodo.getTitle());
        if (selectedTodo.isChecked()) {
            holder.mToDoDate.setVisibility(View.VISIBLE);
            holder.mToDoDate.setText(selectedTodo.getModifiedDate());
            holder.mToDoCheckbox.setChecked(true);
            holder.mToDoCheckbox.setPaintFlags(holder.mToDoCheckbox.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        }

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mToDoDate;
        public CheckBox mToDoCheckbox;
        private ImageView mHandleView;

        public ViewHolder(View itemView) {
            super(itemView);
            mToDoDate = (TextView) itemView.findViewById(R.id.todoListCreated);
            mToDoCheckbox = (CheckBox) itemView.findViewById(R.id.todoListCheckbox);
            mHandleView = (ImageView) itemView.findViewById(R.id.tHandle);


        }
    }
}
