package com.osman.salih;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopicsCardAdapter extends RecyclerView.Adapter<TopicsCardAdapter.AnswerQ> {

    List<TopicsCard> topicsCardsList;

    public TopicsCardAdapter(List<TopicsCard> topicsCardsList) {
        this.topicsCardsList = topicsCardsList;
    }

    @NonNull
    @Override
    public AnswerQ onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics_card, parent, false);
        return new AnswerQ(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnswerQ holder, int position) {

        TopicsCard topicsCard = topicsCardsList.get(position);
        holder.questions.setText(topicsCard.getQuestions());
        holder.answers.setText(topicsCard.getAnswers());

        boolean isExpandedle = topicsCardsList.get(position).isExpandedle();
        holder.expandedleLayout.setVisibility(isExpandedle ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return topicsCardsList.size();
    }

    public class AnswerQ extends RecyclerView.ViewHolder {

        TextView questions, answers;
        LinearLayout linearLayout, expandedleLayout;

        public AnswerQ(@NonNull View itemView) {
            super(itemView);

            questions = itemView.findViewById(R.id.questions);
            answers = itemView.findViewById(R.id.questionsCorrect);

            linearLayout = itemView.findViewById(R.id.linearLayout);
            expandedleLayout = itemView.findViewById(R.id.expandedleLinear);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TopicsCard topicsCard = topicsCardsList.get(getAdapterPosition());
                    topicsCard.setExpandedle(!topicsCard.isExpandedle());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
