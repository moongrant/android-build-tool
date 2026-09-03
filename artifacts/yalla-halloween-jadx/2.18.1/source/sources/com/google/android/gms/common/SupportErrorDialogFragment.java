package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooOo00;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class SupportErrorDialogFragment extends OooOo00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Dialog f15140Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public DialogInterface.OnCancelListener f15141Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public AlertDialog f15142Oooo0oo;

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15141Oooo0oO;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.OooOo00
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f15140Oooo0o;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f15142Oooo0oo == null) {
            this.f15142Oooo0oo = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getContext())).create();
        }
        return this.f15142Oooo0oo;
    }

    @Override // androidx.fragment.app.OooOo00
    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f15140Oooo0o = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f15141Oooo0oO = onCancelListener;
        }
        return supportErrorDialogFragment;
    }
}
