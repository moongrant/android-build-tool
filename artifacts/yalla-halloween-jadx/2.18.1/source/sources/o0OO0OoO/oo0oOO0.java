package o0OO0OoO;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzis;
import com.google.android.gms.measurement.internal.zzki;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(14)
@MainThread
public final class oo0oOO0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzid f37905Oooo0o;

    public /* synthetic */ oo0oOO0(zzid zzidVar) {
        this.f37905Oooo0o = zzidVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzfy zzfyVar;
        Uri data;
        try {
            try {
                this.f37905Oooo0o.f37615OooO00o.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null || (data = intent.getData()) == null || !data.isHierarchical()) {
                    zzfyVar = this.f37905Oooo0o.f37615OooO00o;
                } else {
                    this.f37905Oooo0o.f37615OooO00o.zzv();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z = false;
                    }
                    this.f37905Oooo0o.f37615OooO00o.zzaz().zzp(new o00O0OOO(this, z, data, str, queryParameter));
                    zzfyVar = this.f37905Oooo0o.f37615OooO00o;
                }
            } catch (RuntimeException e) {
                this.f37905Oooo0o.f37615OooO00o.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
                zzfyVar = this.f37905Oooo0o.f37615OooO00o;
            }
            zzis zzisVarZzs = zzfyVar.zzs();
        } finally {
            this.f37905Oooo0o.f37615OooO00o.zzs().zzr(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f37905Oooo0o.f37615OooO00o.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f37905Oooo0o.f37615OooO00o.zzs().zzt(activity);
        zzki zzkiVarZzu = this.f37905Oooo0o.f37615OooO00o.zzu();
        zzkiVarZzu.f37615OooO00o.zzaz().zzp(new o0O00oO0(zzkiVarZzu, zzkiVarZzu.f37615OooO00o.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzki zzkiVarZzu = this.f37905Oooo0o.f37615OooO00o.zzu();
        zzkiVarZzu.f37615OooO00o.zzaz().zzp(new o0O00o00(zzkiVarZzu, zzkiVarZzu.f37615OooO00o.zzav().elapsedRealtime()));
        this.f37905Oooo0o.f37615OooO00o.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f37905Oooo0o.f37615OooO00o.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
