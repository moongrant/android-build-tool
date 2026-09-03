package p121o00O0Ooo;

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
import o00OO00O.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o00000O;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o00Ooo;
import p131o00O0oo0.o00oO0o;
import p131o00O0oo0.o0Oo0oo;
import p237o00oOooO.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class o0000 extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f36419OooOOoo = OooO00o.f36435OooO0Oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public OooO0O0 f36420OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public CoroutineScope f36421OooO0Oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Painter f36426OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public Function1<? super OooO0O0, ? extends OooO0O0> f36427OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super OooO0O0, Unit> f36428OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f36429OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public ContentScale f36430OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f36431OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableState f36432OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final MutableState f36433OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableState f36434OooOOo0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Size> f36423OooO0o0 = StateFlowKt.MutableStateFlow(Size.m1504boximpl(Size.INSTANCE.m1525getZeroNHjbRc()));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f36422OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f36424OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f36425OooO0oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public static final class OooO00o extends Lambda implements Function1<OooO0O0, OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f36435OooO0Oo = new OooO00o();

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
            public static final OooO00o f36436OooO00o = new OooO00o();

            @Override // o00O0Ooo.o0000.OooO0O0
            @Nullable
            public final Painter OooO00o() {
                return null;
            }
        }

        /* JADX INFO: renamed from: o00O0Ooo.o0000$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public static final class C0416OooO0O0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final Painter f36437OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final o00oO0o f36438OooO0O0;

            public C0416OooO0O0(@Nullable Painter painter, @NotNull o00oO0o o00oo0o2) {
                this.f36437OooO00o = painter;
                this.f36438OooO0O0 = o00oo0o2;
            }

            @Override // o00O0Ooo.o0000.OooO0O0
            @Nullable
            public final Painter OooO00o() {
                return this.f36437OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0416OooO0O0)) {
                    return false;
                }
                C0416OooO0O0 c0416OooO0O0 = (C0416OooO0O0) obj;
                return Intrinsics.areEqual(this.f36437OooO00o, c0416OooO0O0.f36437OooO00o) && Intrinsics.areEqual(this.f36438OooO0O0, c0416OooO0O0.f36438OooO0O0);
            }

            public final int hashCode() {
                Painter painter = this.f36437OooO00o;
                return this.f36438OooO0O0.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                return "Error(painter=" + this.f36437OooO00o + ", result=" + this.f36438OooO0O0 + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0OO extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final Painter f36439OooO00o;

            public OooO0OO(@Nullable Painter painter) {
                this.f36439OooO00o = painter;
            }

            @Override // o00O0Ooo.o0000.OooO0O0
            @Nullable
            public final Painter OooO00o() {
                return this.f36439OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OooO0OO) {
                    return Intrinsics.areEqual(this.f36439OooO00o, ((OooO0OO) obj).f36439OooO00o);
                }
                return false;
            }

            public final int hashCode() {
                Painter painter = this.f36439OooO00o;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Loading(painter=" + this.f36439OooO00o + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public final Painter f36440OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final o000000O f36441OooO0O0;

            public OooO0o(@NotNull Painter painter, @NotNull o000000O o000000o2) {
                this.f36440OooO00o = painter;
                this.f36441OooO0O0 = o000000o2;
            }

            @Override // o00O0Ooo.o0000.OooO0O0
            @NotNull
            public final Painter OooO00o() {
                return this.f36440OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0o)) {
                    return false;
                }
                OooO0o oooO0o = (OooO0o) obj;
                return Intrinsics.areEqual(this.f36440OooO00o, oooO0o.f36440OooO00o) && Intrinsics.areEqual(this.f36441OooO0O0, oooO0o.f36441OooO0O0);
            }

            public final int hashCode() {
                return this.f36441OooO0O0.hashCode() + (this.f36440OooO00o.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Success(painter=" + this.f36440OooO00o + ", result=" + this.f36441OooO0O0 + ')';
            }
        }

        @Nullable
        public abstract Painter OooO00o();
    }

    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f36442OooO0Oo;

        public static final class OooO00o extends Lambda implements Function0<coil.request.OooO00o> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000 f36444OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0000 o0000Var) {
                super(0);
                this.f36444OooO0Oo = o0000Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final coil.request.OooO00o invoke() {
                return (coil.request.OooO00o) this.f36444OooO0Oo.f36434OooOOo0.getValue();
            }
        }

        @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<coil.request.OooO00o, Continuation<? super OooO0O0>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public o0000 f36445OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ o0000 f36446OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f36447OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0000 o0000Var, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f36446OooO0o = o0000Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f36446OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(coil.request.OooO00o oooO00o, Continuation<? super OooO0O0> continuation) {
                return ((OooO0O0) create(oooO00o, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0000 o0000Var;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f36447OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0000 o0000Var2 = this.f36446OooO0o;
                    o00000O o00000o = (o00000O) o0000Var2.f36433OooOOo.getValue();
                    coil.request.OooO00o oooO00o = (coil.request.OooO00o) o0000Var2.f36434OooOOo0.getValue();
                    coil.request.OooO00o.C0189OooO00o c0189OooO00oOooO00o = coil.request.OooO00o.OooO00o(oooO00o);
                    c0189OooO00oOooO00o.f11681OooO0Oo = new o0000O00(o0000Var2);
                    c0189OooO00oOooO00o.OooO0o0();
                    o00Ooo o00ooo2 = oooO00o.f11676Oooo0o0;
                    if (o00ooo2.f36821OooO0O0 == null) {
                        c0189OooO00oOooO00o.f11713Oooo0OO = new o0000oo(o0000Var2);
                        c0189OooO00oOooO00o.OooO0o0();
                    }
                    if (o00ooo2.f36822OooO0OO == null) {
                        ContentScale contentScale = o0000Var2.f36430OooOOO0;
                        int i2 = o000Oo0.f36480OooO0O0;
                        ContentScale.Companion companion = ContentScale.INSTANCE;
                        c0189OooO00oOooO00o.f11715Oooo0o0 = Intrinsics.areEqual(contentScale, companion.getFit()) ? true : Intrinsics.areEqual(contentScale, companion.getInside()) ? Scale.FIT : Scale.FILL;
                    }
                    if (o00ooo2.f36819OooO != Precision.EXACT) {
                        c0189OooO00oOooO00o.f11686OooOO0 = Precision.INEXACT;
                    }
                    coil.request.OooO00o OooO00o2 = c0189OooO00oOooO00o.OooO00o();
                    this.f36445OooO0Oo = o0000Var2;
                    this.f36447OooO0o0 = 1;
                    Object objOooO0OO = o00000o.OooO0OO(OooO00o2, this);
                    if (objOooO0OO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0000Var = o0000Var2;
                    obj = objOooO0OO;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0000Var = this.f36445OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
                OooO00o oooO00o2 = o0000.f36419OooOOoo;
                o0000Var.getClass();
                if (o0oo0oo2 instanceof o000000O) {
                    o000000O o000000o2 = (o000000O) o0oo0oo2;
                    return new OooO0O0.OooO0o(o0000Var.OooO00o(o000000o2.f36784OooO00o), o000000o2);
                }
                if (!(o0oo0oo2 instanceof o00oO0o)) {
                    throw new NoWhenBranchMatchedException();
                }
                Drawable drawableOooO00o = o0oo0oo2.OooO00o();
                return new OooO0O0.C0416OooO0O0(drawableOooO00o != null ? o0000Var.OooO00o(drawableOooO00o) : null, (o00oO0o) o0oo0oo2);
            }
        }

        /* JADX INFO: renamed from: o00O0Ooo.o0000$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public /* synthetic */ class C0417OooO0OO implements FlowCollector, FunctionAdapter {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000 f36448OooO0Oo;

            public C0417OooO0OO(o0000 o0000Var) {
                this.f36448OooO0Oo = o0000Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                OooO00o oooO00o = o0000.f36419OooOOoo;
                this.f36448OooO0Oo.OooO0O0((OooO0O0) obj);
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
                return new AdaptedFunctionReference(2, this.f36448OooO0Oo, o0000.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
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
            return o0000.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f36442OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000 o0000Var = o0000.this;
                Flow flowMapLatest = FlowKt.mapLatest(SnapshotStateKt.snapshotFlow(new OooO00o(o0000Var)), new OooO0O0(o0000Var, null));
                C0417OooO0OO c0417OooO0OO = new C0417OooO0OO(o0000Var);
                this.f36442OooO0Oo = 1;
                if (flowMapLatest.collect(c0417OooO0OO, this) == coroutine_suspended) {
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

    public o0000(@NotNull coil.request.OooO00o oooO00o, @NotNull o00000O o00000o) {
        OooO0O0.OooO00o oooO00o2 = OooO0O0.OooO00o.f36436OooO00o;
        this.f36420OooO = oooO00o2;
        this.f36427OooOO0O = f36419OooOOoo;
        this.f36430OooOOO0 = ContentScale.INSTANCE.getFit();
        this.f36429OooOOO = DrawScope.INSTANCE.m2149getDefaultFilterQualityfv9h1I();
        this.f36432OooOOOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oooO00o2, null, 2, null);
        this.f36434OooOOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oooO00o, null, 2, null);
        this.f36433OooOOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00000o, null, 2, null);
    }

    public final Painter OooO00o(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return BitmapPainterKt.m2214BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.f36429OooOOO, 6, null);
        }
        return drawable instanceof ColorDrawable ? new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null) : new o0oO0Ooo(drawable.mutate());
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
        o0Oo0oo o0oo0oo2;
        Painter painterOooO00o;
        Function1<? super OooO0O0, Unit> function1;
        Object objOooO00o;
        RememberObserver rememberObserver;
        RememberObserver rememberObserver2;
        OooO0O0 oooO0O1 = this.f36420OooO;
        OooO0O0 oooO0O0Invoke = this.f36427OooOO0O.invoke(oooO0O0);
        this.f36420OooO = oooO0O0Invoke;
        this.f36432OooOOOo.setValue(oooO0O0Invoke);
        if (!(oooO0O0Invoke instanceof OooO0O0.OooO0o)) {
            if (oooO0O0Invoke instanceof OooO0O0.C0416OooO0O0) {
                o0oo0oo2 = ((OooO0O0.C0416OooO0O0) oooO0O0Invoke).f36438OooO0O0;
            } else {
                painterOooO00o = null;
            }
            if (painterOooO00o == null) {
                painterOooO00o = oooO0O0Invoke.OooO00o();
            }
            this.f36426OooOO0 = painterOooO00o;
            this.f36422OooO0o.setValue(painterOooO00o);
            if (this.f36421OooO0Oo != null && oooO0O1.OooO00o() != oooO0O0Invoke.OooO00o()) {
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
            function1 = this.f36428OooOO0o;
            if (function1 != null) {
                function1.invoke(oooO0O0Invoke);
            }
        }
        o0oo0oo2 = ((OooO0O0.OooO0o) oooO0O0Invoke).f36441OooO0O0;
        o00OO000.OooO0OO oooO0OOOooO00o = o0oo0oo2.OooO0O0().f11651OooOOO0.OooO00o(o0000O0.f36450OooO00o, o0oo0oo2);
        if (oooO0OOOooO00o instanceof o00OO000.OooO00o) {
            o00OO000.OooO00o oooO00o = (o00OO000.OooO00o) oooO0OOOooO00o;
            painterOooO00o = new o000OO(oooO0O1 instanceof OooO0O0.OooO0OO ? oooO0O1.OooO00o() : null, oooO0O0Invoke.OooO00o(), this.f36430OooOOO0, oooO00o.f37065OooO0OO, ((o0oo0oo2 instanceof o000000O) && ((o000000O) o0oo0oo2).f36790OooO0oO) ? false : true, oooO00o.f37066OooO0Oo);
        } else {
            painterOooO00o = null;
        }
        if (painterOooO00o == null) {
            painterOooO00o = oooO0O0Invoke.OooO00o();
        }
        this.f36426OooOO0 = painterOooO00o;
        this.f36422OooO0o.setValue(painterOooO00o);
        if (this.f36421OooO0Oo != null) {
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
        function1 = this.f36428OooOO0o;
        if (function1 != null) {
            function1.invoke(oooO0O0Invoke);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.f36424OooO0oO.setValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f36425OooO0oo.setValue(colorFilter);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        Painter painter = (Painter) this.f36422OooO0o.getValue();
        return painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m1524getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        CoroutineScope coroutineScope = this.f36421OooO0Oo;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f36421OooO0Oo = null;
        Object obj = this.f36426OooOO0;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(@NotNull DrawScope drawScope) {
        this.f36423OooO0o0.setValue(Size.m1504boximpl(drawScope.mo2118getSizeNHjbRc()));
        Painter painter = (Painter) this.f36422OooO0o.getValue();
        if (painter != null) {
            painter.m2217drawx_KDEd0(drawScope, drawScope.mo2118getSizeNHjbRc(), ((Number) this.f36424OooO0oO.getValue()).floatValue(), (ColorFilter) this.f36425OooO0oo.getValue());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        CoroutineScope coroutineScope = this.f36421OooO0Oo;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f36421OooO0Oo = null;
        Object obj = this.f36426OooOO0;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        if (this.f36421OooO0Oo != null) {
            return;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.f36421OooO0Oo = CoroutineScope;
        Object obj = this.f36426OooOO0;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.f36431OooOOOO) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new OooO0OO(null), 3, null);
            return;
        }
        coil.request.OooO00o.C0189OooO00o c0189OooO00oOooO00o = coil.request.OooO00o.OooO00o((coil.request.OooO00o) this.f36434OooOOo0.getValue());
        c0189OooO00oOooO00o.f11679OooO0O0 = ((o00000O) this.f36433OooOOo.getValue()).OooO00o();
        c0189OooO00oOooO00o.f11717Oooo0oo = null;
        coil.request.OooO00o OooO00o2 = c0189OooO00oOooO00o.OooO00o();
        Drawable drawableOooO0O0 = OooOOOO.OooO0O0(OooO00o2, OooO00o2.f11671Oooo00O, OooO00o2.f11670Oooo000, OooO00o2.f11675Oooo0o.f36813OooOO0);
        OooO0O0(new OooO0O0.OooO0OO(drawableOooO0O0 != null ? OooO00o(drawableOooO0O0) : null));
    }
}
