package p102o000oo0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o000O0o;
import p659o0oooO00.o00;
import p659o0oooO00.o00000O0;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o000O00O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements Closeable, Flushable {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final Regex f35609OooOo00 = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<String, OooO0O0> f35610OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000OO00 f35611OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000OO00 f35612OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f35613OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000OO00 f35614OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o000OO00 f35615OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35616OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f35617OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f35618OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f35619OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o0000Ooo f35620OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f35621OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f35622OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f35623OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f35624OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f35625OooOOoo;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooO0O0 f35626OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f35627OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final boolean[] f35628OooO0OO;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f35626OooO00o = oooO0O0;
            OooOO0O.this.getClass();
            this.f35628OooO0OO = new boolean[2];
        }

        public final void OooO00o(boolean z) {
            OooOO0O oooOO0O = OooOO0O.this;
            synchronized (oooOO0O) {
                if (!(!this.f35627OooO0O0)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (Intrinsics.areEqual(this.f35626OooO00o.f35637OooO0oO, this)) {
                    OooOO0O.OooO00o(oooOO0O, this, z);
                }
                this.f35627OooO0O0 = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        @NotNull
        public final o000OO00 OooO0O0(int i) {
            o000OO00 o000oo01;
            OooOO0O oooOO0O = OooOO0O.this;
            synchronized (oooOO0O) {
                if (!(!this.f35627OooO0O0)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                this.f35628OooO0OO[i] = true;
                o000OO00 o000oo02 = this.f35626OooO00o.f35634OooO0Oo.get(i);
                OooOOO0 oooOOO0 = oooOO0O.f35625OooOOoo;
                o000OO00 file = o000oo02;
                if (!oooOOO0.OooO0o(file)) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    o000O0O0.OooO00o(oooOOO0.OooOO0O(file));
                }
                o000oo01 = o000oo02;
            }
            return o000oo01;
        }
    }

    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f35631OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final long[] f35632OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList<o000OO00> f35633OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ArrayList<o000OO00> f35634OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f35635OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f35636OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public OooO00o f35637OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f35638OooO0oo;

        public OooO0O0(String str) {
            this.f35631OooO00o = str;
            OooOO0O.this.getClass();
            this.f35632OooO0O0 = new long[2];
            OooOO0O.this.getClass();
            this.f35633OooO0OO = new ArrayList<>(2);
            OooOO0O.this.getClass();
            this.f35634OooO0Oo = new ArrayList<>(2);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            OooOO0O.this.getClass();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.f35633OooO0OO.add(OooOO0O.this.f35611OooO0Oo.OooO0OO(sb.toString()));
                sb.append(".tmp");
                this.f35634OooO0Oo.add(OooOO0O.this.f35611OooO0Oo.OooO0OO(sb.toString()));
                sb.setLength(length);
            }
        }

        @Nullable
        public final OooO0OO OooO00o() {
            if (!this.f35636OooO0o0 || this.f35637OooO0oO != null || this.f35635OooO0o) {
                return null;
            }
            ArrayList<o000OO00> arrayList = this.f35633OooO0OO;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                OooOO0O oooOO0O = OooOO0O.this;
                if (i >= size) {
                    this.f35638OooO0oo++;
                    return oooOO0O.new OooO0OO(this);
                }
                if (!oooOO0O.f35625OooOOoo.OooO0o(arrayList.get(i))) {
                    try {
                        oooOO0O.Oooo0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    public final class OooO0OO implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final OooO0O0 f35639OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f35641OooO0o0;

        public OooO0OO(OooO0O0 oooO0O0) {
            this.f35639OooO0Oo = oooO0O0;
        }

        @NotNull
        public final o000OO00 OooO00o(int i) {
            if (!this.f35641OooO0o0) {
                return this.f35639OooO0Oo.f35633OooO0OO.get(i);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f35641OooO0o0) {
                return;
            }
            this.f35641OooO0o0 = true;
            OooOO0O oooOO0O = OooOO0O.this;
            synchronized (oooOO0O) {
                OooO0O0 oooO0O0 = this.f35639OooO0Oo;
                int i = oooO0O0.f35638OooO0oo - 1;
                oooO0O0.f35638OooO0oo = i;
                if (i == 0 && oooO0O0.f35635OooO0o) {
                    Regex regex = OooOO0O.f35609OooOo00;
                    oooOO0O.Oooo0(oooO0O0);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @DebugMetadata(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooOO0O.this.new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            OooOO0O oooOO0O = OooOO0O.this;
            synchronized (oooOO0O) {
                try {
                    if (!oooOO0O.f35621OooOOOO || oooOO0O.f35622OooOOOo) {
                        return Unit.INSTANCE;
                    }
                    try {
                        oooOO0O.Oooo0O0();
                    } catch (IOException unused) {
                        oooOO0O.f35624OooOOo0 = true;
                    }
                    try {
                        if (oooOO0O.f35618OooOO0o >= 2000) {
                            oooOO0O.Oooo0o0();
                        }
                    } catch (IOException unused2) {
                        oooOO0O.f35623OooOOo = true;
                        oooOO0O.f35620OooOOO0 = o000O0Oo.OooO00o(new o00000O0());
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public OooOO0O(@NotNull o000O00O o000o00o2, @NotNull o000OO00 o000oo01, @NotNull CoroutineDispatcher coroutineDispatcher, long j) {
        this.f35611OooO0Oo = o000oo01;
        this.f35613OooO0o0 = j;
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f35612OooO0o = o000oo01.OooO0OO("journal");
        this.f35614OooO0oO = o000oo01.OooO0OO("journal.tmp");
        this.f35615OooO0oo = o000oo01.OooO0OO("journal.bkp");
        this.f35610OooO = new LinkedHashMap<>(0, 0.75f, true);
        this.f35616OooOO0 = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.f35625OooOOoo = new OooOOO0(o000o00o2);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0119 A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:15:0x002c, B:21:0x0038, B:23:0x0050, B:27:0x0072, B:29:0x0080, B:31:0x0087, B:24:0x0056, B:26:0x0066, B:35:0x00a7, B:37:0x00ae, B:40:0x00b3, B:42:0x00c4, B:45:0x00c9, B:50:0x0105, B:52:0x0110, B:56:0x0119, B:46:0x00e1, B:48:0x00f6, B:49:0x0102, B:34:0x0097, B:59:0x011e, B:60:0x0129), top: B:64:0x0001 }] */
    public static final void OooO00o(OooOO0O oooOO0O, OooO00o oooO00o, boolean z) {
        synchronized (oooOO0O) {
            OooO0O0 oooO0O0 = oooO00o.f35626OooO00o;
            if (!Intrinsics.areEqual(oooO0O0.f35637OooO0oO, oooO00o)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!z || oooO0O0.f35635OooO0o) {
                for (int i = 0; i < 2; i++) {
                    oooOO0O.f35625OooOOoo.OooO0o0(oooO0O0.f35634OooO0Oo.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (oooO00o.f35628OooO0OO[i2] && !oooOO0O.f35625OooOOoo.OooO0o(oooO0O0.f35634OooO0Oo.get(i2))) {
                        oooO00o.OooO00o(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    o000OO00 o000oo01 = oooO0O0.f35634OooO0Oo.get(i3);
                    o000OO00 o000oo02 = oooO0O0.f35633OooO0OO.get(i3);
                    if (oooOO0O.f35625OooOOoo.OooO0o(o000oo01)) {
                        oooOO0O.f35625OooOOoo.OooO0O0(o000oo01, o000oo02);
                    } else {
                        OooOOO0 oooOOO0 = oooOO0O.f35625OooOOoo;
                        o000OO00 file = oooO0O0.f35633OooO0OO.get(i3);
                        if (!oooOOO0.OooO0o(file)) {
                            Intrinsics.checkNotNullParameter(file, "file");
                            o000O0O0.OooO00o(oooOOO0.OooOO0O(file));
                        }
                    }
                    long j = oooO0O0.f35632OooO0O0[i3];
                    Long l = oooOO0O.f35625OooOOoo.OooO0oo(o000oo02).f60190OooO0Oo;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    oooO0O0.f35632OooO0O0[i3] = jLongValue;
                    oooOO0O.f35617OooOO0O = (oooOO0O.f35617OooOO0O - j) + jLongValue;
                }
            }
            oooO0O0.f35637OooO0oO = null;
            if (oooO0O0.f35635OooO0o) {
                oooOO0O.Oooo0(oooO0O0);
                return;
            }
            oooOO0O.f35618OooOO0o++;
            o0000Ooo o0000ooo = oooOO0O.f35620OooOOO0;
            Intrinsics.checkNotNull(o0000ooo);
            if (z || oooO0O0.f35636OooO0o0) {
                oooO0O0.f35636OooO0o0 = true;
                o0000ooo.OooOooo("CLEAN");
                o0000ooo.o00oO0o(32);
                o0000ooo.OooOooo(oooO0O0.f35631OooO00o);
                for (long j2 : oooO0O0.f35632OooO0O0) {
                    o0000ooo.o00oO0o(32).Ooooo00(j2);
                }
                o0000ooo.o00oO0o(10);
            } else {
                oooOO0O.f35610OooO.remove(oooO0O0.f35631OooO00o);
                o0000ooo.OooOooo("REMOVE");
                o0000ooo.o00oO0o(32);
                o0000ooo.OooOooo(oooO0O0.f35631OooO00o);
                o0000ooo.o00oO0o(10);
            }
            o0000ooo.flush();
            if (oooOO0O.f35617OooOO0O > oooOO0O.f35613OooO0o0) {
                oooOO0O.OooOo00();
            } else if (oooOO0O.f35618OooOO0o >= 2000) {
                oooOO0O.OooOo00();
            }
        }
    }

    public static void Oooo0OO(String str) {
        if (f35609OooOo00.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    public final void OooO0OO() {
        if (!(!this.f35622OooOOOo)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Nullable
    public final synchronized OooO00o OooO0oO(@NotNull String str) {
        OooO0OO();
        Oooo0OO(str);
        OooOOo();
        OooO0O0 oooO0O0 = this.f35610OooO.get(str);
        if ((oooO0O0 != null ? oooO0O0.f35637OooO0oO : null) != null) {
            return null;
        }
        if (oooO0O0 != null && oooO0O0.f35638OooO0oo != 0) {
            return null;
        }
        if (!this.f35624OooOOo0 && !this.f35623OooOOo) {
            o0000Ooo o0000ooo = this.f35620OooOOO0;
            Intrinsics.checkNotNull(o0000ooo);
            o0000ooo.OooOooo("DIRTY");
            o0000ooo.o00oO0o(32);
            o0000ooo.OooOooo(str);
            o0000ooo.o00oO0o(10);
            o0000ooo.flush();
            if (this.f35619OooOOO) {
                return null;
            }
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0(str);
                this.f35610OooO.put(str, oooO0O0);
            }
            OooO00o oooO00o = new OooO00o(oooO0O0);
            oooO0O0.f35637OooO0oO = oooO00o;
            return oooO00o;
        }
        OooOo00();
        return null;
    }

    public final synchronized void OooOOo() {
        if (this.f35621OooOOOO) {
            return;
        }
        this.f35625OooOOoo.OooO0o0(this.f35614OooO0oO);
        if (this.f35625OooOOoo.OooO0o(this.f35615OooO0oo)) {
            if (this.f35625OooOOoo.OooO0o(this.f35612OooO0o)) {
                this.f35625OooOOoo.OooO0o0(this.f35615OooO0oo);
            } else {
                this.f35625OooOOoo.OooO0O0(this.f35615OooO0oo, this.f35612OooO0o);
            }
        }
        if (this.f35625OooOOoo.OooO0o(this.f35612OooO0o)) {
            try {
                OooOooO();
                OooOo();
                this.f35621OooOOOO = true;
                return;
            } catch (IOException unused) {
                try {
                    close();
                    o000O0o.OooO00o(this.f35625OooOOoo, this.f35611OooO0Oo);
                    this.f35622OooOOOo = false;
                    Oooo0o0();
                    this.f35621OooOOOO = true;
                } catch (Throwable th) {
                    this.f35622OooOOOo = false;
                    throw th;
                }
            }
        }
        Oooo0o0();
        this.f35621OooOOOO = true;
    }

    @Nullable
    public final synchronized OooO0OO OooOOo0(@NotNull String str) {
        OooO0OO oooO0OOOooO00o;
        OooO0OO();
        Oooo0OO(str);
        OooOOo();
        OooO0O0 oooO0O0 = this.f35610OooO.get(str);
        if (oooO0O0 != null && (oooO0OOOooO00o = oooO0O0.OooO00o()) != null) {
            boolean z = true;
            this.f35618OooOO0o++;
            o0000Ooo o0000ooo = this.f35620OooOOO0;
            Intrinsics.checkNotNull(o0000ooo);
            o0000ooo.OooOooo("READ");
            o0000ooo.o00oO0o(32);
            o0000ooo.OooOooo(str);
            o0000ooo.o00oO0o(10);
            if (this.f35618OooOO0o < 2000) {
                z = false;
            }
            if (z) {
                OooOo00();
            }
            return oooO0OOOooO00o;
        }
        return null;
    }

    public final void OooOo() throws IOException {
        Iterator<OooO0O0> it = this.f35610OooO.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            OooO0O0 next = it.next();
            int i = 0;
            if (next.f35637OooO0oO == null) {
                while (i < 2) {
                    j += next.f35632OooO0O0[i];
                    i++;
                }
            } else {
                next.f35637OooO0oO = null;
                while (i < 2) {
                    o000OO00 o000oo01 = next.f35633OooO0OO.get(i);
                    OooOOO0 oooOOO0 = this.f35625OooOOoo;
                    oooOOO0.OooO0o0(o000oo01);
                    oooOOO0.OooO0o0(next.f35634OooO0Oo.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f35617OooOO0O = j;
    }

    public final o00 OooOo0() {
        OooOOO0 oooOOO0 = this.f35625OooOOoo;
        oooOOO0.getClass();
        o000OO00 file = this.f35612OooO0o;
        Intrinsics.checkNotNullParameter(file, "file");
        return o000O0Oo.OooO00o(new OooOOOO(oooOOO0.OooO00o(file), new OooOOO(this)));
    }

    public final void OooOo00() {
        BuildersKt__Builders_commonKt.launch$default(this.f35616OooOO0, null, null, new OooO0o(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    public final void OooOooO() throws Throwable {
        Unit unit;
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(this.f35625OooOOoo.OooOO0o(this.f35612OooO0o));
        Throwable th = null;
        try {
            String strOoooO0 = o00o0000OooO0O0.OoooO0();
            String strOoooO1 = o00o0000OooO0O0.OoooO0();
            String strOoooO2 = o00o0000OooO0O0.OoooO0();
            String strOoooO3 = o00o0000OooO0O0.OoooO0();
            String strOoooO4 = o00o0000OooO0O0.OoooO0();
            if (Intrinsics.areEqual("libcore.io.DiskLruCache", strOoooO0) && Intrinsics.areEqual("1", strOoooO1)) {
                if (Intrinsics.areEqual(String.valueOf(1), strOoooO2) && Intrinsics.areEqual(String.valueOf(2), strOoooO3)) {
                    int i = 0;
                    if (!(strOoooO4.length() > 0)) {
                        while (true) {
                            try {
                                Oooo00o(o00o0000OooO0O0.OoooO0());
                                i++;
                            } catch (EOFException unused) {
                                this.f35618OooOO0o = i - this.f35610OooO.size();
                                if (o00o0000OooO0O0.oo000o()) {
                                    this.f35620OooOOO0 = OooOo0();
                                } else {
                                    Oooo0o0();
                                }
                                unit = Unit.INSTANCE;
                                try {
                                    o00o0000OooO0O0.close();
                                } catch (Throwable th2) {
                                    if (th == null) {
                                        th = th2;
                                    } else {
                                        ExceptionsKt.addSuppressed(th, th2);
                                    }
                                }
                                if (th == null) {
                                    throw th;
                                }
                                Intrinsics.checkNotNull(unit);
                            }
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strOoooO0 + ", " + strOoooO1 + ", " + strOoooO2 + ", " + strOoooO3 + ", " + strOoooO4 + ']');
        } catch (Throwable th3) {
            th = th3;
            unit = null;
            o00o0000OooO0O0.close();
            if (th == null) {
                throw th;
            }
            Intrinsics.checkNotNull(unit);
        }
    }

    public final void Oooo0(OooO0O0 oooO0O0) throws IOException {
        o0000Ooo o0000ooo;
        int i = oooO0O0.f35638OooO0oo;
        String str = oooO0O0.f35631OooO00o;
        if (i > 0 && (o0000ooo = this.f35620OooOOO0) != null) {
            o0000ooo.OooOooo("DIRTY");
            o0000ooo.o00oO0o(32);
            o0000ooo.OooOooo(str);
            o0000ooo.o00oO0o(10);
            o0000ooo.flush();
        }
        if (oooO0O0.f35638OooO0oo > 0 || oooO0O0.f35637OooO0oO != null) {
            oooO0O0.f35635OooO0o = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f35625OooOOoo.OooO0o0(oooO0O0.f35633OooO0OO.get(i2));
            long j = this.f35617OooOO0O;
            long[] jArr = oooO0O0.f35632OooO0O0;
            this.f35617OooOO0O = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f35618OooOO0o++;
        o0000Ooo o0000ooo2 = this.f35620OooOOO0;
        if (o0000ooo2 != null) {
            o0000ooo2.OooOooo("REMOVE");
            o0000ooo2.o00oO0o(32);
            o0000ooo2.OooOooo(str);
            o0000ooo2.o00oO0o(10);
        }
        this.f35610OooO.remove(str);
        if (this.f35618OooOO0o >= 2000) {
            OooOo00();
        }
    }

    public final void Oooo00o(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException(o00O00OO.OooO00o("unexpected journal line: ", str));
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
        LinkedHashMap<String, OooO0O0> linkedHashMap = this.f35610OooO;
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iIndexOf$default == 6 && StringsKt.Oooo00o(str, "REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        OooO0O0 oooO0O0 = linkedHashMap.get(strSubstring);
        if (oooO0O0 == null) {
            oooO0O0 = new OooO0O0(strSubstring);
            linkedHashMap.put(strSubstring, oooO0O0);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        if (iIndexOf$default2 == -1 || iIndexOf$default != 5 || !StringsKt.Oooo00o(str, "CLEAN")) {
            if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt.Oooo00o(str, "DIRTY")) {
                oooO0O1.f35637OooO0oO = new OooO00o(oooO0O1);
                return;
            } else {
                if (iIndexOf$default2 != -1 || iIndexOf$default != 4 || !StringsKt.Oooo00o(str, "READ")) {
                    throw new IOException(o00O00OO.OooO00o("unexpected journal line: ", str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iIndexOf$default2 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        List listSplit$default = StringsKt__StringsKt.split$default(strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
        oooO0O1.f35636OooO0o0 = true;
        oooO0O1.f35637OooO0oO = null;
        int size = listSplit$default.size();
        OooOO0O.this.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listSplit$default);
        }
        try {
            int size2 = listSplit$default.size();
            for (int i2 = 0; i2 < size2; i2++) {
                oooO0O1.f35632OooO0O0[i2] = Long.parseLong((String) listSplit$default.get(i2));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listSplit$default);
        }
    }

    public final void Oooo0O0() throws IOException {
        boolean z;
        do {
            z = false;
            if (this.f35617OooOO0O <= this.f35613OooO0o0) {
                this.f35624OooOOo0 = false;
                return;
            }
            for (OooO0O0 oooO0O0 : this.f35610OooO.values()) {
                if (!oooO0O0.f35635OooO0o) {
                    Oooo0(oooO0O0);
                    z = true;
                    break;
                }
            }
        } while (z);
    }

    public final synchronized void Oooo0o0() {
        Unit unit;
        o0000Ooo o0000ooo = this.f35620OooOOO0;
        if (o0000ooo != null) {
            o0000ooo.close();
        }
        o00 o00VarOooO00o = o000O0Oo.OooO00o(this.f35625OooOOoo.OooOO0O(this.f35614OooO0oO));
        Throwable th = null;
        try {
            o00VarOooO00o.OooOooo("libcore.io.DiskLruCache");
            o00VarOooO00o.o00oO0o(10);
            o00VarOooO00o.OooOooo("1");
            o00VarOooO00o.o00oO0o(10);
            o00VarOooO00o.Ooooo00(1).o00oO0o(10);
            o00VarOooO00o.Ooooo00(2).o00oO0o(10);
            o00VarOooO00o.o00oO0o(10);
            for (OooO0O0 oooO0O0 : this.f35610OooO.values()) {
                if (oooO0O0.f35637OooO0oO != null) {
                    o00VarOooO00o.OooOooo("DIRTY");
                    o00VarOooO00o.o00oO0o(32);
                    o00VarOooO00o.OooOooo(oooO0O0.f35631OooO00o);
                    o00VarOooO00o.o00oO0o(10);
                } else {
                    o00VarOooO00o.OooOooo("CLEAN");
                    o00VarOooO00o.o00oO0o(32);
                    o00VarOooO00o.OooOooo(oooO0O0.f35631OooO00o);
                    for (long j : oooO0O0.f35632OooO0O0) {
                        o00VarOooO00o.o00oO0o(32);
                        o00VarOooO00o.Ooooo00(j);
                    }
                    o00VarOooO00o.o00oO0o(10);
                }
            }
            unit = Unit.INSTANCE;
        } catch (Throwable th2) {
            unit = null;
            th = th2;
        }
        try {
            o00VarOooO00o.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            } else {
                ExceptionsKt.addSuppressed(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(unit);
        if (this.f35625OooOOoo.OooO0o(this.f35612OooO0o)) {
            this.f35625OooOOoo.OooO0O0(this.f35612OooO0o, this.f35615OooO0oo);
            this.f35625OooOOoo.OooO0O0(this.f35614OooO0oO, this.f35612OooO0o);
            this.f35625OooOOoo.OooO0o0(this.f35615OooO0oo);
        } else {
            this.f35625OooOOoo.OooO0O0(this.f35614OooO0oO, this.f35612OooO0o);
        }
        this.f35620OooOOO0 = OooOo0();
        this.f35618OooOO0o = 0;
        this.f35619OooOOO = false;
        this.f35623OooOOo = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f35621OooOOOO && !this.f35622OooOOOo) {
            Object[] array = this.f35610OooO.values().toArray(new OooO0O0[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (OooO0O0 oooO0O0 : (OooO0O0[]) array) {
                OooO00o oooO00o = oooO0O0.f35637OooO0oO;
                if (oooO00o != null) {
                    OooO0O0 oooO0O1 = oooO00o.f35626OooO00o;
                    if (Intrinsics.areEqual(oooO0O1.f35637OooO0oO, oooO00o)) {
                        oooO0O1.f35635OooO0o = true;
                    }
                }
            }
            Oooo0O0();
            CoroutineScopeKt.cancel$default(this.f35616OooOO0, null, 1, null);
            o0000Ooo o0000ooo = this.f35620OooOOO0;
            Intrinsics.checkNotNull(o0000ooo);
            o0000ooo.close();
            this.f35620OooOOO0 = null;
            this.f35622OooOOOo = true;
            return;
        }
        this.f35622OooOOOo = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f35621OooOOOO) {
            OooO0OO();
            Oooo0O0();
            o0000Ooo o0000ooo = this.f35620OooOOO0;
            Intrinsics.checkNotNull(o0000ooo);
            o0000ooo.flush();
        }
    }
}
