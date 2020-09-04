package com.application.matrixcalculator.controller.operationinfo;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.matrixcalculator.R;
import com.application.matrixcalculator.model.OperationInfoHTML;

public class MatrixOperationInfoActivity extends AppCompatActivity {

    private WebView mOperationInfoWebView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String operationType = getIntent().getStringExtra("operation_type");

        mOperationInfoWebView = findViewById(R.id.operation_info_wv);

        switch (operationType){
            case "AsumB":
            case "AsubB":
            case "BsubA":
                mOperationInfoWebView.loadData(OperationInfoHTML.ADD_AND_SUB_HTML, "text/html", "UTF-8");
                break;

            case "AmultB":
            case "BmultA":
                mOperationInfoWebView.loadData(OperationInfoHTML.MULTIPLICATION_HTML, "text/html", "UTF-8");
                break;

            case "det(A)":
            case "det(B)":
                mOperationInfoWebView.loadData(OperationInfoHTML.DETERMINANT_HTML, "text/html", "UTF-8");
                break;

            case "rev(A)":
            case "rev(B)":
                mOperationInfoWebView.loadData(OperationInfoHTML.INVERSE_HTML, "text/html", "UTF-8");
                break;
        }

    }
}
