package p412o0Oo0o00;

import com.squareup.okhttp.Protocol;
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
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o0oooo0.o0oOO.OooO0O0;
import okio.ByteString;
import org.conscrypt.EvpMdRef;
import p413o0Oo0o0O.o000000;
import p413o0Oo0o0O.o000OOo;
import p413o0Oo0o0O.o0OOO0o;
import p413o0Oo0o0O.oo000o;
import p416o0Oo0oO0.o00000O0;
import p416o0Oo0oO0.o00Oo0;
import p416o0Oo0oO0.o0O0O00;
import p674o0oooo0.o0;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f39213OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo000o f39214OooO0O0;

    public class OooO00o implements o0OOO0o {
        public OooO00o() {
        }
    }

    public final class OooO0O0 implements o00Oo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo000o.OooO0o f39216OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0O00o00 f39217OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f39218OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO00o f39219OooO0Oo;

        public class OooO00o extends o0 {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ oo000o.OooO0o f39221Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0O00o00 o0o00o01, oo000o.OooO0o oooO0o) {
                super(o0o00o01);
                this.f39221Oooo0o = oooO0o;
            }

            @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                synchronized (o000000O.this) {
                    OooO0O0 oooO0O0 = OooO0O0.this;
                    if (oooO0O0.f39218OooO0OO) {
                        return;
                    }
                    oooO0O0.f39218OooO0OO = true;
                    Objects.requireNonNull(o000000O.this);
                    super.close();
                    this.f39221Oooo0o.OooO0O0();
                }
            }
        }

        public OooO0O0(oo000o.OooO0o oooO0o) throws IOException {
            this.f39216OooO00o = oooO0o;
            o0O00o00 o0o00o00OooO0OO = oooO0o.OooO0OO(1);
            this.f39217OooO0O0 = o0o00o00OooO0OO;
            this.f39219OooO0Oo = new OooO00o(o0o00o00OooO0OO, oooO0o);
        }

        public final void OooO00o() {
            synchronized (o000000O.this) {
                if (this.f39218OooO0OO) {
                    return;
                }
                this.f39218OooO0OO = true;
                Objects.requireNonNull(o000000O.this);
                o000000.OooO0OO(this.f39217OooO0O0);
                try {
                    this.f39216OooO00o.OooO00o();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static class OooO0OO extends o000Oo0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final oo000o.OooOO0 f39223Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final o0O00OO f39224Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final String f39225Oooo0oo;

        public OooO0OO(oo000o.OooOO0 oooOO1, String str) {
            this.f39223Oooo0o = oooOO1;
            this.f39225Oooo0oo = str;
            this.f39224Oooo0oO = (o0O00OO) o0O000Oo.OooO0OO(new o00000(oooOO1.f39413Oooo0oo[1], oooOO1));
        }

        @Override // p412o0Oo0o00.o000Oo0
        public final long OooO00o() {
            try {
                String str = this.f39225Oooo0oo;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // p412o0Oo0o00.o000Oo0
        public final o0oOOo OooO0O0() {
            return this.f39224Oooo0oO;
        }
    }

    public o000000O(File file, long j) {
        Pattern pattern = oo000o.f39375OooooOO;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = o000000.f39346OooO00o;
        this.f39214OooO0O0 = new oo000o(file, j, new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new o000OOo("OkHttp DiskLruCache")));
    }

    public static int OooO00o(o0oOOo o0oooo2) throws IOException {
        try {
            o0O00OO o0o00oo2 = (o0O00OO) o0oooo2;
            long jOooO0Oo = o0o00oo2.OooO0Oo();
            String strO0ooOO0 = o0o00oo2.o0ooOO0();
            if (jOooO0Oo >= 0 && jOooO0Oo <= 2147483647L && strO0ooOO0.isEmpty()) {
                return (int) jOooO0Oo;
            }
            throw new IOException("expected an int but was \"" + jOooO0Oo + strO0ooOO0 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static String OooO0OO(o000O000 o000o001) {
        String str = o000o001.f39302OooO00o.f39266OooO0oo;
        byte[] bArr = o000000.f39346OooO00o;
        try {
            return ByteString.OooO(MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME).digest(str.getBytes("UTF-8"))).OooO0o();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO0O0(o000O000 o000o001) throws IOException {
        oo000o oo000oVar = this.f39214OooO0O0;
        String strOooO0OO = OooO0OO(o000o001);
        synchronized (oo000oVar) {
            oo000oVar.OooO0oo();
            oo000oVar.OooO0O0();
            oo000oVar.Oooo0(strOooO0OO);
            oo000o.OooO oooO = oo000oVar.f39386OoooOOO.get(strOooO0OO);
            if (oooO == null) {
                return;
            }
            oo000oVar.OooOoo(oooO);
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f39226OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OO f39227OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f39228OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Protocol f39229OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f39230OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f39231OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o000OO f39232OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final o0000O0O f39233OooO0oo;

        public OooO0o(o0O0O0O o0o0o0o) throws IOException {
            try {
                o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(o0o0o0o);
                o0O00OO o0o00oo2 = (o0O00OO) o0ooooOooO0OO;
                this.f39226OooO00o = o0o00oo2.o0ooOO0();
                this.f39228OooO0OO = o0o00oo2.o0ooOO0();
                o000OO.OooO00o oooO00o = new o000OO.OooO00o();
                int iOooO00o = o000000O.OooO00o(o0ooooOooO0OO);
                for (int i = 0; i < iOooO00o; i++) {
                    oooO00o.OooO0O0(o0o00oo2.o0ooOO0());
                }
                this.f39227OooO0O0 = oooO00o.OooO0Oo();
                o00000O0 o00000o0OooO00o = o00000O0.OooO00o(o0o00oo2.o0ooOO0());
                this.f39229OooO0Oo = o00000o0OooO00o.f39575OooO00o;
                this.f39231OooO0o0 = o00000o0OooO00o.f39576OooO0O0;
                this.f39230OooO0o = o00000o0OooO00o.f39577OooO0OO;
                o000OO.OooO00o oooO00o2 = new o000OO.OooO00o();
                int iOooO00o2 = o000000O.OooO00o(o0ooooOooO0OO);
                for (int i2 = 0; i2 < iOooO00o2; i2++) {
                    oooO00o2.OooO0O0(o0o00oo2.o0ooOO0());
                }
                this.f39232OooO0oO = oooO00o2.OooO0Oo();
                if (this.f39226OooO00o.startsWith("https://")) {
                    String strO0ooOO0 = o0o00oo2.o0ooOO0();
                    if (strO0ooOO0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strO0ooOO0 + "\"");
                    }
                    String strO0ooOO1 = o0o00oo2.o0ooOO0();
                    List<Certificate> listOooO00o = OooO00o(o0ooooOooO0OO);
                    List<Certificate> listOooO00o2 = OooO00o(o0ooooOooO0OO);
                    if (strO0ooOO1 == null) {
                        throw new IllegalArgumentException("cipherSuite == null");
                    }
                    this.f39233OooO0oo = new o0000O0O(strO0ooOO1, o000000.OooO0oo(listOooO00o), o000000.OooO0oo(listOooO00o2));
                } else {
                    this.f39233OooO0oo = null;
                }
                o0o0o0o.close();
            } catch (Throwable th) {
                o0o0o0o.close();
                throw th;
            }
        }

        public final List<Certificate> OooO00o(o0oOOo o0oooo2) throws IOException {
            int iOooO00o = o000000O.OooO00o(o0oooo2);
            if (iOooO00o == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iOooO00o);
                for (int i = 0; i < iOooO00o; i++) {
                    String strO0ooOO0 = ((o0O00OO) o0oooo2).o0ooOO0();
                    o0oOO o0ooo2 = new o0oOO();
                    o0ooo2.OoooOOO(ByteString.f53047OoooO00.OooO00o(strO0ooOO0));
                    arrayList.add(certificateFactory.generateCertificate(o0ooo2.new OooO0O0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void OooO0O0(oo00oO oo00oo, List<Certificate> list) throws IOException {
            try {
                o0O00O o0o00o2 = (o0O00O) oo00oo;
                o0o00o2.o0000O0(list.size());
                o0o00o2.Oooo000(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    o0o00o2.OoooOoo(ByteString.OooO(list.get(i).getEncoded()).OooO00o());
                    o0o00o2.Oooo000(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void OooO0OO(oo000o.OooO0o oooO0o) throws IOException {
            oo00oO oo00ooOooO0O0 = o0O000Oo.OooO0O0(oooO0o.OooO0OO(0));
            o0O00O o0o00o2 = (o0O00O) oo00ooOooO0O0;
            o0o00o2.OoooOoo(this.f39226OooO00o);
            o0o00o2.Oooo000(10);
            o0o00o2.OoooOoo(this.f39228OooO0OO);
            o0o00o2.Oooo000(10);
            o0o00o2.o0000O0(this.f39227OooO0O0.f39333OooO00o.length / 2);
            o0o00o2.Oooo000(10);
            int length = this.f39227OooO0O0.f39333OooO00o.length / 2;
            for (int i = 0; i < length; i++) {
                o0o00o2.OoooOoo(this.f39227OooO0O0.OooO0O0(i));
                o0o00o2.OoooOoo(": ");
                o0o00o2.OoooOoo(this.f39227OooO0O0.OooO0Oo(i));
                o0o00o2.Oooo000(10);
            }
            Protocol protocol = this.f39229OooO0Oo;
            int i2 = this.f39231OooO0o0;
            String str = this.f39230OooO0o;
            StringBuilder sb = new StringBuilder();
            sb.append(protocol == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
            sb.append(' ');
            sb.append(i2);
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
            o0o00o2.OoooOoo(sb.toString());
            o0o00o2.Oooo000(10);
            o0o00o2.o0000O0(this.f39232OooO0oO.f39333OooO00o.length / 2);
            o0o00o2.Oooo000(10);
            int length2 = this.f39232OooO0oO.f39333OooO00o.length / 2;
            for (int i3 = 0; i3 < length2; i3++) {
                o0o00o2.OoooOoo(this.f39232OooO0oO.OooO0O0(i3));
                o0o00o2.OoooOoo(": ");
                o0o00o2.OoooOoo(this.f39232OooO0oO.OooO0Oo(i3));
                o0o00o2.Oooo000(10);
            }
            if (this.f39226OooO00o.startsWith("https://")) {
                o0o00o2.Oooo000(10);
                o0o00o2.OoooOoo(this.f39233OooO0oo.f39283OooO00o);
                o0o00o2.Oooo000(10);
                OooO0O0(oo00ooOooO0O0, this.f39233OooO0oo.f39284OooO0O0);
                OooO0O0(oo00ooOooO0O0, this.f39233OooO0oo.f39285OooO0OO);
            }
            o0o00o2.close();
        }

        public OooO0o(o000O0o o000o0o2) {
            o000OO o000ooOooO0Oo;
            this.f39226OooO00o = o000o0o2.f39313OooO00o.f39302OooO00o.f39266OooO0oo;
            Comparator<String> comparator = o0O0O00.f39585OooO00o;
            o000OO o000oo2 = o000o0o2.f39320OooO0oo.f39313OooO00o.f39304OooO0OO;
            Set<String> setOooO0o0 = o0O0O00.OooO0o0(o000o0o2.f39317OooO0o);
            if (setOooO0o0.isEmpty()) {
                o000ooOooO0Oo = new o000OO.OooO00o().OooO0Oo();
            } else {
                o000OO.OooO00o oooO00o = new o000OO.OooO00o();
                int length = o000oo2.f39333OooO00o.length / 2;
                for (int i = 0; i < length; i++) {
                    String strOooO0O0 = o000oo2.OooO0O0(i);
                    if (setOooO0o0.contains(strOooO0O0)) {
                        oooO00o.OooO00o(strOooO0O0, o000oo2.OooO0Oo(i));
                    }
                }
                o000ooOooO0Oo = oooO00o.OooO0Oo();
            }
            this.f39227OooO0O0 = o000ooOooO0Oo;
            this.f39228OooO0OO = o000o0o2.f39313OooO00o.f39303OooO0O0;
            this.f39229OooO0Oo = o000o0o2.f39314OooO0O0;
            this.f39231OooO0o0 = o000o0o2.f39315OooO0OO;
            this.f39230OooO0o = o000o0o2.f39316OooO0Oo;
            this.f39232OooO0oO = o000o0o2.f39317OooO0o;
            this.f39233OooO0oo = o000o0o2.f39318OooO0o0;
        }
    }
}
