package p597o0oo00OO;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo implements LocationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000 f57358OooO00o;

    public o0000Ooo(o0000 o0000Var) {
        this.f57358OooO00o = o0000Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        o0000 o0000Var = this.f57358OooO00o;
        Function2<? super Double, ? super Double, Unit> function2 = o0000Var.f57343OooO0O0;
        if (function2 != null) {
            function2.invoke(Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()));
        }
        if (o0000Var.f57345OooO0Oo) {
            o0000Var.f57343OooO0O0 = null;
            o0000Var.f57346OooO0o0.removeUpdates(o0000Var.f57344OooO0OO);
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(@Nullable String str, int i, @Nullable Bundle bundle) {
    }
}
