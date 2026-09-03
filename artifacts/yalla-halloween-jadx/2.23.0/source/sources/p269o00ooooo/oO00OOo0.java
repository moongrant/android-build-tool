package p269o00ooooo;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzlp;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f41298OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41299OooO0o0;

    public oO00OOo0(zzik zzikVar, Bundle bundle) {
        this.f41299OooO0o0 = zzikVar;
        this.f41298OooO0Oo = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f41299OooO0o0;
        zzikVar.zzg();
        zzikVar.zza();
        Bundle bundle = this.f41298OooO0Oo;
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        zzgd zzgdVar = zzikVar.f41276OooO00o;
        if (!zzgdVar.zzJ()) {
            zzgdVar.zzaA().zzj().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlk zzlkVar = new zzlk(bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), string, string2, bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        try {
            zzlp zzlpVarZzv = zzgdVar.zzv();
            bundle.getString("app_id");
            zzau zzauVarOoooO0O = zzlpVarZzv.OoooO0O(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true);
            zzlp zzlpVarZzv2 = zzgdVar.zzv();
            bundle.getString("app_id");
            zzau zzauVarOoooO0O2 = zzlpVarZzv2.OoooO0O(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true);
            zzlp zzlpVarZzv3 = zzgdVar.zzv();
            bundle.getString("app_id");
            zzgdVar.zzt().OooO0Oo(new zzac(bundle.getString("app_id"), string2, zzlkVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzauVarOoooO0O2, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzauVarOoooO0O, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzlpVarZzv3.OoooO0O(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
