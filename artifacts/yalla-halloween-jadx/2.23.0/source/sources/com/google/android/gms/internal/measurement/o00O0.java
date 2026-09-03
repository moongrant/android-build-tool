package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0 implements o00O00o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("GservicesLoader.class")
    public static o00O0 f15473OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Context f15474OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final oo00o f15475OooO0O0;

    public o00O0() {
        this.f15474OooO00o = null;
        this.f15475OooO0O0 = null;
    }

    public static o00O0 OooO00o(Context context) {
        o00O0 o00o1;
        synchronized (o00O0.class) {
            if (f15473OooO0OO == null) {
                f15473OooO0OO = PermissionChecker.OooO00o(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new o00O0(context) : new o00O0();
            }
            o00o1 = f15473OooO0OO;
        }
        return o00o1;
    }

    public static synchronized void OooO0OO() {
        Context context;
        o00O0 o00o1 = f15473OooO0OO;
        if (o00o1 != null && (context = o00o1.f15474OooO00o) != null && o00o1.f15475OooO0O0 != null) {
            context.getContentResolver().unregisterContentObserver(f15473OooO0OO.f15475OooO0O0);
        }
        f15473OooO0OO = null;
    }

    @Override // com.google.android.gms.internal.measurement.o00O00o0
    @Nullable
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.f15474OooO00o;
        if (context != null && !zzhb.zza(context)) {
            try {
                return (String) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhl
                    @Override // com.google.android.gms.internal.measurement.zzhj
                    public final Object zza() {
                        o00O0 o00o1 = this.zza;
                        return zzha.zza(o00o1.f15474OooO00o.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public o00O0(Context context) {
        this.f15474OooO00o = context;
        oo00o oo00oVar = new oo00o();
        this.f15475OooO0O0 = oo00oVar;
        context.getContentResolver().registerContentObserver(zzha.zza, true, oo00oVar);
    }
}
