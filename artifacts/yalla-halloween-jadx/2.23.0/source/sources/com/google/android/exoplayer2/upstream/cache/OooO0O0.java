package com.google.android.exoplayer2.upstream.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.ui.graphics.o0o0Oo;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import kotlin.jvm.internal.LongCompanionObject;
import p204o00o0oO.oOO00O;
import p246o00oo0o0.o00;
import p246o00oo0o0.o000O;
import p246o00oo0o0.o000O00;
import p246o00oo0o0.o000O00O;
import p246o00oo0o0.o000OO00;
import p246o00oo0o0.o000OO0O;
import p246o00oo0o0.o00O00;
import p246o00oo0o0.o00O0000;
import p246o00oo0o0.o00O000o;
import p246o00oo0o0.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 implements Cache {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final HashSet<File> f14302OooOO0O = new HashSet<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14303OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f14304OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f14305OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OO00 f14306OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o000O00O f14307OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Random f14308OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, ArrayList<Cache.OooO00o>> f14309OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f14310OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f14311OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Cache.CacheException f14312OooOO0;

    public OooO0O0(File file, o00oOoo o00oooo2, oOO00O ooo00o) {
        boolean zAdd;
        o000OO00 o000oo01 = new o000OO00(ooo00o, file);
        o000O00O o000o00o2 = new o000O00O(ooo00o);
        synchronized (OooO0O0.class) {
            zAdd = f14302OooOO0O.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f14304OooO00o = file;
        this.f14305OooO0O0 = o00oooo2;
        this.f14306OooO0OO = o000oo01;
        this.f14307OooO0Oo = o000o00o2;
        this.f14309OooO0o0 = new HashMap<>();
        this.f14308OooO0o = new Random();
        o00oooo2.getClass();
        this.f14310OooO0oO = true;
        this.f14311OooO0oo = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new o00O000o(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void OooOO0O(OooO0O0 oooO0O0) {
        long j;
        o000OO00 o000oo01 = oooO0O0.f14306OooO0OO;
        File file = oooO0O0.f14304OooO00o;
        if (!file.exists()) {
            try {
                OooOOO(file);
            } catch (Cache.CacheException e) {
                oooO0O0.f14312OooOO0 = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            Log.OooO0OO("SimpleCache", str);
            oooO0O0.f14312OooOO0 = new Cache.CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    Log.OooO0OO("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        oooO0O0.f14311OooO0oo = j;
        if (j == -1) {
            try {
                oooO0O0.f14311OooO0oo = OooOOOO(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                Log.OooO0Oo("SimpleCache", str2, e2);
                oooO0O0.f14312OooOO0 = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            o000oo01.OooO0o0(oooO0O0.f14311OooO0oo);
            o000O00O o000o00o2 = oooO0O0.f14307OooO0Oo;
            if (o000o00o2 != null) {
                o000o00o2.OooO0O0(oooO0O0.f14311OooO0oo);
                HashMap mapOooO00o = o000o00o2.OooO00o();
                oooO0O0.OooOOOo(file, true, fileArrListFiles, mapOooO00o);
                o000o00o2.OooO0OO(mapOooO00o.keySet());
            } else {
                oooO0O0.OooOOOo(file, true, fileArrListFiles, null);
            }
            Iterator it = ImmutableSet.OooOO0O(o000oo01.f40698OooO00o.keySet()).iterator();
            while (it.hasNext()) {
                o000oo01.OooO0o((String) it.next());
            }
            try {
                o000oo01.OooO0oO();
            } catch (IOException e3) {
                Log.OooO0Oo("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            Log.OooO0Oo("SimpleCache", str3, e4);
            oooO0O0.f14312OooOO0 = new Cache.CacheException(str3, e4);
        }
    }

    public static void OooOOO(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        Log.OooO0OO("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    public static long OooOOOO(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, OooOOOO.OooO00o(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized void OooOo00(File file) {
        f14302OooOO0O.remove(file.getAbsoluteFile());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void OooO(File file, long j) throws Cache.CacheException {
        boolean z = true;
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            o00O00 o00o00OooO0O0 = o00O00.OooO0O0(file, j, -9223372036854775807L, this.f14306OooO0OO);
            o00o00OooO0O0.getClass();
            o000O o000oOooO0OO = this.f14306OooO0OO.OooO0OO(o00o00OooO0O0.f40717OooO0Oo);
            o000oOooO0OO.getClass();
            p245o00oo0o.o00O000o.OooO0Oo(o000oOooO0OO.OooO0OO(o00o00OooO0O0.f40719OooO0o0, o00o00OooO0O0.f40718OooO0o));
            long jOooO00o = o0o0Oo.OooO00o(o000oOooO0OO.f40681OooO0o0);
            if (jOooO00o != -1) {
                if (o00o00OooO0O0.f40719OooO0o0 + o00o00OooO0O0.f40718OooO0o > jOooO00o) {
                    z = false;
                }
                p245o00oo0o.o00O000o.OooO0Oo(z);
            }
            if (this.f14307OooO0Oo == null) {
                OooOO0o(o00o00OooO0O0);
                this.f14306OooO0OO.OooO0oO();
                notifyAll();
                return;
            }
            try {
                this.f14307OooO0Oo.OooO0Oo(o00o00OooO0O0.f40718OooO0o, o00o00OooO0O0.f40716OooO, file.getName());
                OooOO0o(o00o00OooO0O0);
                try {
                    this.f14306OooO0OO.OooO0oO();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new Cache.CacheException(e);
                }
            } catch (IOException e2) {
                throw new Cache.CacheException(e2);
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized o00O0000 OooO00o(String str) {
        o000O o000oOooO0OO;
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        o000oOooO0OO = this.f14306OooO0OO.OooO0OO(str);
        return o000oOooO0OO != null ? o000oOooO0OO.f40681OooO0o0 : o00O0000.f40726OooO0OO;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void OooO0O0(String str, o00 o00Var) throws Cache.CacheException {
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        OooOOO0();
        o000OO00 o000oo01 = this.f14306OooO0OO;
        o000O o000oOooO0Oo = o000oo01.OooO0Oo(str);
        o00O0000 o00o0001 = o000oOooO0Oo.f40681OooO0o0;
        o00O0000 o00o0000OooO00o = o00o0001.OooO00o(o00Var);
        o000oOooO0Oo.f40681OooO0o0 = o00o0000OooO00o;
        if (!o00o0000OooO00o.equals(o00o0001)) {
            o000oo01.f40703OooO0o0.OooO0o(o000oOooO0Oo);
        }
        try {
            this.f14306OooO0OO.OooO0oO();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void OooO0OO(o000OO0O o000oo0o2) {
        int i = 0;
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        o000O o000oOooO0OO = this.f14306OooO0OO.OooO0OO(o000oo0o2.f40717OooO0Oo);
        o000oOooO0OO.getClass();
        long j = o000oo0o2.f40719OooO0o0;
        while (true) {
            ArrayList<o000O.OooO00o> arrayList = o000oOooO0OO.f40680OooO0Oo;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (arrayList.get(i).f40682OooO00o == j) {
                arrayList.remove(i);
                this.f14306OooO0OO.OooO0o(o000oOooO0OO.f40678OooO0O0);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized long OooO0Oo(long j, long j2, String str) {
        o000O o000oOooO0OO;
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        if (j2 == -1) {
            j2 = LongCompanionObject.MAX_VALUE;
        }
        o000oOooO0OO = this.f14306OooO0OO.OooO0OO(str);
        return o000oOooO0OO != null ? o000oOooO0OO.OooO00o(j, j2) : -j2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @Nullable
    public final synchronized o00O00 OooO0o(long j, long j2, String str) throws Cache.CacheException {
        o00O00 o00o00OooO0O0;
        boolean z;
        boolean z2;
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        OooOOO0();
        o000O o000oOooO0OO = this.f14306OooO0OO.OooO0OO(str);
        if (o000oOooO0OO == null) {
            o00o00OooO0O0 = new o00O00(str, j, j2, -9223372036854775807L, null);
        } else {
            while (true) {
                o00o00OooO0O0 = o000oOooO0OO.OooO0O0(j, j2);
                if (!o00o00OooO0O0.f40720OooO0oO || o00o00OooO0O0.f40721OooO0oo.length() == o00o00OooO0O0.f40718OooO0o) {
                    break;
                }
                OooOOo();
            }
        }
        if (o00o00OooO0O0.f40720OooO0oO) {
            return OooOOoo(str, o00o00OooO0O0);
        }
        o000O o000oOooO0Oo = this.f14306OooO0OO.OooO0Oo(str);
        long j3 = o00o00OooO0O0.f40718OooO0o;
        int i = 0;
        while (true) {
            ArrayList<o000O.OooO00o> arrayList = o000oOooO0Oo.f40680OooO0Oo;
            if (i >= arrayList.size()) {
                arrayList.add(new o000O.OooO00o(j, j3));
                z = true;
                break;
            }
            o000O.OooO00o oooO00o = arrayList.get(i);
            long j4 = oooO00o.f40682OooO00o;
            if (j4 <= j) {
                long j5 = oooO00o.f40683OooO0O0;
                if (j5 == -1 || j4 + j5 > j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (j3 == -1 || j + j3 > j4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            return o00o00OooO0O0;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized o00O00 OooO0o0(long j, long j2, String str) throws InterruptedException, Cache.CacheException {
        o00O00 o00o00OooO0o;
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        OooOOO0();
        while (true) {
            o00o00OooO0o = OooO0o(j, j2, str);
            if (o00o00OooO0o == null) {
                wait();
            }
        }
        return o00o00OooO0o;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized long OooO0oO(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 < 0 ? Long.MAX_VALUE : j4;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long jOooO0Oo = OooO0Oo(j6, j5 - j6, str);
            if (jOooO0Oo > 0) {
                j3 += jOooO0Oo;
            } else {
                jOooO0Oo = -jOooO0Oo;
            }
            j6 += jOooO0Oo;
        }
        return j3;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized File OooO0oo(long j, long j2, String str) throws Cache.CacheException {
        o000O o000oOooO0OO;
        File file;
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        OooOOO0();
        o000oOooO0OO = this.f14306OooO0OO.OooO0OO(str);
        o000oOooO0OO.getClass();
        p245o00oo0o.o00O000o.OooO0Oo(o000oOooO0OO.OooO0OO(j, j2));
        if (!this.f14304OooO00o.exists()) {
            OooOOO(this.f14304OooO00o);
            OooOOo();
        }
        this.f14305OooO0O0.OooO0O0(this, j2);
        file = new File(this.f14304OooO00o, Integer.toString(this.f14308OooO0o.nextInt(10)));
        if (!file.exists()) {
            OooOOO(file);
        }
        return o00O00.OooO0OO(file, o000oOooO0OO.f40677OooO00o, j, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void OooOO0(o000OO0O o000oo0o2) {
        p245o00oo0o.o00O000o.OooO0Oo(!this.f14303OooO);
        OooOOo0(o000oo0o2);
    }

    public final void OooOO0o(o00O00 o00o01) {
        o000OO00 o000oo01 = this.f14306OooO0OO;
        String str = o00o01.f40717OooO0Oo;
        o000oo01.OooO0Oo(str).f40679OooO0OO.add(o00o01);
        ArrayList<Cache.OooO00o> arrayList = this.f14309OooO0o0.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).OooO00o(this, o00o01);
                }
            }
        }
        this.f14305OooO0O0.OooO00o(this, o00o01);
    }

    public final synchronized void OooOOO0() throws Cache.CacheException {
        Cache.CacheException cacheException = this.f14312OooOO0;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final void OooOOOo(File file, boolean z, @Nullable File[] fileArr, @Nullable HashMap map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                OooOOOo(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                o000O00 o000o01 = map != null ? (o000O00) map.remove(name) : null;
                if (o000o01 != null) {
                    j2 = o000o01.f40684OooO00o;
                    j = o000o01.f40685OooO0O0;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                o00O00 o00o00OooO0O0 = o00O00.OooO0O0(file2, j2, j, this.f14306OooO0OO);
                if (o00o00OooO0O0 != null) {
                    OooOO0o(o00o00OooO0O0);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void OooOOo() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f14306OooO0OO.f40698OooO00o.values()).iterator();
        while (it.hasNext()) {
            for (o00O00 o00o01 : ((o000O) it.next()).f40679OooO0OO) {
                if (o00o01.f40721OooO0oo.length() != o00o01.f40718OooO0o) {
                    arrayList.add(o00o01);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            OooOOo0((o000OO0O) arrayList.get(i));
        }
    }

    public final void OooOOo0(o000OO0O o000oo0o2) {
        boolean z;
        String str = o000oo0o2.f40717OooO0Oo;
        o000OO00 o000oo01 = this.f14306OooO0OO;
        o000O o000oOooO0OO = o000oo01.OooO0OO(str);
        if (o000oOooO0OO != null) {
            boolean zRemove = o000oOooO0OO.f40679OooO0OO.remove(o000oo0o2);
            File file = o000oo0o2.f40721OooO0oo;
            if (zRemove) {
                if (file != null) {
                    file.delete();
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o000O00O o000o00o2 = this.f14307OooO0Oo;
                if (o000o00o2 != null) {
                    String name = file.getName();
                    try {
                        o000o00o2.f40688OooO0O0.getClass();
                        try {
                            o000o00o2.f40687OooO00o.getWritableDatabase().delete(o000o00o2.f40688OooO0O0, "name = ?", new String[]{name});
                        } catch (SQLException e) {
                            throw new DatabaseIOException(e);
                        }
                    } catch (IOException unused) {
                        p200o00o0o.o000O00.OooO00o("Failed to remove file index entry for: ", name, "SimpleCache");
                    }
                }
                o000oo01.OooO0o(o000oOooO0OO.f40678OooO0O0);
                ArrayList<Cache.OooO00o> arrayList = this.f14309OooO0o0.get(o000oo0o2.f40717OooO0Oo);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            arrayList.get(size).OooO0Oo(o000oo0o2);
                        }
                    }
                }
                this.f14305OooO0O0.OooO0Oo(o000oo0o2);
            }
        }
    }

    public final o00O00 OooOOoo(String str, o00O00 o00o01) {
        boolean z;
        File file;
        if (!this.f14310OooO0oO) {
            return o00o01;
        }
        File file2 = o00o01.f40721OooO0oo;
        file2.getClass();
        String name = file2.getName();
        long j = o00o01.f40718OooO0o;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o000O00O o000o00o2 = this.f14307OooO0Oo;
        if (o000o00o2 != null) {
            try {
                o000o00o2.OooO0Oo(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                Log.OooO0o("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        o000O o000oOooO0OO = this.f14306OooO0OO.OooO0OO(str);
        TreeSet<o00O00> treeSet = o000oOooO0OO.f40679OooO0OO;
        p245o00oo0o.o00O000o.OooO0Oo(treeSet.remove(o00o01));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileOooO0OO = o00O00.OooO0OO(parentFile, o000oOooO0OO.f40677OooO00o, o00o01.f40719OooO0o0, jCurrentTimeMillis);
            if (file2.renameTo(fileOooO0OO)) {
                file = fileOooO0OO;
            } else {
                Log.OooO0o("CachedContent", "Failed to rename " + file2 + " to " + fileOooO0OO);
                file = file2;
            }
        } else {
            file = file2;
        }
        p245o00oo0o.o00O000o.OooO0Oo(o00o01.f40720OooO0oO);
        o00O00 o00o02 = new o00O00(o00o01.f40717OooO0Oo, o00o01.f40719OooO0o0, o00o01.f40718OooO0o, jCurrentTimeMillis, file);
        treeSet.add(o00o02);
        ArrayList<Cache.OooO00o> arrayList = this.f14309OooO0o0.get(o00o01.f40717OooO0Oo);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).OooO0OO(this, o00o01, o00o02);
            }
        }
        this.f14305OooO0O0.OooO0OO(this, o00o01, o00o02);
        return o00o02;
    }
}
