package com.material.naveen.materialdesigntutorial.mdt.base;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.material.naveen.materialdesigntutorial.mdt.R;


/**
 * Created by Venkat 26/7/16.
 */
public class BaseActivity extends AppCompatActivity {


    ProgressDialog progressDialog;
    AlertDialog dia;

    /**
     * @param target
     * @return Email verification
     */
    public static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public final static boolean ispasswordmatch(CharSequence password, CharSequence repassword) {
        return password.equals(repassword);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        progressDialog = new ProgressDialog(BaseActivity.this);
    }

    //show progress dialog with title and message
    public void showProgressDialog(String title, String message, boolean isCancellable) {

        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(isCancellable);
        progressDialog.show();

    }

    //show progress dialog with message only
    public void showProgressDialog(String message, boolean isCancellable) {

        progressDialog.setMessage(message);
        progressDialog.setCancelable(isCancellable);
        progressDialog.show();

    }

    //progress dialog dismiss
    public void progressDialogDismiss() {
        if (progressDialog != null) {
            if (progressDialog.isShowing()) progressDialog.dismiss();
        }

    }

    //displaying toast
    public void showToast(String message) {
        Toast.makeText(BaseActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    // normal alert dialog
    public void showAlert(String title, String message) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(BaseActivity.this);
        builder1.setTitle(title);
        builder1.setMessage(message);

        builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });


        builder1.show();
    }

    public AlertDialog.Builder showAlert(String title, String message, Boolean action) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(BaseActivity.this);
        builder1.setTitle(title);
        builder1.setMessage(message);
        builder1.setCancelable(action);
        return builder1;

    }

    /**
     * upload progress dialog dismiss
     */
    public void alertDismiss() {
        if (dia != null) {
            if (dia.isShowing()) {
                dia.dismiss();
            }
        }
    }


    //displaying activity_snackbar
    public void snack(String message) {

        Snackbar.make(findViewById(R.id.snack), message, Snackbar.LENGTH_SHORT).show();

    }

    //print Log.d
    public void logD(String logMessage) {
        Log.d("BaseActivityLog", logMessage);
    }


}