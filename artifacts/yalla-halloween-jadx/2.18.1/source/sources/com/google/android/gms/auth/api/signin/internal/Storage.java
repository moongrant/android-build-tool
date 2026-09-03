package com.google.android.gms.auth.api.signin.internal;

import Oooo000.o00O0O;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class Storage {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ReentrantLock f15066OooO0OO = new ReentrantLock();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("sLk")
    public static Storage f15067OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ReentrantLock f15068OooO00o = new ReentrantLock();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLk")
    public final SharedPreferences f15069OooO0O0;

    @VisibleForTesting
    public Storage(Context context) {
        this.f15069OooO0O0 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static final String OooO0Oo(String str, String str2) {
        return o00O0O.OooO0O0(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, CertificateUtil.DELIMITER, str2);
    }

    @NonNull
    @KeepForSdk
    public static Storage getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        f15066OooO0OO.lock();
        try {
            if (f15067OooO0Oo == null) {
                f15067OooO0Oo = new Storage(context.getApplicationContext());
            }
            return f15067OooO0Oo;
        } finally {
            f15066OooO0OO.unlock();
        }
    }

    @Nullable
    public final String OooO00o(@NonNull String str) {
        this.f15068OooO00o.lock();
        try {
            return this.f15069OooO0O0.getString(str, null);
        } finally {
            this.f15068OooO00o.unlock();
        }
    }

    public final void OooO0O0(@NonNull String str) {
        this.f15068OooO00o.lock();
        try {
            this.f15069OooO0O0.edit().remove(str).apply();
        } finally {
            this.f15068OooO00o.unlock();
        }
    }

    public final void OooO0OO(@NonNull String str, @NonNull String str2) {
        this.f15068OooO00o.lock();
        try {
            this.f15069OooO0O0.edit().putString(str, str2).apply();
        } finally {
            this.f15068OooO00o.unlock();
        }
    }

    @KeepForSdk
    public void clear() {
        this.f15068OooO00o.lock();
        try {
            this.f15069OooO0O0.edit().clear().apply();
        } finally {
            this.f15068OooO00o.unlock();
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String strOooO00o;
        String strOooO00o2 = OooO00o("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strOooO00o2) || (strOooO00o = OooO00o(OooO0Oo("googleSignInAccount", strOooO00o2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.zab(strOooO00o);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String strOooO00o;
        String strOooO00o2 = OooO00o("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strOooO00o2) || (strOooO00o = OooO00o(OooO0Oo("googleSignInOptions", strOooO00o2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.zab(strOooO00o);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    public String getSavedRefreshToken() {
        return OooO00o("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        OooO0OO("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strZac = googleSignInAccount.zac();
        OooO0OO(OooO0Oo("googleSignInAccount", strZac), googleSignInAccount.zad());
        OooO0OO(OooO0Oo("googleSignInOptions", strZac), googleSignInOptions.zaf());
    }

    public final void zac() {
        String strOooO00o = OooO00o("defaultGoogleSignInAccount");
        OooO0O0("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strOooO00o)) {
            return;
        }
        OooO0O0(OooO0Oo("googleSignInAccount", strOooO00o));
        OooO0O0(OooO0Oo("googleSignInOptions", strOooO00o));
    }
}
