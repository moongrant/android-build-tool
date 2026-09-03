package oOO00O;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import coil.RealImageLoader$executeChain$2;
import coil.decode.DataSource;
import coil.memory.BaseRequestDelegate;
import coil.memory.RequestDelegate;
import coil.memory.ViewTargetRequestDelegate;
import coil.request.NullRequestDataException;
import coil.size.Size;
import coil.util.Lifecycles;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o000O0O0.o00000O;
import o00O0.OooOo00;
import o00O0.Oooo000;
import o00O0O0O.OooOo;
import o00O0O0O.Oooo0;
import o00O0O0O.o00Oo0;
import o00O0O0O.o00oO0o;
import o00O0O0O.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.o000oOoO;
import p119o00O0Oo0.o00O0O;
import p119o00O0Oo0.o0OO00O;
import p119o00O0Oo0.o0Oo0oo;
import p119o00O0Oo0.o0ooOOo;
import p119o00O0Oo0.oo0o0Oo;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o00O0O0O.OooO00o f53002OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0OO0.OooO0O0 f53003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0O0 f53004OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Oooo0 f53005OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O0ooO.OooO00o f53006OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f53007OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO0OO.OooO0O0 f53008OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final o0OO00O f53009OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f53010OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooOo f53011OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f53012OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final List<o00O0O00.OooO0O0> f53013OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f53014OooOOO0;

    @DebugMetadata(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f53015Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o f53017Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(coil.request.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f53017Oooo0oo = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooOOO0.this.new OooO00o(this.f53017Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53015Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOO0 oooOOO0 = OooOOO0.this;
                coil.request.OooO00o oooO00o = this.f53017Oooo0oo;
                this.f53015Oooo0o = 1;
                obj = OooOOO0.OooO0Oo(oooOOO0, oooO00o, 0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o00O0OO0.OooOOO0 oooOOO1 = (o00O0OO0.OooOOO0) obj;
            if (oooOOO1 instanceof o00O0OO0.OooO) {
                throw ((o00O0OO0.OooO) oooOOO1).f30553OooO0OO;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o00O0OO0.OooOOO0>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f53018Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o f53020Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(coil.request.OooO00o oooO00o, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f53020Oooo0oo = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooOOO0.this.new OooO0O0(this.f53020Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o00O0OO0.OooOOO0> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53018Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOO0 oooOOO0 = OooOOO0.this;
                coil.request.OooO00o oooO00o = this.f53020Oooo0oo;
                this.f53018Oooo0o = 1;
                obj = OooOOO0.OooO0Oo(oooOOO0, oooO00o, 1, this);
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

    public OooOOO0(@NotNull Context context, @NotNull o00O0OO0.OooO0O0 defaults, @NotNull p113o00O00Oo.OooO0O0 bitmapPool, @NotNull Oooo0 memoryCache, @NotNull o0O0ooO.OooO00o callFactory, @NotNull OooO0OO.OooO0O0 eventListenerFactory, @NotNull oOO00O.OooO0O0 componentRegistry, @NotNull o0Oo0oo options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        Intrinsics.checkNotNullParameter(componentRegistry, "componentRegistry");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f53003OooO00o = defaults;
        this.f53004OooO0O0 = bitmapPool;
        this.f53005OooO0OO = memoryCache;
        this.f53006OooO0Oo = callFactory;
        this.f53008OooO0o0 = eventListenerFactory;
        this.f53007OooO0o = options;
        this.f53009OooO0oO = null;
        this.f53010OooO0oo = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new OooOOOO(CoroutineExceptionHandler.INSTANCE, this)));
        this.f53002OooO = new o00O0O0O.OooO00o(this, memoryCache.f30501OooO0OO);
        OooOo oooOo = new OooOo(memoryCache.f30501OooO0OO, memoryCache.f30499OooO00o, memoryCache.f30500OooO0O0);
        this.f53011OooOO0 = oooOo;
        o00Oo0 o00oo1 = new o00Oo0();
        this.f53012OooOO0O = o00oo1;
        o000oOoO o000oooo2 = new o000oOoO(bitmapPool);
        oo0o0Oo oo0o0oo = new oo0o0Oo(this, context, options.f30758OooO0OO);
        oOO00O.OooO0O0.OooO00o oooO00o = new oOO00O.OooO0O0.OooO00o(componentRegistry);
        oooO00o.OooO0OO(new o00O0O0.OooO(), String.class);
        oooO00o.OooO0OO(new o00O0O0.OooO00o(), Uri.class);
        oooO00o.OooO0OO(new o00O0O0.OooO0o(context), Uri.class);
        oooO00o.OooO0OO(new o00O0O0.OooO0OO(context), Integer.class);
        oooO00o.OooO00o(new OooOo00(callFactory), Uri.class);
        oooO00o.OooO00o(new o00O0.OooOo(callFactory), o00OO000.class);
        oooO00o.OooO00o(new o00O0.OooOOO0(options.f30756OooO00o), File.class);
        oooO00o.OooO00o(new o00O0.OooO00o(context), Uri.class);
        oooO00o.OooO00o(new o00O0.OooO0OO(context), Uri.class);
        oooO00o.OooO00o(new Oooo000(context, o000oooo2), Uri.class);
        oooO00o.OooO00o(new o00O0.OooO0o(o000oooo2), Drawable.class);
        oooO00o.OooO00o(new o00O0.OooO0O0(), Bitmap.class);
        oooO00o.OooO0O0(new p115o00O00oO.OooOo00(context));
        oOO00O.OooO0O0 oooO0O0OooO0Oo = oooO00o.OooO0Oo();
        this.f53013OooOO0o = CollectionsKt.plus((Collection<? extends o00O0O00.OooO00o>) oooO0O0OooO0Oo.f52969OooO00o, new o00O0O00.OooO00o(oooO0O0OooO0Oo, bitmapPool, memoryCache.f30501OooO0OO, memoryCache.f30499OooO00o, oooOo, o00oo1, oo0o0oo, o000oooo2));
        this.f53014OooOOO0 = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b4 A[Catch: all -> 0x04a1, TryCatch #1 {all -> 0x04a1, blocks: (B:86:0x0269, B:100:0x02ae, B:102:0x02b4, B:103:0x02b7, B:89:0x0275), top: B:253:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f8 A[Catch: all -> 0x0310, TryCatch #7 {all -> 0x0310, blocks: (B:107:0x02d9, B:109:0x02f8, B:115:0x0313, B:206:0x0497, B:208:0x049d, B:209:0x04a0, B:90:0x0279, B:95:0x0292, B:96:0x029e, B:99:0x02a9, B:93:0x0280), top: B:264:0x0279, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x030c  */
    /* JADX WARN: Code duplicated, block: B:112:0x030e A[PHI: r0
      0x030e: PHI (r0v56 java.lang.Object) = (r0v55 java.lang.Object), (r0v57 java.lang.Object) binds: [B:116:0x032d, B:110:0x030a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0313 A[Catch: all -> 0x0310, TRY_LEAVE, TryCatch #7 {all -> 0x0310, blocks: (B:107:0x02d9, B:109:0x02f8, B:115:0x0313, B:206:0x0497, B:208:0x049d, B:209:0x04a0, B:90:0x0279, B:95:0x0292, B:96:0x029e, B:99:0x02a9, B:93:0x0280), top: B:264:0x0279, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x033d A[Catch: all -> 0x048a, TRY_LEAVE, TryCatch #4 {all -> 0x048a, blocks: (B:119:0x0336, B:121:0x033d), top: B:258:0x0336 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x034a  */
    /* JADX WARN: Code duplicated, block: B:125:0x034b A[Catch: all -> 0x037f, TryCatch #16 {all -> 0x037f, blocks: (B:122:0x0340, B:142:0x0384, B:125:0x034b, B:127:0x0352, B:136:0x036d, B:137:0x0372, B:138:0x0373, B:141:0x0382), top: B:278:0x0340 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0352 A[Catch: all -> 0x037f, TryCatch #16 {all -> 0x037f, blocks: (B:122:0x0340, B:142:0x0384, B:125:0x034b, B:127:0x0352, B:136:0x036d, B:137:0x0372, B:138:0x0373, B:141:0x0382), top: B:278:0x0340 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0363  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b6 A[Catch: all -> 0x03e0, TRY_LEAVE, TryCatch #0 {all -> 0x03e0, blocks: (B:146:0x03ae, B:149:0x03b6), top: B:251:0x03ae }] */
    /* JADX WARN: Code duplicated, block: B:152:0x03c3 A[Catch: all -> 0x03da, TryCatch #15 {all -> 0x03da, blocks: (B:150:0x03bb, B:152:0x03c3, B:154:0x03c7, B:157:0x03d0), top: B:276:0x03bb }] */
    /* JADX WARN: Code duplicated, block: B:167:0x03f9 A[Catch: all -> 0x040e, TryCatch #6 {all -> 0x040e, blocks: (B:165:0x03f1, B:167:0x03f9, B:169:0x03fd, B:172:0x0406, B:173:0x040d), top: B:262:0x03f1 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0416 A[Catch: all -> 0x0435, TryCatch #10 {all -> 0x0435, blocks: (B:176:0x0412, B:178:0x0416, B:187:0x0439, B:181:0x0420, B:183:0x0427, B:186:0x0437), top: B:267:0x0412 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x041f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0420 A[Catch: all -> 0x0435, TryCatch #10 {all -> 0x0435, blocks: (B:176:0x0412, B:178:0x0416, B:187:0x0439, B:181:0x0420, B:183:0x0427, B:186:0x0437), top: B:267:0x0412 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0427 A[Catch: all -> 0x0435, TryCatch #10 {all -> 0x0435, blocks: (B:176:0x0412, B:178:0x0416, B:187:0x0439, B:181:0x0420, B:183:0x0427, B:186:0x0437), top: B:267:0x0412 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0457  */
    /* JADX WARN: Code duplicated, block: B:193:0x046a  */
    /* JADX WARN: Code duplicated, block: B:194:0x046b A[Catch: all -> 0x0474, TRY_LEAVE, TryCatch #9 {all -> 0x0474, blocks: (B:191:0x0461, B:194:0x046b), top: B:265:0x0461 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x047a A[PHI: r0 r6
      0x047a: PHI (r0v87 o00O0OO0.OooOOO0) = (r0v62 o00O0OO0.OooOOO0), (r0v91 o00O0OO0.OooOOO0) binds: [B:177:0x0414, B:195:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r6v38 coil.memory.RequestDelegate) = (r6v43 coil.memory.RequestDelegate), (r6v44 coil.memory.RequestDelegate) binds: [B:177:0x0414, B:195:0x0472] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x04c7 A[Catch: all -> 0x0050, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:241:0x0531, B:244:0x053b, B:217:0x04c3, B:219:0x04c7, B:225:0x04dd, B:229:0x04e8, B:228:0x04e5, B:222:0x04cc, B:224:0x04d3, B:230:0x04e9, B:237:0x050c, B:233:0x04f6, B:235:0x04fd, B:236:0x050a), top: B:257:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x04cc A[Catch: all -> 0x0050, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:241:0x0531, B:244:0x053b, B:217:0x04c3, B:219:0x04c7, B:225:0x04dd, B:229:0x04e8, B:228:0x04e5, B:222:0x04cc, B:224:0x04d3, B:230:0x04e9, B:237:0x050c, B:233:0x04f6, B:235:0x04fd, B:236:0x050a), top: B:257:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:227:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:228:0x04e5 A[Catch: all -> 0x0050, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:241:0x0531, B:244:0x053b, B:217:0x04c3, B:219:0x04c7, B:225:0x04dd, B:229:0x04e8, B:228:0x04e5, B:222:0x04cc, B:224:0x04d3, B:230:0x04e9, B:237:0x050c, B:233:0x04f6, B:235:0x04fd, B:236:0x050a), top: B:257:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:230:0x04e9 A[Catch: all -> 0x0050, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:241:0x0531, B:244:0x053b, B:217:0x04c3, B:219:0x04c7, B:225:0x04dd, B:229:0x04e8, B:228:0x04e5, B:222:0x04cc, B:224:0x04d3, B:230:0x04e9, B:237:0x050c, B:233:0x04f6, B:235:0x04fd, B:236:0x050a), top: B:257:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:232:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:233:0x04f6 A[Catch: all -> 0x0050, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:241:0x0531, B:244:0x053b, B:217:0x04c3, B:219:0x04c7, B:225:0x04dd, B:229:0x04e8, B:228:0x04e5, B:222:0x04cc, B:224:0x04d3, B:230:0x04e9, B:237:0x050c, B:233:0x04f6, B:235:0x04fd, B:236:0x050a), top: B:257:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:235:0x04fd A[Catch: all -> 0x0050, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:241:0x0531, B:244:0x053b, B:217:0x04c3, B:219:0x04c7, B:225:0x04dd, B:229:0x04e8, B:228:0x04e5, B:222:0x04cc, B:224:0x04d3, B:230:0x04e9, B:237:0x050c, B:233:0x04f6, B:235:0x04fd, B:236:0x050a), top: B:257:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:239:0x052d  */
    /* JADX WARN: Code duplicated, block: B:240:0x052e  */
    /* JADX WARN: Code duplicated, block: B:243:0x053a  */
    /* JADX WARN: Code duplicated, block: B:244:0x053b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:241:0x0531, B:244:0x053b, B:217:0x04c3, B:219:0x04c7, B:225:0x04dd, B:229:0x04e8, B:228:0x04e5, B:222:0x04cc, B:224:0x04d3, B:230:0x04e9, B:237:0x050c, B:233:0x04f6, B:235:0x04fd, B:236:0x050a), top: B:257:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:267:0x0412 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0273  */
    /* JADX WARN: Code duplicated, block: B:89:0x0275 A[Catch: all -> 0x04a1, TRY_LEAVE, TryCatch #1 {all -> 0x04a1, blocks: (B:86:0x0269, B:100:0x02ae, B:102:0x02b4, B:103:0x02b7, B:89:0x0275), top: B:253:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x027e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0280 A[Catch: all -> 0x0496, TryCatch #12 {all -> 0x0496, blocks: (B:90:0x0279, B:95:0x0292, B:96:0x029e, B:99:0x02a9, B:93:0x0280), top: B:264:0x0279, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0292 A[Catch: all -> 0x0496, TryCatch #12 {all -> 0x0496, blocks: (B:90:0x0279, B:95:0x0292, B:96:0x029e, B:99:0x02a9, B:93:0x0280), top: B:264:0x0279, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a9 A[Catch: all -> 0x0496, TRY_LEAVE, TryCatch #12 {all -> 0x0496, blocks: (B:90:0x0279, B:95:0x0292, B:96:0x029e, B:99:0x02a9, B:93:0x0280), top: B:264:0x0279, outer: #7 }] */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x032d, code lost:
    
        if (r0 == r5) goto L246;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r12v34, types: [oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v43, types: [oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v23, types: [oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v31, types: [oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r22v0, types: [oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [coil.memory.RequestDelegate, int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29, types: [oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [o00O0O0O.oo000o] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v32, types: [oOO00O.OooOOO0] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v23, types: [oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r8v25, types: [oOO00O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v7 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(OooOOO0 oooOOO0, coil.request.OooO00o oooO00o, int i, Continuation continuation) {
        OooOOO oooOOO;
        ?? r13;
        coil.request.OooO00o oooO00o2;
        ?? r2;
        coil.request.OooO00o oooO00o3;
        ?? r12;
        ?? r6;
        ?? r14;
        o00O0OO0.OooO oooOOooO00o;
        coil.request.OooO00o oooO00o4;
        o0OO00O o0oo00o2;
        o00O0OO0.OooO oooO;
        coil.request.OooO00o oooO00o5;
        ?? r4;
        o0OO00O o0oo00o3;
        coil.request.OooO00o.OooO0O0 oooO0O0;
        Object obj;
        ?? r3;
        coil.request.OooO00o.OooO0O0 oooO0O1;
        oo000o targetDelegate;
        RequestDelegate requestDelegate;
        ?? r0;
        oo000o oo000oVar;
        coil.request.OooO00o oooO00o6;
        ?? r15;
        RequestDelegate requestDelegate2;
        ?? r1;
        RequestDelegate requestDelegate3;
        ?? r16;
        ?? r17;
        oo000o oo000oVar2;
        Oooo0.OooO00o OooO00o2;
        Bitmap bitmapOooO0O0;
        Drawable bitmapDrawable;
        coil.request.OooO00o.OooO0O0 oooO0O2;
        p113o00O00Oo.OooO0o oooO0o;
        Object objOooO0O0;
        ?? r18;
        Bitmap bitmap;
        ?? r7;
        ?? r19;
        ?? r110;
        oo000o oo000oVar3;
        RequestDelegate requestDelegate4;
        o00O0O00.OooO0OO oooO0OO;
        Object objWithContext;
        RequestDelegate requestDelegate5;
        oo000o oo000oVar4;
        ?? r111;
        ?? r112;
        coil.request.OooO00o oooO00o7;
        oo000o oo000oVar5;
        ?? r8;
        ?? r113;
        o00O0OO0.OooOOO0 oooOOO1;
        o00O0OO0.OooO oooO2;
        coil.request.OooO00o oooO00o8;
        o0OO00O o0oo00o4;
        o00O0OO0.OooO oooO3;
        ?? r9;
        ?? r114;
        o00O0OO0.OooOOO0 oooOOO2;
        coil.request.OooO00o oooO00o9;
        oo000o oo000oVar6;
        o00O0OO0.OooOo00 oooOo00;
        coil.request.OooO00o oooO00o10;
        ?? r5;
        oo000o oo000oVar7;
        RequestDelegate requestDelegate6;
        coil.request.OooO00o oooO00o11;
        o00O0OO0.OooOOO0.OooO00o oooO00o12;
        DataSource dataSource;
        o0OO00O o0oo00o5;
        int i2;
        o00O0OO0.OooOOO0 oooOOO3;
        oo000o oo000oVar8;
        o00O0OO0.OooOo00 oooOo01;
        RequestDelegate requestDelegate7;
        ?? r10;
        o00O0OO0.OooOOO0.OooO00o oooO00o13;
        coil.request.OooO00o oooO00o14;
        coil.request.OooO00o oooO00o15;
        ?? r115;
        ?? r116;
        p113o00O00Oo.OooO0o oooO0o2;
        Drawable drawable;
        Bitmap bitmap2;
        ?? r117;
        coil.request.OooO00o oooO00o16;
        ?? r118;
        ?? r119;
        coil.request.OooO00o.OooO0O0 oooO0O3;
        p113o00O00Oo.OooO0o oooO0o3;
        Drawable drawable2;
        o00O0OO0.OooOOO0 oooOOO4;
        Bitmap bitmap3;
        RequestDelegate requestDelegate8;
        oo000o oo000oVar9;
        coil.request.OooO00o oooO00o17;
        ?? r120;
        ?? r11;
        ?? r121;
        ?? r122;
        RequestDelegate requestDelegate9;
        oo000o oo000oVar10;
        RequestDelegate requestDelegate10;
        RequestDelegate requestDelegate11;
        RequestDelegate requestDelegate12;
        coil.request.OooO00o.OooO0O0 oooO0O4;
        ?? r20 = oooOOO0;
        ?? r21 = i;
        Objects.requireNonNull(oooOOO0);
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i3 = oooOOO.f53000OoooOoO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOOO.f53000OoooOoO = i3 - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(r20, continuation);
            }
        } else {
            oooOOO = new OooOOO(r20, continuation);
        }
        Object obj2 = oooOOO.f52998OoooOOo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? eventListener = oooOOO.f53000OoooOoO;
        try {
            try {
                switch (eventListener) {
                    case 0:
                        ResultKt.throwOnFailure(obj2);
                        if (!(!r20.f53014OooOOO0.get())) {
                            throw new IllegalStateException("The image loader is shutdown.".toString());
                        }
                        Context context = oooO00o.f9876OooO00o;
                        Intrinsics.checkNotNullParameter(context, "context");
                        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o(oooO00o, context);
                        o00O0OO0.OooO0O0 defaults = r20.f53003OooO00o;
                        Intrinsics.checkNotNullParameter(defaults, "defaults");
                        c0072OooO00o.f9911OooO0O0 = defaults;
                        c0072OooO00o.f9944Oooo0O0 = null;
                        coil.request.OooO00o request = c0072OooO00o.OooO00o();
                        eventListener = (OooO0OO) ((OooO0o) r20.f53008OooO0o0).f52979OooO0Oo;
                        Intrinsics.checkNotNullParameter(eventListener, "$listener");
                        Intrinsics.checkNotNullParameter(request, "it");
                        o00O0O0O.OooO00o oooO00o18 = r20.f53002OooO;
                        o00O0OO.OooO0O0 oooO0O5 = request.f9878OooO0OO;
                        Objects.requireNonNull(oooO00o18);
                        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
                        if (r21 != 0) {
                            if (r21 != 1) {
                                throw new IllegalStateException("Invalid type.".toString());
                            }
                            targetDelegate = oooO0O5 == null ? new o00O0O0O.OooOOO(oooO00o18.f30470OooO0O0) : new o00O0O0O.OooOOOO(oooO0O5, oooO00o18.f30470OooO0O0, eventListener, oooO00o18.f30471OooO0OO);
                        } else if (oooO0O5 == null) {
                            targetDelegate = o00O0O0O.OooO0OO.f30473OooO00o;
                        } else {
                            targetDelegate = oooO0O5 instanceof o00O0OO.OooO00o ? new o00O0O0O.Oooo000((o00O0OO.OooO00o) oooO0O5, oooO00o18.f30470OooO0O0, eventListener, oooO00o18.f30471OooO0OO) : new o00O0O0O.OooOOOO(oooO0O5, oooO00o18.f30470OooO0O0, eventListener, oooO00o18.f30471OooO0OO);
                        }
                        o00O0O0O.OooO00o oooO00o19 = r20.f53002OooO;
                        CoroutineContext.Element element = oooOOO.getContext().get(Job.INSTANCE);
                        Intrinsics.checkNotNull(element);
                        Job job = (Job) element;
                        Objects.requireNonNull(oooO00o19);
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(targetDelegate, "targetDelegate");
                        Intrinsics.checkNotNullParameter(job, "job");
                        Lifecycle lifecycle = request.f9888OooOOO0;
                        o00O0OO.OooO0O0 oooO0O6 = request.f9878OooO0OO;
                        if (oooO0O6 instanceof o00O0OO.OooO0OO) {
                            ViewTargetRequestDelegate viewTargetRequestDelegate = new ViewTargetRequestDelegate(oooO00o19.f30469OooO00o, request, targetDelegate, job);
                            lifecycle.addObserver(viewTargetRequestDelegate);
                            if (oooO0O6 instanceof LifecycleObserver) {
                                LifecycleObserver lifecycleObserver = (LifecycleObserver) oooO0O6;
                                lifecycle.removeObserver(lifecycleObserver);
                                lifecycle.addObserver(lifecycleObserver);
                            }
                            o00O0OO.OooO0OO oooO0OO2 = (o00O0OO.OooO0OO) oooO0O6;
                            o00oO0o o00oo0oOooO0OO = o00O0O.OooO0OO(oooO0OO2.getView());
                            if (o00oo0oOooO0OO.f30539Oooo) {
                                o00oo0oOooO0OO.f30539Oooo = false;
                            }
                            ViewTargetRequestDelegate viewTargetRequestDelegate2 = o00oo0oOooO0OO.f30540Oooo0o;
                            if (viewTargetRequestDelegate2 != null) {
                                viewTargetRequestDelegate2.OooO0O0();
                            }
                            o00oo0oOooO0OO.f30540Oooo0o = viewTargetRequestDelegate;
                            o00oo0oOooO0OO.f30544OoooO00 = true;
                            View view = oooO0OO2.getView();
                            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                            requestDelegate = viewTargetRequestDelegate;
                            if (!ViewCompat.OooOO0O.OooO0O0(view)) {
                                o00O0O.OooO0OO(oooO0OO2.getView()).onViewDetachedFromWindow(oooO0OO2.getView());
                                requestDelegate = viewTargetRequestDelegate;
                            }
                        } else {
                            BaseRequestDelegate baseRequestDelegate = new BaseRequestDelegate(lifecycle, job);
                            lifecycle.addObserver(baseRequestDelegate);
                            requestDelegate = baseRequestDelegate;
                        }
                        try {
                            if (Intrinsics.areEqual(request.f9877OooO0O0, o00O0OO0.OooOOO.f30583OooO00o)) {
                                throw new NullRequestDataException();
                            }
                            try {
                                try {
                                    try {
                                        if (r21 == 0) {
                                            try {
                                                Lifecycle lifecycle2 = request.f9888OooOOO0;
                                                if (!lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                                                    oooOOO.f52989Oooo0o = r20;
                                                    oooOOO.f52990Oooo0oO = request;
                                                    oooOOO.f52991Oooo0oo = eventListener;
                                                    oooOOO.f52988Oooo = targetDelegate;
                                                    oooOOO.f52994OoooO00 = requestDelegate;
                                                    oooOOO.f52997OoooOOO = r21;
                                                    oooOOO.f53000OoooOoO = 1;
                                                    if (Lifecycles.OooO00o(lifecycle2, oooOOO) != coroutine_suspended) {
                                                        obj = coroutine_suspended;
                                                        r0 = r21;
                                                        oo000oVar = targetDelegate;
                                                        oooO00o6 = request;
                                                        r15 = r20;
                                                        requestDelegate2 = requestDelegate;
                                                        r7 = eventListener;
                                                        oo000o oo000oVar11 = oo000oVar;
                                                        requestDelegate3 = requestDelegate2;
                                                        oooO00o3 = oooO00o6;
                                                        r17 = r7;
                                                        oo000oVar2 = oo000oVar11;
                                                        r1 = r0;
                                                        r16 = r15;
                                                        OooO00o2 = r16.f53011OooOO0.OooO00o(oooO00o3.f9880OooO0o);
                                                        if (OooO00o2 == null) {
                                                            bitmapOooO0O0 = null;
                                                        } else {
                                                            bitmapOooO0O0 = OooO00o2.OooO0O0();
                                                        }
                                                        o00O0O.OooO0o0(oo000oVar2);
                                                        if (bitmapOooO0O0 == null) {
                                                            bitmapDrawable = null;
                                                        } else {
                                                            Resources resources = oooO00o3.f9876OooO00o.getResources();
                                                            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                                                            bitmapDrawable = new BitmapDrawable(resources, bitmapOooO0O0);
                                                        }
                                                        if (bitmapDrawable == null) {
                                                            bitmapDrawable = o0ooOOo.OooO0OO(oooO00o3, oooO00o3.f9903OooOoo0, oooO00o3.f9901OooOoOO, oooO00o3.f9908Oooo00o.f30563OooO0oO);
                                                        }
                                                        oo000oVar2.OooO0Oo(bitmapDrawable, bitmapOooO0O0);
                                                        r17.OooO0O0(oooO00o3);
                                                        oooO0O2 = oooO00o3.f9879OooO0Oo;
                                                        if (oooO0O2 != null) {
                                                            oooO0O2.OooO0O0(oooO00o3);
                                                            Unit unit = Unit.INSTANCE;
                                                            break;
                                                        }
                                                        oooO0o = r16.f53005OooO0OO.f30501OooO0OO;
                                                        if (bitmapOooO0O0 != null) {
                                                            oooO0o.OooO0O0(bitmapOooO0O0);
                                                        }
                                                        r17.OooOOO0(oooO00o3);
                                                        oo0o0O0.OooO0o oooO0o4 = oooO00o3.f9887OooOOO;
                                                        oooOOO.f52989Oooo0o = r16;
                                                        oooOOO.f52990Oooo0oO = oooO00o3;
                                                        oooOOO.f52991Oooo0oo = r17;
                                                        oooOOO.f52988Oooo = oo000oVar2;
                                                        oooOOO.f52994OoooO00 = requestDelegate3;
                                                        oooOOO.f52993OoooO0 = bitmapOooO0O0;
                                                        oooOOO.f52997OoooOOO = r1;
                                                        oooOOO.f53000OoooOoO = 2;
                                                        objOooO0O0 = oooO0o4.OooO0O0(oooOOO);
                                                        obj = coroutine_suspended;
                                                        if (objOooO0O0 != coroutine_suspended) {
                                                            r18 = r1;
                                                            bitmap = bitmapOooO0O0;
                                                            obj2 = objOooO0O0;
                                                            requestDelegate4 = requestDelegate3;
                                                            oo000oVar3 = oo000oVar2;
                                                            r110 = r17;
                                                            r19 = r16;
                                                            Size size = (Size) obj2;
                                                            r110.OooOOOo(oooO00o3, size);
                                                            oooO0OO = new o00O0O00.OooO0OO(oooO00o3, r18, r19.f53013OooOO0o, 0, oooO00o3, size, bitmap, r110);
                                                            if (r19.f53007OooO0o.f30757OooO0O0) {
                                                                CoroutineDispatcher coroutineDispatcher = oooO00o3.f9890OooOOOo;
                                                                RealImageLoader$executeChain$2 realImageLoader$executeChain$2 = new RealImageLoader$executeChain$2(oooO0OO, oooO00o3, null);
                                                                oooOOO.f52989Oooo0o = r19;
                                                                oooOOO.f52990Oooo0oO = oooO00o3;
                                                                oooOOO.f52991Oooo0oo = r110;
                                                                oooOOO.f52988Oooo = oo000oVar3;
                                                                oooOOO.f52994OoooO00 = requestDelegate4;
                                                                oooOOO.f52993OoooO0 = null;
                                                                oooOOO.f53000OoooOoO = 4;
                                                                objWithContext = BuildersKt.withContext(coroutineDispatcher, realImageLoader$executeChain$2, oooOOO);
                                                                break;
                                                            } else {
                                                                oooOOO.f52989Oooo0o = r19;
                                                                oooOOO.f52990Oooo0oO = oooO00o3;
                                                                oooOOO.f52991Oooo0oo = r110;
                                                                oooOOO.f52988Oooo = oo000oVar3;
                                                                oooOOO.f52994OoooO00 = requestDelegate4;
                                                                oooOOO.f52993OoooO0 = null;
                                                                oooOOO.f53000OoooOoO = 3;
                                                                objWithContext = oooO0OO.OooO0O0(oooO00o3, oooOOO);
                                                                if (objWithContext == coroutine_suspended) {
                                                                    obj = coroutine_suspended;
                                                                } else {
                                                                    obj = coroutine_suspended;
                                                                    obj2 = objWithContext;
                                                                    oo000o oo000oVar12 = oo000oVar3;
                                                                    requestDelegate5 = requestDelegate4;
                                                                    oo000oVar4 = oo000oVar12;
                                                                    r112 = r110;
                                                                    r111 = r19;
                                                                    try {
                                                                        oooOOO1 = (o00O0OO0.OooOOO0) obj2;
                                                                        if (oooOOO1 instanceof o00O0OO0.OooOo00) {
                                                                            oooOo00 = (o00O0OO0.OooOo00) oooOOO1;
                                                                            try {
                                                                                oooO00o11 = oooOo00.f30593OooO0O0;
                                                                                oooO00o12 = oooOo00.f30594OooO0OO;
                                                                                dataSource = oooO00o12.f30586OooO0OO;
                                                                                o0oo00o5 = r111.f53009OooO0oO;
                                                                                if (o0oo00o5 != null) {
                                                                                    if (o0oo00o5.getLevel() <= 4) {
                                                                                        o00O o00o2 = o00O0O.f30749OooO00o;
                                                                                        Intrinsics.checkNotNullParameter(dataSource, "<this>");
                                                                                        i2 = o00O0O.OooO00o.$EnumSwitchMapping$0[dataSource.ordinal()];
                                                                                        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                                                                                            throw new NoWhenBranchMatchedException();
                                                                                        }
                                                                                        dataSource.name();
                                                                                        Objects.toString(oooO00o11.f9877OooO0O0);
                                                                                        o0oo00o5.OooO00o();
                                                                                    }
                                                                                    Unit unit2 = Unit.INSTANCE;
                                                                                }
                                                                                o00O0O.OooO0o0(oo000oVar4);
                                                                                oooOOO.f52989Oooo0o = r111;
                                                                                oooOOO.f52990Oooo0oO = oooO00o3;
                                                                                oooOOO.f52991Oooo0oo = r112;
                                                                                oooOOO.f52988Oooo = oo000oVar4;
                                                                                oooOOO.f52994OoooO00 = requestDelegate5;
                                                                                oooOOO.f52993OoooO0 = oooOOO1;
                                                                                oooOOO.f52995OoooO0O = r111;
                                                                                oooOOO.f52992OoooO = oooOo00;
                                                                                oooOOO.f52996OoooOO0 = oooO00o11;
                                                                                oooOOO.f53001o000oOoO = oooO00o12;
                                                                                oooOOO.f53000OoooOoO = 5;
                                                                                obj = coroutine_suspended;
                                                                                if (oo000oVar4.OooO0o0(oooOo00, oooOOO) != coroutine_suspended) {
                                                                                    oooOOO3 = oooOOO1;
                                                                                    oo000oVar8 = oo000oVar4;
                                                                                    oooOo01 = oooOo00;
                                                                                    requestDelegate7 = requestDelegate5;
                                                                                    r10 = r111;
                                                                                    oooO00o13 = oooO00o12;
                                                                                    oooO00o14 = oooO00o3;
                                                                                    oooO00o15 = oooO00o11;
                                                                                    r118 = r112;
                                                                                    r119 = r111;
                                                                                    try {
                                                                                        r118.OooO0Oo(oooO00o15, oooO00o13);
                                                                                        oooO0O3 = oooO00o15.f9879OooO0Oo;
                                                                                        if (oooO0O3 == null) {
                                                                                            oooO0O3.OooO0Oo(oooO00o15, oooO00o13);
                                                                                            Unit unit3 = Unit.INSTANCE;
                                                                                            break;
                                                                                        }
                                                                                        try {
                                                                                            oooO0o3 = r10.f53005OooO0OO.f30501OooO0OO;
                                                                                            drawable2 = oooOo01.f30592OooO00o;
                                                                                            if (drawable2 != null && (drawable2 instanceof BitmapDrawable) && (bitmap3 = ((BitmapDrawable) drawable2).getBitmap()) != null) {
                                                                                                Boxing.boxBoolean(oooO0o3.OooO0O0(bitmap3));
                                                                                            }
                                                                                            oooOOO4 = oooOOO3;
                                                                                            requestDelegate10 = requestDelegate7;
                                                                                            requestDelegate10.OooO00o();
                                                                                            obj = oooOOO4;
                                                                                            break;
                                                                                        } catch (Throwable th) {
                                                                                            th = th;
                                                                                            oooO00o3 = oooO00o14;
                                                                                            r2 = requestDelegate7;
                                                                                            r6 = oo000oVar8;
                                                                                            r12 = r118;
                                                                                            r14 = r119;
                                                                                            if (th instanceof CancellationException) {
                                                                                                o0oo00o3 = r14.f53009OooO0oO;
                                                                                                if (o0oo00o3 != null) {
                                                                                                    Intrinsics.stringPlus("🏗  Cancelled - ", oooO00o3.f9877OooO0O0);
                                                                                                    o0oo00o3.OooO00o();
                                                                                                }
                                                                                                r12.OooO00o(oooO00o3);
                                                                                                oooO0O0 = oooO00o3.f9879OooO0Oo;
                                                                                                if (oooO0O0 == null) {
                                                                                                    oooO0O0.OooO00o(oooO00o3);
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                            oooOOooO00o = r14.f53012OooOO0O.OooO00o(oooO00o3, th);
                                                                                            oooO00o4 = oooOOooO00o.f30552OooO0O0;
                                                                                            o0oo00o2 = r14.f53009OooO0oO;
                                                                                            if (o0oo00o2 != null) {
                                                                                                if (o0oo00o2.getLevel() <= 4) {
                                                                                                    Objects.toString(oooO00o4.f9877OooO0O0);
                                                                                                    Objects.toString(oooOOooO00o.f30553OooO0OO);
                                                                                                    o0oo00o2.OooO00o();
                                                                                                }
                                                                                                Unit unit4 = Unit.INSTANCE;
                                                                                            }
                                                                                            o00O0O.OooO0o0(r6);
                                                                                            oooOOO.f52989Oooo0o = r12;
                                                                                            oooOOO.f52990Oooo0oO = r2;
                                                                                            oooOOO.f52991Oooo0oo = oooOOooO00o;
                                                                                            oooOOO.f52988Oooo = oooO00o4;
                                                                                            oooOOO.f52994OoooO00 = null;
                                                                                            oooOOO.f52993OoooO0 = null;
                                                                                            oooOOO.f52995OoooO0O = null;
                                                                                            oooOOO.f52992OoooO = null;
                                                                                            oooOOO.f52996OoooOO0 = null;
                                                                                            oooOOO.f53001o000oOoO = null;
                                                                                            oooOOO.f53000OoooOoO = 7;
                                                                                            if (r6.OooO0O0(oooOOooO00o, oooOOO) == coroutine_suspended) {
                                                                                                obj = coroutine_suspended;
                                                                                            } else {
                                                                                                oooO = oooOOooO00o;
                                                                                                oooO00o5 = oooO00o4;
                                                                                                r4 = r12;
                                                                                                r3 = r2;
                                                                                                r4.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                                                                oooO0O1 = oooO00o5.f9879OooO0Oo;
                                                                                                if (oooO0O1 != null) {
                                                                                                    oooO0O1.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                                                                    Unit unit5 = Unit.INSTANCE;
                                                                                                }
                                                                                                r3.OooO00o();
                                                                                                obj = oooO;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        r117 = r119;
                                                                                        oooO00o16 = oooO00o14;
                                                                                        oooOo00 = oooOo01;
                                                                                        r5 = r10;
                                                                                        requestDelegate6 = requestDelegate7;
                                                                                        oo000oVar7 = oo000oVar8;
                                                                                        oooO00o10 = oooO00o16;
                                                                                        r115 = r117;
                                                                                        r116 = r118;
                                                                                        try {
                                                                                            oooO0o2 = r5.f53005OooO0OO.f30501OooO0OO;
                                                                                            drawable = oooOo00.f30592OooO00o;
                                                                                            if (drawable != null && (drawable instanceof BitmapDrawable) && (bitmap2 = ((BitmapDrawable) drawable).getBitmap()) != null) {
                                                                                                Boxing.boxBoolean(oooO0o2.OooO0O0(bitmap2));
                                                                                            }
                                                                                            throw th;
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            oooO00o3 = oooO00o10;
                                                                                            r2 = requestDelegate6;
                                                                                            r6 = oo000oVar7;
                                                                                            r12 = r116;
                                                                                            r14 = r115;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                oooO00o10 = oooO00o3;
                                                                                r5 = r111;
                                                                                RequestDelegate requestDelegate13 = requestDelegate5;
                                                                                oo000oVar7 = oo000oVar4;
                                                                                requestDelegate6 = requestDelegate13;
                                                                                r116 = r112;
                                                                                r115 = r111;
                                                                                oooO0o2 = r5.f53005OooO0OO.f30501OooO0OO;
                                                                                drawable = oooOo00.f30592OooO00o;
                                                                                if (drawable != null) {
                                                                                    Boxing.boxBoolean(oooO0o2.OooO0O0(bitmap2));
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                requestDelegate11 = requestDelegate5;
                                                                                if (oooOOO1 instanceof o00O0OO0.OooO) {
                                                                                    oooO2 = (o00O0OO0.OooO) oooOOO1;
                                                                                    oooO00o8 = oooO2.f30552OooO0O0;
                                                                                    o0oo00o4 = r111.f53009OooO0oO;
                                                                                    if (o0oo00o4 != null) {
                                                                                        if (o0oo00o4.getLevel() <= 4) {
                                                                                            Objects.toString(oooO00o8.f9877OooO0O0);
                                                                                            Objects.toString(oooO2.f30553OooO0OO);
                                                                                            o0oo00o4.OooO00o();
                                                                                        }
                                                                                        Unit unit6 = Unit.INSTANCE;
                                                                                    }
                                                                                    o00O0O.OooO0o0(oo000oVar4);
                                                                                    oooOOO.f52989Oooo0o = r111;
                                                                                    oooOOO.f52990Oooo0oO = oooO00o3;
                                                                                    oooOOO.f52991Oooo0oo = r112;
                                                                                    oooOOO.f52988Oooo = oo000oVar4;
                                                                                    oooOOO.f52994OoooO00 = requestDelegate5;
                                                                                    oooOOO.f52993OoooO0 = oooOOO1;
                                                                                    oooOOO.f52995OoooO0O = oooO2;
                                                                                    oooOOO.f52992OoooO = oooO00o8;
                                                                                    oooOOO.f53000OoooOoO = 6;
                                                                                    obj = coroutine_suspended;
                                                                                    if (oo000oVar4.OooO0O0(oooO2, oooOOO) != coroutine_suspended) {
                                                                                        oooO00o7 = oooO00o3;
                                                                                        oooO3 = oooO2;
                                                                                        r9 = r112;
                                                                                        r114 = r111;
                                                                                        oo000o oo000oVar13 = oo000oVar4;
                                                                                        oooOOO2 = oooOOO1;
                                                                                        oooO00o9 = oooO00o8;
                                                                                        oo000oVar6 = oo000oVar13;
                                                                                        requestDelegate12 = requestDelegate5;
                                                                                        try {
                                                                                            r9.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                                                            oooO0O4 = oooO00o9.f9879OooO0Oo;
                                                                                            if (oooO0O4 == null) {
                                                                                                oooO0O4.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                                                                Unit unit7 = Unit.INSTANCE;
                                                                                                break;
                                                                                            }
                                                                                            oooOOO1 = oooOOO2;
                                                                                            requestDelegate11 = requestDelegate12;
                                                                                            oooOOO4 = oooOOO1;
                                                                                            requestDelegate10 = requestDelegate11;
                                                                                            requestDelegate10.OooO00o();
                                                                                            obj = oooOOO4;
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                            oo000oVar10 = oo000oVar6;
                                                                                            oooO00o3 = oooO00o7;
                                                                                            r121 = r114;
                                                                                            r122 = r9;
                                                                                            requestDelegate9 = requestDelegate12;
                                                                                            r11 = r122;
                                                                                            r120 = r121;
                                                                                            oooO00o17 = oooO00o3;
                                                                                            RequestDelegate requestDelegate14 = requestDelegate9;
                                                                                            oo000oVar9 = oo000oVar10;
                                                                                            requestDelegate8 = requestDelegate14;
                                                                                            oooO00o3 = oooO00o17;
                                                                                            r14 = r120;
                                                                                            r12 = r11;
                                                                                            r2 = requestDelegate8;
                                                                                            r6 = oo000oVar9;
                                                                                            if (th instanceof CancellationException) {
                                                                                                o0oo00o3 = r14.f53009OooO0oO;
                                                                                                if (o0oo00o3 != null) {
                                                                                                    Intrinsics.stringPlus("🏗  Cancelled - ", oooO00o3.f9877OooO0O0);
                                                                                                    o0oo00o3.OooO00o();
                                                                                                }
                                                                                                r12.OooO00o(oooO00o3);
                                                                                                oooO0O0 = oooO00o3.f9879OooO0Oo;
                                                                                                if (oooO0O0 == null) {
                                                                                                    oooO0O0.OooO00o(oooO00o3);
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                            oooOOooO00o = r14.f53012OooOO0O.OooO00o(oooO00o3, th);
                                                                                            oooO00o4 = oooOOooO00o.f30552OooO0O0;
                                                                                            o0oo00o2 = r14.f53009OooO0oO;
                                                                                            if (o0oo00o2 != null) {
                                                                                                if (o0oo00o2.getLevel() <= 4) {
                                                                                                    Objects.toString(oooO00o4.f9877OooO0O0);
                                                                                                    Objects.toString(oooOOooO00o.f30553OooO0OO);
                                                                                                    o0oo00o2.OooO00o();
                                                                                                }
                                                                                                Unit unit8 = Unit.INSTANCE;
                                                                                            }
                                                                                            o00O0O.OooO0o0(r6);
                                                                                            oooOOO.f52989Oooo0o = r12;
                                                                                            oooOOO.f52990Oooo0oO = r2;
                                                                                            oooOOO.f52991Oooo0oo = oooOOooO00o;
                                                                                            oooOOO.f52988Oooo = oooO00o4;
                                                                                            oooOOO.f52994OoooO00 = null;
                                                                                            oooOOO.f52993OoooO0 = null;
                                                                                            oooOOO.f52995OoooO0O = null;
                                                                                            oooOOO.f52992OoooO = null;
                                                                                            oooOOO.f52996OoooOO0 = null;
                                                                                            oooOOO.f53001o000oOoO = null;
                                                                                            oooOOO.f53000OoooOoO = 7;
                                                                                            if (r6.OooO0O0(oooOOooO00o, oooOOO) == coroutine_suspended) {
                                                                                                obj = coroutine_suspended;
                                                                                            } else {
                                                                                                oooO = oooOOooO00o;
                                                                                                oooO00o5 = oooO00o4;
                                                                                                r4 = r12;
                                                                                                r3 = r2;
                                                                                                r4.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                                                                oooO0O1 = oooO00o5.f9879OooO0Oo;
                                                                                                if (oooO0O1 != null) {
                                                                                                    oooO0O1.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                                                                    Unit unit9 = Unit.INSTANCE;
                                                                                                }
                                                                                                r3.OooO00o();
                                                                                                obj = oooO;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    oooOOO4 = oooOOO1;
                                                                                    requestDelegate10 = requestDelegate11;
                                                                                    requestDelegate10.OooO00o();
                                                                                    obj = oooOOO4;
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                oo000oVar10 = oo000oVar4;
                                                                                requestDelegate9 = requestDelegate5;
                                                                                r122 = r112;
                                                                                r121 = r111;
                                                                                r11 = r122;
                                                                                r120 = r121;
                                                                                oooO00o17 = oooO00o3;
                                                                                RequestDelegate requestDelegate15 = requestDelegate9;
                                                                                oo000oVar9 = oo000oVar10;
                                                                                requestDelegate8 = requestDelegate15;
                                                                                oooO00o3 = oooO00o17;
                                                                                r14 = r120;
                                                                                r12 = r11;
                                                                                r2 = requestDelegate8;
                                                                                r6 = oo000oVar9;
                                                                                if (th instanceof CancellationException) {
                                                                                    o0oo00o3 = r14.f53009OooO0oO;
                                                                                    if (o0oo00o3 != null) {
                                                                                        Intrinsics.stringPlus("🏗  Cancelled - ", oooO00o3.f9877OooO0O0);
                                                                                        o0oo00o3.OooO00o();
                                                                                    }
                                                                                    r12.OooO00o(oooO00o3);
                                                                                    oooO0O0 = oooO00o3.f9879OooO0Oo;
                                                                                    if (oooO0O0 == null) {
                                                                                        oooO0O0.OooO00o(oooO00o3);
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                oooOOooO00o = r14.f53012OooOO0O.OooO00o(oooO00o3, th);
                                                                                oooO00o4 = oooOOooO00o.f30552OooO0O0;
                                                                                o0oo00o2 = r14.f53009OooO0oO;
                                                                                if (o0oo00o2 != null) {
                                                                                    if (o0oo00o2.getLevel() <= 4) {
                                                                                        Objects.toString(oooO00o4.f9877OooO0O0);
                                                                                        Objects.toString(oooOOooO00o.f30553OooO0OO);
                                                                                        o0oo00o2.OooO00o();
                                                                                    }
                                                                                    Unit unit10 = Unit.INSTANCE;
                                                                                }
                                                                                o00O0O.OooO0o0(r6);
                                                                                oooOOO.f52989Oooo0o = r12;
                                                                                oooOOO.f52990Oooo0oO = r2;
                                                                                oooOOO.f52991Oooo0oo = oooOOooO00o;
                                                                                oooOOO.f52988Oooo = oooO00o4;
                                                                                oooOOO.f52994OoooO00 = null;
                                                                                oooOOO.f52993OoooO0 = null;
                                                                                oooOOO.f52995OoooO0O = null;
                                                                                oooOOO.f52992OoooO = null;
                                                                                oooOOO.f52996OoooOO0 = null;
                                                                                oooOOO.f53001o000oOoO = null;
                                                                                oooOOO.f53000OoooOoO = 7;
                                                                                if (r6.OooO0O0(oooOOooO00o, oooOOO) == coroutine_suspended) {
                                                                                    obj = coroutine_suspended;
                                                                                } else {
                                                                                    oooO = oooOOooO00o;
                                                                                    oooO00o5 = oooO00o4;
                                                                                    r4 = r12;
                                                                                    r3 = r2;
                                                                                    r4.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                                                    oooO0O1 = oooO00o5.f9879OooO0Oo;
                                                                                    if (oooO0O1 != null) {
                                                                                        oooO0O1.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                                                        Unit unit11 = Unit.INSTANCE;
                                                                                    }
                                                                                    r3.OooO00o();
                                                                                    obj = oooO;
                                                                                }
                                                                                obj = coroutine_suspended;
                                                                                obj = coroutine_suspended;
                                                                                return obj;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        oooO00o7 = oooO00o3;
                                                                        oo000oVar5 = oo000oVar4;
                                                                        r8 = r112;
                                                                        r113 = r111;
                                                                        requestDelegate8 = requestDelegate5;
                                                                        oo000oVar9 = oo000oVar5;
                                                                        oooO00o17 = oooO00o7;
                                                                        r11 = r8;
                                                                        r120 = r113;
                                                                        oooO00o3 = oooO00o17;
                                                                        r14 = r120;
                                                                        r12 = r11;
                                                                        r2 = requestDelegate8;
                                                                        r6 = oo000oVar9;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                r21 = targetDelegate;
                                                oooO00o2 = request;
                                                r13 = r20;
                                                r20 = requestDelegate;
                                                ?? r23 = r21;
                                                r2 = r20;
                                                oooO00o3 = oooO00o2;
                                                r12 = eventListener;
                                                r6 = r23;
                                                r14 = r13;
                                                if (th instanceof CancellationException) {
                                                    o0oo00o3 = r14.f53009OooO0oO;
                                                    if (o0oo00o3 != null) {
                                                        Intrinsics.stringPlus("🏗  Cancelled - ", oooO00o3.f9877OooO0O0);
                                                        o0oo00o3.OooO00o();
                                                    }
                                                    r12.OooO00o(oooO00o3);
                                                    oooO0O0 = oooO00o3.f9879OooO0Oo;
                                                    if (oooO0O0 == null) {
                                                        oooO0O0.OooO00o(oooO00o3);
                                                    }
                                                    throw th;
                                                }
                                                oooOOooO00o = r14.f53012OooOO0O.OooO00o(oooO00o3, th);
                                                oooO00o4 = oooOOooO00o.f30552OooO0O0;
                                                o0oo00o2 = r14.f53009OooO0oO;
                                                if (o0oo00o2 != null) {
                                                    if (o0oo00o2.getLevel() <= 4) {
                                                        Objects.toString(oooO00o4.f9877OooO0O0);
                                                        Objects.toString(oooOOooO00o.f30553OooO0OO);
                                                        o0oo00o2.OooO00o();
                                                    }
                                                    Unit unit12 = Unit.INSTANCE;
                                                }
                                                o00O0O.OooO0o0(r6);
                                                oooOOO.f52989Oooo0o = r12;
                                                oooOOO.f52990Oooo0oO = r2;
                                                oooOOO.f52991Oooo0oo = oooOOooO00o;
                                                oooOOO.f52988Oooo = oooO00o4;
                                                oooOOO.f52994OoooO00 = null;
                                                oooOOO.f52993OoooO0 = null;
                                                oooOOO.f52995OoooO0O = null;
                                                oooOOO.f52992OoooO = null;
                                                oooOOO.f52996OoooOO0 = null;
                                                oooOOO.f53001o000oOoO = null;
                                                oooOOO.f53000OoooOoO = 7;
                                                if (r6.OooO0O0(oooOOooO00o, oooOOO) == coroutine_suspended) {
                                                    obj = coroutine_suspended;
                                                } else {
                                                    oooO = oooOOooO00o;
                                                    oooO00o5 = oooO00o4;
                                                    r4 = r12;
                                                    r3 = r2;
                                                    r4.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                    oooO0O1 = oooO00o5.f9879OooO0Oo;
                                                    if (oooO0O1 != null) {
                                                        oooO0O1.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                                        Unit unit13 = Unit.INSTANCE;
                                                    }
                                                    r3.OooO00o();
                                                    obj = oooO;
                                                }
                                                obj = coroutine_suspended;
                                                obj = coroutine_suspended;
                                                return obj;
                                            }
                                            obj = coroutine_suspended;
                                            obj = coroutine_suspended;
                                            return obj;
                                        }
                                        o00O0O.OooO0o0(oo000oVar2);
                                        if (bitmapOooO0O0 == null) {
                                            bitmapDrawable = null;
                                        } else {
                                            Resources resources2 = oooO00o3.f9876OooO00o.getResources();
                                            Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
                                            bitmapDrawable = new BitmapDrawable(resources2, bitmapOooO0O0);
                                        }
                                        if (bitmapDrawable == null) {
                                            bitmapDrawable = o0ooOOo.OooO0OO(oooO00o3, oooO00o3.f9903OooOoo0, oooO00o3.f9901OooOoOO, oooO00o3.f9908Oooo00o.f30563OooO0oO);
                                        }
                                        oo000oVar2.OooO0Oo(bitmapDrawable, bitmapOooO0O0);
                                        r17.OooO0O0(oooO00o3);
                                        oooO0O2 = oooO00o3.f9879OooO0Oo;
                                        if (oooO0O2 != null) {
                                            oooO0O2.OooO0O0(oooO00o3);
                                            Unit unit14 = Unit.INSTANCE;
                                            break;
                                        }
                                        oooO0o = r16.f53005OooO0OO.f30501OooO0OO;
                                        if (bitmapOooO0O0 != null) {
                                            oooO0o.OooO0O0(bitmapOooO0O0);
                                        }
                                        r17.OooOOO0(oooO00o3);
                                        oo0o0O0.OooO0o oooO0o5 = oooO00o3.f9887OooOOO;
                                        oooOOO.f52989Oooo0o = r16;
                                        oooOOO.f52990Oooo0oO = oooO00o3;
                                        oooOOO.f52991Oooo0oo = r17;
                                        oooOOO.f52988Oooo = oo000oVar2;
                                        oooOOO.f52994OoooO00 = requestDelegate3;
                                        oooOOO.f52993OoooO0 = bitmapOooO0O0;
                                        oooOOO.f52997OoooOOO = r1;
                                        oooOOO.f53000OoooOoO = 2;
                                        objOooO0O0 = oooO0o5.OooO0O0(oooOOO);
                                        obj = coroutine_suspended;
                                        if (objOooO0O0 != coroutine_suspended) {
                                            r18 = r1;
                                            bitmap = bitmapOooO0O0;
                                            obj2 = objOooO0O0;
                                            requestDelegate4 = requestDelegate3;
                                            oo000oVar3 = oo000oVar2;
                                            r110 = r17;
                                            r19 = r16;
                                            Size size2 = (Size) obj2;
                                            r110.OooOOOo(oooO00o3, size2);
                                            oooO0OO = new o00O0O00.OooO0OO(oooO00o3, r18, r19.f53013OooOO0o, 0, oooO00o3, size2, bitmap, r110);
                                            if (r19.f53007OooO0o.f30757OooO0O0) {
                                                CoroutineDispatcher coroutineDispatcher2 = oooO00o3.f9890OooOOOo;
                                                RealImageLoader$executeChain$2 realImageLoader$executeChain$3 = new RealImageLoader$executeChain$2(oooO0OO, oooO00o3, null);
                                                oooOOO.f52989Oooo0o = r19;
                                                oooOOO.f52990Oooo0oO = oooO00o3;
                                                oooOOO.f52991Oooo0oo = r110;
                                                oooOOO.f52988Oooo = oo000oVar3;
                                                oooOOO.f52994OoooO00 = requestDelegate4;
                                                oooOOO.f52993OoooO0 = null;
                                                oooOOO.f53000OoooOoO = 4;
                                                objWithContext = BuildersKt.withContext(coroutineDispatcher2, realImageLoader$executeChain$3, oooOOO);
                                                break;
                                            } else {
                                                oooOOO.f52989Oooo0o = r19;
                                                oooOOO.f52990Oooo0oO = oooO00o3;
                                                oooOOO.f52991Oooo0oo = r110;
                                                oooOOO.f52988Oooo = oo000oVar3;
                                                oooOOO.f52994OoooO00 = requestDelegate4;
                                                oooOOO.f52993OoooO0 = null;
                                                oooOOO.f53000OoooOoO = 3;
                                                objWithContext = oooO0OO.OooO0O0(oooO00o3, oooOOO);
                                                if (objWithContext == coroutine_suspended) {
                                                    obj = coroutine_suspended;
                                                } else {
                                                    obj = coroutine_suspended;
                                                    obj2 = objWithContext;
                                                    oo000o oo000oVar14 = oo000oVar3;
                                                    requestDelegate5 = requestDelegate4;
                                                    oo000oVar4 = oo000oVar14;
                                                    r112 = r110;
                                                    r111 = r19;
                                                    oooOOO1 = (o00O0OO0.OooOOO0) obj2;
                                                    if (oooOOO1 instanceof o00O0OO0.OooOo00) {
                                                        oooOo00 = (o00O0OO0.OooOo00) oooOOO1;
                                                        oooO00o11 = oooOo00.f30593OooO0O0;
                                                        oooO00o12 = oooOo00.f30594OooO0OO;
                                                        dataSource = oooO00o12.f30586OooO0OO;
                                                        o0oo00o5 = r111.f53009OooO0oO;
                                                        if (o0oo00o5 != null) {
                                                            if (o0oo00o5.getLevel() <= 4) {
                                                                o00O o00o3 = o00O0O.f30749OooO00o;
                                                                Intrinsics.checkNotNullParameter(dataSource, "<this>");
                                                                i2 = o00O0O.OooO00o.$EnumSwitchMapping$0[dataSource.ordinal()];
                                                                if (i2 != 1) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                dataSource.name();
                                                                Objects.toString(oooO00o11.f9877OooO0O0);
                                                                o0oo00o5.OooO00o();
                                                            }
                                                            Unit unit15 = Unit.INSTANCE;
                                                        }
                                                        o00O0O.OooO0o0(oo000oVar4);
                                                        oooOOO.f52989Oooo0o = r111;
                                                        oooOOO.f52990Oooo0oO = oooO00o3;
                                                        oooOOO.f52991Oooo0oo = r112;
                                                        oooOOO.f52988Oooo = oo000oVar4;
                                                        oooOOO.f52994OoooO00 = requestDelegate5;
                                                        oooOOO.f52993OoooO0 = oooOOO1;
                                                        oooOOO.f52995OoooO0O = r111;
                                                        oooOOO.f52992OoooO = oooOo00;
                                                        oooOOO.f52996OoooOO0 = oooO00o11;
                                                        oooOOO.f53001o000oOoO = oooO00o12;
                                                        oooOOO.f53000OoooOoO = 5;
                                                        obj = coroutine_suspended;
                                                        if (oo000oVar4.OooO0o0(oooOo00, oooOOO) != coroutine_suspended) {
                                                            oooOOO3 = oooOOO1;
                                                            oo000oVar8 = oo000oVar4;
                                                            oooOo01 = oooOo00;
                                                            requestDelegate7 = requestDelegate5;
                                                            r10 = r111;
                                                            oooO00o13 = oooO00o12;
                                                            oooO00o14 = oooO00o3;
                                                            oooO00o15 = oooO00o11;
                                                            r118 = r112;
                                                            r119 = r111;
                                                            r118.OooO0Oo(oooO00o15, oooO00o13);
                                                            oooO0O3 = oooO00o15.f9879OooO0Oo;
                                                            if (oooO0O3 == null) {
                                                                oooO0O3.OooO0Oo(oooO00o15, oooO00o13);
                                                                Unit unit16 = Unit.INSTANCE;
                                                                break;
                                                            }
                                                            oooO0o3 = r10.f53005OooO0OO.f30501OooO0OO;
                                                            drawable2 = oooOo01.f30592OooO00o;
                                                            if (drawable2 != null) {
                                                                Boxing.boxBoolean(oooO0o3.OooO0O0(bitmap3));
                                                            }
                                                            oooOOO4 = oooOOO3;
                                                            requestDelegate10 = requestDelegate7;
                                                            requestDelegate10.OooO00o();
                                                            obj = oooOOO4;
                                                        }
                                                        break;
                                                    } else {
                                                        requestDelegate11 = requestDelegate5;
                                                        if (oooOOO1 instanceof o00O0OO0.OooO) {
                                                            oooO2 = (o00O0OO0.OooO) oooOOO1;
                                                            oooO00o8 = oooO2.f30552OooO0O0;
                                                            o0oo00o4 = r111.f53009OooO0oO;
                                                            if (o0oo00o4 != null) {
                                                                if (o0oo00o4.getLevel() <= 4) {
                                                                    Objects.toString(oooO00o8.f9877OooO0O0);
                                                                    Objects.toString(oooO2.f30553OooO0OO);
                                                                    o0oo00o4.OooO00o();
                                                                }
                                                                Unit unit17 = Unit.INSTANCE;
                                                            }
                                                            o00O0O.OooO0o0(oo000oVar4);
                                                            oooOOO.f52989Oooo0o = r111;
                                                            oooOOO.f52990Oooo0oO = oooO00o3;
                                                            oooOOO.f52991Oooo0oo = r112;
                                                            oooOOO.f52988Oooo = oo000oVar4;
                                                            oooOOO.f52994OoooO00 = requestDelegate5;
                                                            oooOOO.f52993OoooO0 = oooOOO1;
                                                            oooOOO.f52995OoooO0O = oooO2;
                                                            oooOOO.f52992OoooO = oooO00o8;
                                                            oooOOO.f53000OoooOoO = 6;
                                                            obj = coroutine_suspended;
                                                            if (oo000oVar4.OooO0O0(oooO2, oooOOO) != coroutine_suspended) {
                                                                oooO00o7 = oooO00o3;
                                                                oooO3 = oooO2;
                                                                r9 = r112;
                                                                r114 = r111;
                                                                oo000o oo000oVar15 = oo000oVar4;
                                                                oooOOO2 = oooOOO1;
                                                                oooO00o9 = oooO00o8;
                                                                oo000oVar6 = oo000oVar15;
                                                                requestDelegate12 = requestDelegate5;
                                                                r9.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                                oooO0O4 = oooO00o9.f9879OooO0Oo;
                                                                if (oooO0O4 == null) {
                                                                    oooO0O4.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                                    Unit unit18 = Unit.INSTANCE;
                                                                    break;
                                                                }
                                                                oooOOO1 = oooOOO2;
                                                                requestDelegate11 = requestDelegate12;
                                                                oooOOO4 = oooOOO1;
                                                                requestDelegate10 = requestDelegate11;
                                                                requestDelegate10.OooO00o();
                                                                obj = oooOOO4;
                                                            }
                                                        } else {
                                                            oooOOO4 = oooOOO1;
                                                            requestDelegate10 = requestDelegate11;
                                                            requestDelegate10.OooO00o();
                                                            obj = oooOOO4;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        r2 = requestDelegate3;
                                        r6 = oo000oVar2;
                                        r12 = r17;
                                        r14 = r16;
                                    }
                                    obj = coroutine_suspended;
                                    obj = coroutine_suspended;
                                    return obj;
                                } catch (Throwable th10) {
                                    p113o00O00Oo.OooO0o oooO0o6 = r16.f53005OooO0OO.f30501OooO0OO;
                                    if (bitmapOooO0O0 != null) {
                                        oooO0o6.OooO0O0(bitmapOooO0O0);
                                    }
                                    throw th10;
                                }
                                OooO00o2 = r16.f53011OooOO0.OooO00o(oooO00o3.f9880OooO0o);
                                if (OooO00o2 == null) {
                                    bitmapOooO0O0 = null;
                                } else {
                                    bitmapOooO0O0 = OooO00o2.OooO0O0();
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                ?? r24 = r17;
                                oooO00o2 = oooO00o3;
                                r20 = requestDelegate3;
                                r21 = oo000oVar2;
                                eventListener = r24;
                                r13 = r16;
                                ?? r25 = r21;
                                r2 = r20;
                                oooO00o3 = oooO00o2;
                                r12 = eventListener;
                                r6 = r25;
                                r14 = r13;
                            }
                            r1 = r21;
                            requestDelegate3 = requestDelegate;
                            r16 = r20;
                            oooO00o3 = request;
                            oo000o oo000oVar16 = targetDelegate;
                            r17 = eventListener;
                            oo000oVar2 = oo000oVar16;
                        } catch (Throwable th12) {
                            th = th12;
                            r2 = requestDelegate;
                            r14 = r20;
                            oooO00o3 = request;
                            oo000o oo000oVar17 = targetDelegate;
                            r12 = eventListener;
                            r6 = oo000oVar17;
                        }
                        if (th instanceof CancellationException) {
                            o0oo00o3 = r14.f53009OooO0oO;
                            if (o0oo00o3 != null && o0oo00o3.getLevel() <= 4) {
                                Intrinsics.stringPlus("🏗  Cancelled - ", oooO00o3.f9877OooO0O0);
                                o0oo00o3.OooO00o();
                            }
                            r12.OooO00o(oooO00o3);
                            oooO0O0 = oooO00o3.f9879OooO0Oo;
                            if (oooO0O0 == null) {
                                oooO0O0.OooO00o(oooO00o3);
                            }
                            throw th;
                        }
                        oooOOooO00o = r14.f53012OooOO0O.OooO00o(oooO00o3, th);
                        oooO00o4 = oooOOooO00o.f30552OooO0O0;
                        o0oo00o2 = r14.f53009OooO0oO;
                        if (o0oo00o2 != null) {
                            if (o0oo00o2.getLevel() <= 4) {
                                Objects.toString(oooO00o4.f9877OooO0O0);
                                Objects.toString(oooOOooO00o.f30553OooO0OO);
                                o0oo00o2.OooO00o();
                            }
                            Unit unit19 = Unit.INSTANCE;
                        }
                        o00O0O.OooO0o0(r6);
                        oooOOO.f52989Oooo0o = r12;
                        oooOOO.f52990Oooo0oO = r2;
                        oooOOO.f52991Oooo0oo = oooOOooO00o;
                        oooOOO.f52988Oooo = oooO00o4;
                        oooOOO.f52994OoooO00 = null;
                        oooOOO.f52993OoooO0 = null;
                        oooOOO.f52995OoooO0O = null;
                        oooOOO.f52992OoooO = null;
                        oooOOO.f52996OoooOO0 = null;
                        oooOOO.f53001o000oOoO = null;
                        oooOOO.f53000OoooOoO = 7;
                        if (r6.OooO0O0(oooOOooO00o, oooOOO) == coroutine_suspended) {
                            obj = coroutine_suspended;
                        } else {
                            oooO = oooOOooO00o;
                            oooO00o5 = oooO00o4;
                            r4 = r12;
                            r3 = r2;
                            r4.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                            oooO0O1 = oooO00o5.f9879OooO0Oo;
                            if (oooO0O1 != null) {
                                oooO0O1.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                Unit unit110 = Unit.INSTANCE;
                            }
                            r3.OooO00o();
                            obj = oooO;
                        }
                        obj = coroutine_suspended;
                        obj = coroutine_suspended;
                        return obj;
                    case 1:
                        int i4 = oooOOO.f52997OoooOOO;
                        RequestDelegate requestDelegate16 = oooOOO.f52994OoooO00;
                        oo000oVar = (oo000o) oooOOO.f52988Oooo;
                        OooO0OO oooO0OO3 = (OooO0OO) oooOOO.f52991Oooo0oo;
                        oooO00o6 = (coil.request.OooO00o) oooOOO.f52990Oooo0oO;
                        OooOOO0 oooOOO5 = (OooOOO0) oooOOO.f52989Oooo0o;
                        ResultKt.throwOnFailure(obj2);
                        r0 = i4;
                        requestDelegate2 = requestDelegate16;
                        r7 = oooO0OO3;
                        r15 = oooOOO5;
                        oo000o oo000oVar18 = oo000oVar;
                        requestDelegate3 = requestDelegate2;
                        oooO00o3 = oooO00o6;
                        r17 = r7;
                        oo000oVar2 = oo000oVar18;
                        r1 = r0;
                        r16 = r15;
                        OooO00o2 = r16.f53011OooOO0.OooO00o(oooO00o3.f9880OooO0o);
                        if (OooO00o2 == null) {
                            bitmapOooO0O0 = null;
                        } else {
                            bitmapOooO0O0 = OooO00o2.OooO0O0();
                        }
                        o00O0O.OooO0o0(oo000oVar2);
                        if (bitmapOooO0O0 == null) {
                            bitmapDrawable = null;
                        } else {
                            Resources resources3 = oooO00o3.f9876OooO00o.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources3, "context.resources");
                            bitmapDrawable = new BitmapDrawable(resources3, bitmapOooO0O0);
                        }
                        if (bitmapDrawable == null) {
                            bitmapDrawable = o0ooOOo.OooO0OO(oooO00o3, oooO00o3.f9903OooOoo0, oooO00o3.f9901OooOoOO, oooO00o3.f9908Oooo00o.f30563OooO0oO);
                        }
                        oo000oVar2.OooO0Oo(bitmapDrawable, bitmapOooO0O0);
                        r17.OooO0O0(oooO00o3);
                        oooO0O2 = oooO00o3.f9879OooO0Oo;
                        if (oooO0O2 != null) {
                            oooO0O2.OooO0O0(oooO00o3);
                            Unit unit111 = Unit.INSTANCE;
                            break;
                        }
                        oooO0o = r16.f53005OooO0OO.f30501OooO0OO;
                        if (bitmapOooO0O0 != null) {
                            oooO0o.OooO0O0(bitmapOooO0O0);
                        }
                        r17.OooOOO0(oooO00o3);
                        oo0o0O0.OooO0o oooO0o7 = oooO00o3.f9887OooOOO;
                        oooOOO.f52989Oooo0o = r16;
                        oooOOO.f52990Oooo0oO = oooO00o3;
                        oooOOO.f52991Oooo0oo = r17;
                        oooOOO.f52988Oooo = oo000oVar2;
                        oooOOO.f52994OoooO00 = requestDelegate3;
                        oooOOO.f52993OoooO0 = bitmapOooO0O0;
                        oooOOO.f52997OoooOOO = r1;
                        oooOOO.f53000OoooOoO = 2;
                        objOooO0O0 = oooO0o7.OooO0O0(oooOOO);
                        obj = coroutine_suspended;
                        if (objOooO0O0 != coroutine_suspended) {
                            r18 = r1;
                            bitmap = bitmapOooO0O0;
                            obj2 = objOooO0O0;
                            requestDelegate4 = requestDelegate3;
                            oo000oVar3 = oo000oVar2;
                            r110 = r17;
                            r19 = r16;
                            Size size3 = (Size) obj2;
                            r110.OooOOOo(oooO00o3, size3);
                            oooO0OO = new o00O0O00.OooO0OO(oooO00o3, r18, r19.f53013OooOO0o, 0, oooO00o3, size3, bitmap, r110);
                            if (r19.f53007OooO0o.f30757OooO0O0) {
                                CoroutineDispatcher coroutineDispatcher3 = oooO00o3.f9890OooOOOo;
                                RealImageLoader$executeChain$2 realImageLoader$executeChain$4 = new RealImageLoader$executeChain$2(oooO0OO, oooO00o3, null);
                                oooOOO.f52989Oooo0o = r19;
                                oooOOO.f52990Oooo0oO = oooO00o3;
                                oooOOO.f52991Oooo0oo = r110;
                                oooOOO.f52988Oooo = oo000oVar3;
                                oooOOO.f52994OoooO00 = requestDelegate4;
                                oooOOO.f52993OoooO0 = null;
                                oooOOO.f53000OoooOoO = 4;
                                objWithContext = BuildersKt.withContext(coroutineDispatcher3, realImageLoader$executeChain$4, oooOOO);
                                break;
                            } else {
                                oooOOO.f52989Oooo0o = r19;
                                oooOOO.f52990Oooo0oO = oooO00o3;
                                oooOOO.f52991Oooo0oo = r110;
                                oooOOO.f52988Oooo = oo000oVar3;
                                oooOOO.f52994OoooO00 = requestDelegate4;
                                oooOOO.f52993OoooO0 = null;
                                oooOOO.f53000OoooOoO = 3;
                                objWithContext = oooO0OO.OooO0O0(oooO00o3, oooOOO);
                                if (objWithContext == coroutine_suspended) {
                                    obj = coroutine_suspended;
                                } else {
                                    obj = coroutine_suspended;
                                    obj2 = objWithContext;
                                    oo000o oo000oVar19 = oo000oVar3;
                                    requestDelegate5 = requestDelegate4;
                                    oo000oVar4 = oo000oVar19;
                                    r112 = r110;
                                    r111 = r19;
                                    oooOOO1 = (o00O0OO0.OooOOO0) obj2;
                                    if (oooOOO1 instanceof o00O0OO0.OooOo00) {
                                        oooOo00 = (o00O0OO0.OooOo00) oooOOO1;
                                        oooO00o11 = oooOo00.f30593OooO0O0;
                                        oooO00o12 = oooOo00.f30594OooO0OO;
                                        dataSource = oooO00o12.f30586OooO0OO;
                                        o0oo00o5 = r111.f53009OooO0oO;
                                        if (o0oo00o5 != null) {
                                            if (o0oo00o5.getLevel() <= 4) {
                                                o00O o00o4 = o00O0O.f30749OooO00o;
                                                Intrinsics.checkNotNullParameter(dataSource, "<this>");
                                                i2 = o00O0O.OooO00o.$EnumSwitchMapping$0[dataSource.ordinal()];
                                                if (i2 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                dataSource.name();
                                                Objects.toString(oooO00o11.f9877OooO0O0);
                                                o0oo00o5.OooO00o();
                                            }
                                            Unit unit112 = Unit.INSTANCE;
                                        }
                                        o00O0O.OooO0o0(oo000oVar4);
                                        oooOOO.f52989Oooo0o = r111;
                                        oooOOO.f52990Oooo0oO = oooO00o3;
                                        oooOOO.f52991Oooo0oo = r112;
                                        oooOOO.f52988Oooo = oo000oVar4;
                                        oooOOO.f52994OoooO00 = requestDelegate5;
                                        oooOOO.f52993OoooO0 = oooOOO1;
                                        oooOOO.f52995OoooO0O = r111;
                                        oooOOO.f52992OoooO = oooOo00;
                                        oooOOO.f52996OoooOO0 = oooO00o11;
                                        oooOOO.f53001o000oOoO = oooO00o12;
                                        oooOOO.f53000OoooOoO = 5;
                                        obj = coroutine_suspended;
                                        if (oo000oVar4.OooO0o0(oooOo00, oooOOO) != coroutine_suspended) {
                                            oooOOO3 = oooOOO1;
                                            oo000oVar8 = oo000oVar4;
                                            oooOo01 = oooOo00;
                                            requestDelegate7 = requestDelegate5;
                                            r10 = r111;
                                            oooO00o13 = oooO00o12;
                                            oooO00o14 = oooO00o3;
                                            oooO00o15 = oooO00o11;
                                            r118 = r112;
                                            r119 = r111;
                                            r118.OooO0Oo(oooO00o15, oooO00o13);
                                            oooO0O3 = oooO00o15.f9879OooO0Oo;
                                            if (oooO0O3 == null) {
                                                oooO0O3.OooO0Oo(oooO00o15, oooO00o13);
                                                Unit unit113 = Unit.INSTANCE;
                                                break;
                                            }
                                            oooO0o3 = r10.f53005OooO0OO.f30501OooO0OO;
                                            drawable2 = oooOo01.f30592OooO00o;
                                            if (drawable2 != null) {
                                                Boxing.boxBoolean(oooO0o3.OooO0O0(bitmap3));
                                            }
                                            oooOOO4 = oooOOO3;
                                            requestDelegate10 = requestDelegate7;
                                            requestDelegate10.OooO00o();
                                            obj = oooOOO4;
                                        }
                                        break;
                                    } else {
                                        requestDelegate11 = requestDelegate5;
                                        if (oooOOO1 instanceof o00O0OO0.OooO) {
                                            oooO2 = (o00O0OO0.OooO) oooOOO1;
                                            oooO00o8 = oooO2.f30552OooO0O0;
                                            o0oo00o4 = r111.f53009OooO0oO;
                                            if (o0oo00o4 != null) {
                                                if (o0oo00o4.getLevel() <= 4) {
                                                    Objects.toString(oooO00o8.f9877OooO0O0);
                                                    Objects.toString(oooO2.f30553OooO0OO);
                                                    o0oo00o4.OooO00o();
                                                }
                                                Unit unit114 = Unit.INSTANCE;
                                            }
                                            o00O0O.OooO0o0(oo000oVar4);
                                            oooOOO.f52989Oooo0o = r111;
                                            oooOOO.f52990Oooo0oO = oooO00o3;
                                            oooOOO.f52991Oooo0oo = r112;
                                            oooOOO.f52988Oooo = oo000oVar4;
                                            oooOOO.f52994OoooO00 = requestDelegate5;
                                            oooOOO.f52993OoooO0 = oooOOO1;
                                            oooOOO.f52995OoooO0O = oooO2;
                                            oooOOO.f52992OoooO = oooO00o8;
                                            oooOOO.f53000OoooOoO = 6;
                                            obj = coroutine_suspended;
                                            if (oo000oVar4.OooO0O0(oooO2, oooOOO) != coroutine_suspended) {
                                                oooO00o7 = oooO00o3;
                                                oooO3 = oooO2;
                                                r9 = r112;
                                                r114 = r111;
                                                oo000o oo000oVar110 = oo000oVar4;
                                                oooOOO2 = oooOOO1;
                                                oooO00o9 = oooO00o8;
                                                oo000oVar6 = oo000oVar110;
                                                requestDelegate12 = requestDelegate5;
                                                r9.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                oooO0O4 = oooO00o9.f9879OooO0Oo;
                                                if (oooO0O4 == null) {
                                                    oooO0O4.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                    Unit unit115 = Unit.INSTANCE;
                                                    break;
                                                }
                                                oooOOO1 = oooOOO2;
                                                requestDelegate11 = requestDelegate12;
                                                oooOOO4 = oooOOO1;
                                                requestDelegate10 = requestDelegate11;
                                                requestDelegate10.OooO00o();
                                                obj = oooOOO4;
                                            }
                                        } else {
                                            oooOOO4 = oooOOO1;
                                            requestDelegate10 = requestDelegate11;
                                            requestDelegate10.OooO00o();
                                            obj = oooOOO4;
                                        }
                                    }
                                }
                            }
                        }
                        obj = coroutine_suspended;
                        obj = coroutine_suspended;
                        return obj;
                    case 2:
                        int i5 = oooOOO.f52997OoooOOO;
                        Bitmap bitmap4 = (Bitmap) oooOOO.f52993OoooO0;
                        RequestDelegate requestDelegate17 = oooOOO.f52994OoooO00;
                        oo000o oo000oVar20 = (oo000o) oooOOO.f52988Oooo;
                        OooO0OO oooO0OO4 = (OooO0OO) oooOOO.f52991Oooo0oo;
                        coil.request.OooO00o oooO00o20 = (coil.request.OooO00o) oooOOO.f52990Oooo0oO;
                        OooOOO0 oooOOO6 = (OooOOO0) oooOOO.f52989Oooo0o;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            r18 = i5;
                            bitmap = bitmap4;
                            oooO00o3 = oooO00o20;
                            r19 = oooOOO6;
                            requestDelegate4 = requestDelegate17;
                            oo000oVar3 = oo000oVar20;
                            r110 = oooO0OO4;
                            Size size4 = (Size) obj2;
                            r110.OooOOOo(oooO00o3, size4);
                            oooO0OO = new o00O0O00.OooO0OO(oooO00o3, r18, r19.f53013OooOO0o, 0, oooO00o3, size4, bitmap, r110);
                            if (r19.f53007OooO0o.f30757OooO0O0) {
                                CoroutineDispatcher coroutineDispatcher4 = oooO00o3.f9890OooOOOo;
                                RealImageLoader$executeChain$2 realImageLoader$executeChain$5 = new RealImageLoader$executeChain$2(oooO0OO, oooO00o3, null);
                                oooOOO.f52989Oooo0o = r19;
                                oooOOO.f52990Oooo0oO = oooO00o3;
                                oooOOO.f52991Oooo0oo = r110;
                                oooOOO.f52988Oooo = oo000oVar3;
                                oooOOO.f52994OoooO00 = requestDelegate4;
                                oooOOO.f52993OoooO0 = null;
                                oooOOO.f53000OoooOoO = 4;
                                objWithContext = BuildersKt.withContext(coroutineDispatcher4, realImageLoader$executeChain$5, oooOOO);
                                break;
                            } else {
                                oooOOO.f52989Oooo0o = r19;
                                oooOOO.f52990Oooo0oO = oooO00o3;
                                oooOOO.f52991Oooo0oo = r110;
                                oooOOO.f52988Oooo = oo000oVar3;
                                oooOOO.f52994OoooO00 = requestDelegate4;
                                oooOOO.f52993OoooO0 = null;
                                oooOOO.f53000OoooOoO = 3;
                                objWithContext = oooO0OO.OooO0O0(oooO00o3, oooOOO);
                                if (objWithContext == coroutine_suspended) {
                                    obj = coroutine_suspended;
                                } else {
                                    obj = coroutine_suspended;
                                    obj2 = objWithContext;
                                    oo000o oo000oVar111 = oo000oVar3;
                                    requestDelegate5 = requestDelegate4;
                                    oo000oVar4 = oo000oVar111;
                                    r112 = r110;
                                    r111 = r19;
                                    oooOOO1 = (o00O0OO0.OooOOO0) obj2;
                                    if (oooOOO1 instanceof o00O0OO0.OooOo00) {
                                        oooOo00 = (o00O0OO0.OooOo00) oooOOO1;
                                        oooO00o11 = oooOo00.f30593OooO0O0;
                                        oooO00o12 = oooOo00.f30594OooO0OO;
                                        dataSource = oooO00o12.f30586OooO0OO;
                                        o0oo00o5 = r111.f53009OooO0oO;
                                        if (o0oo00o5 != null) {
                                            if (o0oo00o5.getLevel() <= 4) {
                                                o00O o00o5 = o00O0O.f30749OooO00o;
                                                Intrinsics.checkNotNullParameter(dataSource, "<this>");
                                                i2 = o00O0O.OooO00o.$EnumSwitchMapping$0[dataSource.ordinal()];
                                                if (i2 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                dataSource.name();
                                                Objects.toString(oooO00o11.f9877OooO0O0);
                                                o0oo00o5.OooO00o();
                                            }
                                            Unit unit116 = Unit.INSTANCE;
                                        }
                                        o00O0O.OooO0o0(oo000oVar4);
                                        oooOOO.f52989Oooo0o = r111;
                                        oooOOO.f52990Oooo0oO = oooO00o3;
                                        oooOOO.f52991Oooo0oo = r112;
                                        oooOOO.f52988Oooo = oo000oVar4;
                                        oooOOO.f52994OoooO00 = requestDelegate5;
                                        oooOOO.f52993OoooO0 = oooOOO1;
                                        oooOOO.f52995OoooO0O = r111;
                                        oooOOO.f52992OoooO = oooOo00;
                                        oooOOO.f52996OoooOO0 = oooO00o11;
                                        oooOOO.f53001o000oOoO = oooO00o12;
                                        oooOOO.f53000OoooOoO = 5;
                                        obj = coroutine_suspended;
                                        if (oo000oVar4.OooO0o0(oooOo00, oooOOO) != coroutine_suspended) {
                                            oooOOO3 = oooOOO1;
                                            oo000oVar8 = oo000oVar4;
                                            oooOo01 = oooOo00;
                                            requestDelegate7 = requestDelegate5;
                                            r10 = r111;
                                            oooO00o13 = oooO00o12;
                                            oooO00o14 = oooO00o3;
                                            oooO00o15 = oooO00o11;
                                            r118 = r112;
                                            r119 = r111;
                                            r118.OooO0Oo(oooO00o15, oooO00o13);
                                            oooO0O3 = oooO00o15.f9879OooO0Oo;
                                            if (oooO0O3 == null) {
                                                oooO0O3.OooO0Oo(oooO00o15, oooO00o13);
                                                Unit unit117 = Unit.INSTANCE;
                                                break;
                                            }
                                            oooO0o3 = r10.f53005OooO0OO.f30501OooO0OO;
                                            drawable2 = oooOo01.f30592OooO00o;
                                            if (drawable2 != null) {
                                                Boxing.boxBoolean(oooO0o3.OooO0O0(bitmap3));
                                            }
                                            oooOOO4 = oooOOO3;
                                            requestDelegate10 = requestDelegate7;
                                            requestDelegate10.OooO00o();
                                            obj = oooOOO4;
                                        }
                                        break;
                                    } else {
                                        requestDelegate11 = requestDelegate5;
                                        if (oooOOO1 instanceof o00O0OO0.OooO) {
                                            oooO2 = (o00O0OO0.OooO) oooOOO1;
                                            oooO00o8 = oooO2.f30552OooO0O0;
                                            o0oo00o4 = r111.f53009OooO0oO;
                                            if (o0oo00o4 != null) {
                                                if (o0oo00o4.getLevel() <= 4) {
                                                    Objects.toString(oooO00o8.f9877OooO0O0);
                                                    Objects.toString(oooO2.f30553OooO0OO);
                                                    o0oo00o4.OooO00o();
                                                }
                                                Unit unit118 = Unit.INSTANCE;
                                            }
                                            o00O0O.OooO0o0(oo000oVar4);
                                            oooOOO.f52989Oooo0o = r111;
                                            oooOOO.f52990Oooo0oO = oooO00o3;
                                            oooOOO.f52991Oooo0oo = r112;
                                            oooOOO.f52988Oooo = oo000oVar4;
                                            oooOOO.f52994OoooO00 = requestDelegate5;
                                            oooOOO.f52993OoooO0 = oooOOO1;
                                            oooOOO.f52995OoooO0O = oooO2;
                                            oooOOO.f52992OoooO = oooO00o8;
                                            oooOOO.f53000OoooOoO = 6;
                                            obj = coroutine_suspended;
                                            if (oo000oVar4.OooO0O0(oooO2, oooOOO) != coroutine_suspended) {
                                                oooO00o7 = oooO00o3;
                                                oooO3 = oooO2;
                                                r9 = r112;
                                                r114 = r111;
                                                oo000o oo000oVar112 = oo000oVar4;
                                                oooOOO2 = oooOOO1;
                                                oooO00o9 = oooO00o8;
                                                oo000oVar6 = oo000oVar112;
                                                requestDelegate12 = requestDelegate5;
                                                r9.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                oooO0O4 = oooO00o9.f9879OooO0Oo;
                                                if (oooO0O4 == null) {
                                                    oooO0O4.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                                    Unit unit119 = Unit.INSTANCE;
                                                    break;
                                                }
                                                oooOOO1 = oooOOO2;
                                                requestDelegate11 = requestDelegate12;
                                                oooOOO4 = oooOOO1;
                                                requestDelegate10 = requestDelegate11;
                                                requestDelegate10.OooO00o();
                                                obj = oooOOO4;
                                            }
                                        } else {
                                            oooOOO4 = oooOOO1;
                                            requestDelegate10 = requestDelegate11;
                                            requestDelegate10.OooO00o();
                                            obj = oooOOO4;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            oooO00o3 = oooO00o20;
                            r14 = oooOOO6;
                            r2 = requestDelegate17;
                            r6 = oo000oVar20;
                            r12 = oooO0OO4;
                            break;
                        }
                        obj = coroutine_suspended;
                        obj = coroutine_suspended;
                        return obj;
                    case 3:
                    case 4:
                        RequestDelegate requestDelegate18 = oooOOO.f52994OoooO00;
                        oo000o oo000oVar21 = (oo000o) oooOOO.f52988Oooo;
                        OooO0OO oooO0OO5 = (OooO0OO) oooOOO.f52991Oooo0oo;
                        coil.request.OooO00o oooO00o21 = (coil.request.OooO00o) oooOOO.f52990Oooo0oO;
                        OooOOO0 oooOOO7 = (OooOOO0) oooOOO.f52989Oooo0o;
                        ResultKt.throwOnFailure(obj2);
                        requestDelegate5 = requestDelegate18;
                        oooO00o3 = oooO00o21;
                        r112 = oooO0OO5;
                        oo000oVar4 = oo000oVar21;
                        r111 = oooOOO7;
                        oooOOO1 = (o00O0OO0.OooOOO0) obj2;
                        if (oooOOO1 instanceof o00O0OO0.OooOo00) {
                            oooOo00 = (o00O0OO0.OooOo00) oooOOO1;
                            oooO00o11 = oooOo00.f30593OooO0O0;
                            oooO00o12 = oooOo00.f30594OooO0OO;
                            dataSource = oooO00o12.f30586OooO0OO;
                            o0oo00o5 = r111.f53009OooO0oO;
                            if (o0oo00o5 != null) {
                                if (o0oo00o5.getLevel() <= 4) {
                                    o00O o00o6 = o00O0O.f30749OooO00o;
                                    Intrinsics.checkNotNullParameter(dataSource, "<this>");
                                    i2 = o00O0O.OooO00o.$EnumSwitchMapping$0[dataSource.ordinal()];
                                    if (i2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dataSource.name();
                                    Objects.toString(oooO00o11.f9877OooO0O0);
                                    o0oo00o5.OooO00o();
                                }
                                Unit unit1110 = Unit.INSTANCE;
                            }
                            o00O0O.OooO0o0(oo000oVar4);
                            oooOOO.f52989Oooo0o = r111;
                            oooOOO.f52990Oooo0oO = oooO00o3;
                            oooOOO.f52991Oooo0oo = r112;
                            oooOOO.f52988Oooo = oo000oVar4;
                            oooOOO.f52994OoooO00 = requestDelegate5;
                            oooOOO.f52993OoooO0 = oooOOO1;
                            oooOOO.f52995OoooO0O = r111;
                            oooOOO.f52992OoooO = oooOo00;
                            oooOOO.f52996OoooOO0 = oooO00o11;
                            oooOOO.f53001o000oOoO = oooO00o12;
                            oooOOO.f53000OoooOoO = 5;
                            obj = coroutine_suspended;
                            if (oo000oVar4.OooO0o0(oooOo00, oooOOO) != coroutine_suspended) {
                                oooOOO3 = oooOOO1;
                                oo000oVar8 = oo000oVar4;
                                oooOo01 = oooOo00;
                                requestDelegate7 = requestDelegate5;
                                r10 = r111;
                                oooO00o13 = oooO00o12;
                                oooO00o14 = oooO00o3;
                                oooO00o15 = oooO00o11;
                                r118 = r112;
                                r119 = r111;
                                r118.OooO0Oo(oooO00o15, oooO00o13);
                                oooO0O3 = oooO00o15.f9879OooO0Oo;
                                if (oooO0O3 == null) {
                                    oooO0O3.OooO0Oo(oooO00o15, oooO00o13);
                                    Unit unit1111 = Unit.INSTANCE;
                                    break;
                                }
                                oooO0o3 = r10.f53005OooO0OO.f30501OooO0OO;
                                drawable2 = oooOo01.f30592OooO00o;
                                if (drawable2 != null) {
                                    Boxing.boxBoolean(oooO0o3.OooO0O0(bitmap3));
                                }
                                oooOOO4 = oooOOO3;
                                requestDelegate10 = requestDelegate7;
                                requestDelegate10.OooO00o();
                                obj = oooOOO4;
                            }
                            break;
                        } else {
                            requestDelegate11 = requestDelegate5;
                            if (oooOOO1 instanceof o00O0OO0.OooO) {
                                oooO2 = (o00O0OO0.OooO) oooOOO1;
                                oooO00o8 = oooO2.f30552OooO0O0;
                                o0oo00o4 = r111.f53009OooO0oO;
                                if (o0oo00o4 != null) {
                                    if (o0oo00o4.getLevel() <= 4) {
                                        Objects.toString(oooO00o8.f9877OooO0O0);
                                        Objects.toString(oooO2.f30553OooO0OO);
                                        o0oo00o4.OooO00o();
                                    }
                                    Unit unit1112 = Unit.INSTANCE;
                                }
                                o00O0O.OooO0o0(oo000oVar4);
                                oooOOO.f52989Oooo0o = r111;
                                oooOOO.f52990Oooo0oO = oooO00o3;
                                oooOOO.f52991Oooo0oo = r112;
                                oooOOO.f52988Oooo = oo000oVar4;
                                oooOOO.f52994OoooO00 = requestDelegate5;
                                oooOOO.f52993OoooO0 = oooOOO1;
                                oooOOO.f52995OoooO0O = oooO2;
                                oooOOO.f52992OoooO = oooO00o8;
                                oooOOO.f53000OoooOoO = 6;
                                obj = coroutine_suspended;
                                if (oo000oVar4.OooO0O0(oooO2, oooOOO) != coroutine_suspended) {
                                    oooO00o7 = oooO00o3;
                                    oooO3 = oooO2;
                                    r9 = r112;
                                    r114 = r111;
                                    oo000o oo000oVar113 = oo000oVar4;
                                    oooOOO2 = oooOOO1;
                                    oooO00o9 = oooO00o8;
                                    oo000oVar6 = oo000oVar113;
                                    requestDelegate12 = requestDelegate5;
                                    r9.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                    oooO0O4 = oooO00o9.f9879OooO0Oo;
                                    if (oooO0O4 == null) {
                                        oooO0O4.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                        Unit unit1113 = Unit.INSTANCE;
                                        break;
                                    }
                                    oooOOO1 = oooOOO2;
                                    requestDelegate11 = requestDelegate12;
                                    oooOOO4 = oooOOO1;
                                    requestDelegate10 = requestDelegate11;
                                    requestDelegate10.OooO00o();
                                    obj = oooOOO4;
                                }
                            } else {
                                oooOOO4 = oooOOO1;
                                requestDelegate10 = requestDelegate11;
                                requestDelegate10.OooO00o();
                                obj = oooOOO4;
                            }
                        }
                        obj = coroutine_suspended;
                        obj = coroutine_suspended;
                        return obj;
                    case 5:
                        oooO00o13 = oooOOO.f53001o000oOoO;
                        oooO00o15 = oooOOO.f52996OoooOO0;
                        oooOo01 = (o00O0OO0.OooOo00) oooOOO.f52992OoooO;
                        r10 = (OooOOO0) oooOOO.f52995OoooO0O;
                        oooOOO3 = (o00O0OO0.OooOOO0) oooOOO.f52993OoooO0;
                        requestDelegate7 = oooOOO.f52994OoooO00;
                        oo000oVar8 = (oo000o) oooOOO.f52988Oooo;
                        r118 = (OooO0OO) oooOOO.f52991Oooo0oo;
                        oooO00o16 = (coil.request.OooO00o) oooOOO.f52990Oooo0oO;
                        r117 = (OooOOO0) oooOOO.f52989Oooo0o;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            oooO00o14 = oooO00o16;
                            r119 = r117;
                            r10 = r10;
                            requestDelegate7 = requestDelegate7;
                            oo000oVar8 = oo000oVar8;
                            r118 = r118;
                            r118.OooO0Oo(oooO00o15, oooO00o13);
                            oooO0O3 = oooO00o15.f9879OooO0Oo;
                            if (oooO0O3 == null) {
                                oooO0O3.OooO0Oo(oooO00o15, oooO00o13);
                                Unit unit1114 = Unit.INSTANCE;
                                break;
                            }
                            oooO0o3 = r10.f53005OooO0OO.f30501OooO0OO;
                            drawable2 = oooOo01.f30592OooO00o;
                            if (drawable2 != null) {
                                Boxing.boxBoolean(oooO0o3.OooO0O0(bitmap3));
                                break;
                            }
                            oooOOO4 = oooOOO3;
                            requestDelegate10 = requestDelegate7;
                            requestDelegate10.OooO00o();
                            obj = oooOOO4;
                            obj = coroutine_suspended;
                            obj = coroutine_suspended;
                            return obj;
                        } catch (Throwable th14) {
                            th = th14;
                            oooOo00 = oooOo01;
                            r5 = r10;
                            requestDelegate6 = requestDelegate7;
                            oo000oVar7 = oo000oVar8;
                            oooO00o10 = oooO00o16;
                            r115 = r117;
                            r116 = r118;
                            oooO0o2 = r5.f53005OooO0OO.f30501OooO0OO;
                            drawable = oooOo00.f30592OooO00o;
                            if (drawable != null) {
                                Boxing.boxBoolean(oooO0o2.OooO0O0(bitmap2));
                            }
                            throw th;
                        }
                    case 6:
                        oooO00o9 = (coil.request.OooO00o) oooOOO.f52992OoooO;
                        oooO3 = (o00O0OO0.OooO) oooOOO.f52995OoooO0O;
                        oooOOO2 = (o00O0OO0.OooOOO0) oooOOO.f52993OoooO0;
                        requestDelegate5 = oooOOO.f52994OoooO00;
                        oo000oVar5 = (oo000o) oooOOO.f52988Oooo;
                        r8 = (OooO0OO) oooOOO.f52991Oooo0oo;
                        oooO00o7 = (coil.request.OooO00o) oooOOO.f52990Oooo0oO;
                        r113 = (OooOOO0) oooOOO.f52989Oooo0o;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            requestDelegate12 = requestDelegate5;
                            oo000oVar6 = oo000oVar5;
                            r9 = r8;
                            r114 = r113;
                            r9.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                            oooO0O4 = oooO00o9.f9879OooO0Oo;
                            if (oooO0O4 == null) {
                                oooO0O4.OooO0OO(oooO00o9, oooO3.f30553OooO0OO);
                                Unit unit1115 = Unit.INSTANCE;
                                break;
                            }
                            oooOOO1 = oooOOO2;
                            requestDelegate11 = requestDelegate12;
                            oooOOO4 = oooOOO1;
                            requestDelegate10 = requestDelegate11;
                            requestDelegate10.OooO00o();
                            obj = oooOOO4;
                        } catch (Throwable th15) {
                            th = th15;
                            requestDelegate8 = requestDelegate5;
                            oo000oVar9 = oo000oVar5;
                            oooO00o17 = oooO00o7;
                            r11 = r8;
                            r120 = r113;
                            oooO00o3 = oooO00o17;
                            r14 = r120;
                            r12 = r11;
                            r2 = requestDelegate8;
                            r6 = oo000oVar9;
                            if (th instanceof CancellationException) {
                                o0oo00o3 = r14.f53009OooO0oO;
                                if (o0oo00o3 != null) {
                                    Intrinsics.stringPlus("🏗  Cancelled - ", oooO00o3.f9877OooO0O0);
                                    o0oo00o3.OooO00o();
                                }
                                r12.OooO00o(oooO00o3);
                                oooO0O0 = oooO00o3.f9879OooO0Oo;
                                if (oooO0O0 == null) {
                                    oooO0O0.OooO00o(oooO00o3);
                                }
                                throw th;
                            }
                            oooOOooO00o = r14.f53012OooOO0O.OooO00o(oooO00o3, th);
                            oooO00o4 = oooOOooO00o.f30552OooO0O0;
                            o0oo00o2 = r14.f53009OooO0oO;
                            if (o0oo00o2 != null) {
                                if (o0oo00o2.getLevel() <= 4) {
                                    Objects.toString(oooO00o4.f9877OooO0O0);
                                    Objects.toString(oooOOooO00o.f30553OooO0OO);
                                    o0oo00o2.OooO00o();
                                }
                                Unit unit120 = Unit.INSTANCE;
                            }
                            o00O0O.OooO0o0(r6);
                            oooOOO.f52989Oooo0o = r12;
                            oooOOO.f52990Oooo0oO = r2;
                            oooOOO.f52991Oooo0oo = oooOOooO00o;
                            oooOOO.f52988Oooo = oooO00o4;
                            oooOOO.f52994OoooO00 = null;
                            oooOOO.f52993OoooO0 = null;
                            oooOOO.f52995OoooO0O = null;
                            oooOOO.f52992OoooO = null;
                            oooOOO.f52996OoooOO0 = null;
                            oooOOO.f53001o000oOoO = null;
                            oooOOO.f53000OoooOoO = 7;
                            if (r6.OooO0O0(oooOOooO00o, oooOOO) == coroutine_suspended) {
                                obj = coroutine_suspended;
                            } else {
                                oooO = oooOOooO00o;
                                oooO00o5 = oooO00o4;
                                r4 = r12;
                                r3 = r2;
                                r4.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                oooO0O1 = oooO00o5.f9879OooO0Oo;
                                if (oooO0O1 != null) {
                                    oooO0O1.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                                    Unit unit1116 = Unit.INSTANCE;
                                }
                                r3.OooO00o();
                                obj = oooO;
                            }
                        }
                        obj = coroutine_suspended;
                        obj = coroutine_suspended;
                        return obj;
                    case 7:
                        oooO00o5 = (coil.request.OooO00o) oooOOO.f52988Oooo;
                        o00O0OO0.OooO oooO4 = (o00O0OO0.OooO) oooOOO.f52991Oooo0oo;
                        RequestDelegate requestDelegate19 = (RequestDelegate) oooOOO.f52990Oooo0oO;
                        OooO0OO oooO0OO6 = (OooO0OO) oooOOO.f52989Oooo0o;
                        ResultKt.throwOnFailure(obj2);
                        oooO = oooO4;
                        r3 = requestDelegate19;
                        r4 = oooO0OO6;
                        r4.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                        oooO0O1 = oooO00o5.f9879OooO0Oo;
                        if (oooO0O1 != null) {
                            oooO0O1.OooO0OO(oooO00o5, oooO.f30553OooO0OO);
                            Unit unit1117 = Unit.INSTANCE;
                        }
                        r3.OooO00o();
                        obj = oooO;
                        obj = coroutine_suspended;
                        obj = coroutine_suspended;
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th16) {
                th = th16;
            }
        } catch (Throwable th17) {
            r21.OooO00o();
            throw th17;
        }
    }

    @Override // oOO00O.OooOO0
    @NotNull
    public final o00O0OO0.OooO0O0 OooO00o() {
        return this.f53003OooO00o;
    }

    @Override // oOO00O.OooOO0
    @NotNull
    public final o00O0OO0.OooO0o OooO0O0(@NotNull coil.request.OooO00o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f53010OooO0oo, null, null, new OooO00o(request, null), 3, null);
        o00O0OO.OooO0O0 oooO0O0 = request.f9878OooO0OO;
        return oooO0O0 instanceof o00O0OO.OooO0OO ? new o00O0OO0.OooOo(o00O0O.OooO0OO(((o00O0OO.OooO0OO) oooO0O0).getView()).OooO00o(jobLaunch$default), (o00O0OO.OooO0OO) request.f9878OooO0OO) : new o00O0OO0.OooO00o(jobLaunch$default);
    }

    @Override // oOO00O.OooOO0
    @Nullable
    public final Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super o00O0OO0.OooOOO0> continuation) {
        o00O0OO.OooO0O0 oooO0O0 = oooO00o.f9878OooO0OO;
        if (oooO0O0 instanceof o00O0OO.OooO0OO) {
            o00oO0o o00oo0oOooO0OO = o00O0O.OooO0OO(((o00O0OO.OooO0OO) oooO0O0).getView());
            CoroutineContext.Element element = continuation.getContext().get(Job.INSTANCE);
            Intrinsics.checkNotNull(element);
            o00oo0oOooO0OO.OooO00o((Job) element);
        }
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new OooO0O0(oooO00o, null), continuation);
    }
}
