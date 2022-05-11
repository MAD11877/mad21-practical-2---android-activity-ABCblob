package sg.edu.np.mad.prac2ver3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create dumb-y user
        String desc = "This is a relatively long piece of text that has no spelling mistakes so as to " +
                "anger the android studio gods and tell me the whole program doesn't run";
        User testUser = new User("userTest",desc,1,false);

        //define buttons and text
        TextView nameText = findViewById(R.id.nameText);
        TextView descText = findViewById(R.id.descText);
        Button followButton = findViewById(R.id.followButton);

        nameText.setText(testUser.getName());
        descText.setText(testUser.getDescription());

        //when follow button clicked
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "Button pressed");

                //flip follow state
                if (testUser.isFollowed() == false) {
                    testUser.setFollowed(true);
                    followButton.setText("unfollow");
                }
                else {
                    testUser.setFollowed(false);
                    followButton.setText("follow");
                }
            }
        });
    }
}

