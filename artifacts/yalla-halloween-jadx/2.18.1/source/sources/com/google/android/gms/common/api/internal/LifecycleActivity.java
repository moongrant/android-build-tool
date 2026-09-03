package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class LifecycleActivity {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Activity f15253OooO00o;

    public LifecycleActivity(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.f15253OooO00o = activity;
    }

    @NonNull
    public final Activity zza() {
        return this.f15253OooO00o;
    }

    @NonNull
    public final FragmentActivity zzb() {
        return (FragmentActivity) this.f15253OooO00o;
    }

    public final boolean zzc() {
        return this.f15253OooO00o instanceof Activity;
    }

    public final boolean zzd() {
        return this.f15253OooO00o instanceof FragmentActivity;
    }

    @KeepForSdk
    public LifecycleActivity(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
