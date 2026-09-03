package p662o0oooO;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p659o0ooo0o.o00OOO00;
import p664o0oooO00.o000000;
import p664o0oooO00.o000000O;
import p664o0oooO00.oo0o0Oo;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oOoo implements Closeable {

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NotNull
    public static final o00O0OOO f51659o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final OooO0OO f51660o00Ooo = new OooO0OO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final String f51661Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f51662Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OooO0o f51663Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Map<Integer, o00O0O0> f51664Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o000000O f51665OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f51666OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f51667OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f51668OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final o000000 f51669OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final o000000 f51670OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final oo0o0O0 f51671OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public long f51672OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public long f51673OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public long f51674OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f51675Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f51676Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O0OOO f51677OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public o00O0OOO f51678OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public long f51679OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public long f51680Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public long f51681Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public long f51682OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final Socket f51683Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final o000000 f51684o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final Set<Integer> f51685o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final o00O0O0O f51686o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public final OooO f51687ooOO;

    public final class OooO implements o00O0O00.OooO0OO, Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final o00O0O00 f51688Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00oOoo f51689Oooo0oO;

        public static final class OooO00o extends oo0o0Oo {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ int f51690OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ OooO f51691OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ int f51692OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str, OooO oooO, int i, int i2) {
                super(str, true);
                this.f51691OooO0o0 = oooO;
                this.f51690OooO0o = i;
                this.f51692OooO0oO = i2;
            }

            @Override // p664o0oooO00.oo0o0Oo
            public final long OooO00o() {
                this.f51691OooO0o0.f51689Oooo0oO.OooOo0O(true, this.f51690OooO0o, this.f51692OooO0oO);
                return -1L;
            }
        }

        public OooO(@NotNull o00oOoo o00oooo2, o00O0O00 reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f51689Oooo0oO = o00oooo2;
            this.f51688Oooo0o = reader;
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO(boolean z, int i, int i2) {
            if (!z) {
                this.f51689Oooo0oO.f51669OoooOO0.OooO0OO(new OooO00o(p058o0000OoO.OooO.OooO00o(new StringBuilder(), this.f51689Oooo0oO.f51661Oooo, " ping"), this, i, i2), 0L);
                return;
            }
            synchronized (this.f51689Oooo0oO) {
                try {
                    if (i == 1) {
                        this.f51689Oooo0oO.f51673OoooOoO++;
                    } else if (i != 2) {
                        if (i == 3) {
                            o00oOoo o00oooo2 = this.f51689Oooo0oO;
                            Objects.requireNonNull(o00oooo2);
                            o00oooo2.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        this.f51689Oooo0oO.f51675Ooooo00++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO00o(int i, @NotNull List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            o00oOoo o00oooo2 = this.f51689Oooo0oO;
            Objects.requireNonNull(o00oooo2);
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            synchronized (o00oooo2) {
                if (o00oooo2.f51685o00O0O.contains(Integer.valueOf(i))) {
                    o00oooo2.OooOoO(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                o00oooo2.f51685o00O0O.add(Integer.valueOf(i));
                o00oooo2.f51684o000oOoO.OooO0OO(new o00O00OO(o00oooo2.f51661Oooo + '[' + i + "] onRequest", o00oooo2, i, requestHeaders), 0L);
            }
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO0O0() {
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO0OO(boolean z, int i, @NotNull o0oOOo source, int i2) throws IOException {
            boolean z2;
            boolean z3;
            long j;
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f51689Oooo0oO.OooO0o(i)) {
                o00oOoo o00oooo2 = this.f51689Oooo0oO;
                Objects.requireNonNull(o00oooo2);
                Intrinsics.checkNotNullParameter(source, "source");
                o0oOO o0ooo2 = new o0oOO();
                long j2 = i2;
                source.o0000oo(j2);
                source.Oooo0O0(o0ooo2, j2);
                o00oooo2.f51684o000oOoO.OooO0OO(new o00O00O(o00oooo2.f51661Oooo + '[' + i + "] onData", o00oooo2, i, o0ooo2, i2, z), 0L);
                return;
            }
            o00O0O0 o00o0o0OooO0Oo = this.f51689Oooo0oO.OooO0Oo(i);
            if (o00o0o0OooO0Oo == null) {
                this.f51689Oooo0oO.OooOoO(i, ErrorCode.PROTOCOL_ERROR);
                long j3 = i2;
                this.f51689Oooo0oO.OooOOo(j3);
                source.skip(j3);
                return;
            }
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = o00OOO00.f51183OooO00o;
            o00O0O0.OooO0O0 oooO0O0 = o00o0o0OooO0Oo.f51612OooO0oO;
            long j4 = i2;
            Objects.requireNonNull(oooO0O0);
            Intrinsics.checkNotNullParameter(source, "source");
            while (true) {
                boolean z4 = true;
                if (j4 <= 0) {
                    break;
                }
                synchronized (o00O0O0.this) {
                    z2 = oooO0O0.f51628OoooO00;
                    z3 = oooO0O0.f51625Oooo0oO.f52099Oooo0oO + j4 > oooO0O0.f51623Oooo;
                    Unit unit = Unit.INSTANCE;
                }
                if (z3) {
                    source.skip(j4);
                    o00O0O0.this.OooO0o0(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    source.skip(j4);
                    break;
                }
                long jOooo0O0 = source.Oooo0O0(oooO0O0.f51624Oooo0o, j4);
                if (jOooo0O0 == -1) {
                    throw new EOFException();
                }
                j4 -= jOooo0O0;
                synchronized (o00O0O0.this) {
                    if (oooO0O0.f51626Oooo0oo) {
                        o0oOO o0ooo3 = oooO0O0.f51624Oooo0o;
                        j = o0ooo3.f52099Oooo0oO;
                        o0ooo3.OooO0Oo();
                    } else {
                        o0oOO o0ooo4 = oooO0O0.f51625Oooo0oO;
                        if (o0ooo4.f52099Oooo0oO != 0) {
                            z4 = false;
                        }
                        o0ooo4.o0ooOOo(oooO0O0.f51624Oooo0o);
                        if (z4) {
                            o00O0O0 o00o0o0 = o00O0O0.this;
                            if (o00o0o0 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            o00o0o0.notifyAll();
                        }
                        j = 0;
                    }
                }
                if (j > 0) {
                    oooO0O0.OooO00o(j);
                }
            }
            if (z) {
                o00o0o0OooO0Oo.OooOO0(o00OOO00.f51184OooO0O0, true);
            }
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO0Oo(boolean z, int i, @NotNull List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
            if (this.f51689Oooo0oO.OooO0o(i)) {
                o00oOoo o00oooo2 = this.f51689Oooo0oO;
                Objects.requireNonNull(o00oooo2);
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                o00oooo2.f51684o000oOoO.OooO0OO(new oOO00O(o00oooo2.f51661Oooo + '[' + i + "] onHeaders", o00oooo2, i, requestHeaders, z), 0L);
                return;
            }
            synchronized (this.f51689Oooo0oO) {
                o00O0O0 o00o0o0OooO0Oo = this.f51689Oooo0oO.OooO0Oo(i);
                if (o00o0o0OooO0Oo != null) {
                    Unit unit = Unit.INSTANCE;
                    o00o0o0OooO0Oo.OooOO0(o00OOO00.OooOo0o(requestHeaders), z);
                    return;
                }
                o00oOoo o00oooo3 = this.f51689Oooo0oO;
                if (o00oooo3.f51668OoooO0O) {
                    return;
                }
                if (i <= o00oooo3.f51667OoooO00) {
                    return;
                }
                if (i % 2 == o00oooo3.f51666OoooO0 % 2) {
                    return;
                }
                o00O0O0 o00o0o0 = new o00O0O0(i, this.f51689Oooo0oO, false, z, o00OOO00.OooOo0o(requestHeaders));
                o00oOoo o00oooo4 = this.f51689Oooo0oO;
                o00oooo4.f51667OoooO00 = i;
                o00oooo4.f51664Oooo0oo.put(Integer.valueOf(i), o00o0o0);
                this.f51689Oooo0oO.f51665OoooO.OooO0o().OooO0OO(new o00O000o(this.f51689Oooo0oO.f51661Oooo + '[' + i + "] onStream", o00o0o0, this, requestHeaders), 0L);
            }
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO0o(@NotNull o00O0OOO settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f51689Oooo0oO.f51669OoooOO0.OooO0OO(new o00O00(p058o0000OoO.OooO.OooO00o(new StringBuilder(), this.f51689Oooo0oO.f51661Oooo, " applyAndAckSettings"), this, settings), 0L);
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO0o0(int i, @NotNull ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (!this.f51689Oooo0oO.OooO0o(i)) {
                o00O0O0 o00o0o0OooO0oo = this.f51689Oooo0oO.OooO0oo(i);
                if (o00o0o0OooO0oo != null) {
                    synchronized (o00o0o0OooO0oo) {
                        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                        if (o00o0o0OooO0oo.f51615OooOO0O == null) {
                            o00o0o0OooO0oo.f51615OooOO0O = errorCode;
                            o00o0o0OooO0oo.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            o00oOoo o00oooo2 = this.f51689Oooo0oO;
            Objects.requireNonNull(o00oooo2);
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            o00oooo2.f51684o000oOoO.OooO0OO(new o00O00o0(o00oooo2.f51661Oooo + '[' + i + "] onReset", o00oooo2, i, errorCode), 0L);
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO0oO(int i, long j) {
            if (i == 0) {
                synchronized (this.f51689Oooo0oO) {
                    o00oOoo o00oooo2 = this.f51689Oooo0oO;
                    o00oooo2.f51682OoooooO += j;
                    if (o00oooo2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    o00oooo2.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            o00O0O0 o00o0o0OooO0Oo = this.f51689Oooo0oO.OooO0Oo(i);
            if (o00o0o0OooO0Oo != null) {
                synchronized (o00o0o0OooO0Oo) {
                    o00o0o0OooO0Oo.f51609OooO0Oo += j;
                    if (j > 0) {
                        o00o0o0OooO0Oo.notifyAll();
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r7v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, o0oooO.o00O0O0>] */
        @Override // o0oooO.o00O0O00.OooO0OO
        public final void OooO0oo(int i, @NotNull ErrorCode errorCode, @NotNull ByteString debugData) {
            int i2;
            o00O0O0[] o00o0o0Arr;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.OooO0o0();
            synchronized (this.f51689Oooo0oO) {
                Object[] array = this.f51689Oooo0oO.f51664Oooo0oo.values().toArray(new o00O0O0[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                o00o0o0Arr = (o00O0O0[]) array;
                this.f51689Oooo0oO.f51668OoooO0O = true;
                Unit unit = Unit.INSTANCE;
            }
            for (o00O0O0 o00o0o0 : o00o0o0Arr) {
                if (o00o0o0.f51618OooOOO0 > i && o00o0o0.OooO0oo()) {
                    ErrorCode errorCode2 = ErrorCode.REFUSED_STREAM;
                    synchronized (o00o0o0) {
                        Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                        if (o00o0o0.f51615OooOO0O == null) {
                            o00o0o0.f51615OooOO0O = errorCode2;
                            o00o0o0.notifyAll();
                        }
                    }
                    this.f51689Oooo0oO.OooO0oo(o00o0o0.f51618OooOOO0);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.Unit] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f51688Oooo0o.OooO0O0(this);
                    while (this.f51688Oooo0o.OooO00o(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.f51689Oooo0oO.OooO0O0(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        o00oOoo o00oooo2 = this.f51689Oooo0oO;
                        o00oooo2.OooO0O0(errorCode4, errorCode4, e);
                        errorCode = o00oooo2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f51689Oooo0oO.OooO0O0(errorCode, errorCode2, e);
                    o00OOO00.OooO0Oo(this.f51688Oooo0o);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                this.f51689Oooo0oO.OooO0O0(errorCode, errorCode2, e);
                o00OOO00.OooO0Oo(this.f51688Oooo0o);
                throw th;
            }
            o00OOO00.OooO0Oo(this.f51688Oooo0o);
            errorCode2 = Unit.INSTANCE;
            return errorCode2;
        }

        @Override // o0oooO.o00O0O00.OooO0OO
        public final void priority() {
        }
    }

    public static final class OooO00o extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f51693OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00oOoo f51694OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, o00oOoo o00oooo2, long j) {
            super(str, true);
            this.f51694OooO0o0 = o00oooo2;
            this.f51693OooO0o = j;
        }

        @Override // p664o0oooO00.oo0o0Oo
        public final long OooO00o() {
            o00oOoo o00oooo2;
            boolean z;
            synchronized (this.f51694OooO0o0) {
                o00oooo2 = this.f51694OooO0o0;
                long j = o00oooo2.f51673OoooOoO;
                long j2 = o00oooo2.f51672OoooOo0;
                if (j < j2) {
                    z = true;
                } else {
                    o00oooo2.f51672OoooOo0 = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                o00oOoo.OooO00o(o00oooo2, null);
                return -1L;
            }
            o00oooo2.OooOo0O(false, 1, 0);
            return this.f51693OooO0o;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final o000000O f51695OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public Socket f51696OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f51697OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public o0oOOo f51698OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public oo00oO f51699OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public oo0o0O0 f51700OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public OooO0o f51701OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f51702OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f51703OooO0oo;

        public OooO0O0(@NotNull o000000O taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f51703OooO0oo = true;
            this.f51695OooO = taskRunner;
            this.f51701OooO0o0 = OooO0o.f51704OooO00o;
            this.f51700OooO0o = o00O0OO.f51649OooO00o;
        }
    }

    public static final class OooO0OO {
    }

    public static abstract class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final OooO00o f51704OooO00o = new OooO00o();

        public static final class OooO00o extends OooO0o {
            @Override // o0oooO.o00oOoo.OooO0o
            public final void OooO0OO(@NotNull o00O0O0 stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.OooO0OO(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public void OooO0O0(@NotNull o00oOoo connection, @NotNull o00O0OOO settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void OooO0OO(@NotNull o00O0O0 o00o0o0) throws IOException;
    }

    public static final class OooOO0 extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51705OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00oOoo f51706OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f51707OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, o00oOoo o00oooo2, int i, ErrorCode errorCode) {
            super(str, true);
            this.f51706OooO0o0 = o00oooo2;
            this.f51705OooO0o = i;
            this.f51707OooO0oO = errorCode;
        }

        @Override // p664o0oooO00.oo0o0Oo
        public final long OooO00o() {
            try {
                o00oOoo o00oooo2 = this.f51706OooO0o0;
                int i = this.f51705OooO0o;
                ErrorCode statusCode = this.f51707OooO0oO;
                Objects.requireNonNull(o00oooo2);
                Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                o00oooo2.f51686o0OoOo0.OooO0oo(i, statusCode);
                return -1L;
            } catch (IOException e) {
                o00oOoo.OooO00o(this.f51706OooO0o0, e);
                return -1L;
            }
        }
    }

    public static final class OooOO0O extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51708OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00oOoo f51709OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f51710OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, o00oOoo o00oooo2, int i, long j) {
            super(str, true);
            this.f51709OooO0o0 = o00oooo2;
            this.f51708OooO0o = i;
            this.f51710OooO0oO = j;
        }

        @Override // p664o0oooO00.oo0o0Oo
        public final long OooO00o() {
            try {
                this.f51709OooO0o0.f51686o0OoOo0.OooO0oO(this.f51708OooO0o, this.f51710OooO0oO);
                return -1L;
            } catch (IOException e) {
                o00oOoo.OooO00o(this.f51709OooO0o0, e);
                return -1L;
            }
        }
    }

    static {
        o00O0OOO o00o0ooo2 = new o00O0OOO();
        o00o0ooo2.OooO0OO(7, 65535);
        o00o0ooo2.OooO0OO(5, 16384);
        f51659o00Oo0 = o00o0ooo2;
    }

    public o00oOoo(@NotNull OooO0O0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z = builder.f51703OooO0oo;
        this.f51662Oooo0o = z;
        this.f51663Oooo0oO = builder.f51701OooO0o0;
        this.f51664Oooo0oo = new LinkedHashMap();
        String str = builder.f51697OooO0O0;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
        }
        this.f51661Oooo = str;
        this.f51666OoooO0 = builder.f51703OooO0oo ? 3 : 2;
        o000000O o000000o2 = builder.f51695OooO;
        this.f51665OoooO = o000000o2;
        o000000 o000000VarOooO0o = o000000o2.OooO0o();
        this.f51669OoooOO0 = o000000VarOooO0o;
        this.f51684o000oOoO = o000000o2.OooO0o();
        this.f51670OoooOOO = o000000o2.OooO0o();
        this.f51671OoooOOo = builder.f51700OooO0o;
        o00O0OOO o00o0ooo2 = new o00O0OOO();
        if (builder.f51703OooO0oo) {
            o00o0ooo2.OooO0OO(7, 16777216);
        }
        Unit unit = Unit.INSTANCE;
        this.f51677OooooO0 = o00o0ooo2;
        o00O0OOO o00o0ooo3 = f51659o00Oo0;
        this.f51678OooooOO = o00o0ooo3;
        this.f51682OoooooO = o00o0ooo3.OooO00o();
        Socket socket = builder.f51696OooO00o;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
        }
        this.f51683Ooooooo = socket;
        oo00oO oo00oo = builder.f51699OooO0Oo;
        if (oo00oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
        }
        this.f51686o0OoOo0 = new o00O0O0O(oo00oo, z);
        o0oOOo o0oooo2 = builder.f51698OooO0OO;
        if (o0oooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.f51687ooOO = new OooO(this, new o00O0O00(o0oooo2, z));
        this.f51685o00O0O = new LinkedHashSet();
        int i = builder.f51702OooO0oO;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            o000000VarOooO0o.OooO0OO(new OooO00o(OooOo00.OooO0Oo(str, " ping"), this, nanos), nanos);
        }
    }

    public static final void OooO00o(o00oOoo o00oooo2, IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        o00oooo2.OooO0O0(errorCode, errorCode, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, o0oooO.o00O0O0>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, o0oooO.o00O0O0>] */
    public final void OooO0O0(@NotNull ErrorCode connectionCode, @NotNull ErrorCode streamCode, @Nullable IOException iOException) {
        int i;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = o00OOO00.f51183OooO00o;
        try {
            OooOOO(connectionCode);
        } catch (IOException unused) {
        }
        o00O0O0[] o00o0o0Arr = null;
        synchronized (this) {
            if (!this.f51664Oooo0oo.isEmpty()) {
                Object[] array = this.f51664Oooo0oo.values().toArray(new o00O0O0[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                o00o0o0Arr = (o00O0O0[]) array;
                this.f51664Oooo0oo.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (o00o0o0Arr != null) {
            for (o00O0O0 o00o0o0 : o00o0o0Arr) {
                try {
                    o00o0o0.OooO0OO(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f51686o0OoOo0.close();
        } catch (IOException unused3) {
        }
        try {
            this.f51683Ooooooo.close();
        } catch (IOException unused4) {
        }
        this.f51669OoooOO0.OooO0o();
        this.f51684o000oOoO.OooO0o();
        this.f51670OoooOOO.OooO0o();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, o0oooO.o00O0O0>] */
    @Nullable
    public final synchronized o00O0O0 OooO0Oo(int i) {
        return (o00O0O0) this.f51664Oooo0oo.get(Integer.valueOf(i));
    }

    public final boolean OooO0o(int i) {
        return i != 0 && (i & 1) == 0;
    }

    @Nullable
    public final synchronized o00O0O0 OooO0oo(int i) {
        o00O0O0 o00o0o0Remove;
        o00o0o0Remove = this.f51664Oooo0oo.remove(Integer.valueOf(i));
        notifyAll();
        return o00o0o0Remove;
    }

    public final void OooOOO(@NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f51686o0OoOo0) {
            synchronized (this) {
                if (this.f51668OoooO0O) {
                    return;
                }
                this.f51668OoooO0O = true;
                int i = this.f51667OoooO00;
                Unit unit = Unit.INSTANCE;
                this.f51686o0OoOo0.OooO0Oo(i, statusCode, o00OOO00.f51183OooO00o);
            }
        }
    }

    public final synchronized void OooOOo(long j) {
        long j2 = this.f51679OooooOo + j;
        this.f51679OooooOo = j2;
        long j3 = j2 - this.f51681Oooooo0;
        if (j3 >= this.f51677OooooO0.OooO00o() / 2) {
            OooOoOO(0, j3);
            this.f51681Oooooo0 += j3;
        }
    }

    public final void OooOOoo(int i, boolean z, @Nullable o0oOO o0ooo2, long j) throws IOException {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f51686o0OoOo0.OoooO00(z, i, o0ooo2, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f51680Oooooo;
                        j3 = this.f51682OoooooO;
                        if (j2 >= j3) {
                            if (!this.f51664Oooo0oo.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f51686o0OoOo0.f51645Oooo0oO);
                j4 = iMin;
                this.f51680Oooooo += j4;
                Unit unit = Unit.INSTANCE;
            }
            j -= j4;
            this.f51686o0OoOo0.OoooO00(z && j == 0, i, o0ooo2, iMin);
        }
    }

    public final void OooOo0O(boolean z, int i, int i2) {
        try {
            this.f51686o0OoOo0.OooO(z, i, i2);
        } catch (IOException e) {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            OooO0O0(errorCode, errorCode, e);
        }
    }

    public final void OooOoO(int i, @NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f51669OoooOO0.OooO0OO(new OooOO0(this.f51661Oooo + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    public final void OooOoOO(int i, long j) {
        this.f51669OoooOO0.OooO0OO(new OooOO0O(this.f51661Oooo + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO0O0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() throws IOException {
        this.f51686o0OoOo0.flush();
    }
}
