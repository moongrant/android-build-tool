package p655o0ooo0O;

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
import p648o0ooOoo.oO000o00;
import p652o0ooo000.o0000;
import p652o0ooo000.o00000O;
import p652o0ooo000.o0000O00;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOo000 implements Closeable {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public static final oO0Oo0oo f59450OooOooo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f59451OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f59452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59453OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f59454OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f59455OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f59456OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f59457OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o0000O00 f59458OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o0000 f59459OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o0000 f59460OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o0000 f59461OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final oO0o0o f59462OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f59463OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f59464OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f59465OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f59466OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f59467OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final oO0Oo0oo f59468OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f59469OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public oO0Oo0oo f59470OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f59471OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f59472OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f59473OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Socket f59474OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59475OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final oO000O0O f59476OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f59477OooOooO;

    public static final class OooO extends o00000O {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f59478OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOo000 f59479OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f59480OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, o0OOo000 o0ooo001, int i, ErrorCode errorCode) {
            super(str, true);
            this.f59479OooO0o0 = o0ooo001;
            this.f59478OooO0o = i;
            this.f59480OooO0oO = errorCode;
        }

        @Override // p652o0ooo000.o00000O
        public final long OooO00o() {
            o0OOo000 o0ooo001 = this.f59479OooO0o0;
            try {
                int i = this.f59478OooO0o;
                ErrorCode statusCode = this.f59480OooO0oO;
                o0ooo001.getClass();
                Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                o0ooo001.f59476OooOoo0.OooOo00(i, statusCode);
                return -1L;
            } catch (IOException e) {
                o0ooo001.OooO0OO(e);
                return -1L;
            }
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f59481OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f59482OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o0000O00 f59483OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Socket f59484OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f59485OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o0O0o00O f59486OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0O0o0 f59487OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public OooO0O0 f59488OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public final oO0o0o f59489OooO0oo;

        public OooO00o(@NotNull o0000O00 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f59482OooO00o = true;
            this.f59483OooO0O0 = taskRunner;
            this.f59488OooO0oO = OooO0O0.f59490OooO00o;
            this.f59489OooO0oo = oO0OoOO0.f59568OooO00o;
        }
    }

    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final OooO00o f59490OooO00o = new OooO00o();

        public static final class OooO00o extends OooO0O0 {
            @Override // o0ooo0O.o0OOo000.OooO0O0
            public final void OooO0O0(@NotNull oO000O0 stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.OooO0OO(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public void OooO00o(@NotNull o0OOo000 connection, @NotNull oO0Oo0oo settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void OooO0O0(@NotNull oO000O0 oo000o0) throws IOException;
    }

    public final class OooO0OO implements oO000.OooO0OO, Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final oO000 f59491OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOo000 f59492OooO0o0;

        public OooO0OO(@NotNull o0OOo000 this$0, oO000 reader) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f59492OooO0o0 = this$0;
            this.f59491OooO0Oo = reader;
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO(int i, @NotNull ErrorCode errorCode, @NotNull ByteString debugData) {
            int i2;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.OooO0o0();
            o0OOo000 o0ooo001 = this.f59492OooO0o0;
            synchronized (o0ooo001) {
                i2 = 0;
                array = o0ooo001.f59453OooO0o.values().toArray(new oO000O0[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                o0ooo001.f59457OooOO0 = true;
                Unit unit = Unit.INSTANCE;
            }
            oO000O0[] oo000o0Arr = (oO000O0[]) array;
            int length = oo000o0Arr.length;
            while (i2 < length) {
                oO000O0 oo000o0 = oo000o0Arr[i2];
                i2++;
                if (oo000o0.f59533OooO00o > i && oo000o0.OooO0oo()) {
                    oo000o0.OooOO0O(ErrorCode.REFUSED_STREAM);
                    this.f59492OooO0o0.OooOo00(oo000o0.f59533OooO00o);
                }
            }
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO00o(int i, int i2, @NotNull o0O0o0 source, boolean z) throws IOException {
            boolean z2;
            boolean z3;
            long j;
            Intrinsics.checkNotNullParameter(source, "source");
            this.f59492OooO0o0.getClass();
            if (i != 0 && (i & 1) == 0) {
                o0OOo000 o0ooo001 = this.f59492OooO0o0;
                o0ooo001.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                oo0OOoo oo0oooo = new oo0OOoo();
                long j2 = i2;
                source.OoooOoO(j2);
                source.OooOO0O(oo0oooo, j2);
                o0ooo001.f59461OooOOO0.OooO0OO(new o(o0ooo001.f59455OooO0oO + '[' + i + "] onData", o0ooo001, i, oo0oooo, i2, z), 0L);
                return;
            }
            oO000O0 oo000o0OooO0oO = this.f59492OooO0o0.OooO0oO(i);
            if (oo000o0OooO0oO == null) {
                this.f59492OooO0o0.Oooo00o(i, ErrorCode.PROTOCOL_ERROR);
                long j3 = i2;
                this.f59492OooO0o0.OooOo(j3);
                source.skip(j3);
                return;
            }
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = oO000o00.f58124OooO00o;
            oO000O0.OooO0O0 oooO0O0 = oo000o0OooO0oO.f59532OooO;
            long j4 = i2;
            oooO0O0.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            while (j4 > 0) {
                synchronized (oooO0O0.f59550OooO) {
                    z2 = oooO0O0.f59553OooO0o0;
                    z3 = oooO0O0.f59554OooO0oO.f59828OooO0o0 + j4 > oooO0O0.f59551OooO0Oo;
                    Unit unit = Unit.INSTANCE;
                }
                if (z3) {
                    source.skip(j4);
                    oooO0O0.f59550OooO.OooO0o0(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    source.skip(j4);
                    break;
                }
                long jOooOO0O = source.OooOO0O(oooO0O0.f59552OooO0o, j4);
                if (jOooOO0O == -1) {
                    throw new EOFException();
                }
                j4 -= jOooOO0O;
                oO000O0 oo000o0 = oooO0O0.f59550OooO;
                synchronized (oo000o0) {
                    if (oooO0O0.f59555OooO0oo) {
                        oo0OOoo oo0oooo2 = oooO0O0.f59552OooO0o;
                        j = oo0oooo2.f59828OooO0o0;
                        oo0oooo2.OooO0oO();
                    } else {
                        oo0OOoo oo0oooo3 = oooO0O0.f59554OooO0oO;
                        boolean z4 = oo0oooo3.f59828OooO0o0 == 0;
                        oo0oooo3.o00Oo0(oooO0O0.f59552OooO0o);
                        if (z4) {
                            oo000o0.notifyAll();
                        }
                        j = 0;
                    }
                }
                if (j > 0) {
                    oooO0O0.OooO00o(j);
                }
            }
            if (z) {
                oo000o0OooO0oO.OooOO0(oO000o00.f58125OooO0O0, true);
            }
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO0O0(@NotNull oO0Oo0oo settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            o0OOo000 o0ooo001 = this.f59492OooO0o0;
            o0ooo001.f59459OooOO0o.OooO0OO(new ooo0Oo0(Intrinsics.stringPlus(o0ooo001.f59455OooO0oO, " applyAndAckSettings"), this, settings), 0L);
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO0OO() {
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO0Oo(@NotNull List requestHeaders, int i) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            o0OOo000 o0ooo001 = this.f59492OooO0o0;
            o0ooo001.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            synchronized (o0ooo001) {
                if (o0ooo001.f59477OooOooO.contains(Integer.valueOf(i))) {
                    o0ooo001.Oooo00o(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                o0ooo001.f59477OooOooO.add(Integer.valueOf(i));
                o0ooo001.f59461OooOOO0.OooO0OO(new oO00000o(o0ooo001.f59455OooO0oO + '[' + i + "] onRequest", o0ooo001, i, requestHeaders), 0L);
            }
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO0o(int i, @NotNull ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            o0OOo000 o0ooo001 = this.f59492OooO0o0;
            o0ooo001.getClass();
            if (!(i != 0 && (i & 1) == 0)) {
                oO000O0 oo000o0OooOo00 = o0ooo001.OooOo00(i);
                if (oo000o0OooOo00 == null) {
                    return;
                }
                oo000o0OooOo00.OooOO0O(errorCode);
                return;
            }
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            o0ooo001.f59461OooOOO0.OooO0OO(new oO0000O(o0ooo001.f59455OooO0oO + '[' + i + "] onReset", o0ooo001, i, errorCode), 0L);
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO0o0(int i, long j) {
            if (i == 0) {
                o0OOo000 o0ooo001 = this.f59492OooO0o0;
                synchronized (o0ooo001) {
                    o0ooo001.f59472OooOoO += j;
                    o0ooo001.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            oO000O0 oo000o0OooO0oO = this.f59492OooO0o0.OooO0oO(i);
            if (oo000o0OooO0oO != null) {
                synchronized (oo000o0OooO0oO) {
                    oo000o0OooO0oO.f59537OooO0o += j;
                    if (j > 0) {
                        oo000o0OooO0oO.notifyAll();
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO0oO(int i, @NotNull List requestHeaders, boolean z) {
            Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
            this.f59492OooO0o0.getClass();
            if (i != 0 && (i & 1) == 0) {
                o0OOo000 o0ooo001 = this.f59492OooO0o0;
                o0ooo001.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                o0ooo001.f59461OooOOO0.OooO0OO(new oO00000(o0ooo001.f59455OooO0oO + '[' + i + "] onHeaders", o0ooo001, i, requestHeaders, z), 0L);
                return;
            }
            o0OOo000 o0ooo002 = this.f59492OooO0o0;
            synchronized (o0ooo002) {
                oO000O0 oo000o0OooO0oO = o0ooo002.OooO0oO(i);
                if (oo000o0OooO0oO != null) {
                    Unit unit = Unit.INSTANCE;
                    oo000o0OooO0oO.OooOO0(oO000o00.OooOo0O(requestHeaders), z);
                    return;
                }
                if (o0ooo002.f59457OooOO0) {
                    return;
                }
                if (i <= o0ooo002.f59456OooO0oo) {
                    return;
                }
                if (i % 2 == o0ooo002.f59451OooO % 2) {
                    return;
                }
                oO000O0 oo000o0 = new oO000O0(i, o0ooo002, false, z, oO000o00.OooOo0O(requestHeaders));
                o0ooo002.f59456OooO0oo = i;
                o0ooo002.f59453OooO0o.put(Integer.valueOf(i), oo000o0);
                o0ooo002.f59458OooOO0O.OooO0o().OooO0OO(new oO0Oo(o0ooo002.f59455OooO0oO + '[' + i + "] onStream", o0ooo002, oo000o0), 0L);
            }
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void OooO0oo(int i, int i2, boolean z) {
            if (!z) {
                o0OOo000 o0ooo001 = this.f59492OooO0o0;
                o0ooo001.f59459OooOO0o.OooO0OO(new o0oo0000(Intrinsics.stringPlus(o0ooo001.f59455OooO0oO, " ping"), this.f59492OooO0o0, i, i2), 0L);
                return;
            }
            o0OOo000 o0ooo002 = this.f59492OooO0o0;
            synchronized (o0ooo002) {
                try {
                    if (i == 1) {
                        o0ooo002.f59465OooOOo0++;
                    } else if (i != 2) {
                        if (i == 3) {
                            o0ooo002.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        o0ooo002.f59466OooOOoo++;
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
            o0OOo000 o0ooo001 = this.f59492OooO0o0;
            oO000 oo000 = this.f59491OooO0Oo;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                oo000.OooO0OO(this);
                while (oo000.OooO00o(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        o0ooo001.OooO00o(errorCode, ErrorCode.CANCEL, null);
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        o0ooo001.OooO00o(errorCode3, errorCode3, e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o0ooo001.OooO00o(errorCode, errorCode2, e);
                    oO000o00.OooO0OO(oo000);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                errorCode = errorCode2;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                o0ooo001.OooO00o(errorCode, errorCode2, e);
                oO000o00.OooO0OO(oo000);
                throw th;
            }
            oO000o00.OooO0OO(oo000);
            return Unit.INSTANCE;
        }

        @Override // o0ooo0O.oO000.OooO0OO
        public final void priority() {
        }
    }

    public static final class OooO0o extends o00000O {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f59493OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOo000 f59494OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, o0OOo000 o0ooo001, long j) {
            super(str, true);
            this.f59494OooO0o0 = o0ooo001;
            this.f59493OooO0o = j;
        }

        @Override // p652o0ooo000.o00000O
        public final long OooO00o() {
            o0OOo000 o0ooo001;
            boolean z;
            synchronized (this.f59494OooO0o0) {
                o0ooo001 = this.f59494OooO0o0;
                long j = o0ooo001.f59465OooOOo0;
                long j2 = o0ooo001.f59463OooOOOo;
                if (j < j2) {
                    z = true;
                } else {
                    o0ooo001.f59463OooOOOo = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                o0ooo001.OooO0OO(null);
                return -1L;
            }
            try {
                o0ooo001.f59476OooOoo0.OooO0oo(1, 0, false);
            } catch (IOException e) {
                o0ooo001.OooO0OO(e);
            }
            return this.f59493OooO0o;
        }
    }

    public static final class OooOO0 extends o00000O {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f59495OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOo000 f59496OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f59497OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, o0OOo000 o0ooo001, int i, long j) {
            super(str, true);
            this.f59496OooO0o0 = o0ooo001;
            this.f59495OooO0o = i;
            this.f59497OooO0oO = j;
        }

        @Override // p652o0ooo000.o00000O
        public final long OooO00o() {
            o0OOo000 o0ooo001 = this.f59496OooO0o0;
            try {
                o0ooo001.f59476OooOoo0.OooO0o0(this.f59495OooO0o, this.f59497OooO0oO);
                return -1L;
            } catch (IOException e) {
                o0ooo001.OooO0OO(e);
                return -1L;
            }
        }
    }

    static {
        oO0Oo0oo oo0oo0oo = new oO0Oo0oo();
        oo0oo0oo.OooO0OO(7, 65535);
        oo0oo0oo.OooO0OO(5, 16384);
        f59450OooOooo = oo0oo0oo;
    }

    public o0OOo000(@NotNull OooO00o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z = builder.f59482OooO00o;
        this.f59452OooO0Oo = z;
        this.f59454OooO0o0 = builder.f59488OooO0oO;
        this.f59453OooO0o = new LinkedHashMap();
        String str = builder.f59485OooO0Oo;
        o0O0o0 o0o0o0 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f59455OooO0oO = str;
        this.f59451OooO = z ? 3 : 2;
        o0000O00 o0000o00 = builder.f59483OooO0O0;
        this.f59458OooOO0O = o0000o00;
        o0000 o0000VarOooO0o = o0000o00.OooO0o();
        this.f59459OooOO0o = o0000VarOooO0o;
        this.f59461OooOOO0 = o0000o00.OooO0o();
        this.f59460OooOOO = o0000o00.OooO0o();
        this.f59462OooOOOO = builder.f59489OooO0oo;
        oO0Oo0oo oo0oo0oo = new oO0Oo0oo();
        if (z) {
            oo0oo0oo.OooO0OO(7, 16777216);
        }
        this.f59468OooOo0 = oo0oo0oo;
        oO0Oo0oo oo0oo0oo2 = f59450OooOooo;
        this.f59470OooOo0O = oo0oo0oo2;
        this.f59472OooOoO = oo0oo0oo2.OooO00o();
        Socket socket = builder.f59484OooO0OO;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            socket = null;
        }
        this.f59474OooOoOO = socket;
        o0O0o00O o0o0o00o = builder.f59486OooO0o;
        if (o0o0o00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            o0o0o00o = null;
        }
        this.f59476OooOoo0 = new oO000O0O(o0o0o00o, z);
        o0O0o0 o0o0o1 = builder.f59487OooO0o0;
        if (o0o0o1 != null) {
            o0o0o0 = o0o0o1;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.f59475OooOoo = new OooO0OO(this, new oO000(o0o0o0, z));
        this.f59477OooOooO = new LinkedHashSet();
        int i = builder.f59481OooO;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            o0000VarOooO0o.OooO0OO(new OooO0o(Intrinsics.stringPlus(str, " ping"), this, nanos), nanos);
        }
    }

    public final void OooO00o(@NotNull ErrorCode connectionCode, @NotNull ErrorCode streamCode, @Nullable IOException iOException) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = oO000o00.f58124OooO00o;
        try {
            OooOo0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f59453OooO0o.isEmpty()) {
                array = this.f59453OooO0o.values().toArray(new oO000O0[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.f59453OooO0o.clear();
            } else {
                array = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        oO000O0[] oo000o0Arr = (oO000O0[]) array;
        if (oo000o0Arr != null) {
            for (oO000O0 oo000o0 : oo000o0Arr) {
                try {
                    oo000o0.OooO0OO(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f59476OooOoo0.close();
        } catch (IOException unused3) {
        }
        try {
            this.f59474OooOoOO.close();
        } catch (IOException unused4) {
        }
        this.f59459OooOO0o.OooO0o0();
        this.f59461OooOOO0.OooO0o0();
        this.f59460OooOOO.OooO0o0();
    }

    public final void OooO0OO(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        OooO00o(errorCode, errorCode, iOException);
    }

    @Nullable
    public final synchronized oO000O0 OooO0oO(int i) {
        return (oO000O0) this.f59453OooO0o.get(Integer.valueOf(i));
    }

    public final synchronized boolean OooOOo(long j) {
        if (this.f59457OooOO0) {
            return false;
        }
        return this.f59466OooOOoo >= this.f59464OooOOo || j < this.f59469OooOo00;
    }

    public final synchronized void OooOo(long j) {
        long j2 = this.f59471OooOo0o + j;
        this.f59471OooOo0o = j2;
        long j3 = j2 - this.f59467OooOo;
        if (j3 >= this.f59468OooOo0.OooO00o() / 2) {
            Oooo0(0, j3);
            this.f59467OooOo += j3;
        }
    }

    public final void OooOo0(@NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f59476OooOoo0) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f59457OooOO0) {
                    return;
                }
                this.f59457OooOO0 = true;
                int i = this.f59456OooO0oo;
                intRef.element = i;
                Unit unit = Unit.INSTANCE;
                this.f59476OooOoo0.OooO0oO(i, statusCode, oO000o00.f58124OooO00o);
            }
        }
    }

    @Nullable
    public final synchronized oO000O0 OooOo00(int i) {
        oO000O0 oo000o0;
        oo000o0 = (oO000O0) this.f59453OooO0o.remove(Integer.valueOf(i));
        notifyAll();
        return oo000o0;
    }

    public final void OooOooo(int i, boolean z, @Nullable oo0OOoo oo0oooo, long j) throws IOException {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f59476OooOoo0.o00000oO(z, i, oo0oooo, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f59473OooOoO0;
                        j3 = this.f59472OooOoO;
                        if (j2 >= j3) {
                            if (!this.f59453OooO0o.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f59476OooOoo0.f59562OooO0oO);
                j4 = iMin;
                this.f59473OooOoO0 += j4;
                Unit unit = Unit.INSTANCE;
            }
            j -= j4;
            this.f59476OooOoo0.o00000oO(z && j == 0, i, oo0oooo, iMin);
        }
    }

    public final void Oooo0(int i, long j) {
        this.f59459OooOO0o.OooO0OO(new OooOO0(this.f59455OooO0oO + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void Oooo00o(int i, @NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f59459OooOO0o.OooO0OO(new OooO(this.f59455OooO0oO + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO00o(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }
}
