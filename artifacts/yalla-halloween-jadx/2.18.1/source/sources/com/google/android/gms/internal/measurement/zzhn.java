package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhn {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("CachingReader.class")
    public static volatile zzif f15950OooO00o;

    public static zzif zza(Context context) {
        zzif zzifVar;
        zzif zzifVarZzc;
        zzif zzifVarZzc2;
        synchronized (zzhn.class) {
            zzifVar = f15950OooO00o;
            if (zzifVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    if (zzha.zzb() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            zzifVarZzc = file.exists() ? zzif.zzd(file) : zzif.zzc();
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            zzifVarZzc = zzif.zzc();
                        }
                        if (zzifVarZzc.zzb()) {
                            File file2 = (File) zzifVarZzc.zza();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    o00oO0o o00oo0o2 = new o00oO0o();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(ZegoConstants.ZegoVideoDataAuxPublishingStream, 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", "Invalid: " + line);
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            if (!o00oo0o2.containsKey(str3)) {
                                                o00oo0o2.put(str3, new o00oO0o());
                                            }
                                            ((o00oO0o) o00oo0o2.getOrDefault(str3, null)).put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                    zzhg zzhgVar = new zzhg(o00oo0o2);
                                    bufferedReader.close();
                                    zzifVarZzc2 = zzif.zzd(zzhgVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        } catch (Exception unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            zzifVarZzc2 = zzif.zzc();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    zzifVarZzc2 = zzif.zzc();
                }
                zzifVar = zzifVarZzc2;
                f15950OooO00o = zzifVar;
            }
        }
        return zzifVar;
    }
}
