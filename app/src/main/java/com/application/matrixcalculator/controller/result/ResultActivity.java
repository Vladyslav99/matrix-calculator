package com.application.matrixcalculator.controller.result;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
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
import com.application.matrixcalculator.controller.operationinfo.MatrixOperationInfoActivity;
import com.application.matrixcalculator.model.MatrixLab;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    private TextView mOperationTextView;

    private MatrixLab mMatrixLab;
    private FrameLayout mMatrixCellsLinearLayout;

    private Button mShowOperationInfoButton;

    private TextView[][] mTextViews;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_result);

        mMatrixLab = MatrixLab.getInstance();

        final String operationType = getIntent().getStringExtra("operation_type");

        mOperationTextView = findViewById(R.id.operation_tv);
        mMatrixCellsLinearLayout = findViewById(R.id.matrix_cells_fl);

        mShowOperationInfoButton = findViewById(R.id.show_operation_info_btn);
        mShowOperationInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MatrixOperationInfoActivity.class);
                intent.putExtra("operation_type", operationType);
                startActivity(intent);
            }
        });

        setResultTitle(operationType);

    }

    public void displayMatrixCells(int[][] matrix){

        int rows = matrix.length;
        int columns = matrix.length;


        TableLayout tableLayout = new TableLayout(this);

        mTextViews = new TextView[rows][columns];

        for (int i = 0; i < rows; i++){
            TableRow tableRow = new TableRow(this);

            for (int j = 0; j < columns; j++){
                TextView textView = new TextView(this);
                mTextViews[i][j] = textView;

                TableRow.LayoutParams param = new TableRow.LayoutParams(
                        0,
                        TableRow.LayoutParams.WRAP_CONTENT,
                        1.0f
                );
                param.width = 0;

                textView.setLayoutParams(param);
                textView.setTextSize(30.0f);
                textView.setGravity(Gravity.CENTER);
                textView.setPadding(5, 5, 5, 5);
                textView.setInputType(InputType.TYPE_CLASS_NUMBER);
                textView.setText(String.valueOf(matrix[i][j]));
                tableRow.addView(textView);
            }

            tableLayout.addView(tableRow);
        }
        mMatrixCellsLinearLayout.removeAllViews();
        mMatrixCellsLinearLayout.addView(tableLayout);

    }

    public void displayMatrixCells(float[][] matrix){

        int rows = matrix.length;
        int columns = matrix.length;


        TableLayout tableLayout = new TableLayout(this);

        mTextViews = new TextView[rows][columns];

        for (int i = 0; i < rows; i++){
            TableRow tableRow = new TableRow(this);

            for (int j = 0; j < columns; j++){
                TextView textView = new TextView(this);
                mTextViews[i][j] = textView;

                TableRow.LayoutParams param = new TableRow.LayoutParams(
                        0,
                        TableRow.LayoutParams.WRAP_CONTENT,
                        1.0f
                );
                param.width = 0;

                textView.setLayoutParams(param);
                textView.setTextSize(25.0f);
                textView.setGravity(Gravity.CENTER);
                textView.setPadding(5, 5, 5, 5);
                textView.setInputType(InputType.TYPE_CLASS_NUMBER);
                DecimalFormat df = new DecimalFormat("###.###");
                textView.setText(df.format(matrix[i][j]));
                tableRow.addView(textView);
            }

            tableLayout.addView(tableRow);
        }
        mMatrixCellsLinearLayout.removeAllViews();
        mMatrixCellsLinearLayout.addView(tableLayout);

    }

    private void setResultTitle(String operationType){
        switch (operationType){
            case "AsumB":
                mOperationTextView.setText(getString(R.string.a_sum_b));
                displayMatrixCells(mMatrixLab.getResultMatrix());
                break;

            case "AsubB":
                mOperationTextView.setText(getString(R.string.a_sub_b));
                displayMatrixCells(mMatrixLab.getResultMatrix());
                break;

            case "BsubA":
                mOperationTextView.setText(getString(R.string.b_sub_a));
                displayMatrixCells(mMatrixLab.getResultMatrix());
                break;

            case "AmultB":
                mOperationTextView.setText(getString(R.string.a_mult_b));
                displayMatrixCells(mMatrixLab.getResultMatrix());
                break;

            case "BmultA":
                mOperationTextView.setText(getString(R.string.b_mult_a));
                displayMatrixCells(mMatrixLab.getResultMatrix());
                break;

            case "det(A)":
                mOperationTextView.setText(getString(R.string.a_determinant) +
                        " is " +
                        String.valueOf(mMatrixLab.determinantOfMatrix(mMatrixLab.getAMatrix(), mMatrixLab.getAMatrix().length)));
                displayMatrixCells(mMatrixLab.getAMatrix());
                break;

            case "det(B)":
                mOperationTextView.setText(getString(R.string.b_determinant)+
                        " is " +
                        String.valueOf(mMatrixLab.determinantOfMatrix(mMatrixLab.getBMatrix(), mMatrixLab.getBMatrix().length)));
                displayMatrixCells(mMatrixLab.getBMatrix());
                break;

            case "rev(A)":
                if (mMatrixLab.inverse(mMatrixLab.getAMatrix())){
                    mOperationTextView.setText(getString(R.string.a_rev));
                    displayMatrixCells(mMatrixLab.getReverseMatrix());
                }
                else {
                    mOperationTextView.setText("Determinant == 0, inverse matrix does not exist");
                }
                break;

            case "rev(B)":

                if (mMatrixLab.inverse(mMatrixLab.getBMatrix())){
                    mOperationTextView.setText(getString(R.string.b_rev));
                    displayMatrixCells(mMatrixLab.getReverseMatrix());
                }
                else {
                    mOperationTextView.setText("Determinant == 0, inverse matrix does not exist");
                }
                break;
        }
    }
}
