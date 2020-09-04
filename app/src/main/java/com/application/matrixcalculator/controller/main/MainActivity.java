package com.application.matrixcalculator.controller.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.matrixcalculator.R;
import com.application.matrixcalculator.controller.matrix.MatrixActivity;
import com.application.matrixcalculator.controller.result.ResultActivity;
import com.application.matrixcalculator.controller.testyourself.TestYourselfActivity;
import com.application.matrixcalculator.model.MatrixLab;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button mFillAMatrixButton;
    private Button mFillBMatrixButton;
    private Button mSumOfAmatrixBmatrix;
    private Button mSubOfAmatrixBmatrix;
    private Button mSubOfBmatrixAmatrix;
    private Button mMultOfAmatrixBmatrix;
    private Button mMultOfBmatrixAmatrix;
    private Button mDeterminantOfAMatrixButton;
    private Button mDeterminantOfBMatrixButton;
    private Button mReverseOfAMatrixButton;
    private Button mReverseOfBMatrixButton;
    private Button mTestYourselfButton;


    private int[][] mAMatrix;
    private int[][] mBMatrix;

    private MatrixLab mMatrixLab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        mMatrixLab = MatrixLab.getInstance();

        mFillAMatrixButton = findViewById(R.id.fill_a_matrix_btn);
        mFillAMatrixButton.setOnClickListener(this);

        mFillBMatrixButton = findViewById(R.id.fill_b_matrix_btn);
        mFillBMatrixButton.setOnClickListener(this);

        mSumOfAmatrixBmatrix = findViewById(R.id.a_sum_b_btn);
        mSumOfAmatrixBmatrix.setOnClickListener(this);

        mSubOfAmatrixBmatrix = findViewById(R.id.a_sub_b_btn);
        mSubOfAmatrixBmatrix.setOnClickListener(this);

        mSubOfBmatrixAmatrix = findViewById(R.id.b_sub_a_btn);
        mSubOfBmatrixAmatrix.setOnClickListener(this);

        mMultOfAmatrixBmatrix = findViewById(R.id.a_mult_b_btn);
        mMultOfAmatrixBmatrix.setOnClickListener(this);

        mMultOfBmatrixAmatrix = findViewById(R.id.b_mult_a_btn);
        mMultOfBmatrixAmatrix.setOnClickListener(this);

        mDeterminantOfAMatrixButton = findViewById(R.id.a_determinant_btn);
        mDeterminantOfAMatrixButton.setOnClickListener(this);

        mDeterminantOfBMatrixButton = findViewById(R.id.b_determinant_btn);
        mDeterminantOfBMatrixButton.setOnClickListener(this);

        mReverseOfAMatrixButton = findViewById(R.id.a_reverse_btn);
        mReverseOfAMatrixButton.setOnClickListener(this);

        mReverseOfBMatrixButton = findViewById(R.id.b_reverse_btn);
        mReverseOfBMatrixButton.setOnClickListener(this);

        mTestYourselfButton = findViewById(R.id.test_yourself_btn);
        mTestYourselfButton.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mSumOfAmatrixBmatrix.setEnabled(mMatrixLab.ifSumOrSubValid());
        mSubOfAmatrixBmatrix.setEnabled(mMatrixLab.ifSumOrSubValid());
        mSubOfBmatrixAmatrix.setEnabled(mMatrixLab.ifSumOrSubValid());
        mMultOfAmatrixBmatrix.setEnabled(mMatrixLab.ifMultiplicationValid());
        mMultOfBmatrixAmatrix.setEnabled(mMatrixLab.ifMultiplicationValid());
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.fill_a_matrix_btn:
                Intent intentA = new Intent(this, MatrixActivity.class);
                intentA.putExtra("Matrix", "MatrixA");
                startActivity(intentA);
                break;

            case R.id.fill_b_matrix_btn:
                Intent intentB = new Intent(this, MatrixActivity.class);
                intentB.putExtra("Matrix", "MatrixB");
                startActivity(intentB);
                break;

            case R.id.a_sum_b_btn:
                mMatrixLab.sum(mMatrixLab.getAMatrix(), mMatrixLab.getBMatrix());
                Intent aSumBIntent = new Intent(this, ResultActivity.class);
                aSumBIntent.putExtra("operation_type", "AsumB");
                startActivity(aSumBIntent);
                break;

            case R.id.a_sub_b_btn:
                mMatrixLab.subtract(mMatrixLab.getAMatrix(), mMatrixLab.getBMatrix());
                Intent aSubBIntent = new Intent(this, ResultActivity.class);
                aSubBIntent.putExtra("operation_type", "AsubB");
                startActivity(aSubBIntent);
                break;

            case R.id.b_sub_a_btn:
                mMatrixLab.subtract(mMatrixLab.getBMatrix(), mMatrixLab.getAMatrix());
                Intent bSubAIntent = new Intent(this, ResultActivity.class);
                bSubAIntent.putExtra("operation_type", "BsubA");
                startActivity(bSubAIntent);
                break;

            case R.id.a_mult_b_btn:
                mMatrixLab.multiplication(mMatrixLab.getAMatrix(), mMatrixLab.getBMatrix());
                Intent aMultBIntent = new Intent(this, ResultActivity.class);
                aMultBIntent.putExtra("operation_type", "AmultB");
                startActivity(aMultBIntent);
                break;

            case R.id.b_mult_a_btn:
                mMatrixLab.multiplication(mMatrixLab.getBMatrix(), mMatrixLab.getAMatrix());
                Intent bMultAIntent = new Intent(this, ResultActivity.class);
                bMultAIntent.putExtra("operation_type", "BmultA");
                startActivity(bMultAIntent);
                break;

            case R.id.a_determinant_btn:
                Intent aMatrixDeterminant = new Intent(this, ResultActivity.class);
                aMatrixDeterminant.putExtra("operation_type", "det(A)");
                startActivity(aMatrixDeterminant);
                break;

            case R.id.b_determinant_btn:
                Intent bMatrixDeterminant = new Intent(this, ResultActivity.class);
                bMatrixDeterminant.putExtra("operation_type", "det(B)");
                startActivity(bMatrixDeterminant);
                break;

            case R.id.a_reverse_btn:
                Intent revAIntent = new Intent(this, ResultActivity.class);
                revAIntent.putExtra("operation_type", "rev(A)");
                startActivity(revAIntent);
                break;

            case R.id.b_reverse_btn:
                Intent revBIntent = new Intent(this, ResultActivity.class);
                revBIntent.putExtra("operation_type", "rev(B)");
                startActivity(revBIntent);
                break;

            case R.id.test_yourself_btn:
                Intent intent = new Intent(getBaseContext(), TestYourselfActivity.class);
                startActivity(intent);
                break;
        }
    }
}
