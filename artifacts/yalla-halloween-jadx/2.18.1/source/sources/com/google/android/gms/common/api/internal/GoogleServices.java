package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@Deprecated
public final class GoogleServices {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("sLock")
    public static GoogleServices f15247OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f15248OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f15249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Status f15250OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f15251OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f15252OooO0Oo;

    @VisibleForTesting
    @KeepForSdk
    public GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z2 = integer == 0;
            z = integer != 0;
            this.f15252OooO0Oo = z2;
        } else {
            this.f15252OooO0Oo = false;
        }
        this.f15251OooO0OO = z;
        String strZzb = zzag.zzb(context);
        strZzb = strZzb == null ? new StringResourceValueReader(context).getString("google_app_id") : strZzb;
        if (TextUtils.isEmpty(strZzb)) {
            this.f15250OooO0O0 = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f15249OooO00o = null;
        } else {
            this.f15249OooO00o = strZzb;
            this.f15250OooO0O0 = Status.RESULT_SUCCESS;
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public GoogleServices(String str, boolean z) {
        this.f15249OooO00o = str;
        this.f15250OooO0O0 = Status.RESULT_SUCCESS;
        this.f15251OooO0OO = z;
        this.f15252OooO0Oo = !z;
    }

    @KeepForSdk
    public static GoogleServices OooO00o(String str) {
        GoogleServices googleServices;
        synchronized (f15248OooO0o0) {
            googleServices = f15247OooO0o;
            if (googleServices == null) {
                throw new IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return googleServices;
    }

    @Nullable
    @KeepForSdk
    public static String getGoogleAppId() {
        return OooO00o("getGoogleAppId").f15249OooO00o;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (f15248OooO0o0) {
            if (f15247OooO0o == null) {
                f15247OooO0o = new GoogleServices(context);
            }
            status = f15247OooO0o.f15250OooO0O0;
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices googleServicesOooO00o = OooO00o("isMeasurementEnabled");
        return googleServicesOooO00o.f15250OooO0O0.isSuccess() && googleServicesOooO00o.f15251OooO0OO;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return OooO00o("isMeasurementExplicitlyDisabled").f15252OooO0Oo;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context, @NonNull String str, boolean z) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (f15248OooO0o0) {
            try {
                GoogleServices googleServices = f15247OooO0o;
                if (googleServices != null) {
                    String str2 = googleServices.f15249OooO00o;
                    if (str2 == null || str2.equals(str)) {
                        status = Status.RESULT_SUCCESS;
                    } else {
                        status = new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + googleServices.f15249OooO00o + "'.");
                    }
                    return status;
                }
                GoogleServices googleServices2 = new GoogleServices(str, z);
                f15247OooO0o = googleServices2;
                return googleServices2.f15250OooO0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
