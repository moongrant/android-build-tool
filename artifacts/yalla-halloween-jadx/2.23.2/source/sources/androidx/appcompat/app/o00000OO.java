package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o00000OO f2435OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f2436OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LocationManager f2437OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f2438OooO0OO = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f2439OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f2440OooO0O0;
    }

    @VisibleForTesting
    public o00000OO(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f2436OooO00o = context;
        this.f2437OooO0O0 = locationManager;
    }
}
