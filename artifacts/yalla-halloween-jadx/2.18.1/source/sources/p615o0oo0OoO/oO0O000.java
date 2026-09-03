package p615o0oo0OoO;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f48386OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function2<? super Double, ? super Double, Unit> f48387OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public OooO00o f48388OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f48389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final LocationManager f48390OooO0o0;

    public static final class OooO00o implements LocationListener {
        public OooO00o() {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            oO0O000 oo0o000 = oO0O000.this;
            Function2<? super Double, ? super Double, Unit> function2 = oo0o000.f48387OooO0O0;
            if (function2 != null) {
                function2.invoke(Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()));
            }
            if (oo0o000.f48389OooO0Oo) {
                oo0o000.f48387OooO0O0 = null;
                oo0o000.f48390OooO0o0.removeUpdates(oo0o000.f48388OooO0OO);
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(@Nullable String str, int i, @Nullable Bundle bundle) {
        }
    }

    public oO0O000(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48386OooO00o = context;
        this.f48388OooO0OO = new OooO00o();
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.f48390OooO0o0 = (LocationManager) systemService;
    }
}
