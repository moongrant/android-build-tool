package p414o0Oo0o0o;

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.UByte;
import okio.ByteString;
import p058o0000OoO.OooO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f39505OooO00o = Logger.getLogger(OooO0O0.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ByteString f39506OooO0O0 = ByteString.f53047OoooO00.OooO0OO("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static final class OooO00o implements o0O0O0O {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f39507Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0oOOo f39508Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f39509Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public byte f39510Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public short f39511OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f39512OoooO00;

        public OooO00o(o0oOOo o0oooo2) {
            this.f39508Oooo0o = o0oooo2;
        }

        @Override // p674o0oooo0.o0O0O0O
        public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.f39512OoooO00;
                if (i3 != 0) {
                    long jOooo0O0 = this.f39508Oooo0o.Oooo0O0(o0ooo2, Math.min(j, i3));
                    if (jOooo0O0 == -1) {
                        return -1L;
                    }
                    this.f39512OoooO00 = (int) (((long) this.f39512OoooO00) - jOooo0O0);
                    return jOooo0O0;
                }
                this.f39508Oooo0o.skip(this.f39511OoooO0);
                this.f39511OoooO0 = (short) 0;
                if ((this.f39510Oooo0oo & 4) != 0) {
                    return -1L;
                }
                i = this.f39507Oooo;
                int iOooO0Oo = o0000OO0.OooO0Oo(this.f39508Oooo0o);
                this.f39512OoooO00 = iOooO0Oo;
                this.f39509Oooo0oO = iOooO0Oo;
                byte b = (byte) (this.f39508Oooo0o.readByte() & UByte.MAX_VALUE);
                this.f39510Oooo0oo = (byte) (this.f39508Oooo0o.readByte() & UByte.MAX_VALUE);
                Logger logger = o0000OO0.f39505OooO00o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(OooO0O0.OooO00o(true, this.f39507Oooo, this.f39509Oooo0oO, b, this.f39510Oooo0oo));
                }
                i2 = this.f39508Oooo0o.readInt() & Integer.MAX_VALUE;
                this.f39507Oooo = i2;
                if (b != 9) {
                    o0000OO0.OooO0OO("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(b)});
                    throw null;
                }
            } while (i2 == i);
            o0000OO0.OooO0OO("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p674o0oooo0.o0O0O0O
        public final o0oO0O0o timeout() {
            return this.f39508Oooo0o.timeout();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final String[] f39513OooO00o = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f39514OooO0O0 = new String[64];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final String[] f39515OooO0OO = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f39515OooO0OO;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f39514OooO0O0;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = f39514OooO0O0;
                strArr3[i4 | 8] = OooO.OooO00o(new StringBuilder(), strArr3[i4], "|PADDED");
            }
            String[] strArr4 = f39514OooO0O0;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr5 = f39514OooO0O0;
                    int i9 = i8 | i6;
                    strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr5[i8]);
                    sb.append('|');
                    strArr5[i9 | 8] = OooO.OooO00o(sb, strArr5[i6], "|PADDED");
                }
            }
            while (true) {
                String[] strArr6 = f39514OooO0O0;
                if (i >= strArr6.length) {
                    return;
                }
                if (strArr6[i] == null) {
                    strArr6[i] = f39515OooO0OO[i];
                }
                i++;
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0069  */
        public static String OooO00o(boolean z, int i, int i2, byte b, byte b2) {
            String strReplace;
            String str = b < 10 ? f39513OooO00o[b] : String.format("0x%02x", Byte.valueOf(b));
            if (b2 == 0) {
                strReplace = "";
            } else if (b == 2 || b == 3) {
                strReplace = f39515OooO0OO[b2];
            } else if (b == 4 || b == 6) {
                strReplace = b2 == 1 ? "ACK" : f39515OooO0OO[b2];
            } else if (b == 7 || b == 8) {
                strReplace = f39515OooO0OO[b2];
            } else {
                String str2 = b2 < 64 ? f39514OooO0O0[b2] : f39515OooO0OO[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    strReplace = (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                } else {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = str;
            objArr[4] = strReplace;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    public static final class OooO0OO implements o000000O {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final o0000O.OooO00o f39516Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0oOOo f39517Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooO00o f39518Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final boolean f39519Oooo0oo;

        public OooO0OO(o0oOOo o0oooo2, boolean z) {
            this.f39517Oooo0o = o0oooo2;
            this.f39519Oooo0oo = z;
            OooO00o oooO00o = new OooO00o(o0oooo2);
            this.f39518Oooo0oO = oooO00o;
            this.f39516Oooo = new o0000O.OooO00o(oooO00o);
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o0Oo0o0o.o000OO>] */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList, java.util.List<o0Oo0o0o.o000OO>] */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList, java.util.List<o0Oo0o0o.o000OO>] */
        /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList, java.util.List<o0Oo0o0o.o000OO>] */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList, java.util.List<o0Oo0o0o.o000OO>] */
        public final List<o000OO> OooO00o(int i, short s, byte b, int i2) throws IOException {
            OooO00o oooO00o = this.f39518Oooo0oO;
            oooO00o.f39512OoooO00 = i;
            oooO00o.f39509Oooo0oO = i;
            oooO00o.f39511OoooO0 = s;
            oooO00o.f39510Oooo0oo = b;
            oooO00o.f39507Oooo = i2;
            o0000O.OooO00o oooO00o2 = this.f39516Oooo;
            while (!oooO00o2.f39471OooO0O0.OooOooo()) {
                int i3 = oooO00o2.f39471OooO0O0.readByte() & UByte.MAX_VALUE;
                if (i3 == 128) {
                    throw new IOException("index == 0");
                }
                if ((i3 & 128) == 128) {
                    int iOooO0o = oooO00o2.OooO0o(i3, 127) - 1;
                    if (!(iOooO0o >= 0 && iOooO0o <= o0000O.f39468OooO00o.length + (-1))) {
                        int length = oooO00o2.f39474OooO0o + 1 + (iOooO0o - o0000O.f39468OooO00o.length);
                        if (length >= 0) {
                            o000OO[] o000ooArr = oooO00o2.f39475OooO0o0;
                            if (length <= o000ooArr.length - 1) {
                                oooO00o2.f39470OooO00o.add(o000ooArr[length]);
                            }
                        }
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Header index too large ");
                        sbOooO0o0.append(iOooO0o + 1);
                        throw new IOException(sbOooO0o0.toString());
                    }
                    oooO00o2.f39470OooO00o.add(o0000O.f39468OooO00o[iOooO0o]);
                } else if (i3 == 64) {
                    ByteString byteStringOooO0o0 = oooO00o2.OooO0o0();
                    o0000O.OooO00o(byteStringOooO0o0);
                    oooO00o2.OooO0Oo(new o000OO(byteStringOooO0o0, oooO00o2.OooO0o0()));
                } else if ((i3 & 64) == 64) {
                    oooO00o2.OooO0Oo(new o000OO(oooO00o2.OooO0OO(oooO00o2.OooO0o(i3, 63) - 1), oooO00o2.OooO0o0()));
                } else if ((i3 & 32) == 32) {
                    int iOooO0o2 = oooO00o2.OooO0o(i3, 31);
                    oooO00o2.f39473OooO0Oo = iOooO0o2;
                    if (iOooO0o2 < 0 || iOooO0o2 > oooO00o2.f39472OooO0OO) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Invalid dynamic table size update ");
                        sbOooO0o1.append(oooO00o2.f39473OooO0Oo);
                        throw new IOException(sbOooO0o1.toString());
                    }
                    int i4 = oooO00o2.f39477OooO0oo;
                    if (iOooO0o2 < i4) {
                        if (iOooO0o2 == 0) {
                            oooO00o2.OooO00o();
                        } else {
                            oooO00o2.OooO0O0(i4 - iOooO0o2);
                        }
                    }
                } else if (i3 == 16 || i3 == 0) {
                    ByteString byteStringOooO0o1 = oooO00o2.OooO0o0();
                    o0000O.OooO00o(byteStringOooO0o1);
                    oooO00o2.f39470OooO00o.add(new o000OO(byteStringOooO0o1, oooO00o2.OooO0o0()));
                } else {
                    oooO00o2.f39470OooO00o.add(new o000OO(oooO00o2.OooO0OO(oooO00o2.OooO0o(i3, 15) - 1), oooO00o2.OooO0o0()));
                }
            }
            o0000O.OooO00o oooO00o3 = this.f39516Oooo;
            Objects.requireNonNull(oooO00o3);
            ArrayList arrayList = new ArrayList(oooO00o3.f39470OooO00o);
            oooO00o3.f39470OooO00o.clear();
            return arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f39517Oooo0o.close();
        }

        @Override // p414o0Oo0o0o.o000000O
        public final void o00ooo() throws IOException {
            if (this.f39519Oooo0oo) {
                return;
            }
            o0oOOo o0oooo2 = this.f39517Oooo0o;
            ByteString byteString = o0000OO0.f39506OooO0O0;
            ByteString byteStringOooOOOo = o0oooo2.OooOOOo(byteString.OooO0o0());
            Logger logger = o0000OO0.f39505OooO00o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("<< CONNECTION %s", byteStringOooOOOo.OooO0o()));
            }
            if (byteString.equals(byteStringOooOOOo)) {
                return;
            }
            o0000OO0.OooO0OO("Expected a connection header but was %s", new Object[]{byteStringOooOOOo.OooOOO()});
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p414o0Oo0o0o.o000000O
        public final boolean o0Oo0oo(o000000O.OooO00o oooO00o) throws IOException {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            try {
                this.f39517Oooo0o.o0000oo(9L);
                int iOooO0Oo = o0000OO0.OooO0Oo(this.f39517Oooo0o);
                if (iOooO0Oo < 0 || iOooO0Oo > 16384) {
                    o0000OO0.OooO0OO("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(iOooO0Oo)});
                    throw null;
                }
                byte b = (byte) (this.f39517Oooo0o.readByte() & UByte.MAX_VALUE);
                byte b2 = (byte) (this.f39517Oooo0o.readByte() & UByte.MAX_VALUE);
                int i = this.f39517Oooo0o.readInt() & Integer.MAX_VALUE;
                Logger logger = o0000OO0.f39505OooO00o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(OooO0O0.OooO00o(true, i, iOooO0Oo, b, b2));
                }
                switch (b) {
                    case 0:
                        boolean z = (b2 & 1) != 0;
                        if ((b2 & 32) != 0) {
                            o0000OO0.OooO0OO("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        short s = (b2 & 8) != 0 ? (short) (this.f39517Oooo0o.readByte() & UByte.MAX_VALUE) : (short) 0;
                        ((o00000O0.OooO0o) oooO00o).OooO0O0(z, i, this.f39517Oooo0o, o0000OO0.OooO0o0(iOooO0Oo, b2, s));
                        this.f39517Oooo0o.skip(s);
                        return true;
                    case 1:
                        if (i == 0) {
                            o0000OO0.OooO0OO("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z2 = (b2 & 1) != 0;
                        short s2 = (b2 & 8) != 0 ? (short) (this.f39517Oooo0o.readByte() & UByte.MAX_VALUE) : (short) 0;
                        if ((b2 & 32) != 0) {
                            this.f39517Oooo0o.readInt();
                            this.f39517Oooo0o.readByte();
                            Objects.requireNonNull(oooO00o);
                            iOooO0Oo -= 5;
                        }
                        ((o00000O0.OooO0o) oooO00o).OooO0Oo(false, z2, i, OooO00o(o0000OO0.OooO0o0(iOooO0Oo, b2, s2), s2, b2, i), HeadersMode.HTTP_20_HEADERS);
                        return true;
                    case 2:
                        if (iOooO0Oo != 5) {
                            o0000OO0.OooO0OO("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(iOooO0Oo)});
                            throw null;
                        }
                        if (i == 0) {
                            o0000OO0.OooO0OO("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        this.f39517Oooo0o.readInt();
                        this.f39517Oooo0o.readByte();
                        Objects.requireNonNull(oooO00o);
                        return true;
                    case 3:
                        if (iOooO0Oo != 4) {
                            o0000OO0.OooO0OO("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(iOooO0Oo)});
                            throw null;
                        }
                        if (i == 0) {
                            o0000OO0.OooO0OO("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        int i2 = this.f39517Oooo0o.readInt();
                        ErrorCode[] errorCodeArrValues = ErrorCode.values();
                        int length = errorCodeArrValues.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                errorCode = errorCodeArrValues[i3];
                                if (errorCode.httpCode != i2) {
                                    i3++;
                                }
                            } else {
                                errorCode = null;
                            }
                        }
                        if (errorCode != null) {
                            ((o00000O0.OooO0o) oooO00o).OooO0o(i, errorCode);
                            return true;
                        }
                        o0000OO0.OooO0OO("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(i2)});
                        throw null;
                    case 4:
                        if (i != 0) {
                            o0000OO0.OooO0OO("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        }
                        if ((b2 & 1) != 0) {
                            if (iOooO0Oo != 0) {
                                o0000OO0.OooO0OO("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                throw null;
                            }
                            Objects.requireNonNull(oooO00o);
                        } else {
                            if (iOooO0Oo % 6 != 0) {
                                o0000OO0.OooO0OO("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(iOooO0Oo)});
                                throw null;
                            }
                            o000O00O o000o00o2 = new o000O00O();
                            for (int i4 = 0; i4 < iOooO0Oo; i4 += 6) {
                                short s3 = this.f39517Oooo0o.readShort();
                                int i5 = this.f39517Oooo0o.readInt();
                                switch (s3) {
                                    case 1:
                                    case 6:
                                        break;
                                    case 2:
                                        if (i5 != 0 && i5 != 1) {
                                            o0000OO0.OooO0OO("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        break;
                                        break;
                                    case 3:
                                        s3 = 4;
                                        break;
                                    case 4:
                                        s3 = 7;
                                        if (i5 < 0) {
                                            o0000OO0.OooO0OO("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                        break;
                                        break;
                                    case 5:
                                        if (i5 < 16384 || i5 > 16777215) {
                                            o0000OO0.OooO0OO("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(i5)});
                                            throw null;
                                        }
                                        break;
                                        break;
                                    default:
                                        o0000OO0.OooO0OO("PROTOCOL_ERROR invalid settings id: %s", new Object[]{Short.valueOf(s3)});
                                        throw null;
                                }
                                o000o00o2.OooO0Oo(s3, 0, i5);
                            }
                            ((o00000O0.OooO0o) oooO00o).OooO0oO(false, o000o00o2);
                            int i6 = o000o00o2.f39542OooO00o & 2;
                            if ((i6 != 0 ? o000o00o2.f39545OooO0Oo[1] : -1) >= 0) {
                                o0000O.OooO00o oooO00o2 = this.f39516Oooo;
                                int i7 = i6 != 0 ? o000o00o2.f39545OooO0Oo[1] : -1;
                                oooO00o2.f39472OooO0OO = i7;
                                oooO00o2.f39473OooO0Oo = i7;
                                int i8 = oooO00o2.f39477OooO0oo;
                                if (i7 < i8) {
                                    if (i7 == 0) {
                                        oooO00o2.OooO00o();
                                    } else {
                                        oooO00o2.OooO0O0(i8 - i7);
                                    }
                                }
                            }
                        }
                        return true;
                    case 5:
                        if (i == 0) {
                            o0000OO0.OooO0OO("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                        short s4 = (b2 & 8) != 0 ? (short) (this.f39517Oooo0o.readByte() & UByte.MAX_VALUE) : (short) 0;
                        int i9 = this.f39517Oooo0o.readInt() & Integer.MAX_VALUE;
                        List<o000OO> listOooO00o = OooO00o(o0000OO0.OooO0o0(iOooO0Oo - 4, b2, s4), s4, b2, i);
                        o00000O0 o00000o1 = o00000O0.this;
                        synchronized (o00000o1) {
                            if (o00000o1.f39452OooooOo.contains(Integer.valueOf(i9))) {
                                o00000o1.OooOOoo(i9, ErrorCode.PROTOCOL_ERROR);
                            } else {
                                o00000o1.f39452OooooOo.add(Integer.valueOf(i9));
                                o00000o1.f39453o000oOoO.execute(new o00000OO(o00000o1, new Object[]{o00000o1.f39440OoooO00, Integer.valueOf(i9)}, i9, listOooO00o));
                            }
                        }
                        return true;
                    case 6:
                        if (iOooO0Oo != 8) {
                            o0000OO0.OooO0OO("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(iOooO0Oo)});
                            throw null;
                        }
                        if (i != 0) {
                            o0000OO0.OooO0OO("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                        ((o00000O0.OooO0o) oooO00o).OooO0o0((b2 & 1) != 0, this.f39517Oooo0o.readInt(), this.f39517Oooo0o.readInt());
                        return true;
                    case 7:
                        if (iOooO0Oo < 8) {
                            o0000OO0.OooO0OO("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(iOooO0Oo)});
                            throw null;
                        }
                        if (i != 0) {
                            o0000OO0.OooO0OO("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        int i10 = this.f39517Oooo0o.readInt();
                        int i11 = this.f39517Oooo0o.readInt();
                        int i12 = iOooO0Oo - 8;
                        ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                        int length2 = errorCodeArrValues2.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length2) {
                                errorCode2 = errorCodeArrValues2[i13];
                                if (errorCode2.httpCode != i11) {
                                    i13++;
                                }
                            } else {
                                errorCode2 = null;
                            }
                        }
                        if (errorCode2 == null) {
                            o0000OO0.OooO0OO("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(i11)});
                            throw null;
                        }
                        ByteString byteStringOooOOOo = ByteString.f53046Oooo;
                        if (i12 > 0) {
                            byteStringOooOOOo = this.f39517Oooo0o.OooOOOo(i12);
                        }
                        ((o00000O0.OooO0o) oooO00o).OooO0OO(i10, byteStringOooOOOo);
                        return true;
                    case 8:
                        if (iOooO0Oo != 4) {
                            o0000OO0.OooO0OO("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(iOooO0Oo)});
                            throw null;
                        }
                        long j = ((long) this.f39517Oooo0o.readInt()) & 2147483647L;
                        if (j != 0) {
                            ((o00000O0.OooO0o) oooO00o).OooO0oo(i, j);
                            return true;
                        }
                        o0000OO0.OooO0OO("windowSizeIncrement was 0", new Object[]{Long.valueOf(j)});
                        throw null;
                    default:
                        this.f39517Oooo0o.skip(iOooO0Oo);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public static final class OooO0o implements o00000 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final o0000O.OooO0O0 f39520Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final oo00oO f39521Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final boolean f39522Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final o0oOO f39523Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f39524OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f39525OoooO00;

        public OooO0o(oo00oO oo00oo, boolean z) {
            this.f39521Oooo0o = oo00oo;
            this.f39522Oooo0oO = z;
            o0oOO o0ooo2 = new o0oOO();
            this.f39523Oooo0oo = o0ooo2;
            this.f39520Oooo = new o0000O.OooO0O0(o0ooo2);
            this.f39525OoooO00 = 16384;
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void OooO(boolean z, int i, int i2) throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            OooO00o(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f39521Oooo0o.OooOo0o(i);
            this.f39521Oooo0o.OooOo0o(i2);
            this.f39521Oooo0o.flush();
        }

        public final void OooO00o(int i, int i2, byte b, byte b2) throws IOException {
            Logger logger = o0000OO0.f39505OooO00o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(OooO0O0.OooO00o(false, i, i2, b, b2));
            }
            int i3 = this.f39525OoooO00;
            if (i2 > i3) {
                o0000OO0.OooO0o("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
                throw null;
            }
            if ((Integer.MIN_VALUE & i) != 0) {
                o0000OO0.OooO0o("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            }
            oo00oO oo00oo = this.f39521Oooo0o;
            oo00oo.Oooo000((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            oo00oo.Oooo000((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            oo00oo.Oooo000(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f39521Oooo0o.Oooo000(b & UByte.MAX_VALUE);
            this.f39521Oooo0o.Oooo000(b2 & UByte.MAX_VALUE);
            this.f39521Oooo0o.OooOo0o(i & Integer.MAX_VALUE);
        }

        public final void OooO0O0(boolean z, int i, List<o000OO> list) throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            this.f39520Oooo.OooO0O0(list);
            long j = this.f39523Oooo0oo.f52099Oooo0oO;
            int iMin = (int) Math.min(this.f39525OoooO00, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            OooO00o(i, iMin, (byte) 1, b);
            this.f39521Oooo0o.write(this.f39523Oooo0oo, j2);
            if (j > j2) {
                OooO0Oo(i, j - j2);
            }
        }

        public final void OooO0Oo(int i, long j) throws IOException {
            while (j > 0) {
                int iMin = (int) Math.min(this.f39525OoooO00, j);
                long j2 = iMin;
                j -= j2;
                OooO00o(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.f39521Oooo0o.write(this.f39523Oooo0oo, j2);
            }
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void OooO0oO(int i, long j) throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                o0000OO0.OooO0o("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
                throw null;
            }
            OooO00o(i, 4, (byte) 8, (byte) 0);
            this.f39521Oooo0o.OooOo0o((int) j);
            this.f39521Oooo0o.flush();
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void OooOo(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                o0000OO0.OooO0o("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            OooO00o(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f39521Oooo0o.OooOo0o(i);
            this.f39521Oooo0o.OooOo0o(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f39521Oooo0o.OooOO0(bArr);
            }
            this.f39521Oooo0o.flush();
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void Oooo(o000O00O o000o00o2) throws IOException {
            int i;
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            int i2 = 0;
            OooO00o(0, Integer.bitCount(o000o00o2.f39542OooO00o) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (o000o00o2.OooO0OO(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f39521Oooo0o.OooOo0(i);
                    this.f39521Oooo0o.OooOo0o(o000o00o2.f39545OooO0Oo[i2]);
                }
                i2++;
            }
            this.f39521Oooo0o.flush();
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void Oooo00O() throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            if (this.f39522Oooo0oO) {
                Logger logger = o0000OO0.f39505OooO00o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", o0000OO0.f39506OooO0O0.OooO0o()));
                }
                this.f39521Oooo0o.OooOO0(o0000OO0.f39506OooO0O0.OooOOO0());
                this.f39521Oooo0o.flush();
            }
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void OoooO00(boolean z, int i, o0oOO o0ooo2, int i2) throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            OooO00o(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.f39521Oooo0o.write(o0ooo2, i2);
            }
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void Oooooo(boolean z, boolean z2, int i, List list) throws IOException {
            try {
                if (z2) {
                    throw new UnsupportedOperationException();
                }
                if (this.f39524OoooO0) {
                    throw new IOException("closed");
                }
                OooO0O0(z, i, list);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.f39524OoooO0 = true;
            this.f39521Oooo0o.close();
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void flush() throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            this.f39521Oooo0o.flush();
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void o00000oO(o000O00O o000o00o2) throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            int i = this.f39525OoooO00;
            if ((o000o00o2.f39542OooO00o & 32) != 0) {
                i = o000o00o2.f39545OooO0Oo[5];
            }
            this.f39525OoooO00 = i;
            OooO00o(0, 0, (byte) 4, (byte) 1);
            this.f39521Oooo0o.flush();
        }

        @Override // p414o0Oo0o0o.o00000
        public final int o00000oo() {
            return this.f39525OoooO00;
        }

        @Override // p414o0Oo0o0o.o00000
        public final synchronized void o00Ooo(int i, ErrorCode errorCode) throws IOException {
            if (this.f39524OoooO0) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            OooO00o(i, 4, (byte) 3, (byte) 0);
            this.f39521Oooo0o.OooOo0o(errorCode.httpCode);
            this.f39521Oooo0o.flush();
        }
    }

    public static IOException OooO0OO(String str, Object[] objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    public static int OooO0Oo(o0oOOo o0oooo2) throws IOException {
        return (o0oooo2.readByte() & UByte.MAX_VALUE) | ((o0oooo2.readByte() & UByte.MAX_VALUE) << 16) | ((o0oooo2.readByte() & UByte.MAX_VALUE) << 8);
    }

    public static IllegalArgumentException OooO0o(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static int OooO0o0(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw new IOException(String.format("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i)));
    }

    @Override // p414o0Oo0o0o.o000O0Oo
    public final o000000O OooO00o(o0oOOo o0oooo2, boolean z) {
        return new OooO0OO(o0oooo2, z);
    }

    @Override // p414o0Oo0o0o.o000O0Oo
    public final o00000 OooO0O0(oo00oO oo00oo, boolean z) {
        return new OooO0o(oo00oo, z);
    }
}
