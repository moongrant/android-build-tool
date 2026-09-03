package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 implements oo00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("GservicesLoader.class")
    public static o00O0O00 f15007OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Context f15008OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00O0 f15009OooO0O0;

    public o00O0O00() {
        this.f15008OooO00o = null;
        this.f15009OooO0O0 = null;
    }

    public static o00O0O00 OooO00o(Context context) {
        o00O0O00 o00o0o01;
        synchronized (o00O0O00.class) {
            if (f15007OooO0OO == null) {
                f15007OooO0OO = PermissionChecker.OooO00o(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new o00O0O00(context) : new o00O0O00();
            }
            o00o0o01 = f15007OooO0OO;
        }
        return o00o0o01;
    }

    public static synchronized void OooO0OO() {
        Context context;
        o00O0O00 o00o0o01 = f15007OooO0OO;
        if (o00o0o01 != null && (context = o00o0o01.f15008OooO00o) != null && o00o0o01.f15009OooO0O0 != null) {
            context.getContentResolver().unregisterContentObserver(f15007OooO0OO.f15009OooO0O0);
        }
        f15007OooO0OO = null;
    }

    @Override // com.google.android.gms.internal.measurement.oo00o
    @Nullable
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.f15008OooO00o;
        if (context != null && !zzhb.zza(context)) {
            try {
                return (String) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhl
                    @Override // com.google.android.gms.internal.measurement.zzhj
                    public final Object zza() {
                        o00O0O00 o00o0o01 = this.zza;
                        return zzha.zza(o00o0o01.f15008OooO00o.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public o00O0O00(Context context) {
        this.f15008OooO00o = context;
        o00O0 o00o1 = new o00O0();
        this.f15009OooO0O0 = o00o1;
        context.getContentResolver().registerContentObserver(zzha.zza, true, o00o1);
    }
}
