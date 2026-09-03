package p662o0oooO;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o00O00OO;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 implements Closeable {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final OooO00o f51630OoooO0 = new OooO00o();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final Logger f51631OoooO00;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f51632Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0O0 f51633Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0000.OooO00o f51634Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0oOOo f51635Oooo0oo;

    public static final class OooO00o {
        public final int OooO00o(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(o00O00OO.OooO00o("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        }
    }

    public static final class OooO0O0 implements o0O0O0O {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f51636Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f51637Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f51638Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f51639Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final o0oOOo f51640OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f51641OoooO00;

        public OooO0O0(@NotNull o0oOOo source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f51640OoooO0 = source;
        }

        @Override // p674o0oooo0.o0O0O0O
        public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(sink, "sink");
            do {
                int i3 = this.f51636Oooo;
                if (i3 != 0) {
                    long jOooo0O0 = this.f51640OoooO0.Oooo0O0(sink, Math.min(j, i3));
                    if (jOooo0O0 == -1) {
                        return -1L;
                    }
                    this.f51636Oooo -= (int) jOooo0O0;
                    return jOooo0O0;
                }
                this.f51640OoooO0.skip(this.f51641OoooO00);
                this.f51641OoooO00 = 0;
                if ((this.f51638Oooo0oO & 4) != 0) {
                    return -1L;
                }
                i = this.f51639Oooo0oo;
                int iOooOo0 = o00OOO00.OooOo0(this.f51640OoooO0);
                this.f51636Oooo = iOooOo0;
                this.f51637Oooo0o = iOooOo0;
                int i4 = this.f51640OoooO0.readByte() & UByte.MAX_VALUE;
                this.f51638Oooo0oO = this.f51640OoooO0.readByte() & UByte.MAX_VALUE;
                OooO00o oooO00o = o00O0O00.f51630OoooO0;
                Logger logger = o00O0O00.f51631OoooO00;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o0O0ooO.f51715OooO0o0.OooO0O0(true, this.f51639Oooo0oo, this.f51637Oooo0o, i4, this.f51638Oooo0oO));
                }
                i2 = this.f51640OoooO0.readInt() & Integer.MAX_VALUE;
                this.f51639Oooo0oo = i2;
                if (i4 != 9) {
                    throw new IOException(i4 + " != TYPE_CONTINUATION");
                }
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p674o0oooo0.o0O0O0O
        @NotNull
        public final o0oO0O0o timeout() {
            return this.f51640OoooO0.timeout();
        }
    }

    public interface OooO0OO {
        void OooO(boolean z, int i, int i2);

        void OooO00o(int i, @NotNull List list) throws IOException;

        void OooO0O0();

        void OooO0OO(boolean z, int i, @NotNull o0oOOo o0oooo2, int i2) throws IOException;

        void OooO0Oo(boolean z, int i, @NotNull List list);

        void OooO0o(@NotNull o00O0OOO o00o0ooo2);

        void OooO0o0(int i, @NotNull ErrorCode errorCode);

        void OooO0oO(int i, long j);

        void OooO0oo(int i, @NotNull ErrorCode errorCode, @NotNull ByteString byteString);

        void priority();
    }

    static {
        Logger logger = Logger.getLogger(o0O0ooO.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(Http2::class.java.name)");
        f51631OoooO00 = logger;
    }

    public o00O0O00(@NotNull o0oOOo source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f51635Oooo0oo = source;
        this.f51632Oooo = z;
        OooO0O0 oooO0O0 = new OooO0O0(source);
        this.f51633Oooo0o = oooO0O0;
        this.f51634Oooo0oO = new o00O0000.OooO00o(oooO0O0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean OooO00o(boolean z, @NotNull OooO0OO handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        try {
            this.f51635Oooo0oo.o0000oo(9L);
            int iOooOo0 = o00OOO00.OooOo0(this.f51635Oooo0oo);
            if (iOooOo0 > 16384) {
                throw new IOException(android.support.v4.media.OooO00o.OooO00o("FRAME_SIZE_ERROR: ", iOooOo0));
            }
            int i4 = this.f51635Oooo0oo.readByte() & UByte.MAX_VALUE;
            int i5 = this.f51635Oooo0oo.readByte() & UByte.MAX_VALUE;
            int i6 = this.f51635Oooo0oo.readInt() & Integer.MAX_VALUE;
            Logger logger = f51631OoooO00;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(o0O0ooO.f51715OooO0o0.OooO0O0(true, i6, iOooOo0, i4, i5));
            }
            if (z && i4 != 4) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected a SETTINGS frame but was ");
                sbOooO0o0.append(o0O0ooO.f51715OooO0o0.OooO00o(i4));
                throw new IOException(sbOooO0o0.toString());
            }
            switch (i4) {
                case 0:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z2 = (i5 & 1) != 0;
                    if ((i5 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    if ((i5 & 8) != 0) {
                        byte b = this.f51635Oooo0oo.readByte();
                        byte[] bArr = o00OOO00.f51183OooO00o;
                        i = b & UByte.MAX_VALUE;
                    }
                    handler.OooO0OO(z2, i6, this.f51635Oooo0oo, f51630OoooO0.OooO00o(iOooOo0, i5, i));
                    this.f51635Oooo0oo.skip(i);
                    return true;
                case 1:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (i5 & 1) != 0;
                    if ((i5 & 8) != 0) {
                        byte b2 = this.f51635Oooo0oo.readByte();
                        byte[] bArr2 = o00OOO00.f51183OooO00o;
                        i3 = b2 & UByte.MAX_VALUE;
                    }
                    if ((i5 & 32) != 0) {
                        OooO0o(handler, i6);
                        iOooOo0 -= 5;
                    }
                    handler.OooO0Oo(z3, i6, OooO0Oo(f51630OoooO0.OooO00o(iOooOo0, i5, i3), i3, i5, i6));
                    return true;
                case 2:
                    if (iOooOo0 != 5) {
                        throw new IOException(OooO0O0.OooO00o.OooO00o("TYPE_PRIORITY length: ", iOooOo0, " != 5"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    OooO0o(handler, i6);
                    return true;
                case 3:
                    if (iOooOo0 != 4) {
                        throw new IOException(OooO0O0.OooO00o.OooO00o("TYPE_RST_STREAM length: ", iOooOo0, " != 4"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i7 = this.f51635Oooo0oo.readInt();
                    ErrorCode errorCodeOooO00o = ErrorCode.INSTANCE.OooO00o(i7);
                    if (errorCodeOooO00o == null) {
                        throw new IOException(android.support.v4.media.OooO00o.OooO00o("TYPE_RST_STREAM unexpected error code: ", i7));
                    }
                    handler.OooO0o0(i6, errorCodeOooO00o);
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((i5 & 1) != 0) {
                        if (iOooOo0 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        handler.OooO0O0();
                    } else {
                        if (iOooOo0 % 6 != 0) {
                            throw new IOException(android.support.v4.media.OooO00o.OooO00o("TYPE_SETTINGS length % 6 != 0: ", iOooOo0));
                        }
                        o00O0OOO o00o0ooo2 = new o00O0OOO();
                        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, iOooOo0), 6);
                        int first = intProgressionStep.getFirst();
                        int last = intProgressionStep.getLast();
                        int step = intProgressionStep.getStep();
                        if (step < 0 ? first >= last : first <= last) {
                            while (true) {
                                short s = this.f51635Oooo0oo.readShort();
                                byte[] bArr3 = o00OOO00.f51183OooO00o;
                                int i8 = s & UShort.MAX_VALUE;
                                int i9 = this.f51635Oooo0oo.readInt();
                                if (i8 != 2) {
                                    if (i8 == 3) {
                                        i8 = 4;
                                    } else if (i8 == 4) {
                                        i8 = 7;
                                        if (i9 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                    } else if (i8 == 5 && (i9 < 16384 || i9 > 16777215)) {
                                        throw new IOException(android.support.v4.media.OooO00o.OooO00o("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", i9));
                                    }
                                } else if (i9 != 0 && i9 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                o00o0ooo2.OooO0OO(i8, i9);
                                if (first != last) {
                                    first += step;
                                }
                            }
                        }
                        handler.OooO0o(o00o0ooo2);
                    }
                    return true;
                case 5:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    if ((i5 & 8) != 0) {
                        byte b3 = this.f51635Oooo0oo.readByte();
                        byte[] bArr4 = o00OOO00.f51183OooO00o;
                        i2 = b3 & UByte.MAX_VALUE;
                    }
                    handler.OooO00o(this.f51635Oooo0oo.readInt() & Integer.MAX_VALUE, OooO0Oo(f51630OoooO0.OooO00o(iOooOo0 - 4, i5, i2), i2, i5, i6));
                    return true;
                case 6:
                    if (iOooOo0 != 8) {
                        throw new IOException(android.support.v4.media.OooO00o.OooO00o("TYPE_PING length != 8: ", iOooOo0));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    handler.OooO((i5 & 1) != 0, this.f51635Oooo0oo.readInt(), this.f51635Oooo0oo.readInt());
                    return true;
                case 7:
                    if (iOooOo0 < 8) {
                        throw new IOException(android.support.v4.media.OooO00o.OooO00o("TYPE_GOAWAY length < 8: ", iOooOo0));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i10 = this.f51635Oooo0oo.readInt();
                    int i11 = this.f51635Oooo0oo.readInt();
                    int i12 = iOooOo0 - 8;
                    ErrorCode errorCodeOooO00o2 = ErrorCode.INSTANCE.OooO00o(i11);
                    if (errorCodeOooO00o2 == null) {
                        throw new IOException(android.support.v4.media.OooO00o.OooO00o("TYPE_GOAWAY unexpected error code: ", i11));
                    }
                    ByteString byteStringOooOOOo = ByteString.f53046Oooo;
                    if (i12 > 0) {
                        byteStringOooOOOo = this.f51635Oooo0oo.OooOOOo(i12);
                    }
                    handler.OooO0oo(i10, errorCodeOooO00o2, byteStringOooOOOo);
                    return true;
                case 8:
                    if (iOooOo0 != 4) {
                        throw new IOException(android.support.v4.media.OooO00o.OooO00o("TYPE_WINDOW_UPDATE length !=4: ", iOooOo0));
                    }
                    int i13 = this.f51635Oooo0oo.readInt();
                    byte[] bArr5 = o00OOO00.f51183OooO00o;
                    long j = ((long) i13) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    handler.OooO0oO(i6, j);
                    return true;
                default:
                    this.f51635Oooo0oo.skip(iOooOo0);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void OooO0O0(@NotNull OooO0OO handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f51632Oooo) {
            if (!OooO00o(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        o0oOOo o0oooo2 = this.f51635Oooo0oo;
        ByteString byteString = o0O0ooO.f51711OooO00o;
        ByteString byteStringOooOOOo = o0oooo2.OooOOOo(byteString.data.length);
        Logger logger = f51631OoooO00;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("<< CONNECTION ");
            sbOooO0o0.append(byteStringOooOOOo.OooO0o());
            logger.fine(o00OOO00.OooOO0(sbOooO0o0.toString(), new Object[0]));
        }
        if (!Intrinsics.areEqual(byteString, byteStringOooOOOo)) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Expected a connection header but was ");
            sbOooO0o1.append(byteStringOooOOOo.OooOOO());
            throw new IOException(sbOooO0o1.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o0oooO.o00>] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList, java.util.List<o0oooO.o00>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList, java.util.List<o0oooO.o00>] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList, java.util.List<o0oooO.o00>] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList, java.util.List<o0oooO.o00>] */
    public final List<o00> OooO0Oo(int i, int i2, int i3, int i4) throws IOException {
        boolean z;
        OooO0O0 oooO0O0 = this.f51633Oooo0o;
        oooO0O0.f51636Oooo = i;
        oooO0O0.f51637Oooo0o = i;
        oooO0O0.f51641OoooO00 = i2;
        oooO0O0.f51638Oooo0oO = i3;
        oooO0O0.f51639Oooo0oo = i4;
        o00O0000.OooO00o oooO00o = this.f51634Oooo0oO;
        while (!oooO00o.f51576OooO0O0.OooOooo()) {
            byte b = oooO00o.f51576OooO0O0.readByte();
            byte[] bArr = o00OOO00.f51183OooO00o;
            int i5 = b & UByte.MAX_VALUE;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((i5 & 128) == 128) {
                int iOooO0o = oooO00o.OooO0o(i5, 127) - 1;
                if (iOooO0o >= 0) {
                    o00O0000 o00o0001 = o00O0000.f51574OooO0OO;
                    if (iOooO0o <= o00O0000.f51572OooO00o.length - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    o00O0000 o00o0002 = o00O0000.f51574OooO0OO;
                    int length = oooO00o.f51578OooO0Oo + 1 + (iOooO0o - o00O0000.f51572OooO00o.length);
                    if (length >= 0) {
                        o00[] o00VarArr = oooO00o.f51577OooO0OO;
                        if (length < o00VarArr.length) {
                            ?? r3 = oooO00o.f51575OooO00o;
                            o00 o00Var = o00VarArr[length];
                            Intrinsics.checkNotNull(o00Var);
                            r3.add(o00Var);
                        }
                    }
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Header index too large ");
                    sbOooO0o0.append(iOooO0o + 1);
                    throw new IOException(sbOooO0o0.toString());
                }
                o00O0000 o00o0003 = o00O0000.f51574OooO0OO;
                oooO00o.f51575OooO00o.add(o00O0000.f51572OooO00o[iOooO0o]);
            } else if (i5 == 64) {
                o00O0000 o00o0004 = o00O0000.f51574OooO0OO;
                ByteString byteStringOooO0o0 = oooO00o.OooO0o0();
                o00o0004.OooO00o(byteStringOooO0o0);
                oooO00o.OooO0Oo(new o00(byteStringOooO0o0, oooO00o.OooO0o0()));
            } else if ((i5 & 64) == 64) {
                oooO00o.OooO0Oo(new o00(oooO00o.OooO0OO(oooO00o.OooO0o(i5, 63) - 1), oooO00o.OooO0o0()));
            } else if ((i5 & 32) == 32) {
                int iOooO0o2 = oooO00o.OooO0o(i5, 31);
                oooO00o.f51582OooO0oo = iOooO0o2;
                if (iOooO0o2 < 0 || iOooO0o2 > oooO00o.f51581OooO0oO) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Invalid dynamic table size update ");
                    sbOooO0o1.append(oooO00o.f51582OooO0oo);
                    throw new IOException(sbOooO0o1.toString());
                }
                int i6 = oooO00o.f51579OooO0o;
                if (iOooO0o2 < i6) {
                    if (iOooO0o2 == 0) {
                        oooO00o.OooO00o();
                    } else {
                        oooO00o.OooO0O0(i6 - iOooO0o2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                o00O0000 o00o0005 = o00O0000.f51574OooO0OO;
                ByteString byteStringOooO0o1 = oooO00o.OooO0o0();
                o00o0005.OooO00o(byteStringOooO0o1);
                oooO00o.f51575OooO00o.add(new o00(byteStringOooO0o1, oooO00o.OooO0o0()));
            } else {
                oooO00o.f51575OooO00o.add(new o00(oooO00o.OooO0OO(oooO00o.OooO0o(i5, 15) - 1), oooO00o.OooO0o0()));
            }
        }
        o00O0000.OooO00o oooO00o2 = this.f51634Oooo0oO;
        List<o00> list = CollectionsKt.toList(oooO00o2.f51575OooO00o);
        oooO00o2.f51575OooO00o.clear();
        return list;
    }

    public final void OooO0o(OooO0OO oooO0OO, int i) throws IOException {
        this.f51635Oooo0oo.readInt();
        this.f51635Oooo0oo.readByte();
        byte[] bArr = o00OOO00.f51183OooO00o;
        oooO0OO.priority();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f51635Oooo0oo.close();
    }
}
