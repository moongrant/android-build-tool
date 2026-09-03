package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import p257o00ooOOo.o0OO;
import p257o00ooOOo.o0OO0oO0;
import p257o00ooOOo.o0OOO00;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @Nullable Intent intent, int i) {
        return new o0OO0oO0(activity, intent, i);
    }

    public static zag zac(@NonNull Fragment fragment, @Nullable Intent intent, int i) {
        return new o0OO(fragment, intent, i);
    }

    public static zag zad(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i) {
        return new o0OOO00(lifecycleFragment, intent);
    }

    public abstract void OooO00o();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            OooO00o();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
