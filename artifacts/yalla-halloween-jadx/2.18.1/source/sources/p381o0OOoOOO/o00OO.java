package p381o0OOoOOO;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class o00OO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static o00OO f38768OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public String f38769OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Boolean f38770OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Boolean f38771OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Queue<Intent> f38772OooO0Oo = new ArrayDeque();

    public static synchronized o00OO OooO00o() {
        if (f38768OooO0o0 == null) {
            f38768OooO0o0 = new o00OO();
        }
        return f38768OooO0o0;
    }

    public final boolean OooO0O0(Context context) {
        if (this.f38771OooO0OO == null) {
            this.f38771OooO0OO = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f38770OooO0O0.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f38771OooO0OO.booleanValue();
    }

    public final boolean OooO0OO(Context context) {
        if (this.f38770OooO0O0 == null) {
            this.f38770OooO0O0 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f38770OooO0O0.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f38770OooO0O0.booleanValue();
    }
}
