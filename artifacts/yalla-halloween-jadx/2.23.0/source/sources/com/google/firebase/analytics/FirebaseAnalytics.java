package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0O0OO0.OooO00o;
import o0O0o0.OooO;
import p281o0O0O0oO.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile FirebaseAnalytics f19790OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzef f19791OooO00o;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.f19791OooO00o = zzefVar;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f19790OooO0O0 == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f19790OooO0O0 == null) {
                    f19790OooO0O0 = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                }
            }
        }
        return f19790OooO0O0;
    }

    @Nullable
    @Keep
    public static zzil getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzef zzefVarZzg = zzef.zzg(context, null, null, null, bundle);
        if (zzefVarZzg == null) {
            return null;
        }
        return new OooO00o(zzefVarZzg);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = com.google.firebase.installations.OooO00o.f20178OooOOO0;
            OooOO0 oooOO0OooO0OO = OooOO0.OooO0OO();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((com.google.firebase.installations.OooO00o) oooOO0OooO0OO.OooO0O0(OooO.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f19791OooO00o.zzH(activity, str, str2);
    }
}
