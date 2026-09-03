package p336o0OO0oo0;

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
import p659o0oooO00.o00;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OO0O;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O0000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o implements Closeable {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final Pattern f43264OooOo0O = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0O0 f43265OooOo0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f43266OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OO.OooO00o f43267OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final File f43268OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final File f43269OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final File f43270OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final File f43271OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f43272OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f43273OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f43274OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final LinkedHashMap<String, C0456OooO0o> f43275OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o00 f43276OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f43277OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f43278OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f43279OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f43280OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f43281OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooO00o f43282OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Executor f43283OooOo00;

    public final class OooO implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f43284OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o00O00[] f43285OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f43286OooO0o0;

        public OooO(String str, long j, o00O00[] o00o00Arr) {
            this.f43284OooO0Oo = str;
            this.f43286OooO0o0 = j;
            this.f43285OooO0o = o00o00Arr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (o00O00 o00o01 : this.f43285OooO0o) {
                o000oOoO.OooO0O0(o00o01);
            }
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (OooO0o.this) {
                OooO0o oooO0o = OooO0o.this;
                if ((!oooO0o.f43280OooOOo0) || oooO0o.f43279OooOOo) {
                    return;
                }
                try {
                    oooO0o.Oooo0OO();
                    if (OooO0o.this.OooOo00()) {
                        OooO0o.this.Oooo0();
                        OooO0o.this.f43277OooOOOO = 0;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class OooO0O0 implements o00O000 {
        @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p659o0oooO00.o00O000, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // p659o0oooO00.o00O000
        public final o00O00O timeout() {
            return o00O00O.f60237OooO0Oo;
        }

        @Override // p659o0oooO00.o00O000
        public final void write(o00000O o00000o, long j) throws IOException {
            o00000o.skip(j);
        }
    }

    public final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C0456OooO0o f43289OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f43290OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f43291OooO0OO;

        public class OooO00o extends OooOO0 {
            public OooO00o(o000O o000o) {
                super(o000o);
            }

            @Override // p336o0OO0oo0.OooOO0
            public final void OooO00o() {
                synchronized (OooO0o.this) {
                    OooO0OO.this.f43291OooO0OO = true;
                }
            }
        }

        public OooO0OO(C0456OooO0o c0456OooO0o) {
            this.f43289OooO00o = c0456OooO0o;
            this.f43290OooO0O0 = c0456OooO0o.f43299OooO0o0 ? null : new boolean[OooO0o.this.f43273OooOO0O];
        }

        public final void OooO00o() throws IOException {
            synchronized (OooO0o.this) {
                OooO0o.OooO00o(OooO0o.this, this, false);
            }
        }

        public final void OooO0O0() throws IOException {
            synchronized (OooO0o.this) {
                if (this.f43291OooO0OO) {
                    OooO0o.OooO00o(OooO0o.this, this, false);
                    OooO0o.this.Oooo0O0(this.f43289OooO00o);
                } else {
                    OooO0o.OooO00o(OooO0o.this, this, true);
                }
            }
        }

        public final o00O000 OooO0OO(int i) throws IOException {
            o000O o000oOooO0o0;
            OooO00o oooO00o;
            synchronized (OooO0o.this) {
                C0456OooO0o c0456OooO0o = this.f43289OooO00o;
                if (c0456OooO0o.f43298OooO0o != this) {
                    throw new IllegalStateException();
                }
                if (!c0456OooO0o.f43299OooO0o0) {
                    this.f43290OooO0O0[i] = true;
                }
                File file = c0456OooO0o.f43297OooO0Oo[i];
                try {
                    ((o0OO.OooO00o.C0452OooO00o) OooO0o.this.f43267OooO0Oo).getClass();
                    try {
                        Logger logger = o000OO0O.f60223OooO00o;
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        o000oOooO0o0 = o000O0Oo.OooO0o0(new FileOutputStream(file, false));
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        Logger logger2 = o000OO0O.f60223OooO00o;
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        o000oOooO0o0 = o000O0Oo.OooO0o0(new FileOutputStream(file, false));
                    }
                    oooO00o = new OooO00o(o000oOooO0o0);
                } catch (FileNotFoundException unused2) {
                    return OooO0o.f43265OooOo0o;
                }
            }
            return oooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OO0oo0.OooO0o$OooO0o, reason: collision with other inner class name */
    public final class C0456OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f43294OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f43295OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final File[] f43296OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File[] f43297OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0OO f43298OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f43299OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f43300OooO0oO;

        public C0456OooO0o(String str) {
            this.f43294OooO00o = str;
            int i = OooO0o.this.f43273OooOO0O;
            this.f43295OooO0O0 = new long[i];
            this.f43296OooO0OO = new File[i];
            this.f43297OooO0Oo = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < OooO0o.this.f43273OooOO0O; i2++) {
                sb.append(i2);
                File[] fileArr = this.f43296OooO0OO;
                String string = sb.toString();
                File file = OooO0o.this.f43269OooO0o0;
                fileArr[i2] = new File(file, string);
                sb.append(".tmp");
                this.f43297OooO0Oo[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final OooO OooO00o() throws CloneNotSupportedException {
            o00O00 o00o01;
            OooO0o oooO0o = OooO0o.this;
            if (!Thread.holdsLock(oooO0o)) {
                throw new AssertionError();
            }
            o00O00[] o00o00Arr = new o00O00[oooO0o.f43273OooOO0O];
            this.f43295OooO0O0.clone();
            for (int i = 0; i < oooO0o.f43273OooOO0O; i++) {
                try {
                    o0OO.OooO00o oooO00o = oooO0o.f43267OooO0Oo;
                    File file = this.f43296OooO0OO[i];
                    ((o0OO.OooO00o.C0452OooO00o) oooO00o).getClass();
                    o00o00Arr[i] = o000O0Oo.OooO0oO(file);
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < oooO0o.f43273OooOO0O && (o00o01 = o00o00Arr[i2]) != null; i2++) {
                        o000oOoO.OooO0O0(o00o01);
                    }
                    return null;
                }
            }
            return oooO0o.new OooO(this.f43294OooO00o, this.f43300OooO0oO, o00o00Arr);
        }
    }

    public OooO0o(File file, long j, ThreadPoolExecutor threadPoolExecutor) {
        o0OO.OooO00o.C0452OooO00o c0452OooO00o = o0OO.OooO00o.f42977OooO00o;
        this.f43274OooOO0o = 0L;
        this.f43275OooOOO = new LinkedHashMap<>(0, 0.75f, true);
        this.f43281OooOOoo = 0L;
        this.f43282OooOo0 = new OooO00o();
        this.f43267OooO0Oo = c0452OooO00o;
        this.f43269OooO0o0 = file;
        this.f43266OooO = 201105;
        this.f43268OooO0o = new File(file, "journal");
        this.f43270OooO0oO = new File(file, "journal.tmp");
        this.f43271OooO0oo = new File(file, "journal.bkp");
        this.f43273OooOO0O = 2;
        this.f43272OooOO0 = j;
        this.f43283OooOo00 = threadPoolExecutor;
    }

    public static void OooO00o(OooO0o oooO0o, OooO0OO oooO0OO, boolean z) throws IOException {
        synchronized (oooO0o) {
            C0456OooO0o c0456OooO0o = oooO0OO.f43289OooO00o;
            if (c0456OooO0o.f43298OooO0o != oooO0OO) {
                throw new IllegalStateException();
            }
            if (z && !c0456OooO0o.f43299OooO0o0) {
                for (int i = 0; i < oooO0o.f43273OooOO0O; i++) {
                    if (!oooO0OO.f43290OooO0O0[i]) {
                        oooO0OO.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    o0OO.OooO00o oooO00o = oooO0o.f43267OooO0Oo;
                    File file = c0456OooO0o.f43297OooO0Oo[i];
                    ((o0OO.OooO00o.C0452OooO00o) oooO00o).getClass();
                    if (!file.exists()) {
                        oooO0OO.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < oooO0o.f43273OooOO0O; i2++) {
                File file2 = c0456OooO0o.f43297OooO0Oo[i2];
                if (z) {
                    ((o0OO.OooO00o.C0452OooO00o) oooO0o.f43267OooO0Oo).getClass();
                    if (file2.exists()) {
                        File file3 = c0456OooO0o.f43296OooO0OO[i2];
                        ((o0OO.OooO00o.C0452OooO00o) oooO0o.f43267OooO0Oo).OooO0OO(file2, file3);
                        long j = c0456OooO0o.f43295OooO0O0[i2];
                        ((o0OO.OooO00o.C0452OooO00o) oooO0o.f43267OooO0Oo).getClass();
                        long length = file3.length();
                        c0456OooO0o.f43295OooO0O0[i2] = length;
                        oooO0o.f43274OooOO0o = (oooO0o.f43274OooOO0o - j) + length;
                    }
                } else {
                    ((o0OO.OooO00o.C0452OooO00o) oooO0o.f43267OooO0Oo).OooO00o(file2);
                }
            }
            oooO0o.f43277OooOOOO++;
            c0456OooO0o.f43298OooO0o = null;
            if (c0456OooO0o.f43299OooO0o0 || z) {
                c0456OooO0o.f43299OooO0o0 = true;
                o00 o00Var = oooO0o.f43276OooOOO0;
                o00Var.OooOooo("CLEAN");
                o00Var.o00oO0o(32);
                oooO0o.f43276OooOOO0.OooOooo(c0456OooO0o.f43294OooO00o);
                o00 o00Var2 = oooO0o.f43276OooOOO0;
                for (long j2 : c0456OooO0o.f43295OooO0O0) {
                    o00Var2.o00oO0o(32);
                    o00Var2.Ooooo00(j2);
                }
                oooO0o.f43276OooOOO0.o00oO0o(10);
                if (z) {
                    long j3 = oooO0o.f43281OooOOoo;
                    oooO0o.f43281OooOOoo = 1 + j3;
                    c0456OooO0o.f43300OooO0oO = j3;
                }
            } else {
                oooO0o.f43275OooOOO.remove(c0456OooO0o.f43294OooO00o);
                o00 o00Var3 = oooO0o.f43276OooOOO0;
                o00Var3.OooOooo("REMOVE");
                o00Var3.o00oO0o(32);
                oooO0o.f43276OooOOO0.OooOooo(c0456OooO0o.f43294OooO00o);
                oooO0o.f43276OooOOO0.o00oO0o(10);
            }
            oooO0o.f43276OooOOO0.flush();
            if (oooO0o.f43274OooOO0o > oooO0o.f43272OooOO0 || oooO0o.OooOo00()) {
                oooO0o.f43283OooOo00.execute(oooO0o.f43282OooOo0);
            }
        }
    }

    public static void Oooo0o0(String str) {
        if (!f43264OooOo0O.matcher(str).matches()) {
            throw new IllegalArgumentException(o000oOoO.OooO00o("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final synchronized void OooO0OO() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized OooO0OO OooO0oO(long j, String str) throws IOException {
        OooOOo();
        OooO0OO();
        Oooo0o0(str);
        C0456OooO0o c0456OooO0o = this.f43275OooOOO.get(str);
        if (j != -1 && (c0456OooO0o == null || c0456OooO0o.f43300OooO0oO != j)) {
            return null;
        }
        if (c0456OooO0o != null && c0456OooO0o.f43298OooO0o != null) {
            return null;
        }
        o00 o00Var = this.f43276OooOOO0;
        o00Var.OooOooo("DIRTY");
        o00Var.o00oO0o(32);
        o00Var.OooOooo(str);
        o00Var.o00oO0o(10);
        this.f43276OooOOO0.flush();
        if (this.f43278OooOOOo) {
            return null;
        }
        if (c0456OooO0o == null) {
            c0456OooO0o = new C0456OooO0o(str);
            this.f43275OooOOO.put(str, c0456OooO0o);
        }
        OooO0OO oooO0OO = new OooO0OO(c0456OooO0o);
        c0456OooO0o.f43298OooO0o = oooO0OO;
        return oooO0OO;
    }

    public final synchronized void OooOOo() throws IOException {
        if (this.f43280OooOOo0) {
            return;
        }
        o0OO.OooO00o oooO00o = this.f43267OooO0Oo;
        File file = this.f43271OooO0oo;
        ((o0OO.OooO00o.C0452OooO00o) oooO00o).getClass();
        if (file.exists()) {
            o0OO.OooO00o oooO00o2 = this.f43267OooO0Oo;
            File file2 = this.f43268OooO0o;
            ((o0OO.OooO00o.C0452OooO00o) oooO00o2).getClass();
            if (file2.exists()) {
                ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).OooO00o(this.f43271OooO0oo);
            } else {
                ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).OooO0OO(this.f43271OooO0oo, this.f43268OooO0o);
            }
        }
        o0OO.OooO00o oooO00o3 = this.f43267OooO0Oo;
        File file3 = this.f43268OooO0o;
        ((o0OO.OooO00o.C0452OooO00o) oooO00o3).getClass();
        if (!file3.exists()) {
            Oooo0();
            this.f43280OooOOo0 = true;
            return;
        }
        try {
            OooOooO();
            OooOo();
            this.f43280OooOOo0 = true;
            return;
        } catch (IOException e) {
            OooOo oooOo = OooOo.f43307OooO00o;
            String str = "DiskLruCache " + this.f43269OooO0o0 + " is corrupt: " + e.getMessage() + ", removing";
            oooOo.getClass();
            System.out.println(str);
            close();
            ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).OooO0O0(this.f43269OooO0o0);
            this.f43279OooOOo = false;
            Oooo0();
            this.f43280OooOOo0 = true;
            return;
        }
        throw th;
    }

    public final synchronized OooO OooOOo0(String str) throws IOException {
        OooOOo();
        OooO0OO();
        Oooo0o0(str);
        C0456OooO0o c0456OooO0o = this.f43275OooOOO.get(str);
        if (c0456OooO0o != null && c0456OooO0o.f43299OooO0o0) {
            OooO oooOOooO00o = c0456OooO0o.OooO00o();
            if (oooOOooO00o == null) {
                return null;
            }
            this.f43277OooOOOO++;
            o00 o00Var = this.f43276OooOOO0;
            o00Var.OooOooo("READ");
            o00Var.o00oO0o(32);
            o00Var.OooOooo(str);
            o00Var.o00oO0o(10);
            if (OooOo00()) {
                this.f43283OooOo00.execute(this.f43282OooOo0);
            }
            return oooOOooO00o;
        }
        return null;
    }

    public final void OooOo() throws IOException {
        File file = this.f43270OooO0oO;
        o0OO.OooO00o oooO00o = this.f43267OooO0Oo;
        ((o0OO.OooO00o.C0452OooO00o) oooO00o).OooO00o(file);
        Iterator<C0456OooO0o> it = this.f43275OooOOO.values().iterator();
        while (it.hasNext()) {
            C0456OooO0o next = it.next();
            OooO0OO oooO0OO = next.f43298OooO0o;
            int i = this.f43273OooOO0O;
            int i2 = 0;
            if (oooO0OO == null) {
                while (i2 < i) {
                    this.f43274OooOO0o += next.f43295OooO0O0[i2];
                    i2++;
                }
            } else {
                next.f43298OooO0o = null;
                while (i2 < i) {
                    ((o0OO.OooO00o.C0452OooO00o) oooO00o).OooO00o(next.f43296OooO0OO[i2]);
                    ((o0OO.OooO00o.C0452OooO00o) oooO00o).OooO00o(next.f43297OooO0Oo[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final o00 OooOo0() throws FileNotFoundException {
        o000O o000oOooO0o0;
        File file = this.f43268OooO0o;
        ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).getClass();
        try {
            Logger logger = o000OO0O.f60223OooO00o;
            Intrinsics.checkNotNullParameter(file, "<this>");
            o000oOooO0o0 = o000O0Oo.OooO0o0(new FileOutputStream(file, true));
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = o000OO0O.f60223OooO00o;
            Intrinsics.checkNotNullParameter(file, "<this>");
            o000oOooO0o0 = o000O0Oo.OooO0o0(new FileOutputStream(file, true));
        }
        return o000O0Oo.OooO00o(new p336o0OO0oo0.OooO(this, o000oOooO0o0));
    }

    public final boolean OooOo00() {
        int i = this.f43277OooOOOO;
        return i >= 2000 && i >= this.f43275OooOOO.size();
    }

    public final void OooOooO() throws IOException {
        File file = this.f43268OooO0o;
        ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).getClass();
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oO(file));
        try {
            String strOoooO0 = o00o0000OooO0O0.OoooO0();
            String strOoooO1 = o00o0000OooO0O0.OoooO0();
            String strOoooO2 = o00o0000OooO0O0.OoooO0();
            String strOoooO3 = o00o0000OooO0O0.OoooO0();
            String strOoooO4 = o00o0000OooO0O0.OoooO0();
            if (!"libcore.io.DiskLruCache".equals(strOoooO0) || !"1".equals(strOoooO1) || !Integer.toString(this.f43266OooO).equals(strOoooO2) || !Integer.toString(this.f43273OooOO0O).equals(strOoooO3) || !"".equals(strOoooO4)) {
                throw new IOException("unexpected journal header: [" + strOoooO0 + ", " + strOoooO1 + ", " + strOoooO3 + ", " + strOoooO4 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    Oooo00o(o00o0000OooO0O0.OoooO0());
                    i++;
                } catch (EOFException unused) {
                    this.f43277OooOOOO = i - this.f43275OooOOO.size();
                    if (o00o0000OooO0O0.oo000o()) {
                        this.f43276OooOOO0 = OooOo0();
                    } else {
                        Oooo0();
                    }
                    o000oOoO.OooO0O0(o00o0000OooO0O0);
                    return;
                }
            }
        } catch (Throwable th) {
            o000oOoO.OooO0O0(o00o0000OooO0O0);
            throw th;
        }
    }

    public final synchronized void Oooo0() throws IOException {
        o000O o000oOooO0o0;
        try {
            o00 o00Var = this.f43276OooOOO0;
            if (o00Var != null) {
                o00Var.close();
            }
            o0OO.OooO00o oooO00o = this.f43267OooO0Oo;
            File file = this.f43270OooO0oO;
            ((o0OO.OooO00o.C0452OooO00o) oooO00o).getClass();
            try {
                Logger logger = o000OO0O.f60223OooO00o;
                Intrinsics.checkNotNullParameter(file, "<this>");
                Intrinsics.checkNotNullParameter(file, "<this>");
                o000oOooO0o0 = o000O0Oo.OooO0o0(new FileOutputStream(file, false));
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = o000OO0O.f60223OooO00o;
                Intrinsics.checkNotNullParameter(file, "<this>");
                Intrinsics.checkNotNullParameter(file, "<this>");
                o000oOooO0o0 = o000O0Oo.OooO0o0(new FileOutputStream(file, false));
            }
            o00 o00VarOooO00o = o000O0Oo.OooO00o(o000oOooO0o0);
            try {
                o00VarOooO00o.OooOooo("libcore.io.DiskLruCache");
                o00VarOooO00o.o00oO0o(10);
                o00VarOooO00o.OooOooo("1");
                o00VarOooO00o.o00oO0o(10);
                o00VarOooO00o.Ooooo00(this.f43266OooO).o00oO0o(10);
                o00VarOooO00o.Ooooo00(this.f43273OooOO0O).o00oO0o(10);
                o00VarOooO00o.o00oO0o(10);
                for (C0456OooO0o c0456OooO0o : this.f43275OooOOO.values()) {
                    if (c0456OooO0o.f43298OooO0o != null) {
                        o00VarOooO00o.OooOooo("DIRTY");
                        o00VarOooO00o.o00oO0o(32);
                        o00VarOooO00o.OooOooo(c0456OooO0o.f43294OooO00o);
                        o00VarOooO00o.o00oO0o(10);
                    } else {
                        o00VarOooO00o.OooOooo("CLEAN");
                        o00VarOooO00o.o00oO0o(32);
                        o00VarOooO00o.OooOooo(c0456OooO0o.f43294OooO00o);
                        for (long j : c0456OooO0o.f43295OooO0O0) {
                            o00VarOooO00o.o00oO0o(32);
                            o00VarOooO00o.Ooooo00(j);
                        }
                        o00VarOooO00o.o00oO0o(10);
                    }
                }
                o00VarOooO00o.close();
                o0OO.OooO00o oooO00o2 = this.f43267OooO0Oo;
                File file2 = this.f43268OooO0o;
                ((o0OO.OooO00o.C0452OooO00o) oooO00o2).getClass();
                if (file2.exists()) {
                    ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).OooO0OO(this.f43268OooO0o, this.f43271OooO0oo);
                }
                ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).OooO0OO(this.f43270OooO0oO, this.f43268OooO0o);
                ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).OooO00o(this.f43271OooO0oo);
                this.f43276OooOOO0 = OooOo0();
                this.f43278OooOOOo = false;
            } catch (Throwable th) {
                o00VarOooO00o.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void Oooo00o(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, C0456OooO0o> linkedHashMap = this.f43275OooOOO;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C0456OooO0o c0456OooO0o = linkedHashMap.get(strSubstring);
        if (c0456OooO0o == null) {
            c0456OooO0o = new C0456OooO0o(strSubstring);
            linkedHashMap.put(strSubstring, c0456OooO0o);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c0456OooO0o.f43298OooO0o = new OooO0OO(c0456OooO0o);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        c0456OooO0o.f43299OooO0o0 = true;
        c0456OooO0o.f43298OooO0o = null;
        if (strArrSplit.length != OooO0o.this.f43273OooOO0O) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c0456OooO0o.f43295OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final void Oooo0O0(C0456OooO0o c0456OooO0o) throws IOException {
        OooO0OO oooO0OO = c0456OooO0o.f43298OooO0o;
        if (oooO0OO != null) {
            oooO0OO.f43291OooO0OO = true;
        }
        for (int i = 0; i < this.f43273OooOO0O; i++) {
            ((o0OO.OooO00o.C0452OooO00o) this.f43267OooO0Oo).OooO00o(c0456OooO0o.f43296OooO0OO[i]);
            long j = this.f43274OooOO0o;
            long[] jArr = c0456OooO0o.f43295OooO0O0;
            this.f43274OooOO0o = j - jArr[i];
            jArr[i] = 0;
        }
        this.f43277OooOOOO++;
        o00 o00Var = this.f43276OooOOO0;
        o00Var.OooOooo("REMOVE");
        o00Var.o00oO0o(32);
        String str = c0456OooO0o.f43294OooO00o;
        o00Var.OooOooo(str);
        o00Var.o00oO0o(10);
        this.f43275OooOOO.remove(str);
        if (OooOo00()) {
            this.f43283OooOo00.execute(this.f43282OooOo0);
        }
    }

    public final void Oooo0OO() throws IOException {
        while (this.f43274OooOO0o > this.f43272OooOO0) {
            Oooo0O0(this.f43275OooOOO.values().iterator().next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f43280OooOOo0 && !this.f43279OooOOo) {
            for (C0456OooO0o c0456OooO0o : (C0456OooO0o[]) this.f43275OooOOO.values().toArray(new C0456OooO0o[this.f43275OooOOO.size()])) {
                OooO0OO oooO0OO = c0456OooO0o.f43298OooO0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o();
                }
            }
            Oooo0OO();
            this.f43276OooOOO0.close();
            this.f43276OooOOO0 = null;
            this.f43279OooOOo = true;
            return;
        }
        this.f43279OooOOo = true;
    }

    public final synchronized boolean isClosed() {
        return this.f43279OooOOo;
    }
}
