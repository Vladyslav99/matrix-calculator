package com.application.matrixcalculator.controller.matrix;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.application.matrixcalculator.R;
import com.application.matrixcalculator.model.MatrixLab;

public class MatrixSizePickerFragment extends DialogFragment {

    private RadioGroup mRadioGroup;
    private RadioButton mOneRadioButton;
    private RadioButton mTwoRadioButton;
    private RadioButton mThreeRadioButton;
    private RadioButton mFourRadioButton;

    private MatrixActivity.OnMatrixSizeSelectListener mSelectListener;

    public static MatrixSizePickerFragment newInstance(String matrixName, String sizeType){
        Bundle args = new Bundle();
        args.putString("matrix_name", matrixName);
        args.putString("size_type", sizeType);
        MatrixSizePickerFragment fragment = new MatrixSizePickerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_dialog, null);

        final String matrixName = getArguments().getString("matrix_name");
        final String sizeType = getArguments().getString("size_type");


        final MatrixLab matrixLab = MatrixLab.getInstance();

        mOneRadioButton = view.findViewById(R.id.one_size_rb);
        mTwoRadioButton = view.findViewById(R.id.two_size_rb);
        mThreeRadioButton = view.findViewById(R.id.three_size_rb);
        mFourRadioButton = view.findViewById(R.id.four_size_rb);

        int size;

        if (sizeType.equals("rows")){
            size = matrixLab.getMatrixByName(matrixName).length;
        }
        else {
            size = matrixLab.getMatrixByName(matrixName)[0].length;
        }

        switch (size){
            case 1:
                mOneRadioButton.setChecked(true);
                break;

            case 2:
                mTwoRadioButton.setChecked(true);
                break;

            case 3:
                mThreeRadioButton.setChecked(true);
                break;

            case 4:
                mFourRadioButton.setChecked(true);
                break;
        }

        mRadioGroup = view.findViewById(R.id.size_rg);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.one_size_rb:
                        matrixLab.resizeMatrix(matrixName, sizeType, 1);
                        mSelectListener.onMatrixSizeSelected();
                        dismiss();
                        break;

                    case R.id.two_size_rb:
                        matrixLab.resizeMatrix(matrixName, sizeType, 2);
                        mSelectListener.onMatrixSizeSelected();
                        dismiss();
                        break;

                    case R.id.three_size_rb:
                        matrixLab.resizeMatrix(matrixName, sizeType, 3);
                        mSelectListener.onMatrixSizeSelected();
                        dismiss();
                        break;

                    case R.id.four_size_rb:
                        matrixLab.resizeMatrix(matrixName, sizeType, 4);
                        mSelectListener.onMatrixSizeSelected();
                        dismiss();
                        break;
                }
            }
        });

        return new AlertDialog.Builder(getActivity())
                .setView(view)
                .create();
    }

    public void setSelectListener(MatrixActivity.OnMatrixSizeSelectListener listener){
        mSelectListener = listener;
    }
}
