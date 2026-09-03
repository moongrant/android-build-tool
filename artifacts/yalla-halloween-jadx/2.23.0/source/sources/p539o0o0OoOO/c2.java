package p539o0o0OoOO;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o0ooOOo;
import p417o0OoO0.o00Oo0;
import p427o0OoOO00.o0OOO0o;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.s1;
import p533o0o0Oo0.o0000OO0;
import p533o0o0Oo0.o00OO0OO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLiveHookFloatingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveHookFloatingWindow.kt\ncom/yalla/yalla/ui/view/RoomLiveHookFloatingWindow\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,239:1\n76#2:240\n76#2:241\n486#3,4:242\n490#3,2:250\n494#3:256\n25#4:246\n25#4:257\n25#4:264\n25#4:271\n456#4,8:295\n464#4,3:309\n456#4,8:339\n464#4,3:353\n467#4,3:362\n467#4,3:371\n1097#5,3:247\n1100#5,3:253\n1097#5,6:258\n1097#5,6:265\n1097#5,6:272\n486#6:252\n154#7:278\n154#7:313\n154#7:314\n174#7:315\n154#7:316\n154#7:317\n154#7:318\n154#7:319\n154#7:320\n154#7:321\n154#7:357\n154#7:358\n154#7:359\n154#7:360\n154#7:361\n154#7:367\n154#7:368\n154#7:369\n154#7:370\n67#8,5:279\n72#8:312\n66#8,6:322\n72#8:356\n76#8:366\n76#8:375\n78#9,11:284\n78#9,11:328\n91#9:365\n91#9:374\n4144#10,6:303\n4144#10,6:347\n81#11:376\n81#11:377\n81#11:378\n107#11,2:379\n81#11:381\n107#11,2:382\n*S KotlinDebug\n*F\n+ 1 RoomLiveHookFloatingWindow.kt\ncom/yalla/yalla/ui/view/RoomLiveHookFloatingWindow\n*L\n85#1:240\n87#1:241\n88#1:242,4\n88#1:250,2\n88#1:256\n88#1:246\n89#1:257\n90#1:264\n91#1:271\n92#1:295,8\n92#1:309,3\n117#1:339,8\n117#1:353,3\n117#1:362,3\n92#1:371,3\n88#1:247,3\n88#1:253,3\n89#1:258,6\n90#1:265,6\n91#1:272,6\n88#1:252\n96#1:278\n104#1:313\n105#1:314\n109#1:315\n110#1:316\n112#1:317\n114#1:318\n120#1:319\n121#1:320\n122#1:321\n184#1:357\n186#1:358\n200#1:359\n201#1:360\n202#1:361\n213#1:367\n214#1:368\n228#1:369\n229#1:370\n92#1:279,5\n92#1:312\n117#1:322,6\n117#1:356\n117#1:366\n92#1:375\n92#1:284,11\n117#1:328,11\n117#1:365\n92#1:374\n92#1:303,6\n117#1:347,6\n72#1:376\n73#1:377\n89#1:378\n89#1:379,2\n90#1:381\n90#1:382,2\n*E\n"})
public final class c2 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final c2 f55477OooO00o = new c2();

    public static final class OooO extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f55478OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55479OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m3874boximpl(IntOffsetKt.IntOffset(MathKt.roundToInt(h2.f55557OooO00o.getValue().floatValue()), MathKt.roundToInt(((Number) h2.f55558OooO0O0.getValue()).floatValue())));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55480OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.RoomLiveHookFloatingWindow$HookFloatingWindow$3$1", f = "RoomLiveHookFloatingWindow.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f55481OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55482OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f55483OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f55484OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55485OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55486OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f55487OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f55488OooOO0O;

        public static final class OooO00o extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f55489OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f55490OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f55491OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ Animatable<Float, AnimationVector1D> f55492OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Animatable animatable, MutableState mutableState, MutableState mutableState2, CoroutineScope coroutineScope) {
                super(1);
                this.f55489OooO0Oo = coroutineScope;
                this.f55491OooO0o0 = mutableState;
                this.f55490OooO0o = mutableState2;
                this.f55492OooO0oO = animatable;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                offset.getPackedValue();
                Boolean bool = Boolean.FALSE;
                this.f55491OooO0o0.setValue(bool);
                this.f55490OooO0o.setValue(bool);
                BuildersKt__Builders_commonKt.launch$default(this.f55489OooO0Oo, null, null, new d2(this.f55492OooO0oO, null), 3, null);
                s1 s1Var = s1.f50206OooO00o;
                s1.OooO0O0();
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f55493OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f55494OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Animatable<Float, AnimationVector1D> f55495OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f55496OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(Animatable animatable, MutableState mutableState, MutableState mutableState2, CoroutineScope coroutineScope) {
                super(0);
                this.f55493OooO0Oo = coroutineScope;
                this.f55495OooO0o0 = animatable;
                this.f55494OooO0o = mutableState;
                this.f55496OooO0oO = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                BuildersKt__Builders_commonKt.launch$default(this.f55493OooO0Oo, null, null, new e2(this.f55495OooO0o0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(this.f55493OooO0Oo, null, null, new f2(h2.f55557OooO00o.getValue().floatValue() > ((float) o0000O0.OooO00o((float) 124)) ? o0000O0.OooO00o(264) : -o0000O0.OooO00o(16), this.f55494OooO0o, this.f55496OooO0oO, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0o0OoOO.c2$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public static final class C0506OooO0OO extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ float f55497OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f55498OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ float f55499OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0506OooO0OO(float f, float f2, CoroutineScope coroutineScope) {
                super(2);
                this.f55497OooO0Oo = f;
                this.f55499OooO0o0 = f2;
                this.f55498OooO0o = coroutineScope;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                long packedValue = offset.getPackedValue();
                Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
                float fFloatValue = p591o0oo000O.OooO.OooO0o0() ? h2.f55557OooO00o.getValue().floatValue() - Offset.m1436getXimpl(packedValue) : h2.f55557OooO00o.getValue().floatValue() + Offset.m1436getXimpl(packedValue);
                MutableState mutableState = h2.f55558OooO0O0;
                float fM1437getYimpl = Offset.m1437getYimpl(packedValue) + ((Number) mutableState.getValue()).floatValue();
                float f = this.f55497OooO0Oo;
                mutableState.setValue(Float.valueOf(RangesKt.coerceIn(fM1437getYimpl, o0000O0.OooO00o(f) + o0000O0.OooO00o(50), (o0000O0.OooO00o(f) + this.f55499OooO0o0) - o0000O0.OooO00o(80))));
                BuildersKt__Builders_commonKt.launch$default(this.f55498OooO0o, null, null, new g2(fFloatValue, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Animatable<Float, AnimationVector1D> animatable, float f, float f2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f55483OooO0o = coroutineScope;
            this.f55485OooO0oO = mutableState;
            this.f55486OooO0oo = mutableState2;
            this.f55481OooO = animatable;
            this.f55487OooOO0 = f;
            this.f55488OooOO0O = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f55483OooO0o, this.f55485OooO0oO, this.f55486OooO0oo, this.f55481OooO, this.f55487OooOO0, this.f55488OooOO0O, continuation);
            oooO0OO.f55484OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55482OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f55484OooO0o0;
                Animatable<Float, AnimationVector1D> animatable = this.f55481OooO;
                MutableState<Boolean> mutableState = this.f55485OooO0oO;
                MutableState<Boolean> mutableState2 = this.f55486OooO0oo;
                CoroutineScope coroutineScope = this.f55483OooO0o;
                OooO00o oooO00o = new OooO00o(animatable, mutableState, mutableState2, coroutineScope);
                OooO0O0 oooO0O0 = new OooO0O0(animatable, mutableState2, mutableState, coroutineScope);
                C0506OooO0OO c0506OooO0OO = new C0506OooO0OO(this.f55487OooOO0, this.f55488OooOO0O, coroutineScope);
                this.f55482OooO0Oo = 1;
                if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, oooO00o, oooO0O0, null, c0506OooO0OO, this, 4, null) == coroutine_suspended) {
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

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55500OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f55500OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = this.f55500OooO0Oo;
            AppCompatActivity activity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (activity != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
            }
            RoomModel roomModel = new RoomModel();
            Long value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
            if (value != null) {
                roomModel.setId(value.longValue());
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                o0OOO0o.OooO0o(roomModel, null);
                s1 s1Var = s1.f50206OooO00o;
                s1.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55501OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            o0OOO0o.OooO00o();
            s1 s1Var = s1.f50206OooO00o;
            s1.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f55502OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            o0OOO0o.OooO00o();
            s1 s1Var = s1.f50206OooO00o;
            s1.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55504OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i) {
            super(2);
            this.f55504OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55504OooO0o0 | 1);
            c2.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55506OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f55507OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, int i) {
            super(2);
            this.f55507OooO0o0 = str;
            this.f55506OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55506OooO0o | 1);
            c2.this.OooO00o(this.f55507OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(String str, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1078537260);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078537260, i2, -1, "com.yalla.yalla.ui.view.RoomLiveHookFloatingWindow.HookFloatingWindow (RoomLiveHookFloatingWindow.kt:82)");
            }
            o0000OO0.f54689OooO00o.OooO00o(composerStartRestartGroup, 6);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            float bottom = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composerStartRestartGroup, 8), composerStartRestartGroup, 0).getBottom();
            float fOooO00o = o0000O0.OooO00o(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composerStartRestartGroup, -492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(h2.f55557OooO00o.getValue().floatValue() > 124.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(h2.f55557OooO00o.getValue().floatValue() <= 124.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(112.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue3;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment center = companion2.getCenter();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m525sizeVpY3zN4(OffsetKt.offset(WindowInsetsPadding_androidKt.statusBarsPadding(companion3), OooO00o.f55479OooO0Oo), Dp.m3765constructorimpl(112), Dp.m3765constructorimpl(80)), false, false, 0L, false, null, null, null, OooO0O0.f55480OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(boxScopeInstance.align(companion3, companion2.getCenter()), 0.0f, 1, null);
            float fM3765constructorimpl = Dp.m3765constructorimpl(10);
            float f = 12;
            RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f));
            long j = o0oO0O0o.f46973OooOooO;
            BoxKt.Box(BorderKt.m180borderxT4_qwU(BackgroundKt.m168backgroundbw27NRU(SizeKt.m528width3ABfNKs(ShadowKt.m1348shadows4CzXII$default(modifierFillMaxHeight$default, fM3765constructorimpl, roundedCornerShapeM727RoundedCornerShape0680j_4, false, j, j, 4, null), Dp.m3765constructorimpl(((Number) animatable.getValue()).floatValue())), o0oO0O0o.f46987OoooO0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f))), Dp.m3765constructorimpl(1), o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f))), composerStartRestartGroup, 0);
            float f2 = 8;
            Modifier modifierOooO0O1 = o0O0O00.OooO0O0(SuspendingPointerInputFilterKt.pointerInput(OooOo.OooO0O0(f2, SizeKt.m523size3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(boxScopeInstance.align(companion3, companion2.getCenter()), 0.0f, Dp.m3765constructorimpl(f2), 1, null), Dp.m3765constructorimpl(64))), Unit.INSTANCE, new OooO0OO(coroutineScopeOooO00o, mutableState, mutableState2, animatable, bottom, fOooO00o, null)), false, false, 0L, false, null, null, null, new OooO0o(context), 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ImageKt.Image(o00Oo0.OooO0O0(str, OooO.f55478OooO0Oo, composerStartRestartGroup, (i2 & 14) | 48, 0), (String) null, BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), o0oO0O0o.f47052o000O0oO, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(boxScopeInstance.align(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3765constructorimpl(24)), companion2.getBottomCenter()), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 3, null)), Brush.Companion.m1633verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f46945OooO00o), Color.m1660boximpl(o0oO0O0o.f46970OooOoOO)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            float f3 = 15;
            p154o00OoO00.OooOo00.OooO00o("svga/anim_room_hook_live.svga", true, 0, null, null, boxScopeInstance.align(SizeKt.m509height3ABfNKs(SizeKt.m525sizeVpY3zN4(PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(6), 7, null), Dp.m3765constructorimpl(45), Dp.m3765constructorimpl(f3)), Dp.m3765constructorimpl(50)), companion2.getBottomCenter()), composerStartRestartGroup, 54, 28);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1101623829);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_close, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion2.getCenterStart()), Dp.m3765constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(f3)), false, false, 0L, false, null, null, null, OooOO0.f55501OooO0Oo, 253), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, composerStartRestartGroup, 56, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1326524191);
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_close, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion2.getCenterEnd()), 0.0f, 0.0f, Dp.m3765constructorimpl(4), 0.0f, 11, null), Dp.m3765constructorimpl(f3)), false, false, 0L, false, null, null, null, OooOO0O.f55502OooO0Oo, 253), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, composerStartRestartGroup, 56, 0);
            }
            o0ooOOo.OooO00o(composerStartRestartGroup);
            s1.f50206OooO00o.OooO00o(((Number) h2.f55558OooO0O0.getValue()).floatValue(), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(str, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(667763914);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(667763914, i2, -1, "com.yalla.yalla.ui.view.RoomLiveHookFloatingWindow.OnContent (RoomLiveHookFloatingWindow.kt:70)");
            }
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24999OooO0O0, composerStartRestartGroup, 8);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24998OooO00o, composerStartRestartGroup, 8);
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            if (o0OOO0o.OooO0oO() == RoomState.Hook) {
                o00OO0OO.f54785OooO00o.OooO00o(composerStartRestartGroup, 6);
                String str = (String) stateObserveAsState.getValue();
                if (!(str == null || StringsKt.isBlank(str))) {
                    String str2 = (String) stateObserveAsState2.getValue();
                    if (!(str2 == null || StringsKt.isBlank(str2))) {
                        OooO00o((String) stateObserveAsState2.getValue(), composerStartRestartGroup, (i2 << 3) & 112);
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i));
    }
}
