package p660o0ooo0o0;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import o0oooo0.o0oOO.OooO0O0;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;
import org.conscrypt.EvpMdRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0ooo0o.o00OOO00;
import p661o0ooo0oo.o0O0ooO;
import p664o0oooO00.o000000O;
import p666o0oooO0o.oOo000Oo;
import p667o0oooOO.s;
import p668o0oooOO0.o0O0oo0o;
import p668o0oooOO0.o0oO0O0o;
import p674o0oooo0.o0;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00 implements Closeable, Flushable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO0O0 f51191Oooo0oO = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0O0ooO f51192Oooo0o;

    public static final class OooO00o extends o00OOOOo {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NotNull
        public final o0O0ooO.OooO0OO f51193Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final o0O00OO f51194Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final String f51195OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final String f51196OoooO00;

        /* JADX INFO: renamed from: o0ooo0o0.o00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0426OooO00o extends o0O00000 {

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0O0O0O f51198Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0426OooO00o(o0O0O0O o0o0o0o, o0O0O0O o0o0o0o2) {
                super(o0o0o0o2);
                this.f51198Oooo0oo = o0o0o0o;
            }

            @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                OooO00o.this.f51193Oooo.close();
                super.close();
            }
        }

        public OooO00o(@NotNull o0O0ooO.OooO0OO snapshot, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f51193Oooo = snapshot;
            this.f51196OoooO00 = str;
            this.f51195OoooO0 = str2;
            o0O0O0O o0o0o0o = snapshot.f51548Oooo0oo.get(1);
            this.f51194Oooo0oo = (o0O00OO) o0O000Oo.OooO0OO(new C0426OooO00o(o0o0o0o, o0o0o0o));
        }

        @Override // p660o0ooo0o0.o00OOOOo
        public final long OooO0Oo() {
            String toLongOrDefault = this.f51195OoooO0;
            if (toLongOrDefault == null) {
                return -1L;
            }
            byte[] bArr = o00OOO00.f51183OooO00o;
            Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
            try {
                return Long.parseLong(toLongOrDefault);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // p660o0ooo0o0.o00OOOOo
        @Nullable
        public final o00OO0O0 OooO0o() {
            String str = this.f51196OoooO00;
            if (str != null) {
                return o00OO0O0.f51401OooO0oO.OooO0O0(str);
            }
            return null;
        }

        @Override // p660o0ooo0o0.o00OOOOo
        @NotNull
        public final o0oOOo OooO0oo() {
            return this.f51194Oooo0oo;
        }
    }

    public static final class OooO0O0 {
        @JvmStatic
        @NotNull
        public final String OooO00o(@NotNull o00OO000 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return ByteString.f53047OoooO00.OooO0OO(url.f51390OooOO0).OooO0O0(EvpMdRef.MD5.JCA_NAME).OooO0o();
        }

        public final int OooO0O0(@NotNull o0oOOo source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                o0O00OO o0o00oo2 = (o0O00OO) source;
                long jOooO0Oo = o0o00oo2.OooO0Oo();
                String strO0ooOO0 = o0o00oo2.o0ooOO0();
                if (jOooO0Oo >= 0 && jOooO0Oo <= Integer.MAX_VALUE) {
                    if (!(strO0ooOO0.length() > 0)) {
                        return (int) jOooO0Oo;
                    }
                }
                throw new IOException("expected an int but was \"" + jOooO0Oo + strO0ooOO0 + Typography.quote);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Set<String> OooO0OO(o00O o00o2) {
            int length = o00o2.f51230Oooo0o.length / 2;
            TreeSet treeSet = null;
            for (int i = 0; i < length; i++) {
                if (StringsKt.OooO("Vary", o00o2.OooO0O0(i))) {
                    String strOooO0o0 = o00o2.OooO0o0(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    for (String str : StringsKt__StringsKt.split$default(strOooO0o0, new char[]{','}, false, 0, 6, (Object) null)) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        treeSet.add(StringsKt.trim((CharSequence) str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : SetsKt.emptySet();
        }
    }

    public final class OooO0o implements p661o0ooo0oo.o00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O00o00 f51211OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f51212OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f51213OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0O0ooO.OooO00o f51214OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00 f51215OooO0o0;

        public static final class OooO00o extends o0 {
            public OooO00o(o0O00o00 o0o00o01) {
                super(o0o00o01);
            }

            @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                synchronized (OooO0o.this.f51215OooO0o0) {
                    OooO0o oooO0o = OooO0o.this;
                    if (oooO0o.f51213OooO0OO) {
                        return;
                    }
                    oooO0o.f51213OooO0OO = true;
                    Objects.requireNonNull(oooO0o.f51215OooO0o0);
                    super.close();
                    OooO0o.this.f51214OooO0Oo.OooO0O0();
                }
            }
        }

        public OooO0o(@NotNull o00 o00Var, o0O0ooO.OooO00o editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f51215OooO0o0 = o00Var;
            this.f51214OooO0Oo = editor;
            o0O00o00 o0o00o00OooO0Oo = editor.OooO0Oo(1);
            this.f51211OooO00o = o0o00o00OooO0Oo;
            this.f51212OooO0O0 = new OooO00o(o0o00o00OooO0Oo);
        }

        @Override // p661o0ooo0oo.o00
        public final void OooO00o() {
            synchronized (this.f51215OooO0o0) {
                if (this.f51213OooO0OO) {
                    return;
                }
                this.f51213OooO0OO = true;
                Objects.requireNonNull(this.f51215OooO0o0);
                o00OOO00.OooO0Oo(this.f51211OooO00o);
                try {
                    this.f51214OooO0Oo.OooO00o();
                } catch (IOException unused) {
                }
            }
        }
    }

    public o00(@NotNull File directory, long j) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        o0oO0O0o fileSystem = o0O0oo0o.f51922OooO00o;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f51192Oooo0o = new o0O0ooO(directory, j, o000000O.f51825OooO0oo);
    }

    public final void OooO00o(@NotNull o00OOO00 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        o0O0ooO o0o0ooo = this.f51192Oooo0o;
        String key = f51191Oooo0oO.OooO00o(request.f51425OooO0O0);
        synchronized (o0o0ooo) {
            Intrinsics.checkNotNullParameter(key, "key");
            o0o0ooo.OooO0oo();
            o0o0ooo.OooO00o();
            o0o0ooo.Oooo0(key);
            o0O0ooO.OooO0O0 oooO0O0 = o0o0ooo.f51516OoooO0O.get(key);
            if (oooO0O0 != null) {
                Intrinsics.checkNotNullExpressionValue(oooO0O0, "lruEntries[key] ?: return false");
                o0o0ooo.OooOoo(oooO0O0);
                if (o0o0ooo.f51515OoooO00 <= o0o0ooo.f51510Oooo0o) {
                    o0o0ooo.f51520OoooOo0 = false;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f51192Oooo0o.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.f51192Oooo0o.flush();
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f51199OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f51200OooOO0o;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f51201OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f51202OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O f51203OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f51204OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Protocol f51205OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f51206OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f51207OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o00O f51208OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final oo0oOO0 f51209OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f51210OooOO0;

        static {
            s.OooO00o oooO00o = s.f51921OooO0OO;
            Objects.requireNonNull(s.f51919OooO00o);
            f51199OooOO0O = "OkHttp-Sent-Millis";
            Objects.requireNonNull(s.f51919OooO00o);
            f51200OooOO0o = "OkHttp-Received-Millis";
        }

        public OooO0OO(@NotNull o0O0O0O rawSource) throws IOException {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(rawSource);
                o0O00OO o0o00oo2 = (o0O00OO) o0ooooOooO0OO;
                this.f51202OooO00o = o0o00oo2.o0ooOO0();
                this.f51204OooO0OO = o0o00oo2.o0ooOO0();
                o00O.OooO00o oooO00o = new o00O.OooO00o();
                int iOooO0O0 = o00.f51191Oooo0oO.OooO0O0(o0ooooOooO0OO);
                for (int i = 0; i < iOooO0O0; i++) {
                    oooO00o.OooO0O0(o0o00oo2.o0ooOO0());
                }
                this.f51203OooO0O0 = oooO00o.OooO0Oo();
                oOo000Oo ooo000ooOooO00o = oOo000Oo.f51874OooO0Oo.OooO00o(o0o00oo2.o0ooOO0());
                this.f51205OooO0Oo = ooo000ooOooO00o.f51875OooO00o;
                this.f51207OooO0o0 = ooo000ooOooO00o.f51876OooO0O0;
                this.f51206OooO0o = ooo000ooOooO00o.f51877OooO0OO;
                o00O.OooO00o oooO00o2 = new o00O.OooO00o();
                int iOooO0O1 = o00.f51191Oooo0oO.OooO0O0(o0ooooOooO0OO);
                for (int i2 = 0; i2 < iOooO0O1; i2++) {
                    oooO00o2.OooO0O0(o0o00oo2.o0ooOO0());
                }
                String str = f51199OooOO0O;
                String strOooO0o0 = oooO00o2.OooO0o0(str);
                String str2 = f51200OooOO0o;
                String strOooO0o1 = oooO00o2.OooO0o0(str2);
                oooO00o2.OooO0o(str);
                oooO00o2.OooO0o(str2);
                this.f51201OooO = strOooO0o0 != null ? Long.parseLong(strOooO0o0) : 0L;
                this.f51210OooOO0 = strOooO0o1 != null ? Long.parseLong(strOooO0o1) : 0L;
                this.f51208OooO0oO = oooO00o2.OooO0Oo();
                if (StringsKt.OooOoOO(this.f51202OooO00o, "https://")) {
                    String strO0ooOO0 = o0o00oo2.o0ooOO0();
                    if (strO0ooOO0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strO0ooOO0 + Typography.quote);
                    }
                    o00O00 cipherSuite = o00O00.f51251OooOo00.OooO0O0(o0o00oo2.o0ooOO0());
                    List<Certificate> peerCertificates = OooO00o(o0ooooOooO0OO);
                    List<Certificate> localCertificates = OooO00o(o0ooooOooO0OO);
                    TlsVersion tlsVersion = !o0o00oo2.OooOooo() ? TlsVersion.INSTANCE.OooO00o(o0o00oo2.o0ooOO0()) : TlsVersion.SSL_3_0;
                    Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
                    Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                    Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
                    this.f51209OooO0oo = new oo0oOO0(tlsVersion, cipherSuite, o00OOO00.OooOoO(localCertificates), new o00O0OOO(o00OOO00.OooOoO(peerCertificates)));
                } else {
                    this.f51209OooO0oo = null;
                }
                rawSource.close();
            } catch (Throwable th) {
                rawSource.close();
                throw th;
            }
        }

        public final List<Certificate> OooO00o(o0oOOo o0oooo2) throws IOException {
            int iOooO0O0 = o00.f51191Oooo0oO.OooO0O0(o0oooo2);
            if (iOooO0O0 == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iOooO0O0);
                for (int i = 0; i < iOooO0O0; i++) {
                    String strO0ooOO0 = ((o0O00OO) o0oooo2).o0ooOO0();
                    o0oOO o0ooo2 = new o0oOO();
                    ByteString byteStringOooO00o = ByteString.f53047OoooO00.OooO00o(strO0ooOO0);
                    Intrinsics.checkNotNull(byteStringOooO00o);
                    o0ooo2.OoooOOO(byteStringOooO00o);
                    arrayList.add(certificateFactory.generateCertificate(o0ooo2.new OooO0O0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void OooO0O0(oo00oO oo00oo, List<? extends Certificate> list) throws IOException {
            try {
                o0O00O o0o00o2 = (o0O00O) oo00oo;
                o0o00o2.o0000O0(list.size());
                o0o00o2.Oooo000(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] bytes = list.get(i).getEncoded();
                    ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    o0o00o2.OoooOoo(ByteString.f53047OoooO00.OooO0Oo(bytes, 0, bytes.length).OooO00o());
                    o0o00o2.Oooo000(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void OooO0OO(@NotNull o0O0ooO.OooO00o editor) throws IOException {
            Intrinsics.checkNotNullParameter(editor, "editor");
            oo00oO oo00ooOooO0O0 = o0O000Oo.OooO0O0(editor.OooO0Oo(0));
            try {
                o0O00O o0o00o2 = (o0O00O) oo00ooOooO0O0;
                o0o00o2.OoooOoo(this.f51202OooO00o);
                o0o00o2.Oooo000(10);
                o0o00o2.OoooOoo(this.f51204OooO0OO);
                o0o00o2.Oooo000(10);
                o0o00o2.o0000O0(this.f51203OooO0O0.f51230Oooo0o.length / 2);
                o0o00o2.Oooo000(10);
                int length = this.f51203OooO0O0.f51230Oooo0o.length / 2;
                for (int i = 0; i < length; i++) {
                    o0o00o2.OoooOoo(this.f51203OooO0O0.OooO0O0(i));
                    o0o00o2.OoooOoo(": ");
                    o0o00o2.OoooOoo(this.f51203OooO0O0.OooO0o0(i));
                    o0o00o2.Oooo000(10);
                }
                Protocol protocol = this.f51205OooO0Oo;
                int i2 = this.f51207OooO0o0;
                String message = this.f51206OooO0o;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(message, "message");
                StringBuilder sb = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(i2);
                sb.append(' ');
                sb.append(message);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                o0o00o2.OoooOoo(string);
                o0o00o2.Oooo000(10);
                o0o00o2.o0000O0((this.f51208OooO0oO.f51230Oooo0o.length / 2) + 2);
                o0o00o2.Oooo000(10);
                int length2 = this.f51208OooO0oO.f51230Oooo0o.length / 2;
                for (int i3 = 0; i3 < length2; i3++) {
                    o0o00o2.OoooOoo(this.f51208OooO0oO.OooO0O0(i3));
                    o0o00o2.OoooOoo(": ");
                    o0o00o2.OoooOoo(this.f51208OooO0oO.OooO0o0(i3));
                    o0o00o2.Oooo000(10);
                }
                o0o00o2.OoooOoo(f51199OooOO0O);
                o0o00o2.OoooOoo(": ");
                o0o00o2.o0000O0(this.f51201OooO);
                o0o00o2.Oooo000(10);
                o0o00o2.OoooOoo(f51200OooOO0o);
                o0o00o2.OoooOoo(": ");
                o0o00o2.o0000O0(this.f51210OooOO0);
                o0o00o2.Oooo000(10);
                if (StringsKt.OooOoOO(this.f51202OooO00o, "https://")) {
                    o0o00o2.Oooo000(10);
                    oo0oOO0 oo0ooo0 = this.f51209OooO0oo;
                    Intrinsics.checkNotNull(oo0ooo0);
                    o0o00o2.OoooOoo(oo0ooo0.f51485OooO0OO.f51252OooO00o);
                    o0o00o2.Oooo000(10);
                    OooO0O0(oo00ooOooO0O0, this.f51209OooO0oo.OooO0O0());
                    OooO0O0(oo00ooOooO0O0, this.f51209OooO0oo.f51486OooO0Oo);
                    o0o00o2.OoooOoo(this.f51209OooO0oo.f51484OooO0O0.getJavaName());
                    o0o00o2.Oooo000(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(oo00ooOooO0O0, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(oo00ooOooO0O0, th);
                    throw th2;
                }
            }
        }

        public OooO0OO(@NotNull o00OOOO0 varyHeaders) {
            o00O o00oOooO0Oo;
            Intrinsics.checkNotNullParameter(varyHeaders, "response");
            this.f51202OooO00o = varyHeaders.f51439Oooo0oO.f51425OooO0O0.f51390OooOO0;
            OooO0O0 oooO0O0 = o00.f51191Oooo0oO;
            Intrinsics.checkNotNullParameter(varyHeaders, "$this$varyHeaders");
            o00OOOO0 o00oooo1 = varyHeaders.f51445OoooOO0;
            Intrinsics.checkNotNull(o00oooo1);
            o00O o00o2 = o00oooo1.f51439Oooo0oO.f51427OooO0Oo;
            Set<String> setOooO0OO = oooO0O0.OooO0OO(varyHeaders.f51444OoooO0O);
            if (setOooO0OO.isEmpty()) {
                o00oOooO0Oo = o00OOO00.f51184OooO0O0;
            } else {
                o00O.OooO00o oooO00o = new o00O.OooO00o();
                int length = o00o2.f51230Oooo0o.length / 2;
                for (int i = 0; i < length; i++) {
                    String strOooO0O0 = o00o2.OooO0O0(i);
                    if (setOooO0OO.contains(strOooO0O0)) {
                        oooO00o.OooO00o(strOooO0O0, o00o2.OooO0o0(i));
                    }
                }
                o00oOooO0Oo = oooO00o.OooO0Oo();
            }
            this.f51203OooO0O0 = o00oOooO0Oo;
            this.f51204OooO0OO = varyHeaders.f51439Oooo0oO.f51426OooO0OO;
            this.f51205OooO0Oo = varyHeaders.f51440Oooo0oo;
            this.f51207OooO0o0 = varyHeaders.f51443OoooO00;
            this.f51206OooO0o = varyHeaders.f51437Oooo;
            this.f51208OooO0oO = varyHeaders.f51444OoooO0O;
            this.f51209OooO0oo = varyHeaders.f51442OoooO0;
            this.f51201OooO = varyHeaders.f51447OoooOOo;
            this.f51210OooOO0 = varyHeaders.f51448OoooOo0;
        }
    }
}
