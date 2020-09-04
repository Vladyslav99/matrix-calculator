package com.application.matrixcalculator.controller.matrix;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.matrixcalculator.R;
import com.application.matrixcalculator.model.MatrixLab;

public class MatrixActivity extends AppCompatActivity implements View.OnClickListener {


    interface OnMatrixSizeSelectListener{
        void onMatrixSizeSelected();
    }

    private FrameLayout mMatrixCellsLinearLayout;

    private TextView mMatrixNameTextView;
    private Button mSaveMatrixButton;
    private Button mSelectRowsAmountButton;
    private Button mSelectColumnsAmountButton;
    private Button mFillMatrixWithZeroButton;

    private int[][] mMatrix;
    private EditText[][] mEditTexts;

    private MatrixLab mMatrixLab;

    private String mMatrixName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_matrix);

        mMatrixName = getIntent().getStringExtra("Matrix");
        mMatrixLab = MatrixLab.getInstance();

        mMatrixNameTextView = findViewById(R.id.matrix_name_tv);

        if (mMatrixName.equals("MatrixA")){
            mMatrixNameTextView.setText(R.string.a_matrix);
        }
        else {
            mMatrixNameTextView.setText(R.string.b_matrix);
        }

        mSaveMatrixButton = findViewById(R.id.save_matrix_btn);
        mSaveMatrixButton.setOnClickListener(this);

        mSelectRowsAmountButton = findViewById(R.id.rows_amount_btn);
        mSelectRowsAmountButton.setOnClickListener(this);

        mSelectColumnsAmountButton = findViewById(R.id.columns_amount_btn);
        mSelectColumnsAmountButton.setOnClickListener(this);

        mFillMatrixWithZeroButton = findViewById(R.id.fill_matrix_with_zero_btn);
        mFillMatrixWithZeroButton.setOnClickListener(this);


        mMatrixCellsLinearLayout = (FrameLayout) findViewById(R.id.matrix_cells_fl);
        displayMatrixCells();

    }

    private void displayMatrixCells(){

        int rows = mMatrixLab.getMatrixByName(mMatrixName).length;
        int columns = mMatrixLab.getMatrixByName(mMatrixName)[0].length;

        mSelectRowsAmountButton.setText(String.valueOf(mMatrixLab.getMatrixByName(mMatrixName).length));
        mSelectColumnsAmountButton.setText(String.valueOf(mMatrixLab.getMatrixByName(mMatrixName)[0].length));

        TableLayout tableLayout = new TableLayout(this);

        mEditTexts = new EditText[rows][columns];

        for (int i = 0; i < rows; i++){
            TableRow tableRow = new TableRow(this);

            for (int j = 0; j < columns; j++){
                final EditText editText = new EditText(this);
                mEditTexts [i][j] = editText;

                TableRow.LayoutParams param = new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT,
                        1.0f
                );
                param.width = 0;
                editText.setLayoutParams(param);
                editText.setTextSize(20.0f);
                editText.setInputType(InputType.TYPE_CLASS_NUMBER);

                editText.setText(String.valueOf(mMatrixLab.getMatrixByName(mMatrixName)[i][j]));

                tableRow.addView(editText);
            }

            tableLayout.addView(tableRow);
        }
        mMatrixCellsLinearLayout.removeAllViews();
        mMatrixCellsLinearLayout.addView(tableLayout);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.rows_amount_btn:
                MatrixSizePickerFragment dialogA = MatrixSizePickerFragment.newInstance(mMatrixName, "rows");
                dialogA.setSelectListener(new OnMatrixSizeSelectListener() {
                    @Override
                    public void onMatrixSizeSelected() {
                        displayMatrixCells();
                    }
                });
                dialogA.show(getSupportFragmentManager(), "DIALOG_MATRIX_SIZE");
                break;

            case R.id.columns_amount_btn:

                MatrixSizePickerFragment dialogB = MatrixSizePickerFragment.newInstance(mMatrixName, "columns");
                dialogB.setSelectListener(new OnMatrixSizeSelectListener() {
                    @Override
                    public void onMatrixSizeSelected() {
                        displayMatrixCells();
                    }
                });
                dialogB.show(getSupportFragmentManager(), "DIALOG_MATRIX_SIZE");
                break;

            case R.id.fill_matrix_with_zero_btn:
                int rows1 = mMatrixLab.getMatrixByName(mMatrixName).length;
                int columns1 = mMatrixLab.getMatrixByName(mMatrixName)[0].length;

                for (int i = 0; i < rows1; i++){
                    for (int j = 0; j < columns1; j++){
                        mEditTexts[i][j].setText("0");
                    }
                }

                break;

            case R.id.save_matrix_btn:

                int rows2 = mMatrixLab.getMatrixByName(mMatrixName).length;
                int columns2 = mMatrixLab.getMatrixByName(mMatrixName)[0].length;

                if (mMatrixName.equals("MatrixA")){
                    for (int i = 0; i < rows2; i++){
                        for (int j = 0; j < columns2; j++){
                            mMatrixLab.getAMatrix()[i][j] = Integer.valueOf(mEditTexts[i][j].getText().toString());
                        }
                    }
                }
                else {
                    for (int i = 0; i < rows2; i++){
                        for (int j = 0; j < columns2; j++){
                            mMatrixLab.getBMatrix()[i][j] = Integer.valueOf(mEditTexts[i][j].getText().toString());
                        }
                    }
                }
                finish();
                break;
        }
    }


}
