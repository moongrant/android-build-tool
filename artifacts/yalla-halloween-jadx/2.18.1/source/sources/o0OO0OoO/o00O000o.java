package o0OO0OoO;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzlc;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Bundle f37644Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37645Oooo0oO;

    public o00O000o(zzid zzidVar, Bundle bundle) {
        this.f37645Oooo0oO = zzidVar;
        this.f37644Oooo0o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzid zzidVar = this.f37645Oooo0oO;
        Bundle bundle = this.f37644Oooo0o;
        zzidVar.zzg();
        zzidVar.zza();
        Preconditions.checkNotNull(bundle);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzidVar.f37615OooO00o.zzJ()) {
            Oooo0.OooO00o(zzidVar.f37615OooO00o, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzidVar.f37615OooO00o.zzt().OooO0Oo(new zzac(bundle.getString("app_id"), "", new zzlc(strCheckNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzidVar.f37615OooO00o.zzv().OoooOO0(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
