package p118o00O0Oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.media3.session.o00O0O0O;
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
import o00OO00O.OooOOOO;
import o00OO00O.OooOo00;
import o00OO00O.o0OoOo0;
import o00OO00O.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p122o00O0o.OooO0OO;
import p122o00O0o.OooO0o;
import p124o00O0o00.OooOO0;
import p125o00O0o0O.Oooo0;
import p125o00O0o0O.o000oOoO;
import p125o00O0o0O.o00Ooo;
import p125o00O0o0O.o0OO00O;
import p126o00O0o0o.o00000OO;
import p126o00O0o0o.o0O0O00;
import p127o00O0oO.o000;
import p127o00O0oO.o0000O0;
import p127o00O0oO.o0000O0O;
import p127o00O0oO.o0000OO0;
import p127o00O0oO.o000O000;
import p127o00O0oO.o000OO;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000OO0O;
import p131o00O0oo0.o000000;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o00Oo0;
import p131o00O0oo0.o00oO0o;
import p131o00O0oo0.o0Oo0oo;
import p131o00O0oo0.oo0o0Oo;
import p132o00O0ooo.o00O00;
import p132o00O0ooo.o00O000o;
import p224o00oOOo.o0OOO0o;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo implements o00000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f36380OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f36381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy<MemoryCache> f36382OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy<o0OOO0o> f36383OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy<o00OO.OooO00o> f36384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f36385OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000000.OooO0O0 f36386OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000000 f36387OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f36388OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o000OOo f36389OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final List<o00000OO> f36390OooOO0O;

    @DebugMetadata(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0Oo0oo>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f36391OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o f36392OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(coil.request.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f36392OooO0o = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0000Ooo.this.new OooO00o(this.f36392OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0Oo0oo> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f36391OooO0Oo;
            o0000Ooo o0000ooo = o0000Ooo.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f36391OooO0Oo = 1;
                obj = o0000Ooo.OooO0o0(o0000ooo, this.f36392OooO0o, 0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((o0Oo0oo) obj) instanceof o00oO0o) {
                o0000ooo.getClass();
            }
            return obj;
        }
    }

    @DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0Oo0oo>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f36394OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o f36395OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f36396OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0000Ooo f36397OooO0oO;

        @DebugMetadata(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0Oo0oo>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f36398OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ coil.request.OooO00o f36399OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ o0000Ooo f36400OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0000Ooo o0000ooo, coil.request.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f36400OooO0o0 = o0000ooo;
                this.f36399OooO0o = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f36400OooO0o0, this.f36399OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0Oo0oo> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f36398OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f36398OooO0Oo = 1;
                    obj = o0000Ooo.OooO0o0(this.f36400OooO0o0, this.f36399OooO0o, 1, this);
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
        public OooO0O0(o0000Ooo o0000ooo, coil.request.OooO00o oooO00o, Continuation continuation) {
            super(2, continuation);
            this.f36395OooO0o = oooO00o;
            this.f36397OooO0oO = o0000ooo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f36397OooO0oO, this.f36395OooO0o, continuation);
            oooO0O0.f36396OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0Oo0oo> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f36394OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f36396OooO0o0;
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                o0000Ooo o0000ooo = this.f36397OooO0oO;
                coil.request.OooO00o oooO00o = this.f36395OooO0o;
                Deferred<? extends o0Oo0oo> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, immediate, null, new OooO00o(o0000ooo, oooO00o, null), 2, null);
                o00O000o o00o000o2 = oooO00o.f11641OooO0OO;
                if (o00o000o2 instanceof o00O00) {
                    OooOo00.OooO0OO(((o00O00) o00o000o2).getView()).OooO0O0(deferredAsync$default);
                }
                this.f36394OooO0Oo = 1;
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

    public o0000Ooo(@NotNull Context context, @NotNull o00Oo0 o00oo1, @NotNull Lazy lazy, @NotNull Lazy lazy2, @NotNull Lazy lazy3, @NotNull o000OOo o000ooo2, @NotNull o0OoOo0 o0oooo1) {
        o00O0O0O o00o0o0o2 = o000000.OooO0O0.f36367OooO0OO;
        this.f36381OooO00o = o00oo1;
        this.f36382OooO0O0 = lazy;
        this.f36383OooO0OO = lazy2;
        this.f36384OooO0Oo = lazy3;
        this.f36386OooO0o0 = o00o0o0o2;
        this.f36385OooO0o = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new o0000oo(CoroutineExceptionHandler.INSTANCE, this)));
        oo000o oo000oVar = new oo000o(this, context, o0oooo1.f37095OooO0O0);
        o000000 o000000Var = new o000000(this, oo000oVar);
        this.f36387OooO0oO = o000000Var;
        this.f36388OooO0oo = lazy;
        this.f36380OooO = lazy2;
        o000OOo.OooO00o oooO00o = new o000OOo.OooO00o(o000ooo2);
        oooO00o.OooO0O0(new o000OO(), o0O000O.class);
        oooO00o.OooO0O0(new o000O000(), String.class);
        oooO00o.OooO0O0(new o0000O0O(), Uri.class);
        oooO00o.OooO0O0(new o000(), Uri.class);
        oooO00o.OooO0O0(new o0000OO0(), Integer.class);
        oooO00o.OooO0O0(new o0000O0(), byte[].class);
        Pair<OooO0OO<? extends Object>, Class<? extends Object>> pair = TuplesKt.to(new OooO0o(), Uri.class);
        List<Pair<OooO0OO<? extends Object>, Class<? extends Object>>> list = oooO00o.f36409OooO0OO;
        list.add(pair);
        list.add(TuplesKt.to(new p122o00O0o.OooO0O0(o0oooo1.f37094OooO00o), File.class));
        oooO00o.OooO00o(new o00O0o0O.o0Oo0oo.OooO00o(lazy3, lazy2, o0oooo1.f37096OooO0OO), Uri.class);
        oooO00o.OooO00o(new o00O0o0O.o0OOO0o.OooO00o(), File.class);
        oooO00o.OooO00o(new Oooo0.OooO00o(), Uri.class);
        oooO00o.OooO00o(new o00O0o0O.o00Oo0.OooO00o(), Uri.class);
        oooO00o.OooO00o(new o0OO00O.OooO00o(), Uri.class);
        oooO00o.OooO00o(new o00Ooo.OooO00o(), Drawable.class);
        oooO00o.OooO00o(new o000oOoO.OooO00o(), Bitmap.class);
        oooO00o.OooO00o(new o00O0o0O.o0OoOo0.OooO00o(), ByteBuffer.class);
        oooO00o.f36411OooO0o0.add(new OooOO0.OooO0O0(o0oooo1.f37097OooO0Oo, o0oooo1.f37098OooO0o0));
        o000OOo o000oooOooO0OO = oooO00o.OooO0OO();
        this.f36389OooOO0 = o000oooOooO0OO;
        this.f36390OooOO0O = CollectionsKt.plus((Collection<? extends o0O0O00>) o000oooOooO0OO.f36402OooO00o, new o0O0O00(this, o000000Var));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(oo000oVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static void OooO0o(o00oO0o o00oo0o2, o00O000o o00o000o2, o000000 o000000Var) {
        coil.request.OooO00o oooO00o = o00oo0o2.f36835OooO0O0;
        if (o00o000o2 instanceof o00OO000.OooO0o) {
            o00OO000.OooO0OO oooO0OOOooO00o = oooO00o.f11651OooOOO0.OooO00o((o00OO000.OooO0o) o00o000o2, o00oo0o2);
            if (oooO0OOOooO00o instanceof o00OO000.OooO0O0) {
                o00o000o2.OooO0OO(o00oo0o2.f36834OooO00o);
            } else {
                o000000Var.OooOO0();
                oooO0OOOooO00o.OooO00o();
                o000000Var.OooOOO();
            }
        } else if (o00o000o2 != null) {
            o00o000o2.OooO0OO(o00oo0o2.f36834OooO00o);
        }
        o000000Var.onError();
        coil.request.OooO00o.OooO0O0 oooO0O0 = oooO00o.f11642OooO0Oo;
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
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o00O0Oo.o0000Ooo] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [coil.request.OooO00o$OooO0O0, o00O0Oo.o000000] */
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
    public static final Object OooO0o0(o0000Ooo o0000ooo, coil.request.OooO00o oooO00o, int i, Continuation continuation) {
        o0000 o0000Var;
        int i2;
        ?? r2;
        ?? r1;
        ?? r4;
        ?? r3;
        Object obj;
        o0Oo0oo o0oo0oo2;
        ?? r5;
        RequestDelegate viewTargetRequestDelegate;
        coil.request.OooO00o OooO00o2;
        o000000.OooO00o oooO00o2;
        RequestDelegate requestDelegate;
        coil.request.OooO00o oooO00o3;
        o000000 o000000Var;
        o0000Ooo o0000ooo2;
        Bitmap bitmap;
        Drawable drawableOooO0O0;
        Bitmap bitmap2;
        o0000Ooo o0000ooo3;
        o000000 o000000Var2;
        RequestDelegate requestDelegate2;
        coil.request.OooO00o oooO00o4;
        o0000Ooo o0000ooo4;
        RequestDelegate requestDelegate3;
        coil.request.OooO00o oooO00o5;
        o000000 o000000Var3;
        o0Oo0oo o0oo0oo3;
        int i3;
        o0000Ooo o0000ooo5 = o0000ooo;
        o0000ooo.getClass();
        if (continuation instanceof o0000) {
            o0000Var = (o0000) continuation;
            i3 = o0000Var.f36364OooOO0O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = i3 - Integer.MIN_VALUE;
                o0000Var.f36364OooOO0O = i4;
                i2 = i4;
            } else {
                o0000Var = new o0000(o0000ooo5, continuation);
                i2 = i3;
            }
        } else {
            o0000Var = new o0000(o0000ooo5, continuation);
            i2 = i3;
        }
        o0000 o0000Var2 = o0000Var;
        Object objWithContext = o0000Var2.f36357OooO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = o0000Var2.f36364OooOO0O;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    o000000 o000000Var4 = o0000Var2.f36361OooO0oO;
                    coil.request.OooO00o oooO00o6 = o0000Var2.f36359OooO0o;
                    RequestDelegate requestDelegate4 = o0000Var2.f36360OooO0o0;
                    o0000Ooo o0000ooo6 = o0000Var2.f36358OooO0Oo;
                    ResultKt.throwOnFailure(objWithContext);
                    o000000Var = o000000Var4;
                    o0000ooo2 = o0000ooo6;
                    oooO00o3 = oooO00o6;
                    requestDelegate = requestDelegate4;
                } else {
                    if (i5 == 2) {
                        Bitmap bitmap3 = o0000Var2.f36362OooO0oo;
                        o000000 o000000Var5 = o0000Var2.f36361OooO0oO;
                        coil.request.OooO00o oooO00o7 = o0000Var2.f36359OooO0o;
                        RequestDelegate requestDelegate5 = o0000Var2.f36360OooO0o0;
                        o0000Ooo o0000ooo7 = o0000Var2.f36358OooO0Oo;
                        ResultKt.throwOnFailure(objWithContext);
                        bitmap2 = bitmap3;
                        o000000Var2 = o000000Var5;
                        oooO00o4 = oooO00o7;
                        requestDelegate2 = requestDelegate5;
                        o0000ooo3 = o0000ooo7;
                        o000000Var2.OooO0oO();
                        CoroutineDispatcher coroutineDispatcher = oooO00o4.f11661OooOo0o;
                        o0000O00 o0000o00 = new o0000O00(oooO00o4, o0000ooo3, (o000O0Oo) objWithContext, o000000Var2, bitmap2, null);
                        o0000Var2.f36358OooO0Oo = o0000ooo3;
                        o0000Var2.f36360OooO0o0 = requestDelegate2;
                        o0000Var2.f36359OooO0o = oooO00o4;
                        o0000Var2.f36361OooO0oO = o000000Var2;
                        o0000Var2.f36362OooO0oo = null;
                        o0000Var2.f36364OooOO0O = 3;
                        objWithContext = BuildersKt.withContext(coroutineDispatcher, o0000o00, o0000Var2);
                        o000000Var3 = o000000Var2;
                        oooO00o5 = oooO00o4;
                        requestDelegate3 = requestDelegate2;
                        o0000ooo4 = o0000ooo3;
                        if (objWithContext == coroutine_suspended) {
                            obj = coroutine_suspended;
                        }
                        return obj;
                    }
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000000 o000000Var6 = o0000Var2.f36361OooO0oO;
                    coil.request.OooO00o oooO00o8 = o0000Var2.f36359OooO0o;
                    RequestDelegate requestDelegate6 = o0000Var2.f36360OooO0o0;
                    o0000Ooo o0000ooo8 = o0000Var2.f36358OooO0Oo;
                    ResultKt.throwOnFailure(objWithContext);
                    o000000Var3 = o000000Var6;
                    oooO00o5 = oooO00o8;
                    requestDelegate3 = requestDelegate6;
                    o0000ooo4 = o0000ooo8;
                }
                o0oo0oo3 = (o0Oo0oo) objWithContext;
                if (o0oo0oo3 instanceof o000000O) {
                    o00O000o o00o000o2 = oooO00o5.f11641OooO0OO;
                    o0000ooo4.getClass();
                    OooO0oO((o000000O) o0oo0oo3, o00o000o2, o000000Var3);
                    r5 = requestDelegate3;
                    o0oo0oo2 = o0oo0oo3;
                } else if (o0oo0oo3 instanceof o00oO0o) {
                    r5 = requestDelegate3;
                    o0oo0oo2 = o0oo0oo3;
                    o00O000o o00o000o3 = oooO00o5.f11641OooO0OO;
                    o0000ooo4.getClass();
                    OooO0o((o00oO0o) o0oo0oo3, o00o000o3, o000000Var3);
                    r5 = requestDelegate3;
                    o0oo0oo2 = o0oo0oo3;
                }
                r5 = requestDelegate3;
                o0oo0oo2 = o0oo0oo3;
                r5.OooO0O0();
                obj = o0oo0oo2;
                return obj;
            }
            ResultKt.throwOnFailure(objWithContext);
            Job job = JobKt.getJob(o0000Var2.getContext());
            o000000 o000000Var7 = o0000ooo5.f36387OooO0oO;
            o000000Var7.getClass();
            Lifecycle lifecycle = oooO00o.f11664OooOoOO;
            o00O000o o00o000o4 = oooO00o.f11641OooO0OO;
            viewTargetRequestDelegate = o00o000o4 instanceof o00O00 ? new ViewTargetRequestDelegate(o000000Var7.f36781OooO00o, oooO00o, (o00O00) o00o000o4, lifecycle, job) : new BaseRequestDelegate(lifecycle, job);
            viewTargetRequestDelegate.OooO00o();
            coil.request.OooO00o.C0189OooO00o c0189OooO00oOooO00o = coil.request.OooO00o.OooO00o(oooO00o);
            c0189OooO00oOooO00o.f11679OooO0O0 = o0000ooo5.f36381OooO00o;
            c0189OooO00oOooO00o.f11717Oooo0oo = null;
            OooO00o2 = c0189OooO00oOooO00o.OooO00o();
            o0000ooo5.f36386OooO0o0.getClass();
            oooO00o2 = o000000.f36366OooO00o;
            try {
                if (Intrinsics.areEqual(OooO00o2.f11640OooO0O0, p131o00O0oo0.o0OO00O.f36852OooO00o)) {
                    throw new NullRequestDataException();
                }
                viewTargetRequestDelegate.OooO0OO();
                if (i == 0) {
                    Lifecycle lifecycle2 = OooO00o2.f11664OooOoOO;
                    o0000Var2.f36358OooO0Oo = o0000ooo5;
                    o0000Var2.f36360OooO0o0 = viewTargetRequestDelegate;
                    o0000Var2.f36359OooO0o = OooO00o2;
                    o0000Var2.f36361OooO0oO = oooO00o2;
                    o0000Var2.f36364OooOO0O = 1;
                    if (Lifecycles.OooO00o(lifecycle2, o0000Var2) == coroutine_suspended) {
                        o0000ooo2 = o0000ooo5;
                        o000000Var = oooO00o2;
                        oooO00o3 = OooO00o2;
                        requestDelegate = viewTargetRequestDelegate;
                        o0000ooo2 = o0000ooo5;
                        o000000Var = oooO00o2;
                        oooO00o3 = OooO00o2;
                        requestDelegate = viewTargetRequestDelegate;
                        obj = coroutine_suspended;
                    }
                }
                return obj;
            } catch (Throwable th) {
                th = th;
                r1 = o0000ooo5;
                r2 = oooO00o2;
                r3 = OooO00o2;
                r4 = viewTargetRequestDelegate;
                try {
                    if (th instanceof CancellationException) {
                        r1.getClass();
                        r2.onCancel();
                        coil.request.OooO00o.OooO0O0 oooO0O0 = r3.f11642OooO0Oo;
                        if (oooO0O0 != null) {
                            oooO0O0.onCancel();
                        }
                        throw th;
                    }
                    r1.f36387OooO0oO.getClass();
                    o00oO0o o00oo0oOooO00o = o000000.OooO00o(r3, th);
                    OooO0o(o00oo0oOooO00o, r3.f11641OooO0OO, r2);
                    r5 = r4;
                    o0oo0oo2 = o00oo0oOooO00o;
                } catch (Throwable th2) {
                    r4.OooO0O0();
                    throw th2;
                }
            }
            o0000ooo2 = o0000ooo5;
            o000000Var = oooO00o2;
            oooO00o3 = OooO00o2;
            requestDelegate = viewTargetRequestDelegate;
            o0000ooo2 = o0000ooo5;
            o000000Var = oooO00o2;
            oooO00o3 = OooO00o2;
            requestDelegate = viewTargetRequestDelegate;
            o0000ooo2 = o0000ooo5;
            o000000Var = oooO00o2;
            oooO00o3 = OooO00o2;
            requestDelegate = viewTargetRequestDelegate;
            MemoryCache memoryCacheOooO0Oo = o0000ooo2.OooO0Oo();
            if (memoryCacheOooO0Oo == null) {
                bitmap = null;
            } else {
                MemoryCache.Key key = oooO00o3.f11668OooOooo;
                MemoryCache.OooO00o oooO00oOooO0O0 = key != null ? memoryCacheOooO0Oo.OooO0O0(key) : null;
                if (oooO00oOooO0O0 != null) {
                    bitmap = oooO00oOooO0O0.f11634OooO00o;
                } else {
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                drawableOooO0O0 = new BitmapDrawable(oooO00o3.f11639OooO00o.getResources(), bitmap);
            } else {
                drawableOooO0O0 = OooOOOO.OooO0O0(oooO00o3, oooO00o3.f11671Oooo00O, oooO00o3.f11670Oooo000, oooO00o3.f11675Oooo0o.f36813OooOO0);
            }
            o00O000o o00o000o5 = oooO00o3.f11641OooO0OO;
            if (o00o000o5 != null) {
                o00o000o5.OooO0O0(drawableOooO0O0);
            }
            o000000Var.onStart();
            coil.request.OooO00o.OooO0O0 oooO0O1 = oooO00o3.f11642OooO0Oo;
            if (oooO0O1 != null) {
                oooO0O1.onStart();
            }
            o000000Var.OooO0OO();
            o000OO0O o000oo0o2 = oooO00o3.f11666OooOoo0;
            o0000Var2.f36358OooO0Oo = o0000ooo2;
            o0000Var2.f36360OooO0o0 = requestDelegate;
            o0000Var2.f36359OooO0o = oooO00o3;
            o0000Var2.f36361OooO0oO = o000000Var;
            o0000Var2.f36362OooO0oo = bitmap;
            o0000Var2.f36364OooOO0O = 2;
            Object objOooO0O0 = o000oo0o2.OooO0O0(o0000Var2);
            obj = coroutine_suspended;
            if (objOooO0O0 != coroutine_suspended) {
                bitmap2 = bitmap;
                o0000ooo3 = o0000ooo2;
                o000000Var2 = o000000Var;
                objWithContext = objOooO0O0;
                oooO00o4 = oooO00o3;
                requestDelegate2 = requestDelegate;
                o000000Var2.OooO0oO();
                CoroutineDispatcher coroutineDispatcher2 = oooO00o4.f11661OooOo0o;
                o0000O00 o0000o01 = new o0000O00(oooO00o4, o0000ooo3, (o000O0Oo) objWithContext, o000000Var2, bitmap2, null);
                o0000Var2.f36358OooO0Oo = o0000ooo3;
                o0000Var2.f36360OooO0o0 = requestDelegate2;
                o0000Var2.f36359OooO0o = oooO00o4;
                o0000Var2.f36361OooO0oO = o000000Var2;
                o0000Var2.f36362OooO0oo = null;
                o0000Var2.f36364OooOO0O = 3;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, o0000o01, o0000Var2);
                o000000Var3 = o000000Var2;
                oooO00o5 = oooO00o4;
                requestDelegate3 = requestDelegate2;
                o0000ooo4 = o0000ooo3;
                if (objWithContext == coroutine_suspended) {
                    obj = coroutine_suspended;
                } else {
                    o0oo0oo3 = (o0Oo0oo) objWithContext;
                    if (o0oo0oo3 instanceof o000000O) {
                        o00O000o o00o000o6 = oooO00o5.f11641OooO0OO;
                        o0000ooo4.getClass();
                        OooO0oO((o000000O) o0oo0oo3, o00o000o6, o000000Var3);
                        r5 = requestDelegate3;
                        o0oo0oo2 = o0oo0oo3;
                    } else if (o0oo0oo3 instanceof o00oO0o) {
                        r5 = requestDelegate3;
                        o0oo0oo2 = o0oo0oo3;
                        o00O000o o00o000o7 = oooO00o5.f11641OooO0OO;
                        o0000ooo4.getClass();
                        OooO0o((o00oO0o) o0oo0oo3, o00o000o7, o000000Var3);
                        r5 = requestDelegate3;
                        o0oo0oo2 = o0oo0oo3;
                    }
                    r5 = requestDelegate3;
                    o0oo0oo2 = o0oo0oo3;
                    r5.OooO0O0();
                    obj = o0oo0oo2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            r2 = o0000ooo5;
            r1 = -2147483648;
            r3 = i5;
            r4 = i2;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static void OooO0oO(o000000O o000000o2, o00O000o o00o000o2, o000000 o000000Var) {
        coil.request.OooO00o oooO00o = o000000o2.f36785OooO0O0;
        if (o00o000o2 instanceof o00OO000.OooO0o) {
            o00OO000.OooO0OO oooO0OOOooO00o = oooO00o.f11651OooOOO0.OooO00o((o00OO000.OooO0o) o00o000o2, o000000o2);
            if (oooO0OOOooO00o instanceof o00OO000.OooO0O0) {
                o00o000o2.OooO00o(o000000o2.f36784OooO00o);
            } else {
                o000000Var.OooOO0();
                oooO0OOOooO00o.OooO00o();
                o000000Var.OooOOO();
            }
        } else if (o00o000o2 != null) {
            o00o000o2.OooO00o(o000000o2.f36784OooO00o);
        }
        o000000Var.onSuccess();
        coil.request.OooO00o.OooO0O0 oooO0O0 = oooO00o.f11642OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.onSuccess();
        }
    }

    @Override // p118o00O0Oo.o00000O
    @NotNull
    public final o00Oo0 OooO00o() {
        return this.f36381OooO00o;
    }

    @Override // p118o00O0Oo.o00000O
    @NotNull
    public final p131o00O0oo0.oo000o OooO0O0(@NotNull coil.request.OooO00o oooO00o) {
        Deferred<? extends o0Oo0oo> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.f36385OooO0o, null, null, new OooO00o(oooO00o, null), 3, null);
        o00O000o o00o000o2 = oooO00o.f11641OooO0OO;
        return o00o000o2 instanceof o00O00 ? OooOo00.OooO0OO(((o00O00) o00o000o2).getView()).OooO0O0(deferredAsync$default) : new oo0o0Oo(deferredAsync$default);
    }

    @Override // p118o00O0Oo.o00000O
    @Nullable
    public final Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super o0Oo0oo> continuation) {
        return CoroutineScopeKt.coroutineScope(new OooO0O0(this, oooO00o, null), continuation);
    }

    @Override // p118o00O0Oo.o00000O
    @Nullable
    public final MemoryCache OooO0Oo() {
        return (MemoryCache) this.f36388OooO0oo.getValue();
    }

    @Override // p118o00O0Oo.o00000O
    @NotNull
    public final o000OOo getComponents() {
        return this.f36389OooOO0;
    }
}
