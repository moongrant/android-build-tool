package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import io.agora.rtc.Constants;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class zzho {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile zzif f15951OooO00o = zzif.zzc();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f15952OooO0O0 = new Object();

    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f15951OooO00o.zzb()) {
            return ((Boolean) f15951OooO00o.zza()).booleanValue();
        }
        synchronized (f15952OooO0O0) {
            if (f15951OooO00o.zzb()) {
                return ((Boolean) f15951OooO00o.zza()).booleanValue();
            }
            try {
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : SQLiteDatabase.CREATE_IF_NECESSARY);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    f15951OooO00o = zzif.zzd(Boolean.valueOf(z));
                    return ((Boolean) f15951OooO00o.zza()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & Constants.ERR_WATERMARK_READ) != 0) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            f15951OooO00o = zzif.zzd(Boolean.valueOf(z));
            return ((Boolean) f15951OooO00o.zza()).booleanValue();
        }
    }
}
