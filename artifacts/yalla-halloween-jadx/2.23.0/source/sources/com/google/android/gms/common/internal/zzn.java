package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzn {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Uri f15168OooO0o = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f15169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f15170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ComponentName f15171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f15172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f15173OooO0o0;

    public zzn(ComponentName componentName, int i) {
        this.f15169OooO00o = null;
        this.f15170OooO0O0 = null;
        Preconditions.checkNotNull(componentName);
        this.f15171OooO0OO = componentName;
        this.f15172OooO0Oo = i;
        this.f15173OooO0o0 = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.equal(this.f15169OooO00o, zznVar.f15169OooO00o) && Objects.equal(this.f15170OooO0O0, zznVar.f15170OooO0O0) && Objects.equal(this.f15171OooO0OO, zznVar.f15171OooO0OO) && this.f15172OooO0Oo == zznVar.f15172OooO0Oo && this.f15173OooO0o0 == zznVar.f15173OooO0o0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15169OooO00o, this.f15170OooO0O0, this.f15171OooO0OO, Integer.valueOf(this.f15172OooO0Oo), Boolean.valueOf(this.f15173OooO0o0));
    }

    public final String toString() {
        String str = this.f15169OooO00o;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f15171OooO0OO;
        Preconditions.checkNotNull(componentName);
        return componentName.flattenToString();
    }

    public final int zza() {
        return this.f15172OooO0Oo;
    }

    @Nullable
    public final ComponentName zzb() {
        return this.f15171OooO0OO;
    }

    public final Intent zzc(Context context) {
        Bundle bundleCall;
        String str = this.f15169OooO00o;
        if (str == null) {
            return new Intent().setComponent(this.f15171OooO0OO);
        }
        Intent intent = null;
        if (this.f15173OooO0o0) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f15168OooO0o, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent != null ? intent : new Intent(str).setPackage(this.f15170OooO0O0);
    }

    @Nullable
    public final String zzd() {
        return this.f15170OooO0O0;
    }

    public zzn(String str, int i, boolean z) {
        this(str, "com.google.android.gms", i, false);
    }

    public zzn(String str, String str2, int i, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.f15169OooO00o = str;
        Preconditions.checkNotEmpty(str2);
        this.f15170OooO0O0 = str2;
        this.f15171OooO0OO = null;
        this.f15172OooO0Oo = i;
        this.f15173OooO0o0 = z;
    }
}
