package p651o0ooo00O;

import com.google.gson.internal.o00O0O;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;
import p639o0ooOO0o.o00OO00O;
import p639o0ooOO0o.o00OO0O0;
import p639o0ooOO0o.oo0oOO0;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo implements Closeable {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public static final o000 f59937OooOooo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f59938OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f59939OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59940OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f59941OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f59942OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f59943OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f59944OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00OO0O0 f59945OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59946OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59947OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59948OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o00O0O f59949OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f59950OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f59951OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f59952OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f59953OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f59954OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final o000 f59955OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f59956OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public o000 f59957OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f59958OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f59959OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f59960OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Socket f59961OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59962OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final o000OO f59963OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f59964OooOooO;

    public static final class OooO extends oo0oOO0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f59965OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000OOo f59966OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f59967OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, o000OOo o000ooo2, int i, ErrorCode errorCode) {
            super(str, true);
            this.f59966OooO0o0 = o000ooo2;
            this.f59965OooO0o = i;
            this.f59967OooO0oO = errorCode;
        }

        @Override // p639o0ooOO0o.oo0oOO0
        public final long OooO00o() {
            o000OOo o000ooo2 = this.f59966OooO0o0;
            try {
                int i = this.f59965OooO0o;
                ErrorCode statusCode = this.f59967OooO0oO;
                o000ooo2.getClass();
                Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                o000ooo2.f59963OooOoo0.OooOOo(i, statusCode);
                return -1L;
            } catch (IOException e) {
                o000ooo2.OooO0OO(e);
                return -1L;
            }
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f59968OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f59969OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o00OO0O0 f59970OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Socket f59971OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f59972OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o0000Ooo f59973OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0000 f59974OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public OooO0O0 f59975OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public final o00O0O f59976OooO0oo;

        public OooO00o(@NotNull o00OO0O0 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f59969OooO00o = true;
            this.f59970OooO0O0 = taskRunner;
            this.f59975OooO0oO = OooO0O0.f59977OooO00o;
            this.f59976OooO0oo = o0000OO0.f59918OooO00o;
        }
    }

    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final OooO00o f59977OooO00o = new OooO00o();

        public static final class OooO00o extends OooO0O0 {
            @Override // o0ooo00O.o000OOo.OooO0O0
            public final void OooO0O0(@NotNull o0000O0O stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.OooO0OO(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public void OooO00o(@NotNull o000OOo connection, @NotNull o000 settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void OooO0O0(@NotNull o0000O0O o0000o0o2) throws IOException;
    }

    public final class OooO0OO implements o0000O0.OooO0OO, Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0000O0 f59978OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000OOo f59979OooO0o0;

        public OooO0OO(@NotNull o000OOo this$0, o0000O0 reader) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f59979OooO0o0 = this$0;
            this.f59978OooO0Oo = reader;
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO(int i, @NotNull ErrorCode errorCode, @NotNull ByteString debugData) {
            int i2;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.OooO0o0();
            o000OOo o000ooo2 = this.f59979OooO0o0;
            synchronized (o000ooo2) {
                i2 = 0;
                array = o000ooo2.f59940OooO0o.values().toArray(new o0000O0O[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                o000ooo2.f59944OooOO0 = true;
                Unit unit = Unit.INSTANCE;
            }
            o0000O0O[] o0000o0oArr = (o0000O0O[]) array;
            int length = o0000o0oArr.length;
            while (i2 < length) {
                o0000O0O o0000o0o2 = o0000o0oArr[i2];
                i2++;
                if (o0000o0o2.f59894OooO00o > i && o0000o0o2.OooO0oo()) {
                    o0000o0o2.OooOO0O(ErrorCode.REFUSED_STREAM);
                    this.f59979OooO0o0.OooOOo(o0000o0o2.f59894OooO00o);
                }
            }
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO00o(@NotNull o000 settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            o000OOo o000ooo2 = this.f59979OooO0o0;
            o000ooo2.f59946OooOO0o.OooO0OO(new o00000O0(Intrinsics.stringPlus(o000ooo2.f59942OooO0oO, " applyAndAckSettings"), this, settings), 0L);
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO0O0(int i, int i2, @NotNull o0000 source, boolean z) throws IOException {
            boolean z2;
            boolean z3;
            long j;
            Intrinsics.checkNotNullParameter(source, "source");
            this.f59979OooO0o0.getClass();
            if (i != 0 && (i & 1) == 0) {
                o000OOo o000ooo2 = this.f59979OooO0o0;
                o000ooo2.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                o00000O o00000o = new o00000O();
                long j2 = i2;
                source.OoooOoO(j2);
                source.o0000OO0(o00000o, j2);
                o000ooo2.f59948OooOOO0.OooO0OO(new o00000O(o000ooo2.f59942OooO0oO + '[' + i + "] onData", o000ooo2, i, o00000o, i2, z), 0L);
                return;
            }
            o0000O0O o0000o0oOooO0oO = this.f59979OooO0o0.OooO0oO(i);
            if (o0000o0oOooO0oO == null) {
                this.f59979OooO0o0.OooOooO(i, ErrorCode.PROTOCOL_ERROR);
                long j3 = i2;
                this.f59979OooO0o0.OooOo0(j3);
                source.skip(j3);
                return;
            }
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = o0O000o0.f57386OooO00o;
            o0000O0O.OooO0O0 oooO0O0 = o0000o0oOooO0oO.f59893OooO;
            long j4 = i2;
            oooO0O0.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            while (j4 > 0) {
                synchronized (oooO0O0.f59911OooO) {
                    z2 = oooO0O0.f59914OooO0o0;
                    z3 = oooO0O0.f59915OooO0oO.f60177OooO0o0 + j4 > oooO0O0.f59912OooO0Oo;
                    Unit unit = Unit.INSTANCE;
                }
                if (z3) {
                    source.skip(j4);
                    oooO0O0.f59911OooO.OooO0o0(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    source.skip(j4);
                    break;
                }
                long jO0000OO0 = source.o0000OO0(oooO0O0.f59913OooO0o, j4);
                if (jO0000OO0 == -1) {
                    throw new EOFException();
                }
                j4 -= jO0000OO0;
                o0000O0O o0000o0o2 = oooO0O0.f59911OooO;
                synchronized (o0000o0o2) {
                    if (oooO0O0.f59916OooO0oo) {
                        o00000O o00000o2 = oooO0O0.f59913OooO0o;
                        j = o00000o2.f60177OooO0o0;
                        o00000o2.OooO0oO();
                    } else {
                        o00000O o00000o3 = oooO0O0.f59915OooO0oO;
                        boolean z4 = o00000o3.f60177OooO0o0 == 0;
                        o00000o3.Oooo000(oooO0O0.f59913OooO0o);
                        if (z4) {
                            o0000o0o2.notifyAll();
                        }
                        j = 0;
                    }
                }
                if (j > 0) {
                    oooO0O0.OooO00o(j);
                }
            }
            if (z) {
                o0000o0oOooO0oO.OooOO0(o0O000o0.f57387OooO0O0, true);
            }
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO0OO() {
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO0Oo(@NotNull List requestHeaders, int i) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            o000OOo o000ooo2 = this.f59979OooO0o0;
            o000ooo2.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            synchronized (o000ooo2) {
                if (o000ooo2.f59964OooOooO.contains(Integer.valueOf(i))) {
                    o000ooo2.OooOooO(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                o000ooo2.f59964OooOooO.add(Integer.valueOf(i));
                o000ooo2.f59948OooOOO0.OooO0OO(new o0000Ooo(o000ooo2.f59942OooO0oO + '[' + i + "] onRequest", o000ooo2, i, requestHeaders), 0L);
            }
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO0o(int i, @NotNull ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            o000OOo o000ooo2 = this.f59979OooO0o0;
            o000ooo2.getClass();
            if (!(i != 0 && (i & 1) == 0)) {
                o0000O0O o0000o0oOooOOo = o000ooo2.OooOOo(i);
                if (o0000o0oOooOOo == null) {
                    return;
                }
                o0000o0oOooOOo.OooOO0O(errorCode);
                return;
            }
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            o000ooo2.f59948OooOOO0.OooO0OO(new o0000(o000ooo2.f59942OooO0oO + '[' + i + "] onReset", o000ooo2, i, errorCode), 0L);
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO0o0(int i, long j) {
            if (i == 0) {
                o000OOo o000ooo2 = this.f59979OooO0o0;
                synchronized (o000ooo2) {
                    o000ooo2.f59959OooOoO += j;
                    o000ooo2.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            o0000O0O o0000o0oOooO0oO = this.f59979OooO0o0.OooO0oO(i);
            if (o0000o0oOooO0oO != null) {
                synchronized (o0000o0oOooO0oO) {
                    o0000o0oOooO0oO.f59898OooO0o += j;
                    if (j > 0) {
                        o0000o0oOooO0oO.notifyAll();
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO0oO(int i, @NotNull List requestHeaders, boolean z) {
            Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
            this.f59979OooO0o0.getClass();
            if (i != 0 && (i & 1) == 0) {
                o000OOo o000ooo2 = this.f59979OooO0o0;
                o000ooo2.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                o000ooo2.f59948OooOOO0.OooO0OO(new o00000OO(o000ooo2.f59942OooO0oO + '[' + i + "] onHeaders", o000ooo2, i, requestHeaders, z), 0L);
                return;
            }
            o000OOo o000ooo3 = this.f59979OooO0o0;
            synchronized (o000ooo3) {
                o0000O0O o0000o0oOooO0oO = o000ooo3.OooO0oO(i);
                if (o0000o0oOooO0oO != null) {
                    Unit unit = Unit.INSTANCE;
                    o0000o0oOooO0oO.OooOO0(o0O000o0.OooOo0O(requestHeaders), z);
                    return;
                }
                if (o000ooo3.f59944OooOO0) {
                    return;
                }
                if (i <= o000ooo3.f59943OooO0oo) {
                    return;
                }
                if (i % 2 == o000ooo3.f59938OooO % 2) {
                    return;
                }
                o0000O0O o0000o0o2 = new o0000O0O(i, o000ooo3, false, z, o0O000o0.OooOo0O(requestHeaders));
                o000ooo3.f59943OooO0oo = i;
                o000ooo3.f59940OooO0o.put(Integer.valueOf(i), o0000o0o2);
                o000ooo3.f59945OooOO0O.OooO0o().OooO0OO(new o000000O(o000ooo3.f59942OooO0oO + '[' + i + "] onStream", o000ooo3, o0000o0o2), 0L);
            }
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void OooO0oo(int i, int i2, boolean z) {
            if (!z) {
                o000OOo o000ooo2 = this.f59979OooO0o0;
                o000ooo2.f59946OooOO0o.OooO0OO(new o00000(Intrinsics.stringPlus(o000ooo2.f59942OooO0oO, " ping"), this.f59979OooO0o0, i, i2), 0L);
                return;
            }
            o000OOo o000ooo3 = this.f59979OooO0o0;
            synchronized (o000ooo3) {
                try {
                    if (i == 1) {
                        o000ooo3.f59952OooOOo0++;
                    } else if (i != 2) {
                        if (i == 3) {
                            o000ooo3.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        o000ooo3.f59953OooOOoo++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            o000OOo o000ooo2 = this.f59979OooO0o0;
            o0000O0 o0000o1 = this.f59978OooO0Oo;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                o0000o1.OooO0OO(this);
                while (o0000o1.OooO00o(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        o000ooo2.OooO00o(errorCode, ErrorCode.CANCEL, null);
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        o000ooo2.OooO00o(errorCode3, errorCode3, e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o000ooo2.OooO00o(errorCode, errorCode2, e);
                    o0O000o0.OooO0OO(o0000o1);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                errorCode = errorCode2;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                o000ooo2.OooO00o(errorCode, errorCode2, e);
                o0O000o0.OooO0OO(o0000o1);
                throw th;
            }
            o0O000o0.OooO0OO(o0000o1);
            return Unit.INSTANCE;
        }

        @Override // o0ooo00O.o0000O0.OooO0OO
        public final void priority() {
        }
    }

    public static final class OooO0o extends oo0oOO0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f59980OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000OOo f59981OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, o000OOo o000ooo2, long j) {
            super(str, true);
            this.f59981OooO0o0 = o000ooo2;
            this.f59980OooO0o = j;
        }

        @Override // p639o0ooOO0o.oo0oOO0
        public final long OooO00o() {
            o000OOo o000ooo2;
            boolean z;
            synchronized (this.f59981OooO0o0) {
                o000ooo2 = this.f59981OooO0o0;
                long j = o000ooo2.f59952OooOOo0;
                long j2 = o000ooo2.f59950OooOOOo;
                if (j < j2) {
                    z = true;
                } else {
                    o000ooo2.f59950OooOOOo = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                o000ooo2.OooO0OO(null);
                return -1L;
            }
            try {
                o000ooo2.f59963OooOoo0.OooO0oo(1, 0, false);
            } catch (IOException e) {
                o000ooo2.OooO0OO(e);
            }
            return this.f59980OooO0o;
        }
    }

    public static final class OooOO0 extends oo0oOO0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f59982OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000OOo f59983OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f59984OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, o000OOo o000ooo2, int i, long j) {
            super(str, true);
            this.f59983OooO0o0 = o000ooo2;
            this.f59982OooO0o = i;
            this.f59984OooO0oO = j;
        }

        @Override // p639o0ooOO0o.oo0oOO0
        public final long OooO00o() {
            o000OOo o000ooo2 = this.f59983OooO0o0;
            try {
                o000ooo2.f59963OooOoo0.OooO0o0(this.f59982OooO0o, this.f59984OooO0oO);
                return -1L;
            } catch (IOException e) {
                o000ooo2.OooO0OO(e);
                return -1L;
            }
        }
    }

    static {
        o000 o000Var = new o000();
        o000Var.OooO0OO(7, 65535);
        o000Var.OooO0OO(5, 16384);
        f59937OooOooo = o000Var;
    }

    public o000OOo(@NotNull OooO00o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z = builder.f59969OooO00o;
        this.f59939OooO0Oo = z;
        this.f59941OooO0o0 = builder.f59975OooO0oO;
        this.f59940OooO0o = new LinkedHashMap();
        String str = builder.f59972OooO0Oo;
        o0000 o0000Var = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f59942OooO0oO = str;
        this.f59938OooO = z ? 3 : 2;
        o00OO0O0 o00oo0o1 = builder.f59970OooO0O0;
        this.f59945OooOO0O = o00oo0o1;
        o00OO00O o00oo00oOooO0o = o00oo0o1.OooO0o();
        this.f59946OooOO0o = o00oo00oOooO0o;
        this.f59948OooOOO0 = o00oo0o1.OooO0o();
        this.f59947OooOOO = o00oo0o1.OooO0o();
        this.f59949OooOOOO = builder.f59976OooO0oo;
        o000 o000Var = new o000();
        if (z) {
            o000Var.OooO0OO(7, 16777216);
        }
        this.f59955OooOo0 = o000Var;
        o000 o000Var2 = f59937OooOooo;
        this.f59957OooOo0O = o000Var2;
        this.f59959OooOoO = o000Var2.OooO00o();
        Socket socket = builder.f59971OooO0OO;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            socket = null;
        }
        this.f59961OooOoOO = socket;
        o0000Ooo o0000ooo = builder.f59973OooO0o;
        if (o0000ooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            o0000ooo = null;
        }
        this.f59963OooOoo0 = new o000OO(o0000ooo, z);
        o0000 o0000Var2 = builder.f59974OooO0o0;
        if (o0000Var2 != null) {
            o0000Var = o0000Var2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.f59962OooOoo = new OooO0OO(this, new o0000O0(o0000Var, z));
        this.f59964OooOooO = new LinkedHashSet();
        int i = builder.f59968OooO;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            o00oo00oOooO0o.OooO0OO(new OooO0o(Intrinsics.stringPlus(str, " ping"), this, nanos), nanos);
        }
    }

    public final void OooO00o(@NotNull ErrorCode connectionCode, @NotNull ErrorCode streamCode, @Nullable IOException iOException) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = o0O000o0.f57386OooO00o;
        try {
            OooOo00(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f59940OooO0o.isEmpty()) {
                array = this.f59940OooO0o.values().toArray(new o0000O0O[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.f59940OooO0o.clear();
            } else {
                array = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        o0000O0O[] o0000o0oArr = (o0000O0O[]) array;
        if (o0000o0oArr != null) {
            for (o0000O0O o0000o0o2 : o0000o0oArr) {
                try {
                    o0000o0o2.OooO0OO(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f59963OooOoo0.close();
        } catch (IOException unused3) {
        }
        try {
            this.f59961OooOoOO.close();
        } catch (IOException unused4) {
        }
        this.f59946OooOO0o.OooO0o0();
        this.f59948OooOOO0.OooO0o0();
        this.f59947OooOOO.OooO0o0();
    }

    public final void OooO0OO(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        OooO00o(errorCode, errorCode, iOException);
    }

    @Nullable
    public final synchronized o0000O0O OooO0oO(int i) {
        return (o0000O0O) this.f59940OooO0o.get(Integer.valueOf(i));
    }

    @Nullable
    public final synchronized o0000O0O OooOOo(int i) {
        o0000O0O o0000o0o2;
        o0000o0o2 = (o0000O0O) this.f59940OooO0o.remove(Integer.valueOf(i));
        notifyAll();
        return o0000o0o2;
    }

    public final synchronized boolean OooOOo0(long j) {
        if (this.f59944OooOO0) {
            return false;
        }
        return this.f59953OooOOoo >= this.f59951OooOOo || j < this.f59956OooOo00;
    }

    public final void OooOo(int i, boolean z, @Nullable o00000O o00000o, long j) throws IOException {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f59963OooOoo0.o0Oo0oo(z, i, o00000o, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f59960OooOoO0;
                        j3 = this.f59959OooOoO;
                        if (j2 >= j3) {
                            if (!this.f59940OooO0o.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f59963OooOoo0.f59935OooO0oO);
                j4 = iMin;
                this.f59960OooOoO0 += j4;
                Unit unit = Unit.INSTANCE;
            }
            j -= j4;
            this.f59963OooOoo0.o0Oo0oo(z && j == 0, i, o00000o, iMin);
        }
    }

    public final synchronized void OooOo0(long j) {
        long j2 = this.f59958OooOo0o + j;
        this.f59958OooOo0o = j2;
        long j3 = j2 - this.f59954OooOo;
        if (j3 >= this.f59955OooOo0.OooO00o() / 2) {
            Oooo00o(0, j3);
            this.f59954OooOo += j3;
        }
    }

    public final void OooOo00(@NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f59963OooOoo0) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f59944OooOO0) {
                    return;
                }
                this.f59944OooOO0 = true;
                int i = this.f59943OooO0oo;
                intRef.element = i;
                Unit unit = Unit.INSTANCE;
                this.f59963OooOoo0.OooO0oO(i, statusCode, o0O000o0.f57386OooO00o);
            }
        }
    }

    public final void OooOooO(int i, @NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f59946OooOO0o.OooO0OO(new OooO(this.f59942OooO0oO + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    public final void Oooo00o(int i, long j) {
        this.f59946OooOO0o.OooO0OO(new OooOO0(this.f59942OooO0oO + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO00o(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }
}
