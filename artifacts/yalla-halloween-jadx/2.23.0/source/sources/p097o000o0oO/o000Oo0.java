package p097o000o0oO;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import coil.memory.MemoryCache;
import coil.request.BaseRequestDelegate;
import coil.request.NullRequestDataException;
import coil.request.RequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import coil.util.Lifecycles;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import o00O0000.OooO0OO;
import o00O0000.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00oO0o;
import p102o000oo0.OooOO0;
import p103o000oo00.OooOo00;
import p105o000oo0o.o00O00OO;
import p105o000oo0o.o00O0O00;
import p105o000oo0o.o00O0OO;
import p105o000oo0o.o00O0OOO;
import p105o000oo0o.oo0o0O0;
import p106o000ooO.OooOOO;
import p106o000ooO.OooOOO0;
import p106o000ooO.OooOOOO;
import p106o000ooO.OooOo;
import p106o000ooO.Oooo0;
import p106o000ooO.Oooo000;
import p107o000ooO0.o0O0O00;
import p107o000ooO0.o0OO00O;
import p109o000ooo.o000oOoO;
import p109o000ooo.o00O0O;
import p109o000ooo.o00Oo0;
import p109o000ooo.o0OOO0o;
import p109o000ooo.o0ooOOo;
import p109o000ooo.oo0o0Oo;
import p111o000oooO.o00O00;
import p111o000oooO.o00O00O;
import p112o000oooo.o00O0;
import p112o000oooo.oo00o;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o000OO0O;
import p321o0O0ooO.o00O0000;
import p321o0O0ooO.o00O000o;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 implements o000O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f35429OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000oOoO f35430OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy<MemoryCache> f35431OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy<OooOO0> f35432OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy<o00O00o0.OooO00o> f35433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000O0O.OooO0O0 f35435OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f35436OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f35437OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o0000O0 f35438OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final List<o00oO0o> f35439OooOO0O;

    @DebugMetadata(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super p109o000ooo.o00oO0o>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35440OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o f35441OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(coil.request.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f35441OooO0o = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o000Oo0.this.new OooO00o(this.f35441OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super p109o000ooo.o00oO0o> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f35440OooO0Oo;
            o000Oo0 o000oo1 = o000Oo0.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f35440OooO0Oo = 1;
                obj = o000Oo0.OooO0o0(o000oo1, this.f35441OooO0o, 0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((p109o000ooo.o00oO0o) obj) instanceof o00Oo0) {
                o000oo1.getClass();
            }
            return obj;
        }
    }

    @DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super p109o000ooo.o00oO0o>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35443OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o f35444OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f35445OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o000Oo0 f35446OooO0oO;

        @DebugMetadata(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super p109o000ooo.o00oO0o>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f35447OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ coil.request.OooO00o f35448OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ o000Oo0 f35449OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o000Oo0 o000oo1, coil.request.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f35449OooO0o0 = o000oo1;
                this.f35448OooO0o = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f35449OooO0o0, this.f35448OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super p109o000ooo.o00oO0o> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f35447OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f35447OooO0Oo = 1;
                    obj = o000Oo0.OooO0o0(this.f35449OooO0o0, this.f35448OooO0o, 1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000Oo0 o000oo1, coil.request.OooO00o oooO00o, Continuation continuation) {
            super(2, continuation);
            this.f35444OooO0o = oooO00o;
            this.f35446OooO0oO = o000oo1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f35446OooO0oO, this.f35444OooO0o, continuation);
            oooO0O0.f35445OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super p109o000ooo.o00oO0o> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f35443OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f35445OooO0o0;
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                o000Oo0 o000oo1 = this.f35446OooO0oO;
                coil.request.OooO00o oooO00o = this.f35444OooO0o;
                Deferred<? extends p109o000ooo.o00oO0o> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, immediate, null, new OooO00o(o000oo1, oooO00o, null), 2, null);
                oo00o oo00oVar = oooO00o.f8551OooO0OO;
                if (oo00oVar instanceof o00O0) {
                    o000O0O0.OooO0OO(((o00O0) oo00oVar).getView()).OooO0O0(deferredAsync$default);
                }
                this.f35443OooO0Oo = 1;
                obj = deferredAsync$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public o000Oo0(@NotNull Context context, @NotNull o000oOoO o000oooo2, @NotNull Lazy lazy, @NotNull Lazy lazy2, @NotNull Lazy lazy3, @NotNull o0000O0 o0000o1, @NotNull o00O0000 o00o0001) {
        o000OO o000oo2 = o0000O0O.OooO0O0.f35406OooO0O0;
        this.f35430OooO00o = o000oooo2;
        this.f35431OooO0O0 = lazy;
        this.f35432OooO0OO = lazy2;
        this.f35433OooO0Oo = lazy3;
        this.f35435OooO0o0 = o000oo2;
        this.f35434OooO0o = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new o000O0(CoroutineExceptionHandler.INSTANCE, this)));
        o00O000o o00o000o2 = new o00O000o(this, context, o00o0001.f42861OooO0O0);
        oo0o0Oo oo0o0oo = new oo0o0Oo(this, o00o000o2);
        this.f35436OooO0oO = oo0o0oo;
        this.f35437OooO0oo = lazy;
        this.f35429OooO = lazy2;
        o0000O0.OooO00o oooO00o = new o0000O0.OooO00o(o0000o1);
        oooO00o.OooO0O0(new OooOOOO(), o00OO.class);
        oooO00o.OooO0O0(new Oooo0(), String.class);
        oooO00o.OooO0O0(new OooOOO(), Uri.class);
        oooO00o.OooO0O0(new Oooo000(), Uri.class);
        oooO00o.OooO0O0(new OooOo(), Integer.class);
        oooO00o.OooO0O0(new OooOOO0(), byte[].class);
        Pair<p107o000ooO0.oo0o0Oo<? extends Object>, Class<? extends Object>> pair = TuplesKt.to(new o0O0O00(), Uri.class);
        List<Pair<p107o000ooO0.oo0o0Oo<? extends Object>, Class<? extends Object>>> list = oooO00o.f35402OooO0OO;
        list.add(pair);
        list.add(TuplesKt.to(new o0OO00O(o00o0001.f42860OooO00o), File.class));
        oooO00o.OooO00o(new o00O0OO.OooO00o(lazy3, lazy2, o00o0001.f42862OooO0OO), Uri.class);
        oooO00o.OooO00o(new oo0o0O0.OooO00o(), File.class);
        oooO00o.OooO00o(new o00O00OO.OooO00o(), Uri.class);
        oooO00o.OooO00o(new o000oo0o.o00O0.OooO00o(), Uri.class);
        oooO00o.OooO00o(new o00O0OOO.OooO00o(), Uri.class);
        oooO00o.OooO00o(new o00O0O00.OooO00o(), Drawable.class);
        oooO00o.OooO00o(new o000oo0o.o00O00o0.OooO00o(), Bitmap.class);
        oooO00o.OooO00o(new o000oo0o.oo00o.OooO00o(), ByteBuffer.class);
        oooO00o.f35404OooO0o0.add(new OooOo00.OooO0O0(o00o0001.f42863OooO0Oo, o00o0001.f42864OooO0o0));
        o0000O0 o0000o0OooO0OO = oooO00o.OooO0OO();
        this.f35438OooOO0 = o0000o0OooO0OO;
        this.f35439OooOO0O = CollectionsKt.plus((Collection<? extends p101o000oo.Oooo0>) o0000o0OooO0OO.f35395OooO00o, new p101o000oo.Oooo0(this, oo0o0oo));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(o00o000o2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static void OooO0o(o00Oo0 o00oo1, oo00o oo00oVar, o0000O0O o0000o0o2) {
        coil.request.OooO00o oooO00o = o00oo1.f35847OooO0O0;
        if (oo00oVar instanceof OooO0o) {
            OooO0OO oooO0OOOooO00o = oooO00o.f8561OooOOO0.OooO00o((OooO0o) oo00oVar, o00oo1);
            if (oooO0OOOooO00o instanceof o00O0000.OooO0O0) {
                oo00oVar.OooO0OO(o00oo1.f35846OooO00o);
            } else {
                o0000o0o2.OooOO0();
                oooO0OOOooO00o.OooO00o();
                o0000o0o2.OooOOO();
            }
        } else if (oo00oVar != null) {
            oo00oVar.OooO0OO(o00oo1.f35846OooO00o);
        }
        o0000o0o2.onError();
        coil.request.OooO00o.OooO0O0 oooO0O0 = oooO00o.f8552OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.onError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c A[Catch: all -> 0x006b, TryCatch #2 {all -> 0x006b, blocks: (B:14:0x003e, B:65:0x0165, B:67:0x016c, B:68:0x0178, B:70:0x017c, B:19:0x0055, B:62:0x013c, B:22:0x0064), top: B:89:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0178 A[Catch: all -> 0x006b, TryCatch #2 {all -> 0x006b, blocks: (B:14:0x003e, B:65:0x0165, B:67:0x016c, B:68:0x0178, B:70:0x017c, B:19:0x0055, B:62:0x013c, B:22:0x0064), top: B:89:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x017c A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #2 {all -> 0x006b, blocks: (B:14:0x003e, B:65:0x0165, B:67:0x016c, B:68:0x0178, B:70:0x017c, B:19:0x0055, B:62:0x013c, B:22:0x0064), top: B:89:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o000o0oO.o000Oo0] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [coil.request.OooO00o$OooO0O0, o000o0oO.o0000O0O] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v4, types: [coil.request.OooO00o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [coil.request.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [coil.request.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    public static final Object OooO0o0(o000Oo0 o000oo1, coil.request.OooO00o oooO00o, int i, Continuation continuation) {
        o000O00 o000o01;
        int i2;
        ?? r2;
        ?? r1;
        ?? r4;
        ?? r3;
        Object obj;
        p109o000ooo.o00oO0o o00oo0o2;
        ?? r5;
        RequestDelegate viewTargetRequestDelegate;
        coil.request.OooO00o OooO00o2;
        o0000O0O.OooO00o oooO00o2;
        RequestDelegate requestDelegate;
        coil.request.OooO00o oooO00o3;
        o0000O0O o0000o0o2;
        o000Oo0 o000oo2;
        Bitmap bitmap;
        Drawable drawableOooO0O0;
        Bitmap bitmap2;
        o000Oo0 o000oo3;
        o0000O0O o0000o0o3;
        RequestDelegate requestDelegate2;
        coil.request.OooO00o oooO00o4;
        o000Oo0 o000oo4;
        RequestDelegate requestDelegate3;
        coil.request.OooO00o oooO00o5;
        o0000O0O o0000o0o4;
        p109o000ooo.o00oO0o o00oo0o3;
        int i3;
        o000Oo0 o000oo5 = o000oo1;
        o000oo1.getClass();
        if (continuation instanceof o000O00) {
            o000o01 = (o000O00) continuation;
            i3 = o000o01.f35418OooOO0O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = i3 - Integer.MIN_VALUE;
                o000o01.f35418OooOO0O = i4;
                i2 = i4;
            } else {
                o000o01 = new o000O00(o000oo5, continuation);
                i2 = i3;
            }
        } else {
            o000o01 = new o000O00(o000oo5, continuation);
            i2 = i3;
        }
        o000O00 o000o02 = o000o01;
        Object objWithContext = o000o02.f35411OooO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = o000o02.f35418OooOO0O;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    o0000O0O o0000o0o5 = o000o02.f35415OooO0oO;
                    coil.request.OooO00o oooO00o6 = o000o02.f35413OooO0o;
                    RequestDelegate requestDelegate4 = o000o02.f35414OooO0o0;
                    o000Oo0 o000oo6 = o000o02.f35412OooO0Oo;
                    ResultKt.throwOnFailure(objWithContext);
                    o0000o0o2 = o0000o0o5;
                    o000oo2 = o000oo6;
                    oooO00o3 = oooO00o6;
                    requestDelegate = requestDelegate4;
                } else {
                    if (i5 == 2) {
                        Bitmap bitmap3 = o000o02.f35416OooO0oo;
                        o0000O0O o0000o0o6 = o000o02.f35415OooO0oO;
                        coil.request.OooO00o oooO00o7 = o000o02.f35413OooO0o;
                        RequestDelegate requestDelegate5 = o000o02.f35414OooO0o0;
                        o000Oo0 o000oo7 = o000o02.f35412OooO0Oo;
                        ResultKt.throwOnFailure(objWithContext);
                        bitmap2 = bitmap3;
                        o0000o0o3 = o0000o0o6;
                        oooO00o4 = oooO00o7;
                        requestDelegate2 = requestDelegate5;
                        o000oo3 = o000oo7;
                        o0000o0o3.OooO0oO();
                        CoroutineDispatcher coroutineDispatcher = oooO00o4.f8571OooOo0o;
                        o000O00O o000o00o2 = new o000O00O(oooO00o4, o000oo3, (o00O00) objWithContext, o0000o0o3, bitmap2, null);
                        o000o02.f35412OooO0Oo = o000oo3;
                        o000o02.f35414OooO0o0 = requestDelegate2;
                        o000o02.f35413OooO0o = oooO00o4;
                        o000o02.f35415OooO0oO = o0000o0o3;
                        o000o02.f35416OooO0oo = null;
                        o000o02.f35418OooOO0O = 3;
                        objWithContext = BuildersKt.withContext(coroutineDispatcher, o000o00o2, o000o02);
                        o0000o0o4 = o0000o0o3;
                        oooO00o5 = oooO00o4;
                        requestDelegate3 = requestDelegate2;
                        o000oo4 = o000oo3;
                        if (objWithContext == coroutine_suspended) {
                            obj = coroutine_suspended;
                        }
                        return obj;
                    }
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0000O0O o0000o0o7 = o000o02.f35415OooO0oO;
                    coil.request.OooO00o oooO00o8 = o000o02.f35413OooO0o;
                    RequestDelegate requestDelegate6 = o000o02.f35414OooO0o0;
                    o000Oo0 o000oo8 = o000o02.f35412OooO0Oo;
                    ResultKt.throwOnFailure(objWithContext);
                    o0000o0o4 = o0000o0o7;
                    oooO00o5 = oooO00o8;
                    requestDelegate3 = requestDelegate6;
                    o000oo4 = o000oo8;
                }
                o00oo0o3 = (p109o000ooo.o00oO0o) objWithContext;
                if (o00oo0o3 instanceof p109o000ooo.o0O0O00) {
                    oo00o oo00oVar = oooO00o5.f8551OooO0OO;
                    o000oo4.getClass();
                    OooO0oO((p109o000ooo.o0O0O00) o00oo0o3, oo00oVar, o0000o0o4);
                    r5 = requestDelegate3;
                    o00oo0o2 = o00oo0o3;
                } else if (o00oo0o3 instanceof o00Oo0) {
                    r5 = requestDelegate3;
                    o00oo0o2 = o00oo0o3;
                    oo00o oo00oVar2 = oooO00o5.f8551OooO0OO;
                    o000oo4.getClass();
                    OooO0o((o00Oo0) o00oo0o3, oo00oVar2, o0000o0o4);
                    r5 = requestDelegate3;
                    o00oo0o2 = o00oo0o3;
                }
                r5 = requestDelegate3;
                o00oo0o2 = o00oo0o3;
                r5.OooO0O0();
                obj = o00oo0o2;
                return obj;
            }
            ResultKt.throwOnFailure(objWithContext);
            Job job = JobKt.getJob(o000o02.getContext());
            oo0o0Oo oo0o0oo = o000oo5.f35436OooO0oO;
            oo0o0oo.getClass();
            Lifecycle lifecycle = oooO00o.f8574OooOoOO;
            oo00o oo00oVar3 = oooO00o.f8551OooO0OO;
            viewTargetRequestDelegate = oo00oVar3 instanceof o00O0 ? new ViewTargetRequestDelegate(oo0o0oo.f35895OooO00o, oooO00o, (o00O0) oo00oVar3, lifecycle, job) : new BaseRequestDelegate(lifecycle, job);
            viewTargetRequestDelegate.OooO00o();
            coil.request.OooO00o.C0170OooO00o c0170OooO00oOooO00o = coil.request.OooO00o.OooO00o(oooO00o);
            c0170OooO00oOooO00o.f8589OooO0O0 = o000oo5.f35430OooO00o;
            c0170OooO00oOooO00o.f8627Oooo0oo = null;
            OooO00o2 = c0170OooO00oOooO00o.OooO00o();
            o000oo5.f35435OooO0o0.getClass();
            oooO00o2 = o0000O0O.f35405OooO00o;
            try {
                if (Intrinsics.areEqual(OooO00o2.f8550OooO0O0, o0ooOOo.f35892OooO00o)) {
                    throw new NullRequestDataException();
                }
                viewTargetRequestDelegate.OooO0OO();
                if (i == 0) {
                    Lifecycle lifecycle2 = OooO00o2.f8574OooOoOO;
                    o000o02.f35412OooO0Oo = o000oo5;
                    o000o02.f35414OooO0o0 = viewTargetRequestDelegate;
                    o000o02.f35413OooO0o = OooO00o2;
                    o000o02.f35415OooO0oO = oooO00o2;
                    o000o02.f35418OooOO0O = 1;
                    if (Lifecycles.OooO00o(lifecycle2, o000o02) == coroutine_suspended) {
                        o000oo2 = o000oo5;
                        o0000o0o2 = oooO00o2;
                        oooO00o3 = OooO00o2;
                        requestDelegate = viewTargetRequestDelegate;
                        o000oo2 = o000oo5;
                        o0000o0o2 = oooO00o2;
                        oooO00o3 = OooO00o2;
                        requestDelegate = viewTargetRequestDelegate;
                        obj = coroutine_suspended;
                    }
                }
                return obj;
            } catch (Throwable th) {
                th = th;
                r1 = o000oo5;
                r2 = oooO00o2;
                r3 = OooO00o2;
                r4 = viewTargetRequestDelegate;
                try {
                    if (th instanceof CancellationException) {
                        r1.getClass();
                        r2.onCancel();
                        coil.request.OooO00o.OooO0O0 oooO0O0 = r3.f8552OooO0Oo;
                        if (oooO0O0 != null) {
                            oooO0O0.onCancel();
                        }
                        throw th;
                    }
                    r1.f35436OooO0oO.getClass();
                    o00Oo0 o00oo0OooO00o = oo0o0Oo.OooO00o(r3, th);
                    OooO0o(o00oo0OooO00o, r3.f8551OooO0OO, r2);
                    r5 = r4;
                    o00oo0o2 = o00oo0OooO00o;
                } catch (Throwable th2) {
                    r4.OooO0O0();
                    throw th2;
                }
            }
            o000oo2 = o000oo5;
            o0000o0o2 = oooO00o2;
            oooO00o3 = OooO00o2;
            requestDelegate = viewTargetRequestDelegate;
            o000oo2 = o000oo5;
            o0000o0o2 = oooO00o2;
            oooO00o3 = OooO00o2;
            requestDelegate = viewTargetRequestDelegate;
            o000oo2 = o000oo5;
            o0000o0o2 = oooO00o2;
            oooO00o3 = OooO00o2;
            requestDelegate = viewTargetRequestDelegate;
            MemoryCache memoryCacheOooO0Oo = o000oo2.OooO0Oo();
            if (memoryCacheOooO0Oo == null) {
                bitmap = null;
            } else {
                MemoryCache.Key key = oooO00o3.f8578OooOooo;
                MemoryCache.OooO00o oooO00oOooO0O0 = key != null ? memoryCacheOooO0Oo.OooO0O0(key) : null;
                if (oooO00oOooO0O0 != null) {
                    bitmap = oooO00oOooO0O0.f8544OooO00o;
                } else {
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                drawableOooO0O0 = new BitmapDrawable(oooO00o3.f8549OooO00o.getResources(), bitmap);
            } else {
                drawableOooO0O0 = o000OO0O.OooO0O0(oooO00o3, oooO00o3.f8581Oooo00O, oooO00o3.f8580Oooo000, oooO00o3.f8585Oooo0o.f35840OooOO0);
            }
            oo00o oo00oVar4 = oooO00o3.f8551OooO0OO;
            if (oo00oVar4 != null) {
                oo00oVar4.OooO0O0(drawableOooO0O0);
            }
            o0000o0o2.onStart();
            coil.request.OooO00o.OooO0O0 oooO0O1 = oooO00o3.f8552OooO0Oo;
            if (oooO0O1 != null) {
                oooO0O1.onStart();
            }
            o0000o0o2.OooO0OO();
            o00O00O o00o00o2 = oooO00o3.f8576OooOoo0;
            o000o02.f35412OooO0Oo = o000oo2;
            o000o02.f35414OooO0o0 = requestDelegate;
            o000o02.f35413OooO0o = oooO00o3;
            o000o02.f35415OooO0oO = o0000o0o2;
            o000o02.f35416OooO0oo = bitmap;
            o000o02.f35418OooOO0O = 2;
            Object objOooO00o = o00o00o2.OooO00o(o000o02);
            obj = coroutine_suspended;
            if (objOooO00o != coroutine_suspended) {
                bitmap2 = bitmap;
                o000oo3 = o000oo2;
                o0000o0o3 = o0000o0o2;
                objWithContext = objOooO00o;
                oooO00o4 = oooO00o3;
                requestDelegate2 = requestDelegate;
                o0000o0o3.OooO0oO();
                CoroutineDispatcher coroutineDispatcher2 = oooO00o4.f8571OooOo0o;
                o000O00O o000o00o3 = new o000O00O(oooO00o4, o000oo3, (o00O00) objWithContext, o0000o0o3, bitmap2, null);
                o000o02.f35412OooO0Oo = o000oo3;
                o000o02.f35414OooO0o0 = requestDelegate2;
                o000o02.f35413OooO0o = oooO00o4;
                o000o02.f35415OooO0oO = o0000o0o3;
                o000o02.f35416OooO0oo = null;
                o000o02.f35418OooOO0O = 3;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, o000o00o3, o000o02);
                o0000o0o4 = o0000o0o3;
                oooO00o5 = oooO00o4;
                requestDelegate3 = requestDelegate2;
                o000oo4 = o000oo3;
                if (objWithContext == coroutine_suspended) {
                    obj = coroutine_suspended;
                } else {
                    o00oo0o3 = (p109o000ooo.o00oO0o) objWithContext;
                    if (o00oo0o3 instanceof p109o000ooo.o0O0O00) {
                        oo00o oo00oVar5 = oooO00o5.f8551OooO0OO;
                        o000oo4.getClass();
                        OooO0oO((p109o000ooo.o0O0O00) o00oo0o3, oo00oVar5, o0000o0o4);
                        r5 = requestDelegate3;
                        o00oo0o2 = o00oo0o3;
                    } else if (o00oo0o3 instanceof o00Oo0) {
                        r5 = requestDelegate3;
                        o00oo0o2 = o00oo0o3;
                        oo00o oo00oVar6 = oooO00o5.f8551OooO0OO;
                        o000oo4.getClass();
                        OooO0o((o00Oo0) o00oo0o3, oo00oVar6, o0000o0o4);
                        r5 = requestDelegate3;
                        o00oo0o2 = o00oo0o3;
                    }
                    r5 = requestDelegate3;
                    o00oo0o2 = o00oo0o3;
                    r5.OooO0O0();
                    obj = o00oo0o2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            r2 = o000oo5;
            r1 = -2147483648;
            r3 = i5;
            r4 = i2;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static void OooO0oO(p109o000ooo.o0O0O00 o0o0o00, oo00o oo00oVar, o0000O0O o0000o0o2) {
        coil.request.OooO00o oooO00o = o0o0o00.f35850OooO0O0;
        if (oo00oVar instanceof OooO0o) {
            OooO0OO oooO0OOOooO00o = oooO00o.f8561OooOOO0.OooO00o((OooO0o) oo00oVar, o0o0o00);
            if (oooO0OOOooO00o instanceof o00O0000.OooO0O0) {
                oo00oVar.OooO00o(o0o0o00.f35849OooO00o);
            } else {
                o0000o0o2.OooOO0();
                oooO0OOOooO00o.OooO00o();
                o0000o0o2.OooOOO();
            }
        } else if (oo00oVar != null) {
            oo00oVar.OooO00o(o0o0o00.f35849OooO00o);
        }
        o0000o0o2.onSuccess();
        coil.request.OooO00o.OooO0O0 oooO0O0 = oooO00o.f8552OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.onSuccess();
        }
    }

    @Override // p097o000o0oO.o000O000
    @NotNull
    public final o000oOoO OooO00o() {
        return this.f35430OooO00o;
    }

    @Override // p097o000o0oO.o000O000
    @NotNull
    public final o00O0O OooO0O0(@NotNull coil.request.OooO00o oooO00o) {
        Deferred<? extends p109o000ooo.o00oO0o> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.f35434OooO0o, null, null, new OooO00o(oooO00o, null), 3, null);
        oo00o oo00oVar = oooO00o.f8551OooO0OO;
        return oo00oVar instanceof o00O0 ? o000O0O0.OooO0OO(((o00O0) oo00oVar).getView()).OooO0O0(deferredAsync$default) : new o0OOO0o(deferredAsync$default);
    }

    @Override // p097o000o0oO.o000O000
    @Nullable
    public final Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super p109o000ooo.o00oO0o> continuation) {
        return CoroutineScopeKt.coroutineScope(new OooO0O0(this, oooO00o, null), continuation);
    }

    @Override // p097o000o0oO.o000O000
    @Nullable
    public final MemoryCache OooO0Oo() {
        return (MemoryCache) this.f35437OooO0oo.getValue();
    }

    @Override // p097o000o0oO.o000O000
    @NotNull
    public final o0000O0 getComponents() {
        return this.f35438OooOO0;
    }
}
