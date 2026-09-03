package p535o0o0Oo0;

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
import com.code.android.util.o000O00O;
import com.qiniu.android.storage.Configuration;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.message.o0oOO;
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
import p194o00o0OO.o00O000;
import p200o00o0OoO.o00OO00O;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVideoPlayerContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,477:1\n25#2:478\n25#2:486\n25#2:497\n25#2:508\n25#2:515\n25#2:522\n25#2:529\n36#2:536\n25#2:543\n25#2:550\n25#2:568\n50#2:575\n49#2:576\n36#2:583\n36#2:590\n36#2:597\n50#2:604\n49#2:605\n456#2,8:626\n464#2,3:640\n467#2,3:646\n1097#3,6:479\n1097#3,6:487\n1097#3,3:498\n1100#3,3:504\n1097#3,6:509\n1097#3,6:516\n1097#3,6:523\n1097#3,6:530\n1097#3,6:537\n1097#3,6:544\n1097#3,6:551\n1097#3,6:569\n1097#3,6:577\n1097#3,6:584\n1097#3,6:591\n1097#3,6:598\n1097#3,6:606\n76#4:485\n486#5,4:493\n490#5,2:501\n494#5:507\n486#6:503\n81#7,11:557\n154#8:612\n154#8:644\n154#8:645\n76#9,2:613\n78#9:643\n82#9:650\n78#10,11:615\n91#10:649\n4144#11,6:634\n81#12:651\n107#12,2:652\n81#12:654\n107#12,2:655\n81#12:657\n107#12,2:658\n81#12:660\n107#12,2:661\n81#12:666\n81#12:667\n81#12:668\n107#12,2:669\n75#13:663\n108#13,2:664\n*S KotlinDebug\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt\n*L\n92#1:478\n95#1:486\n99#1:497\n100#1:508\n101#1:515\n102#1:522\n105#1:529\n115#1:536\n122#1:543\n195#1:550\n200#1:568\n212#1:575\n212#1:576\n361#1:583\n363#1:590\n367#1:597\n403#1:604\n403#1:605\n458#1:626,8\n458#1:640,3\n458#1:646,3\n92#1:479,6\n95#1:487,6\n99#1:498,3\n99#1:504,3\n100#1:509,6\n101#1:516,6\n102#1:523,6\n105#1:530,6\n115#1:537,6\n122#1:544,6\n195#1:551,6\n200#1:569,6\n212#1:577,6\n361#1:584,6\n363#1:591,6\n367#1:598,6\n403#1:606,6\n93#1:485\n99#1:493,4\n99#1:501,2\n99#1:507\n99#1:503\n199#1:557,11\n430#1:612\n468#1:644\n470#1:645\n458#1:613,2\n458#1:643\n458#1:650\n458#1:615,11\n458#1:649\n458#1:634,6\n92#1:651\n92#1:652,2\n95#1:654\n95#1:655,2\n100#1:657\n100#1:658,2\n101#1:660\n101#1:661,2\n112#1:666\n122#1:667\n200#1:668\n200#1:669,2\n102#1:663\n102#1:664,2\n*E\n"})
public final class oO0O0O0o {

    public static final class OooO extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f53997OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f53998OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(float f, String str) {
            super(1);
            this.f53997OooO0Oo = f;
            this.f53998OooO0o0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setScaleType(this.f53997OooO0Oo <= 0.5625f ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(it.getContext());
            oooO00o.f43126OooO0OO = this.f53998OooO0o0;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f53999OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54000OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, int i) {
            super(2);
            this.f53999OooO0Oo = boxScope;
            this.f54000OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54000OooO0o0 | 1);
            oO0O0O0o.OooO00o(this.f53999OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVideoPlayerContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt$ProgressContent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,477:1\n154#2:478\n154#2:479\n*S KotlinDebug\n*F\n+ 1 VideoPlayerContent.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoPlayerContentKt$ProgressContent$1\n*L\n375#1:478\n377#1:479\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54001OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f54002OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, Function0<Float> function0) {
            super(2);
            this.f54001OooO0Oo = boxScope;
            this.f54002OooO0o0 = function0;
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
                ProgressIndicatorKt.m1158LinearProgressIndicator_5eSRE(this.f54002OooO0o0.invoke().floatValue(), this.f54001OooO0Oo.align(ClipKt.clip(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null), 0.0f, 1, null), Dp.m3775constructorimpl(2)), RoundedCornerShapeKt.getCircleShape()), Alignment.INSTANCE.getBottomCenter()), o0OOo000.f48133OooO, o0OOo000.f48138OooO0o, 0, composer2, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54003OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54004OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f54005OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, Function0<Float> function0, int i) {
            super(2);
            this.f54003OooO0Oo = boxScope;
            this.f54005OooO0o0 = function0;
            this.f54004OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54004OooO0o | 1);
            oO0O0O0o.OooO0O0(this.f54003OooO0Oo, this.f54005OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f54006OooO0Oo = new OooO0o();

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
        public final /* synthetic */ State<Boolean> f54007OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54008OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f54009OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54010OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f54011OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54012OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<p363o0OOo00O.OooOOO> f54013OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f54014OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f54015OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(BoxScope boxScope, String str, float f, String str2, MutableState<Boolean> mutableState, State<Boolean> state, Function0<? extends p363o0OOo00O.OooOOO> function0, Function0<Float> function1, int i) {
            super(2);
            this.f54008OooO0Oo = boxScope;
            this.f54010OooO0o0 = str;
            this.f54009OooO0o = f;
            this.f54011OooO0oO = str2;
            this.f54012OooO0oo = mutableState;
            this.f54007OooO = state;
            this.f54013OooOO0 = function0;
            this.f54014OooOO0O = function1;
            this.f54015OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0O0O0o.OooO0OO(this.f54008OooO0Oo, this.f54010OooO0o0, this.f54009OooO0o, this.f54011OooO0oO, this.f54012OooO0oo, this.f54007OooO, this.f54013OooOO0, this.f54014OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54015OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54016OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54017OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54018OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54019OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PagerState f54020OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o00O000 f54021OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<String, Boolean, Float, Unit> f54022OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54023OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54024OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f54025OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f54026OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f54027OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(BoxScope boxScope, MomentDetailModel momentDetailModel, int i, PagerState pagerState, o00O000 o00o001, Function0<Unit> function0, Function3<? super String, ? super Boolean, ? super Float, Unit> function3, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Integer> mutableState3, int i2, int i3) {
            super(2);
            this.f54017OooO0Oo = boxScope;
            this.f54019OooO0o0 = momentDetailModel;
            this.f54018OooO0o = i;
            this.f54020OooO0oO = pagerState;
            this.f54021OooO0oo = o00o001;
            this.f54016OooO = function0;
            this.f54022OooOO0 = function3;
            this.f54023OooOO0O = mutableState;
            this.f54024OooOO0o = mutableState2;
            this.f54026OooOOO0 = mutableState3;
            this.f54025OooOOO = i2;
            this.f54027OooOOOO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0O0O0o.OooO0Oo(this.f54017OooO0Oo, this.f54019OooO0o0, this.f54018OooO0o, this.f54020OooO0oO, this.f54021OooO0oo, this.f54016OooO, this.f54022OooOO0, this.f54023OooOO0O, this.f54024OooOO0o, this.f54026OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54025OooOOO | 1), this.f54027OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Lifecycle.Event, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54028OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f54029OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54030OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54031OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54032OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<p363o0OOo00O.OooO> f54033OooO0oo;

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
        public OooOOO(PagerState pagerState, int i, MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, MutableState<p363o0OOo00O.OooO> mutableState2, MutableFloatState mutableFloatState) {
            super(1);
            this.f54029OooO0Oo = pagerState;
            this.f54031OooO0o0 = i;
            this.f54030OooO0o = mutableState;
            this.f54032OooO0oO = momentDetailModel;
            this.f54033OooO0oo = mutableState2;
            this.f54028OooO = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Lifecycle.Event event) {
            Lifecycle.Event it = event;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = OooO00o.$EnumSwitchMapping$0[it.ordinal()];
            MutableState<p363o0OOo00O.OooO> mutableState = this.f54033OooO0oo;
            if (i != 1) {
                int i2 = this.f54031OooO0o0;
                PagerState pagerState = this.f54029OooO0Oo;
                MomentDetailModel momentDetailModel = this.f54032OooO0oO;
                if (i != 2) {
                    if (i == 3 && pagerState.getSettledPage() == i2) {
                        o0oo0000.OooO00o.OooO0OO("106052", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Long.valueOf((long) (this.f54028OooO.getFloatValue() * momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                    }
                } else if (pagerState.getSettledPage() == i2) {
                    MutableState<Boolean> mutableState2 = this.f54030OooO0o;
                    if (!mutableState2.getValue().booleanValue()) {
                        mutableState2.setValue(Boolean.FALSE);
                        p363o0OOo00O.OooO oooOOooO0o0 = oO0O0O0o.OooO0o0(mutableState);
                        if (oooOOooO0o0 != null) {
                            oooOOooO0o0.OooO00o(momentDetailModel.getVideoUrl());
                        }
                    }
                }
            } else {
                p363o0OOo00O.OooO oooOOooO0o1 = oO0O0O0o.OooO0o0(mutableState);
                if (oooOOooO0o1 != null) {
                    oooOOooO0o1.pause();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$1", f = "VideoPlayerContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<p363o0OOo00O.OooO> f54034OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f54035OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54036OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54037OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54038OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f54039OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<Integer> mutableState, int i, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState2, Ref.FloatRef floatRef, MutableState<p363o0OOo00O.OooO> mutableState3, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f54035OooO0Oo = mutableState;
            this.f54037OooO0o0 = i;
            this.f54036OooO0o = momentDetailModel;
            this.f54038OooO0oO = mutableState2;
            this.f54039OooO0oo = floatRef;
            this.f54034OooO = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f54035OooO0Oo, this.f54037OooO0o0, this.f54036OooO0o, this.f54038OooO0oO, this.f54039OooO0oo, this.f54034OooO, continuation);
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
            MutableState<Integer> mutableState = this.f54035OooO0Oo;
            if (mutableState.getValue().intValue() >= 0 && mutableState.getValue().intValue() == this.f54037OooO0o0) {
                MutableState<p363o0OOo00O.OooO> mutableState2 = this.f54034OooO;
                if (oO0O0O0o.OooO0o0(mutableState2) != null) {
                    p363o0OOo00O.OooO value = mutableState2.getValue();
                    MomentDetailModel momentDetailModel = this.f54036OooO0o;
                    if (value != null) {
                        value.OooO00o(momentDetailModel.getVideoUrl());
                    }
                    this.f54038OooO0oO.setValue(Boxing.boxBoolean(true));
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) momentDetailModel.getVideoSize(), new String[]{"*"}, false, 0, 6, (Object) null);
                    this.f54039OooO0oo.element = listSplit$default.size() >= 2 ? Float.parseFloat((String) listSplit$default.get(0)) / Float.parseFloat((String) listSplit$default.get(1)) : 1.0f;
                    mutableState.setValue(Boxing.boxInt(-1));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$3", f = "VideoPlayerContent.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ State<o00O000> f54040OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54041OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54042OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f54043OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54044OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54045OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f54046OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54047OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54048OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54049OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Job> f54050OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<p363o0OOo00O.OooO> f54051OooOOOO;

        public static final class OooO00o extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f54052OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f54053OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ LifecycleOwner f54054OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f54055OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ State<o00O000> f54056OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f54057OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54058OooOO0;

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54059OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<Job> f54060OooOO0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner, State<? extends o00O000> state, PointerInputScope pointerInputScope, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Job> mutableState3) {
                super(1);
                this.f54053OooO0Oo = momentDetailModel;
                this.f54055OooO0o0 = momentVideoVM;
                this.f54054OooO0o = lifecycleOwner;
                this.f54056OooO0oO = state;
                this.f54057OooO0oo = pointerInputScope;
                this.f54052OooO = coroutineScope;
                this.f54058OooOO0 = mutableState;
                this.f54059OooOO0O = mutableState2;
                this.f54060OooOO0o = mutableState3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                long packedValue = offset.getPackedValue();
                MutableState<Boolean> mutableState = this.f54058OooOO0;
                if (!mutableState.getValue().booleanValue()) {
                    MomentDetailModel momentDetailModel = this.f54053OooO0Oo;
                    if (!momentDetailModel.isPraise()) {
                        MutableState<Boolean> mutableState2 = this.f54059OooOO0O;
                        if (!mutableState2.getValue().booleanValue()) {
                            o0oo0000.OooO00o.OooO0O0("106114");
                            mutableState2.setValue(Boolean.TRUE);
                            p381o0OOoOo0.o0OoOo0.OooO00o(this.f54055OooO0o0.praisePost(momentDetailModel.getId(), true), this.f54054OooO0o, new oOo0o0oO(momentDetailModel, mutableState2));
                        }
                    }
                }
                mutableState.setValue(Boolean.TRUE);
                o00O000 value = this.f54056OooO0oO.getValue();
                if (value != null) {
                    float fM1447getXimpl = Offset.m1447getXimpl(packedValue);
                    PointerInputScope pointerInputScope = this.f54057OooO0oo;
                    value.OooO00o(DpKt.m3796DpOffsetYgX7TsA(pointerInputScope.mo322toDpu2uoSUM(fM1447getXimpl), pointerInputScope.mo322toDpu2uoSUM(Offset.m1448getYimpl(packedValue))));
                }
                MutableState<Job> mutableState3 = this.f54060OooOO0o;
                Job value2 = mutableState3.getValue();
                if (value2 != null) {
                    Job.DefaultImpls.cancel$default(value2, (CancellationException) null, 1, (Object) null);
                }
                mutableState3.setValue(BuildersKt__Builders_commonKt.launch$default(this.f54052OooO, null, null, new ooOOO0Oo(mutableState, null), 3, null));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$3$2", f = "VideoPlayerContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Job> f54061OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ PressGestureScope f54062OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ State<o00O000> f54063OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ long f54064OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f54065OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54066OooO0oo;

            @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContentKt$VideoPlayerContent$3$2$1", f = "VideoPlayerContent.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {})
            public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f54067OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ MutableState<Boolean> f54068OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f54068OooO0o0 = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new OooO00o(this.f54068OooO0o0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f54067OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f54067OooO0Oo = 1;
                        if (DelayKt.delay(600L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f54068OooO0o0.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(State<? extends o00O000> state, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Job> mutableState2, Continuation<? super OooO0O0> continuation) {
                super(3, continuation);
                this.f54063OooO0o = state;
                this.f54065OooO0oO = coroutineScope;
                this.f54066OooO0oo = mutableState;
                this.f54061OooO = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                long packedValue = offset.getPackedValue();
                OooO0O0 oooO0O0 = new OooO0O0(this.f54063OooO0o, this.f54065OooO0oO, this.f54066OooO0oo, this.f54061OooO, continuation);
                oooO0O0.f54062OooO0Oo = pressGestureScope;
                oooO0O0.f54064OooO0o0 = packedValue;
                return oooO0O0.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = this.f54062OooO0Oo;
                long j = this.f54064OooO0o0;
                MutableState<Boolean> mutableState = this.f54066OooO0oo;
                if (mutableState.getValue().booleanValue()) {
                    o00O000 value = this.f54063OooO0o.getValue();
                    if (value != null) {
                        value.OooO00o(DpKt.m3796DpOffsetYgX7TsA(pressGestureScope.mo322toDpu2uoSUM(Offset.m1447getXimpl(j)), pressGestureScope.mo322toDpu2uoSUM(Offset.m1448getYimpl(j))));
                    }
                    MutableState<Job> mutableState2 = this.f54061OooO;
                    Job value2 = mutableState2.getValue();
                    if (value2 != null) {
                        Job.DefaultImpls.cancel$default(value2, (CancellationException) null, 1, (Object) null);
                    }
                    mutableState2.setValue(BuildersKt__Builders_commonKt.launch$default(this.f54065OooO0oO, null, null, new OooO00o(mutableState, null), 3, null));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54069OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54070OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f54071OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ MutableState<p363o0OOo00O.OooO> f54072OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState2, MutableState<p363o0OOo00O.OooO> mutableState3) {
                super(1);
                this.f54069OooO0Oo = mutableState;
                this.f54071OooO0o0 = momentDetailModel;
                this.f54070OooO0o = mutableState2;
                this.f54072OooO0oO = mutableState3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                offset.getPackedValue();
                if (!this.f54070OooO0o.getValue().booleanValue()) {
                    MutableState<p363o0OOo00O.OooO> mutableState = this.f54072OooO0oO;
                    p363o0OOo00O.OooO oooOOooO0o0 = oO0O0O0o.OooO0o0(mutableState);
                    boolean z = oooOOooO0o0 != null && oooOOooO0o0.isPlaying();
                    MutableState<Boolean> mutableState2 = this.f54069OooO0Oo;
                    if (z) {
                        mutableState2.setValue(Boolean.TRUE);
                        p363o0OOo00O.OooO value = mutableState.getValue();
                        if (value != null) {
                            value.pause();
                        }
                        o0oo0000.OooO00o.OooO0OO("106115", MapsKt.mapOf(TuplesKt.to("state", 0)));
                    } else {
                        mutableState2.setValue(Boolean.FALSE);
                        p363o0OOo00O.OooO value2 = mutableState.getValue();
                        if (value2 != null) {
                            value2.OooO00o(this.f54071OooO0o0.getVideoUrl());
                        }
                        o0oo0000.OooO00o.OooO0OO("106115", MapsKt.mapOf(TuplesKt.to("state", 1)));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner, State<? extends o00O000> state, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Job> mutableState3, MutableState<Boolean> mutableState4, MutableState<p363o0OOo00O.OooO> mutableState5, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f54042OooO0o = momentDetailModel;
            this.f54044OooO0oO = momentVideoVM;
            this.f54045OooO0oo = lifecycleOwner;
            this.f54040OooO = state;
            this.f54046OooOO0 = coroutineScope;
            this.f54047OooOO0O = mutableState;
            this.f54048OooOO0o = mutableState2;
            this.f54050OooOOO0 = mutableState3;
            this.f54049OooOOO = mutableState4;
            this.f54051OooOOOO = mutableState5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f54042OooO0o, this.f54044OooO0oO, this.f54045OooO0oo, this.f54040OooO, this.f54046OooOO0, this.f54047OooOO0O, this.f54048OooOO0o, this.f54050OooOOO0, this.f54049OooOOO, this.f54051OooOOOO, continuation);
            oooOOOO.f54043OooO0o0 = obj;
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
            int i = this.f54041OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f54043OooO0o0;
                OooO00o oooO00o = new OooO00o(this.f54042OooO0o, this.f54044OooO0oO, this.f54045OooO0oo, this.f54040OooO, pointerInputScope, this.f54046OooOO0, this.f54047OooOO0O, this.f54048OooOO0o, this.f54050OooOOO0);
                OooO0O0 oooO0O0 = new OooO0O0(this.f54040OooO, this.f54046OooOO0, this.f54047OooOO0O, this.f54050OooOOO0, null);
                OooO0OO oooO0OO = new OooO0OO(this.f54049OooOOO, this.f54042OooO0o, this.f54047OooOO0O, this.f54051OooOOOO);
                this.f54041OooO0Oo = 1;
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
        public final /* synthetic */ Function0<Unit> f54073OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54074OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(Function0<Unit> function0, MutableFloatState mutableFloatState) {
            super(3);
            this.f54073OooO0Oo = function0;
            this.f54074OooO0o0 = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f, Long l, Long l2) {
            float fFloatValue = f.floatValue();
            long jLongValue = l.longValue();
            l2.longValue();
            this.f54074OooO0o0.setFloatValue(fFloatValue);
            Function0<Unit> function0 = this.f54073OooO0Oo;
            if (function0 != null && jLongValue > 5000) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<p363o0OOo00O.OooO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54075OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<p363o0OOo00O.OooO> f54076OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MomentDetailModel momentDetailModel, MutableState<p363o0OOo00O.OooO> mutableState) {
            super(1);
            this.f54075OooO0Oo = momentDetailModel;
            this.f54076OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p363o0OOo00O.OooO oooO) {
            p363o0OOo00O.OooO it = oooO;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f54076OooO0o0.setValue(it);
            p363o0OOo00O.OooOo oooOoOooO0o0 = it.OooO0o0();
            MomentDetailModel momentDetailModel = this.f54075OooO0Oo;
            String videoUrl = momentDetailModel.getVideoUrl();
            oooOoOooO0o0.getClass();
            Intrinsics.checkNotNullParameter(videoUrl, "<set-?>");
            oooOoOooO0o0.f43056OooO00o = videoUrl;
            it.OooO0oo(false);
            it.OooO(momentDetailModel.getVideoUrl());
            o0000O00.OooO0O0("VideoPlayerContent onCreatePlayControl " + it + ",play uri:" + momentDetailModel.getVideoUrl() + ",");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<p363o0OOo00O.OooOOO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<p363o0OOo00O.OooOOO> f54077OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState<p363o0OOo00O.OooOOO> mutableState) {
            super(0);
            this.f54077OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final p363o0OOo00O.OooOOO invoke() {
            return this.f54077OooO0Oo.getValue();
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<p363o0OOo00O.OooOOO, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<p363o0OOo00O.OooOOO> f54078OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54079OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function3<String, Boolean, Float, Unit> f54080OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54081OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54082OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<p363o0OOo00O.OooOOO> f54083OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54084OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<p363o0OOo00O.OooO> f54085OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(MomentDetailModel momentDetailModel, Function0<Unit> function0, Function3<? super String, ? super Boolean, ? super Float, Unit> function3, MutableState<Boolean> mutableState, Ref.ObjectRef<p363o0OOo00O.OooOOO> objectRef, MutableState<p363o0OOo00O.OooOOO> mutableState2, MutableFloatState mutableFloatState, MutableState<p363o0OOo00O.OooO> mutableState3) {
            super(1);
            this.f54079OooO0Oo = momentDetailModel;
            this.f54081OooO0o0 = function0;
            this.f54080OooO0o = function3;
            this.f54082OooO0oO = mutableState;
            this.f54083OooO0oo = objectRef;
            this.f54078OooO = mutableState2;
            this.f54084OooOO0 = mutableFloatState;
            this.f54085OooOO0O = mutableState3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [T, java.lang.Object, o0OOo00O.OooOOO] */
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
        public final Unit invoke(p363o0OOo00O.OooOOO oooOOO) {
            p363o0OOo00O.OooOOO state = oooOOO;
            Intrinsics.checkNotNullParameter(state, "state");
            MomentDetailModel momentDetailModel = this.f54079OooO0Oo;
            o0000O00.OooO0O0("VideoPlayerContent state " + state + ",play uri:" + momentDetailModel.getVideoUrl() + ",");
            MutableState<p363o0OOo00O.OooOOO> mutableState = this.f54078OooO;
            mutableState.setValue(state);
            o0OOo00O.OooOOO.OooOO0 oooOO1 = o0OOo00O.OooOOO.OooOO0.f43050OooO00o;
            Function0<Unit> function0 = this.f54081OooO0o0;
            if (function0 != null && Intrinsics.areEqual((p363o0OOo00O.OooOOO) mutableState.getValue(), oooOO1)) {
                function0.invoke();
            }
            MutableFloatState mutableFloatState = this.f54084OooOO0;
            Function3<String, Boolean, Float, Unit> function3 = this.f54080OooO0o;
            if (function3 != null) {
                function3.invoke(momentDetailModel.getVideoUrl(), Boolean.valueOf(Intrinsics.areEqual((p363o0OOo00O.OooOOO) mutableState.getValue(), oooOO1)), Float.valueOf(mutableFloatState.getFloatValue()));
            }
            p363o0OOo00O.OooO oooOOooO0o0 = oO0O0O0o.OooO0o0(this.f54085OooOO0O);
            momentDetailModel.setVideoDuration((int) (oooOOooO0o0 != null ? oooOOooO0o0.getDuration() : 0L));
            mutableState.setValue(state);
            p363o0OOo00O.OooOOO oooOOO2 = (p363o0OOo00O.OooOOO) mutableState.getValue();
            boolean zAreEqual = Intrinsics.areEqual(oooOOO2, o0OOo00O.OooOOO.OooO.f43046OooO00o);
            o0OOo00O.OooOOO.OooO0o oooO0o = o0OOo00O.OooOOO.OooO0o.f43049OooO00o;
            Ref.ObjectRef<p363o0OOo00O.OooOOO> objectRef = this.f54083OooO0oo;
            MutableState<Boolean> mutableState2 = this.f54082OooO0oO;
            if (zAreEqual) {
                mutableState2.setValue(Boolean.FALSE);
                if (!Intrinsics.areEqual(objectRef.element, oooO0o)) {
                    o0oo0000.OooO00o.OooO0Oo("106050", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                }
            } else if (Intrinsics.areEqual(oooOOO2, oooO0o)) {
                mutableState2.setValue(Boolean.TRUE);
                o0oo0000.OooO00o.OooO0OO("106051", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Long.valueOf(RangesKt.coerceAtLeast((long) (mutableFloatState.getFloatValue() * momentDetailModel.getVideoDuration()), 0L))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            } else if (Intrinsics.areEqual(oooOOO2, oooOO1)) {
                mutableState2.setValue(Boolean.FALSE);
                o0oo0000.OooO00o.OooO0Oo("106050", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                o0oo0000.OooO00o.OooO0OO("106052", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            } else {
                mutableState2.setValue(Boolean.FALSE);
            }
            objectRef.element = state;
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54086OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MutableFloatState mutableFloatState) {
            super(0);
            this.f54086OooO0Oo = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f54086OooO0Oo.getFloatValue());
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PagerState f54087OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54088OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(PagerState pagerState, int i) {
            super(0);
            this.f54087OooO0Oo = pagerState;
            this.f54088OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f54087OooO0Oo.getSettledPage() == this.f54088OooO0o0);
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f54089OooO0Oo = new o00Oo0();

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
        public final /* synthetic */ MutableFloatState f54090OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MutableFloatState mutableFloatState) {
            super(0);
            this.f54090OooO0Oo = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f54090OooO0Oo.getFloatValue());
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
                ComposerKt.traceEventStart(1391461282, i2, -1, "com.yalla.yalla.ui.screen.moment.media.LoadingView (VideoPlayerContent.kt:456)");
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            o00OO00O.OooO00o("svga/anim_video_loading.svga", true, 0, null, null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(80)), composerStartRestartGroup, 196662, 28);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            String strStringResource = StringResources_androidKt.stringResource(o000000.video_feed_loading, composerStartRestartGroup, 0);
            int i3 = o0OOo000.f48347o00OOooO;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource, (Modifier) null, o0OOo000.f48146OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
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
                ComposerKt.traceEventStart(1893061883, i2, -1, "com.yalla.yalla.ui.screen.moment.media.ProgressContent (VideoPlayerContent.kt:370)");
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

    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(BoxScope boxScope, String str, float f, String str2, MutableState<Boolean> mutableState, State<Boolean> state, Function0<? extends p363o0OOo00O.OooOOO> function0, Function0<Float> function1, Composer composer, int i) {
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
                ComposerKt.traceEventStart(-1820004321, i2, -1, "com.yalla.yalla.ui.screen.moment.media.StateContent (VideoPlayerContent.kt:395)");
            }
            composerStartRestartGroup.startReplaceableGroup(-163432127);
            if (mutableState.getValue().booleanValue()) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                OooO0o oooO0o = OooO0o.f54006OooO0Oo;
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
            }
            composerStartRestartGroup.endReplaceableGroup();
            long jAbs = Math.abs(str.hashCode());
            p363o0OOo00O.OooOOO oooOOOInvoke = function0.invoke();
            if (Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooOO0.f43050OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(-163431574);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooO.f43046OooO00o)) {
                    composerStartRestartGroup.startReplaceableGroup(-163431535);
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState.setValue(Boolean.FALSE);
                    Map<Long, Float> map2 = VideoPreloadWorker.f32303OooO;
                    Map<Long, Float> map3 = VideoPreloadWorker.f32303OooO;
                    if (map3.get(Long.valueOf(jAbs)) == null) {
                        map3.put(Long.valueOf(jAbs), function1.invoke());
                    }
                } else {
                    if (Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooO0o.f43049OooO00o) ? true : Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooOOO0.f43052OooO00o)) {
                        composerStartRestartGroup.startReplaceableGroup(-163431323);
                        if (state.getValue().booleanValue()) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_feed_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(80)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        jAbs = jAbs;
                        if (oooOOOInvoke instanceof o0OOo00O.OooOOO.OooO0OO) {
                            composerStartRestartGroup.startReplaceableGroup(-163430956);
                            OooO00o(boxScope, composerStartRestartGroup, i2 & 14);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-163430901);
                            Map<Long, Float> map4 = VideoPreloadWorker.f32303OooO;
                            Float f3 = VideoPreloadWorker.f32303OooO.get(Long.valueOf(jAbs));
                            if (f3 != null && f3.floatValue() < function1.invoke().floatValue()) {
                                OooO00o(boxScope, composerStartRestartGroup, i2 & 14);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                }
                Map<Long, Float> map5 = VideoPreloadWorker.f32303OooO;
                map = VideoPreloadWorker.f32303OooO;
                f2 = map.get(Long.valueOf(jAbs));
                if (f2 != null && f2.floatValue() < function1.invoke().floatValue()) {
                    map.put(Long.valueOf(jAbs), function1.invoke());
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            jAbs = jAbs;
            Map<Long, Float> map6 = VideoPreloadWorker.f32303OooO;
            map = VideoPreloadWorker.f32303OooO;
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
    public static final void OooO0Oo(@NotNull BoxScope boxScope, @NotNull MomentDetailModel model, int i, @NotNull PagerState pagerState, @Nullable o00O000 o00o001, @Nullable Function0<Unit> function0, @Nullable Function3<? super String, ? super Boolean, ? super Float, Unit> function3, @NotNull MutableState<Boolean> loadingStart, @NotNull MutableState<Boolean> videoPauseState, @NotNull MutableState<Integer> refreshIndex, @Nullable Composer composer, int i2, int i3) {
        int i4;
        char c;
        MutableFloatState mutableFloatState;
        int i5;
        p363o0OOo00O.OooO oooO;
        p363o0OOo00O.OooO oooO2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(loadingStart, "loadingStart");
        Intrinsics.checkNotNullParameter(videoPauseState, "videoPauseState");
        Intrinsics.checkNotNullParameter(refreshIndex, "refreshIndex");
        Composer composerStartRestartGroup = composer.startRestartGroup(-170228596);
        o00O000 o00o002 = (i3 & 8) != 0 ? null : o00o001;
        Function0<Unit> function1 = (i3 & 16) != 0 ? null : function0;
        Function3<? super String, ? super Boolean, ? super Float, Unit> function4 = (i3 & 32) != 0 ? null : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-170228596, i2, -1, "com.yalla.yalla.ui.screen.moment.media.VideoPlayerContent (VideoPlayerContent.kt:90)");
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
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0OOo00O.OooOOO.OooO00o.f43047OooO00o, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(o00o002, composerStartRestartGroup, 8);
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
        MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue6;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState5 = (MutableState) objRememberedValue7;
        Function0<Unit> function2 = function1;
        o00O000 o00o003 = o00o002;
        MutableState mutableState6 = (MutableState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) o00Oo0.f54089OooO0Oo, composerStartRestartGroup, 3080, 6);
        State stateCollectAsState = SnapshotStateKt.collectAsState(o000O00O.f13423OooO0OO, null, composerStartRestartGroup, 8, 1);
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) model.getVideoSize(), new String[]{"*"}, false, 0, 6, (Object) null);
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
        if (((Boolean) ((State) objRememberedValue9).getValue()).booleanValue()) {
            if (((Boolean) stateCollectAsState.getValue()).booleanValue() && !((Boolean) mutableState5.getValue()).booleanValue() && (oooO2 = (p363o0OOo00O.OooO) mutableState.getValue()) != null) {
                oooO2.OooO00o(model.getVideoUrl());
                Unit unit = Unit.INSTANCE;
            }
            mutableFloatState = mutableFloatState2;
            i5 = 0;
        } else {
            p363o0OOo00O.OooO oooO3 = (p363o0OOo00O.OooO) mutableState.getValue();
            if (oooO3 != null && oooO3.isPlaying()) {
                o0000O00.OooO0O0("VideoPlayerContent settledPage stop play index is " + i + ", uri is " + model.getVideoUrl());
                Pair[] pairArr = new Pair[5];
                pairArr[0] = o0oOO.OooO00o(model, "discovery_id");
                pairArr[1] = o0O00o0.OooO00o(model, "video_id");
                pairArr[c] = TuplesKt.to("video_time", Integer.valueOf(model.getVideoDuration()));
                pairArr[3] = TuplesKt.to("duration_time", Long.valueOf((long) (mutableFloatState2.getFloatValue() * model.getVideoDuration())));
                pairArr[4] = TuplesKt.to("rec_sessionid", model.getSessionId());
                o0oo0000.OooO00o.OooO0OO("106052", MapsKt.mapOf(pairArr));
            }
            mutableFloatState = mutableFloatState2;
            mutableFloatState.setFloatValue(0.0f);
            mutableState5.setValue(Boolean.FALSE);
            mutableState6.setValue(Boolean.TRUE);
            p363o0OOo00O.OooO oooO4 = (p363o0OOo00O.OooO) mutableState.getValue();
            if (oooO4 != null) {
                oooO4.OooO0o(false);
                Unit unit2 = Unit.INSTANCE;
            }
            i5 = 0;
        }
        if (!((Boolean) stateCollectAsState.getValue()).booleanValue() && (oooO = (p363o0OOo00O.OooO) mutableState.getValue()) != null) {
            oooO.pause();
            Unit unit3 = Unit.INSTANCE;
        }
        int i6 = i5;
        MutableFloatState mutableFloatState3 = mutableFloatState;
        EffectsKt.LaunchedEffect(refreshIndex.getValue(), new OooOOO0(refreshIndex, i, model, mutableState6, floatRef, mutableState, null), composerStartRestartGroup, 64);
        com.code.android.util.o00Oo0.OooO0O0(new OooOOO(pagerState, i, mutableState5, model, mutableState, mutableFloatState3), composerStartRestartGroup, i6);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        T t = objRememberedValue10;
        if (objRememberedValue10 == companion.getEmpty()) {
            t = 0;
            composerStartRestartGroup.updateRememberedValue(null);
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
            objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState7 = (MutableState) objRememberedValue11;
        int i7 = floatRef.element > 0.5625f ? i6 : 4;
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(BackgroundKt.m171backgroundbw27NRU$default(boxScope.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), o0OOo000.f48153OooOo0, null, 2, null), model.getVideoUrl(), new OooOOOO(model, momentVideoVM, lifecycleOwner, stateRememberUpdatedState, coroutineScopeOooO00o, mutableState3, mutableState7, mutableState4, mutableState5, mutableState, null));
        OooOo00 oooOo00 = new OooOo00(model, mutableState);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(mutableFloatState3) | composerStartRestartGroup.changed(function2);
        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new OooOo(function2, mutableFloatState3);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
        }
        composerStartRestartGroup.endReplaceableGroup();
        p363o0OOo00O.OooOO0O.OooO00o(modifierPointerInput, i7, oooOo00, 0L, (Function3) objRememberedValue12, new Oooo000(model, function2, function4, videoPauseState, objectRef, mutableState2, mutableFloatState3, mutableState), composerStartRestartGroup, 0, 8);
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
        boolean zChanged4 = composerStartRestartGroup.changed(mutableFloatState3);
        Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = new o000oOoO(mutableFloatState3);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i8 = i2 & 14;
        OooO0OO(boxScope, videoUrl, f, coverPic, mutableState6, mutableState5, function5, (Function0) objRememberedValue14, composerStartRestartGroup, i8 | 196608);
        if (!loadingStart.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged5 = composerStartRestartGroup.changed(mutableFloatState3);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new o0OoOo0(mutableFloatState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0O0(boxScope, (Function0) objRememberedValue15, composerStartRestartGroup, i8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, model, i, pagerState, o00o003, function2, function4, loadingStart, videoPauseState, refreshIndex, i2, i3));
    }

    public static final p363o0OOo00O.OooO OooO0o0(MutableState mutableState) {
        return (p363o0OOo00O.OooO) mutableState.getValue();
    }
}
