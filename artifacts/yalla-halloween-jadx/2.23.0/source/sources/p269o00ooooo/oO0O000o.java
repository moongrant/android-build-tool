package p269o00ooooo;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zziz;
import com.google.android.gms.measurement.internal.zzkp;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(14)
@MainThread
@VisibleForTesting
public final class oO0O000o implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzik f41326OooO0Oo;

    public oO0O000o(zzik zzikVar) {
        this.f41326OooO0Oo = zzikVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzgd zzgdVar;
        Uri uri;
        zzik zzikVar = this.f41326OooO0Oo;
        try {
            try {
                zzikVar.f41276OooO00o.zzaA().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzgdVar = zzikVar.f41276OooO00o;
                } else {
                    zzpb.zzc();
                    Uri data = null;
                    if (zzikVar.f41276OooO00o.zzf().zzs(null, zzeg.zzaF)) {
                        Uri data2 = intent.getData();
                        if (data2 == null || !data2.isHierarchical()) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                String string = extras.getString("com.android.vending.referral_url");
                                if (!TextUtils.isEmpty(string)) {
                                    data = Uri.parse(string);
                                }
                            }
                        } else {
                            uri = data2;
                        }
                        if (uri == null && uri.isHierarchical()) {
                            zzikVar.f41276OooO00o.zzv();
                            String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            zzikVar.f41276OooO00o.zzaB().zzp(new oO0O000(this, bundle == null, uri, ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO, uri.getQueryParameter("referrer")));
                            zzgdVar = zzikVar.f41276OooO00o;
                        } else {
                            zzgdVar = zzikVar.f41276OooO00o;
                        }
                    } else {
                        data = intent.getData();
                    }
                    uri = data;
                    if (uri == null) {
                        zzgdVar = zzikVar.f41276OooO00o;
                    } else {
                        zzgdVar = zzikVar.f41276OooO00o;
                    }
                }
            } catch (RuntimeException e) {
                zzikVar.f41276OooO00o.zzaA().zzd().zzb("Throwable caught in onActivityCreated", e);
                zzgdVar = zzikVar.f41276OooO00o;
            }
            zziz zzizVarZzs = zzgdVar.zzs();
        } finally {
            zzikVar.f41276OooO00o.zzs().zzr(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f41326OooO0Oo.f41276OooO00o.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        zzik zzikVar = this.f41326OooO0Oo;
        zzikVar.f41276OooO00o.zzs().zzt(activity);
        zzkp zzkpVarZzu = zzikVar.f41276OooO00o.zzu();
        zzkpVarZzu.f41276OooO00o.zzaB().zzp(new oOO0OOO(zzkpVarZzu, zzkpVarZzu.f41276OooO00o.zzax().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzik zzikVar = this.f41326OooO0Oo;
        zzkp zzkpVarZzu = zzikVar.f41276OooO00o.zzu();
        zzkpVarZzu.f41276OooO00o.zzaB().zzp(new oOO0OO(zzkpVarZzu, zzkpVarZzu.f41276OooO00o.zzax().elapsedRealtime()));
        zzikVar.f41276OooO00o.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f41326OooO0Oo.f41276OooO00o.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
