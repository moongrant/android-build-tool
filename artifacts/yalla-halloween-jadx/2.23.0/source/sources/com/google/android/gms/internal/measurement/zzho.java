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

/* JADX INFO: loaded from: classes3.dex */
public final class zzho {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile zzii f15717OooO00o;

    public static zzii zza(Context context) {
        zzii zziiVar;
        zzii zziiVarZzc;
        zzii zziiVarZzc2;
        synchronized (zzho.class) {
            zziiVar = f15717OooO00o;
            if (zziiVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    if (zzhb.zzb() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            zziiVarZzc = file.exists() ? zzii.zzd(file) : zzii.zzc();
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            zziiVarZzc = zzii.zzc();
                        }
                        if (zziiVarZzc.zzb()) {
                            Object objZza = zziiVarZzc.zza();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objZza)));
                                try {
                                    p188o00o0O.Oooo000 oooo000 = new p188o00o0O.Oooo000();
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
                                            if (!oooo000.containsKey(str3)) {
                                                oooo000.put(str3, new p188o00o0O.Oooo000());
                                            }
                                            ((p188o00o0O.Oooo000) oooo000.getOrDefault(str3, null)).put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + objZza.toString() + " for Android package " + context.getPackageName());
                                    zzhh zzhhVar = new zzhh(oooo000);
                                    bufferedReader.close();
                                    zziiVarZzc2 = zzii.zzd(zzhhVar);
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
                            zziiVarZzc2 = zzii.zzc();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    zziiVarZzc2 = zzii.zzc();
                }
                zziiVar = zziiVarZzc2;
                f15717OooO00o = zziiVar;
            }
        }
        return zziiVar;
    }
}
