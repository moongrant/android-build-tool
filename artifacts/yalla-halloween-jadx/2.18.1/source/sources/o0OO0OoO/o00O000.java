package o0OO0OoO;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzlc;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Bundle f37637Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37638Oooo0oO;

    public o00O000(zzid zzidVar, Bundle bundle) {
        this.f37638Oooo0oO = zzidVar;
        this.f37637Oooo0o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzid zzidVar = this.f37638Oooo0oO;
        Bundle bundle = this.f37637Oooo0o;
        zzidVar.zzg();
        zzidVar.zza();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        if (!zzidVar.f37615OooO00o.zzJ()) {
            Oooo0.OooO00o(zzidVar.f37615OooO00o, "Conditional property not set since app measurement is disabled");
            return;
        }
        zzlc zzlcVar = new zzlc(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE), string2);
        try {
            zzaw zzawVarOoooOO0 = zzidVar.f37615OooO00o.zzv().OoooOO0(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true);
            zzidVar.f37615OooO00o.zzt().OooO0Oo(new zzac(bundle.getString("app_id"), string2, zzlcVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzidVar.f37615OooO00o.zzv().OoooOO0(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzawVarOoooOO0, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzidVar.f37615OooO00o.zzv().OoooOO0(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
