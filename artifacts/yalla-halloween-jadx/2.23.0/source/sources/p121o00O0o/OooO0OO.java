package p121o00O0o;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f36639OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f36640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final File f36641OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final File f36642OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final File f36643OooO0oO;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public BufferedWriter f36647OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f36648OooOOO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f36646OooOO0O = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LinkedHashMap<String, OooO0o> f36649OooOOO0 = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f36650OooOOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ThreadPoolExecutor f36651OooOOOo = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new OooO0O0());

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooO00o f36652OooOOo0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f36644OooO0oo = 1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f36645OooOO0 = 1;

    public final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final File[] f36653OooO00o;

        public OooO(File[] fileArr) {
            this.f36653OooO00o = fileArr;
        }
    }

    public class OooO00o implements Callable<Void> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (OooO0OO.this) {
                OooO0OO oooO0OO = OooO0OO.this;
                if (oooO0OO.f36647OooOO0o == null) {
                    return null;
                }
                oooO0OO.Oooo0o0();
                if (OooO0OO.this.OooOo0()) {
                    OooO0OO.this.Oooo0O0();
                    OooO0OO.this.f36648OooOOO = 0;
                }
                return null;
            }
        }
    }

    public static final class OooO0O0 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: renamed from: o00O0o.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public final class C0421OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f36655OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f36656OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f36657OooO0OO;

        public C0421OooO0OO(OooO0o oooO0o) {
            this.f36655OooO00o = oooO0o;
            this.f36656OooO0O0 = oooO0o.f36664OooO0o0 ? null : new boolean[OooO0OO.this.f36645OooOO0];
        }

        public final void OooO00o() throws IOException {
            OooO0OO.OooO00o(OooO0OO.this, this, false);
        }

        public final File OooO0O0() throws IOException {
            File file;
            synchronized (OooO0OO.this) {
                OooO0o oooO0o = this.f36655OooO00o;
                if (oooO0o.f36663OooO0o != this) {
                    throw new IllegalStateException();
                }
                if (!oooO0o.f36664OooO0o0) {
                    this.f36656OooO0O0[0] = true;
                }
                file = oooO0o.f36662OooO0Oo[0];
                OooO0OO.this.f36640OooO0Oo.mkdirs();
            }
            return file;
        }
    }

    public final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f36659OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f36660OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final File[] f36661OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File[] f36662OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public C0421OooO0OO f36663OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f36664OooO0o0;

        public OooO0o(String str) {
            this.f36659OooO00o = str;
            int i = OooO0OO.this.f36645OooOO0;
            this.f36660OooO0O0 = new long[i];
            this.f36661OooO0OO = new File[i];
            this.f36662OooO0Oo = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < OooO0OO.this.f36645OooOO0; i2++) {
                sb.append(i2);
                File[] fileArr = this.f36661OooO0OO;
                String string = sb.toString();
                File file = OooO0OO.this.f36640OooO0Oo;
                fileArr[i2] = new File(file, string);
                sb.append(".tmp");
                this.f36662OooO0Oo[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String OooO00o() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f36660OooO0O0) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public OooO0OO(File file, long j) {
        this.f36640OooO0Oo = file;
        this.f36642OooO0o0 = new File(file, "journal");
        this.f36641OooO0o = new File(file, "journal.tmp");
        this.f36643OooO0oO = new File(file, "journal.bkp");
        this.f36639OooO = j;
    }

    public static void OooO00o(OooO0OO oooO0OO, C0421OooO0OO c0421OooO0OO, boolean z) throws IOException {
        synchronized (oooO0OO) {
            OooO0o oooO0o = c0421OooO0OO.f36655OooO00o;
            if (oooO0o.f36663OooO0o != c0421OooO0OO) {
                throw new IllegalStateException();
            }
            if (z && !oooO0o.f36664OooO0o0) {
                for (int i = 0; i < oooO0OO.f36645OooOO0; i++) {
                    if (!c0421OooO0OO.f36656OooO0O0[i]) {
                        c0421OooO0OO.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!oooO0o.f36662OooO0Oo[i].exists()) {
                        c0421OooO0OO.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < oooO0OO.f36645OooOO0; i2++) {
                File file = oooO0o.f36662OooO0Oo[i2];
                if (!z) {
                    OooO0oO(file);
                } else if (file.exists()) {
                    File file2 = oooO0o.f36661OooO0OO[i2];
                    file.renameTo(file2);
                    long j = oooO0o.f36660OooO0O0[i2];
                    long length = file2.length();
                    oooO0o.f36660OooO0O0[i2] = length;
                    oooO0OO.f36646OooOO0O = (oooO0OO.f36646OooOO0O - j) + length;
                }
            }
            oooO0OO.f36648OooOOO++;
            oooO0o.f36663OooO0o = null;
            if (oooO0o.f36664OooO0o0 || z) {
                oooO0o.f36664OooO0o0 = true;
                oooO0OO.f36647OooOO0o.append((CharSequence) "CLEAN");
                oooO0OO.f36647OooOO0o.append(' ');
                oooO0OO.f36647OooOO0o.append((CharSequence) oooO0o.f36659OooO00o);
                oooO0OO.f36647OooOO0o.append((CharSequence) oooO0o.OooO00o());
                oooO0OO.f36647OooOO0o.append('\n');
                if (z) {
                    oooO0OO.f36650OooOOOO++;
                    oooO0o.getClass();
                }
            } else {
                oooO0OO.f36649OooOOO0.remove(oooO0o.f36659OooO00o);
                oooO0OO.f36647OooOO0o.append((CharSequence) "REMOVE");
                oooO0OO.f36647OooOO0o.append(' ');
                oooO0OO.f36647OooOO0o.append((CharSequence) oooO0o.f36659OooO00o);
                oooO0OO.f36647OooOO0o.append('\n');
            }
            OooOOo(oooO0OO.f36647OooOO0o);
            if (oooO0OO.f36646OooOO0O > oooO0OO.f36639OooO || oooO0OO.OooOo0()) {
                oooO0OO.f36651OooOOOo.submit(oooO0OO.f36652OooOOo0);
            }
        }
    }

    @TargetApi(26)
    public static void OooO0OO(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void OooO0oO(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void OooOOo(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static OooO0OO OooOo(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Oooo0OO(file2, file3, false);
            }
        }
        OooO0OO oooO0OO = new OooO0OO(file, j);
        if (oooO0OO.f36642OooO0o0.exists()) {
            try {
                oooO0OO.Oooo00o();
                oooO0OO.OooOooO();
                return oooO0OO;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                oooO0OO.close();
                p121o00O0o.OooO.OooO00o(oooO0OO.f36640OooO0Oo);
            }
        }
        file.mkdirs();
        OooO0OO oooO0OO2 = new OooO0OO(file, j);
        oooO0OO2.Oooo0O0();
        return oooO0OO2;
    }

    public static void Oooo0OO(File file, File file2, boolean z) throws IOException {
        if (z) {
            OooO0oO(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final C0421OooO0OO OooOOo0(String str) throws IOException {
        synchronized (this) {
            if (this.f36647OooOO0o == null) {
                throw new IllegalStateException("cache is closed");
            }
            OooO0o oooO0o = this.f36649OooOOO0.get(str);
            if (oooO0o == null) {
                oooO0o = new OooO0o(str);
                this.f36649OooOOO0.put(str, oooO0o);
            } else if (oooO0o.f36663OooO0o != null) {
                return null;
            }
            C0421OooO0OO c0421OooO0OO = new C0421OooO0OO(oooO0o);
            oooO0o.f36663OooO0o = c0421OooO0OO;
            this.f36647OooOO0o.append((CharSequence) "DIRTY");
            this.f36647OooOO0o.append(' ');
            this.f36647OooOO0o.append((CharSequence) str);
            this.f36647OooOO0o.append('\n');
            OooOOo(this.f36647OooOO0o);
            return c0421OooO0OO;
        }
    }

    public final boolean OooOo0() {
        int i = this.f36648OooOOO;
        return i >= 2000 && i >= this.f36649OooOOO0.size();
    }

    public final synchronized OooO OooOo00(String str) throws IOException {
        if (this.f36647OooOO0o == null) {
            throw new IllegalStateException("cache is closed");
        }
        OooO0o oooO0o = this.f36649OooOOO0.get(str);
        if (oooO0o == null) {
            return null;
        }
        if (!oooO0o.f36664OooO0o0) {
            return null;
        }
        for (File file : oooO0o.f36661OooO0OO) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f36648OooOOO++;
        this.f36647OooOO0o.append((CharSequence) "READ");
        this.f36647OooOO0o.append(' ');
        this.f36647OooOO0o.append((CharSequence) str);
        this.f36647OooOO0o.append('\n');
        if (OooOo0()) {
            this.f36651OooOOOo.submit(this.f36652OooOOo0);
        }
        return new OooO(oooO0o.f36661OooO0OO);
    }

    public final void OooOooO() throws IOException {
        OooO0oO(this.f36641OooO0o);
        Iterator<OooO0o> it = this.f36649OooOOO0.values().iterator();
        while (it.hasNext()) {
            OooO0o next = it.next();
            C0421OooO0OO c0421OooO0OO = next.f36663OooO0o;
            int i = this.f36645OooOO0;
            int i2 = 0;
            if (c0421OooO0OO == null) {
                while (i2 < i) {
                    this.f36646OooOO0O += next.f36660OooO0O0[i2];
                    i2++;
                }
            } else {
                next.f36663OooO0o = null;
                while (i2 < i) {
                    OooO0oO(next.f36661OooO0OO[i2]);
                    OooO0oO(next.f36662OooO0Oo[i2]);
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
        LinkedHashMap<String, OooO0o> linkedHashMap = this.f36649OooOOO0;
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
                oooO0o.f36663OooO0o = new C0421OooO0OO(oooO0o);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        oooO0o.f36664OooO0o0 = true;
        oooO0o.f36663OooO0o = null;
        if (strArrSplit.length != OooO0OO.this.f36645OooOO0) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                oooO0o.f36660OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final void Oooo00o() throws IOException {
        File file = this.f36642OooO0o0;
        p121o00O0o.OooO0o oooO0o = new p121o00O0o.OooO0o(new FileInputStream(file), p121o00O0o.OooO.f36638OooO00o);
        try {
            String strOooO00o = oooO0o.OooO00o();
            String strOooO00o2 = oooO0o.OooO00o();
            String strOooO00o3 = oooO0o.OooO00o();
            String strOooO00o4 = oooO0o.OooO00o();
            String strOooO00o5 = oooO0o.OooO00o();
            if (!"libcore.io.DiskLruCache".equals(strOooO00o) || !"1".equals(strOooO00o2) || !Integer.toString(this.f36644OooO0oo).equals(strOooO00o3) || !Integer.toString(this.f36645OooOO0).equals(strOooO00o4) || !"".equals(strOooO00o5)) {
                throw new IOException("unexpected journal header: [" + strOooO00o + ", " + strOooO00o2 + ", " + strOooO00o4 + ", " + strOooO00o5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    Oooo0(oooO0o.OooO00o());
                    i++;
                } catch (EOFException unused) {
                    this.f36648OooOOO = i - this.f36649OooOOO0.size();
                    if (oooO0o.f36670OooO0oo == -1) {
                        Oooo0O0();
                    } else {
                        this.f36647OooOO0o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), p121o00O0o.OooO.f36638OooO00o));
                    }
                    try {
                        oooO0o.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                oooO0o.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final synchronized void Oooo0O0() throws IOException {
        BufferedWriter bufferedWriter = this.f36647OooOO0o;
        if (bufferedWriter != null) {
            OooO0OO(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36641OooO0o), p121o00O0o.OooO.f36638OooO00o));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f36644OooO0oo));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f36645OooOO0));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (OooO0o oooO0o : this.f36649OooOOO0.values()) {
                if (oooO0o.f36663OooO0o != null) {
                    bufferedWriter2.write("DIRTY " + oooO0o.f36659OooO00o + '\n');
                } else {
                    bufferedWriter2.write("CLEAN " + oooO0o.f36659OooO00o + oooO0o.OooO00o() + '\n');
                }
            }
            OooO0OO(bufferedWriter2);
            if (this.f36642OooO0o0.exists()) {
                Oooo0OO(this.f36642OooO0o0, this.f36643OooO0oO, true);
            }
            Oooo0OO(this.f36641OooO0o, this.f36642OooO0o0, false);
            this.f36643OooO0oO.delete();
            this.f36647OooOO0o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36642OooO0o0, true), p121o00O0o.OooO.f36638OooO00o));
        } catch (Throwable th) {
            OooO0OO(bufferedWriter2);
            throw th;
        }
    }

    public final void Oooo0o0() throws IOException {
        while (this.f36646OooOO0O > this.f36639OooO) {
            String key = this.f36649OooOOO0.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f36647OooOO0o == null) {
                    throw new IllegalStateException("cache is closed");
                }
                OooO0o oooO0o = this.f36649OooOOO0.get(key);
                if (oooO0o != null && oooO0o.f36663OooO0o == null) {
                    for (int i = 0; i < this.f36645OooOO0; i++) {
                        File file = oooO0o.f36661OooO0OO[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.f36646OooOO0O;
                        long[] jArr = oooO0o.f36660OooO0O0;
                        this.f36646OooOO0O = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.f36648OooOOO++;
                    this.f36647OooOO0o.append((CharSequence) "REMOVE");
                    this.f36647OooOO0o.append(' ');
                    this.f36647OooOO0o.append((CharSequence) key);
                    this.f36647OooOO0o.append('\n');
                    this.f36649OooOOO0.remove(key);
                    if (OooOo0()) {
                        this.f36651OooOOOo.submit(this.f36652OooOOo0);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f36647OooOO0o == null) {
            return;
        }
        Iterator it = new ArrayList(this.f36649OooOOO0.values()).iterator();
        while (it.hasNext()) {
            C0421OooO0OO c0421OooO0OO = ((OooO0o) it.next()).f36663OooO0o;
            if (c0421OooO0OO != null) {
                c0421OooO0OO.OooO00o();
            }
        }
        Oooo0o0();
        OooO0OO(this.f36647OooOO0o);
        this.f36647OooOO0o = null;
    }
}
