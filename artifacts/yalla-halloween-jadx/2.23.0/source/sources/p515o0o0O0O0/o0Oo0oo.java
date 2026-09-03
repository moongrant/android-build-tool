package p515o0o0O0O0;

import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import com.code.android.util.o00Oo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0ooOOo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentGifPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentGifPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifPlayManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,179:1\n76#2:180\n154#3:181\n25#4:182\n25#4:193\n1097#5,6:183\n1097#5,3:194\n1100#5,3:200\n486#6,4:189\n490#6,2:197\n494#6:203\n486#7:199\n75#8:204\n108#8,2:205\n215#9,2:207\n81#10:209\n107#10,2:210\n*S KotlinDebug\n*F\n+ 1 MomentGifPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifPlayManager\n*L\n44#1:180\n45#1:181\n62#1:182\n63#1:193\n62#1:183,6\n63#1:194,3\n63#1:200,3\n63#1:189,4\n63#1:197,2\n63#1:203\n63#1:199\n102#1:204\n102#1:205,2\n118#1:207,2\n62#1:209\n62#1:210,2\n*E\n"})
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final LazyListState f51829OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f51831OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, Pair<LayoutCoordinates, MomentDetailModel>> f51830OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableIntState f51832OooO0Oo = SnapshotIntStateKt.mutableIntStateOf(-1);

    @SourceDebugExtension({"SMAP\nMomentGifPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentGifPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifPlayManager$initSlidingObserver$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,179:1\n63#2,5:180\n*S KotlinDebug\n*F\n+ 1 MomentGifPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifPlayManager$initSlidingObserver$2\n*L\n55#1:180,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51834OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51835OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, MomentAdapterTag momentAdapterTag) {
            super(1);
            this.f51835OooO0o0 = i;
            this.f51834OooO0o = momentAdapterTag;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0OOO0o(o0Oo0oo.this, this.f51835OooO0o0, this.f51834OooO0o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Lifecycle.Event, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51836OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51837OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51838OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo f51839OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Lifecycle.Event> f51840OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentAdapterTag momentAdapterTag, int i, CoroutineScope coroutineScope, o0Oo0oo o0oo0oo2, MutableState<Lifecycle.Event> mutableState) {
            super(1);
            this.f51836OooO0Oo = momentAdapterTag;
            this.f51838OooO0o0 = i;
            this.f51837OooO0o = coroutineScope;
            this.f51839OooO0oO = o0oo0oo2;
            this.f51840OooO0oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Lifecycle.Event event) {
            Lifecycle.Event it = event;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == Lifecycle.Event.ON_RESUME) {
                StringBuilder sb = new StringBuilder("onSlidingDown OnResume is ");
                MomentAdapterTag momentAdapterTag = this.f51836OooO0Oo;
                sb.append(momentAdapterTag);
                sb.append(",listSize is ");
                int i = this.f51838OooO0o0;
                sb.append(i);
                OooOOO0.OooO0O0(sb.toString());
                BuildersKt__Builders_commonKt.launch$default(this.f51837OooO0o, null, null, new o0OO00O(this.f51839OooO0oO, i, momentAdapterTag, null), 3, null);
            }
            this.f51840OooO0oo.setValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.utils.MomentGifPlayManager$initSlidingObserver$4", f = "MomentGifPlayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51841OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51842OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51843OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Lifecycle.Event> f51844OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo f51845OooO0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.utils.MomentGifPlayManager$initSlidingObserver$4$1", f = "MomentGifPlayManager.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f51846OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ int f51847OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ o0Oo0oo f51848OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ MomentAdapterTag f51849OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0Oo0oo o0oo0oo2, int i, MomentAdapterTag momentAdapterTag, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f51848OooO0o0 = o0oo0oo2;
                this.f51847OooO0o = i;
                this.f51849OooO0oO = momentAdapterTag;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f51848OooO0o0, this.f51847OooO0o, this.f51849OooO0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f51846OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f51846OooO0Oo = 1;
                    if (DelayKt.delay(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                o0Oo0oo.OooO00o(this.f51848OooO0o0, this.f51847OooO0o, this.f51849OooO0oO);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentAdapterTag momentAdapterTag, int i, CoroutineScope coroutineScope, MutableState<Lifecycle.Event> mutableState, o0Oo0oo o0oo0oo2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f51841OooO0Oo = momentAdapterTag;
            this.f51843OooO0o0 = i;
            this.f51842OooO0o = coroutineScope;
            this.f51844OooO0oO = mutableState;
            this.f51845OooO0oo = o0oo0oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f51841OooO0Oo, this.f51843OooO0o0, this.f51842OooO0o, this.f51844OooO0oO, this.f51845OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            StringBuilder sb = new StringBuilder("onSlidingDown momentAdapterTag is ");
            MomentAdapterTag momentAdapterTag = this.f51841OooO0Oo;
            sb.append(momentAdapterTag);
            sb.append(",listSize is ");
            int i = this.f51843OooO0o0;
            sb.append(i);
            OooOOO0.OooO0O0(sb.toString());
            if (this.f51844OooO0oO.getValue() == Lifecycle.Event.ON_RESUME) {
                BuildersKt__Builders_commonKt.launch$default(this.f51842OooO0o, null, null, new OooO00o(this.f51845OooO0oo, i, momentAdapterTag, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51851OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51852OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51853OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51854OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, MomentAdapterTag momentAdapterTag, int i2, int i3) {
            super(2);
            this.f51852OooO0o0 = i;
            this.f51851OooO0o = momentAdapterTag;
            this.f51853OooO0oO = i2;
            this.f51854OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0Oo0oo.this.OooO0O0(this.f51852OooO0o0, this.f51851OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51853OooO0oO | 1), this.f51854OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public o0Oo0oo(@Nullable LazyListState lazyListState) {
        this.f51829OooO00o = lazyListState;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a5  */
    public static final void OooO00o(o0Oo0oo o0oo0oo2, int i, MomentAdapterTag momentAdapterTag) {
        Pair pair;
        Iterator<Map.Entry<Integer, Pair<LayoutCoordinates, MomentDetailModel>>> it;
        MomentDetailModel momentDetailModelComponent2;
        Iterator<Map.Entry<Integer, Pair<LayoutCoordinates, MomentDetailModel>>> it2;
        MomentDetailModel second;
        int iIntValue = -1;
        o0oo0oo2.f51832OooO0Oo.setIntValue(-1);
        HashMap<Integer, Pair<LayoutCoordinates, MomentDetailModel>> map = o0oo0oo2.f51830OooO0O0;
        boolean z = false;
        if (map.containsKey(0)) {
            Pair<LayoutCoordinates, MomentDetailModel> pair2 = map.get(0);
            Intrinsics.checkNotNull(pair2);
            LayoutCoordinates first = pair2.getFirst();
            if (!first.isAttached()) {
                pair = new Pair(Boolean.FALSE, -1);
            } else if (IntSize.m3924getHeightimpl(first.mo2801getSizeYbymL2g()) == ((int) LayoutCoordinatesKt.boundsInWindow(first).getHeight())) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        } else {
            int i2 = i - 1;
            if (map.containsKey(Integer.valueOf(i2))) {
                Pair<LayoutCoordinates, MomentDetailModel> pair3 = map.get(Integer.valueOf(i2));
                Intrinsics.checkNotNull(pair3);
                LayoutCoordinates first2 = pair3.getFirst();
                if (!first2.isAttached()) {
                    pair = new Pair(Boolean.FALSE, -1);
                } else if (IntSize.m3924getHeightimpl(first2.mo2801getSizeYbymL2g()) == ((int) LayoutCoordinatesKt.boundsInWindow(first2).getHeight())) {
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i2));
                } else {
                    pair = new Pair(Boolean.FALSE, -1);
                }
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        MutableIntState mutableIntState = o0oo0oo2.f51832OooO0Oo;
        if (zBooleanValue) {
            Pair<LayoutCoordinates, MomentDetailModel> pair4 = map.get(pair.getSecond());
            if (pair4 != null && (second = pair4.getSecond()) != null && second.containGifImageOrVideo()) {
                z = true;
            }
            if (z) {
                mutableIntState.setIntValue(((Number) pair.getSecond()).intValue());
            } else {
                it = map.entrySet().iterator();
                int i3 = -1;
                while (it.hasNext()) {
                    Map.Entry<Integer, Pair<LayoutCoordinates, MomentDetailModel>> next = it.next();
                    Pair<LayoutCoordinates, MomentDetailModel> value = next.getValue();
                    LayoutCoordinates layoutCoordinatesComponent1 = value.component1();
                    momentDetailModelComponent2 = value.component2();
                    if (momentDetailModelComponent2.containGifImageOrVideo()) {
                        it2 = it;
                    } else {
                        it2 = it;
                    }
                    it = it2;
                }
                mutableIntState.setIntValue(iIntValue);
            }
        } else {
            it = map.entrySet().iterator();
            int i4 = -1;
            while (it.hasNext()) {
                Map.Entry<Integer, Pair<LayoutCoordinates, MomentDetailModel>> next2 = it.next();
                Pair<LayoutCoordinates, MomentDetailModel> value2 = next2.getValue();
                LayoutCoordinates layoutCoordinatesComponent2 = value2.component1();
                momentDetailModelComponent2 = value2.component2();
                if (momentDetailModelComponent2.containGifImageOrVideo() || !layoutCoordinatesComponent2.isAttached()) {
                    it2 = it;
                } else {
                    int height = (int) LayoutCoordinatesKt.boundsInWindow(layoutCoordinatesComponent2).getHeight();
                    float bottom = LayoutCoordinatesKt.boundsInWindow(layoutCoordinatesComponent2).getBottom();
                    float f = o0ooOOo.f45530OooO0O0;
                    int iRoundToInt = bottom > f ? MathKt.roundToInt(f - LayoutCoordinatesKt.boundsInWindow(layoutCoordinatesComponent2).getTop()) : height;
                    it2 = it;
                    OooOOO0.OooO0O0("onSlidingDown momentAdapterTag is " + momentAdapterTag + ",data url is " + momentDetailModelComponent2.getVideoUrl() + "  ,===layoutCoordinates is " + layoutCoordinatesComponent2.isAttached() + ",visibleHeight is " + iRoundToInt + ",minHeight is " + o0oo0oo2.f51831OooO0OO + ",layoutCoordinates.size.height is" + IntSize.m3924getHeightimpl(layoutCoordinatesComponent2.mo2801getSizeYbymL2g()));
                    if (IntSize.m3924getHeightimpl(layoutCoordinatesComponent2.mo2801getSizeYbymL2g()) == height) {
                        mutableIntState.setIntValue(next2.getKey().intValue());
                        return;
                    } else if (iRoundToInt > i4 && iRoundToInt >= o0oo0oo2.f51831OooO0OO) {
                        iIntValue = next2.getKey().intValue();
                        i4 = height;
                    }
                }
                it = it2;
            }
            mutableIntState.setIntValue(iIntValue);
        }
        OooOOO0.OooO0O0("onSlidingDown momentAdapterTag is " + momentAdapterTag + ",playPosition is " + mutableIntState.getIntValue() + ",listSize is " + i);
    }

    @Composable
    public final void OooO0O0(int i, @Nullable MomentAdapterTag momentAdapterTag, @Nullable Composer composer, int i2, int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2126400955);
        MomentAdapterTag momentAdapterTag2 = (i3 & 2) != 0 ? null : momentAdapterTag;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126400955, i2, -1, "com.yalla.yalla.ui.composable.moment.utils.MomentGifPlayManager.initSlidingObserver (MomentGifPlayManager.kt:41)");
        }
        composerStartRestartGroup.startReplaceableGroup(-662007472);
        if (this.f51831OooO0OO == 0) {
            this.f51831OooO0OO = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo318roundToPx0680j_4(Dp.m3765constructorimpl(120));
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-662007219);
        LazyListState lazyListState = this.f51829OooO00o;
        if (lazyListState != null && lazyListState.isScrollInProgress()) {
            EffectsKt.DisposableEffect(Unit.INSTANCE, new OooO00o(i, momentAdapterTag2), composerStartRestartGroup, 6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Lifecycle.Event.ON_CREATE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        MomentAdapterTag momentAdapterTag3 = momentAdapterTag2;
        o00Oo0.OooO0O0(new OooO0O0(momentAdapterTag3, i, coroutineScope, this, mutableState), composerStartRestartGroup, 0);
        EffectsKt.LaunchedEffect(Integer.valueOf(i), new OooO0OO(momentAdapterTag3, i, coroutineScope, mutableState, this, null), composerStartRestartGroup, (i2 & 14) | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i, momentAdapterTag2, i2, i3));
    }

    public final void OooO0OO(int i, @NotNull LayoutCoordinates layoutCoordinates, @NotNull MomentDetailModel data) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(data, "data");
        if (((int) LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getHeight()) != 0) {
            this.f51830OooO0O0.put(Integer.valueOf(i), new Pair<>(layoutCoordinates, data));
        }
    }
}
