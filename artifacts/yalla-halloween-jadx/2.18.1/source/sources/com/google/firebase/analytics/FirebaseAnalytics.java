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
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.OooO00o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p353o0OOOOoo.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile FirebaseAnalytics f18790OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzee f18791OooO00o;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f18791OooO00o = zzeeVar;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f18790OooO0O0 == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f18790OooO0O0 == null) {
                    f18790OooO0O0 = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                }
            }
        }
        return f18790OooO0O0;
    }

    @Nullable
    @Keep
    public static zzie getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzee zzeeVarZzg = zzee.zzg(context, null, null, null, bundle);
        if (zzeeVarZzg == null) {
            return null;
        }
        return new OooOOO(zzeeVarZzg);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(OooO00o.OooO0o0().getId(), 30000L, TimeUnit.MILLISECONDS);
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
        this.f18791OooO00o.zzG(activity, str, str2);
    }
}
