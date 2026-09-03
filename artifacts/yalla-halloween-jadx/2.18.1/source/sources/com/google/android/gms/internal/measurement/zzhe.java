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
import java.util.Objects;
import p021OooOooo.Oooo0;
import p334o0OO00o.o00O00OO;
import p334o0OO00o.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhe implements o00O00OO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("ConfigurationContentLoader.class")
    public static final Oooo0 f15941OooO0oo = new Oooo0();
    public static final String[] zza = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ContentResolver f15942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Uri f15943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Runnable f15944OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oOO00O f15945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Map f15946OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f15947OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayList f15948OooO0oO;

    public zzhe(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        oOO00O ooo00o = new oOO00O(this);
        this.f15945OooO0Oo = ooo00o;
        this.f15947OooO0o0 = new Object();
        this.f15948OooO0oO = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f15942OooO00o = contentResolver;
        this.f15943OooO0O0 = uri;
        this.f15944OooO0OO = runnable;
        contentResolver.registerContentObserver(uri, false, ooo00o);
    }

    public static synchronized void OooO00o() {
        for (zzhe zzheVar : (Oooo0.OooO) f15941OooO0oo.values()) {
            zzheVar.f15942OooO00o.unregisterContentObserver(zzheVar.f15945OooO0Oo);
        }
        f15941OooO0oo.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzhe zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzhe zzheVar;
        synchronized (zzhe.class) {
            Oooo0 oooo0 = f15941OooO0oo;
            zzheVar = (zzhe) oooo0.getOrDefault(uri, null);
            if (zzheVar == null) {
                try {
                    zzhe zzheVar2 = new zzhe(contentResolver, uri, runnable);
                    try {
                        oooo0.put(uri, zzheVar2);
                    } catch (SecurityException unused) {
                    }
                    zzheVar = zzheVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzheVar;
    }

    @Override // p334o0OO00o.o00O00OO
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzc().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map zzc() {
        ?? r0;
        Map map;
        Map map2 = this.f15946OooO0o;
        ?? r1 = map2;
        if (map2 == null) {
            synchronized (this.f15947OooO0o0) {
                Map map3 = this.f15946OooO0o;
                r0 = map3;
                if (map3 == null) {
                    ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzhh.zza(new zzhi() { // from class: com.google.android.gms.internal.measurement.zzhc
                                @Override // com.google.android.gms.internal.measurement.zzhi
                                public final Object zza() {
                                    zzhe zzheVar = this.zza;
                                    Cursor cursorQuery = zzheVar.f15942OooO00o.query(zzheVar.f15943OooO0O0, zzhe.zza, null, null, null);
                                    if (cursorQuery == null) {
                                        return Collections.emptyMap();
                                    }
                                    try {
                                        int count = cursorQuery.getCount();
                                        if (count == 0) {
                                            return Collections.emptyMap();
                                        }
                                        Map oooo0 = count <= 256 ? new Oooo0(count) : new HashMap(count, 1.0f);
                                        while (cursorQuery.moveToNext()) {
                                            oooo0.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                        }
                                        return oooo0;
                                    } finally {
                                        cursorQuery.close();
                                    }
                                }
                            });
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                            throw th;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        map = null;
                    }
                    this.f15946OooO0o = map;
                    AllowThreadDiskReads = map;
                    r0 = AllowThreadDiskReads;
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.emptyMap();
    }

    public final void zzf() {
        synchronized (this.f15947OooO0o0) {
            this.f15946OooO0o = null;
            this.f15944OooO0OO.run();
        }
        synchronized (this) {
            Iterator it = this.f15948OooO0oO.iterator();
            while (it.hasNext()) {
                ((zzhf) it.next()).zza();
            }
        }
    }
}
