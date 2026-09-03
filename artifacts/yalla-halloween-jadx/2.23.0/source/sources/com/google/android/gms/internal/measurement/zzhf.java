package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhf implements o00O00o0 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("ConfigurationContentLoader.class")
    public static final p188o00o0O.OooOO0 f15708OooO0oo = new p188o00o0O.OooOO0();
    public static final String[] zza = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ContentResolver f15709OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Uri f15710OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Runnable f15711OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00OO f15712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Map f15713OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f15714OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayList f15715OooO0oO;

    public zzhf(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        o00O00OO o00o00oo2 = new o00O00OO(this);
        this.f15712OooO0Oo = o00o00oo2;
        this.f15714OooO0o0 = new Object();
        this.f15715OooO0oO = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f15709OooO00o = contentResolver;
        this.f15710OooO0O0 = uri;
        this.f15711OooO0OO = runnable;
        contentResolver.registerContentObserver(uri, false, o00o00oo2);
    }

    public static synchronized void OooO00o() {
        for (zzhf zzhfVar : (o00o0O.OooOO0.OooO) f15708OooO0oo.values()) {
            zzhfVar.f15709OooO00o.unregisterContentObserver(zzhfVar.f15712OooO0Oo);
        }
        f15708OooO0oo.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzhf zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzhf zzhfVar;
        synchronized (zzhf.class) {
            p188o00o0O.OooOO0 oooOO1 = f15708OooO0oo;
            zzhfVar = (zzhf) oooOO1.getOrDefault(uri, null);
            if (zzhfVar == null) {
                try {
                    zzhf zzhfVar2 = new zzhf(contentResolver, uri, runnable);
                    try {
                        oooOO1.put(uri, zzhfVar2);
                    } catch (SecurityException unused) {
                    }
                    zzhfVar = zzhfVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzhfVar;
    }

    @Override // com.google.android.gms.internal.measurement.o00O00o0
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzc().get(str);
    }

    public final Map zzc() {
        Map map;
        Map map2 = this.f15713OooO0o;
        if (map2 == null) {
            synchronized (this.f15714OooO0o0) {
                map2 = this.f15713OooO0o;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhd
                                @Override // com.google.android.gms.internal.measurement.zzhj
                                public final Object zza() {
                                    zzhf zzhfVar = this.zza;
                                    Cursor cursorQuery = zzhfVar.f15709OooO00o.query(zzhfVar.f15710OooO0O0, zzhf.zza, null, null, null);
                                    if (cursorQuery == null) {
                                        return Collections.emptyMap();
                                    }
                                    try {
                                        int count = cursorQuery.getCount();
                                        if (count == 0) {
                                            return Collections.emptyMap();
                                        }
                                        Map oooOO1 = count <= 256 ? new p188o00o0O.OooOO0(count) : new HashMap(count, 1.0f);
                                        while (cursorQuery.moveToNext()) {
                                            oooOO1.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                        }
                                        return oooOO1;
                                    } finally {
                                        cursorQuery.close();
                                    }
                                }
                            });
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f15713OooO0o = map;
                        map2 = map;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final void zzf() {
        synchronized (this.f15714OooO0o0) {
            this.f15713OooO0o = null;
            this.f15711OooO0OO.run();
        }
        synchronized (this) {
            Iterator it = this.f15715OooO0oO.iterator();
            while (it.hasNext()) {
                ((zzhg) it.next()).zza();
            }
        }
    }
}
