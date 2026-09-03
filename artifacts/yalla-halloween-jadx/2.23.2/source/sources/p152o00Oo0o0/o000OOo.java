package p152o00Oo0o0;

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
public final class o000OOo implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f37795OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f37796OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final File f37797OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final File f37798OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final File f37799OooO0oO;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public BufferedWriter f37803OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f37804OooOOO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f37802OooOO0O = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LinkedHashMap<String, OooO0o> f37805OooOOO0 = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f37806OooOOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ThreadPoolExecutor f37807OooOOOo = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new OooO0O0());

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooO00o f37808OooOOo0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f37800OooO0oo = 1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f37801OooOO0 = 1;

    public final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final File[] f37809OooO00o;

        public OooO(File[] fileArr) {
            this.f37809OooO00o = fileArr;
        }
    }

    public class OooO00o implements Callable<Void> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (o000OOo.this) {
                o000OOo o000ooo2 = o000OOo.this;
                if (o000ooo2.f37803OooOO0o == null) {
                    return null;
                }
                o000ooo2.Oooo0oO();
                if (o000OOo.this.OooOo()) {
                    o000OOo.this.Oooo0OO();
                    o000OOo.this.f37804OooOOO = 0;
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

    public final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f37811OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f37812OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f37813OooO0OO;

        public OooO0OO(OooO0o oooO0o) {
            this.f37811OooO00o = oooO0o;
            this.f37812OooO0O0 = oooO0o.f37820OooO0o0 ? null : new boolean[o000OOo.this.f37801OooOO0];
        }

        public final void OooO00o() throws IOException {
            o000OOo.OooO00o(o000OOo.this, this, false);
        }

        public final File OooO0O0() throws IOException {
            File file;
            synchronized (o000OOo.this) {
                OooO0o oooO0o = this.f37811OooO00o;
                if (oooO0o.f37819OooO0o != this) {
                    throw new IllegalStateException();
                }
                if (!oooO0o.f37820OooO0o0) {
                    this.f37812OooO0O0[0] = true;
                }
                file = oooO0o.f37818OooO0Oo[0];
                o000OOo.this.f37796OooO0Oo.mkdirs();
            }
            return file;
        }
    }

    public final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f37815OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f37816OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final File[] f37817OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File[] f37818OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0OO f37819OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f37820OooO0o0;

        public OooO0o(String str) {
            this.f37815OooO00o = str;
            int i = o000OOo.this.f37801OooOO0;
            this.f37816OooO0O0 = new long[i];
            this.f37817OooO0OO = new File[i];
            this.f37818OooO0Oo = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < o000OOo.this.f37801OooOO0; i2++) {
                sb.append(i2);
                File[] fileArr = this.f37817OooO0OO;
                String string = sb.toString();
                File file = o000OOo.this.f37796OooO0Oo;
                fileArr[i2] = new File(file, string);
                sb.append(".tmp");
                this.f37818OooO0Oo[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String OooO00o() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f37816OooO0O0) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public o000OOo(File file, long j) {
        this.f37796OooO0Oo = file;
        this.f37798OooO0o0 = new File(file, "journal");
        this.f37797OooO0o = new File(file, "journal.tmp");
        this.f37799OooO0oO = new File(file, "journal.bkp");
        this.f37795OooO = j;
    }

    public static void OooO00o(o000OOo o000ooo2, OooO0OO oooO0OO, boolean z) throws IOException {
        synchronized (o000ooo2) {
            OooO0o oooO0o = oooO0OO.f37811OooO00o;
            if (oooO0o.f37819OooO0o != oooO0OO) {
                throw new IllegalStateException();
            }
            if (z && !oooO0o.f37820OooO0o0) {
                for (int i = 0; i < o000ooo2.f37801OooOO0; i++) {
                    if (!oooO0OO.f37812OooO0O0[i]) {
                        oooO0OO.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!oooO0o.f37818OooO0Oo[i].exists()) {
                        oooO0OO.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < o000ooo2.f37801OooOO0; i2++) {
                File file = oooO0o.f37818OooO0Oo[i2];
                if (!z) {
                    OooO0oO(file);
                } else if (file.exists()) {
                    File file2 = oooO0o.f37817OooO0OO[i2];
                    file.renameTo(file2);
                    long j = oooO0o.f37816OooO0O0[i2];
                    long length = file2.length();
                    oooO0o.f37816OooO0O0[i2] = length;
                    o000ooo2.f37802OooOO0O = (o000ooo2.f37802OooOO0O - j) + length;
                }
            }
            o000ooo2.f37804OooOOO++;
            oooO0o.f37819OooO0o = null;
            if (oooO0o.f37820OooO0o0 || z) {
                oooO0o.f37820OooO0o0 = true;
                o000ooo2.f37803OooOO0o.append((CharSequence) "CLEAN");
                o000ooo2.f37803OooOO0o.append(' ');
                o000ooo2.f37803OooOO0o.append((CharSequence) oooO0o.f37815OooO00o);
                o000ooo2.f37803OooOO0o.append((CharSequence) oooO0o.OooO00o());
                o000ooo2.f37803OooOO0o.append('\n');
                if (z) {
                    o000ooo2.f37806OooOOOO++;
                    oooO0o.getClass();
                }
            } else {
                o000ooo2.f37805OooOOO0.remove(oooO0o.f37815OooO00o);
                o000ooo2.f37803OooOO0o.append((CharSequence) "REMOVE");
                o000ooo2.f37803OooOO0o.append(' ');
                o000ooo2.f37803OooOO0o.append((CharSequence) oooO0o.f37815OooO00o);
                o000ooo2.f37803OooOO0o.append('\n');
            }
            OooOo00(o000ooo2.f37803OooOO0o);
            if (o000ooo2.f37802OooOO0O > o000ooo2.f37795OooO || o000ooo2.OooOo()) {
                o000ooo2.f37807OooOOOo.submit(o000ooo2.f37808OooOOo0);
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
    public static void OooOo00(Writer writer) throws IOException {
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

    public static o000OOo OooOooo(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Oooo0o0(file2, file3, false);
            }
        }
        o000OOo o000ooo2 = new o000OOo(file, j);
        if (o000ooo2.f37798OooO0o0.exists()) {
            try {
                o000ooo2.Oooo0();
                o000ooo2.Oooo00o();
                return o000ooo2;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                o000ooo2.close();
                o000000O.OooO00o(o000ooo2.f37796OooO0Oo);
            }
        }
        file.mkdirs();
        o000OOo o000ooo3 = new o000OOo(file, j);
        o000ooo3.Oooo0OO();
        return o000ooo3;
    }

    public static void Oooo0o0(File file, File file2, boolean z) throws IOException {
        if (z) {
            OooO0oO(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final OooO0OO OooOOo(String str) throws IOException {
        synchronized (this) {
            if (this.f37803OooOO0o == null) {
                throw new IllegalStateException("cache is closed");
            }
            OooO0o oooO0o = this.f37805OooOOO0.get(str);
            if (oooO0o == null) {
                oooO0o = new OooO0o(str);
                this.f37805OooOOO0.put(str, oooO0o);
            } else if (oooO0o.f37819OooO0o != null) {
                return null;
            }
            OooO0OO oooO0OO = new OooO0OO(oooO0o);
            oooO0o.f37819OooO0o = oooO0OO;
            this.f37803OooOO0o.append((CharSequence) "DIRTY");
            this.f37803OooOO0o.append(' ');
            this.f37803OooOO0o.append((CharSequence) str);
            this.f37803OooOO0o.append('\n');
            OooOo00(this.f37803OooOO0o);
            return oooO0OO;
        }
    }

    public final boolean OooOo() {
        int i = this.f37804OooOOO;
        return i >= 2000 && i >= this.f37805OooOOO0.size();
    }

    public final synchronized OooO OooOo0(String str) throws IOException {
        if (this.f37803OooOO0o == null) {
            throw new IllegalStateException("cache is closed");
        }
        OooO0o oooO0o = this.f37805OooOOO0.get(str);
        if (oooO0o == null) {
            return null;
        }
        if (!oooO0o.f37820OooO0o0) {
            return null;
        }
        for (File file : oooO0o.f37817OooO0OO) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f37804OooOOO++;
        this.f37803OooOO0o.append((CharSequence) "READ");
        this.f37803OooOO0o.append(' ');
        this.f37803OooOO0o.append((CharSequence) str);
        this.f37803OooOO0o.append('\n');
        if (OooOo()) {
            this.f37807OooOOOo.submit(this.f37808OooOOo0);
        }
        return new OooO(oooO0o.f37817OooO0OO);
    }

    public final void Oooo0() throws IOException {
        File file = this.f37798OooO0o0;
        o000000 o000000Var = new o000000(new FileInputStream(file), o000000O.f37794OooO00o);
        try {
            String strOooO00o = o000000Var.OooO00o();
            String strOooO00o2 = o000000Var.OooO00o();
            String strOooO00o3 = o000000Var.OooO00o();
            String strOooO00o4 = o000000Var.OooO00o();
            String strOooO00o5 = o000000Var.OooO00o();
            if (!"libcore.io.DiskLruCache".equals(strOooO00o) || !"1".equals(strOooO00o2) || !Integer.toString(this.f37800OooO0oo).equals(strOooO00o3) || !Integer.toString(this.f37801OooOO0).equals(strOooO00o4) || !"".equals(strOooO00o5)) {
                throw new IOException("unexpected journal header: [" + strOooO00o + ", " + strOooO00o2 + ", " + strOooO00o4 + ", " + strOooO00o5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    Oooo0O0(o000000Var.OooO00o());
                    i++;
                } catch (EOFException unused) {
                    this.f37804OooOOO = i - this.f37805OooOOO0.size();
                    if (o000000Var.f37792OooO0oo == -1) {
                        Oooo0OO();
                    } else {
                        this.f37803OooOO0o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), o000000O.f37794OooO00o));
                    }
                    try {
                        o000000Var.close();
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
                o000000Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void Oooo00o() throws IOException {
        OooO0oO(this.f37797OooO0o);
        Iterator<OooO0o> it = this.f37805OooOOO0.values().iterator();
        while (it.hasNext()) {
            OooO0o next = it.next();
            OooO0OO oooO0OO = next.f37819OooO0o;
            int i = this.f37801OooOO0;
            int i2 = 0;
            if (oooO0OO == null) {
                while (i2 < i) {
                    this.f37802OooOO0O += next.f37816OooO0O0[i2];
                    i2++;
                }
            } else {
                next.f37819OooO0o = null;
                while (i2 < i) {
                    OooO0oO(next.f37817OooO0OO[i2]);
                    OooO0oO(next.f37818OooO0Oo[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void Oooo0O0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, OooO0o> linkedHashMap = this.f37805OooOOO0;
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
                oooO0o.f37819OooO0o = new OooO0OO(oooO0o);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        oooO0o.f37820OooO0o0 = true;
        oooO0o.f37819OooO0o = null;
        if (strArrSplit.length != o000OOo.this.f37801OooOO0) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                oooO0o.f37816OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void Oooo0OO() throws IOException {
        BufferedWriter bufferedWriter = this.f37803OooOO0o;
        if (bufferedWriter != null) {
            OooO0OO(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f37797OooO0o), o000000O.f37794OooO00o));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f37800OooO0oo));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f37801OooOO0));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (OooO0o oooO0o : this.f37805OooOOO0.values()) {
                if (oooO0o.f37819OooO0o != null) {
                    bufferedWriter2.write("DIRTY " + oooO0o.f37815OooO00o + '\n');
                } else {
                    bufferedWriter2.write("CLEAN " + oooO0o.f37815OooO00o + oooO0o.OooO00o() + '\n');
                }
            }
            OooO0OO(bufferedWriter2);
            if (this.f37798OooO0o0.exists()) {
                Oooo0o0(this.f37798OooO0o0, this.f37799OooO0oO, true);
            }
            Oooo0o0(this.f37797OooO0o, this.f37798OooO0o0, false);
            this.f37799OooO0oO.delete();
            this.f37803OooOO0o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f37798OooO0o0, true), o000000O.f37794OooO00o));
        } catch (Throwable th) {
            OooO0OO(bufferedWriter2);
            throw th;
        }
    }

    public final void Oooo0oO() throws IOException {
        while (this.f37802OooOO0O > this.f37795OooO) {
            String key = this.f37805OooOOO0.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f37803OooOO0o == null) {
                    throw new IllegalStateException("cache is closed");
                }
                OooO0o oooO0o = this.f37805OooOOO0.get(key);
                if (oooO0o != null && oooO0o.f37819OooO0o == null) {
                    for (int i = 0; i < this.f37801OooOO0; i++) {
                        File file = oooO0o.f37817OooO0OO[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.f37802OooOO0O;
                        long[] jArr = oooO0o.f37816OooO0O0;
                        this.f37802OooOO0O = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.f37804OooOOO++;
                    this.f37803OooOO0o.append((CharSequence) "REMOVE");
                    this.f37803OooOO0o.append(' ');
                    this.f37803OooOO0o.append((CharSequence) key);
                    this.f37803OooOO0o.append('\n');
                    this.f37805OooOOO0.remove(key);
                    if (OooOo()) {
                        this.f37807OooOOOo.submit(this.f37808OooOOo0);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f37803OooOO0o == null) {
            return;
        }
        Iterator it = new ArrayList(this.f37805OooOOO0.values()).iterator();
        while (it.hasNext()) {
            OooO0OO oooO0OO = ((OooO0o) it.next()).f37819OooO0o;
            if (oooO0OO != null) {
                oooO0OO.OooO00o();
            }
        }
        Oooo0oO();
        OooO0OO(this.f37803OooOO0o);
        this.f37803OooOO0o = null;
    }
}
