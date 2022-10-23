package ke.or.explorersanddevelopers;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SignupFragment extends Fragment {

    private Button submit, login;

    public SignupFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signup, container, false);
        submit = view.findViewById(R.id.btn_signupSubmit);
        login = view.findViewById(R.id.btn_signupLogin);
        FragmentManager fragmentManager = getParentFragmentManager();

        login.setOnClickListener(v -> {
            Intent intent = new Intent(container.getContext(), LoginActivity.class);
            container.getContext().startActivity(intent);
        });

        submit.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerViewInSignup, VerifyEmailFragment.class, null)
                    .addToBackStack("EmailVerificationCodeFragment")
                    .commit();
        });
        return view;
    }
}