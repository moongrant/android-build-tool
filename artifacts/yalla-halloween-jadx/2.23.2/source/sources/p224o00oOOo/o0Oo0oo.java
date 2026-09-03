package p224o00oOOo;

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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p662o0oooO0O.o0O0OOOo;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO0o00;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements Closeable, Flushable {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final Regex f39676OooOo00 = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<String, OooO0O0> f39677OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OOOO00 f39678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0OOOO00 f39679OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39680OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0OOOO00 f39681OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o0OOOO00 f39682OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f39683OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f39684OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f39685OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f39686OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o0O0o00O f39687OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f39688OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f39689OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f39690OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f39691OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o0OO00O f39692OooOOoo;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooO0O0 f39693OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f39694OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final boolean[] f39695OooO0OO;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f39693OooO00o = oooO0O0;
            o0Oo0oo.this.getClass();
            this.f39695OooO0OO = new boolean[2];
        }

        public final void OooO00o(boolean z) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            synchronized (o0oo0oo2) {
                if (!(!this.f39694OooO0O0)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (Intrinsics.areEqual(this.f39693OooO00o.f39704OooO0oO, this)) {
                    o0Oo0oo.OooO00o(o0oo0oo2, this, z);
                }
                this.f39694OooO0O0 = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        @NotNull
        public final o0OOOO00 OooO0O0(int i) {
            o0OOOO00 o0oooo01;
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            synchronized (o0oo0oo2) {
                if (!(!this.f39694OooO0O0)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                this.f39695OooO0OO[i] = true;
                o0OOOO00 o0oooo02 = this.f39693OooO00o.f39701OooO0Oo.get(i);
                o0OO00O o0oo00o2 = o0oo0oo2.f39692OooOOoo;
                o0OOOO00 file = o0oooo02;
                if (!o0oo00o2.OooO0o(file)) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    OooOo00.OooO00o(o0oo00o2.OooOO0O(file));
                }
                o0oooo01 = o0oooo02;
            }
            return o0oooo01;
        }
    }

    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f39698OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final long[] f39699OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList<o0OOOO00> f39700OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ArrayList<o0OOOO00> f39701OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f39702OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f39703OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public OooO00o f39704OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f39705OooO0oo;

        public OooO0O0(String str) {
            this.f39698OooO00o = str;
            o0Oo0oo.this.getClass();
            this.f39699OooO0O0 = new long[2];
            o0Oo0oo.this.getClass();
            this.f39700OooO0OO = new ArrayList<>(2);
            o0Oo0oo.this.getClass();
            this.f39701OooO0Oo = new ArrayList<>(2);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            o0Oo0oo.this.getClass();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.f39700OooO0OO.add(o0Oo0oo.this.f39678OooO0Oo.OooO0OO(sb.toString()));
                sb.append(".tmp");
                this.f39701OooO0Oo.add(o0Oo0oo.this.f39678OooO0Oo.OooO0OO(sb.toString()));
                sb.setLength(length);
            }
        }

        @Nullable
        public final OooO0OO OooO00o() {
            if (!this.f39703OooO0o0 || this.f39704OooO0oO != null || this.f39702OooO0o) {
                return null;
            }
            ArrayList<o0OOOO00> arrayList = this.f39700OooO0OO;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
                if (i >= size) {
                    this.f39705OooO0oo++;
                    return o0oo0oo2.new OooO0OO(this);
                }
                if (!o0oo0oo2.f39692OooOOoo.OooO0o(arrayList.get(i))) {
                    try {
                        o0oo0oo2.Oooo0O0(this);
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
        public final OooO0O0 f39706OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f39708OooO0o0;

        public OooO0OO(OooO0O0 oooO0O0) {
            this.f39706OooO0Oo = oooO0O0;
        }

        @NotNull
        public final o0OOOO00 OooO00o(int i) {
            if (!this.f39708OooO0o0) {
                return this.f39706OooO0Oo.f39700OooO0OO.get(i);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f39708OooO0o0) {
                return;
            }
            this.f39708OooO0o0 = true;
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            synchronized (o0oo0oo2) {
                OooO0O0 oooO0O0 = this.f39706OooO0Oo;
                int i = oooO0O0.f39705OooO0oo - 1;
                oooO0O0.f39705OooO0oo = i;
                if (i == 0 && oooO0O0.f39702OooO0o) {
                    Regex regex = o0Oo0oo.f39676OooOo00;
                    o0oo0oo2.Oooo0O0(oooO0O0);
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
            return o0Oo0oo.this.new OooO0o(continuation);
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
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            synchronized (o0oo0oo2) {
                if (!o0oo0oo2.f39688OooOOOO || o0oo0oo2.f39689OooOOOo) {
                    return Unit.INSTANCE;
                }
                try {
                    o0oo0oo2.Oooo0OO();
                } catch (IOException unused) {
                    o0oo0oo2.f39691OooOOo0 = true;
                }
                try {
                    if (o0oo0oo2.f39685OooOO0o >= 2000) {
                        o0oo0oo2.Oooo0oO();
                    }
                } catch (IOException unused2) {
                    o0oo0oo2.f39690OooOOo = true;
                    o0oo0oo2.f39687OooOOO0 = o0OO.OooO00o(new o0O0OOOo());
                }
                return Unit.INSTANCE;
            }
        }
    }

    public o0Oo0oo(@NotNull o0OO0o00 o0oo0o01, @NotNull o0OOOO00 o0oooo01, @NotNull CoroutineDispatcher coroutineDispatcher, long j) {
        this.f39678OooO0Oo = o0oooo01;
        this.f39680OooO0o0 = j;
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f39679OooO0o = o0oooo01.OooO0OO("journal");
        this.f39681OooO0oO = o0oooo01.OooO0OO("journal.tmp");
        this.f39682OooO0oo = o0oooo01.OooO0OO("journal.bkp");
        this.f39677OooO = new LinkedHashMap<>(0, 0.75f, true);
        this.f39683OooOO0 = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.f39692OooOOoo = new o0OO00O(o0oo0o01);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0119 A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:15:0x002c, B:21:0x0038, B:23:0x0050, B:27:0x0072, B:29:0x0080, B:31:0x0087, B:24:0x0056, B:26:0x0066, B:35:0x00a7, B:37:0x00ae, B:40:0x00b3, B:42:0x00c4, B:45:0x00c9, B:50:0x0105, B:52:0x0110, B:56:0x0119, B:46:0x00e1, B:48:0x00f6, B:49:0x0102, B:34:0x0097, B:59:0x011e, B:60:0x0129), top: B:64:0x0001 }] */
    public static final void OooO00o(o0Oo0oo o0oo0oo2, OooO00o oooO00o, boolean z) {
        synchronized (o0oo0oo2) {
            OooO0O0 oooO0O0 = oooO00o.f39693OooO00o;
            if (!Intrinsics.areEqual(oooO0O0.f39704OooO0oO, oooO00o)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!z || oooO0O0.f39702OooO0o) {
                for (int i = 0; i < 2; i++) {
                    o0oo0oo2.f39692OooOOoo.OooO0o0(oooO0O0.f39701OooO0Oo.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (oooO00o.f39695OooO0OO[i2] && !o0oo0oo2.f39692OooOOoo.OooO0o(oooO0O0.f39701OooO0Oo.get(i2))) {
                        oooO00o.OooO00o(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    o0OOOO00 o0oooo01 = oooO0O0.f39701OooO0Oo.get(i3);
                    o0OOOO00 o0oooo02 = oooO0O0.f39700OooO0OO.get(i3);
                    if (o0oo0oo2.f39692OooOOoo.OooO0o(o0oooo01)) {
                        o0oo0oo2.f39692OooOOoo.OooO0O0(o0oooo01, o0oooo02);
                    } else {
                        o0OO00O o0oo00o2 = o0oo0oo2.f39692OooOOoo;
                        o0OOOO00 file = oooO0O0.f39700OooO0OO.get(i3);
                        if (!o0oo00o2.OooO0o(file)) {
                            Intrinsics.checkNotNullParameter(file, "file");
                            OooOo00.OooO00o(o0oo00o2.OooOO0O(file));
                        }
                    }
                    long j = oooO0O0.f39699OooO0O0[i3];
                    Long l = o0oo0oo2.f39692OooOOoo.OooO0oo(o0oooo02).f59746OooO0Oo;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    oooO0O0.f39699OooO0O0[i3] = jLongValue;
                    o0oo0oo2.f39684OooOO0O = (o0oo0oo2.f39684OooOO0O - j) + jLongValue;
                }
            }
            oooO0O0.f39704OooO0oO = null;
            if (oooO0O0.f39702OooO0o) {
                o0oo0oo2.Oooo0O0(oooO0O0);
                return;
            }
            o0oo0oo2.f39685OooOO0o++;
            o0O0o00O o0o0o00o = o0oo0oo2.f39687OooOOO0;
            Intrinsics.checkNotNull(o0o0o00o);
            if (z || oooO0O0.f39703OooO0o0) {
                oooO0O0.f39703OooO0o0 = true;
                o0o0o00o.Oooo000("CLEAN");
                o0o0o00o.o0ooOO0(32);
                o0o0o00o.Oooo000(oooO0O0.f39698OooO00o);
                for (long j2 : oooO0O0.f39699OooO0O0) {
                    o0o0o00o.o0ooOO0(32).Ooooo00(j2);
                }
                o0o0o00o.o0ooOO0(10);
            } else {
                o0oo0oo2.f39677OooO.remove(oooO0O0.f39698OooO00o);
                o0o0o00o.Oooo000("REMOVE");
                o0o0o00o.o0ooOO0(32);
                o0o0o00o.Oooo000(oooO0O0.f39698OooO00o);
                o0o0o00o.o0ooOO0(10);
            }
            o0o0o00o.flush();
            if (o0oo0oo2.f39684OooOO0O > o0oo0oo2.f39680OooO0o0) {
                o0oo0oo2.OooOo0();
            } else if (o0oo0oo2.f39685OooOO0o >= 2000) {
                o0oo0oo2.OooOo0();
            }
        }
    }

    public static void Oooo0o0(String str) {
        if (f39676OooOo00.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    public final void OooO0OO() {
        if (!(!this.f39689OooOOOo)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Nullable
    public final synchronized OooO00o OooO0oO(@NotNull String str) {
        OooO0OO();
        Oooo0o0(str);
        OooOo00();
        OooO0O0 oooO0O0 = this.f39677OooO.get(str);
        if ((oooO0O0 != null ? oooO0O0.f39704OooO0oO : null) != null) {
            return null;
        }
        if (oooO0O0 != null && oooO0O0.f39705OooO0oo != 0) {
            return null;
        }
        if (!this.f39691OooOOo0 && !this.f39690OooOOo) {
            o0O0o00O o0o0o00o = this.f39687OooOOO0;
            Intrinsics.checkNotNull(o0o0o00o);
            o0o0o00o.Oooo000("DIRTY");
            o0o0o00o.o0ooOO0(32);
            o0o0o00o.Oooo000(str);
            o0o0o00o.o0ooOO0(10);
            o0o0o00o.flush();
            if (this.f39686OooOOO) {
                return null;
            }
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0(str);
                this.f39677OooO.put(str, oooO0O0);
            }
            OooO00o oooO00o = new OooO00o(oooO0O0);
            oooO0O0.f39704OooO0oO = oooO00o;
            return oooO00o;
        }
        OooOo0();
        return null;
    }

    @Nullable
    public final synchronized OooO0OO OooOOo(@NotNull String str) {
        OooO0OO oooO0OOOooO00o;
        OooO0OO();
        Oooo0o0(str);
        OooOo00();
        OooO0O0 oooO0O0 = this.f39677OooO.get(str);
        if (oooO0O0 != null && (oooO0OOOooO00o = oooO0O0.OooO00o()) != null) {
            boolean z = true;
            this.f39685OooOO0o++;
            o0O0o00O o0o0o00o = this.f39687OooOOO0;
            Intrinsics.checkNotNull(o0o0o00o);
            o0o0o00o.Oooo000("READ");
            o0o0o00o.o0ooOO0(32);
            o0o0o00o.Oooo000(str);
            o0o0o00o.o0ooOO0(10);
            if (this.f39685OooOO0o < 2000) {
                z = false;
            }
            if (z) {
                OooOo0();
            }
            return oooO0OOOooO00o;
        }
        return null;
    }

    public final o0OOo000 OooOo() {
        o0OO00O o0oo00o2 = this.f39692OooOOoo;
        o0oo00o2.getClass();
        o0OOOO00 file = this.f39679OooO0o;
        Intrinsics.checkNotNullParameter(file, "file");
        return o0OO.OooO00o(new o0O0O00(o0oo00o2.OooO00o(file), new oo0o0Oo(this)));
    }

    public final void OooOo0() {
        BuildersKt__Builders_commonKt.launch$default(this.f39683OooOO0, null, null, new OooO0o(null), 3, null);
    }

    public final synchronized void OooOo00() {
        if (this.f39688OooOOOO) {
            return;
        }
        this.f39692OooOOoo.OooO0o0(this.f39681OooO0oO);
        if (this.f39692OooOOoo.OooO0o(this.f39682OooO0oo)) {
            if (this.f39692OooOOoo.OooO0o(this.f39679OooO0o)) {
                this.f39692OooOOoo.OooO0o0(this.f39682OooO0oo);
            } else {
                this.f39692OooOOoo.OooO0O0(this.f39682OooO0oo, this.f39679OooO0o);
            }
        }
        if (this.f39692OooOOoo.OooO0o(this.f39679OooO0o)) {
            try {
                Oooo00o();
                OooOooo();
                this.f39688OooOOOO = true;
                return;
            } catch (IOException unused) {
                try {
                    close();
                    o00OO00O.OooO0o.OooO00o(this.f39692OooOOoo, this.f39678OooO0Oo);
                    this.f39689OooOOOo = false;
                    Oooo0oO();
                    this.f39688OooOOOO = true;
                } catch (Throwable th) {
                    this.f39689OooOOOo = false;
                    throw th;
                }
            }
        }
        Oooo0oO();
        this.f39688OooOOOO = true;
    }

    public final void OooOooo() throws IOException {
        Iterator<OooO0O0> it = this.f39677OooO.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            OooO0O0 next = it.next();
            int i = 0;
            if (next.f39704OooO0oO == null) {
                while (i < 2) {
                    j += next.f39699OooO0O0[i];
                    i++;
                }
            } else {
                next.f39704OooO0oO = null;
                while (i < 2) {
                    o0OOOO00 o0oooo01 = next.f39700OooO0OO.get(i);
                    o0OO00O o0oo00o2 = this.f39692OooOOoo;
                    o0oo00o2.OooO0o0(o0oooo01);
                    o0oo00o2.OooO0o0(next.f39701OooO0Oo.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f39684OooOO0O = j;
    }

    public final void Oooo0(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException(o00O00OO.OooO00o("unexpected journal line: ", str));
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
        LinkedHashMap<String, OooO0O0> linkedHashMap = this.f39677OooO;
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iIndexOf$default == 6 && StringsKt__StringsJVMKt.startsWith$default(str, "REMOVE", false, 2, null)) {
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
        if (iIndexOf$default2 == -1 || iIndexOf$default != 5 || !StringsKt__StringsJVMKt.startsWith$default(str, "CLEAN", false, 2, null)) {
            if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt__StringsJVMKt.startsWith$default(str, "DIRTY", false, 2, null)) {
                oooO0O1.f39704OooO0oO = new OooO00o(oooO0O1);
                return;
            } else {
                if (iIndexOf$default2 != -1 || iIndexOf$default != 4 || !StringsKt__StringsJVMKt.startsWith$default(str, "READ", false, 2, null)) {
                    throw new IOException(o00O00OO.OooO00o("unexpected journal line: ", str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iIndexOf$default2 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        List listSplit$default = StringsKt__StringsKt.split$default(strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
        oooO0O1.f39703OooO0o0 = true;
        oooO0O1.f39704OooO0oO = null;
        int size = listSplit$default.size();
        o0Oo0oo.this.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listSplit$default);
        }
        try {
            int size2 = listSplit$default.size();
            for (int i2 = 0; i2 < size2; i2++) {
                oooO0O1.f39699OooO0O0[i2] = Long.parseLong((String) listSplit$default.get(i2));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listSplit$default);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    public final void Oooo00o() throws Throwable {
        Unit unit;
        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(this.f39692OooOOoo.OooOO0o(this.f39679OooO0o));
        Throwable th = null;
        try {
            String strOoooO0O = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O2 = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O3 = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O4 = o0o0000VarOooO0O0.OoooO0O();
            String strOoooO0O5 = o0o0000VarOooO0O0.OoooO0O();
            if (Intrinsics.areEqual("libcore.io.DiskLruCache", strOoooO0O) && Intrinsics.areEqual("1", strOoooO0O2)) {
                if (Intrinsics.areEqual(String.valueOf(1), strOoooO0O3) && Intrinsics.areEqual(String.valueOf(2), strOoooO0O4)) {
                    int i = 0;
                    if (!(strOoooO0O5.length() > 0)) {
                        while (true) {
                            try {
                                Oooo0(o0o0000VarOooO0O0.OoooO0O());
                                i++;
                            } catch (EOFException unused) {
                                this.f39685OooOO0o = i - this.f39677OooO.size();
                                if (o0o0000VarOooO0O0.o00oO0O()) {
                                    this.f39687OooOOO0 = OooOo();
                                } else {
                                    Oooo0oO();
                                }
                                unit = Unit.INSTANCE;
                                try {
                                    o0o0000VarOooO0O0.close();
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
            throw new IOException("unexpected journal header: [" + strOoooO0O + ", " + strOoooO0O2 + ", " + strOoooO0O3 + ", " + strOoooO0O4 + ", " + strOoooO0O5 + ']');
        } catch (Throwable th3) {
            th = th3;
            unit = null;
            o0o0000VarOooO0O0.close();
            if (th == null) {
                throw th;
            }
            Intrinsics.checkNotNull(unit);
        }
    }

    public final void Oooo0O0(OooO0O0 oooO0O0) throws IOException {
        o0O0o00O o0o0o00o;
        int i = oooO0O0.f39705OooO0oo;
        String str = oooO0O0.f39698OooO00o;
        if (i > 0 && (o0o0o00o = this.f39687OooOOO0) != null) {
            o0o0o00o.Oooo000("DIRTY");
            o0o0o00o.o0ooOO0(32);
            o0o0o00o.Oooo000(str);
            o0o0o00o.o0ooOO0(10);
            o0o0o00o.flush();
        }
        if (oooO0O0.f39705OooO0oo > 0 || oooO0O0.f39704OooO0oO != null) {
            oooO0O0.f39702OooO0o = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f39692OooOOoo.OooO0o0(oooO0O0.f39700OooO0OO.get(i2));
            long j = this.f39684OooOO0O;
            long[] jArr = oooO0O0.f39699OooO0O0;
            this.f39684OooOO0O = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f39685OooOO0o++;
        o0O0o00O o0o0o00o2 = this.f39687OooOOO0;
        if (o0o0o00o2 != null) {
            o0o0o00o2.Oooo000("REMOVE");
            o0o0o00o2.o0ooOO0(32);
            o0o0o00o2.Oooo000(str);
            o0o0o00o2.o0ooOO0(10);
        }
        this.f39677OooO.remove(str);
        if (this.f39685OooOO0o >= 2000) {
            OooOo0();
        }
    }

    public final void Oooo0OO() throws IOException {
        boolean z;
        do {
            z = false;
            if (this.f39684OooOO0O <= this.f39680OooO0o0) {
                this.f39691OooOOo0 = false;
                return;
            }
            for (OooO0O0 oooO0O0 : this.f39677OooO.values()) {
                if (!oooO0O0.f39702OooO0o) {
                    Oooo0O0(oooO0O0);
                    z = true;
                    break;
                }
            }
        } while (z);
    }

    public final synchronized void Oooo0oO() {
        Unit unit;
        o0O0o00O o0o0o00o = this.f39687OooOOO0;
        if (o0o0o00o != null) {
            o0o0o00o.close();
        }
        o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(this.f39692OooOOoo.OooOO0O(this.f39681OooO0oO));
        Throwable th = null;
        try {
            o0ooo000OooO00o.Oooo000("libcore.io.DiskLruCache");
            o0ooo000OooO00o.o0ooOO0(10);
            o0ooo000OooO00o.Oooo000("1");
            o0ooo000OooO00o.o0ooOO0(10);
            o0ooo000OooO00o.Ooooo00(1).o0ooOO0(10);
            o0ooo000OooO00o.Ooooo00(2).o0ooOO0(10);
            o0ooo000OooO00o.o0ooOO0(10);
            for (OooO0O0 oooO0O0 : this.f39677OooO.values()) {
                if (oooO0O0.f39704OooO0oO != null) {
                    o0ooo000OooO00o.Oooo000("DIRTY");
                    o0ooo000OooO00o.o0ooOO0(32);
                    o0ooo000OooO00o.Oooo000(oooO0O0.f39698OooO00o);
                    o0ooo000OooO00o.o0ooOO0(10);
                } else {
                    o0ooo000OooO00o.Oooo000("CLEAN");
                    o0ooo000OooO00o.o0ooOO0(32);
                    o0ooo000OooO00o.Oooo000(oooO0O0.f39698OooO00o);
                    for (long j : oooO0O0.f39699OooO0O0) {
                        o0ooo000OooO00o.o0ooOO0(32);
                        o0ooo000OooO00o.Ooooo00(j);
                    }
                    o0ooo000OooO00o.o0ooOO0(10);
                }
            }
            unit = Unit.INSTANCE;
        } catch (Throwable th2) {
            unit = null;
            th = th2;
        }
        try {
            o0ooo000OooO00o.close();
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
        if (this.f39692OooOOoo.OooO0o(this.f39679OooO0o)) {
            this.f39692OooOOoo.OooO0O0(this.f39679OooO0o, this.f39682OooO0oo);
            this.f39692OooOOoo.OooO0O0(this.f39681OooO0oO, this.f39679OooO0o);
            this.f39692OooOOoo.OooO0o0(this.f39682OooO0oo);
        } else {
            this.f39692OooOOoo.OooO0O0(this.f39681OooO0oO, this.f39679OooO0o);
        }
        this.f39687OooOOO0 = OooOo();
        this.f39685OooOO0o = 0;
        this.f39686OooOOO = false;
        this.f39690OooOOo = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f39688OooOOOO && !this.f39689OooOOOo) {
            Object[] array = this.f39677OooO.values().toArray(new OooO0O0[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (OooO0O0 oooO0O0 : (OooO0O0[]) array) {
                OooO00o oooO00o = oooO0O0.f39704OooO0oO;
                if (oooO00o != null) {
                    OooO0O0 oooO0O1 = oooO00o.f39693OooO00o;
                    if (Intrinsics.areEqual(oooO0O1.f39704OooO0oO, oooO00o)) {
                        oooO0O1.f39702OooO0o = true;
                    }
                }
            }
            Oooo0OO();
            CoroutineScopeKt.cancel$default(this.f39683OooOO0, null, 1, null);
            o0O0o00O o0o0o00o = this.f39687OooOOO0;
            Intrinsics.checkNotNull(o0o0o00o);
            o0o0o00o.close();
            this.f39687OooOOO0 = null;
            this.f39689OooOOOo = true;
            return;
        }
        this.f39689OooOOOo = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f39688OooOOOO) {
            OooO0OO();
            Oooo0OO();
            o0O0o00O o0o0o00o = this.f39687OooOOO0;
            Intrinsics.checkNotNull(o0o0o00o);
            o0o0o00o.flush();
        }
    }
}
