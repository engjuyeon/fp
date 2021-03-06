package com.example.fp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    EditText email, passwd;
    Button login;
    float v=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email= root.findViewById(R.id.email);
        passwd = root.findViewById(R.id.passwd);
        login = root.findViewById(R.id.login);

        email.setTranslationX(800);
        passwd.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        passwd.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setDuration(300).start();
        passwd.animate().translationX(0).alpha(1).setDuration(800).setDuration(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setDuration(700).start();

        return root;
    }
}
