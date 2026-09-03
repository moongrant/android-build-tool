package p651o0ooo00O;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.OooOO0;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O0000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0 implements Closeable {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Logger f59881OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000 f59882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f59883OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f59884OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo.OooO00o f59885OooO0oO;

    public static final class OooO00o {
        public static int OooO00o(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(OooOO0.OooO00o("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        }
    }

    public static final class OooO0O0 implements o00O00 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f59886OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0000 f59887OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f59888OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f59889OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f59890OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f59891OooO0oo;

        public OooO0O0(@NotNull o0000 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f59887OooO0Oo = source;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(sink, "sink");
            do {
                int i3 = this.f59891OooO0oo;
                o0000 o0000Var = this.f59887OooO0Oo;
                if (i3 != 0) {
                    long jO0000OO0 = o0000Var.o0000OO0(sink, Math.min(j, i3));
                    if (jO0000OO0 == -1) {
                        return -1L;
                    }
                    this.f59891OooO0oo -= (int) jO0000OO0;
                    return jO0000OO0;
                }
                o0000Var.skip(this.f59886OooO);
                this.f59886OooO = 0;
                if ((this.f59888OooO0o & 4) != 0) {
                    return -1L;
                }
                i = this.f59890OooO0oO;
                int iOooOo00 = o0O000o0.OooOo00(o0000Var);
                this.f59891OooO0oo = iOooOo00;
                this.f59889OooO0o0 = iOooOo00;
                int i4 = o0000Var.readByte() & UByte.MAX_VALUE;
                this.f59888OooO0o = o0000Var.readByte() & UByte.MAX_VALUE;
                Logger logger = o0000O0.f59881OooO0oo;
                if (logger.isLoggable(Level.FINE)) {
                    o0O0O00 o0o0o00 = o0O0O00.f59985OooO00o;
                    int i5 = this.f59890OooO0oO;
                    int i6 = this.f59889OooO0o0;
                    int i7 = this.f59888OooO0o;
                    o0o0o00.getClass();
                    logger.fine(o0O0O00.OooO00o(i5, i6, i4, i7, true));
                }
                i2 = o0000Var.readInt() & Integer.MAX_VALUE;
                this.f59890OooO0oO = i2;
                if (i4 != 9) {
                    throw new IOException(i4 + " != TYPE_CONTINUATION");
                }
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // p659o0oooO00.o00O00
        @NotNull
        public final o00O00O timeout() {
            return this.f59887OooO0Oo.timeout();
        }
    }

    public interface OooO0OO {
        void OooO(int i, @NotNull ErrorCode errorCode, @NotNull ByteString byteString);

        void OooO00o(@NotNull o000 o000Var);

        void OooO0O0(int i, int i2, @NotNull o0000 o0000Var, boolean z) throws IOException;

        void OooO0OO();

        void OooO0Oo(@NotNull List list, int i) throws IOException;

        void OooO0o(int i, @NotNull ErrorCode errorCode);

        void OooO0o0(int i, long j);

        void OooO0oO(int i, @NotNull List list, boolean z);

        void OooO0oo(int i, int i2, boolean z);

        void priority();
    }

    static {
        Logger logger = Logger.getLogger(o0O0O00.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f59881OooO0oo = logger;
    }

    public o0000O0(@NotNull o0000 source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f59882OooO0Oo = source;
        this.f59884OooO0o0 = z;
        OooO0O0 oooO0O0 = new OooO0O0(source);
        this.f59883OooO0o = oooO0O0;
        this.f59885OooO0oO = new oo0o0Oo.OooO00o(oooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0239  */
    /* JADX WARN: Code duplicated, block: B:128:0x023e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final boolean OooO00o(boolean z, @NotNull OooO0OO handler) throws IOException {
        ByteString byteStringOooooo0;
        o0000 o0000Var = this.f59882OooO0Oo;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            o0000Var.OoooOoO(9L);
            int iOooOo00 = o0O000o0.OooOo00(o0000Var);
            if (iOooOo00 > 16384) {
                throw new IOException(Intrinsics.stringPlus("FRAME_SIZE_ERROR: ", Integer.valueOf(iOooOo00)));
            }
            int i = o0000Var.readByte() & UByte.MAX_VALUE;
            int i2 = o0000Var.readByte() & UByte.MAX_VALUE;
            int i3 = o0000Var.readInt() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f59881OooO0oo;
            if (logger.isLoggable(level)) {
                o0O0O00.f59985OooO00o.getClass();
                logger.fine(o0O0O00.OooO00o(i3, iOooOo00, i, i2, true));
            }
            if (z && i != 4) {
                o0O0O00.f59985OooO00o.getClass();
                String[] strArr = o0O0O00.f59987OooO0OO;
                throw new IOException(Intrinsics.stringPlus("Expected a SETTINGS frame but was ", i < strArr.length ? strArr[i] : o0O000o0.OooO("0x%02x", Integer.valueOf(i))));
            }
            ErrorCode errorCode = null;
            switch (i) {
                case 0:
                    if (i3 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z2 = (i2 & 1) != 0;
                    if (((i2 & 32) != 0) == true) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int i4 = (i2 & 8) != 0 ? o0000Var.readByte() & UByte.MAX_VALUE : 0;
                    handler.OooO0O0(i3, OooO00o.OooO00o(iOooOo00, i2, i4), o0000Var, z2);
                    o0000Var.skip(i4);
                    return true;
                case 1:
                    if (i3 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (i2 & 1) != 0;
                    int i5 = (i2 & 8) != 0 ? o0000Var.readByte() & UByte.MAX_VALUE : 0;
                    if ((i2 & 32) != 0) {
                        OooOOo0(handler, i3);
                        iOooOo00 -= 5;
                    }
                    handler.OooO0oO(i3, OooO0oO(OooO00o.OooO00o(iOooOo00, i2, i5), i5, i2, i3), z3);
                    return true;
                case 2:
                    if (iOooOo00 != 5) {
                        throw new IOException(OooO0OO.OooO00o.OooO00o("TYPE_PRIORITY length: ", iOooOo00, " != 5"));
                    }
                    if (i3 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    OooOOo0(handler, i3);
                    return true;
                case 3:
                    if (iOooOo00 != 4) {
                        throw new IOException(OooO0OO.OooO00o.OooO00o("TYPE_RST_STREAM length: ", iOooOo00, " != 4"));
                    }
                    if (i3 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i6 = o0000Var.readInt();
                    ErrorCode.INSTANCE.getClass();
                    for (ErrorCode errorCode2 : ErrorCode.values()) {
                        if ((errorCode2.getHttpCode() == i6) == true) {
                            errorCode = errorCode2;
                            if (errorCode != null) {
                                throw new IOException(Intrinsics.stringPlus("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i6)));
                            }
                            handler.OooO0o(i3, errorCode);
                            return true;
                        }
                    }
                    if (errorCode != null) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i6)));
                    }
                    handler.OooO0o(i3, errorCode);
                    return true;
                case 4:
                    if (i3 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((i2 & 1) != 0) {
                        if (iOooOo00 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        handler.OooO0OO();
                    } else {
                        if (iOooOo00 % 6 != 0) {
                            throw new IOException(Intrinsics.stringPlus("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(iOooOo00)));
                        }
                        o000 o000Var = new o000();
                        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt.until(0, iOooOo00), 6);
                        int first = intProgressionStep.getFirst();
                        int last = intProgressionStep.getLast();
                        int step = intProgressionStep.getStep();
                        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                            while (true) {
                                int i7 = first + step;
                                short s = o0000Var.readShort();
                                byte[] bArr = o0O000o0.f57386OooO00o;
                                int i8 = s & UShort.MAX_VALUE;
                                int i9 = o0000Var.readInt();
                                if (i8 != 2) {
                                    if (i8 == 3) {
                                        i8 = 4;
                                    } else if (i8 == 4) {
                                        if (i9 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i8 = 7;
                                    } else if (i8 == 5 && (i9 < 16384 || i9 > 16777215)) {
                                        throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(i9)));
                                    }
                                } else if (i9 != 0 && i9 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                o000Var.OooO0OO(i8, i9);
                                if (first != last) {
                                    first = i7;
                                }
                            }
                        }
                        handler.OooO00o(o000Var);
                    }
                    return true;
                case 5:
                    if (i3 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int i10 = (i2 & 8) != 0 ? o0000Var.readByte() & UByte.MAX_VALUE : 0;
                    handler.OooO0Oo(OooO0oO(OooO00o.OooO00o(iOooOo00 - 4, i2, i10), i10, i2, i3), o0000Var.readInt() & Integer.MAX_VALUE);
                    return true;
                case 6:
                    if (iOooOo00 != 8) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_PING length != 8: ", Integer.valueOf(iOooOo00)));
                    }
                    if (i3 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    handler.OooO0oo(o0000Var.readInt(), o0000Var.readInt(), (i2 & 1) != 0);
                    return true;
                case 7:
                    if (iOooOo00 < 8) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY length < 8: ", Integer.valueOf(iOooOo00)));
                    }
                    if (i3 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i11 = o0000Var.readInt();
                    int i12 = o0000Var.readInt();
                    int i13 = iOooOo00 - 8;
                    ErrorCode.INSTANCE.getClass();
                    for (ErrorCode errorCode3 : ErrorCode.values()) {
                        if ((errorCode3.getHttpCode() == i12) == true) {
                            errorCode = errorCode3;
                            if (errorCode != null) {
                                throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i12)));
                            }
                            byteStringOooooo0 = ByteString.f60866OooO0oO;
                            if (i13 > 0) {
                                byteStringOooooo0 = o0000Var.Oooooo0(i13);
                            }
                            handler.OooO(i11, errorCode, byteStringOooooo0);
                            return true;
                        }
                    }
                    if (errorCode != null) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i12)));
                    }
                    byteStringOooooo0 = ByteString.f60866OooO0oO;
                    if (i13 > 0) {
                        byteStringOooooo0 = o0000Var.Oooooo0(i13);
                    }
                    handler.OooO(i11, errorCode, byteStringOooooo0);
                    return true;
                case 8:
                    if (iOooOo00 != 4) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(iOooOo00)));
                    }
                    long j = ((long) o0000Var.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    handler.OooO0o0(i3, j);
                    return true;
                default:
                    o0000Var.skip(iOooOo00);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void OooO0OO(@NotNull OooO0OO handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f59884OooO0o0) {
            if (!OooO00o(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteString = o0O0O00.f59986OooO0O0;
        ByteString byteStringOooooo0 = this.f59882OooO0Oo.Oooooo0(byteString.data.length);
        Level level = Level.FINE;
        Logger logger = f59881OooO0oo;
        if (logger.isLoggable(level)) {
            logger.fine(o0O000o0.OooO(Intrinsics.stringPlus("<< CONNECTION ", byteStringOooooo0.OooO0o()), new Object[0]));
        }
        if (!Intrinsics.areEqual(byteString, byteStringOooooo0)) {
            throw new IOException(Intrinsics.stringPlus("Expected a connection header but was ", byteStringOooooo0.OooOo00()));
        }
    }

    public final List<o0OO00O> OooO0oO(int i, int i2, int i3, int i4) throws IOException {
        OooO0O0 oooO0O0 = this.f59883OooO0o;
        oooO0O0.f59891OooO0oo = i;
        oooO0O0.f59889OooO0o0 = i;
        oooO0O0.f59886OooO = i2;
        oooO0O0.f59888OooO0o = i3;
        oooO0O0.f59890OooO0oO = i4;
        while (true) {
            oo0o0Oo.OooO00o oooO00o = this.f59885OooO0oO;
            o00O0000 o00o0001 = oooO00o.f60004OooO0Oo;
            boolean zOo000o = o00o0001.oo000o();
            ArrayList arrayList = oooO00o.f60003OooO0OO;
            if (zOo000o) {
                List<o0OO00O> list = CollectionsKt.toList(arrayList);
                arrayList.clear();
                return list;
            }
            byte b = o00o0001.readByte();
            byte[] bArr = o0O000o0.f57386OooO00o;
            int i5 = b & UByte.MAX_VALUE;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            boolean z = false;
            if ((i5 & 128) == 128) {
                int iOooO0o0 = oooO00o.OooO0o0(i5, 127) - 1;
                if (iOooO0o0 >= 0 && iOooO0o0 <= oo0o0Oo.f59999OooO00o.length - 1) {
                    z = true;
                }
                if (!z) {
                    int length = oooO00o.f60005OooO0o + 1 + (iOooO0o0 - oo0o0Oo.f59999OooO00o.length);
                    if (length >= 0) {
                        o0OO00O[] o0oo00oArr = oooO00o.f60006OooO0o0;
                        if (length < o0oo00oArr.length) {
                            o0OO00O o0oo00o2 = o0oo00oArr[length];
                            Intrinsics.checkNotNull(o0oo00o2);
                            arrayList.add(o0oo00o2);
                        }
                    }
                    throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(iOooO0o0 + 1)));
                }
                arrayList.add(oo0o0Oo.f59999OooO00o[iOooO0o0]);
            } else if (i5 == 64) {
                o0OO00O[] o0oo00oArr2 = oo0o0Oo.f59999OooO00o;
                ByteString byteStringOooO0Oo = oooO00o.OooO0Oo();
                oo0o0Oo.OooO00o(byteStringOooO0Oo);
                oooO00o.OooO0OO(new o0OO00O(byteStringOooO0Oo, oooO00o.OooO0Oo()));
            } else if ((i5 & 64) == 64) {
                oooO00o.OooO0OO(new o0OO00O(oooO00o.OooO0O0(oooO00o.OooO0o0(i5, 63) - 1), oooO00o.OooO0Oo()));
            } else if ((i5 & 32) == 32) {
                int iOooO0o1 = oooO00o.OooO0o0(i5, 31);
                oooO00o.f60002OooO0O0 = iOooO0o1;
                if (iOooO0o1 < 0 || iOooO0o1 > oooO00o.f60001OooO00o) {
                    throw new IOException(Intrinsics.stringPlus("Invalid dynamic table size update ", Integer.valueOf(oooO00o.f60002OooO0O0)));
                }
                int i6 = oooO00o.f60008OooO0oo;
                if (iOooO0o1 < i6) {
                    if (iOooO0o1 == 0) {
                        ArraysKt___ArraysJvmKt.fill$default(oooO00o.f60006OooO0o0, (Object) null, 0, 0, 6, (Object) null);
                        oooO00o.f60005OooO0o = oooO00o.f60006OooO0o0.length - 1;
                        oooO00o.f60007OooO0oO = 0;
                        oooO00o.f60008OooO0oo = 0;
                    } else {
                        oooO00o.OooO00o(i6 - iOooO0o1);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                o0OO00O[] o0oo00oArr3 = oo0o0Oo.f59999OooO00o;
                ByteString byteStringOooO0Oo2 = oooO00o.OooO0Oo();
                oo0o0Oo.OooO00o(byteStringOooO0Oo2);
                arrayList.add(new o0OO00O(byteStringOooO0Oo2, oooO00o.OooO0Oo()));
            } else {
                arrayList.add(new o0OO00O(oooO00o.OooO0O0(oooO00o.OooO0o0(i5, 15) - 1), oooO00o.OooO0Oo()));
            }
        }
    }

    public final void OooOOo0(OooO0OO oooO0OO, int i) throws IOException {
        o0000 o0000Var = this.f59882OooO0Oo;
        o0000Var.readInt();
        o0000Var.readByte();
        byte[] bArr = o0O000o0.f57386OooO00o;
        oooO0OO.priority();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59882OooO0Oo.close();
    }
}
