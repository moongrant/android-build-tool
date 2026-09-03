package p269o00ooooo;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzlp;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00Oo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f41304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41305OooO0o0;

    public oO00Oo00(zzik zzikVar, Bundle bundle) {
        this.f41305OooO0o0 = zzikVar;
        this.f41304OooO0Oo = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f41305OooO0o0;
        zzikVar.zzg();
        zzikVar.zza();
        Bundle bundle = this.f41304OooO0Oo;
        Preconditions.checkNotNull(bundle);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        zzgd zzgdVar = zzikVar.f41276OooO00o;
        if (!zzgdVar.zzJ()) {
            zzgdVar.zzaA().zzj().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzlk zzlkVar = new zzlk(0L, strCheckNotEmpty, "", null);
        try {
            zzlp zzlpVarZzv = zzgdVar.zzv();
            bundle.getString("app_id");
            zzgdVar.zzt().OooO0Oo(new zzac(bundle.getString("app_id"), "", zzlkVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzlpVarZzv.OoooO0O(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
