package p340o0OO0ooO;

import com.zego.zegoavkit2.ZegoConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import p004OooO0oO.o000oOoO;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOO00;
import p662o0oooO0O.o0OOO0OO;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O implements Closeable {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final Pattern f42532OooOo0O = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0O0 f42533OooOo0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f42534OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO00.OooO00o f42535OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final File f42536OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final File f42537OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final File f42538OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final File f42539OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f42540OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f42541OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f42542OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final LinkedHashMap<String, OooO0o> f42543OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o0OOo000 f42544OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f42545OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f42546OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f42547OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f42548OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f42549OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooO00o f42550OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Executor f42551OooOo00;

    public final class OooO implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f42552OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final oO00000[] f42553OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f42554OooO0o0;

        public OooO(String str, long j, oO00000[] oo00000Arr) {
            this.f42552OooO0Oo = str;
            this.f42554OooO0o0 = j;
            this.f42553OooO0o = oo00000Arr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (oO00000 oo00000 : this.f42553OooO0o) {
                o000OOo.OooO0O0(oo00000);
            }
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (o00O0O.this) {
                o00O0O o00o0o2 = o00O0O.this;
                if ((!o00o0o2.f42548OooOOo0) || o00o0o2.f42547OooOOo) {
                    return;
                }
                try {
                    o00o0o2.Oooo0o0();
                    if (o00O0O.this.OooOo0()) {
                        o00O0O.this.Oooo0O0();
                        o00O0O.this.f42545OooOOOO = 0;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class OooO0O0 implements ooo0Oo0 {
        @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final oO00000o timeout() {
            return oO00000o.f59811OooO0Oo;
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final void write(oo0OOoo oo0oooo, long j) throws IOException {
            oo0oooo.skip(j);
        }
    }

    public final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f42557OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f42558OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f42559OooO0OO;

        public class OooO00o extends o00Ooo {
            public OooO00o(o0OOO0OO o0ooo0oo2) {
                super(o0ooo0oo2);
            }

            @Override // p340o0OO0ooO.o00Ooo
            public final void OooO00o() {
                synchronized (o00O0O.this) {
                    OooO0OO.this.f42559OooO0OO = true;
                }
            }
        }

        public OooO0OO(OooO0o oooO0o) {
            this.f42557OooO00o = oooO0o;
            this.f42558OooO0O0 = oooO0o.f42567OooO0o0 ? null : new boolean[o00O0O.this.f42541OooOO0O];
        }

        public final void OooO00o() throws IOException {
            synchronized (o00O0O.this) {
                o00O0O.OooO00o(o00O0O.this, this, false);
            }
        }

        public final void OooO0O0() throws IOException {
            synchronized (o00O0O.this) {
                if (this.f42559OooO0OO) {
                    o00O0O.OooO00o(o00O0O.this, this, false);
                    o00O0O.this.Oooo0OO(this.f42557OooO00o);
                } else {
                    o00O0O.OooO00o(o00O0O.this, this, true);
                }
            }
        }

        public final ooo0Oo0 OooO0OO(int i) throws IOException {
            o0OOO0OO o0ooo0ooOooO0o0;
            OooO00o oooO00o;
            synchronized (o00O0O.this) {
                OooO0o oooO0o = this.f42557OooO00o;
                if (oooO0o.f42566OooO0o != this) {
                    throw new IllegalStateException();
                }
                if (!oooO0o.f42567OooO0o0) {
                    this.f42558OooO0O0[i] = true;
                }
                File file = oooO0o.f42565OooO0Oo[i];
                try {
                    ((o0OOO00.OooO00o.C0446OooO00o) o00O0O.this.f42535OooO0Oo).getClass();
                    try {
                        Logger logger = o0OOO00.f59784OooO00o;
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        o0ooo0ooOooO0o0 = o0OO.OooO0o0(new FileOutputStream(file, false));
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        Logger logger2 = o0OOO00.f59784OooO00o;
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        o0ooo0ooOooO0o0 = o0OO.OooO0o0(new FileOutputStream(file, false));
                    }
                    oooO00o = new OooO00o(o0ooo0ooOooO0o0);
                } catch (FileNotFoundException unused2) {
                    return o00O0O.f42533OooOo0o;
                }
            }
            return oooO00o;
        }
    }

    public final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f42562OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f42563OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final File[] f42564OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File[] f42565OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0OO f42566OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f42567OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f42568OooO0oO;

        public OooO0o(String str) {
            this.f42562OooO00o = str;
            int i = o00O0O.this.f42541OooOO0O;
            this.f42563OooO0O0 = new long[i];
            this.f42564OooO0OO = new File[i];
            this.f42565OooO0Oo = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < o00O0O.this.f42541OooOO0O; i2++) {
                sb.append(i2);
                File[] fileArr = this.f42564OooO0OO;
                String string = sb.toString();
                File file = o00O0O.this.f42537OooO0o0;
                fileArr[i2] = new File(file, string);
                sb.append(".tmp");
                this.f42565OooO0Oo[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final OooO OooO00o() throws CloneNotSupportedException {
            oO00000 oo00000;
            o00O0O o00o0o2 = o00O0O.this;
            if (!Thread.holdsLock(o00o0o2)) {
                throw new AssertionError();
            }
            oO00000[] oo00000Arr = new oO00000[o00o0o2.f42541OooOO0O];
            this.f42563OooO0O0.clone();
            for (int i = 0; i < o00o0o2.f42541OooOO0O; i++) {
                try {
                    o0OOO00.OooO00o oooO00o = o00o0o2.f42535OooO0Oo;
                    File file = this.f42564OooO0OO[i];
                    ((o0OOO00.OooO00o.C0446OooO00o) oooO00o).getClass();
                    oo00000Arr[i] = o0OO.OooO0oO(file);
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < o00o0o2.f42541OooOO0O && (oo00000 = oo00000Arr[i2]) != null; i2++) {
                        o000OOo.OooO0O0(oo00000);
                    }
                    return null;
                }
            }
            return o00o0o2.new OooO(this.f42562OooO00o, this.f42568OooO0oO, oo00000Arr);
        }
    }

    public o00O0O(File file, long j, ThreadPoolExecutor threadPoolExecutor) {
        o0OOO00.OooO00o.C0446OooO00o c0446OooO00o = o0OOO00.OooO00o.f42744OooO00o;
        this.f42542OooOO0o = 0L;
        this.f42543OooOOO = new LinkedHashMap<>(0, 0.75f, true);
        this.f42549OooOOoo = 0L;
        this.f42550OooOo0 = new OooO00o();
        this.f42535OooO0Oo = c0446OooO00o;
        this.f42537OooO0o0 = file;
        this.f42534OooO = 201105;
        this.f42536OooO0o = new File(file, "journal");
        this.f42538OooO0oO = new File(file, "journal.tmp");
        this.f42539OooO0oo = new File(file, "journal.bkp");
        this.f42541OooOO0O = 2;
        this.f42540OooOO0 = j;
        this.f42551OooOo00 = threadPoolExecutor;
    }

    public static void OooO00o(o00O0O o00o0o2, OooO0OO oooO0OO, boolean z) throws IOException {
        synchronized (o00o0o2) {
            OooO0o oooO0o = oooO0OO.f42557OooO00o;
            if (oooO0o.f42566OooO0o != oooO0OO) {
                throw new IllegalStateException();
            }
            if (z && !oooO0o.f42567OooO0o0) {
                for (int i = 0; i < o00o0o2.f42541OooOO0O; i++) {
                    if (!oooO0OO.f42558OooO0O0[i]) {
                        oooO0OO.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    o0OOO00.OooO00o oooO00o = o00o0o2.f42535OooO0Oo;
                    File file = oooO0o.f42565OooO0Oo[i];
                    ((o0OOO00.OooO00o.C0446OooO00o) oooO00o).getClass();
                    if (!file.exists()) {
                        oooO0OO.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < o00o0o2.f42541OooOO0O; i2++) {
                File file2 = oooO0o.f42565OooO0Oo[i2];
                if (z) {
                    ((o0OOO00.OooO00o.C0446OooO00o) o00o0o2.f42535OooO0Oo).getClass();
                    if (file2.exists()) {
                        File file3 = oooO0o.f42564OooO0OO[i2];
                        ((o0OOO00.OooO00o.C0446OooO00o) o00o0o2.f42535OooO0Oo).OooO0OO(file2, file3);
                        long j = oooO0o.f42563OooO0O0[i2];
                        ((o0OOO00.OooO00o.C0446OooO00o) o00o0o2.f42535OooO0Oo).getClass();
                        long length = file3.length();
                        oooO0o.f42563OooO0O0[i2] = length;
                        o00o0o2.f42542OooOO0o = (o00o0o2.f42542OooOO0o - j) + length;
                    }
                } else {
                    ((o0OOO00.OooO00o.C0446OooO00o) o00o0o2.f42535OooO0Oo).OooO00o(file2);
                }
            }
            o00o0o2.f42545OooOOOO++;
            oooO0o.f42566OooO0o = null;
            if (oooO0o.f42567OooO0o0 || z) {
                oooO0o.f42567OooO0o0 = true;
                o0OOo000 o0ooo001 = o00o0o2.f42544OooOOO0;
                o0ooo001.Oooo000("CLEAN");
                o0ooo001.o0ooOO0(32);
                o00o0o2.f42544OooOOO0.Oooo000(oooO0o.f42562OooO00o);
                o0OOo000 o0ooo002 = o00o0o2.f42544OooOOO0;
                for (long j2 : oooO0o.f42563OooO0O0) {
                    o0ooo002.o0ooOO0(32);
                    o0ooo002.Ooooo00(j2);
                }
                o00o0o2.f42544OooOOO0.o0ooOO0(10);
                if (z) {
                    long j3 = o00o0o2.f42549OooOOoo;
                    o00o0o2.f42549OooOOoo = 1 + j3;
                    oooO0o.f42568OooO0oO = j3;
                }
            } else {
                o00o0o2.f42543OooOOO.remove(oooO0o.f42562OooO00o);
                o0OOo000 o0ooo003 = o00o0o2.f42544OooOOO0;
                o0ooo003.Oooo000("REMOVE");
                o0ooo003.o0ooOO0(32);
                o00o0o2.f42544OooOOO0.Oooo000(oooO0o.f42562OooO00o);
                o00o0o2.f42544OooOOO0.o0ooOO0(10);
            }
            o00o0o2.f42544OooOOO0.flush();
            if (o00o0o2.f42542OooOO0o > o00o0o2.f42540OooOO0 || o00o0o2.OooOo0()) {
                o00o0o2.f42551OooOo00.execute(o00o0o2.f42550OooOo0);
            }
        }
    }

    public static void Oooo0oO(String str) {
        if (!f42532OooOo0O.matcher(str).matches()) {
            throw new IllegalArgumentException(o000oOoO.OooO0O0("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final synchronized void OooO0OO() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized OooO0OO OooO0oO(long j, String str) throws IOException {
        OooOo00();
        OooO0OO();
        Oooo0oO(str);
        OooO0o oooO0o = this.f42543OooOOO.get(str);
        if (j != -1 && (oooO0o == null || oooO0o.f42568OooO0oO != j)) {
            return null;
        }
        if (oooO0o != null && oooO0o.f42566OooO0o != null) {
            return null;
        }
        o0OOo000 o0ooo001 = this.f42544OooOOO0;
        o0ooo001.Oooo000("DIRTY");
        o0ooo001.o0ooOO0(32);
        o0ooo001.Oooo000(str);
        o0ooo001.o0ooOO0(10);
        this.f42544OooOOO0.flush();
        if (this.f42546OooOOOo) {
            return null;
        }
        if (oooO0o == null) {
            oooO0o = new OooO0o(str);
            this.f42543OooOOO.put(str, oooO0o);
        }
        OooO0OO oooO0OO = new OooO0OO(oooO0o);
        oooO0o.f42566OooO0o = oooO0OO;
        return oooO0OO;
    }

    public final synchronized OooO OooOOo(String str) throws IOException {
        OooOo00();
        OooO0OO();
        Oooo0oO(str);
        OooO0o oooO0o = this.f42543OooOOO.get(str);
        if (oooO0o != null && oooO0o.f42567OooO0o0) {
            OooO oooOOooO00o = oooO0o.OooO00o();
            if (oooOOooO00o == null) {
                return null;
            }
            this.f42545OooOOOO++;
            o0OOo000 o0ooo001 = this.f42544OooOOO0;
            o0ooo001.Oooo000("READ");
            o0ooo001.o0ooOO0(32);
            o0ooo001.Oooo000(str);
            o0ooo001.o0ooOO0(10);
            if (OooOo0()) {
                this.f42551OooOo00.execute(this.f42550OooOo0);
            }
            return oooOOooO00o;
        }
        return null;
    }

    public final o0OOo000 OooOo() throws FileNotFoundException {
        o0OOO0OO o0ooo0ooOooO0o0;
        File file = this.f42536OooO0o;
        ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).getClass();
        try {
            Logger logger = o0OOO00.f59784OooO00o;
            Intrinsics.checkNotNullParameter(file, "<this>");
            o0ooo0ooOooO0o0 = o0OO.OooO0o0(new FileOutputStream(file, true));
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = o0OOO00.f59784OooO00o;
            Intrinsics.checkNotNullParameter(file, "<this>");
            o0ooo0ooOooO0o0 = o0OO.OooO0o0(new FileOutputStream(file, true));
        }
        return o0OO.OooO00o(new o00Oo0(this, o0ooo0ooOooO0o0));
    }

    public final boolean OooOo0() {
        int i = this.f42545OooOOOO;
        return i >= 2000 && i >= this.f42543OooOOO.size();
    }

    public final synchronized void OooOo00() throws IOException {
        if (this.f42548OooOOo0) {
            return;
        }
        o0OOO00.OooO00o oooO00o = this.f42535OooO0Oo;
        File file = this.f42539OooO0oo;
        ((o0OOO00.OooO00o.C0446OooO00o) oooO00o).getClass();
        if (file.exists()) {
            o0OOO00.OooO00o oooO00o2 = this.f42535OooO0Oo;
            File file2 = this.f42536OooO0o;
            ((o0OOO00.OooO00o.C0446OooO00o) oooO00o2).getClass();
            if (file2.exists()) {
                ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).OooO00o(this.f42539OooO0oo);
            } else {
                ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).OooO0OO(this.f42539OooO0oo, this.f42536OooO0o);
            }
        }
        o0OOO00.OooO00o oooO00o3 = this.f42535OooO0Oo;
        File file3 = this.f42536OooO0o;
        ((o0OOO00.OooO00o.C0446OooO00o) oooO00o3).getClass();
        if (!file3.exists()) {
            Oooo0O0();
            this.f42548OooOOo0 = true;
            return;
        }
        try {
            Oooo00o();
            OooOooo();
            this.f42548OooOOo0 = true;
            return;
        } catch (IOException e) {
            o0OO00O o0oo00o2 = o0OO00O.f42574OooO00o;
            String str = "DiskLruCache " + this.f42537OooO0o0 + " is corrupt: " + e.getMessage() + ", removing";
            o0oo00o2.getClass();
            System.out.println(str);
            close();
            ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).OooO0O0(this.f42537OooO0o0);
            this.f42547OooOOo = false;
            Oooo0O0();
            this.f42548OooOOo0 = true;
            return;
        }
        throw th;
    }

    public final void OooOooo() throws IOException {
        File file = this.f42538OooO0oO;
        o0OOO00.OooO00o oooO00o = this.f42535OooO0Oo;
        ((o0OOO00.OooO00o.C0446OooO00o) oooO00o).OooO00o(file);
        Iterator<OooO0o> it = this.f42543OooOOO.values().iterator();
        while (it.hasNext()) {
            OooO0o next = it.next();
            OooO0OO oooO0OO = next.f42566OooO0o;
            int i = this.f42541OooOO0O;
            int i2 = 0;
            if (oooO0OO == null) {
                while (i2 < i) {
                    this.f42542OooOO0o += next.f42563OooO0O0[i2];
                    i2++;
                }
            } else {
                next.f42566OooO0o = null;
                while (i2 < i) {
                    ((o0OOO00.OooO00o.C0446OooO00o) oooO00o).OooO00o(next.f42564OooO0OO[i2]);
                    ((o0OOO00.OooO00o.C0446OooO00o) oooO00o).OooO00o(next.f42565OooO0Oo[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void Oooo0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, OooO0o> linkedHashMap = this.f42543OooOOO;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        OooO0o oooO0o = linkedHashMap.get(strSubstring);
        if (oooO0o == null) {
            oooO0o = new OooO0o(strSubstring);
            linkedHashMap.put(strSubstring, oooO0o);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                oooO0o.f42566OooO0o = new OooO0OO(oooO0o);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        oooO0o.f42567OooO0o0 = true;
        oooO0o.f42566OooO0o = null;
        if (strArrSplit.length != o00O0O.this.f42541OooOO0O) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                oooO0o.f42563OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final void Oooo00o() throws IOException {
        File file = this.f42536OooO0o;
        ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).getClass();
        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(o0OO.OooO0oO(file));
        try {
            String strOoooO0O = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O2 = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O3 = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O4 = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O5 = o0o0000VarOooO0O0.OoooO0O();
            if (!"libcore.io.DiskLruCache".equals(strOoooO0O) || !"1".equals(strOoooO0O2) || !Integer.toString(this.f42534OooO).equals(strOoooO0O3) || !Integer.toString(this.f42541OooOO0O).equals(strOoooO0O4) || !"".equals(strOoooO0O5)) {
                throw new IOException("unexpected journal header: [" + strOoooO0O + ", " + strOoooO0O2 + ", " + strOoooO0O4 + ", " + strOoooO0O5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    Oooo0(o0o0000VarOooO0O0.OoooO0O());
                    i++;
                } catch (EOFException unused) {
                    this.f42545OooOOOO = i - this.f42543OooOOO.size();
                    if (o0o0000VarOooO0O0.o00oO0O()) {
                        this.f42544OooOOO0 = OooOo();
                    } else {
                        Oooo0O0();
                    }
                    o000OOo.OooO0O0(o0o0000VarOooO0O0);
                    return;
                }
            }
        } catch (Throwable th) {
            o000OOo.OooO0O0(o0o0000VarOooO0O0);
            throw th;
        }
    }

    public final synchronized void Oooo0O0() throws IOException {
        o0OOO0OO o0ooo0ooOooO0o0;
        try {
            o0OOo000 o0ooo001 = this.f42544OooOOO0;
            if (o0ooo001 != null) {
                o0ooo001.close();
            }
            o0OOO00.OooO00o oooO00o = this.f42535OooO0Oo;
            File file = this.f42538OooO0oO;
            ((o0OOO00.OooO00o.C0446OooO00o) oooO00o).getClass();
            try {
                Logger logger = o0OOO00.f59784OooO00o;
                Intrinsics.checkNotNullParameter(file, "<this>");
                Intrinsics.checkNotNullParameter(file, "<this>");
                o0ooo0ooOooO0o0 = o0OO.OooO0o0(new FileOutputStream(file, false));
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = o0OOO00.f59784OooO00o;
                Intrinsics.checkNotNullParameter(file, "<this>");
                Intrinsics.checkNotNullParameter(file, "<this>");
                o0ooo0ooOooO0o0 = o0OO.OooO0o0(new FileOutputStream(file, false));
            }
            o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(o0ooo0ooOooO0o0);
            try {
                o0ooo000OooO00o.Oooo000("libcore.io.DiskLruCache");
                o0ooo000OooO00o.o0ooOO0(10);
                o0ooo000OooO00o.Oooo000("1");
                o0ooo000OooO00o.o0ooOO0(10);
                o0ooo000OooO00o.Ooooo00(this.f42534OooO).o0ooOO0(10);
                o0ooo000OooO00o.Ooooo00(this.f42541OooOO0O).o0ooOO0(10);
                o0ooo000OooO00o.o0ooOO0(10);
                for (OooO0o oooO0o : this.f42543OooOOO.values()) {
                    if (oooO0o.f42566OooO0o != null) {
                        o0ooo000OooO00o.Oooo000("DIRTY");
                        o0ooo000OooO00o.o0ooOO0(32);
                        o0ooo000OooO00o.Oooo000(oooO0o.f42562OooO00o);
                        o0ooo000OooO00o.o0ooOO0(10);
                    } else {
                        o0ooo000OooO00o.Oooo000("CLEAN");
                        o0ooo000OooO00o.o0ooOO0(32);
                        o0ooo000OooO00o.Oooo000(oooO0o.f42562OooO00o);
                        for (long j : oooO0o.f42563OooO0O0) {
                            o0ooo000OooO00o.o0ooOO0(32);
                            o0ooo000OooO00o.Ooooo00(j);
                        }
                        o0ooo000OooO00o.o0ooOO0(10);
                    }
                }
                o0ooo000OooO00o.close();
                o0OOO00.OooO00o oooO00o2 = this.f42535OooO0Oo;
                File file2 = this.f42536OooO0o;
                ((o0OOO00.OooO00o.C0446OooO00o) oooO00o2).getClass();
                if (file2.exists()) {
                    ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).OooO0OO(this.f42536OooO0o, this.f42539OooO0oo);
                }
                ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).OooO0OO(this.f42538OooO0oO, this.f42536OooO0o);
                ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).OooO00o(this.f42539OooO0oo);
                this.f42544OooOOO0 = OooOo();
                this.f42546OooOOOo = false;
            } catch (Throwable th) {
                o0ooo000OooO00o.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void Oooo0OO(OooO0o oooO0o) throws IOException {
        OooO0OO oooO0OO = oooO0o.f42566OooO0o;
        if (oooO0OO != null) {
            oooO0OO.f42559OooO0OO = true;
        }
        for (int i = 0; i < this.f42541OooOO0O; i++) {
            ((o0OOO00.OooO00o.C0446OooO00o) this.f42535OooO0Oo).OooO00o(oooO0o.f42564OooO0OO[i]);
            long j = this.f42542OooOO0o;
            long[] jArr = oooO0o.f42563OooO0O0;
            this.f42542OooOO0o = j - jArr[i];
            jArr[i] = 0;
        }
        this.f42545OooOOOO++;
        o0OOo000 o0ooo001 = this.f42544OooOOO0;
        o0ooo001.Oooo000("REMOVE");
        o0ooo001.o0ooOO0(32);
        String str = oooO0o.f42562OooO00o;
        o0ooo001.Oooo000(str);
        o0ooo001.o0ooOO0(10);
        this.f42543OooOOO.remove(str);
        if (OooOo0()) {
            this.f42551OooOo00.execute(this.f42550OooOo0);
        }
    }

    public final void Oooo0o0() throws IOException {
        while (this.f42542OooOO0o > this.f42540OooOO0) {
            Oooo0OO(this.f42543OooOOO.values().iterator().next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f42548OooOOo0 && !this.f42547OooOOo) {
            for (OooO0o oooO0o : (OooO0o[]) this.f42543OooOOO.values().toArray(new OooO0o[this.f42543OooOOO.size()])) {
                OooO0OO oooO0OO = oooO0o.f42566OooO0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o();
                }
            }
            Oooo0o0();
            this.f42544OooOOO0.close();
            this.f42544OooOOO0 = null;
            this.f42547OooOOo = true;
            return;
        }
        this.f42547OooOOo = true;
    }

    public final synchronized boolean isClosed() {
        return this.f42547OooOOo;
    }
}
