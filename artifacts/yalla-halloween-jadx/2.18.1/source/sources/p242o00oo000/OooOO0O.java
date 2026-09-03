package p242o00oo000;

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
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final File f34122Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final File f34123Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final File f34124Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final File f34125Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f34127OoooO0;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public BufferedWriter f34130OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f34131OoooOOO;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public long f34126OoooO = 0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final LinkedHashMap<String, OooO0o> f34135o000oOoO = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f34132OoooOOo = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final ThreadPoolExecutor f34133OoooOo0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new OooO0O0());

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Callable<Void> f34134OoooOoO = new OooO00o();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f34128OoooO00 = 1;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f34129OoooO0O = 1;

    public final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final File[] f34136OooO00o;

        public OooO(File[] fileArr) {
            this.f34136OooO00o = fileArr;
        }
    }

    public class OooO00o implements Callable<Void> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (OooOO0O.this) {
                OooOO0O oooOO0O = OooOO0O.this;
                if (oooOO0O.f34130OoooOO0 == null) {
                    return null;
                }
                oooOO0O.Oooo0OO();
                if (OooOO0O.this.OooOOoo()) {
                    OooOO0O.this.Oooo00o();
                    OooOO0O.this.f34131OoooOOO = 0;
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
        public final OooO0o f34138OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f34139OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f34140OooO0OO;

        public OooO0OO(OooO0o oooO0o) {
            this.f34138OooO00o = oooO0o;
            this.f34139OooO0O0 = oooO0o.f34147OooO0o0 ? null : new boolean[OooOO0O.this.f34129OoooO0O];
        }

        public final void OooO00o() throws IOException {
            OooOO0O.OooO00o(OooOO0O.this, this, false);
        }

        public final File OooO0O0() throws IOException {
            File file;
            synchronized (OooOO0O.this) {
                OooO0o oooO0o = this.f34138OooO00o;
                if (oooO0o.f34146OooO0o != this) {
                    throw new IllegalStateException();
                }
                if (!oooO0o.f34147OooO0o0) {
                    this.f34139OooO0O0[0] = true;
                }
                file = oooO0o.f34145OooO0Oo[0];
                OooOO0O.this.f34123Oooo0o.mkdirs();
            }
            return file;
        }
    }

    public final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f34142OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f34143OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public File[] f34144OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public File[] f34145OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0OO f34146OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f34147OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f34148OooO0oO;

        public OooO0o(String str) {
            this.f34142OooO00o = str;
            int i = OooOO0O.this.f34129OoooO0O;
            this.f34143OooO0O0 = new long[i];
            this.f34144OooO0OO = new File[i];
            this.f34145OooO0Oo = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < OooOO0O.this.f34129OoooO0O; i2++) {
                sb.append(i2);
                this.f34144OooO0OO[i2] = new File(OooOO0O.this.f34123Oooo0o, sb.toString());
                sb.append(".tmp");
                this.f34145OooO0Oo[i2] = new File(OooOO0O.this.f34123Oooo0o, sb.toString());
                sb.setLength(length);
            }
        }

        public final String OooO00o() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f34143OooO0O0) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final IOException OooO0O0(String[] strArr) throws IOException {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unexpected journal line: ");
            sbOooO0o0.append(Arrays.toString(strArr));
            throw new IOException(sbOooO0o0.toString());
        }
    }

    public OooOO0O(File file, long j) {
        this.f34123Oooo0o = file;
        this.f34124Oooo0oO = new File(file, "journal");
        this.f34125Oooo0oo = new File(file, "journal.tmp");
        this.f34122Oooo = new File(file, "journal.bkp");
        this.f34127OoooO0 = j;
    }

    public static void OooO00o(OooOO0O oooOO0O, OooO0OO oooO0OO, boolean z) throws IOException {
        synchronized (oooOO0O) {
            OooO0o oooO0o = oooO0OO.f34138OooO00o;
            if (oooO0o.f34146OooO0o != oooO0OO) {
                throw new IllegalStateException();
            }
            if (z && !oooO0o.f34147OooO0o0) {
                for (int i = 0; i < oooOO0O.f34129OoooO0O; i++) {
                    if (!oooO0OO.f34139OooO0O0[i]) {
                        oooO0OO.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!oooO0o.f34145OooO0Oo[i].exists()) {
                        oooO0OO.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < oooOO0O.f34129OoooO0O; i2++) {
                File file = oooO0o.f34145OooO0Oo[i2];
                if (!z) {
                    OooO0o(file);
                } else if (file.exists()) {
                    File file2 = oooO0o.f34144OooO0OO[i2];
                    file.renameTo(file2);
                    long j = oooO0o.f34143OooO0O0[i2];
                    long length = file2.length();
                    oooO0o.f34143OooO0O0[i2] = length;
                    oooOO0O.f34126OoooO = (oooOO0O.f34126OoooO - j) + length;
                }
            }
            oooOO0O.f34131OoooOOO++;
            oooO0o.f34146OooO0o = null;
            if (oooO0o.f34147OooO0o0 || z) {
                oooO0o.f34147OooO0o0 = true;
                oooOO0O.f34130OoooOO0.append((CharSequence) "CLEAN");
                oooOO0O.f34130OoooOO0.append(' ');
                oooOO0O.f34130OoooOO0.append((CharSequence) oooO0o.f34142OooO00o);
                oooOO0O.f34130OoooOO0.append((CharSequence) oooO0o.OooO00o());
                oooOO0O.f34130OoooOO0.append('\n');
                if (z) {
                    long j2 = oooOO0O.f34132OoooOOo;
                    oooOO0O.f34132OoooOOo = 1 + j2;
                    oooO0o.f34148OooO0oO = j2;
                }
            } else {
                oooOO0O.f34135o000oOoO.remove(oooO0o.f34142OooO00o);
                oooOO0O.f34130OoooOO0.append((CharSequence) "REMOVE");
                oooOO0O.f34130OoooOO0.append(' ');
                oooOO0O.f34130OoooOO0.append((CharSequence) oooO0o.f34142OooO00o);
                oooOO0O.f34130OoooOO0.append('\n');
            }
            OooOOO(oooOO0O.f34130OoooOO0);
            if (oooOO0O.f34126OoooO > oooOO0O.f34127OoooO0 || oooOO0O.OooOOoo()) {
                oooOO0O.f34133OoooOo0.submit(oooOO0O.f34134OoooOoO);
            }
        }
    }

    @TargetApi(26)
    public static void OooO0Oo(Writer writer) throws IOException {
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

    public static void OooO0o(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void OooOOO(Writer writer) throws IOException {
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

    public static OooOO0O OooOo0O(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Oooo0(file2, file3, false);
            }
        }
        OooOO0O oooOO0O = new OooOO0O(file, j);
        if (oooOO0O.f34124Oooo0oO.exists()) {
            try {
                oooOO0O.OooOoOO();
                oooOO0O.OooOoO();
                return oooOO0O;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                oooOO0O.close();
                OooOOO.OooO00o(oooOO0O.f34123Oooo0o);
            }
        }
        file.mkdirs();
        OooOO0O oooOO0O2 = new OooOO0O(file, j);
        oooOO0O2.Oooo00o();
        return oooOO0O2;
    }

    public static void Oooo0(File file, File file2, boolean z) throws IOException {
        if (z) {
            OooO0o(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void OooO0O0() {
        if (this.f34130OoooOO0 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final OooO0OO OooO0oo(String str) throws IOException {
        OooO0OO oooO0OO;
        synchronized (this) {
            OooO0O0();
            OooO0o oooO0o = this.f34135o000oOoO.get(str);
            oooO0OO = null;
            if (oooO0o == null) {
                oooO0o = new OooO0o(str);
                this.f34135o000oOoO.put(str, oooO0o);
            } else if (oooO0o.f34146OooO0o != null) {
            }
            oooO0OO = new OooO0OO(oooO0o);
            oooO0o.f34146OooO0o = oooO0OO;
            this.f34130OoooOO0.append((CharSequence) "DIRTY");
            this.f34130OoooOO0.append(' ');
            this.f34130OoooOO0.append((CharSequence) str);
            this.f34130OoooOO0.append('\n');
            OooOOO(this.f34130OoooOO0);
        }
        return oooO0OO;
    }

    public final synchronized OooO OooOOo(String str) throws IOException {
        OooO0O0();
        OooO0o oooO0o = this.f34135o000oOoO.get(str);
        if (oooO0o == null) {
            return null;
        }
        if (!oooO0o.f34147OooO0o0) {
            return null;
        }
        for (File file : oooO0o.f34144OooO0OO) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f34131OoooOOO++;
        this.f34130OoooOO0.append((CharSequence) "READ");
        this.f34130OoooOO0.append(' ');
        this.f34130OoooOO0.append((CharSequence) str);
        this.f34130OoooOO0.append('\n');
        if (OooOOoo()) {
            this.f34133OoooOo0.submit(this.f34134OoooOoO);
        }
        return new OooO(oooO0o.f34144OooO0OO);
    }

    public final boolean OooOOoo() {
        int i = this.f34131OoooOOO;
        return i >= 2000 && i >= this.f34135o000oOoO.size();
    }

    public final void OooOoO() throws IOException {
        OooO0o(this.f34125Oooo0oo);
        Iterator<OooO0o> it = this.f34135o000oOoO.values().iterator();
        while (it.hasNext()) {
            OooO0o next = it.next();
            int i = 0;
            if (next.f34146OooO0o == null) {
                while (i < this.f34129OoooO0O) {
                    this.f34126OoooO += next.f34143OooO0O0[i];
                    i++;
                }
            } else {
                next.f34146OooO0o = null;
                while (i < this.f34129OoooO0O) {
                    OooO0o(next.f34144OooO0OO[i]);
                    OooO0o(next.f34145OooO0Oo[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void OooOoOO() throws IOException {
        OooOOO0 oooOOO0 = new OooOOO0(new FileInputStream(this.f34124Oooo0oO), OooOOO.f34150OooO00o);
        try {
            String strOooO0O0 = oooOOO0.OooO0O0();
            String strOooO0O1 = oooOOO0.OooO0O0();
            String strOooO0O2 = oooOOO0.OooO0O0();
            String strOooO0O3 = oooOOO0.OooO0O0();
            String strOooO0O4 = oooOOO0.OooO0O0();
            if (!"libcore.io.DiskLruCache".equals(strOooO0O0) || !"1".equals(strOooO0O1) || !Integer.toString(this.f34128OoooO00).equals(strOooO0O2) || !Integer.toString(this.f34129OoooO0O).equals(strOooO0O3) || !"".equals(strOooO0O4)) {
                throw new IOException("unexpected journal header: [" + strOooO0O0 + ", " + strOooO0O1 + ", " + strOooO0O3 + ", " + strOooO0O4 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    OooOoo(oooOOO0.OooO0O0());
                    i++;
                } catch (EOFException unused) {
                    this.f34131OoooOOO = i - this.f34135o000oOoO.size();
                    if (oooOOO0.f34155OoooO00 == -1) {
                        Oooo00o();
                    } else {
                        this.f34130OoooOO0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34124Oooo0oO, true), OooOOO.f34150OooO00o));
                    }
                    try {
                        oooOOO0.close();
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
                oooOOO0.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void OooOoo(String str) throws IOException {
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
                this.f34135o000oOoO.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        OooO0o oooO0o = this.f34135o000oOoO.get(strSubstring);
        if (oooO0o == null) {
            oooO0o = new OooO0o(strSubstring);
            this.f34135o000oOoO.put(strSubstring, oooO0o);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                oooO0o.f34146OooO0o = new OooO0OO(oooO0o);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException(OooOo00.OooO0Oo("unexpected journal line: ", str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        oooO0o.f34147OooO0o0 = true;
        oooO0o.f34146OooO0o = null;
        if (strArrSplit.length != OooOO0O.this.f34129OoooO0O) {
            oooO0o.OooO0O0(strArrSplit);
            throw null;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                oooO0o.f34143OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                oooO0o.OooO0O0(strArrSplit);
                throw null;
            }
        }
    }

    public final synchronized void Oooo00o() throws IOException {
        BufferedWriter bufferedWriter = this.f34130OoooOO0;
        if (bufferedWriter != null) {
            OooO0Oo(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34125Oooo0oo), OooOOO.f34150OooO00o));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f34128OoooO00));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f34129OoooO0O));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (OooO0o oooO0o : this.f34135o000oOoO.values()) {
                if (oooO0o.f34146OooO0o != null) {
                    bufferedWriter2.write("DIRTY " + oooO0o.f34142OooO00o + '\n');
                } else {
                    bufferedWriter2.write("CLEAN " + oooO0o.f34142OooO00o + oooO0o.OooO00o() + '\n');
                }
            }
            OooO0Oo(bufferedWriter2);
            if (this.f34124Oooo0oO.exists()) {
                Oooo0(this.f34124Oooo0oO, this.f34122Oooo, true);
            }
            Oooo0(this.f34125Oooo0oo, this.f34124Oooo0oO, false);
            this.f34122Oooo.delete();
            this.f34130OoooOO0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34124Oooo0oO, true), OooOOO.f34150OooO00o));
        } catch (Throwable th) {
            OooO0Oo(bufferedWriter2);
            throw th;
        }
    }

    public final void Oooo0OO() throws IOException {
        while (this.f34126OoooO > this.f34127OoooO0) {
            String key = this.f34135o000oOoO.entrySet().iterator().next().getKey();
            synchronized (this) {
                OooO0O0();
                OooO0o oooO0o = this.f34135o000oOoO.get(key);
                if (oooO0o != null && oooO0o.f34146OooO0o == null) {
                    for (int i = 0; i < this.f34129OoooO0O; i++) {
                        File file = oooO0o.f34144OooO0OO[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.f34126OoooO;
                        long[] jArr = oooO0o.f34143OooO0O0;
                        this.f34126OoooO = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.f34131OoooOOO++;
                    this.f34130OoooOO0.append((CharSequence) "REMOVE");
                    this.f34130OoooOO0.append(' ');
                    this.f34130OoooOO0.append((CharSequence) key);
                    this.f34130OoooOO0.append('\n');
                    this.f34135o000oOoO.remove(key);
                    if (OooOOoo()) {
                        this.f34133OoooOo0.submit(this.f34134OoooOoO);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f34130OoooOO0 == null) {
            return;
        }
        Iterator it = new ArrayList(this.f34135o000oOoO.values()).iterator();
        while (it.hasNext()) {
            OooO0OO oooO0OO = ((OooO0o) it.next()).f34146OooO0o;
            if (oooO0OO != null) {
                oooO0OO.OooO00o();
            }
        }
        Oooo0OO();
        OooO0Oo(this.f34130OoooOO0);
        this.f34130OoooOO0 = null;
    }
}
