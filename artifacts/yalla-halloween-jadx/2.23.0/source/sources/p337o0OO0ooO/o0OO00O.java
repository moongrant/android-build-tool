package p337o0OO0ooO;

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import okio.ByteString;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o0O00o0;
import p659o0oooO00.o00;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O0000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O implements o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f43398OooO00o = Logger.getLogger(OooO0O0.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ByteString f43399OooO0O0;

    public static final class OooO00o implements o00O00 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public short f43400OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0000 f43401OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f43402OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f43403OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f43404OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f43405OooO0oo;

        public OooO00o(o00O0000 o00o0001) {
            this.f43401OooO0Oo = o00o0001;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(o00000O o00000o, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.f43405OooO0oo;
                o0000 o0000Var = this.f43401OooO0Oo;
                if (i3 != 0) {
                    long jO0000OO0 = o0000Var.o0000OO0(o00000o, Math.min(j, i3));
                    if (jO0000OO0 == -1) {
                        return -1L;
                    }
                    this.f43405OooO0oo = (int) (((long) this.f43405OooO0oo) - jO0000OO0);
                    return jO0000OO0;
                }
                o0000Var.skip(this.f43400OooO);
                this.f43400OooO = (short) 0;
                if ((this.f43402OooO0o & 4) != 0) {
                    return -1L;
                }
                i = this.f43404OooO0oO;
                Logger logger = o0OO00O.f43398OooO00o;
                int i4 = ((o0000Var.readByte() & UByte.MAX_VALUE) << 16) | ((o0000Var.readByte() & UByte.MAX_VALUE) << 8) | (o0000Var.readByte() & UByte.MAX_VALUE);
                this.f43405OooO0oo = i4;
                this.f43403OooO0o0 = i4;
                byte b = (byte) (o0000Var.readByte() & UByte.MAX_VALUE);
                this.f43402OooO0o = (byte) (o0000Var.readByte() & UByte.MAX_VALUE);
                Logger logger2 = o0OO00O.f43398OooO00o;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(OooO0O0.OooO00o(true, this.f43404OooO0oO, this.f43403OooO0o0, b, this.f43402OooO0o));
                }
                i2 = o0000Var.readInt() & Integer.MAX_VALUE;
                this.f43404OooO0oO = i2;
                if (b != 9) {
                    o0OO00O.OooO0Oo("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    throw null;
                }
            } while (i2 == i);
            o0OO00O.OooO0Oo("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // p659o0oooO00.o00O00
        public final o00O00O timeout() {
            return this.f43401OooO0Oo.timeout();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final String[] f43406OooO00o = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f43407OooO0O0 = new String[64];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final String[] f43408OooO0OO = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f43408OooO0OO;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f43407OooO0O0;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i3 = iArr[0];
            strArr2[i3 | 8] = o0O00o0.OooO0O0(new StringBuilder(), strArr2[i3], "|PADDED");
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                int i6 = iArr[0];
                String[] strArr3 = f43407OooO0O0;
                int i7 = i6 | i5;
                strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr3[i6]);
                sb.append('|');
                strArr3[i7 | 8] = o0O00o0.OooO0O0(sb, strArr3[i5], "|PADDED");
            }
            while (true) {
                String[] strArr4 = f43407OooO0O0;
                if (i >= strArr4.length) {
                    return;
                }
                if (strArr4[i] == null) {
                    strArr4[i] = f43408OooO0OO[i];
                }
                i++;
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0067  */
        public static String OooO00o(boolean z, int i, int i2, byte b, byte b2) {
            String strReplace;
            String str = b < 10 ? f43406OooO00o[b] : String.format("0x%02x", Byte.valueOf(b));
            if (b2 == 0) {
                strReplace = "";
            } else {
                String[] strArr = f43408OooO0OO;
                if (b == 2 || b == 3) {
                    strReplace = strArr[b2];
                } else if (b == 4 || b == 6) {
                    strReplace = b2 == 1 ? "ACK" : strArr[b2];
                } else if (b == 7 || b == 8) {
                    strReplace = strArr[b2];
                } else {
                    String str2 = b2 < 64 ? f43407OooO0O0[b2] : strArr[b2];
                    if (b != 5 || (b2 & 4) == 0) {
                        strReplace = (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                    } else {
                        strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                    }
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

    public static final class OooO0OO implements OooOo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0000 f43409OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f43410OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO00o f43411OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o0Oo0oo.OooO00o f43412OooO0oO;

        public OooO0OO(o00O0000 o00o0001, boolean z) {
            this.f43409OooO0Oo = o00o0001;
            this.f43410OooO0o = z;
            OooO00o oooO00o = new OooO00o(o00o0001);
            this.f43411OooO0o0 = oooO00o;
            this.f43412OooO0oO = new o0Oo0oo.OooO00o(oooO00o);
        }

        public final ArrayList OooO00o(int i, short s, byte b, int i2) throws IOException {
            OooO00o oooO00o = this.f43411OooO0o0;
            oooO00o.f43405OooO0oo = i;
            oooO00o.f43403OooO0o0 = i;
            oooO00o.f43400OooO = s;
            oooO00o.f43402OooO0o = b;
            oooO00o.f43404OooO0oO = i2;
            while (true) {
                o0Oo0oo.OooO00o oooO00o2 = this.f43412OooO0oO;
                o00O0000 o00o0001 = oooO00o2.f43432OooO0O0;
                boolean zOo000o = o00o0001.oo000o();
                ArrayList arrayList = oooO00o2.f43431OooO00o;
                if (zOo000o) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList.clear();
                    return arrayList2;
                }
                int i3 = o00o0001.readByte() & UByte.MAX_VALUE;
                if (i3 == 128) {
                    throw new IOException("index == 0");
                }
                boolean z = false;
                if ((i3 & 128) == 128) {
                    int iOooO0o0 = oooO00o2.OooO0o0(i3, 127) - 1;
                    if (iOooO0o0 >= 0 && iOooO0o0 <= o0Oo0oo.f43429OooO00o.length - 1) {
                        z = true;
                    }
                    if (!z) {
                        int length = oooO00o2.f43435OooO0o + 1 + (iOooO0o0 - o0Oo0oo.f43429OooO00o.length);
                        if (length >= 0) {
                            o0OOO0o[] o0ooo0oArr = oooO00o2.f43436OooO0o0;
                            if (length <= o0ooo0oArr.length - 1) {
                                arrayList.add(o0ooo0oArr[length]);
                            }
                        }
                        throw new IOException("Header index too large " + (iOooO0o0 + 1));
                    }
                    arrayList.add(o0Oo0oo.f43429OooO00o[iOooO0o0]);
                } else if (i3 == 64) {
                    ByteString byteStringOooO0Oo = oooO00o2.OooO0Oo();
                    o0Oo0oo.OooO00o(byteStringOooO0Oo);
                    oooO00o2.OooO0OO(new o0OOO0o(byteStringOooO0Oo, oooO00o2.OooO0Oo()));
                } else if ((i3 & 64) == 64) {
                    oooO00o2.OooO0OO(new o0OOO0o(oooO00o2.OooO0O0(oooO00o2.OooO0o0(i3, 63) - 1), oooO00o2.OooO0Oo()));
                } else if ((i3 & 32) == 32) {
                    int iOooO0o1 = oooO00o2.OooO0o0(i3, 31);
                    oooO00o2.f43434OooO0Oo = iOooO0o1;
                    if (iOooO0o1 < 0 || iOooO0o1 > oooO00o2.f43433OooO0OO) {
                        throw new IOException("Invalid dynamic table size update " + oooO00o2.f43434OooO0Oo);
                    }
                    int i4 = oooO00o2.f43438OooO0oo;
                    if (iOooO0o1 < i4) {
                        if (iOooO0o1 == 0) {
                            arrayList.clear();
                            Arrays.fill(oooO00o2.f43436OooO0o0, (Object) null);
                            oooO00o2.f43435OooO0o = oooO00o2.f43436OooO0o0.length - 1;
                            oooO00o2.f43437OooO0oO = 0;
                            oooO00o2.f43438OooO0oo = 0;
                        } else {
                            oooO00o2.OooO00o(i4 - iOooO0o1);
                        }
                    }
                } else if (i3 == 16 || i3 == 0) {
                    ByteString byteStringOooO0Oo2 = oooO00o2.OooO0Oo();
                    o0Oo0oo.OooO00o(byteStringOooO0Oo2);
                    arrayList.add(new o0OOO0o(byteStringOooO0Oo2, oooO00o2.OooO0Oo()));
                } else {
                    arrayList.add(new o0OOO0o(oooO00o2.OooO0O0(oooO00o2.OooO0o0(i3, 15) - 1), oooO00o2.OooO0Oo()));
                }
            }
        }

        @Override // p337o0OO0ooO.OooOo
        public final void Oooo0oo() throws IOException {
            if (this.f43410OooO0o) {
                return;
            }
            ByteString byteString = o0OO00O.f43399OooO0O0;
            ByteString byteStringOooooo0 = this.f43409OooO0Oo.Oooooo0(byteString.data.length);
            Logger logger = o0OO00O.f43398OooO00o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("<< CONNECTION %s", byteStringOooooo0.OooO0o()));
            }
            if (byteString.equals(byteStringOooooo0)) {
                return;
            }
            o0OO00O.OooO0Oo("Expected a connection header but was %s", byteStringOooooo0.OooOo00());
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p337o0OO0ooO.OooOo
        public final boolean OoooOOO(OooOo.OooO00o oooO00o) throws IOException {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            try {
                this.f43409OooO0Oo.OoooOoO(9L);
                o0000 o0000Var = this.f43409OooO0Oo;
                int i = (o0000Var.readByte() & UByte.MAX_VALUE) | ((o0000Var.readByte() & UByte.MAX_VALUE) << 16) | ((o0000Var.readByte() & UByte.MAX_VALUE) << 8);
                if (i < 0 || i > 16384) {
                    o0OO00O.OooO0Oo("FRAME_SIZE_ERROR: %s", Integer.valueOf(i));
                    throw null;
                }
                byte b = (byte) (this.f43409OooO0Oo.readByte() & UByte.MAX_VALUE);
                byte b2 = (byte) (this.f43409OooO0Oo.readByte() & UByte.MAX_VALUE);
                int i2 = this.f43409OooO0Oo.readInt() & Integer.MAX_VALUE;
                Logger logger = o0OO00O.f43398OooO00o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(OooO0O0.OooO00o(true, i2, i, b, b2));
                }
                switch (b) {
                    case 0:
                        boolean z = (b2 & 1) != 0;
                        if (((b2 & 32) != 0) == true) {
                            o0OO00O.OooO0Oo("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        boolean z2 = b2 & 8;
                        o0000 o0000Var2 = this.f43409OooO0Oo;
                        short s = z2 != 0 ? (short) (o0000Var2.readByte() & UByte.MAX_VALUE) : (short) 0;
                        ((Oooo0.OooO0o) oooO00o).OooO0O0(i2, o0OO00O.OooO0OO(b2, i, s), o0000Var2, z);
                        o0000Var2.skip(s);
                        return true;
                    case 1:
                        if (i2 == 0) {
                            o0OO00O.OooO0Oo("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z3 = (b2 & 1) != 0;
                        short s2 = (b2 & 8) != 0 ? (short) (this.f43409OooO0Oo.readByte() & UByte.MAX_VALUE) : (short) 0;
                        if ((b2 & 32) != 0) {
                            o0000 o0000Var3 = this.f43409OooO0Oo;
                            o0000Var3.readInt();
                            o0000Var3.readByte();
                            oooO00o.getClass();
                            i -= 5;
                        }
                        ((Oooo0.OooO0o) oooO00o).OooO0Oo(false, z3, i2, OooO00o(o0OO00O.OooO0OO(b2, i, s2), s2, b2, i2), HeadersMode.HTTP_20_HEADERS);
                        return true;
                    case 2:
                        if (i != 5) {
                            o0OO00O.OooO0Oo("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
                            throw null;
                        }
                        if (i2 == 0) {
                            o0OO00O.OooO0Oo("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        o0000 o0000Var4 = this.f43409OooO0Oo;
                        o0000Var4.readInt();
                        o0000Var4.readByte();
                        oooO00o.getClass();
                        return true;
                    case 3:
                        if (i != 4) {
                            o0OO00O.OooO0Oo("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
                            throw null;
                        }
                        if (i2 == 0) {
                            o0OO00O.OooO0Oo("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        int i3 = this.f43409OooO0Oo.readInt();
                        ErrorCode[] errorCodeArrValues = ErrorCode.values();
                        int length = errorCodeArrValues.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                errorCode = errorCodeArrValues[i4];
                                if (errorCode.httpCode != i3) {
                                    i4++;
                                }
                            } else {
                                errorCode = null;
                            }
                        }
                        if (errorCode != null) {
                            ((Oooo0.OooO0o) oooO00o).OooO0o(i2, errorCode);
                            return true;
                        }
                        o0OO00O.OooO0Oo("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
                        throw null;
                    case 4:
                        if (i2 != 0) {
                            o0OO00O.OooO0Oo("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        }
                        if ((b2 & 1) != 0) {
                            if (i != 0) {
                                o0OO00O.OooO0Oo("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                throw null;
                            }
                            oooO00o.getClass();
                        } else {
                            if (i % 6 != 0) {
                                o0OO00O.OooO0Oo("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
                                throw null;
                            }
                            o00000O o00000o = new o00000O();
                            for (int i5 = 0; i5 < i; i5 += 6) {
                                o0000 o0000Var5 = this.f43409OooO0Oo;
                                short s3 = o0000Var5.readShort();
                                int i6 = o0000Var5.readInt();
                                switch (s3) {
                                    case 1:
                                    case 6:
                                        break;
                                    case 2:
                                        if (i6 != 0 && i6 != 1) {
                                            o0OO00O.OooO0Oo("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        break;
                                        break;
                                    case 3:
                                        s3 = 4;
                                        break;
                                    case 4:
                                        if (i6 < 0) {
                                            o0OO00O.OooO0Oo("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                        s3 = 7;
                                        break;
                                        break;
                                    case 5:
                                        if (i6 < 16384 || i6 > 16777215) {
                                            o0OO00O.OooO0Oo("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i6));
                                            throw null;
                                        }
                                        break;
                                        break;
                                    default:
                                        o0OO00O.OooO0Oo("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(s3));
                                        throw null;
                                }
                                o00000o.OooO0OO(s3, 0, i6);
                            }
                            ((Oooo0.OooO0o) oooO00o).OooO0oO(false, o00000o);
                            int i7 = o00000o.f43367OooO00o;
                            if (((i7 & 2) != 0 ? o00000o.f43370OooO0Oo[1] : -1) >= 0) {
                                int i8 = (i7 & 2) != 0 ? o00000o.f43370OooO0Oo[1] : -1;
                                o0Oo0oo.OooO00o oooO00o2 = this.f43412OooO0oO;
                                oooO00o2.f43433OooO0OO = i8;
                                oooO00o2.f43434OooO0Oo = i8;
                                int i9 = oooO00o2.f43438OooO0oo;
                                if (i8 < i9) {
                                    if (i8 == 0) {
                                        oooO00o2.f43431OooO00o.clear();
                                        Arrays.fill(oooO00o2.f43436OooO0o0, (Object) null);
                                        oooO00o2.f43435OooO0o = oooO00o2.f43436OooO0o0.length - 1;
                                        oooO00o2.f43437OooO0oO = 0;
                                        oooO00o2.f43438OooO0oo = 0;
                                    } else {
                                        oooO00o2.OooO00o(i9 - i8);
                                    }
                                }
                            }
                        }
                        return true;
                    case 5:
                        if (i2 == 0) {
                            o0OO00O.OooO0Oo("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                        short s4 = (b2 & 8) != 0 ? (short) (this.f43409OooO0Oo.readByte() & UByte.MAX_VALUE) : (short) 0;
                        int i10 = this.f43409OooO0Oo.readInt() & Integer.MAX_VALUE;
                        ArrayList arrayListOooO00o = OooO00o(o0OO00O.OooO0OO(b2, i - 4, s4), s4, b2, i2);
                        Oooo0 oooo0 = Oooo0.this;
                        synchronized (oooo0) {
                            if (oooo0.f43351OooOo0o.contains(Integer.valueOf(i10))) {
                                oooo0.OooOo0(i10, ErrorCode.PROTOCOL_ERROR);
                            } else {
                                oooo0.f43351OooOo0o.add(Integer.valueOf(i10));
                                oooo0.f43342OooOOO0.execute(new o0OoOo0(oooo0, new Object[]{oooo0.f43337OooO0oo, Integer.valueOf(i10)}, i10, arrayListOooO00o));
                            }
                        }
                        return true;
                    case 6:
                        if (i != 8) {
                            o0OO00O.OooO0Oo("TYPE_PING length != 8: %s", Integer.valueOf(i));
                            throw null;
                        }
                        if (i2 != 0) {
                            o0OO00O.OooO0Oo("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                        o0000 o0000Var6 = this.f43409OooO0Oo;
                        ((Oooo0.OooO0o) oooO00o).OooO0o0(o0000Var6.readInt(), o0000Var6.readInt(), (b2 & 1) != 0);
                        return true;
                    case 7:
                        if (i < 8) {
                            o0OO00O.OooO0Oo("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
                            throw null;
                        }
                        if (i2 != 0) {
                            o0OO00O.OooO0Oo("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        o0000 o0000Var7 = this.f43409OooO0Oo;
                        int i11 = o0000Var7.readInt();
                        int i12 = o0000Var7.readInt();
                        int i13 = i - 8;
                        ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                        int length2 = errorCodeArrValues2.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 < length2) {
                                errorCode2 = errorCodeArrValues2[i14];
                                if (errorCode2.httpCode != i12) {
                                    i14++;
                                }
                            } else {
                                errorCode2 = null;
                            }
                        }
                        if (errorCode2 == null) {
                            o0OO00O.OooO0Oo("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i12));
                            throw null;
                        }
                        ByteString byteStringOooooo0 = ByteString.f60866OooO0oO;
                        if (i13 > 0) {
                            byteStringOooooo0 = o0000Var7.Oooooo0(i13);
                        }
                        ((Oooo0.OooO0o) oooO00o).OooO0OO(i11, byteStringOooooo0);
                        return true;
                    case 8:
                        if (i != 4) {
                            o0OO00O.OooO0Oo("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
                            throw null;
                        }
                        long j = ((long) this.f43409OooO0Oo.readInt()) & 2147483647L;
                        if (j != 0) {
                            ((Oooo0.OooO0o) oooO00o).OooO0oo(i2, j);
                            return true;
                        }
                        o0OO00O.OooO0Oo("windowSizeIncrement was 0", Long.valueOf(j));
                        throw null;
                    default:
                        this.f43409OooO0Oo.skip(i);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f43409OooO0Oo.close();
        }
    }

    public static final class OooO0o implements Oooo000 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f43413OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0000Ooo f43414OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o00000O f43415OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f43416OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o0Oo0oo.OooO0O0 f43417OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f43418OooO0oo;

        public OooO0o(o00 o00Var, boolean z) {
            this.f43414OooO0Oo = o00Var;
            this.f43416OooO0o0 = z;
            o00000O o00000o = new o00000O();
            this.f43415OooO0o = o00000o;
            this.f43417OooO0oO = new o0Oo0oo.OooO0O0(o00000o);
            this.f43418OooO0oo = 16384;
        }

        public final void OooO00o(int i, int i2, byte b, byte b2) throws IOException {
            Logger logger = o0OO00O.f43398OooO00o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(OooO0O0.OooO00o(false, i, i2, b, b2));
            }
            int i3 = this.f43418OooO0oo;
            if (i2 > i3) {
                throw new IllegalArgumentException(String.format("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2)));
            }
            if ((Integer.MIN_VALUE & i) != 0) {
                throw new IllegalArgumentException(String.format("reserved bit set: %s", Integer.valueOf(i)));
            }
            o0000Ooo o0000ooo = this.f43414OooO0Oo;
            o0000ooo.o00oO0o((i2 >>> 16) & 255);
            o0000ooo.o00oO0o((i2 >>> 8) & 255);
            o0000ooo.o00oO0o(i2 & 255);
            o0000ooo.o00oO0o(b & UByte.MAX_VALUE);
            o0000ooo.o00oO0o(b2 & UByte.MAX_VALUE);
            o0000ooo.OooOOO(i & Integer.MAX_VALUE);
        }

        public final void OooO0OO(int i, ArrayList arrayList, boolean z) throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            this.f43417OooO0oO.OooO00o(arrayList);
            o00000O o00000o = this.f43415OooO0o;
            long j = o00000o.f60177OooO0o0;
            int iMin = (int) Math.min(this.f43418OooO0oo, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            OooO00o(i, iMin, (byte) 1, b);
            this.f43414OooO0Oo.write(o00000o, j2);
            if (j > j2) {
                OooO0oO(i, j - j2);
            }
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void OooO0o0(int i, long j) throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException(String.format("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j)));
            }
            OooO00o(i, 4, (byte) 8, (byte) 0);
            this.f43414OooO0Oo.OooOOO((int) j);
            this.f43414OooO0Oo.flush();
        }

        public final void OooO0oO(int i, long j) throws IOException {
            while (j > 0) {
                int iMin = (int) Math.min(this.f43418OooO0oo, j);
                long j2 = iMin;
                j -= j2;
                OooO00o(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.f43414OooO0Oo.write(this.f43415OooO0o, j2);
            }
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void OooO0oo(int i, int i2, boolean z) throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            OooO00o(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f43414OooO0Oo.OooOOO(i);
            this.f43414OooO0Oo.OooOOO(i2);
            this.f43414OooO0Oo.flush();
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void OooOOOO(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw new IllegalArgumentException(String.format("errorCode.httpCode == -1", new Object[0]));
            }
            OooO00o(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f43414OooO0Oo.OooOOO(i);
            this.f43414OooO0Oo.OooOOO(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f43414OooO0Oo.write(bArr);
            }
            this.f43414OooO0Oo.flush();
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void OooOOoo() throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            if (this.f43416OooO0o0) {
                Logger logger = o0OO00O.f43398OooO00o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", o0OO00O.f43399OooO0O0.OooO0o()));
                }
                this.f43414OooO0Oo.write(o0OO00O.f43399OooO0O0.OooOOoo());
                this.f43414OooO0Oo.flush();
            }
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void OooOo0o(boolean z, boolean z2, int i, ArrayList arrayList) throws IOException {
            try {
                if (z2) {
                    throw new UnsupportedOperationException();
                }
                if (this.f43413OooO) {
                    throw new IOException("closed");
                }
                OooO0OO(i, arrayList, z);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void Oooo0oO(int i, ErrorCode errorCode) throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            OooO00o(i, 4, (byte) 3, (byte) 0);
            this.f43414OooO0Oo.OooOOO(errorCode.httpCode);
            this.f43414OooO0Oo.flush();
        }

        @Override // p337o0OO0ooO.Oooo000
        public final int OoooOo0() {
            return this.f43418OooO0oo;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.f43413OooO = true;
            this.f43414OooO0Oo.close();
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void flush() throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            this.f43414OooO0Oo.flush();
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void o00000(o00000O o00000o) throws IOException {
            int i;
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            OooO00o(0, Integer.bitCount(o00000o.f43367OooO00o) * 6, (byte) 4, (byte) 0);
            int i2 = 0;
            while (i2 < 10) {
                boolean z = true;
                if (((1 << i2) & o00000o.f43367OooO00o) == 0) {
                    z = false;
                }
                if (z) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f43414OooO0Oo.o0OoOo0(i);
                    this.f43414OooO0Oo.OooOOO(o00000o.f43370OooO0Oo[i2]);
                }
                i2++;
            }
            this.f43414OooO0Oo.flush();
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void o00000Oo(o00000O o00000o) throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            int i = this.f43418OooO0oo;
            if ((o00000o.f43367OooO00o & 32) != 0) {
                i = o00000o.f43370OooO0Oo[5];
            }
            this.f43418OooO0oo = i;
            OooO00o(0, 0, (byte) 4, (byte) 1);
            this.f43414OooO0Oo.flush();
        }

        @Override // p337o0OO0ooO.Oooo000
        public final synchronized void o0Oo0oo(boolean z, int i, o00000O o00000o, int i2) throws IOException {
            if (this.f43413OooO) {
                throw new IOException("closed");
            }
            OooO00o(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.f43414OooO0Oo.write(o00000o, i2);
            }
        }
    }

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f43399OooO0O0 = ByteString.OooO00o.OooO0OO("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int OooO0OO(byte b, int i, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        OooO0Oo("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static void OooO0Oo(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    @Override // p337o0OO0ooO.o0000Ooo
    public final OooOo OooO00o(o00O0000 o00o0001, boolean z) {
        return new OooO0OO(o00o0001, z);
    }

    @Override // p337o0OO0ooO.o0000Ooo
    public final Oooo000 OooO0O0(o00 o00Var, boolean z) {
        return new OooO0o(o00Var, z);
    }
}
