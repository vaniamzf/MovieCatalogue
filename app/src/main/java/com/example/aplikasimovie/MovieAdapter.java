package com.example.aplikasimovie;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    private final Context context;
    private ArrayList<Movie> movies;


    MovieAdapter(Context context) {
        this.context = context;
        movies = new ArrayList<>();
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }


    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.movie_list, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Movie movie = (Movie) getItem(i);
        viewHolder.bind(movie);
        return view;
    }

    private class ViewHolder {
        private TextView txtTitle;
        private TextView txtDescription;
        private TextView txtGenres;
        private ImageView imgPhoto;

        ViewHolder(View view) {
            txtTitle = view.findViewById(R.id.tvTitleMovie);
            txtDescription = view.findViewById(R.id.tvMovieDescription);
            txtGenres = view.findViewById(R.id.tvMovieGenres);
            imgPhoto = view.findViewById(R.id.img_photo);
        }
        void bind(Movie movie) {
            txtTitle.setText(movie.getTitle());
            txtDescription.setText(movie.getDescription());
            txtGenres.setText(movie.getGenres());
            imgPhoto.setImageResource(movie.getPhoto());
        }
//    private Context context;
//    private ArrayList<Movie> movieList;
//
//    public MovieAdapter(Context context) {
//        this.context = context;
//    }
//
//    public void setMovieList(ArrayList<Movie> movieList) {
//        this.movieList = movieList;
//    }
//
//
//    @NonNull
//    @Override
//    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list, parent, false);
//        return new MovieViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
//        Movie movie = movieList.get(position);
//        Glide.with(context)
//                .load(movieList().get(position).getPhoto())
//                .apply(new RequestOptions().override(55, 55))
//                .into(holder.imgPhoto);
//        holder.title.setText(movieList().get(position).getTitle());
//        holder.description.setText(movieList().get(position).getDescription());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return movieList.size();
//    }
//
//    public class MovieViewHolder extends RecyclerView.ViewHolder {
//
//        private ImageView imgPhoto;
//        private TextView title, description;
//
//        public MovieViewHolder(@NonNull View itemView) {
//            super(itemView);
//            imgPhoto = itemView.findViewById(R.id.img_photo);
//            title = itemView.findViewById(R.id.tvTitleMovie);
//            description = itemView.findViewById(R.id.tvMovieDescription);
//        }
    }
}
