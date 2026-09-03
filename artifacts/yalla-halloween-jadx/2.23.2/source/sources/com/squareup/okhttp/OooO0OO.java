package com.squareup.okhttp;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o0oooO0O.oo0OOoo.OooO0O0;
import okio.ByteString;
import p340o0OO0ooO.o000OOo;
import p340o0OO0ooO.o0O0O00;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0oO0;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f21052OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p340o0OO0ooO.o00O0O f21053OooO0O0;

    public class OooO00o implements p340o0OO0ooO.o00oO0o {
        public OooO00o() {
        }
    }

    public final class OooO0O0 implements o0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OO0ooO.o00O0O.OooO0OO f21055OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ooo0Oo0 f21056OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f21057OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f21058OooO0Oo;

        public class OooO00o extends oo0oO0 {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0OO0ooO.o00O0O.OooO0OO f21060OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ooo0Oo0 ooo0oo0, o0OO0ooO.o00O0O.OooO0OO oooO0OO) {
                super(ooo0oo0);
                this.f21060OooO0Oo = oooO0OO;
            }

            @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                synchronized (OooO0OO.this) {
                    OooO0O0 oooO0O0 = OooO0O0.this;
                    if (oooO0O0.f21057OooO0OO) {
                        return;
                    }
                    oooO0O0.f21057OooO0OO = true;
                    OooO0OO.this.getClass();
                    super.close();
                    this.f21060OooO0Oo.OooO0O0();
                }
            }
        }

        public OooO0O0(o0OO0ooO.o00O0O.OooO0OO oooO0OO) throws IOException {
            this.f21055OooO00o = oooO0OO;
            ooo0Oo0 ooo0oo0OooO0OO = oooO0OO.OooO0OO(1);
            this.f21056OooO0O0 = ooo0oo0OooO0OO;
            this.f21058OooO0Oo = new OooO00o(ooo0oo0OooO0OO, oooO0OO);
        }

        public final void OooO00o() {
            synchronized (OooO0OO.this) {
                if (this.f21057OooO0OO) {
                    return;
                }
                this.f21057OooO0OO = true;
                OooO0OO.this.getClass();
                o000OOo.OooO0O0(this.f21056OooO0O0);
                try {
                    this.f21055OooO00o.OooO00o();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.okhttp.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C0275OooO0OO extends oo000o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0OO0ooO.o00O0O.OooO f21062OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f21063OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0o0000 f21064OooO0o0;

        public C0275OooO0OO(o0OO0ooO.o00O0O.OooO oooO, String str) {
            this.f21062OooO0Oo = oooO;
            this.f21063OooO0o = str;
            this.f21064OooO0o0 = o0OO.OooO0O0(new com.squareup.okhttp.OooO0o(oooO.f42553OooO0o[1], oooO));
        }

        @Override // com.squareup.okhttp.oo000o
        public final long OooO00o() {
            try {
                String str = this.f21063OooO0o;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // com.squareup.okhttp.oo000o
        public final o0O0o0 OooO0OO() {
            return this.f21064OooO0o0;
        }
    }

    public OooO0OO(File file, long j) {
        Pattern pattern = p340o0OO0ooO.o00O0O.f42532OooOo0O;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = o000OOo.f42529OooO00o;
        this.f21053OooO0O0 = new p340o0OO0ooO.o00O0O(file, j, new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new o0O0O00("OkHttp DiskLruCache")));
    }

    public static int OooO00o(o0o0000 o0o0000Var) throws IOException {
        try {
            long jOooO0OO = o0o0000Var.OooO0OO();
            String strOoooO0O = o0o0000Var.OoooO0O();
            if (jOooO0OO >= 0 && jOooO0OO <= 2147483647L && strOoooO0O.isEmpty()) {
                return (int) jOooO0OO;
            }
            throw new IOException("expected an int but was \"" + jOooO0OO + strOoooO0O + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static String OooO0OO(o00Oo0 o00oo1) {
        String str = o00oo1.f21164OooO00o.f21128OooO0oo;
        byte[] bArr = o000OOo.f42529OooO00o;
        try {
            return ByteString.OooOOO0(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).OooO0o();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO0O0(o00Oo0 o00oo1) throws IOException {
        p340o0OO0ooO.o00O0O o00o0o2 = this.f21053OooO0O0;
        String strOooO0OO = OooO0OO(o00oo1);
        synchronized (o00o0o2) {
            o00o0o2.OooOo00();
            o00o0o2.OooO0OO();
            p340o0OO0ooO.o00O0O.Oooo0oO(strOooO0OO);
            o0OO0ooO.o00O0O.OooO0o oooO0o = o00o0o2.f42543OooOOO.get(strOooO0OO);
            if (oooO0o == null) {
                return;
            }
            o00o0o2.Oooo0OO(oooO0o);
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f21065OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Oooo0 f21066OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f21067OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Protocol f21068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f21069OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f21070OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Oooo0 f21071OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Oooo000 f21072OooO0oo;

        public OooO0o(oO00000 oo00000) throws IOException {
            try {
                o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(oo00000);
                this.f21065OooO00o = o0o0000VarOooO0O0.OoooO0O();
                this.f21067OooO0OO = o0o0000VarOooO0O0.OoooO0O();
                Oooo0.OooO00o oooO00o = new Oooo0.OooO00o();
                int iOooO00o = OooO0OO.OooO00o(o0o0000VarOooO0O0);
                for (int i = 0; i < iOooO00o; i++) {
                    oooO00o.OooO0O0(o0o0000VarOooO0O0.OoooO0O());
                }
                this.f21066OooO0O0 = new Oooo0(oooO00o);
                o0OO.o000oOoO o000ooooOooO00o = o0OO.o000oOoO.OooO00o(o0o0000VarOooO0O0.OoooO0O());
                this.f21068OooO0Oo = o000ooooOooO00o.f42231OooO00o;
                this.f21070OooO0o0 = o000ooooOooO00o.f42232OooO0O0;
                this.f21069OooO0o = o000ooooOooO00o.f42233OooO0OO;
                Oooo0.OooO00o oooO00o2 = new Oooo0.OooO00o();
                int iOooO00o2 = OooO0OO.OooO00o(o0o0000VarOooO0O0);
                for (int i2 = 0; i2 < iOooO00o2; i2++) {
                    oooO00o2.OooO0O0(o0o0000VarOooO0O0.OoooO0O());
                }
                this.f21071OooO0oO = new Oooo0(oooO00o2);
                if (this.f21065OooO00o.startsWith("https://")) {
                    String strOoooO0O = o0o0000VarOooO0O0.OoooO0O();
                    if (strOoooO0O.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strOoooO0O + "\"");
                    }
                    String strOoooO0O2 = o0o0000VarOooO0O0.OoooO0O();
                    List listOooO00o = OooO00o(o0o0000VarOooO0O0);
                    List listOooO00o2 = OooO00o(o0o0000VarOooO0O0);
                    byte[] bArr = o000OOo.f42529OooO00o;
                    this.f21072OooO0oo = new Oooo000(strOoooO0O2, Collections.unmodifiableList(new ArrayList(listOooO00o)), Collections.unmodifiableList(new ArrayList(listOooO00o2)));
                } else {
                    this.f21072OooO0oo = null;
                }
                oo00000.close();
            } catch (Throwable th) {
                oo00000.close();
                throw th;
            }
        }

        public static List OooO00o(o0o0000 o0o0000Var) throws IOException {
            int iOooO00o = OooO0OO.OooO00o(o0o0000Var);
            if (iOooO00o == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iOooO00o);
                for (int i = 0; i < iOooO00o; i++) {
                    String strOoooO0O = o0o0000Var.OoooO0O();
                    oo0OOoo oo0oooo = new oo0OOoo();
                    ByteString byteString = ByteString.f60193OooO0oO;
                    oo0oooo.o00O0O(ByteString.OooO00o.OooO00o(strOoooO0O));
                    arrayList.add(certificateFactory.generateCertificate(oo0oooo.new OooO0O0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static void OooO0O0(o0OOo000 o0ooo001, List list) throws IOException {
            try {
                o0ooo001.Ooooo00(list.size());
                o0ooo001.o0ooOO0(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    o0ooo001.Oooo000(ByteString.OooOOO0(((Certificate) list.get(i)).getEncoded()).OooO00o());
                    o0ooo001.o0ooOO0(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void OooO0OO(o0OO0ooO.o00O0O.OooO0OO oooO0OO) throws Throwable {
            o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(oooO0OO.OooO0OO(0));
            String str = this.f21065OooO00o;
            o0ooo000OooO00o.Oooo000(str);
            o0ooo000OooO00o.o0ooOO0(10);
            o0ooo000OooO00o.Oooo000(this.f21067OooO0OO);
            o0ooo000OooO00o.o0ooOO0(10);
            Oooo0 oooo0 = this.f21066OooO0O0;
            o0ooo000OooO00o.Ooooo00(oooo0.f21113OooO00o.length / 2);
            o0ooo000OooO00o.o0ooOO0(10);
            int length = oooo0.f21113OooO00o.length / 2;
            for (int i = 0; i < length; i++) {
                o0ooo000OooO00o.Oooo000(oooo0.OooO0O0(i));
                o0ooo000OooO00o.Oooo000(": ");
                o0ooo000OooO00o.Oooo000(oooo0.OooO0Oo(i));
                o0ooo000OooO00o.o0ooOO0(10);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21068OooO0Oo == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
            sb.append(' ');
            sb.append(this.f21070OooO0o0);
            String str2 = this.f21069OooO0o;
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            o0ooo000OooO00o.Oooo000(sb.toString());
            o0ooo000OooO00o.o0ooOO0(10);
            Oooo0 oooo1 = this.f21071OooO0oO;
            o0ooo000OooO00o.Ooooo00(oooo1.f21113OooO00o.length / 2);
            o0ooo000OooO00o.o0ooOO0(10);
            int length2 = oooo1.f21113OooO00o.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                o0ooo000OooO00o.Oooo000(oooo1.OooO0O0(i2));
                o0ooo000OooO00o.Oooo000(": ");
                o0ooo000OooO00o.Oooo000(oooo1.OooO0Oo(i2));
                o0ooo000OooO00o.o0ooOO0(10);
            }
            if (str.startsWith("https://")) {
                o0ooo000OooO00o.o0ooOO0(10);
                Oooo000 oooo000 = this.f21072OooO0oo;
                o0ooo000OooO00o.Oooo000(oooo000.f21115OooO00o);
                o0ooo000OooO00o.o0ooOO0(10);
                OooO0O0(o0ooo000OooO00o, oooo000.f21116OooO0O0);
                OooO0O0(o0ooo000OooO00o, oooo000.f21117OooO0OO);
            }
            o0ooo000OooO00o.close();
        }

        public OooO0o(o00Ooo o00ooo2) {
            Oooo0 oooo0;
            this.f21065OooO00o = o00ooo2.f21175OooO00o.f21164OooO00o.f21128OooO0oo;
            o0OO.OooOOOO.OooO00o oooO00o = o0OO.OooOOOO.f42212OooO00o;
            Oooo0 oooo1 = o00ooo2.f21182OooO0oo.f21175OooO00o.f21166OooO0OO;
            Oooo0 oooo2 = o00ooo2.f21179OooO0o;
            Set<String> setOooO0o0 = o0OO.OooOOOO.OooO0o0(oooo2);
            if (setOooO0o0.isEmpty()) {
                oooo0 = new Oooo0(new Oooo0.OooO00o());
            } else {
                Oooo0.OooO00o oooO00o2 = new Oooo0.OooO00o();
                int length = oooo1.f21113OooO00o.length / 2;
                for (int i = 0; i < length; i++) {
                    String strOooO0O0 = oooo1.OooO0O0(i);
                    if (setOooO0o0.contains(strOooO0O0)) {
                        oooO00o2.OooO00o(strOooO0O0, oooo1.OooO0Oo(i));
                    }
                }
                oooo0 = new Oooo0(oooO00o2);
            }
            this.f21066OooO0O0 = oooo0;
            this.f21067OooO0OO = o00ooo2.f21175OooO00o.f21165OooO0O0;
            this.f21068OooO0Oo = o00ooo2.f21176OooO0O0;
            this.f21070OooO0o0 = o00ooo2.f21177OooO0OO;
            this.f21069OooO0o = o00ooo2.f21178OooO0Oo;
            this.f21071OooO0oO = oooo2;
            this.f21072OooO0oo = o00ooo2.f21180OooO0o0;
        }
    }
}
