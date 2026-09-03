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
import o0oooO00.o00000O.OooO0O0;
import okio.ByteString;
import p338o0OO0ooo.o0000O00;
import p338o0OO0ooo.o000OO0O;
import p338o0OO0ooo.o000Oo0;
import p659o0oooO00.o00;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f21525OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p336o0OO0oo0.OooO0o f21526OooO0O0;

    public class OooO00o implements p336o0OO0oo0.OooOOO0 {
        public OooO00o() {
        }
    }

    public final class OooO0O0 implements o0000O00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OO0oo0.OooO0o.OooO0OO f21528OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O000 f21529OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f21530OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f21531OooO0Oo;

        public class OooO00o extends o0000O {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0OO0oo0.OooO0o.OooO0OO f21533OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00O000 o00o001, o0OO0oo0.OooO0o.OooO0OO oooO0OO) {
                super(o00o001);
                this.f21533OooO0Oo = oooO0OO;
            }

            @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                synchronized (OooO0OO.this) {
                    OooO0O0 oooO0O0 = OooO0O0.this;
                    if (oooO0O0.f21530OooO0OO) {
                        return;
                    }
                    oooO0O0.f21530OooO0OO = true;
                    OooO0OO.this.getClass();
                    super.close();
                    this.f21533OooO0Oo.OooO0O0();
                }
            }
        }

        public OooO0O0(o0OO0oo0.OooO0o.OooO0OO oooO0OO) throws IOException {
            this.f21528OooO00o = oooO0OO;
            o00O000 o00o000OooO0OO = oooO0OO.OooO0OO(1);
            this.f21529OooO0O0 = o00o000OooO0OO;
            this.f21531OooO0Oo = new OooO00o(o00o000OooO0OO, oooO0OO);
        }

        public final void OooO00o() {
            synchronized (OooO0OO.this) {
                if (this.f21530OooO0OO) {
                    return;
                }
                this.f21530OooO0OO = true;
                OooO0OO.this.getClass();
                p336o0OO0oo0.o000oOoO.OooO0O0(this.f21529OooO0O0);
                try {
                    this.f21528OooO00o.OooO00o();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.okhttp.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C0276OooO0OO extends o00oO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0OO0oo0.OooO0o.OooO f21535OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f21536OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00O0000 f21537OooO0o0;

        public C0276OooO0OO(o0OO0oo0.OooO0o.OooO oooO, String str) {
            this.f21535OooO0Oo = oooO;
            this.f21536OooO0o = str;
            this.f21537OooO0o0 = o000O0Oo.OooO0O0(new com.squareup.okhttp.OooO0o(oooO.f43285OooO0o[1], oooO));
        }

        @Override // com.squareup.okhttp.o00oO0o
        public final long OooO00o() {
            try {
                String str = this.f21536OooO0o;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // com.squareup.okhttp.o00oO0o
        public final o0000 OooO0OO() {
            return this.f21537OooO0o0;
        }
    }

    public OooO0OO(File file, long j) {
        Pattern pattern = p336o0OO0oo0.OooO0o.f43264OooOo0O;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = p336o0OO0oo0.o000oOoO.f43328OooO00o;
        this.f21526OooO0O0 = new p336o0OO0oo0.OooO0o(file, j, new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new p336o0OO0oo0.Oooo0("OkHttp DiskLruCache")));
    }

    public static int OooO00o(o00O0000 o00o0001) throws IOException {
        try {
            long jOooO0OO = o00o0001.OooO0OO();
            String strOoooO0 = o00o0001.OoooO0();
            if (jOooO0OO >= 0 && jOooO0OO <= 2147483647L && strOoooO0.isEmpty()) {
                return (int) jOooO0OO;
            }
            throw new IOException("expected an int but was \"" + jOooO0OO + strOoooO0 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static String OooO0OO(o00Ooo o00ooo2) {
        String str = o00ooo2.f21620OooO00o.f21638OooO0oo;
        byte[] bArr = p336o0OO0oo0.o000oOoO.f43328OooO00o;
        try {
            return ByteString.OooOOO0(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).OooO0o();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO0O0(o00Ooo o00ooo2) throws IOException {
        p336o0OO0oo0.OooO0o oooO0o = this.f21526OooO0O0;
        String strOooO0OO = OooO0OO(o00ooo2);
        synchronized (oooO0o) {
            oooO0o.OooOOo();
            oooO0o.OooO0OO();
            p336o0OO0oo0.OooO0o.Oooo0o0(strOooO0OO);
            p336o0OO0oo0.OooO0o.C0456OooO0o c0456OooO0o = oooO0o.f43275OooOOO.get(strOooO0OO);
            if (c0456OooO0o == null) {
                return;
            }
            oooO0o.Oooo0O0(c0456OooO0o);
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f21538OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000oOoO f21539OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f21540OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Protocol f21541OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f21542OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f21543OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o000oOoO f21544OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Oooo0 f21545OooO0oo;

        public OooO0o(o00O00 o00o01) throws IOException {
            try {
                o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o00o01);
                this.f21538OooO00o = o00o0000OooO0O0.OoooO0();
                this.f21540OooO0OO = o00o0000OooO0O0.OoooO0();
                o000oOoO.OooO00o oooO00o = new o000oOoO.OooO00o();
                int iOooO00o = OooO0OO.OooO00o(o00o0000OooO0O0);
                for (int i = 0; i < iOooO00o; i++) {
                    oooO00o.OooO0O0(o00o0000OooO0O0.OoooO0());
                }
                this.f21539OooO0O0 = new o000oOoO(oooO00o);
                o000OO0O o000oo0oOooO00o = o000OO0O.OooO00o(o00o0000OooO0O0.OoooO0());
                this.f21541OooO0Oo = o000oo0oOooO00o.f43552OooO00o;
                this.f21543OooO0o0 = o000oo0oOooO00o.f43553OooO0O0;
                this.f21542OooO0o = o000oo0oOooO00o.f43554OooO0OO;
                o000oOoO.OooO00o oooO00o2 = new o000oOoO.OooO00o();
                int iOooO00o2 = OooO0OO.OooO00o(o00o0000OooO0O0);
                for (int i2 = 0; i2 < iOooO00o2; i2++) {
                    oooO00o2.OooO0O0(o00o0000OooO0O0.OoooO0());
                }
                this.f21544OooO0oO = new o000oOoO(oooO00o2);
                if (this.f21538OooO00o.startsWith("https://")) {
                    String strOoooO0 = o00o0000OooO0O0.OoooO0();
                    if (strOoooO0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strOoooO0 + "\"");
                    }
                    String strOoooO1 = o00o0000OooO0O0.OoooO0();
                    List listOooO00o = OooO00o(o00o0000OooO0O0);
                    List listOooO00o2 = OooO00o(o00o0000OooO0O0);
                    byte[] bArr = p336o0OO0oo0.o000oOoO.f43328OooO00o;
                    this.f21545OooO0oo = new Oooo0(strOoooO1, Collections.unmodifiableList(new ArrayList(listOooO00o)), Collections.unmodifiableList(new ArrayList(listOooO00o2)));
                } else {
                    this.f21545OooO0oo = null;
                }
                o00o01.close();
            } catch (Throwable th) {
                o00o01.close();
                throw th;
            }
        }

        public static List OooO00o(o00O0000 o00o0001) throws IOException {
            int iOooO00o = OooO0OO.OooO00o(o00o0001);
            if (iOooO00o == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iOooO00o);
                for (int i = 0; i < iOooO00o; i++) {
                    String strOoooO0 = o00o0001.OoooO0();
                    o00000O o00000o = new o00000O();
                    ByteString byteString = ByteString.f60866OooO0oO;
                    o00000o.OoooooO(ByteString.OooO00o.OooO00o(strOoooO0));
                    arrayList.add(certificateFactory.generateCertificate(o00000o.new OooO0O0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static void OooO0O0(o00 o00Var, List list) throws IOException {
            try {
                o00Var.Ooooo00(list.size());
                o00Var.o00oO0o(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    o00Var.OooOooo(ByteString.OooOOO0(((Certificate) list.get(i)).getEncoded()).OooO00o());
                    o00Var.o00oO0o(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void OooO0OO(o0OO0oo0.OooO0o.OooO0OO oooO0OO) throws Throwable {
            o00 o00VarOooO00o = o000O0Oo.OooO00o(oooO0OO.OooO0OO(0));
            String str = this.f21538OooO00o;
            o00VarOooO00o.OooOooo(str);
            o00VarOooO00o.o00oO0o(10);
            o00VarOooO00o.OooOooo(this.f21540OooO0OO);
            o00VarOooO00o.o00oO0o(10);
            o000oOoO o000oooo2 = this.f21539OooO0O0;
            o00VarOooO00o.Ooooo00(o000oooo2.f21591OooO00o.length / 2);
            o00VarOooO00o.o00oO0o(10);
            int length = o000oooo2.f21591OooO00o.length / 2;
            for (int i = 0; i < length; i++) {
                o00VarOooO00o.OooOooo(o000oooo2.OooO0O0(i));
                o00VarOooO00o.OooOooo(": ");
                o00VarOooO00o.OooOooo(o000oooo2.OooO0Oo(i));
                o00VarOooO00o.o00oO0o(10);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21541OooO0Oo == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
            sb.append(' ');
            sb.append(this.f21543OooO0o0);
            String str2 = this.f21542OooO0o;
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            o00VarOooO00o.OooOooo(sb.toString());
            o00VarOooO00o.o00oO0o(10);
            o000oOoO o000oooo3 = this.f21544OooO0oO;
            o00VarOooO00o.Ooooo00(o000oooo3.f21591OooO00o.length / 2);
            o00VarOooO00o.o00oO0o(10);
            int length2 = o000oooo3.f21591OooO00o.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                o00VarOooO00o.OooOooo(o000oooo3.OooO0O0(i2));
                o00VarOooO00o.OooOooo(": ");
                o00VarOooO00o.OooOooo(o000oooo3.OooO0Oo(i2));
                o00VarOooO00o.o00oO0o(10);
            }
            if (str.startsWith("https://")) {
                o00VarOooO00o.o00oO0o(10);
                Oooo0 oooo0 = this.f21545OooO0oo;
                o00VarOooO00o.OooOooo(oooo0.f21585OooO00o);
                o00VarOooO00o.o00oO0o(10);
                OooO0O0(o00VarOooO00o, oooo0.f21586OooO0O0);
                OooO0O0(o00VarOooO00o, oooo0.f21587OooO0OO);
            }
            o00VarOooO00o.close();
        }

        public OooO0o(oo000o oo000oVar) {
            o000oOoO o000oooo2;
            this.f21538OooO00o = oo000oVar.f21651OooO00o.f21620OooO00o.f21638OooO0oo;
            o000Oo0.OooO00o oooO00o = o000Oo0.f43555OooO00o;
            o000oOoO o000oooo3 = oo000oVar.f21658OooO0oo.f21651OooO00o.f21622OooO0OO;
            o000oOoO o000oooo4 = oo000oVar.f21655OooO0o;
            Set<String> setOooO0o0 = o000Oo0.OooO0o0(o000oooo4);
            if (setOooO0o0.isEmpty()) {
                o000oooo2 = new o000oOoO(new o000oOoO.OooO00o());
            } else {
                o000oOoO.OooO00o oooO00o2 = new o000oOoO.OooO00o();
                int length = o000oooo3.f21591OooO00o.length / 2;
                for (int i = 0; i < length; i++) {
                    String strOooO0O0 = o000oooo3.OooO0O0(i);
                    if (setOooO0o0.contains(strOooO0O0)) {
                        oooO00o2.OooO00o(strOooO0O0, o000oooo3.OooO0Oo(i));
                    }
                }
                o000oooo2 = new o000oOoO(oooO00o2);
            }
            this.f21539OooO0O0 = o000oooo2;
            this.f21540OooO0OO = oo000oVar.f21651OooO00o.f21621OooO0O0;
            this.f21541OooO0Oo = oo000oVar.f21652OooO0O0;
            this.f21543OooO0o0 = oo000oVar.f21653OooO0OO;
            this.f21542OooO0o = oo000oVar.f21654OooO0Oo;
            this.f21544OooO0oO = o000oooo4;
            this.f21545OooO0oo = oo000oVar.f21656OooO0o0;
        }
    }
}
