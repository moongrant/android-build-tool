package p417o0Oo0o0o;

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Deflater;
import kotlin.KotlinVersion;
import okio.ByteString;
import p416o0Oo0o0O.o000000;
import p676o0oooo0.o0O000Oo;
import p676o0oooo0.o0O00O;
import p676o0oooo0.o0O0o;
import p676o0oooo0.o0oOO;
import p676o0oooo0.o0oOOo;
import p676o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 implements o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f39551OooO00o;

    public static final class OooO00o implements o000000O {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final o0oOOo f39552Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final o000O0o f39553OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final boolean f39554OoooO00;

        public OooO00o(o0oOOo o0oooo2, boolean z) {
            this.f39552Oooo = o0oooo2;
            this.f39553OoooO0 = new o000O0o(o0oooo2);
            this.f39554OoooO00 = z;
        }

        public static IOException OooO00o(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f39553OoooO0.f39568OooO0OO.close();
        }

        @Override // p417o0Oo0o0o.o000000O
        public final void o00ooo() {
        }

        @Override // p417o0Oo0o0o.o000000O
        public final boolean o0Oo0oo(o000000O.OooO00o oooO00o) throws IOException {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            try {
                int i = this.f39552Oooo.readInt();
                int i2 = this.f39552Oooo.readInt();
                int i3 = (i2 & (-16777216)) >>> 24;
                int i4 = i2 & 16777215;
                if (!((Integer.MIN_VALUE & i) != 0)) {
                    ((o00000O0.OooO0o) oooO00o).OooO0O0((i3 & 1) != 0, i & Integer.MAX_VALUE, this.f39552Oooo, i4);
                    return true;
                }
                int i5 = (2147418112 & i) >>> 16;
                int i6 = i & 65535;
                if (i5 != 3) {
                    throw new ProtocolException(android.support.v4.media.OooO00o.OooO00o("version != 3: ", i5));
                }
                switch (i6) {
                    case 1:
                        int i7 = this.f39552Oooo.readInt();
                        this.f39552Oooo.readInt();
                        int i8 = i7 & Integer.MAX_VALUE;
                        this.f39552Oooo.readShort();
                        ((o00000O0.OooO0o) oooO00o).OooO0Oo((i3 & 2) != 0, (i3 & 1) != 0, i8, this.f39553OoooO0.OooO00o(i4 - 10), HeadersMode.SPDY_SYN_STREAM);
                        return true;
                    case 2:
                        ((o00000O0.OooO0o) oooO00o).OooO0Oo(false, (i3 & 1) != 0, this.f39552Oooo.readInt() & Integer.MAX_VALUE, this.f39553OoooO0.OooO00o(i4 - 4), HeadersMode.SPDY_REPLY);
                        return true;
                    case 3:
                        if (i4 != 8) {
                            OooO00o("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i4));
                            throw null;
                        }
                        int i9 = this.f39552Oooo.readInt() & Integer.MAX_VALUE;
                        int i10 = this.f39552Oooo.readInt();
                        ErrorCode[] errorCodeArrValues = ErrorCode.values();
                        int length = errorCodeArrValues.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                errorCode = errorCodeArrValues[i11];
                                if (errorCode.spdyRstCode != i10) {
                                    i11++;
                                }
                            } else {
                                errorCode = null;
                            }
                        }
                        if (errorCode != null) {
                            ((o00000O0.OooO0o) oooO00o).OooO0o(i9, errorCode);
                            return true;
                        }
                        OooO00o("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i10));
                        throw null;
                    case 4:
                        int i12 = this.f39552Oooo.readInt();
                        if (i4 != (i12 * 8) + 4) {
                            OooO00o("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i4), Integer.valueOf(i12));
                            throw null;
                        }
                        o000O00O o000o00o2 = new o000O00O();
                        for (int i13 = 0; i13 < i12; i13++) {
                            int i14 = this.f39552Oooo.readInt();
                            o000o00o2.OooO0Oo(i14 & 16777215, (i14 & (-16777216)) >>> 24, this.f39552Oooo.readInt());
                        }
                        ((o00000O0.OooO0o) oooO00o).OooO0oO((i3 & 1) != 0, o000o00o2);
                        return true;
                    case 5:
                    default:
                        this.f39552Oooo.skip(i4);
                        return true;
                    case 6:
                        if (i4 != 4) {
                            OooO00o("TYPE_PING length: %d != 4", Integer.valueOf(i4));
                            throw null;
                        }
                        int i15 = this.f39552Oooo.readInt();
                        ((o00000O0.OooO0o) oooO00o).OooO0o0(this.f39554OoooO00 == ((i15 & 1) == 1), i15, 0);
                        return true;
                    case 7:
                        if (i4 != 8) {
                            OooO00o("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i4));
                            throw null;
                        }
                        int i16 = this.f39552Oooo.readInt() & Integer.MAX_VALUE;
                        int i17 = this.f39552Oooo.readInt();
                        ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                        int length2 = errorCodeArrValues2.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 < length2) {
                                errorCode2 = errorCodeArrValues2[i18];
                                if (errorCode2.spdyGoAwayCode != i17) {
                                    i18++;
                                }
                            } else {
                                errorCode2 = null;
                            }
                        }
                        if (errorCode2 != null) {
                            ((o00000O0.OooO0o) oooO00o).OooO0OO(i16, ByteString.f53063OoooO0O);
                            return true;
                        }
                        OooO00o("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i17));
                        throw null;
                    case 8:
                        ((o00000O0.OooO0o) oooO00o).OooO0Oo(false, false, this.f39552Oooo.readInt() & Integer.MAX_VALUE, this.f39553OoooO0.OooO00o(i4 - 4), HeadersMode.SPDY_HEADERS);
                        return true;
                    case 9:
                        if (i4 != 8) {
                            OooO00o("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i4));
                            throw null;
                        }
                        int i19 = this.f39552Oooo.readInt() & Integer.MAX_VALUE;
                        long j = this.f39552Oooo.readInt() & Integer.MAX_VALUE;
                        if (j != 0) {
                            ((o00000O0.OooO0o) oooO00o).OooO0oo(i19, j);
                            return true;
                        }
                        OooO00o("windowSizeIncrement was 0", Long.valueOf(j));
                        throw null;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public static final class OooO0O0 implements o00000 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final oo00oO f39555Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public boolean f39556OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final o0O00O f39557OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final o0oOO f39558OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final boolean f39559OoooO0O;

        public OooO0O0(oo00oO oo00oo, boolean z) {
            this.f39555Oooo = oo00oo;
            this.f39559OoooO0O = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(o000O0.f39551OooO00o);
            o0oOO o0ooo2 = new o0oOO();
            this.f39558OoooO00 = o0ooo2;
            this.f39557OoooO0 = (o0O00O) o0O000Oo.OooO0O0(new o0O0o(o0ooo2, deflater));
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void OooO(boolean z, int i, int i2) throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            if (z != (this.f39559OoooO0O != ((i & 1) == 1))) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.f39555Oooo.OooOo0o(-2147287034);
            this.f39555Oooo.OooOo0o(4);
            this.f39555Oooo.OooOo0o(i);
            this.f39555Oooo.flush();
        }

        public final void OooO00o(int i, int i2, o0oOO o0ooo2, int i3) throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            long j = i3;
            if (j > 16777215) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("FRAME_TOO_LARGE max size is 16Mib: ", i3));
            }
            this.f39555Oooo.OooOo0o(i & Integer.MAX_VALUE);
            this.f39555Oooo.OooOo0o(((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (16777215 & i3));
            if (i3 > 0) {
                this.f39555Oooo.write(o0ooo2, j);
            }
        }

        public final void OooO0O0(List<o000OO> list) throws IOException {
            ArrayList arrayList = (ArrayList) list;
            this.f39557OoooO0.OooOo0o(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ByteString byteString = ((o000OO) arrayList.get(i)).f39577OooO00o;
                this.f39557OoooO0.OooOo0o(byteString.OooO0o0());
                this.f39557OoooO0.o000000(byteString);
                ByteString byteString2 = ((o000OO) arrayList.get(i)).f39578OooO0O0;
                this.f39557OoooO0.OooOo0o(byteString2.OooO0o0());
                this.f39557OoooO0.o000000(byteString2);
            }
            this.f39557OoooO0.flush();
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void OooO0oO(int i, long j) throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            }
            this.f39555Oooo.OooOo0o(-2147287031);
            this.f39555Oooo.OooOo0o(8);
            this.f39555Oooo.OooOo0o(i);
            this.f39555Oooo.OooOo0o((int) j);
            this.f39555Oooo.flush();
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void OooOo(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            if (errorCode.spdyGoAwayCode == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            this.f39555Oooo.OooOo0o(-2147287033);
            this.f39555Oooo.OooOo0o(8);
            this.f39555Oooo.OooOo0o(i);
            this.f39555Oooo.OooOo0o(errorCode.spdyGoAwayCode);
            this.f39555Oooo.flush();
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void Oooo(o000O00O o000o00o2) throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            int iBitCount = Integer.bitCount(o000o00o2.f39562OooO00o);
            this.f39555Oooo.OooOo0o(-2147287036);
            this.f39555Oooo.OooOo0o((((iBitCount * 8) + 4) & 16777215) | 0);
            this.f39555Oooo.OooOo0o(iBitCount);
            for (int i = 0; i <= 10; i++) {
                if (o000o00o2.OooO0OO(i)) {
                    this.f39555Oooo.OooOo0o(((o000o00o2.OooO00o(i) & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (i & 16777215));
                    this.f39555Oooo.OooOo0o(o000o00o2.f39565OooO0Oo[i]);
                }
            }
            this.f39555Oooo.flush();
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void Oooo00O() {
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void OoooO00(boolean z, int i, o0oOO o0ooo2, int i2) throws IOException {
            OooO00o(i, z ? 1 : 0, o0ooo2, i2);
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void Oooooo(boolean z, boolean z2, int i, List list) throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            OooO0O0(list);
            int i2 = (int) (this.f39558OoooO00.f52117OoooO00 + 10);
            int i3 = (z ? 1 : 0) | (z2 ? 2 : 0);
            this.f39555Oooo.OooOo0o(-2147287039);
            this.f39555Oooo.OooOo0o(((i3 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (i2 & 16777215));
            this.f39555Oooo.OooOo0o(Integer.MAX_VALUE & i);
            this.f39555Oooo.OooOo0o(0);
            this.f39555Oooo.OooOo0(0);
            this.f39555Oooo.o0ooOOo(this.f39558OoooO00);
            this.f39555Oooo.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.f39556OoooO = true;
            o000000.OooO0O0(this.f39555Oooo, this.f39557OoooO0);
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void flush() throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            this.f39555Oooo.flush();
        }

        @Override // p417o0Oo0o0o.o00000
        public final void o00000oO(o000O00O o000o00o2) {
        }

        @Override // p417o0Oo0o0o.o00000
        public final int o00000oo() {
            return 16383;
        }

        @Override // p417o0Oo0o0o.o00000
        public final synchronized void o00Ooo(int i, ErrorCode errorCode) throws IOException {
            if (this.f39556OoooO) {
                throw new IOException("closed");
            }
            if (errorCode.spdyRstCode == -1) {
                throw new IllegalArgumentException();
            }
            this.f39555Oooo.OooOo0o(-2147287037);
            this.f39555Oooo.OooOo0o(8);
            this.f39555Oooo.OooOo0o(i & Integer.MAX_VALUE);
            this.f39555Oooo.OooOo0o(errorCode.spdyRstCode);
            this.f39555Oooo.flush();
        }
    }

    static {
        try {
            f39551OooO00o = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(o000000.f39368OooO0OO.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // p417o0Oo0o0o.o000O0Oo
    public final o000000O OooO00o(o0oOOo o0oooo2, boolean z) {
        return new OooO00o(o0oooo2, z);
    }

    @Override // p417o0Oo0o0o.o000O0Oo
    public final o00000 OooO0O0(oo00oO oo00oo, boolean z) {
        return new OooO0O0(oo00oo, z);
    }
}
