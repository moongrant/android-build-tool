package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class Wrappers {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Wrappers f14819OooO0O0 = new Wrappers();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public PackageManagerWrapper f14820OooO00o = null;

    @NonNull
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@NonNull Context context) {
        return f14819OooO0O0.zza(context);
    }

    @NonNull
    @VisibleForTesting
    public final synchronized PackageManagerWrapper zza(@NonNull Context context) {
        if (this.f14820OooO00o == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f14820OooO00o = new PackageManagerWrapper(context);
        }
        return this.f14820OooO00o;
    }
}
