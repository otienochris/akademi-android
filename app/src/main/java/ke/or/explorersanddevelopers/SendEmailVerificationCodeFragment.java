package ke.or.explorersanddevelopers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SendEmailVerificationCodeFragment extends Fragment {

    private Button submit;

    public SendEmailVerificationCodeFragment() {
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
        View view = inflater.inflate(R.layout.fragment_send_email_verification_code, container, false);
        submit = view.findViewById(R.id.btnInChangePass_submit);

        FragmentManager fragmentManager = getParentFragmentManager();

        submit.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerViewInLogin, SubmitNewPasswordFragment.class, null)
                    .addToBackStack("SubmitNewPasswordFragment")
                    .commit();
        });

        return view;
    }
}