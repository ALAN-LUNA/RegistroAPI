package com.example.registro.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.registro.databinding.FragmentHomeBinding;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private RegisterApi registerApi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        /*BOTON REGISTRO*/
        final Button BtnRegistro = binding.btnRegistrar;
        BtnRegistro.setOnClickListener(new View.OnClickListener() {
            final EditText EtName = binding.nameEt;
            final EditText EtApPat = binding.apPatEt;
            final EditText EtApMat = binding.apMatEt;
            final EditText EtEmail = binding.emailEt;
            final EditText EtPass = binding.passEt;
            final EditText EtValidate = binding.validateEt;
            final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            @Override
            public void onClick(View view) {
                logging.setLevel(HttpLoggingInterceptor.Level.BODY);
                final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                httpClient.addInterceptor(logging);
                Retrofit retrofit=new Retrofit.Builder()
                        .baseUrl("https://eyiogthd.lucusvirtual.es/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(httpClient.build())
                        .build();

                registerApi = retrofit.create(RegisterApi.class);
                Call<Register> call=registerApi.getElements();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}