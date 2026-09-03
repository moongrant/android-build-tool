package p100o000oOoo;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o000O000;
import p109o000ooo.o00Oo0;
import p109o000ooo.o00oO0o;
import p109o000ooo.o0O0O00;
import p109o000ooo.o0OoOo0;
import p183o00o00Oo.o00O00;
import p321o0O0ooO.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class o0000O0 extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f35466OooOOoo = OooO00o.f35482OooO0Oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public OooO0O0 f35467OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public CoroutineScope f35468OooO0Oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Painter f35473OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public Function1<? super OooO0O0, ? extends OooO0O0> f35474OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super OooO0O0, Unit> f35475OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f35476OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public ContentScale f35477OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f35478OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableState f35479OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final MutableState f35480OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableState f35481OooOOo0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Size> f35470OooO0o0 = StateFlowKt.MutableStateFlow(Size.m1493boximpl(Size.INSTANCE.m1514getZeroNHjbRc()));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f35469OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f35471OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f35472OooO0oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public static final class OooO00o extends Lambda implements Function1<OooO0O0, OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f35482OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OooO0O0 invoke(OooO0O0 oooO0O0) {
            return oooO0O0;
        }
    }

    @StabilityInferred(parameters = 0)
    public static abstract class OooO0O0 {

        @StabilityInferred(parameters = 0)
        public static final class OooO00o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public static final OooO00o f35483OooO00o = new OooO00o();

            @Override // o000oOoo.o0000O0.OooO0O0
            @Nullable
            public final Painter OooO00o() {
                return null;
            }
        }

        /* JADX INFO: renamed from: o000oOoo.o0000O0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public static final class C0412OooO0O0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final Painter f35484OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final o00Oo0 f35485OooO0O0;

            public C0412OooO0O0(@Nullable Painter painter, @NotNull o00Oo0 o00oo1) {
                this.f35484OooO00o = painter;
                this.f35485OooO0O0 = o00oo1;
            }

            @Override // o000oOoo.o0000O0.OooO0O0
            @Nullable
            public final Painter OooO00o() {
                return this.f35484OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0412OooO0O0)) {
                    return false;
                }
                C0412OooO0O0 c0412OooO0O0 = (C0412OooO0O0) obj;
                return Intrinsics.areEqual(this.f35484OooO00o, c0412OooO0O0.f35484OooO00o) && Intrinsics.areEqual(this.f35485OooO0O0, c0412OooO0O0.f35485OooO0O0);
            }

            public final int hashCode() {
                Painter painter = this.f35484OooO00o;
                return this.f35485OooO0O0.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                return "Error(painter=" + this.f35484OooO00o + ", result=" + this.f35485OooO0O0 + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0OO extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final Painter f35486OooO00o;

            public OooO0OO(@Nullable Painter painter) {
                this.f35486OooO00o = painter;
            }

            @Override // o000oOoo.o0000O0.OooO0O0
            @Nullable
            public final Painter OooO00o() {
                return this.f35486OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OooO0OO) {
                    return Intrinsics.areEqual(this.f35486OooO00o, ((OooO0OO) obj).f35486OooO00o);
                }
                return false;
            }

            public final int hashCode() {
                Painter painter = this.f35486OooO00o;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Loading(painter=" + this.f35486OooO00o + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public final Painter f35487OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final o0O0O00 f35488OooO0O0;

            public OooO0o(@NotNull Painter painter, @NotNull o0O0O00 o0o0o00) {
                this.f35487OooO00o = painter;
                this.f35488OooO0O0 = o0o0o00;
            }

            @Override // o000oOoo.o0000O0.OooO0O0
            @NotNull
            public final Painter OooO00o() {
                return this.f35487OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0o)) {
                    return false;
                }
                OooO0o oooO0o = (OooO0o) obj;
                return Intrinsics.areEqual(this.f35487OooO00o, oooO0o.f35487OooO00o) && Intrinsics.areEqual(this.f35488OooO0O0, oooO0o.f35488OooO0O0);
            }

            public final int hashCode() {
                return this.f35488OooO0O0.hashCode() + (this.f35487OooO00o.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Success(painter=" + this.f35487OooO00o + ", result=" + this.f35488OooO0O0 + ')';
            }
        }

        @Nullable
        public abstract Painter OooO00o();
    }

    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35489OooO0Oo;

        public static final class OooO00o extends Lambda implements Function0<coil.request.OooO00o> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000O0 f35491OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0000O0 o0000o1) {
                super(0);
                this.f35491OooO0Oo = o0000o1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final coil.request.OooO00o invoke() {
                return (coil.request.OooO00o) this.f35491OooO0Oo.f35481OooOOo0.getValue();
            }
        }

        @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<coil.request.OooO00o, Continuation<? super OooO0O0>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public o0000O0 f35492OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ o0000O0 f35493OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f35494OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0000O0 o0000o1, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f35493OooO0o = o0000o1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f35493OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(coil.request.OooO00o oooO00o, Continuation<? super OooO0O0> continuation) {
                return ((OooO0O0) create(oooO00o, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0000O0 o0000o1;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f35494OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0000O0 o0000o2 = this.f35493OooO0o;
                    o000O000 o000o001 = (o000O000) o0000o2.f35480OooOOo.getValue();
                    coil.request.OooO00o oooO00o = (coil.request.OooO00o) o0000o2.f35481OooOOo0.getValue();
                    coil.request.OooO00o.C0170OooO00o c0170OooO00oOooO00o = coil.request.OooO00o.OooO00o(oooO00o);
                    c0170OooO00oOooO00o.f8591OooO0Oo = new o0000O0O(o0000o2);
                    c0170OooO00oOooO00o.OooO0o0();
                    o0OoOo0 o0oooo0 = oooO00o.f8586Oooo0o0;
                    if (o0oooo0.f35879OooO0O0 == null) {
                        c0170OooO00oOooO00o.f8623Oooo0OO = new o000OO(o0000o2);
                        c0170OooO00oOooO00o.OooO0o0();
                    }
                    if (o0oooo0.f35880OooO0OO == null) {
                        ContentScale contentScale = o0000o2.f35477OooOOO0;
                        int i2 = o000O0.f35501OooO0O0;
                        ContentScale.Companion companion = ContentScale.INSTANCE;
                        c0170OooO00oOooO00o.f8625Oooo0o0 = Intrinsics.areEqual(contentScale, companion.getFit()) ? true : Intrinsics.areEqual(contentScale, companion.getInside()) ? Scale.FIT : Scale.FILL;
                    }
                    if (o0oooo0.f35877OooO != Precision.EXACT) {
                        c0170OooO00oOooO00o.f8596OooOO0 = Precision.INEXACT;
                    }
                    coil.request.OooO00o OooO00o2 = c0170OooO00oOooO00o.OooO00o();
                    this.f35492OooO0Oo = o0000o2;
                    this.f35494OooO0o0 = 1;
                    Object objOooO0OO = o000o001.OooO0OO(OooO00o2, this);
                    if (objOooO0OO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0000o1 = o0000o2;
                    obj = objOooO0OO;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0000o1 = this.f35492OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                o00oO0o o00oo0o2 = (o00oO0o) obj;
                OooO00o oooO00o2 = o0000O0.f35466OooOOoo;
                o0000o1.getClass();
                if (o00oo0o2 instanceof o0O0O00) {
                    o0O0O00 o0o0o00 = (o0O0O00) o00oo0o2;
                    return new OooO0O0.OooO0o(o0000o1.OooO00o(o0o0o00.f35849OooO00o), o0o0o00);
                }
                if (!(o00oo0o2 instanceof o00Oo0)) {
                    throw new NoWhenBranchMatchedException();
                }
                Drawable drawableOooO00o = o00oo0o2.OooO00o();
                return new OooO0O0.C0412OooO0O0(drawableOooO00o != null ? o0000o1.OooO00o(drawableOooO00o) : null, (o00Oo0) o00oo0o2);
            }
        }

        /* JADX INFO: renamed from: o000oOoo.o0000O0$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public /* synthetic */ class C0413OooO0OO implements FlowCollector, FunctionAdapter {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000O0 f35495OooO0Oo;

            public C0413OooO0OO(o0000O0 o0000o1) {
                this.f35495OooO0Oo = o0000o1;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                OooO00o oooO00o = o0000O0.f35466OooOOoo;
                this.f35495OooO0Oo.OooO0O0((OooO0O0) obj);
                Unit unit = Unit.INSTANCE;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return unit;
            }

            public final boolean equals(@Nullable Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            @NotNull
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f35495OooO0Oo, o0000O0.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0000O0.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f35489OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000O0 o0000o1 = o0000O0.this;
                Flow flowMapLatest = FlowKt.mapLatest(SnapshotStateKt.snapshotFlow(new OooO00o(o0000o1)), new OooO0O0(o0000o1, null));
                C0413OooO0OO c0413OooO0OO = new C0413OooO0OO(o0000o1);
                this.f35489OooO0Oo = 1;
                if (flowMapLatest.collect(c0413OooO0OO, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public o0000O0(@NotNull coil.request.OooO00o oooO00o, @NotNull o000O000 o000o001) {
        OooO0O0.OooO00o oooO00o2 = OooO0O0.OooO00o.f35483OooO00o;
        this.f35467OooO = oooO00o2;
        this.f35474OooOO0O = f35466OooOOoo;
        this.f35477OooOOO0 = ContentScale.INSTANCE.getFit();
        this.f35476OooOOO = DrawScope.INSTANCE.m2139getDefaultFilterQualityfv9h1I();
        this.f35479OooOOOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oooO00o2, null, 2, null);
        this.f35481OooOOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oooO00o, null, 2, null);
        this.f35480OooOOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o000o001, null, 2, null);
    }

    public final Painter OooO00o(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return BitmapPainterKt.m2204BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.f35476OooOOO, 6, null);
        }
        return drawable instanceof ColorDrawable ? new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null) : new o00O00(drawable.mutate());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final void OooO0O0(OooO0O0 oooO0O0) {
        o00oO0o o00oo0o2;
        Painter painterOooO00o;
        Function1<? super OooO0O0, Unit> function1;
        Object objOooO00o;
        RememberObserver rememberObserver;
        RememberObserver rememberObserver2;
        OooO0O0 oooO0O1 = this.f35467OooO;
        OooO0O0 oooO0O0Invoke = this.f35474OooOO0O.invoke(oooO0O0);
        this.f35467OooO = oooO0O0Invoke;
        this.f35479OooOOOo.setValue(oooO0O0Invoke);
        if (!(oooO0O0Invoke instanceof OooO0O0.OooO0o)) {
            if (oooO0O0Invoke instanceof OooO0O0.C0412OooO0O0) {
                o00oo0o2 = ((OooO0O0.C0412OooO0O0) oooO0O0Invoke).f35485OooO0O0;
            } else {
                painterOooO00o = null;
            }
            if (painterOooO00o == null) {
                painterOooO00o = oooO0O0Invoke.OooO00o();
            }
            this.f35473OooOO0 = painterOooO00o;
            this.f35469OooO0o.setValue(painterOooO00o);
            if (this.f35468OooO0Oo != null && oooO0O1.OooO00o() != oooO0O0Invoke.OooO00o()) {
                objOooO00o = oooO0O1.OooO00o();
                if (objOooO00o instanceof RememberObserver) {
                    rememberObserver = (RememberObserver) objOooO00o;
                } else {
                    rememberObserver = null;
                }
                if (rememberObserver != null) {
                    rememberObserver.onForgotten();
                }
                Object objOooO00o2 = oooO0O0Invoke.OooO00o();
                rememberObserver2 = objOooO00o2 instanceof RememberObserver ? (RememberObserver) objOooO00o2 : null;
                if (rememberObserver2 != null) {
                    rememberObserver2.onRemembered();
                }
            }
            function1 = this.f35475OooOO0o;
            if (function1 != null) {
                function1.invoke(oooO0O0Invoke);
            }
        }
        o00oo0o2 = ((OooO0O0.OooO0o) oooO0O0Invoke).f35488OooO0O0;
        o00O0000.OooO0OO oooO0OOOooO00o = o00oo0o2.OooO0O0().f8561OooOOO0.OooO00o(o0000O.f35465OooO00o, o00oo0o2);
        if (oooO0OOOooO00o instanceof o00O0000.OooO00o) {
            o00O0000.OooO00o oooO00o = (o00O0000.OooO00o) oooO0OOOooO00o;
            painterOooO00o = new o000(oooO0O1 instanceof OooO0O0.OooO0OO ? oooO0O1.OooO00o() : null, oooO0O0Invoke.OooO00o(), this.f35477OooOOO0, oooO00o.f36265OooO0OO, ((o00oo0o2 instanceof o0O0O00) && ((o0O0O00) o00oo0o2).f35855OooO0oO) ? false : true, oooO00o.f36266OooO0Oo);
        } else {
            painterOooO00o = null;
        }
        if (painterOooO00o == null) {
            painterOooO00o = oooO0O0Invoke.OooO00o();
        }
        this.f35473OooOO0 = painterOooO00o;
        this.f35469OooO0o.setValue(painterOooO00o);
        if (this.f35468OooO0Oo != null) {
            objOooO00o = oooO0O1.OooO00o();
            if (objOooO00o instanceof RememberObserver) {
                rememberObserver = (RememberObserver) objOooO00o;
            } else {
                rememberObserver = null;
            }
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object objOooO00o3 = oooO0O0Invoke.OooO00o();
            if (objOooO00o3 instanceof RememberObserver) {
            }
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        function1 = this.f35475OooOO0o;
        if (function1 != null) {
            function1.invoke(oooO0O0Invoke);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.f35471OooO0oO.setValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f35472OooO0oo.setValue(colorFilter);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        Painter painter = (Painter) this.f35469OooO0o.getValue();
        return painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m1513getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        CoroutineScope coroutineScope = this.f35468OooO0Oo;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f35468OooO0Oo = null;
        Object obj = this.f35473OooOO0;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(@NotNull DrawScope drawScope) {
        this.f35470OooO0o0.setValue(Size.m1493boximpl(drawScope.mo2108getSizeNHjbRc()));
        Painter painter = (Painter) this.f35469OooO0o.getValue();
        if (painter != null) {
            painter.m2207drawx_KDEd0(drawScope, drawScope.mo2108getSizeNHjbRc(), ((Number) this.f35471OooO0oO.getValue()).floatValue(), (ColorFilter) this.f35472OooO0oo.getValue());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        CoroutineScope coroutineScope = this.f35468OooO0Oo;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f35468OooO0Oo = null;
        Object obj = this.f35473OooOO0;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        if (this.f35468OooO0Oo != null) {
            return;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.f35468OooO0Oo = CoroutineScope;
        Object obj = this.f35473OooOO0;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.f35478OooOOOO) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new OooO0OO(null), 3, null);
            return;
        }
        coil.request.OooO00o.C0170OooO00o c0170OooO00oOooO00o = coil.request.OooO00o.OooO00o((coil.request.OooO00o) this.f35481OooOOo0.getValue());
        c0170OooO00oOooO00o.f8589OooO0O0 = ((o000O000) this.f35480OooOOo.getValue()).OooO00o();
        c0170OooO00oOooO00o.f8627Oooo0oo = null;
        coil.request.OooO00o OooO00o2 = c0170OooO00oOooO00o.OooO00o();
        Drawable drawableOooO0O0 = o000OO0O.OooO0O0(OooO00o2, OooO00o2.f8581Oooo00O, OooO00o2.f8580Oooo000, OooO00o2.f8585Oooo0o.f35840OooOO0);
        OooO0O0(new OooO0O0.OooO0OO(drawableOooO0O0 != null ? OooO00o(drawableOooO0O0) : null));
    }
}
