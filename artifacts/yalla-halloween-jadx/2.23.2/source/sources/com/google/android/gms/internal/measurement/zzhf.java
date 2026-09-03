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
public final class zzhf implements oo00o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("ConfigurationContentLoader.class")
    public static final p190o00o0O.OooO f15232OooO0oo = new p190o00o0O.OooO();
    public static final String[] zza = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ContentResolver f15233OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Uri f15234OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Runnable f15235OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00o0 f15236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Map f15237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f15238OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayList f15239OooO0oO;

    public zzhf(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        o00O00o0 o00o00o1 = new o00O00o0(this);
        this.f15236OooO0Oo = o00o00o1;
        this.f15238OooO0o0 = new Object();
        this.f15239OooO0oO = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f15233OooO00o = contentResolver;
        this.f15234OooO0O0 = uri;
        this.f15235OooO0OO = runnable;
        contentResolver.registerContentObserver(uri, false, o00o00o1);
    }

    public static synchronized void OooO00o() {
        for (zzhf zzhfVar : (p190o00o0O.OooO.C0432OooO) f15232OooO0oo.values()) {
            zzhfVar.f15233OooO00o.unregisterContentObserver(zzhfVar.f15236OooO0Oo);
        }
        f15232OooO0oo.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzhf zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzhf zzhfVar;
        synchronized (zzhf.class) {
            p190o00o0O.OooO oooO = f15232OooO0oo;
            zzhfVar = (zzhf) oooO.getOrDefault(uri, null);
            if (zzhfVar == null) {
                try {
                    zzhf zzhfVar2 = new zzhf(contentResolver, uri, runnable);
                    try {
                        oooO.put(uri, zzhfVar2);
                    } catch (SecurityException unused) {
                    }
                    zzhfVar = zzhfVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzhfVar;
    }

    @Override // com.google.android.gms.internal.measurement.oo00o
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzc().get(str);
    }

    public final Map zzc() {
        Map map;
        Map map2 = this.f15237OooO0o;
        if (map2 == null) {
            synchronized (this.f15238OooO0o0) {
                map2 = this.f15237OooO0o;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhd
                                @Override // com.google.android.gms.internal.measurement.zzhj
                                public final Object zza() {
                                    zzhf zzhfVar = this.zza;
                                    Cursor cursorQuery = zzhfVar.f15233OooO00o.query(zzhfVar.f15234OooO0O0, zzhf.zza, null, null, null);
                                    if (cursorQuery == null) {
                                        return Collections.emptyMap();
                                    }
                                    try {
                                        int count = cursorQuery.getCount();
                                        if (count == 0) {
                                            return Collections.emptyMap();
                                        }
                                        Map oooO = count <= 256 ? new p190o00o0O.OooO(count) : new HashMap(count, 1.0f);
                                        while (cursorQuery.moveToNext()) {
                                            oooO.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                        }
                                        return oooO;
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
                        this.f15237OooO0o = map;
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
        synchronized (this.f15238OooO0o0) {
            this.f15237OooO0o = null;
            this.f15235OooO0OO.run();
        }
        synchronized (this) {
            Iterator it = this.f15239OooO0oO.iterator();
            while (it.hasNext()) {
                ((zzhg) it.next()).zza();
            }
        }
    }
}
