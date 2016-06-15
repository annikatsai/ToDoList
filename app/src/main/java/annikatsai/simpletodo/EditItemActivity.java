package annikatsai.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    String item;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String item = getIntent().getStringExtra("first");
        position = getIntent().getIntExtra("in-reply-to", 0);
        EditText etEditedItem = (EditText) findViewById(R.id.etEditedItem);
        etEditedItem.append("");
        etEditedItem.append(item);
    }

    public void onSubmit(View v){
        EditText etName = (EditText) findViewById(R.id.etEditedItem);
        Intent data = new Intent(EditItemActivity.this, MainActivity.class);
        data.putExtra("name", etName.getText().toString());
//        data.putExtra("code", 20);
        data.putExtra("position", position);
        data.putExtra("name1", item);
        setResult(RESULT_OK, data);
        finish();
    }

}
