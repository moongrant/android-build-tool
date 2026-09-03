package p413o0Oo0o0O;

import com.zego.zegoavkit2.ZegoConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p016OooOoO0.OooOo00;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements Closeable {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final Pattern f39375OooooOO = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final OooO0OO f39376OooooOo = new OooO0OO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final File f39377Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final p415o0Oo0oO.OooOO0 f39378Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final File f39379Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final File f39380Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f39381OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f39382OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final File f39383OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f39384OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f39385OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final LinkedHashMap<String, OooO> f39386OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f39387OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f39388OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f39389OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f39390OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f39391Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final Executor f39392Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final OooO00o f39393OooooO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o0O00O f39394o000oOoO;

    public final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f39395OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f39396OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final File[] f39397OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File[] f39398OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0o f39399OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f39400OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f39401OooO0oO;

        public OooO(String str) {
            this.f39395OooO00o = str;
            int i = oo000o.this.f39381OoooO;
            this.f39396OooO0O0 = new long[i];
            this.f39397OooO0OO = new File[i];
            this.f39398OooO0Oo = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < oo000o.this.f39381OoooO; i2++) {
                sb.append(i2);
                this.f39397OooO0OO[i2] = new File(oo000o.this.f39379Oooo0oO, sb.toString());
                sb.append(".tmp");
                this.f39398OooO0Oo[i2] = new File(oo000o.this.f39379Oooo0oO, sb.toString());
                sb.setLength(length);
            }
        }

        public final IOException OooO00o(String[] strArr) throws IOException {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unexpected journal line: ");
            sbOooO0o0.append(Arrays.toString(strArr));
            throw new IOException(sbOooO0o0.toString());
        }

        public final OooOO0 OooO0O0() throws CloneNotSupportedException {
            if (!Thread.holdsLock(oo000o.this)) {
                throw new AssertionError();
            }
            o0O0O0O[] o0o0o0oArr = new o0O0O0O[oo000o.this.f39381OoooO];
            this.f39396OooO0O0.clone();
            int i = 0;
            while (true) {
                try {
                    oo000o oo000oVar = oo000o.this;
                    if (i >= oo000oVar.f39381OoooO) {
                        return oo000oVar.new OooOO0(this.f39395OooO00o, this.f39401OooO0oO, o0o0o0oArr);
                    }
                    p415o0Oo0oO.OooOO0 oooOO1 = oo000oVar.f39378Oooo0o;
                    File file = this.f39397OooO0OO[i];
                    Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO1);
                    o0o0o0oArr[i] = o0O000Oo.OooO0oo(file);
                    i++;
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < oo000o.this.f39381OoooO && o0o0o0oArr[i2] != null; i2++) {
                        o000000.OooO0OO(o0o0o0oArr[i2]);
                    }
                    return null;
                }
            }
        }

        public final void OooO0OO(oo00oO oo00oo) throws IOException {
            for (long j : this.f39396OooO0O0) {
                oo00oo.Oooo000(32).o0000O0(j);
            }
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (oo000o.this) {
                oo000o oo000oVar = oo000o.this;
                if ((!oo000oVar.f39389OoooOoO) || oo000oVar.f39390OoooOoo) {
                    return;
                }
                try {
                    oo000oVar.Oooo00o();
                    if (oo000o.this.OooOOO()) {
                        oo000o.this.OooOoOO();
                        oo000o.this.f39387OoooOOo = 0;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public class OooO0O0 extends o00oO0o {
        public OooO0O0(o0O00o00 o0o00o01) {
            super(o0o00o01);
        }

        @Override // p413o0Oo0o0O.o00oO0o
        public final void OooO00o() {
            oo000o.this.f39388OoooOo0 = true;
        }
    }

    public static class OooO0OO implements o0O00o00 {
        @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // p674o0oooo0.o0O00o00
        public final o0oO0O0o timeout() {
            return o0oO0O0o.f52090OooO0Oo;
        }

        @Override // p674o0oooo0.o0O00o00
        public final void write(o0oOO o0ooo2, long j) throws IOException {
            o0ooo2.skip(j);
        }
    }

    public final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO f39405OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f39406OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f39407OooO0OO;

        public class OooO00o extends o00oO0o {
            public OooO00o(o0O00o00 o0o00o01) {
                super(o0o00o01);
            }

            @Override // p413o0Oo0o0O.o00oO0o
            public final void OooO00o() {
                synchronized (oo000o.this) {
                    OooO0o.this.f39407OooO0OO = true;
                }
            }
        }

        public OooO0o(OooO oooO) {
            this.f39405OooO00o = oooO;
            this.f39406OooO0O0 = oooO.f39400OooO0o0 ? null : new boolean[oo000o.this.f39381OoooO];
        }

        public final void OooO00o() throws IOException {
            synchronized (oo000o.this) {
                oo000o.OooO00o(oo000o.this, this, false);
            }
        }

        public final void OooO0O0() throws IOException {
            synchronized (oo000o.this) {
                if (this.f39407OooO0OO) {
                    oo000o.OooO00o(oo000o.this, this, false);
                    oo000o.this.OooOoo(this.f39405OooO00o);
                } else {
                    oo000o.OooO00o(oo000o.this, this, true);
                }
            }
        }

        public final o0O00o00 OooO0OO(int i) throws IOException {
            o0O00o00 o0o00o00OooO0oO;
            OooO00o oooO00o;
            synchronized (oo000o.this) {
                OooO oooO = this.f39405OooO00o;
                if (oooO.f39399OooO0o != this) {
                    throw new IllegalStateException();
                }
                if (!oooO.f39400OooO0o0) {
                    this.f39406OooO0O0[i] = true;
                }
                File file = oooO.f39398OooO0Oo[i];
                try {
                    Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oo000o.this.f39378Oooo0o);
                    try {
                        o0o00o00OooO0oO = o0O000Oo.OooO0oO(file);
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        o0o00o00OooO0oO = o0O000Oo.OooO0oO(file);
                    }
                    oooO00o = new OooO00o(o0o00o00OooO0oO);
                } catch (FileNotFoundException unused2) {
                    return oo000o.f39376OooooOo;
                }
            }
            return oooO00o;
        }
    }

    public final class OooOO0 implements Closeable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final String f39411Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final long f39412Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final o0O0O0O[] f39413Oooo0oo;

        public OooOO0(String str, long j, o0O0O0O[] o0o0o0oArr) {
            this.f39411Oooo0o = str;
            this.f39412Oooo0oO = j;
            this.f39413Oooo0oo = o0o0o0oArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (o0O0O0O o0o0o0o : this.f39413Oooo0oo) {
                o000000.OooO0OO(o0o0o0o);
            }
        }
    }

    public oo000o(File file, long j, Executor executor) {
        o0Oo0oO.OooOO0.OooO00o oooO00o = p415o0Oo0oO.OooOO0.f39561OooO00o;
        this.f39385OoooOO0 = 0L;
        this.f39386OoooOOO = new LinkedHashMap<>(0, 0.75f, true);
        this.f39391Ooooo00 = 0L;
        this.f39393OooooO0 = new OooO00o();
        this.f39378Oooo0o = oooO00o;
        this.f39379Oooo0oO = file;
        this.f39382OoooO0 = 201105;
        this.f39380Oooo0oo = new File(file, "journal");
        this.f39377Oooo = new File(file, "journal.tmp");
        this.f39383OoooO00 = new File(file, "journal.bkp");
        this.f39381OoooO = 2;
        this.f39384OoooO0O = j;
        this.f39392Ooooo0o = executor;
    }

    public static void OooO00o(oo000o oo000oVar, OooO0o oooO0o, boolean z) throws IOException {
        synchronized (oo000oVar) {
            OooO oooO = oooO0o.f39405OooO00o;
            if (oooO.f39399OooO0o != oooO0o) {
                throw new IllegalStateException();
            }
            if (z && !oooO.f39400OooO0o0) {
                for (int i = 0; i < oo000oVar.f39381OoooO; i++) {
                    if (!oooO0o.f39406OooO0O0[i]) {
                        oooO0o.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    p415o0Oo0oO.OooOO0 oooOO1 = oo000oVar.f39378Oooo0o;
                    File file = oooO.f39398OooO0Oo[i];
                    Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO1);
                    if (!file.exists()) {
                        oooO0o.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < oo000oVar.f39381OoooO; i2++) {
                File file2 = oooO.f39398OooO0Oo[i2];
                if (z) {
                    Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oo000oVar.f39378Oooo0o);
                    if (file2.exists()) {
                        File file3 = oooO.f39397OooO0OO[i2];
                        ((o0Oo0oO.OooOO0.OooO00o) oo000oVar.f39378Oooo0o).OooO0OO(file2, file3);
                        long j = oooO.f39396OooO0O0[i2];
                        Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oo000oVar.f39378Oooo0o);
                        long length = file3.length();
                        oooO.f39396OooO0O0[i2] = length;
                        oo000oVar.f39385OoooOO0 = (oo000oVar.f39385OoooOO0 - j) + length;
                    }
                } else {
                    ((o0Oo0oO.OooOO0.OooO00o) oo000oVar.f39378Oooo0o).OooO00o(file2);
                }
            }
            oo000oVar.f39387OoooOOo++;
            oooO.f39399OooO0o = null;
            if (oooO.f39400OooO0o0 || z) {
                oooO.f39400OooO0o0 = true;
                o0O00O o0o00o2 = oo000oVar.f39394o000oOoO;
                o0o00o2.OoooOoo("CLEAN");
                o0o00o2.Oooo000(32);
                oo000oVar.f39394o000oOoO.OoooOoo(oooO.f39395OooO00o);
                oooO.OooO0OO(oo000oVar.f39394o000oOoO);
                oo000oVar.f39394o000oOoO.Oooo000(10);
                if (z) {
                    long j2 = oo000oVar.f39391Ooooo00;
                    oo000oVar.f39391Ooooo00 = 1 + j2;
                    oooO.f39401OooO0oO = j2;
                }
            } else {
                oo000oVar.f39386OoooOOO.remove(oooO.f39395OooO00o);
                o0O00O o0o00o3 = oo000oVar.f39394o000oOoO;
                o0o00o3.OoooOoo("REMOVE");
                o0o00o3.Oooo000(32);
                oo000oVar.f39394o000oOoO.OoooOoo(oooO.f39395OooO00o);
                oo000oVar.f39394o000oOoO.Oooo000(10);
            }
            oo000oVar.f39394o000oOoO.flush();
            if (oo000oVar.f39385OoooOO0 > oo000oVar.f39384OoooO0O || oo000oVar.OooOOO()) {
                oo000oVar.f39392Ooooo0o.execute(oo000oVar.f39393OooooO0);
            }
        }
    }

    public final synchronized void OooO0O0() {
        try {
            synchronized (this) {
            }
        } catch (Throwable th) {
            throw th;
        }
        if (this.f39390OoooOoo) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized OooO0o OooO0Oo(String str, long j) throws IOException {
        OooO0oo();
        OooO0O0();
        Oooo0(str);
        OooO oooO = this.f39386OoooOOO.get(str);
        if (j != -1 && (oooO == null || oooO.f39401OooO0oO != j)) {
            return null;
        }
        if (oooO != null && oooO.f39399OooO0o != null) {
            return null;
        }
        o0O00O o0o00o2 = this.f39394o000oOoO;
        o0o00o2.OoooOoo("DIRTY");
        o0o00o2.Oooo000(32);
        o0o00o2.OoooOoo(str);
        o0o00o2.Oooo000(10);
        this.f39394o000oOoO.flush();
        if (this.f39388OoooOo0) {
            return null;
        }
        if (oooO == null) {
            oooO = new OooO(str);
            this.f39386OoooOOO.put(str, oooO);
        }
        OooO0o oooO0o = new OooO0o(oooO);
        oooO.f39399OooO0o = oooO0o;
        return oooO0o;
    }

    public final synchronized OooOO0 OooO0o(String str) throws IOException {
        OooO0oo();
        OooO0O0();
        Oooo0(str);
        OooO oooO = this.f39386OoooOOO.get(str);
        if (oooO != null && oooO.f39400OooO0o0) {
            OooOO0 oooOO0OooO0O0 = oooO.OooO0O0();
            if (oooOO0OooO0O0 == null) {
                return null;
            }
            this.f39387OoooOOo++;
            o0O00O o0o00o2 = this.f39394o000oOoO;
            o0o00o2.OoooOoo("READ");
            o0o00o2.Oooo000(32);
            o0o00o2.OoooOoo(str);
            o0o00o2.Oooo000(10);
            if (OooOOO()) {
                this.f39392Ooooo0o.execute(this.f39393OooooO0);
            }
            return oooOO0OooO0O0;
        }
        return null;
    }

    public final synchronized void OooO0oo() throws IOException {
        if (this.f39389OoooOoO) {
            return;
        }
        p415o0Oo0oO.OooOO0 oooOO1 = this.f39378Oooo0o;
        File file = this.f39383OoooO00;
        Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO1);
        if (file.exists()) {
            p415o0Oo0oO.OooOO0 oooOO2 = this.f39378Oooo0o;
            File file2 = this.f39380Oooo0oo;
            Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO2);
            if (file2.exists()) {
                ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO00o(this.f39383OoooO00);
            } else {
                ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO0OO(this.f39383OoooO00, this.f39380Oooo0oo);
            }
        }
        p415o0Oo0oO.OooOO0 oooOO3 = this.f39378Oooo0o;
        File file3 = this.f39380Oooo0oo;
        Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO3);
        if (file3.exists()) {
            try {
                OooOo0O();
                OooOOoo();
                this.f39389OoooOoO = true;
                return;
            } catch (IOException e) {
                o0O0O00.f39356OooO00o.OooO0o0("DiskLruCache " + this.f39379Oooo0oO + " is corrupt: " + e.getMessage() + ", removing");
                close();
                ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO0O0(this.f39379Oooo0oO);
                this.f39390OoooOoo = false;
            }
        }
        OooOoOO();
        this.f39389OoooOoO = true;
    }

    public final boolean OooOOO() {
        int i = this.f39387OoooOOo;
        return i >= 2000 && i >= this.f39386OoooOOO.size();
    }

    public final oo00oO OooOOo() throws FileNotFoundException {
        o0O00o00 o0o00o00OooO00o;
        p415o0Oo0oO.OooOO0 oooOO1 = this.f39378Oooo0o;
        File file = this.f39380Oooo0oo;
        Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO1);
        try {
            o0o00o00OooO00o = o0O000Oo.OooO00o(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            o0o00o00OooO00o = o0O000Oo.OooO00o(file);
        }
        return o0O000Oo.OooO0O0(new OooO0O0(o0o00o00OooO00o));
    }

    public final void OooOOoo() throws IOException {
        ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO00o(this.f39377Oooo);
        Iterator<OooO> it = this.f39386OoooOOO.values().iterator();
        while (it.hasNext()) {
            OooO next = it.next();
            int i = 0;
            if (next.f39399OooO0o == null) {
                while (i < this.f39381OoooO) {
                    this.f39385OoooOO0 += next.f39396OooO0O0[i];
                    i++;
                }
            } else {
                next.f39399OooO0o = null;
                while (i < this.f39381OoooO) {
                    ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO00o(next.f39397OooO0OO[i]);
                    ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO00o(next.f39398OooO0Oo[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void OooOo0O() throws IOException {
        p415o0Oo0oO.OooOO0 oooOO1 = this.f39378Oooo0o;
        File file = this.f39380Oooo0oo;
        Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO1);
        o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(o0O000Oo.OooO0oo(file));
        try {
            o0O00OO o0o00oo2 = (o0O00OO) o0ooooOooO0OO;
            String strO0ooOO0 = o0o00oo2.o0ooOO0();
            String strO0ooOO1 = o0o00oo2.o0ooOO0();
            String strO0ooOO2 = o0o00oo2.o0ooOO0();
            String strO0ooOO3 = o0o00oo2.o0ooOO0();
            String strO0ooOO4 = o0o00oo2.o0ooOO0();
            if (!"libcore.io.DiskLruCache".equals(strO0ooOO0) || !"1".equals(strO0ooOO1) || !Integer.toString(this.f39382OoooO0).equals(strO0ooOO2) || !Integer.toString(this.f39381OoooO).equals(strO0ooOO3) || !"".equals(strO0ooOO4)) {
                throw new IOException("unexpected journal header: [" + strO0ooOO0 + ", " + strO0ooOO1 + ", " + strO0ooOO3 + ", " + strO0ooOO4 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    OooOoO(o0o00oo2.o0ooOO0());
                    i++;
                } catch (EOFException unused) {
                    this.f39387OoooOOo = i - this.f39386OoooOOO.size();
                    if (o0o00oo2.OooOooo()) {
                        this.f39394o000oOoO = (o0O00O) OooOOo();
                    } else {
                        OooOoOO();
                    }
                    o000000.OooO0OO(o0ooooOooO0OO);
                    return;
                }
            }
        } catch (Throwable th) {
            o000000.OooO0OO(o0ooooOooO0OO);
            throw th;
        }
    }

    public final void OooOoO(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException(OooOo00.OooO0Oo("unexpected journal line: ", str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f39386OoooOOO.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        OooO oooO = this.f39386OoooOOO.get(strSubstring);
        if (oooO == null) {
            oooO = new OooO(strSubstring);
            this.f39386OoooOOO.put(strSubstring, oooO);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                oooO.f39399OooO0o = new OooO0o(oooO);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException(OooOo00.OooO0Oo("unexpected journal line: ", str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        oooO.f39400OooO0o0 = true;
        oooO.f39399OooO0o = null;
        if (strArrSplit.length != oo000o.this.f39381OoooO) {
            oooO.OooO00o(strArrSplit);
            throw null;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                oooO.f39396OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                oooO.OooO00o(strArrSplit);
                throw null;
            }
        }
    }

    public final synchronized void OooOoOO() throws IOException {
        o0O00o00 o0o00o00OooO0oO;
        o0O00O o0o00o2 = this.f39394o000oOoO;
        if (o0o00o2 != null) {
            o0o00o2.close();
        }
        p415o0Oo0oO.OooOO0 oooOO1 = this.f39378Oooo0o;
        File file = this.f39377Oooo;
        Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO1);
        try {
            o0o00o00OooO0oO = o0O000Oo.OooO0oO(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            o0o00o00OooO0oO = o0O000Oo.OooO0oO(file);
        }
        oo00oO oo00ooOooO0O0 = o0O000Oo.OooO0O0(o0o00o00OooO0oO);
        try {
            o0O00O o0o00o3 = (o0O00O) oo00ooOooO0O0;
            o0o00o3.OoooOoo("libcore.io.DiskLruCache");
            o0o00o3.Oooo000(10);
            o0O00O o0o00o4 = (o0O00O) oo00ooOooO0O0;
            o0o00o4.OoooOoo("1");
            o0o00o4.Oooo000(10);
            o0o00o4.o0000O0(this.f39382OoooO0);
            o0o00o4.Oooo000(10);
            o0o00o4.o0000O0(this.f39381OoooO);
            o0o00o4.Oooo000(10);
            o0o00o4.Oooo000(10);
            for (OooO oooO : this.f39386OoooOOO.values()) {
                if (oooO.f39399OooO0o != null) {
                    o0o00o4.OoooOoo("DIRTY");
                    o0o00o4.Oooo000(32);
                    o0o00o4.OoooOoo(oooO.f39395OooO00o);
                    o0o00o4.Oooo000(10);
                } else {
                    o0o00o4.OoooOoo("CLEAN");
                    o0o00o4.Oooo000(32);
                    o0o00o4.OoooOoo(oooO.f39395OooO00o);
                    oooO.OooO0OO(oo00ooOooO0O0);
                    o0o00o4.Oooo000(10);
                }
            }
            o0o00o4.close();
            p415o0Oo0oO.OooOO0 oooOO2 = this.f39378Oooo0o;
            File file2 = this.f39380Oooo0oo;
            Objects.requireNonNull((o0Oo0oO.OooOO0.OooO00o) oooOO2);
            if (file2.exists()) {
                ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO0OO(this.f39380Oooo0oo, this.f39383OoooO00);
            }
            ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO0OO(this.f39377Oooo, this.f39380Oooo0oo);
            ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO00o(this.f39383OoooO00);
            this.f39394o000oOoO = (o0O00O) OooOOo();
            this.f39388OoooOo0 = false;
        } catch (Throwable th) {
            ((o0O00O) oo00ooOooO0O0).close();
            throw th;
        }
    }

    public final void OooOoo(OooO oooO) throws IOException {
        OooO0o oooO0o = oooO.f39399OooO0o;
        if (oooO0o != null) {
            oooO0o.f39407OooO0OO = true;
        }
        for (int i = 0; i < this.f39381OoooO; i++) {
            ((o0Oo0oO.OooOO0.OooO00o) this.f39378Oooo0o).OooO00o(oooO.f39397OooO0OO[i]);
            long j = this.f39385OoooOO0;
            long[] jArr = oooO.f39396OooO0O0;
            this.f39385OoooOO0 = j - jArr[i];
            jArr[i] = 0;
        }
        this.f39387OoooOOo++;
        o0O00O o0o00o2 = this.f39394o000oOoO;
        o0o00o2.OoooOoo("REMOVE");
        o0o00o2.Oooo000(32);
        o0o00o2.OoooOoo(oooO.f39395OooO00o);
        o0o00o2.Oooo000(10);
        this.f39386OoooOOO.remove(oooO.f39395OooO00o);
        if (OooOOO()) {
            this.f39392Ooooo0o.execute(this.f39393OooooO0);
        }
    }

    public final void Oooo0(String str) {
        if (!f39375OooooOO.matcher(str).matches()) {
            throw new IllegalArgumentException(OooO0o.OooO0OO.OooO00o("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final void Oooo00o() throws IOException {
        while (this.f39385OoooOO0 > this.f39384OoooO0O) {
            OooOoo(this.f39386OoooOOO.values().iterator().next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f39389OoooOoO && !this.f39390OoooOoo) {
            for (OooO oooO : (OooO[]) this.f39386OoooOOO.values().toArray(new OooO[this.f39386OoooOOO.size()])) {
                OooO0o oooO0o = oooO.f39399OooO0o;
                if (oooO0o != null) {
                    oooO0o.OooO00o();
                }
            }
            Oooo00o();
            this.f39394o000oOoO.close();
            this.f39394o000oOoO = null;
            this.f39390OoooOoo = true;
            return;
        }
        this.f39390OoooOoo = true;
    }
}
