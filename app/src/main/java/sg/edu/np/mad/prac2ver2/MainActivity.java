package sg.edu.np.mad.prac2ver2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    User user1 = new User();

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "On Resuming...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "On Destroy...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user1.followed = true;
        user1.name = "MAD";
        user1.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
                " tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.description);
        Button follow_button = findViewById(R.id.follower);

        name.setText(user1.name);
        desc.setText(user1.description);
        follow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "Button Pressed");

                if (user1.followed == true) {
                    user1.followed = false;
                    follow_button.setText("unfollow");
                }
                else {
                    user1.followed = true;
                    follow_button.setText("follow");
                }
            }

        });
    }
}