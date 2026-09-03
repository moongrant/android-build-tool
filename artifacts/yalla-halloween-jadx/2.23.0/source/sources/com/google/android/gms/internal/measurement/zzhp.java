package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import io.agora.rtc.Constants;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhp {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile zzii f15718OooO00o = zzii.zzc();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f15719OooO0O0 = new Object();

    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x0035, B:14:0x003d, B:15:0x0049, B:17:0x004b, B:19:0x0057, B:23:0x0067, B:25:0x006d, B:32:0x0088, B:33:0x0092, B:27:0x0077, B:28:0x007b, B:29:0x0081), top: B:40:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f15718OooO00o.zzb()) {
            return ((Boolean) f15718OooO00o.zza()).booleanValue();
        }
        synchronized (f15719OooO0O0) {
            if (f15718OooO00o.zzb()) {
                return ((Boolean) f15718OooO00o.zza()).booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : SQLiteDatabase.CREATE_IF_NECESSARY);
                if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & Constants.ERR_WATERMARK_READ) != 0) {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } else if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & Constants.ERR_WATERMARK_READ) != 0) {
                z = true;
            }
            f15718OooO00o = zzii.zzd(Boolean.valueOf(z));
            return ((Boolean) f15718OooO00o.zza()).booleanValue();
        }
    }
}
