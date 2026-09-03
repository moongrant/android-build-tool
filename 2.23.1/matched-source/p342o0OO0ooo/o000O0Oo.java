package p342o0OO0ooo;

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.zip.Deflater;
import okio.ByteString;
import p341o0OO0ooO.o000OOo;
import p663o0oooO0.o00O00;
import p663o0oooO0.o00O000;
import p663o0oooO0.o00O000o;
import p663o0oooO0.o00OO;
import p663o0oooO0.o0O0ooO;
import p663o0oooO0.oo0O;
import p663o0oooO0.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0Oo implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f42717OooO00o;

    public static final class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00O000o f42718OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o000Oo0 f42719OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f42720OooO0o0;

        public OooO00o(o00OO o00oo2, boolean z) {
            this.f42718OooO0Oo = o00oo2;
            this.f42719OooO0o = new o000Oo0(o00oo2);
            this.f42720OooO0o0 = z;
        }

        public static void OooO00o(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        @Override // p342o0OO0ooo.o000000
        public final void OoooO0() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f42719OooO0o.f42739OooO0OO.close();
        }

        @Override // p342o0OO0ooo.o000000
        public final boolean o0Oo0oo(o000000.OooO00o oooO00o) throws IOException {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            o00O000o o00o000o2 = this.f42718OooO0Oo;
            try {
                int i = o00o000o2.readInt();
                int i2 = o00o000o2.readInt();
                int i3 = (i2 & (-16777216)) >>> 24;
                int i4 = i2 & 16777215;
                if (!((Integer.MIN_VALUE & i) != 0)) {
                    ((o00000.OooO0o) oooO00o).OooO0O0(i & Integer.MAX_VALUE, i4, o00o000o2, (i3 & 1) != 0);
                    return true;
                }
                int i5 = (2147418112 & i) >>> 16;
                int i6 = i & 65535;
                if (i5 != 3) {
                    throw new ProtocolException(android.support.v4.media.OooO00o.OooO00o("version != 3: ", i5));
                }
                o000Oo0 o000oo1 = this.f42719OooO0o;
                switch (i6) {
                    case 1:
                        int i7 = o00o000o2.readInt();
                        o00o000o2.readInt();
                        int i8 = i7 & Integer.MAX_VALUE;
                        o00o000o2.readShort();
                        ((o00000.OooO0o) oooO00o).OooO0Oo((i3 & 2) != 0, (i3 & 1) != 0, i8, o000oo1.OooO00o(i4 - 10), HeadersMode.SPDY_SYN_STREAM);
                        return true;
                    case 2:
                        ((o00000.OooO0o) oooO00o).OooO0Oo(false, (i3 & 1) != 0, o00o000o2.readInt() & Integer.MAX_VALUE, o000oo1.OooO00o(i4 - 4), HeadersMode.SPDY_REPLY);
                        return true;
                    case 3:
                        if (i4 != 8) {
                            OooO00o("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i4));
                            throw null;
                        }
                        int i9 = o00o000o2.readInt() & Integer.MAX_VALUE;
                        int i10 = o00o000o2.readInt();
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
                            ((o00000.OooO0o) oooO00o).OooO0o(i9, errorCode);
                            return true;
                        }
                        OooO00o("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i10));
                        throw null;
                    case 4:
                        int i12 = o00o000o2.readInt();
                        if (i4 != (i12 * 8) + 4) {
                            OooO00o("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i4), Integer.valueOf(i12));
                            throw null;
                        }
                        o000O0 o000o0 = new o000O0();
                        for (int i13 = 0; i13 < i12; i13++) {
                            int i14 = o00o000o2.readInt();
                            o000o0.OooO0OO(i14 & 16777215, (i14 & (-16777216)) >>> 24, o00o000o2.readInt());
                        }
                        ((o00000.OooO0o) oooO00o).OooO0oO((i3 & 1) != 0, o000o0);
                        return true;
                    case 5:
                    default:
                        o00o000o2.skip(i4);
                        return true;
                    case 6:
                        if (i4 != 4) {
                            OooO00o("TYPE_PING length: %d != 4", Integer.valueOf(i4));
                            throw null;
                        }
                        int i15 = o00o000o2.readInt();
                        ((o00000.OooO0o) oooO00o).OooO0o0(i15, 0, this.f42720OooO0o0 == ((i15 & 1) == 1));
                        return true;
                    case 7:
                        if (i4 != 8) {
                            OooO00o("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i4));
                            throw null;
                        }
                        int i16 = o00o000o2.readInt() & Integer.MAX_VALUE;
                        int i17 = o00o000o2.readInt();
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
                            ((o00000.OooO0o) oooO00o).OooO0OO(i16, ByteString.f60159OooO0oO);
                            return true;
                        }
                        OooO00o("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i17));
                        throw null;
                    case 8:
                        ((o00000.OooO0o) oooO00o).OooO0Oo(false, false, o00o000o2.readInt() & Integer.MAX_VALUE, o000oo1.OooO00o(i4 - 4), HeadersMode.SPDY_HEADERS);
                        return true;
                    case 9:
                        if (i4 != 8) {
                            OooO00o("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i4));
                            throw null;
                        }
                        int i19 = o00o000o2.readInt() & Integer.MAX_VALUE;
                        long j = o00o000o2.readInt() & Integer.MAX_VALUE;
                        if (j != 0) {
                            ((o00000.OooO0o) oooO00o).OooO0oo(i19, j);
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

    public static final class OooO0O0 implements o000000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00O000 f42721OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final oo0O f42722OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0O0ooO f42723OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f42724OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f42725OooO0oo;

        public OooO0O0(oo0O oo0o, boolean z) {
            this.f42721OooO0Oo = oo0o;
            this.f42724OooO0oO = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(o000O0Oo.f42717OooO00o);
            o0O0ooO o0o0ooo = new o0O0ooO();
            this.f42723OooO0o0 = o0o0ooo;
            this.f42722OooO0o = oo0oOO0.OooO00o(new o00O00(o0o0ooo, deflater));
        }

        public final void OooO00o(int i, int i2, o0O0ooO o0o0ooo, int i3) throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            long j = i3;
            if (j > 16777215) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("FRAME_TOO_LARGE max size is 16Mib: ", i3));
            }
            o00O000 o00o001 = this.f42721OooO0Oo;
            o00o001.OooOOOo(i & Integer.MAX_VALUE);
            o00o001.OooOOOo(((i2 & 255) << 24) | (16777215 & i3));
            if (i3 > 0) {
                o00o001.write(o0o0ooo, j);
            }
        }

        public final void OooO0OO(ArrayList arrayList) throws IOException {
            int size = arrayList.size();
            oo0O oo0o = this.f42722OooO0o;
            oo0o.OooOOOo(size);
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                ByteString byteString = ((o0000O0O) arrayList.get(i)).f42694OooO00o;
                oo0o.OooOOOo(byteString.OooO0o0());
                oo0o.o0000O00(byteString);
                ByteString byteString2 = ((o0000O0O) arrayList.get(i)).f42695OooO0O0;
                oo0o.OooOOOo(byteString2.OooO0o0());
                oo0o.o0000O00(byteString2);
            }
            oo0o.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void OooO0o0(int i, long j) throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            }
            this.f42721OooO0Oo.OooOOOo(-2147287031);
            this.f42721OooO0Oo.OooOOOo(8);
            this.f42721OooO0Oo.OooOOOo(i);
            this.f42721OooO0Oo.OooOOOo((int) j);
            this.f42721OooO0Oo.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void OooO0oo(int i, int i2, boolean z) throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            boolean z2 = true;
            if (this.f42724OooO0oO == ((i & 1) == 1)) {
                z2 = false;
            }
            if (z != z2) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.f42721OooO0Oo.OooOOOo(-2147287034);
            this.f42721OooO0Oo.OooOOOo(4);
            this.f42721OooO0Oo.OooOOOo(i);
            this.f42721OooO0Oo.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void OooOOOO(boolean z, int i, o0O0ooO o0o0ooo, int i2) throws IOException {
            OooO00o(i, z ? 1 : 0, o0o0ooo, i2);
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void OooOOo0(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            if (errorCode.spdyGoAwayCode == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            this.f42721OooO0Oo.OooOOOo(-2147287033);
            this.f42721OooO0Oo.OooOOOo(8);
            this.f42721OooO0Oo.OooOOOo(i);
            this.f42721OooO0Oo.OooOOOo(errorCode.spdyGoAwayCode);
            this.f42721OooO0Oo.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void OooOo0() {
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void OooOoO0(boolean z, boolean z2, int i, ArrayList arrayList) throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            OooO0OO(arrayList);
            int i2 = (int) (this.f42723OooO0o0.f58720OooO0o0 + 10);
            int i3 = (z ? 1 : 0) | (z2 ? 2 : 0);
            this.f42721OooO0Oo.OooOOOo(-2147287039);
            this.f42721OooO0Oo.OooOOOo(((i3 & 255) << 24) | (i2 & 16777215));
            this.f42721OooO0Oo.OooOOOo(Integer.MAX_VALUE & i);
            this.f42721OooO0Oo.OooOOOo(0);
            this.f42721OooO0Oo.o0OoOo0(0);
            this.f42721OooO0Oo.Oooo0o0(this.f42723OooO0o0);
            this.f42721OooO0Oo.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void OoooO00(int i, ErrorCode errorCode) throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            if (errorCode.spdyRstCode == -1) {
                throw new IllegalArgumentException();
            }
            this.f42721OooO0Oo.OooOOOo(-2147287037);
            this.f42721OooO0Oo.OooOOOo(8);
            this.f42721OooO0Oo.OooOOOo(i & Integer.MAX_VALUE);
            this.f42721OooO0Oo.OooOOOo(errorCode.spdyRstCode);
            this.f42721OooO0Oo.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final int OoooOoO() {
            return 16383;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.f42725OooO0oo = true;
            o000OOo.OooO00o(this.f42721OooO0Oo, this.f42722OooO0o);
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void flush() throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            this.f42721OooO0Oo.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final synchronized void o0ooOoO(o000O0 o000o0) throws IOException {
            if (this.f42725OooO0oo) {
                throw new IOException("closed");
            }
            int iBitCount = Integer.bitCount(o000o0.f42710OooO00o);
            this.f42721OooO0Oo.OooOOOo(-2147287036);
            this.f42721OooO0Oo.OooOOOo((((iBitCount * 8) + 4) & 16777215) | 0);
            this.f42721OooO0Oo.OooOOOo(iBitCount);
            for (int i = 0; i <= 10; i++) {
                boolean z = true;
                if (((1 << i) & o000o0.f42710OooO00o) == 0) {
                    z = false;
                }
                if (z) {
                    this.f42721OooO0Oo.OooOOOo(((o000o0.OooO00o(i) & 255) << 24) | (i & 16777215));
                    this.f42721OooO0Oo.OooOOOo(o000o0.f42713OooO0Oo[i]);
                }
            }
            this.f42721OooO0Oo.flush();
        }

        @Override // p342o0OO0ooo.o000000O
        public final void ooOO(o000O0 o000o0) {
        }
    }

    static {
        try {
            f42717OooO00o = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(o000OOo.f42527OooO0OO.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // p342o0OO0ooo.o000OO0O
    public final o000000 OooO00o(o00OO o00oo2, boolean z) {
        return new OooO00o(o00oo2, z);
    }

    @Override // p342o0OO0ooo.o000OO0O
    public final o000000O OooO0O0(oo0O oo0o, boolean z) {
        return new OooO0O0(oo0o, z);
    }
}
