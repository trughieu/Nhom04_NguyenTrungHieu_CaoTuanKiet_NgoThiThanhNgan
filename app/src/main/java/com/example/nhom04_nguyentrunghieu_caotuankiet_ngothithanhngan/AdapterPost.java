package com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.ViewHolderPost> {

    ArrayList<Post> arrayList;


    public AdapterPost(ArrayList<Post> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolderPost onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_post,parent,false);
        return new ViewHolderPost(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPost holder, int position) {
        Post post = arrayList.get(position);
        if (post != null){
            StorageReference storageReference = FirebaseStorage.getInstance().getReference();

            StorageReference avt = storageReference.child("avt/"+
                    post.getAvt());
            avt.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(holder.avtPost);
                }
            });
            StorageReference postImg = storageReference.child("posts/"+
                    post.getImgpost());
            postImg.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(holder.img_post);
                }
            });
            holder.tvNamePost.setText(post.getNamepost());
            holder.tvContentPost.setText(post.getContent());
        }
    }

    @Override
    public int getItemCount() {

        return arrayList.size();
    }


    public class ViewHolderPost extends RecyclerView.ViewHolder {
        TextView tvNamePost, tvContentPost;
        ImageView img_post,avtPost;

        public ViewHolderPost(View itemView) {
            super(itemView);
            avtPost= itemView.findViewById(R.id.avtPost);
            tvNamePost = itemView.findViewById(R.id.namePost);
            tvContentPost = itemView.findViewById(R.id.content_post);
            img_post = itemView.findViewById(R.id.img_post);
        }
    }

}
