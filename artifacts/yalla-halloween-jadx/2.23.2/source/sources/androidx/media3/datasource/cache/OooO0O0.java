package androidx.media3.datasource.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.database.DatabaseIOException;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import kotlin.jvm.internal.LongCompanionObject;
import o000Oo0.OooO;
import o000Oo0.OooOO0O;
import o000Oo0.OooOOO;
import o000Oo0.OooOOO0;
import o000Oo0.OooOo;
import o000Oo0.OooOo00;
import o000Oo0.Oooo0;
import o000Oo0.o00O0O;
import o000Oo0.o0OoOo0;
import p080o000OoO.o00Oo0;
import p083o000Ooo.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO0O0 implements Cache {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final HashSet<File> f7072OooOO0O = new HashSet<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f7073OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f7074OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f7075OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f7076OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o000Oo0.OooO0O0 f7077OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Random f7078OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, ArrayList<Cache.OooO00o>> f7079OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f7080OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f7081OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Cache.CacheException f7082OooOO0;

    public OooO0O0(File file, Oooo0 oooo0, o00oOoo o00oooo2) {
        boolean zAdd;
        OooOOO0 oooOOO0 = new OooOOO0(o00oooo2, file);
        o000Oo0.OooO0O0 oooO0O0 = o00oooo2 != null ? new o000Oo0.OooO0O0(o00oooo2) : null;
        synchronized (OooO0O0.class) {
            zAdd = f7072OooOO0O.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f7074OooO00o = file;
        this.f7075OooO0O0 = oooo0;
        this.f7076OooO0OO = oooOOO0;
        this.f7077OooO0Oo = oooO0O0;
        this.f7079OooO0o0 = new HashMap<>();
        this.f7078OooO0o = new Random();
        oooo0.getClass();
        this.f7080OooO0oO = true;
        this.f7081OooO0oo = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new o00O0O(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void OooOO0o(OooO0O0 oooO0O0) {
        long j;
        OooOOO0 oooOOO0 = oooO0O0.f7076OooO0OO;
        File file = oooO0O0.f7074OooO00o;
        if (!file.exists()) {
            try {
                OooOOOO(file);
            } catch (Cache.CacheException e) {
                oooO0O0.f7082OooOO0 = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            Log.OooO0OO("SimpleCache", str);
            oooO0O0.f7082OooOO0 = new Cache.CacheException(str);
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
        oooO0O0.f7081OooO0oo = j;
        if (j == -1) {
            try {
                oooO0O0.f7081OooO0oo = OooOOOo(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                Log.OooO0Oo("SimpleCache", str2, e2);
                oooO0O0.f7082OooOO0 = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            oooOOO0.OooO0o0(oooO0O0.f7081OooO0oo);
            o000Oo0.OooO0O0 oooO0O1 = oooO0O0.f7077OooO0Oo;
            if (oooO0O1 != null) {
                oooO0O1.OooO0O0(oooO0O0.f7081OooO0oo);
                HashMap mapOooO00o = oooO0O1.OooO00o();
                oooO0O0.OooOOo(file, true, fileArrListFiles, mapOooO00o);
                oooO0O1.OooO0OO(mapOooO00o.keySet());
            } else {
                oooO0O0.OooOOo(file, true, fileArrListFiles, null);
            }
            Iterator it = ImmutableSet.OooOO0O(oooOOO0.f34813OooO00o.keySet()).iterator();
            while (it.hasNext()) {
                oooOOO0.OooO0o((String) it.next());
            }
            try {
                oooOOO0.OooO0oO();
            } catch (IOException e3) {
                Log.OooO0Oo("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            Log.OooO0Oo("SimpleCache", str3, e4);
            oooO0O0.f7082OooOO0 = new Cache.CacheException(str3, e4);
        }
    }

    public static void OooOOOO(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        Log.OooO0OO("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    public static long OooOOOo(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, OooOOOO.OooO00o(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized void OooOo0O(File file) {
        f7072OooOO0O.remove(file.getAbsoluteFile());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void OooO(OooO oooO) {
        o00Oo0.OooO0Oo(!this.f7073OooO);
        OooOOoo(oooO);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized OooOo OooO00o(String str) {
        OooOO0O oooOO0OOooO0OO;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(str);
        return oooOO0OOooO0OO != null ? oooOO0OOooO0OO.f34810OooO0o0 : OooOo.f34831OooO0OO;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void OooO0O0(OooO oooO) {
        int i = 0;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        OooOO0O oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(oooO.f34785OooO0Oo);
        oooOO0OOooO0OO.getClass();
        long j = oooO.f34787OooO0o0;
        while (true) {
            ArrayList<OooOO0O.OooO00o> arrayList = oooOO0OOooO0OO.f34809OooO0Oo;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (arrayList.get(i).f34811OooO00o == j) {
                arrayList.remove(i);
                this.f7076OooO0OO.OooO0o(oooOO0OOooO0OO.f34807OooO0O0);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized long OooO0OO(long j, long j2, String str) {
        OooOO0O oooOO0OOooO0OO;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        if (j2 == -1) {
            j2 = LongCompanionObject.MAX_VALUE;
        }
        oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(str);
        return oooOO0OOooO0OO != null ? oooOO0OOooO0OO.OooO00o(j, j2) : -j2;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized o000Oo0.o00Oo0 OooO0Oo(long j, long j2, String str) throws InterruptedException, Cache.CacheException {
        o000Oo0.o00Oo0 o00oo0OooO0o0;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        OooOOO();
        while (true) {
            o00oo0OooO0o0 = OooO0o0(j, j2, str);
            if (o00oo0OooO0o0 == null) {
                wait();
            }
        }
        return o00oo0OooO0o0;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized long OooO0o(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 < 0 ? Long.MAX_VALUE : j4;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long jOooO0OO = OooO0OO(j6, j5 - j6, str);
            if (jOooO0OO > 0) {
                j3 += jOooO0OO;
            } else {
                jOooO0OO = -jOooO0OO;
            }
            j6 += jOooO0OO;
        }
        return j3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    @Override // androidx.media3.datasource.cache.Cache
    @Nullable
    public final synchronized o000Oo0.o00Oo0 OooO0o0(long j, long j2, String str) throws Cache.CacheException {
        o000Oo0.o00Oo0 o00oo0OooO0O0;
        boolean z;
        boolean z2;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        OooOOO();
        OooOO0O oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(str);
        if (oooOO0OOooO0OO == null) {
            o00oo0OooO0O0 = new o000Oo0.o00Oo0(str, j, j2, -9223372036854775807L, null);
        } else {
            while (true) {
                o00oo0OooO0O0 = oooOO0OOooO0OO.OooO0O0(j, j2);
                if (!o00oo0OooO0O0.f34788OooO0oO || o00oo0OooO0O0.f34789OooO0oo.length() == o00oo0OooO0O0.f34786OooO0o) {
                    break;
                }
                OooOo00();
            }
        }
        if (o00oo0OooO0O0.f34788OooO0oO) {
            return OooOo0(str, o00oo0OooO0O0);
        }
        OooOO0O oooOO0OOooO0Oo = this.f7076OooO0OO.OooO0Oo(str);
        long j3 = o00oo0OooO0O0.f34786OooO0o;
        int i = 0;
        while (true) {
            ArrayList<OooOO0O.OooO00o> arrayList = oooOO0OOooO0Oo.f34809OooO0Oo;
            if (i >= arrayList.size()) {
                arrayList.add(new OooOO0O.OooO00o(j, j3));
                z = true;
                break;
            }
            OooOO0O.OooO00o oooO00o = arrayList.get(i);
            long j4 = oooO00o.f34811OooO00o;
            if (j4 <= j) {
                long j5 = oooO00o.f34812OooO0O0;
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
            return o00oo0OooO0O0;
        }
        return null;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized File OooO0oO(long j, long j2, String str) throws Cache.CacheException {
        OooOO0O oooOO0OOooO0OO;
        File file;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        OooOOO();
        oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(str);
        oooOO0OOooO0OO.getClass();
        o00Oo0.OooO0Oo(oooOO0OOooO0OO.OooO0OO(j, j2));
        if (!this.f7074OooO00o.exists()) {
            OooOOOO(this.f7074OooO00o);
            OooOo00();
        }
        this.f7075OooO0O0.OooO0OO(this, j2);
        file = new File(this.f7074OooO00o, Integer.toString(this.f7078OooO0o.nextInt(10)));
        if (!file.exists()) {
            OooOOOO(file);
        }
        return o000Oo0.o00Oo0.OooO0OO(file, oooOO0OOooO0OO.f34806OooO00o, j, System.currentTimeMillis());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void OooO0oo(String str, OooOo00 oooOo00) throws Cache.CacheException {
        o00Oo0.OooO0Oo(!this.f7073OooO);
        OooOOO();
        OooOOO0 oooOOO0 = this.f7076OooO0OO;
        OooOO0O oooOO0OOooO0Oo = oooOOO0.OooO0Oo(str);
        OooOo oooOo = oooOO0OOooO0Oo.f34810OooO0o0;
        OooOo oooOoOooO00o = oooOo.OooO00o(oooOo00);
        oooOO0OOooO0Oo.f34810OooO0o0 = oooOoOooO00o;
        if (!oooOoOooO00o.equals(oooOo)) {
            oooOOO0.f34818OooO0o0.OooO0o0(oooOO0OOooO0Oo);
        }
        try {
            this.f7076OooO0OO.OooO0oO();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void OooOO0(File file, long j) throws Cache.CacheException {
        boolean z = true;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            o000Oo0.o00Oo0 o00oo0OooO0O0 = o000Oo0.o00Oo0.OooO0O0(file, j, -9223372036854775807L, this.f7076OooO0OO);
            o00oo0OooO0O0.getClass();
            OooOO0O oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(o00oo0OooO0O0.f34785OooO0Oo);
            oooOO0OOooO0OO.getClass();
            o00Oo0.OooO0Oo(oooOO0OOooO0OO.OooO0OO(o00oo0OooO0O0.f34787OooO0o0, o00oo0OooO0O0.f34786OooO0o));
            long jOooO00o = OooOOO.OooO00o(oooOO0OOooO0OO.f34810OooO0o0);
            if (jOooO00o != -1) {
                if (o00oo0OooO0O0.f34787OooO0o0 + o00oo0OooO0O0.f34786OooO0o > jOooO00o) {
                    z = false;
                }
                o00Oo0.OooO0Oo(z);
            }
            if (this.f7077OooO0Oo == null) {
                OooOOO0(o00oo0OooO0O0);
                this.f7076OooO0OO.OooO0oO();
                notifyAll();
                return;
            }
            try {
                this.f7077OooO0Oo.OooO0Oo(o00oo0OooO0O0.f34786OooO0o, o00oo0OooO0O0.f34784OooO, file.getName());
                OooOOO0(o00oo0OooO0O0);
                try {
                    this.f7076OooO0OO.OooO0oO();
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

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void OooOO0O(String str) {
        o00Oo0.OooO0Oo(!this.f7073OooO);
        Iterator it = OooOOo0(str).iterator();
        while (it.hasNext()) {
            OooOOoo((OooO) it.next());
        }
    }

    public final synchronized void OooOOO() throws Cache.CacheException {
        Cache.CacheException cacheException = this.f7082OooOO0;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final void OooOOO0(o000Oo0.o00Oo0 o00oo1) {
        OooOOO0 oooOOO0 = this.f7076OooO0OO;
        String str = o00oo1.f34785OooO0Oo;
        oooOOO0.OooO0Oo(str).f34808OooO0OO.add(o00oo1);
        ArrayList<Cache.OooO00o> arrayList = this.f7079OooO0o0.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).OooO00o(this, o00oo1);
                }
            }
        }
        this.f7075OooO0O0.OooO00o(this, o00oo1);
    }

    public final void OooOOo(File file, boolean z, @Nullable File[] fileArr, @Nullable HashMap map) {
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
                OooOOo(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                o000Oo0.OooO00o oooO00o = map != null ? (o000Oo0.OooO00o) map.remove(name) : null;
                if (oooO00o != null) {
                    j2 = oooO00o.f34790OooO00o;
                    j = oooO00o.f34791OooO0O0;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                o000Oo0.o00Oo0 o00oo0OooO0O0 = o000Oo0.o00Oo0.OooO0O0(file2, j2, j, this.f7076OooO0OO);
                if (o00oo0OooO0O0 != null) {
                    OooOOO0(o00oo0OooO0O0);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized TreeSet OooOOo0(String str) {
        OooOO0O oooOO0OOooO0OO;
        o00Oo0.OooO0Oo(!this.f7073OooO);
        oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(str);
        return (oooOO0OOooO0OO == null || oooOO0OOooO0OO.f34808OooO0OO.isEmpty()) ? new TreeSet() : new TreeSet((Collection) oooOO0OOooO0OO.f34808OooO0OO);
    }

    public final void OooOOoo(OooO oooO) {
        boolean z;
        String str = oooO.f34785OooO0Oo;
        OooOOO0 oooOOO0 = this.f7076OooO0OO;
        OooOO0O oooOO0OOooO0OO = oooOOO0.OooO0OO(str);
        if (oooOO0OOooO0OO != null) {
            boolean zRemove = oooOO0OOooO0OO.f34808OooO0OO.remove(oooO);
            File file = oooO.f34789OooO0oo;
            if (zRemove) {
                if (file != null) {
                    file.delete();
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o000Oo0.OooO0O0 oooO0O0 = this.f7077OooO0Oo;
                if (oooO0O0 != null) {
                    String name = file.getName();
                    try {
                        oooO0O0.f34794OooO0O0.getClass();
                        try {
                            oooO0O0.f34793OooO00o.getWritableDatabase().delete(oooO0O0.f34794OooO0O0, "name = ?", new String[]{name});
                        } catch (SQLException e) {
                            throw new DatabaseIOException(e);
                        }
                    } catch (IOException unused) {
                        o0OoOo0.OooO0O0("Failed to remove file index entry for: ", name, "SimpleCache");
                    }
                }
                oooOOO0.OooO0o(oooOO0OOooO0OO.f34807OooO0O0);
                ArrayList<Cache.OooO00o> arrayList = this.f7079OooO0o0.get(oooO.f34785OooO0Oo);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            arrayList.get(size).OooO0O0(oooO);
                        }
                    }
                }
                this.f7075OooO0O0.OooO0O0(oooO);
            }
        }
    }

    public final o000Oo0.o00Oo0 OooOo0(String str, o000Oo0.o00Oo0 o00oo1) {
        boolean z;
        File file;
        if (!this.f7080OooO0oO) {
            return o00oo1;
        }
        File file2 = o00oo1.f34789OooO0oo;
        file2.getClass();
        String name = file2.getName();
        long j = o00oo1.f34786OooO0o;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o000Oo0.OooO0O0 oooO0O0 = this.f7077OooO0Oo;
        if (oooO0O0 != null) {
            try {
                oooO0O0.OooO0Oo(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                Log.OooO0o("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        OooOO0O oooOO0OOooO0OO = this.f7076OooO0OO.OooO0OO(str);
        TreeSet<o000Oo0.o00Oo0> treeSet = oooOO0OOooO0OO.f34808OooO0OO;
        o00Oo0.OooO0Oo(treeSet.remove(o00oo1));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileOooO0OO = o000Oo0.o00Oo0.OooO0OO(parentFile, oooOO0OOooO0OO.f34806OooO00o, o00oo1.f34787OooO0o0, jCurrentTimeMillis);
            if (file2.renameTo(fileOooO0OO)) {
                file = fileOooO0OO;
            } else {
                Log.OooO0o("CachedContent", "Failed to rename " + file2 + " to " + fileOooO0OO);
                file = file2;
            }
        } else {
            file = file2;
        }
        o00Oo0.OooO0Oo(o00oo1.f34788OooO0oO);
        o000Oo0.o00Oo0 o00oo2 = new o000Oo0.o00Oo0(o00oo1.f34785OooO0Oo, o00oo1.f34787OooO0o0, o00oo1.f34786OooO0o, jCurrentTimeMillis, file);
        treeSet.add(o00oo2);
        ArrayList<Cache.OooO00o> arrayList = this.f7079OooO0o0.get(o00oo1.f34785OooO0Oo);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).OooO0Oo(this, o00oo1, o00oo2);
            }
        }
        this.f7075OooO0O0.OooO0Oo(this, o00oo1, o00oo2);
        return o00oo2;
    }

    public final void OooOo00() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f7076OooO0OO.f34813OooO00o.values()).iterator();
        while (it.hasNext()) {
            for (o000Oo0.o00Oo0 o00oo1 : ((OooOO0O) it.next()).f34808OooO0OO) {
                if (o00oo1.f34789OooO0oo.length() != o00oo1.f34786OooO0o) {
                    arrayList.add(o00oo1);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            OooOOoo((OooO) arrayList.get(i));
        }
    }
}
