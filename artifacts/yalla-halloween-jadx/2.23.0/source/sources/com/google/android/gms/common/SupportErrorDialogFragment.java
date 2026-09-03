package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooOo;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class SupportErrorDialogFragment extends OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Dialog f14639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public AlertDialog f14640OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f14641OooO0o0;

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // androidx.fragment.app.OooOo, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14641OooO0o0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.OooOo
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f14639OooO0Oo;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f14640OooO0o == null) {
            this.f14640OooO0o = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getContext())).create();
        }
        return this.f14640OooO0o;
    }

    @Override // androidx.fragment.app.OooOo
    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f14639OooO0Oo = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f14641OooO0o0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }
}
