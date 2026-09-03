package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o00000OO f2437OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f2438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LocationManager f2439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f2440OooO0OO = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f2441OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f2442OooO0O0;
    }

    @VisibleForTesting
    public o00000OO(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f2438OooO00o = context;
        this.f2439OooO0O0 = locationManager;
    }
}
