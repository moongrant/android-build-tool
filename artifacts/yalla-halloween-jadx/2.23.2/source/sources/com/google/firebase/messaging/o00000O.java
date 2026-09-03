package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class o00000O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static o00000O f19830OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public String f19831OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Boolean f19832OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Boolean f19833OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque f19834OooO0Oo = new ArrayDeque();

    public static synchronized o00000O OooO00o() {
        if (f19830OooO0o0 == null) {
            f19830OooO0o0 = new o00000O();
        }
        return f19830OooO0o0;
    }

    public final boolean OooO0O0(Context context) {
        if (this.f19833OooO0OO == null) {
            this.f19833OooO0OO = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f19832OooO0O0.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f19833OooO0OO.booleanValue();
    }

    public final boolean OooO0OO(Context context) {
        if (this.f19832OooO0O0 == null) {
            this.f19832OooO0O0 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f19832OooO0O0.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f19832OooO0O0.booleanValue();
    }
}
