//package com.example.lifeline;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TokenStatusFragment extends Fragment {
//
//    private DatabaseReference mDatabase;
//    private RecyclerView recyclerView;
//    private ArrayList<Token> list;
//    private Token_Adapter adapter;
//
//
//
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_token_status,container,false);
//
//
//
//
//        recyclerView = (RecyclerView) v.findViewById(R.id.token_recycler);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(adapter);
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
//
//        list = new ArrayList<Token>();
//
//        mDatabase = FirebaseDatabase.getInstance().getReference().child("Doctors");
//
//        mDatabase.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
//                    Token u = dataSnapshot1.getValue(Token.class);
//                    list.add(u);
//                }
//
//                adapter = new Token_Adapter(TokenStatusFragment.this, list);
//                recyclerView.setAdapter(adapter);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(getActivity(), "opss.. Something is wrong", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//        return v;
//
//
//    }
//
//
//
//}
//
