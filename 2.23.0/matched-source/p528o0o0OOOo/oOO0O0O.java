package p528o0o0OOOo;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.qiniu.android.storage.Configuration;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.app.application.ProcessLifecycleObserver;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import com.yalla.yalla.util.cache.VideoPreloadWorker;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00OO;
import p148o00Oo0o.o00oO0o;
import p375o0OOoOO.o0000Ooo;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVideoPlayerContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,509:1\n25#2:510\n25#2:518\n25#2:529\n25#2:540\n25#2:547\n25#2:554\n25#2:561\n36#2:568\n25#2:575\n25#2:582\n25#2:600\n50#2:607\n49#2:608\n36#2:615\n36#2:622\n36#2:629\n50#2:636\n49#2:637\n36#2:644\n456#2,8:665\n464#2,3:679\n467#2,3:685\n456#2,8:703\n464#2,3:717\n467#2,3:723\n1097#3,6:511\n1097#3,6:519\n1097#3,3:530\n1100#3,3:536\n1097#3,6:541\n1097#3,6:548\n1097#3,6:555\n1097#3,6:562\n1097#3,6:569\n1097#3,6:576\n1097#3,6:583\n1097#3,6:601\n1097#3,6:609\n1097#3,6:616\n1097#3,6:623\n1097#3,6:630\n1097#3,6:638\n1097#3,6:645\n76#4:517\n486#5,4:525\n490#5,2:533\n494#5:539\n486#6:535\n81#7,11:589\n154#8:651\n154#8:683\n154#8:684\n154#8:721\n154#8:722\n76#9,2:652\n78#9:682\n82#9:689\n76#9,2:690\n78#9:720\n82#9:727\n78#10,11:654\n91#10:688\n78#10,11:692\n91#10:726\n4144#11,6:673\n4144#11,6:711\n81#12:728\n107#12,2:729\n81#12:731\n107#12,2:732\n81#12:734\n107#12,2:735\n81#12:737\n107#12,2:738\n81#12:743\n81#12:744\n81#12:745\n107#12,2:746\n75#13:740\n108#13,2:741\n*S KotlinDebug\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt\n*L\n94#1:510\n97#1:518\n101#1:529\n102#1:540\n103#1:547\n104#1:554\n107#1:561\n117#1:568\n124#1:575\n196#1:582\n201#1:600\n213#1:607\n213#1:608\n362#1:615\n364#1:622\n368#1:629\n405#1:636\n405#1:637\n415#1:644\n445#1:665,8\n445#1:679,3\n445#1:685,3\n490#1:703,8\n490#1:717,3\n490#1:723,3\n94#1:511,6\n97#1:519,6\n101#1:530,3\n101#1:536,3\n102#1:541,6\n103#1:548,6\n104#1:555,6\n107#1:562,6\n117#1:569,6\n124#1:576,6\n196#1:583,6\n201#1:601,6\n213#1:609,6\n362#1:616,6\n364#1:623,6\n368#1:630,6\n405#1:638,6\n415#1:645,6\n95#1:517\n101#1:525,4\n101#1:533,2\n101#1:539\n101#1:535\n200#1:589,11\n439#1:651\n455#1:683\n457#1:684\n500#1:721\n502#1:722\n445#1:652,2\n445#1:682\n445#1:689\n490#1:690,2\n490#1:720\n490#1:727\n445#1:654,11\n445#1:688\n490#1:692,11\n490#1:726\n445#1:673,6\n490#1:711,6\n94#1:728\n94#1:729,2\n97#1:731\n97#1:732,2\n102#1:734\n102#1:735,2\n103#1:737\n103#1:738,2\n114#1:743\n124#1:744\n201#1:745\n201#1:746,2\n104#1:740\n104#1:741,2\n*E\n"})
public final class oOO0O0O {

    public static final class OooO extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f54143OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54144OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(float f, String str) {
            super(1);
            this.f54143OooO0Oo = f;
            this.f54144OooO0o0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setScaleType(this.f54143OooO0Oo <= 0.5625f ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(it.getContext());
            oooO00o.f43911OooO0OO = this.f54144OooO0o0;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54145OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54146OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, int i) {
            super(2);
            this.f54145OooO0Oo = boxScope;
            this.f54146OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54146OooO0o0 | 1);
            oOO0O0O.OooO00o(this.f54145OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVideoPlayerContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt$ProgressContent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,509:1\n154#2:510\n154#2:511\n*S KotlinDebug\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt$ProgressContent$1\n*L\n376#1:510\n378#1:511\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54147OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f54148OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, Function0<Float> function0) {
            super(2);
            this.f54147OooO0Oo = boxScope;
            this.f54148OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1649964613, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ProgressContent.<anonymous> (VideoPlayerContent.kt:372)");
                }
                float f = 16;
                ProgressIndicatorKt.m1142LinearProgressIndicator_5eSRE(this.f54148OooO0o0.invoke().floatValue(), this.f54147OooO0Oo.align(ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null), 0.0f, 1, null), Dp.m3765constructorimpl(2)), RoundedCornerShapeKt.getCircleShape()), Alignment.INSTANCE.getBottomCenter()), o0oO0O0o.f46944OooO, o0oO0O0o.f46949OooO0o, 0, composer2, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54149OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54150OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f54151OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, Function0<Float> function0, int i) {
            super(2);
            this.f54149OooO0Oo = boxScope;
            this.f54151OooO0o0 = function0;
            this.f54150OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54150OooO0o | 1);
            oOO0O0O.OooO0O0(this.f54149OooO0Oo, this.f54151OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f54152OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return new NetImageView(context2);
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f54153OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54154OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f54155OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54156OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f54157OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54158OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<o0OOo000.OooOO0O> f54159OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f54160OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f54161OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(BoxScope boxScope, String str, float f, String str2, MutableState<Boolean> mutableState, State<Boolean> state, Function0<? extends o0OOo000.OooOO0O> function0, Function0<Float> function1, int i) {
            super(2);
            this.f54154OooO0Oo = boxScope;
            this.f54156OooO0o0 = str;
            this.f54155OooO0o = f;
            this.f54157OooO0oO = str2;
            this.f54158OooO0oo = mutableState;
            this.f54153OooO = state;
            this.f54159OooOO0 = function0;
            this.f54160OooOO0O = function1;
            this.f54161OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0O0O.OooO0OO(this.f54154OooO0Oo, this.f54156OooO0o0, this.f54155OooO0o, this.f54157OooO0oO, this.f54158OooO0oo, this.f54153OooO, this.f54159OooOO0, this.f54160OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54161OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54162OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54163OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54164OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54165OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PagerState f54166OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o00oO0o f54167OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<String, Boolean, Float, Unit> f54168OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54169OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54170OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f54171OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f54172OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f54173OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(BoxScope boxScope, MomentDetailModel momentDetailModel, int i, PagerState pagerState, o00oO0o o00oo0o2, Function0<Unit> function0, Function3<? super String, ? super Boolean, ? super Float, Unit> function3, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Integer> mutableState3, int i2, int i3) {
            super(2);
            this.f54163OooO0Oo = boxScope;
            this.f54165OooO0o0 = momentDetailModel;
            this.f54164OooO0o = i;
            this.f54166OooO0oO = pagerState;
            this.f54167OooO0oo = o00oo0o2;
            this.f54162OooO = function0;
            this.f54168OooOO0 = function3;
            this.f54169OooOO0O = mutableState;
            this.f54170OooOO0o = mutableState2;
            this.f54172OooOOO0 = mutableState3;
            this.f54171OooOOO = i2;
            this.f54173OooOOOO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0O0O.OooO0Oo(this.f54163OooO0Oo, this.f54165OooO0o0, this.f54164OooO0o, this.f54166OooO0oO, this.f54167OooO0oo, this.f54162OooO, this.f54168OooOO0, this.f54169OooOO0O, this.f54170OooOO0o, this.f54172OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54171OooOOO | 1), this.f54173OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Lifecycle.Event, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54174OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f54175OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54176OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54177OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54178OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f54179OooO0oo;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(PagerState pagerState, int i, MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, MutableState<o0OOo000.OooO0OO> mutableState2, MutableFloatState mutableFloatState) {
            super(1);
            this.f54175OooO0Oo = pagerState;
            this.f54177OooO0o0 = i;
            this.f54176OooO0o = mutableState;
            this.f54178OooO0oO = momentDetailModel;
            this.f54179OooO0oo = mutableState2;
            this.f54174OooO = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Lifecycle.Event event) {
            Lifecycle.Event it = event;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = OooO00o.$EnumSwitchMapping$0[it.ordinal()];
            MutableState<o0OOo000.OooO0OO> mutableState = this.f54179OooO0oo;
            if (i != 1) {
                int i2 = this.f54177OooO0o0;
                PagerState pagerState = this.f54175OooO0Oo;
                MomentDetailModel momentDetailModel = this.f54178OooO0oO;
                if (i != 2) {
                    if (i == 3 && pagerState.getSettledPage() == i2) {
                        o0OO000.OooO0O0("106052", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Long.valueOf((long) (this.f54174OooO.getFloatValue() * momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                    }
                } else if (pagerState.getSettledPage() == i2) {
                    MutableState<Boolean> mutableState2 = this.f54176OooO0o;
                    if (!mutableState2.getValue().booleanValue()) {
                        mutableState2.setValue(Boolean.FALSE);
                        o0OOo000.OooO0OO oooO0OOOooO0o0 = oOO0O0O.OooO0o0(mutableState);
                        if (oooO0OOOooO0o0 != null) {
                            oooO0OOOooO0o0.OooO00o(momentDetailModel.getVideoUrl());
                        }
                    }
                }
            } else {
                o0OOo000.OooO0OO oooO0OOOooO0o1 = oOO0O0O.OooO0o0(mutableState);
                if (oooO0OOOooO0o1 != null) {
                    oooO0OOOooO0o1.pause();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$1", f = "VideoPlayerContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f54180OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f54181OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54182OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54183OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54184OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f54185OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<Integer> mutableState, int i, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState2, Ref.FloatRef floatRef, MutableState<o0OOo000.OooO0OO> mutableState3, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f54181OooO0Oo = mutableState;
            this.f54183OooO0o0 = i;
            this.f54182OooO0o = momentDetailModel;
            this.f54184OooO0oO = mutableState2;
            this.f54185OooO0oo = floatRef;
            this.f54180OooO = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f54181OooO0Oo, this.f54183OooO0o0, this.f54182OooO0o, this.f54184OooO0oO, this.f54185OooO0oo, this.f54180OooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState<Integer> mutableState = this.f54181OooO0Oo;
            if (mutableState.getValue().intValue() >= 0 && mutableState.getValue().intValue() == this.f54183OooO0o0) {
                MutableState<o0OOo000.OooO0OO> mutableState2 = this.f54180OooO;
                if (oOO0O0O.OooO0o0(mutableState2) != null) {
                    o0OOo000.OooO0OO value = mutableState2.getValue();
                    MomentDetailModel momentDetailModel = this.f54182OooO0o;
                    if (value != null) {
                        value.OooO00o(momentDetailModel.getVideoUrl());
                    }
                    this.f54184OooO0oO.setValue(Boxing.boxBoolean(true));
                    List listSplit$default = StringsKt__StringsKt.split$default(momentDetailModel.getVideoSize(), new String[]{"*"}, false, 0, 6, (Object) null);
                    this.f54185OooO0oo.element = listSplit$default.size() >= 2 ? Float.parseFloat((String) listSplit$default.get(0)) / Float.parseFloat((String) listSplit$default.get(1)) : 1.0f;
                    mutableState.setValue(Boxing.boxInt(-1));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$3", f = "VideoPlayerContent.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ State<o00oO0o> f54186OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54187OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54188OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f54189OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54190OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54191OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f54192OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54193OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54194OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54195OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Job> f54196OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f54197OooOOOO;

        public static final class OooO00o extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f54198OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f54199OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ LifecycleOwner f54200OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f54201OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ State<o00oO0o> f54202OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f54203OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54204OooOO0;

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54205OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<Job> f54206OooOO0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner, State<? extends o00oO0o> state, PointerInputScope pointerInputScope, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Job> mutableState3) {
                super(1);
                this.f54199OooO0Oo = momentDetailModel;
                this.f54201OooO0o0 = momentVideoVM;
                this.f54200OooO0o = lifecycleOwner;
                this.f54202OooO0oO = state;
                this.f54203OooO0oo = pointerInputScope;
                this.f54198OooO = coroutineScope;
                this.f54204OooOO0 = mutableState;
                this.f54205OooOO0O = mutableState2;
                this.f54206OooOO0o = mutableState3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                long packedValue = offset.getPackedValue();
                MutableState<Boolean> mutableState = this.f54204OooOO0;
                if (!mutableState.getValue().booleanValue()) {
                    MomentDetailModel momentDetailModel = this.f54199OooO0Oo;
                    if (!momentDetailModel.isPraise()) {
                        MutableState<Boolean> mutableState2 = this.f54205OooOO0O;
                        if (!mutableState2.getValue().booleanValue()) {
                            o0OO000.OooO00o("106114");
                            mutableState2.setValue(Boolean.TRUE);
                            o0000Ooo.OooO00o(this.f54201OooO0o0.praisePost(momentDetailModel.getId(), true), this.f54200OooO0o, new oOO0OOO(momentDetailModel, mutableState2));
                        }
                    }
                }
                mutableState.setValue(Boolean.TRUE);
                o00oO0o value = this.f54202OooO0oO.getValue();
                if (value != null) {
                    float fM1436getXimpl = Offset.m1436getXimpl(packedValue);
                    PointerInputScope pointerInputScope = this.f54203OooO0oo;
                    value.OooO00o(DpKt.m3786DpOffsetYgX7TsA(pointerInputScope.mo320toDpu2uoSUM(fM1436getXimpl), pointerInputScope.mo320toDpu2uoSUM(Offset.m1437getYimpl(packedValue))));
                }
                MutableState<Job> mutableState3 = this.f54206OooOO0o;
                Job value2 = mutableState3.getValue();
                if (value2 != null) {
                    Job.DefaultImpls.cancel$default(value2, (CancellationException) null, 1, (Object) null);
                }
                mutableState3.setValue(BuildersKt__Builders_commonKt.launch$default(this.f54198OooO, null, null, new oOO0Oo00(mutableState, null), 3, null));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$3$2", f = "VideoPlayerContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Job> f54207OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ PressGestureScope f54208OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ State<o00oO0o> f54209OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ long f54210OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f54211OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54212OooO0oo;

            @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$3$2$1", f = "VideoPlayerContent.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
            public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f54213OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ MutableState<Boolean> f54214OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f54214OooO0o0 = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new OooO00o(this.f54214OooO0o0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f54213OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f54213OooO0Oo = 1;
                        if (DelayKt.delay(600L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f54214OooO0o0.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(State<? extends o00oO0o> state, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Job> mutableState2, Continuation<? super OooO0O0> continuation) {
                super(3, continuation);
                this.f54209OooO0o = state;
                this.f54211OooO0oO = coroutineScope;
                this.f54212OooO0oo = mutableState;
                this.f54207OooO = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                long packedValue = offset.getPackedValue();
                OooO0O0 oooO0O0 = new OooO0O0(this.f54209OooO0o, this.f54211OooO0oO, this.f54212OooO0oo, this.f54207OooO, continuation);
                oooO0O0.f54208OooO0Oo = pressGestureScope;
                oooO0O0.f54210OooO0o0 = packedValue;
                return oooO0O0.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = this.f54208OooO0Oo;
                long j = this.f54210OooO0o0;
                MutableState<Boolean> mutableState = this.f54212OooO0oo;
                if (mutableState.getValue().booleanValue()) {
                    o00oO0o value = this.f54209OooO0o.getValue();
                    if (value != null) {
                        value.OooO00o(DpKt.m3786DpOffsetYgX7TsA(pressGestureScope.mo320toDpu2uoSUM(Offset.m1436getXimpl(j)), pressGestureScope.mo320toDpu2uoSUM(Offset.m1437getYimpl(j))));
                    }
                    MutableState<Job> mutableState2 = this.f54207OooO;
                    Job value2 = mutableState2.getValue();
                    if (value2 != null) {
                        Job.DefaultImpls.cancel$default(value2, (CancellationException) null, 1, (Object) null);
                    }
                    mutableState2.setValue(BuildersKt__Builders_commonKt.launch$default(this.f54211OooO0oO, null, null, new OooO00o(mutableState, null), 3, null));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54215OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54216OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f54217OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f54218OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState2, MutableState<o0OOo000.OooO0OO> mutableState3) {
                super(1);
                this.f54215OooO0Oo = mutableState;
                this.f54217OooO0o0 = momentDetailModel;
                this.f54216OooO0o = mutableState2;
                this.f54218OooO0oO = mutableState3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                offset.getPackedValue();
                if (!this.f54216OooO0o.getValue().booleanValue()) {
                    MutableState<o0OOo000.OooO0OO> mutableState = this.f54218OooO0oO;
                    o0OOo000.OooO0OO oooO0OOOooO0o0 = oOO0O0O.OooO0o0(mutableState);
                    boolean z = oooO0OOOooO0o0 != null && oooO0OOOooO0o0.isPlaying();
                    MutableState<Boolean> mutableState2 = this.f54215OooO0Oo;
                    if (z) {
                        mutableState2.setValue(Boolean.TRUE);
                        o0OOo000.OooO0OO value = mutableState.getValue();
                        if (value != null) {
                            value.pause();
                        }
                        o0OO000.OooO0O0("106115", MapsKt.mapOf(TuplesKt.to("state", 0)));
                    } else {
                        mutableState2.setValue(Boolean.FALSE);
                        o0OOo000.OooO0OO value2 = mutableState.getValue();
                        if (value2 != null) {
                            value2.OooO00o(this.f54217OooO0o0.getVideoUrl());
                        }
                        o0OO000.OooO0O0("106115", MapsKt.mapOf(TuplesKt.to("state", 1)));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner, State<? extends o00oO0o> state, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Job> mutableState3, MutableState<Boolean> mutableState4, MutableState<o0OOo000.OooO0OO> mutableState5, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f54188OooO0o = momentDetailModel;
            this.f54190OooO0oO = momentVideoVM;
            this.f54191OooO0oo = lifecycleOwner;
            this.f54186OooO = state;
            this.f54192OooOO0 = coroutineScope;
            this.f54193OooOO0O = mutableState;
            this.f54194OooOO0o = mutableState2;
            this.f54196OooOOO0 = mutableState3;
            this.f54195OooOOO = mutableState4;
            this.f54197OooOOOO = mutableState5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f54188OooO0o, this.f54190OooO0oO, this.f54191OooO0oo, this.f54186OooO, this.f54192OooOO0, this.f54193OooOO0O, this.f54194OooOO0o, this.f54196OooOOO0, this.f54195OooOOO, this.f54197OooOOOO, continuation);
            oooOOOO.f54189OooO0o0 = obj;
            return oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54187OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f54189OooO0o0;
                OooO00o oooO00o = new OooO00o(this.f54188OooO0o, this.f54190OooO0oO, this.f54191OooO0oo, this.f54186OooO, pointerInputScope, this.f54192OooOO0, this.f54193OooOO0O, this.f54194OooOO0o, this.f54196OooOOO0);
                OooO0O0 oooO0O0 = new OooO0O0(this.f54186OooO, this.f54192OooOO0, this.f54193OooOO0O, this.f54196OooOOO0, null);
                OooO0OO oooO0OO = new OooO0OO(this.f54195OooOOO, this.f54188OooO0o, this.f54193OooOO0O, this.f54197OooOOOO);
                this.f54187OooO0Oo = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, oooO00o, null, oooO0O0, oooO0OO, this, 2, null) == coroutine_suspended) {
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

    public static final class OooOo extends Lambda implements Function3<Float, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54219OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54220OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(Function0<Unit> function0, MutableFloatState mutableFloatState) {
            super(3);
            this.f54219OooO0Oo = function0;
            this.f54220OooO0o0 = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f, Long l, Long l2) {
            float fFloatValue = f.floatValue();
            long jLongValue = l.longValue();
            l2.longValue();
            this.f54220OooO0o0.setFloatValue(fFloatValue);
            Function0<Unit> function0 = this.f54219OooO0Oo;
            if (function0 != null && jLongValue > 5000) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<o0OOo000.OooO0OO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54221OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f54222OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MomentDetailModel momentDetailModel, MutableState<o0OOo000.OooO0OO> mutableState) {
            super(1);
            this.f54221OooO0Oo = momentDetailModel;
            this.f54222OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OOo000.OooO0OO oooO0OO) {
            o0OOo000.OooO0OO it = oooO0OO;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f54222OooO0o0.setValue(it);
            o0OOo000.OooOOO oooOOOOooO0o0 = it.OooO0o0();
            MomentDetailModel momentDetailModel = this.f54221OooO0Oo;
            String videoUrl = momentDetailModel.getVideoUrl();
            oooOOOOooO0o0.getClass();
            Intrinsics.checkNotNullParameter(videoUrl, "<set-?>");
            oooOOOOooO0o0.f43858OooO00o = videoUrl;
            it.OooO0oo(false);
            it.OooO(momentDetailModel.getVideoUrl());
            p592o0oo00O.OooOOO0.OooO0O0("VideoPlayerContent onCreatePlayControl " + it + ",play uri:" + momentDetailModel.getVideoUrl() + ",");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<o0OOo000.OooOO0O> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooOO0O> f54223OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState<o0OOo000.OooOO0O> mutableState) {
            super(0);
            this.f54223OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOo000.OooOO0O invoke() {
            return this.f54223OooO0Oo.getValue();
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<o0OOo000.OooOO0O, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooOO0O> f54224OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54225OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function3<String, Boolean, Float, Unit> f54226OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54227OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54228OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<o0OOo000.OooOO0O> f54229OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54230OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f54231OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(MomentDetailModel momentDetailModel, Function0<Unit> function0, Function3<? super String, ? super Boolean, ? super Float, Unit> function3, MutableState<Boolean> mutableState, Ref.ObjectRef<o0OOo000.OooOO0O> objectRef, MutableState<o0OOo000.OooOO0O> mutableState2, MutableFloatState mutableFloatState, MutableState<o0OOo000.OooO0OO> mutableState3) {
            super(1);
            this.f54225OooO0Oo = momentDetailModel;
            this.f54227OooO0o0 = function0;
            this.f54226OooO0o = function3;
            this.f54228OooO0oO = mutableState;
            this.f54229OooO0oo = objectRef;
            this.f54224OooO = mutableState2;
            this.f54230OooOO0 = mutableFloatState;
            this.f54231OooOO0O = mutableState3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [T, java.lang.Object, o0OOo000.OooOO0O] */
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
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OOo000.OooOO0O oooOO0O) {
            o0OOo000.OooOO0O state = oooOO0O;
            Intrinsics.checkNotNullParameter(state, "state");
            MomentDetailModel momentDetailModel = this.f54225OooO0Oo;
            p592o0oo00O.OooOOO0.OooO0O0("VideoPlayerContent state " + state + ",play uri:" + momentDetailModel.getVideoUrl() + ",");
            MutableState<o0OOo000.OooOO0O> mutableState = this.f54224OooO;
            mutableState.setValue(state);
            o0OOo000.OooOO0O.OooOO0 oooOO1 = o0OOo000.OooOO0O.OooOO0.f43855OooO00o;
            Function0<Unit> function0 = this.f54227OooO0o0;
            if (function0 != null && Intrinsics.areEqual((o0OOo000.OooOO0O) mutableState.getValue(), oooOO1)) {
                function0.invoke();
            }
            MutableFloatState mutableFloatState = this.f54230OooOO0;
            Function3<String, Boolean, Float, Unit> function3 = this.f54226OooO0o;
            if (function3 != null) {
                function3.invoke(momentDetailModel.getVideoUrl(), Boolean.valueOf(Intrinsics.areEqual((o0OOo000.OooOO0O) mutableState.getValue(), oooOO1)), Float.valueOf(mutableFloatState.getFloatValue()));
            }
            o0OOo000.OooO0OO oooO0OOOooO0o0 = oOO0O0O.OooO0o0(this.f54231OooOO0O);
            momentDetailModel.setVideoDuration((int) (oooO0OOOooO0o0 != null ? oooO0OOOooO0o0.getDuration() : 0L));
            mutableState.setValue(state);
            o0OOo000.OooOO0O oooOO0O2 = (o0OOo000.OooOO0O) mutableState.getValue();
            boolean zAreEqual = Intrinsics.areEqual(oooOO0O2, o0OOo000.OooOO0O.OooO.f43851OooO00o);
            o0OOo000.OooOO0O.OooO0o oooO0o = o0OOo000.OooOO0O.OooO0o.f43854OooO00o;
            Ref.ObjectRef<o0OOo000.OooOO0O> objectRef = this.f54229OooO0oo;
            MutableState<Boolean> mutableState2 = this.f54228OooO0oO;
            if (zAreEqual) {
                mutableState2.setValue(Boolean.FALSE);
                if (!Intrinsics.areEqual(objectRef.element, oooO0o)) {
                    o0OO000.OooO0OO("106050", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                }
            } else if (Intrinsics.areEqual(oooOO0O2, oooO0o)) {
                mutableState2.setValue(Boolean.TRUE);
                o0OO000.OooO0O0("106051", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Long.valueOf(RangesKt.coerceAtLeast((long) (mutableFloatState.getFloatValue() * momentDetailModel.getVideoDuration()), 0L))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            } else if (Intrinsics.areEqual(oooOO0O2, oooOO1)) {
                mutableState2.setValue(Boolean.FALSE);
                o0OO000.OooO0OO("106050", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                o0OO000.OooO0O0("106052", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            } else {
                mutableState2.setValue(Boolean.FALSE);
            }
            objectRef.element = state;
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54232OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MutableFloatState mutableFloatState) {
            super(0);
            this.f54232OooO0Oo = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f54232OooO0Oo.getFloatValue());
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f54233OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54234OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(PagerState pagerState, int i) {
            super(0);
            this.f54233OooO0Oo = pagerState;
            this.f54234OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f54233OooO0Oo.getSettledPage() == this.f54234OooO0o0);
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f54235OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54236OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MutableFloatState mutableFloatState) {
            super(0);
            this.f54236OooO0Oo = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f54236OooO0Oo.getFloatValue());
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1391461282);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1391461282, i, -1, "com.yalla.yalla.ui.screen.moment.media.LoadingView (VideoPlayerContent.kt:488)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScope.align(companion, companion2.getCenter()), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            p154o00OoO00.OooOo00.OooO00o("svga/anim_video_loading.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(80)), composerStartRestartGroup, 196662, 28);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.video_feed_loading, composerStartRestartGroup, 0);
            int i3 = o0oO0O0o.f47152o00OOOo;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, o0oO0O0o.f46957OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(BoxScope boxScope, Function0<Float> function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1893061883);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1893061883, i, -1, "com.yalla.yalla.ui.screen.moment.media.ProgressContent (VideoPlayerContent.kt:371)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1649964613, true, new OooO0O0(boxScope, function0)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(boxScope, function0, i));
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0392  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(BoxScope boxScope, String str, float f, String str2, MutableState<Boolean> mutableState, State<Boolean> state, Function0<? extends o0OOo000.OooOO0O> function0, Function0<Float> function1, Composer composer, int i) {
        int i2;
        Map<Long, Float> map;
        Float f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1820004321);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : Configuration.BLOCK_SIZE;
        }
        if ((23967451 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820004321, i2, -1, "com.yalla.yalla.ui.screen.moment.media.StateContent (VideoPlayerContent.kt:388)");
            }
            composerStartRestartGroup.startReplaceableGroup(-163432010);
            float f3 = 0.0f;
            if (mutableState.getValue().booleanValue()) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                OooO0o oooO0o = OooO0o.f54152OooO0Oo;
                Float fValueOf = Float.valueOf(f);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(str2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO(f, str2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooO0o, modifierFillMaxSize$default, (Function1) objRememberedValue, composerStartRestartGroup, 54, 0);
                f3 = 0.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            long jAbs = Math.abs(str.hashCode());
            Long lValueOf = Long.valueOf(jAbs);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(lValueOf);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Map<Long, Float> map2 = VideoPreloadWorker.f32839OooOOOO;
                Map<Long, Float> map3 = VideoPreloadWorker.f32839OooOOOO;
                objRememberedValue2 = Boolean.valueOf(map3.get(Long.valueOf(jAbs)) == null || Intrinsics.areEqual(map3.get(Long.valueOf(jAbs)), f3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ((Boolean) objRememberedValue2).booleanValue();
            o0OOo000.OooOO0O oooOO0OInvoke = function0.invoke();
            if (Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooOO0.f43855OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(-163431292);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooO.f43851OooO00o)) {
                    composerStartRestartGroup.startReplaceableGroup(-163431253);
                    composerStartRestartGroup.endReplaceableGroup();
                    Long lValueOf2 = Long.valueOf(jAbs);
                    Map<Long, Float> map4 = VideoPreloadWorker.f32839OooOOOO;
                    VideoPreloadWorker.f32839OooOOOO.put(lValueOf2, function1.invoke());
                    mutableState.setValue(Boolean.FALSE);
                } else {
                    if (Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooO0o.f43854OooO00o) ? true : Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooOOO0.f43857OooO00o)) {
                        composerStartRestartGroup.startReplaceableGroup(-163431103);
                        Long lValueOf3 = Long.valueOf(jAbs);
                        Map<Long, Float> map5 = VideoPreloadWorker.f32839OooOOOO;
                        VideoPreloadWorker.f32839OooOOOO.put(lValueOf3, function1.invoke());
                        if (state.getValue().booleanValue()) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_feed_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(80)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        jAbs = jAbs;
                        if (oooOO0OInvoke instanceof o0OOo000.OooOO0O.OooO0OO) {
                            composerStartRestartGroup.startReplaceableGroup(-163430669);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScope.align(companion, companion2.getCenter()), f3, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            p154o00OoO00.OooOo00.OooO00o("svga/anim_video_loading.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(80)), composerStartRestartGroup, 196662, 28);
                            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.video_feed_loading, composerStartRestartGroup, 0);
                            int i3 = o0oO0O0o.f47152o00OOOo;
                            TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, o0oO0O0o.f46957OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-163429924);
                            Map<Long, Float> map6 = VideoPreloadWorker.f32839OooOOOO;
                            Float f4 = VideoPreloadWorker.f32839OooOOOO.get(Long.valueOf(jAbs));
                            if (f4 != null && f4.floatValue() < function1.invoke().floatValue()) {
                                OooO00o(boxScope, composerStartRestartGroup, i2 & 14);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                }
                Map<Long, Float> map7 = VideoPreloadWorker.f32839OooOOOO;
                map = VideoPreloadWorker.f32839OooOOOO;
                f2 = map.get(Long.valueOf(jAbs));
                if (f2 != null && f2.floatValue() < function1.invoke().floatValue()) {
                    map.put(Long.valueOf(jAbs), function1.invoke());
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            jAbs = jAbs;
            Map<Long, Float> map8 = VideoPreloadWorker.f32839OooOOOO;
            map = VideoPreloadWorker.f32839OooOOOO;
            f2 = map.get(Long.valueOf(jAbs));
            if (f2 != null) {
                map.put(Long.valueOf(jAbs), function1.invoke());
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(boxScope, str, f, str2, mutableState, state, function0, function1, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull BoxScope boxScope, @NotNull MomentDetailModel model, int i, @NotNull PagerState pagerState, @Nullable o00oO0o o00oo0o2, @Nullable Function0<Unit> function0, @Nullable Function3<? super String, ? super Boolean, ? super Float, Unit> function3, @NotNull MutableState<Boolean> loadingStart, @NotNull MutableState<Boolean> videoPauseState, @NotNull MutableState<Integer> refreshIndex, @Nullable Composer composer, int i2, int i3) {
        int i4;
        char c;
        SnapshotMutationPolicy snapshotMutationPolicy;
        T t;
        o0OOo000.OooO0OO oooO0OO;
        o0OOo000.OooO0OO oooO0OO2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(loadingStart, "loadingStart");
        Intrinsics.checkNotNullParameter(videoPauseState, "videoPauseState");
        Intrinsics.checkNotNullParameter(refreshIndex, "refreshIndex");
        Composer composerStartRestartGroup = composer.startRestartGroup(-170228596);
        o00oO0o o00oo0o3 = (i3 & 8) != 0 ? null : o00oo0o2;
        Function0<Unit> function1 = (i3 & 16) != 0 ? null : function0;
        Function3<? super String, ? super Boolean, ? super Float, Unit> function4 = (i3 & 32) != 0 ? null : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-170228596, i2, -1, "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContent (VideoPlayerContent.kt:82)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0OOo000.OooOO0O.OooO00o.f43852OooO00o, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(o00oo0o3, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            i4 = 2;
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        } else {
            i4 = 2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue4;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) objRememberedValue5;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue6;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState5 = (MutableState) objRememberedValue7;
        Function0<Unit> function2 = function1;
        o00oO0o o00oo0o4 = o00oo0o3;
        MutableState mutableState6 = (MutableState) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) o00Oo0.f54235OooO0Oo, composerStartRestartGroup, 3080, 6);
        State stateCollectAsState = SnapshotStateKt.collectAsState(ProcessLifecycleObserver.f22706OooO0Oo, null, composerStartRestartGroup, 8, 1);
        List listSplit$default = StringsKt__StringsKt.split$default(model.getVideoSize(), new String[]{"*"}, false, 0, 6, (Object) null);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        String videoSize = model.getVideoSize();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(videoSize);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue8 == companion.getEmpty()) {
            Float fValueOf = Float.valueOf(listSplit$default.size() >= 2 ? Float.parseFloat((String) listSplit$default.get(0)) / Float.parseFloat((String) listSplit$default.get(1)) : 1.0f);
            composerStartRestartGroup.updateRememberedValue(fValueOf);
            objRememberedValue8 = fValueOf;
            c = 2;
        } else {
            c = 2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        floatRef.element = ((Number) objRememberedValue8).floatValue();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = SnapshotStateKt.derivedStateOf(new o00O0O(pagerState, i));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (!((Boolean) ((State) objRememberedValue9).getValue()).booleanValue()) {
            o0OOo000.OooO0OO oooO0OO3 = (o0OOo000.OooO0OO) mutableState.getValue();
            if (oooO0OO3 != null && oooO0OO3.isPlaying()) {
                p592o0oo00O.OooOOO0.OooO0O0("VideoPlayerContent settledPage stop play index is " + i + ", uri is " + model.getVideoUrl());
                Pair[] pairArr = new Pair[5];
                pairArr[0] = o00OO.OooO0O0(model, "discovery_id");
                pairArr[1] = o0O00o0.OooO00o(model, "video_id");
                pairArr[c] = TuplesKt.to("video_time", Integer.valueOf(model.getVideoDuration()));
                pairArr[3] = TuplesKt.to("duration_time", Long.valueOf((long) (mutableFloatState.getFloatValue() * model.getVideoDuration())));
                pairArr[4] = TuplesKt.to("rec_sessionid", model.getSessionId());
                o0OO000.OooO0O0("106052", MapsKt.mapOf(pairArr));
            }
            mutableState5.setValue(Boolean.FALSE);
            mutableState6.setValue(Boolean.TRUE);
            o0OOo000.OooO0OO oooO0OO4 = (o0OOo000.OooO0OO) mutableState.getValue();
            if (oooO0OO4 != null) {
                oooO0OO4.OooO0o(true);
                Unit unit = Unit.INSTANCE;
            }
        } else if (((Boolean) stateCollectAsState.getValue()).booleanValue() && !((Boolean) mutableState5.getValue()).booleanValue() && (oooO0OO2 = (o0OOo000.OooO0OO) mutableState.getValue()) != null) {
            oooO0OO2.OooO00o(model.getVideoUrl());
            Unit unit2 = Unit.INSTANCE;
        }
        if (!((Boolean) stateCollectAsState.getValue()).booleanValue() && (oooO0OO = (o0OOo000.OooO0OO) mutableState.getValue()) != null) {
            oooO0OO.pause();
            Unit unit3 = Unit.INSTANCE;
        }
        EffectsKt.LaunchedEffect(refreshIndex.getValue(), new OooOOO0(refreshIndex, i, model, mutableState6, floatRef, mutableState, null), composerStartRestartGroup, 64);
        com.code.android.util.o00Oo0.OooO0O0(new OooOOO(pagerState, i, mutableState5, model, mutableState, mutableFloatState), composerStartRestartGroup, 0);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            t = 0;
            composerStartRestartGroup.updateRememberedValue(null);
            snapshotMutationPolicy = null;
        } else {
            snapshotMutationPolicy = null;
            t = objRememberedValue10;
        }
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = t;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState7 = (MutableState) objRememberedValue11;
        int i5 = floatRef.element > 0.5625f ? 0 : 4;
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(BackgroundKt.m169backgroundbw27NRU$default(boxScope.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, snapshotMutationPolicy), Alignment.INSTANCE.getCenter()), o0oO0O0o.f46964OooOo0, null, 2, null), model.getVideoUrl(), new OooOOOO(model, momentVideoVM, lifecycleOwner, stateRememberUpdatedState, coroutineScopeOooO00o, mutableState3, mutableState7, mutableState4, mutableState5, mutableState, null));
        OooOo00 oooOo00 = new OooOo00(model, mutableState);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(function2);
        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new OooOo(function2, mutableFloatState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o0OOo000.OooO.OooO00o(modifierPointerInput, i5, oooOo00, 0L, (Function3) objRememberedValue12, new Oooo000(model, function2, function4, videoPauseState, objectRef, mutableState2, mutableFloatState, mutableState), composerStartRestartGroup, 0, 8);
        String videoUrl = model.getVideoUrl();
        float f = floatRef.element;
        String coverPic = model.getCoverPic();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged3 = composerStartRestartGroup.changed(mutableState2);
        Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = new Oooo0(mutableState2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Function0 function5 = (Function0) objRememberedValue13;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged4 = composerStartRestartGroup.changed(mutableFloatState);
        Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = new o000oOoO(mutableFloatState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i6 = i2 & 14;
        OooO0OO(boxScope, videoUrl, f, coverPic, mutableState6, mutableState5, function5, (Function0) objRememberedValue14, composerStartRestartGroup, i6 | 196608);
        if (!loadingStart.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged5 = composerStartRestartGroup.changed(mutableFloatState);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new o0OoOo0(mutableFloatState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0O0(boxScope, (Function0) objRememberedValue15, composerStartRestartGroup, i6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, model, i, pagerState, o00oo0o4, function2, function4, loadingStart, videoPauseState, refreshIndex, i2, i3));
    }

    public static final o0OOo000.OooO0OO OooO0o0(MutableState mutableState) {
        return (o0OOo000.OooO0OO) mutableState.getValue();
    }
}
