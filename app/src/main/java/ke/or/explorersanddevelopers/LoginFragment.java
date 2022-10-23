package ke.or.explorersanddevelopers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment {

    private Button btnInLogin_ChangePassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        FragmentManager fragmentManager = getParentFragmentManager();

        btnInLogin_ChangePassword = view.findViewById(R.id.btn_inLogin_ChangePassword);

        
        btnInLogin_ChangePassword.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerView, ChangePasswordFragment.class, null)
                    .addToBackStack("ChangePassword")
                    .commit();
        });

        return view;
    }
}