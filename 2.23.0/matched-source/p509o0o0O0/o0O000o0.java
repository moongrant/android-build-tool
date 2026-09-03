package p509o0o0O0;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentImageModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import com.yalla.yalla.util.cache.VideoPreloadWorker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00OO;
import p161o00OoOo0.o000OOo;
import p417o0OoO0.o0000O0O;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentVideoComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 14 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,838:1\n76#2:839\n76#2:840\n76#2:841\n76#2:842\n76#2:896\n76#2:897\n76#2:898\n76#2:899\n76#2:900\n76#2:901\n76#2:1002\n76#2:1086\n25#3:843\n25#3:861\n25#3:868\n25#3:875\n25#3:882\n25#3:889\n36#3:902\n456#3,8:951\n464#3,3:965\n36#3:970\n36#3:977\n467#3,3:984\n36#3:991\n456#3,8:1024\n464#3,3:1038\n467#3,3:1043\n456#3,8:1061\n464#3,3:1075\n467#3,3:1081\n1097#4,6:844\n1097#4,6:862\n1097#4,6:869\n1097#4,6:876\n1097#4,6:883\n1097#4,6:890\n1097#4,6:903\n1097#4,6:971\n1097#4,6:978\n1097#4,6:992\n81#5,11:850\n81#5,11:909\n81#5,11:920\n154#6:931\n154#6:932\n154#6:933\n154#6:969\n154#6:989\n154#6:990\n154#6:998\n154#6:999\n154#6:1000\n154#6:1001\n154#6:1004\n154#6:1005\n154#6:1006\n154#6:1042\n154#6:1079\n154#6:1080\n154#6:1087\n154#6:1088\n154#6:1089\n154#6:1090\n154#6:1091\n154#6:1092\n154#6:1093\n154#6:1094\n154#6:1095\n154#6:1096\n66#7,6:934\n72#7:968\n76#7:988\n66#7,6:1007\n72#7:1041\n76#7:1047\n78#8,11:940\n91#8:987\n78#8,11:1013\n91#8:1046\n78#8,11:1050\n91#8:1084\n4144#9,6:959\n4144#9,6:1032\n4144#9,6:1069\n1#10:1003\n76#11,2:1048\n78#11:1078\n82#11:1085\n81#12:1097\n107#12,2:1098\n81#12:1100\n107#12,2:1101\n81#12:1106\n107#12,2:1107\n81#12:1109\n81#12:1113\n75#13:1103\n108#13,2:1104\n75#14:1110\n108#14,2:1111\n*S KotlinDebug\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt\n*L\n105#1:839\n129#1:840\n130#1:841\n131#1:842\n160#1:896\n161#1:897\n162#1:898\n163#1:899\n164#1:900\n166#1:901\n661#1:1002\n739#1:1086\n141#1:843\n145#1:861\n148#1:868\n151#1:875\n154#1:882\n158#1:889\n167#1:902\n372#1:951,8\n372#1:965,3\n522#1:970\n525#1:977\n372#1:984,3\n573#1:991\n667#1:1024,8\n667#1:1038,3\n667#1:1043,3\n699#1:1061,8\n699#1:1075,3\n699#1:1081,3\n141#1:844,6\n145#1:862,6\n148#1:869,6\n151#1:876,6\n154#1:883,6\n158#1:890,6\n167#1:903,6\n522#1:971,6\n525#1:978,6\n573#1:992,6\n144#1:850,11\n171#1:909,11\n218#1:920,11\n369#1:931\n370#1:932\n375#1:933\n447#1:969\n542#1:989\n567#1:990\n592#1:998\n613#1:999\n639#1:1000\n657#1:1001\n661#1:1004\n668#1:1005\n670#1:1006\n691#1:1042\n708#1:1079\n710#1:1080\n750#1:1087\n752#1:1088\n790#1:1089\n796#1:1090\n797#1:1091\n803#1:1092\n810#1:1093\n817#1:1094\n818#1:1095\n822#1:1096\n372#1:934,6\n372#1:968\n372#1:988\n667#1:1007,6\n667#1:1041\n667#1:1047\n372#1:940,11\n372#1:987\n667#1:1013,11\n667#1:1046\n699#1:1050,11\n699#1:1084\n372#1:959,6\n667#1:1032,6\n699#1:1069,6\n699#1:1048,2\n699#1:1078\n699#1:1085\n141#1:1097\n141#1:1098,2\n148#1:1100\n148#1:1101,2\n158#1:1106\n158#1:1107,2\n159#1:1109\n365#1:1113\n151#1:1103\n151#1:1104,2\n167#1:1110\n167#1:1111,2\n*E\n"})
public final class o0O000o0 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50995OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f50995OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000o0.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f50995OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Boolean f50996OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOo000.OooO0OO f50997OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Boolean bool, o0OOo000.OooO0OO oooO0OO) {
            super(0);
            this.f50996OooO0Oo = bool;
            this.f50997OooO0o0 = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = this.f50996OooO0Oo;
            o0OO000.OooO0O0("106109", MapsKt.mapOf(TuplesKt.to("state", Integer.valueOf(Intrinsics.areEqual(bool2, bool) ? 1 : 0))));
            if (bool2 != null) {
                boolean zBooleanValue = bool2.booleanValue();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                boolean z = !zBooleanValue;
                ((MutableLiveData) o000000O.f46706Oooo000.getValue()).postValue(Boolean.valueOf(z));
                o0OOo000.OooO0OO oooO0OO = this.f50997OooO0o0;
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(z);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50998OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f50999OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OOo000.OooO0OO f51000OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Boolean f51001OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51002OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Integer> f51003OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, Boolean bool, o0OOo000.OooO0OO oooO0OO, MomentAdapterTag momentAdapterTag, Function0<Integer> function0, int i) {
            super(2);
            this.f50999OooO0Oo = boxScope;
            this.f51001OooO0o0 = bool;
            this.f51000OooO0o = oooO0OO;
            this.f51002OooO0oO = momentAdapterTag;
            this.f51003OooO0oo = function0;
            this.f50998OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000o0.OooO00o(this.f50999OooO0Oo, this.f51001OooO0o0, this.f51000OooO0o, this.f51002OooO0oO, this.f51003OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50998OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f51004OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51005OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, int i) {
            super(2);
            this.f51004OooO0Oo = boxScope;
            this.f51005OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51005OooO0o0 | 1);
            o0O000o0.OooO0O0(this.f51004OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51006OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f51006OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000o0.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f51006OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentVideoComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$StateArea$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,838:1\n154#2:839\n*S KotlinDebug\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$StateArea$1\n*L\n546#1:839\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51007OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentDetailModel momentDetailModel) {
            super(3);
            this.f51007OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            int i;
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1898088593, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.StateArea.<anonymous> (MomentVideoComp.kt:543)");
                }
                AndroidView_androidKt.AndroidView(o0O00.f50966OooO0Oo, BoxWithConstraints.matchParentSize(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8)))), new o0OoO00O(this.f51007OooO0Oo, BoxWithConstraints), composer2, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f51008OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f51009OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51010OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51011OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<o0OOo000.OooOO0O> f51012OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f51013OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(BoxScope boxScope, MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Function0<? extends o0OOo000.OooOO0O> function0, Function0<Float> function1, int i) {
            super(2);
            this.f51009OooO0Oo = boxScope;
            this.f51011OooO0o0 = mutableState;
            this.f51010OooO0o = momentDetailModel;
            this.f51012OooO0oO = function0;
            this.f51013OooO0oo = function1;
            this.f51008OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000o0.OooO0Oo(this.f51009OooO0Oo, this.f51011OooO0o0, this.f51010OooO0o, this.f51012OooO0oO, this.f51013OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51008OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<o0OOo000.OooO0OO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51014OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f51015OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f51016OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f51017OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentDetailModel momentDetailModel, MutableState<o0OOo000.OooO0OO> mutableState, State<Boolean> state, MutableIntState mutableIntState) {
            super(1);
            this.f51014OooO0Oo = momentDetailModel;
            this.f51016OooO0o0 = mutableState;
            this.f51015OooO0o = state;
            this.f51017OooO0oO = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OOo000.OooO0OO oooO0OO) {
            o0OOo000.OooO0OO it = oooO0OO;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<o0OOo000.OooO0OO> mutableState = this.f51016OooO0o0;
            mutableState.setValue(it);
            o0OOo000.OooOOO oooOOOOooO0o0 = it.OooO0o0();
            MomentDetailModel momentDetailModel = this.f51014OooO0Oo;
            String videoUrl = momentDetailModel.getVideoUrl();
            oooOOOOooO0o0.getClass();
            Intrinsics.checkNotNullParameter(videoUrl, "<set-?>");
            oooOOOOooO0o0.f43858OooO00o = videoUrl;
            it.OooO(momentDetailModel.getVideoUrl());
            it.OooO0oo(Intrinsics.areEqual(o0O000o0.OooO(this.f51015OooO0o), Boolean.TRUE));
            o0OOo000.OooO0OO value = mutableState.getValue();
            String videoUrl2 = momentDetailModel.getVideoUrl();
            int intValue = this.f51017OooO0oO.getIntValue();
            MutableState mutableState2 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            p592o0oo00O.OooOOO0.OooO0O0("VideoPlayer ExoPlayerView control " + value + " ,data.videoUrl ==>" + videoUrl2 + "，leftTime is " + intValue + ",RoomStateManager.roomState is " + p427o0OoOO00.o0OOO0o.OooO0oO());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentImageModel f51018OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51019OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentImageModel momentImageModel, int i) {
            super(2);
            this.f51018OooO0Oo = momentImageModel;
            this.f51019OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51019OooO0o0 | 1);
            o0O000o0.OooO0o0(this.f51018OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function3<Float, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51020OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f51021OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f51022OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MomentDetailModel momentDetailModel, MutableIntState mutableIntState, MutableFloatState mutableFloatState) {
            super(3);
            this.f51020OooO0Oo = momentDetailModel;
            this.f51022OooO0o0 = mutableIntState;
            this.f51021OooO0o = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f, Long l, Long l2) {
            float fFloatValue = f.floatValue();
            long jLongValue = l.longValue();
            l2.longValue();
            this.f51022OooO0o0.setIntValue(RangesKt.coerceAtLeast(this.f51020OooO0Oo.getVideoDuration() - ((int) jLongValue), 0));
            this.f51021OooO0o.setFloatValue(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<o0OOo000.OooOO0O> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooOO0O> f51023OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MutableState<o0OOo000.OooOO0O> mutableState) {
            super(0);
            this.f51023OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOo000.OooOO0O invoke() {
            return this.f51023OooO0Oo.getValue();
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<o0OOo000.OooOO0O, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51024OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51025OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<o0OOo000.OooOO0O> f51026OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooOO0O> f51027OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f51028OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState<Boolean> mutableState, Ref.ObjectRef<o0OOo000.OooOO0O> objectRef, MomentDetailModel momentDetailModel, MutableState<o0OOo000.OooOO0O> mutableState2, MutableIntState mutableIntState) {
            super(1);
            this.f51024OooO0Oo = mutableState;
            this.f51026OooO0o0 = objectRef;
            this.f51025OooO0o = momentDetailModel;
            this.f51027OooO0oO = mutableState2;
            this.f51028OooO0oo = mutableIntState;
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
            o0OOo000.OooOO0O.OooO oooO = o0OOo000.OooOO0O.OooO.f43851OooO00o;
            if (Intrinsics.areEqual(state, oooO)) {
                this.f51024OooO0Oo.setValue(Boolean.FALSE);
            }
            MutableState<o0OOo000.OooOO0O> mutableState = this.f51027OooO0oO;
            mutableState.setValue(state);
            o0OOo000.OooOO0O oooOO0O2 = (o0OOo000.OooOO0O) mutableState.getValue();
            boolean zAreEqual = Intrinsics.areEqual(oooOO0O2, oooO);
            o0OOo000.OooOO0O.OooO0o oooO0o = o0OOo000.OooOO0O.OooO0o.f43854OooO00o;
            Ref.ObjectRef<o0OOo000.OooOO0O> objectRef = this.f51026OooO0o0;
            MutableIntState mutableIntState = this.f51028OooO0oo;
            MomentDetailModel momentDetailModel = this.f51025OooO0o;
            if (zAreEqual) {
                if (!Intrinsics.areEqual(objectRef.element, oooO0o)) {
                    o0OO000.OooO0OO("106050", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                }
            } else if (Intrinsics.areEqual(oooOO0O2, oooO0o)) {
                o0OO000.OooO0O0("106051", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState.getIntValue(), momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            } else if (Intrinsics.areEqual(oooOO0O2, o0OOo000.OooOO0O.OooOO0.f43855OooO00o)) {
                o0OO000.OooO0OO("106050", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                o0OO000.OooO0O0("106052", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState.getIntValue(), momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            }
            objectRef.element = state;
            p592o0oo00O.OooOOO0.OooO0O0("MomentVideoComp videoState is " + ((o0OOo000.OooOO0O) mutableState.getValue()) + " data.videoUrl is " + momentDetailModel.getVideoUrl() + ",   time," + (momentDetailModel.getVideoDuration() - mutableIntState.getIntValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f51029OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableIntState mutableIntState) {
            super(0);
            this.f51029OooO0Oo = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f51029OooO0Oo.getIntValue());
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f51030OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableFloatState mutableFloatState) {
            super(0);
            this.f51030OooO0Oo = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f51030OooO0Oo.getFloatValue());
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51031OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(int i) {
            super(2);
            this.f51031OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000o0.OooO0o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f51031OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51032OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f51033OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51034OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f51035OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, MutableState<o0OOo000.OooO0OO> mutableState2, MutableIntState mutableIntState) {
            super(0);
            this.f51032OooO0Oo = momentDetailModel;
            this.f51034OooO0o0 = mutableState;
            this.f51033OooO0o = mutableState2;
            this.f51035OooO0oO = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<o0OOo000.OooO0OO> mutableState = this.f51033OooO0o;
            o0OOo000.OooO0OO OooO0oo2 = o0O000o0.OooO0oo(mutableState);
            boolean z = OooO0oo2 != null && OooO0oo2.isPlaying();
            MutableIntState mutableIntState = this.f51035OooO0oO;
            MomentDetailModel momentDetailModel = this.f51032OooO0Oo;
            if (z) {
                o0OO000.OooO0O0("106052", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState.getIntValue(), momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            }
            mutableIntState.setIntValue(momentDetailModel.getVideoDuration());
            this.f51034OooO0o0.setValue(Boolean.TRUE);
            o0OOo000.OooO0OO OooO0oo3 = o0O000o0.OooO0oo(mutableState);
            if (OooO0oo3 != null) {
                OooO0oo3.OooO0o(false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$3", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MomentUserListVM> f51036OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51037OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p515o0o0O0O0.o0Oo0oo f51038OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51039OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f51040OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Integer f51041OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f51042OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f51043OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(int i, MomentDetailModel momentDetailModel, p515o0o0O0O0.o0Oo0oo o0oo0oo2, boolean z, Integer num, MutableState<MomentUserListVM> mutableState, MutableState<o0OOo000.OooO0OO> mutableState2, State<Boolean> state, Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
            this.f51037OooO0Oo = i;
            this.f51039OooO0o0 = momentDetailModel;
            this.f51038OooO0o = o0oo0oo2;
            this.f51040OooO0oO = z;
            this.f51041OooO0oo = num;
            this.f51036OooO = mutableState;
            this.f51042OooOO0 = mutableState2;
            this.f51043OooOO0O = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00Oo0(this.f51037OooO0Oo, this.f51039OooO0o0, this.f51038OooO0o, this.f51040OooO0oO, this.f51041OooO0oo, this.f51036OooO, this.f51042OooOO0, this.f51043OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0076  */
        /* JADX WARN: Code duplicated, block: B:24:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOo000.OooO0OO OooO0oo2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState<MomentUserListVM> mutableState = this.f51036OooO;
            MomentUserListVM momentUserListVMOooO0oO = o0O000o0.OooO0oO(mutableState);
            Intrinsics.checkNotNull(momentUserListVMOooO0oO);
            Long topPostDetailId = momentUserListVMOooO0oO.getTopPostDetailId();
            int i = this.f51037OooO0Oo;
            State<Boolean> state = this.f51043OooOO0O;
            MomentDetailModel momentDetailModel = this.f51039OooO0o0;
            MutableState<o0OOo000.OooO0OO> mutableState2 = this.f51042OooOO0;
            if (topPostDetailId != null) {
                MutableState mutableState3 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                if (p427o0OoOO00.o0OOO0o.OooO0oO() == RoomState.Close && i == 0) {
                    long id = momentDetailModel.getId();
                    MomentUserListVM value = mutableState.getValue();
                    Intrinsics.checkNotNull(value);
                    Long topPostDetailId2 = value.getTopPostDetailId();
                    if (topPostDetailId2 != null && id == topPostDetailId2.longValue()) {
                        o0OOo000.OooO0OO OooO0oo3 = o0O000o0.OooO0oo(mutableState2);
                        if (OooO0oo3 != null) {
                            OooO0oo3.OooO0oo(Intrinsics.areEqual(o0O000o0.OooO(state), Boxing.boxBoolean(true)));
                        }
                        o0OOo000.OooO0OO value2 = mutableState2.getValue();
                        if (value2 != null) {
                            value2.OooO00o(momentDetailModel.getVideoUrl());
                        }
                        p515o0o0O0O0.o0Oo0oo o0oo0oo2 = this.f51038OooO0o;
                        if (o0oo0oo2 != null) {
                            o0oo0oo2.f51832OooO0Oo.setIntValue(0);
                        }
                    } else {
                        OooO0oo2 = o0O000o0.OooO0oo(mutableState2);
                        if (OooO0oo2 != null) {
                            OooO0oo2.pause();
                        }
                    }
                } else {
                    OooO0oo2 = o0O000o0.OooO0oo(mutableState2);
                    if (OooO0oo2 != null) {
                        OooO0oo2.pause();
                    }
                }
                MomentUserListVM value3 = mutableState.getValue();
                Intrinsics.checkNotNull(value3);
                p592o0oo00O.OooOOO0.OooO0O0("MomentVideoComp topPostDetailId  " + value3.getTopPostDetailId() + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
            } else {
                o0OOo000.OooO0OO OooO0oo4 = o0O000o0.OooO0oo(mutableState2);
                Boolean boolOooO = o0O000o0.OooO(state);
                String videoUrl = momentDetailModel.getVideoUrl();
                Integer num = this.f51041OooO0oo;
                o0O000o0.OooOO0O(OooO0oo4, boolOooO, videoUrl, this.f51040OooO0oO, num != null && num.intValue() == i);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$4", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f51044OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51045OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f51046OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51047OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51048OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MomentUserListVM> f51049OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f51050OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MomentDetailModel momentDetailModel, boolean z, Integer num, int i, MutableState<MomentUserListVM> mutableState, MutableState<o0OOo000.OooO0OO> mutableState2, State<Boolean> state, Continuation<? super o00Ooo> continuation) {
            super(2, continuation);
            this.f51045OooO0Oo = momentDetailModel;
            this.f51047OooO0o0 = z;
            this.f51046OooO0o = num;
            this.f51048OooO0oO = i;
            this.f51049OooO0oo = mutableState;
            this.f51044OooO = mutableState2;
            this.f51050OooOO0 = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00Ooo(this.f51045OooO0Oo, this.f51047OooO0o0, this.f51046OooO0o, this.f51048OooO0oO, this.f51049OooO0oo, this.f51044OooO, this.f51050OooOO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MomentUserListVM momentUserListVMOooO0oO = o0O000o0.OooO0oO(this.f51049OooO0oo);
            Intrinsics.checkNotNull(momentUserListVMOooO0oO);
            boolean zAreEqual = Intrinsics.areEqual(momentUserListVMOooO0oO.getRefreshTrigger(), Boxing.boxBoolean(true));
            MutableState<o0OOo000.OooO0OO> mutableState = this.f51044OooO;
            if (zAreEqual) {
                o0OOo000.OooO0OO OooO0oo2 = o0O000o0.OooO0oo(mutableState);
                Boolean boolOooO = o0O000o0.OooO(this.f51050OooOO0);
                String videoUrl = this.f51045OooO0Oo.getVideoUrl();
                Integer num = this.f51046OooO0o;
                o0O000o0.OooOO0O(OooO0oo2, boolOooO, videoUrl, this.f51047OooO0o0, num != null && num.intValue() == this.f51048OooO0oO);
            } else {
                o0OOo000.OooO0OO OooO0oo3 = o0O000o0.OooO0oo(mutableState);
                if (OooO0oo3 != null) {
                    OooO0oo3.pause();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$6", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51051OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f51052OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51053OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51054OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Integer f51055OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51056OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f51057OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f51058OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(MomentFollowingVM momentFollowingVM, MomentAdapterTag momentAdapterTag, MutableState<Boolean> mutableState, Integer num, int i, MomentDetailModel momentDetailModel, MutableState<o0OOo000.OooO0OO> mutableState2, State<Boolean> state, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f51052OooO0Oo = momentFollowingVM;
            this.f51054OooO0o0 = momentAdapterTag;
            this.f51053OooO0o = mutableState;
            this.f51055OooO0oO = num;
            this.f51056OooO0oo = i;
            this.f51051OooO = momentDetailModel;
            this.f51057OooOO0 = mutableState2;
            this.f51058OooOO0O = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00oO0o(this.f51052OooO0Oo, this.f51054OooO0o0, this.f51053OooO0o, this.f51055OooO0oO, this.f51056OooO0oo, this.f51051OooO, this.f51057OooOO0, this.f51058OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOo000.OooO0OO OooO0oo2;
            Integer num;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Boolean value = this.f51052OooO0Oo.getShowFollowDialog().getValue();
            if (value != null) {
                boolean zBooleanValue = value.booleanValue();
                MomentAdapterTag momentAdapterTag = this.f51054OooO0o0;
                MutableState<o0OOo000.OooO0OO> mutableState = this.f51057OooOO0;
                if (!zBooleanValue) {
                    if (momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment && (num = this.f51055OooO0oO) != null) {
                        int iIntValue = num.intValue();
                        int i = this.f51056OooO0oo;
                        if (iIntValue == i) {
                            MutableState mutableState2 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                            if (p427o0OoOO00.o0OOO0o.OooO0oO() == RoomState.Close) {
                                o0OOo000.OooO0OO OooO0oo3 = o0O000o0.OooO0oo(mutableState);
                                if (OooO0oo3 != null) {
                                    OooO0oo3.OooO0oo(Intrinsics.areEqual(o0O000o0.OooO(this.f51058OooOO0O), Boxing.boxBoolean(true)));
                                }
                                o0OOo000.OooO0OO value2 = mutableState.getValue();
                                MomentDetailModel momentDetailModel = this.f51051OooO;
                                if (value2 != null) {
                                    value2.OooO00o(momentDetailModel.getVideoUrl());
                                }
                                p592o0oo00O.OooOOO0.OooO0O0("MomentVideoComp dismissDialog " + num + " currentPosition ===> " + i + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
                            }
                        }
                    }
                    if (momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Top && (OooO0oo2 = o0O000o0.OooO0oo(mutableState)) != null) {
                        OooO0oo2.OooO0o(true);
                    }
                } else if (momentAdapterTag != MomentAdapterTag.MomentListFollowingFragment_Top) {
                    this.f51053OooO0o.setValue(Boxing.boxBoolean(true));
                    o0OOo000.OooO0OO OooO0oo4 = o0O000o0.OooO0oo(mutableState);
                    if (OooO0oo4 != null) {
                        OooO0oo4.pause();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class o0OO00O {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            try {
                iArr[MomentAdapterTag.UserPostListActivity.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment_Recommend.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p515o0o0O0O0.o0Oo0oo f51059OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51060OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51061OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(int i, MomentDetailModel momentDetailModel, p515o0o0O0O0.o0Oo0oo o0oo0oo2) {
            super(1);
            this.f51059OooO0Oo = o0oo0oo2;
            this.f51061OooO0o0 = i;
            this.f51060OooO0o = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            p515o0o0O0O0.o0Oo0oo o0oo0oo2 = this.f51059OooO0Oo;
            if (o0oo0oo2 != null) {
                o0oo0oo2.OooO0OO(this.f51061OooO0o0, it, this.f51060OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentVideoComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$VideoForNetwork$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,838:1\n766#2:839\n857#2,2:840\n1#3:842\n*S KotlinDebug\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$VideoForNetwork$9\n*L\n413#1:839\n413#1:840,2\n*E\n"})
    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MomentUserListVM> f51062OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51063OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51064OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51065OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51066OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f51067OooO0oo;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MomentAdapterTag.values().length];
                try {
                    iArr[MomentAdapterTag.MomentEditRecord.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MomentAdapterTag.UserPostListActivity.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MomentAdapterTag.MomentMessageList.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MomentAdapterTag.MomentSonMessageList.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(MomentAdapterTag momentAdapterTag, boolean z, boolean z2, MomentDetailModel momentDetailModel, State<Boolean> state, MutableState<MomentUserListVM> mutableState) {
            super(0);
            this.f51063OooO0Oo = momentAdapterTag;
            this.f51065OooO0o0 = z;
            this.f51064OooO0o = z2;
            this.f51066OooO0oO = momentDetailModel;
            this.f51067OooO0oo = state;
            this.f51062OooO = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0056  */
        /* JADX WARN: Code duplicated, block: B:23:0x0060  */
        /* JADX WARN: Code duplicated, block: B:25:0x0065  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:58:0x0138 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:59:0x013a  */
        /* JADX WARN: Code duplicated, block: B:62:0x015a  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentAdapterTag momentAdapterTag;
            int i;
            MomentDetailModel momentDetailModel;
            boolean z;
            boolean z2;
            String strOooO00o;
            SnapshotStateList<MomentDetailModel> listData;
            boolean z3 = true;
            if (this.f51067OooO0oo.getValue().booleanValue()) {
                MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                if (p427o0OoOO00.o0OOO0o.OooO0oO() != RoomState.Close) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.video_watch_tip);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z3 = false;
                    }
                    if (!z3) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    momentAdapterTag = this.f51063OooO0Oo;
                    if (momentAdapterTag == null) {
                        i = -1;
                    } else {
                        i = OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
                    }
                    if (i != 1) {
                        momentDetailModel = this.f51066OooO0oO;
                        if (i != 2) {
                            z = this.f51065OooO0o0;
                            z2 = this.f51064OooO0o;
                            if (z && !z2) {
                                VideoFeedScreen videoFeedScreen = VideoFeedScreen.INSTANCE;
                                long id = momentDetailModel.getId();
                                long userId = momentDetailModel.getUserId();
                                MutableState<MomentUserListVM> mutableState2 = this.f51062OooO;
                                MomentUserListVM momentUserListVMOooO0oO = o0O000o0.OooO0oO(mutableState2);
                                if (momentUserListVMOooO0oO == null || (listData = momentUserListVMOooO0oO.getListData()) == null) {
                                    strOooO00o = null;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    for (MomentDetailModel momentDetailModel2 : listData) {
                                        if (momentDetailModel2.getType() == MomentType.Video.getValue()) {
                                            arrayList.add(momentDetailModel2);
                                        }
                                    }
                                    strOooO00o = p140o00OOooo.OooOO0.OooO00o(new ArrayList(arrayList));
                                }
                                String str = strOooO00o;
                                MomentUserListVM value = mutableState2.getValue();
                                VideoFeedScreen.navigate$default(videoFeedScreen, id, userId, 0, str, value != null ? value.getDateSort() : 0L, null, this.f51063OooO0Oo, 32, null);
                            } else if (z2 || !MomentStateKt.isUnderReview(momentDetailModel)) {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f51063OooO0Oo, 62, null);
                            } else {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 2, null, 0L, this.f51066OooO0oO, this.f51063OooO0Oo, 26, null);
                            }
                        } else if (i != 3 || i == 4) {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 4, null, 0L, this.f51066OooO0oO, this.f51063OooO0Oo, 26, null);
                        } else if (MomentStateKt.isUnderReview(momentDetailModel)) {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 2, null, 0L, this.f51066OooO0oO, this.f51063OooO0Oo, 26, null);
                        } else {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f51063OooO0Oo, 62, null);
                        }
                    }
                }
            } else {
                momentAdapterTag = this.f51063OooO0Oo;
                if (momentAdapterTag == null) {
                    i = -1;
                } else {
                    i = OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
                }
                if (i != 1) {
                    momentDetailModel = this.f51066OooO0oO;
                    if (i != 2) {
                        z = this.f51065OooO0o0;
                        z2 = this.f51064OooO0o;
                        if (z) {
                            if (z2) {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f51063OooO0Oo, 62, null);
                            } else {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f51063OooO0Oo, 62, null);
                            }
                        } else if (z2) {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f51063OooO0Oo, 62, null);
                        } else {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f51063OooO0Oo, 62, null);
                        }
                    } else if (i != 3) {
                        VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 4, null, 0L, this.f51066OooO0oO, this.f51063OooO0Oo, 26, null);
                    } else {
                        VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 4, null, 0L, this.f51066OooO0oO, this.f51063OooO0Oo, 26, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51068OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(int i) {
            super(2);
            this.f51068OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000o0.OooO0o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f51068OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$7", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f51069OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51070OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51071OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f51072OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f51073OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51074OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f51075OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f51076OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(int i, Integer num, MomentDetailModel momentDetailModel, boolean z, MutableState<Boolean> mutableState, MutableState<o0OOo000.OooO0OO> mutableState2, State<Boolean> state, MutableIntState mutableIntState, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f51070OooO0Oo = i;
            this.f51072OooO0o0 = num;
            this.f51071OooO0o = momentDetailModel;
            this.f51073OooO0oO = z;
            this.f51074OooO0oo = mutableState;
            this.f51069OooO = mutableState2;
            this.f51075OooOO0 = state;
            this.f51076OooOO0O = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(this.f51070OooO0Oo, this.f51072OooO0o0, this.f51071OooO0o, this.f51073OooO0oO, this.f51074OooO0oo, this.f51069OooO, this.f51075OooOO0, this.f51076OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer num;
            o0OOo000.OooOOO oooOOOOooO0o0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState<o0OOo000.OooO0OO> mutableState = this.f51069OooO;
            if (o0O000o0.OooO0oo(mutableState) != null && (num = this.f51072OooO0o0) != null) {
                if (this.f51070OooO0Oo == num.intValue()) {
                    MutableState mutableState2 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                    if (p427o0OoOO00.o0OOO0o.OooO0oO() == RoomState.Close) {
                        MomentDetailModel momentDetailModel = this.f51071OooO0o;
                        String videoUrl = momentDetailModel.getVideoUrl();
                        o0OOo000.OooO0OO value = mutableState.getValue();
                        if (!Intrinsics.areEqual(videoUrl, (value == null || (oooOOOOooO0o0 = value.OooO0o0()) == null) ? null : oooOOOOooO0o0.f43858OooO00o) && this.f51073OooO0oO) {
                            this.f51074OooO0oo.setValue(Boxing.boxBoolean(true));
                            o0OOo000.OooO0OO value2 = mutableState.getValue();
                            if (value2 != null) {
                                value2.OooO0oo(Intrinsics.areEqual(o0O000o0.OooO(this.f51075OooOO0), Boxing.boxBoolean(true)));
                            }
                            o0OOo000.OooO0OO value3 = mutableState.getValue();
                            if (value3 != null) {
                                value3.OooO00o(momentDetailModel.getVideoUrl());
                            }
                            this.f51076OooOO0O.setIntValue(momentDetailModel.getVideoDuration());
                            p592o0oo00O.OooOOO0.OooO0O0("MomentVideoComp  data.videoUrl changed " + mutableState.getValue() + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$5", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f51077OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f51078OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51079OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51080OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Integer f51081OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51082OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f51083OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(MomentFollowingVM momentFollowingVM, MomentDetailModel momentDetailModel, boolean z, Integer num, int i, MutableState<o0OOo000.OooO0OO> mutableState, State<Boolean> state, Continuation<? super oo000o> continuation) {
            super(2, continuation);
            this.f51078OooO0Oo = momentFollowingVM;
            this.f51080OooO0o0 = momentDetailModel;
            this.f51079OooO0o = z;
            this.f51081OooO0oO = num;
            this.f51082OooO0oo = i;
            this.f51077OooO = mutableState;
            this.f51083OooOO0 = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new oo000o(this.f51078OooO0Oo, this.f51080OooO0o0, this.f51079OooO0o, this.f51081OooO0oO, this.f51082OooO0oo, this.f51077OooO, this.f51083OooOO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean zAreEqual = Intrinsics.areEqual(this.f51078OooO0Oo.getRefreshTrigger(), Boxing.boxBoolean(true));
            MutableState<o0OOo000.OooO0OO> mutableState = this.f51077OooO;
            if (zAreEqual) {
                o0OOo000.OooO0OO OooO0oo2 = o0O000o0.OooO0oo(mutableState);
                Boolean boolOooO = o0O000o0.OooO(this.f51083OooOO0);
                String videoUrl = this.f51080OooO0o0.getVideoUrl();
                Integer num = this.f51081OooO0oO;
                o0O000o0.OooOO0O(OooO0oo2, boolOooO, videoUrl, this.f51079OooO0o, num != null && num.intValue() == this.f51082OooO0oo);
            } else {
                o0OOo000.OooO0OO OooO0oo3 = o0O000o0.OooO0oo(mutableState);
                if (OooO0oo3 != null) {
                    OooO0oo3.pause();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final Boolean OooO(State state) {
        return (Boolean) state.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, Boolean bool, o0OOo000.OooO0OO oooO0OO, MomentAdapterTag momentAdapterTag, Function0<Integer> function0, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626903165);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1626903165, i, -1, "com.yalla.yalla.ui.composable.moment.BottomArea (MomentVideoComp.kt:630)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(58)), 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        BoxKt.Box(BackgroundKt.background$default(boxScope.align(modifierFillMaxWidth$default, companion2.getBottomCenter()), Brush.Companion.m1633verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(Color.m1669copywmQWz5c$default(o0oO0O0o.f46964OooOo0, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m1660boximpl(o0oO0O0o.f46967OooOo0o)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-2100754541);
        if (momentAdapterTag != MomentAdapterTag.MomentEditRecord) {
            Lazy lazy = o000OOo.f38508OooO00o;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(o000OOo.OooO0OO(function0.invoke().intValue()), PaddingKt.m480paddingqDBjuR0$default(boxScope.align(companion, companion2.getBottomStart()), Dp.m3765constructorimpl(8), 0.0f, 0.0f, Dp.m3765constructorimpl(12), 6, null), o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0oO0O0o.f46970OooOoOO, 0L, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(2)), 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composer2, 3072, 0, 65520);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        float f = 8;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(boxScope.align(SizeKt.m523size3ABfNKs(BackgroundKt.m168backgroundbw27NRU(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 3, null), o0oO0O0o.f46969OooOoO0, RoundedCornerShapeKt.getCircleShape()), Dp.m3765constructorimpl(24)), companion2.getBottomEnd()), false, false, 0L, false, null, null, null, new OooO00o(bool, oooO0OO), 255);
        Composer composer3 = composer2;
        composer3.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composer3, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composer3.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor);
        } else {
            composer3.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(Intrinsics.areEqual(bool, Boolean.TRUE) ? oO00OOO.ic_video_muted : oO00OOO.ic_video_sound, composer3, 0), "", o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), Dp.m3765constructorimpl(16)), composer3, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
        if (androidx.compose.material.OooOO0.OooO0O0(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, bool, oooO0OO, momentAdapterTag, function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(568640814);
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
                ComposerKt.traceEventStart(568640814, i, -1, "com.yalla.yalla.ui.composable.moment.MomentLoadingView (MomentVideoComp.kt:697)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion, companion2.getCenter()), 0.0f, 1, null);
            int i3 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierFillMaxSize$default, o0oO0O0o.f46969OooOoO0, null, 2, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
            p154o00OoO00.OooOo00.OooO00o("svga/anim_video_loading.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(38)), composerStartRestartGroup, 196662, 28);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(1), null, composerStartRestartGroup, 6, 2);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.video_feed_loading, composerStartRestartGroup, 0), (Modifier) null, o0oO0O0o.f46957OooOOO0, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(boxScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnrememberedMutableState"})
    public static final void OooO0OO(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1459769636);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1459769636, i, -1, "com.yalla.yalla.ui.composable.moment.MomentVideoComp (MomentVideoComp.kt:103)");
            }
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
            if (momentDetailModel.getType() != MomentType.Video.getValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
                return;
            }
            if (o0000O0O.OooO0o(momentDetailModel.getVideoUrl())) {
                composerStartRestartGroup.startReplaceableGroup(-270846946);
                OooO0o(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (!momentDetailModel.getVideoInfoList().isEmpty()) {
                composerStartRestartGroup.startReplaceableGroup(-270846855);
                MomentImageModel momentImageModel = momentDetailModel.getVideoInfoList().get(0);
                Intrinsics.checkNotNullExpressionValue(momentImageModel, "data.getVideoInfoList()[0]");
                OooO0o0(momentImageModel, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-270846772);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(BoxScope boxScope, MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Function0<? extends o0OOo000.OooOO0O> function0, Function0<Float> function1, Composer composer, int i) {
        long j;
        Map<Long, Float> map;
        Float f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-47688544);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-47688544, i, -1, "com.yalla.yalla.ui.composable.moment.StateArea (MomentVideoComp.kt:532)");
        }
        composerStartRestartGroup.startReplaceableGroup(1498564803);
        if (mutableState.getValue().booleanValue()) {
            BoxWithConstraintsKt.BoxWithConstraints(boxScope.matchParentSize(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8)))), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1898088593, true, new OooOO0(momentDetailModel)), composerStartRestartGroup, 3072, 6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
        if (p427o0OoOO00.o0OOO0o.OooO0oO() != RoomState.Close) {
            composerStartRestartGroup.startReplaceableGroup(1498565611);
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(48)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1498565863);
            long jAbs = Math.abs(momentDetailModel.getVideoUrl().hashCode());
            Long lValueOf = Long.valueOf(jAbs);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(lValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Map<Long, Float> map2 = VideoPreloadWorker.f32839OooOOOO;
                objRememberedValue = Boolean.valueOf(map2.get(Long.valueOf(jAbs)) == null || Intrinsics.areEqual(map2.get(Long.valueOf(jAbs)), 0.0f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            o0OOo000.OooOO0O oooOO0OInvoke = function0.invoke();
            if (Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooOO0.f43855OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(1498566141);
                composerStartRestartGroup.endReplaceableGroup();
                mutableState.setValue(Boolean.FALSE);
            } else {
                if (Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooO.f43851OooO00o)) {
                    composerStartRestartGroup.startReplaceableGroup(1498566227);
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState.setValue(Boolean.FALSE);
                    VideoPreloadWorker.f32839OooOOOO.put(Long.valueOf(jAbs), function1.invoke());
                } else {
                    if (Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooO0o.f43854OooO00o) ? true : Intrinsics.areEqual(oooOO0OInvoke, o0OOo000.OooOO0O.OooOOO0.f43857OooO00o)) {
                        composerStartRestartGroup.startReplaceableGroup(1498566390);
                        VideoPreloadWorker.f32839OooOOOO.put(Long.valueOf(jAbs), function1.invoke());
                        j = jAbs;
                        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(46)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        j = jAbs;
                        if (oooOO0OInvoke instanceof o0OOo000.OooOO0O.OooO0OO) {
                            composerStartRestartGroup.startReplaceableGroup(1498566799);
                            OooO0O0(boxScope, composerStartRestartGroup, i & 14);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(1498566872);
                            if (zBooleanValue) {
                                composerStartRestartGroup.startReplaceableGroup(1498566912);
                                OooO0O0(boxScope, composerStartRestartGroup, i & 14);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(1498566977);
                                Float f2 = VideoPreloadWorker.f32839OooOOOO.get(Long.valueOf(j));
                                if (f2 != null) {
                                    if (f2.floatValue() < function1.invoke().floatValue()) {
                                        composerStartRestartGroup.startReplaceableGroup(-188057390);
                                        OooO0O0(boxScope, composerStartRestartGroup, i & 14);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-188057309);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(46)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                }
                map = VideoPreloadWorker.f32839OooOOOO;
                f = map.get(Long.valueOf(j));
                if (f != null && f.floatValue() < function1.invoke().floatValue()) {
                    map.put(Long.valueOf(j), function1.invoke());
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            j = jAbs;
            map = VideoPreloadWorker.f32839OooOOOO;
            f = map.get(Long.valueOf(j));
            if (f != null) {
                map.put(Long.valueOf(j), function1.invoke());
            }
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, mutableState, momentDetailModel, function0, function1, i));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0473  */
    /* JADX WARN: Code duplicated, block: B:107:0x0488  */
    /* JADX WARN: Code duplicated, block: B:109:0x048b  */
    /* JADX WARN: Code duplicated, block: B:112:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:115:0x0508  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(Composer composer, int i) {
        int i2;
        MutableIntState mutableIntState;
        State state;
        MutableState mutableState;
        boolean z;
        LocalViewModelStoreOwner localViewModelStoreOwner;
        int i3;
        int i4;
        MomentAdapterTag momentAdapterTag;
        List list;
        MutableState mutableState2;
        MomentAdapterTag momentAdapterTag2;
        boolean z2;
        o0OOo000.OooO0OO oooO0OO;
        boolean z3;
        MutableIntState mutableIntState2;
        o0OOo000.OooO0OO oooO0OO2;
        o0OOo000.OooO0OO oooO0OO3;
        Composer composerStartRestartGroup = composer.startRestartGroup(96111142);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(96111142, i, -1, "com.yalla.yalla.ui.composable.moment.VideoForNetwork (MomentVideoComp.kt:127)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue();
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
            MomentAdapterTag momentAdapterTag3 = (MomentAdapterTag) composerStartRestartGroup.consume(oo0O.f51348OooO0O0);
            List listSplit$default = StringsKt__StringsKt.split$default(momentDetailModel.getVideoSize(), new String[]{"*"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() < 2) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner2 = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner2.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentFollowingVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentFollowingVM momentFollowingVM = (MomentFollowingVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                i2 = 2;
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i2 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0OOo000.OooOO0O.OooO00o.f43852OooO00o, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue4;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            T t = objRememberedValue5;
            if (objRememberedValue5 == companion.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(null);
                t = 0;
            }
            composerStartRestartGroup.endReplaceableGroup();
            objectRef.element = t;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState6 = (MutableState) objRememberedValue6;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46706Oooo000.getValue(), composerStartRestartGroup, 8);
            ProvidableCompositionLocal<p515o0o0O0O0.o0Oo0oo> providableCompositionLocal = oo0O.f51353OooO0oO;
            p515o0o0O0O0.o0Oo0oo o0oo0oo2 = (p515o0o0O0O0.o0Oo0oo) composerStartRestartGroup.consume(providableCompositionLocal);
            p515o0o0O0O0.o0Oo0oo o0oo0oo3 = (p515o0o0O0O0.o0Oo0oo) composerStartRestartGroup.consume(providableCompositionLocal);
            Integer numValueOf = o0oo0oo3 != null ? Integer.valueOf(o0oo0oo3.f51832OooO0Oo.getIntValue()) : null;
            int iIntValue = ((Number) composerStartRestartGroup.consume(oo0O.f51354OooO0oo)).intValue();
            boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(oo0O.f51347OooO00o)).booleanValue();
            boolean zIsAtLeast = ((LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED);
            p515o0o0O0O0.o0Oo0oo o0oo0oo4 = (p515o0o0O0O0.o0Oo0oo) composerStartRestartGroup.consume(providableCompositionLocal);
            Integer numValueOf2 = Integer.valueOf(momentDetailModel.getVideoDuration());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(numValueOf2);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotIntStateKt.mutableIntStateOf(momentDetailModel.getVideoDuration());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue7;
            composerStartRestartGroup.startReplaceableGroup(1212425628);
            if (zBooleanValue2) {
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current2 = localViewModelStoreOwner2.getCurrent(composerStartRestartGroup, 6);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                i3 = 2;
                mutableIntState = mutableIntState3;
                state = stateObserveAsState;
                mutableState = mutableState4;
                localViewModelStoreOwner = localViewModelStoreOwner2;
                ViewModel viewModel2 = ViewModelKt.viewModel(MomentDetailActivityVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                z = zIsAtLeast;
                OooOO0O((o0OOo000.OooO0OO) mutableState6.getValue(), (Boolean) state.getValue(), momentDetailModel.getVideoUrl(), z, ((MomentDetailActivityVM) viewModel2).isExpand());
            } else {
                mutableIntState = mutableIntState3;
                state = stateObserveAsState;
                mutableState = mutableState4;
                z = zIsAtLeast;
                localViewModelStoreOwner = localViewModelStoreOwner2;
                i3 = 2;
            }
            int i5 = i3;
            composerStartRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState4 = mutableIntState;
            com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_PAUSE, new o00O0O(momentDetailModel, mutableState, mutableState6, mutableIntState4), composerStartRestartGroup, 6);
            int i6 = momentAdapterTag3 == null ? -1 : o0OO00O.$EnumSwitchMapping$0[momentAdapterTag3.ordinal()];
            char c = 3;
            if (i6 != 1) {
                if (i6 == i5 || i6 == 3) {
                    composerStartRestartGroup.startReplaceableGroup(1212429246);
                    i4 = 64;
                    EffectsKt.LaunchedEffect(momentFollowingVM.getRefreshTrigger(), new oo000o(momentFollowingVM, momentDetailModel, z, numValueOf, iIntValue, mutableState6, state, null), composerStartRestartGroup, 64);
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1212429767);
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit2 = Unit.INSTANCE;
                    i4 = 64;
                }
                list = listSplit$default;
                mutableState2 = mutableState3;
                momentAdapterTag = momentAdapterTag3;
            } else {
                zBooleanValue = zBooleanValue;
                i4 = 64;
                c = 3;
                mutableIntState4 = mutableIntState4;
                z = z;
                mutableState6 = mutableState6;
                numValueOf = numValueOf;
                composerStartRestartGroup.startReplaceableGroup(1212427506);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current3 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel3 = ViewModelKt.viewModel(MomentUserListVM.class, current3, null, null, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                mutableState3.setValue((MomentUserListVM) viewModel3);
                MomentUserListVM momentUserListVM = (MomentUserListVM) mutableState3.getValue();
                Intrinsics.checkNotNull(momentUserListVM);
                EffectsKt.LaunchedEffect(momentUserListVM.getTopPostDetailId(), new o00Oo0(r53, momentDetailModel, o0oo0oo4, z, numValueOf, mutableState3, mutableState6, state, null), composerStartRestartGroup, 64);
                MomentUserListVM momentUserListVM2 = (MomentUserListVM) mutableState3.getValue();
                Intrinsics.checkNotNull(momentUserListVM2);
                momentAdapterTag = momentAdapterTag3;
                list = listSplit$default;
                mutableState2 = mutableState3;
                EffectsKt.LaunchedEffect(momentUserListVM2.getRefreshTrigger(), new o00Ooo(momentDetailModel, z, numValueOf, r53, mutableState3, mutableState6, state, null), composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            EffectsKt.LaunchedEffect(momentFollowingVM.getShowFollowDialog().getValue(), new o00oO0o(momentFollowingVM, momentAdapterTag, mutableState, numValueOf, r53, momentDetailModel, mutableState6, state, null), composerStartRestartGroup, i4);
            StringBuilder sb = new StringBuilder("MomentVideoComp momentPlayPosition is ");
            Integer num = numValueOf;
            sb.append(num);
            sb.append(", currentPosition is ");
            sb.append(r53);
            p592o0oo00O.OooOOO0.OooO0O0(sb.toString());
            if (num != null && num.intValue() == r53) {
                MutableState mutableState7 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                if (p427o0OoOO00.o0OOO0o.OooO0oO() == RoomState.Close) {
                    if (zBooleanValue2) {
                        momentAdapterTag2 = momentAdapterTag;
                        z2 = z;
                    } else {
                        if (Intrinsics.areEqual(momentFollowingVM.getShowFollowDialog().getValue(), Boolean.TRUE)) {
                            momentAdapterTag2 = momentAdapterTag;
                            if (momentAdapterTag2 == MomentAdapterTag.MomentListFollowingFragment_Top) {
                                z2 = z;
                                OooOO0O((o0OOo000.OooO0OO) mutableState6.getValue(), (Boolean) state.getValue(), momentDetailModel.getVideoUrl(), z2, true);
                            } else {
                                z2 = z;
                            }
                        } else {
                            momentAdapterTag2 = momentAdapterTag;
                            z2 = z;
                            OooOO0O((o0OOo000.OooO0OO) mutableState6.getValue(), (Boolean) state.getValue(), momentDetailModel.getVideoUrl(), z2, true);
                        }
                        p592o0oo00O.OooOOO0.OooO0O0("MomentVideoComp momentPlayPosition playing momentAdapterTag " + momentAdapterTag2 + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
                    }
                    mutableIntState2 = mutableIntState4;
                } else {
                    momentAdapterTag2 = momentAdapterTag;
                    z2 = z;
                    oooO0OO = (o0OOo000.OooO0OO) mutableState6.getValue();
                    if (oooO0OO == null && oooO0OO.isPlaying()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        Pair[] pairArr = new Pair[5];
                        pairArr[0] = o00OO.OooO0O0(momentDetailModel, "discovery_id");
                        pairArr[1] = o0O00o0.OooO00o(momentDetailModel, "video_id");
                        pairArr[2] = TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration()));
                        pairArr[c] = TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState4.getIntValue(), momentDetailModel.getVideoDuration())));
                        pairArr[4] = TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId());
                        o0OO000.OooO0O0("106052", MapsKt.mapOf(pairArr));
                    }
                    mutableIntState2 = mutableIntState4;
                    mutableIntState2.setIntValue(momentDetailModel.getVideoDuration());
                    mutableState.setValue(Boolean.TRUE);
                    oooO0OO2 = (o0OOo000.OooO0OO) mutableState6.getValue();
                    if (oooO0OO2 != null) {
                        oooO0OO2.OooO0oo(true);
                    }
                    oooO0OO3 = (o0OOo000.OooO0OO) mutableState6.getValue();
                    if (oooO0OO3 != null) {
                        oooO0OO3.OooO0o(false);
                    }
                }
            } else {
                momentAdapterTag2 = momentAdapterTag;
                z2 = z;
                oooO0OO = (o0OOo000.OooO0OO) mutableState6.getValue();
                if (oooO0OO == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (z3) {
                    Pair[] pairArr2 = new Pair[5];
                    pairArr2[0] = o00OO.OooO0O0(momentDetailModel, "discovery_id");
                    pairArr2[1] = o0O00o0.OooO00o(momentDetailModel, "video_id");
                    pairArr2[2] = TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration()));
                    pairArr2[c] = TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState4.getIntValue(), momentDetailModel.getVideoDuration())));
                    pairArr2[4] = TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId());
                    o0OO000.OooO0O0("106052", MapsKt.mapOf(pairArr2));
                }
                mutableIntState2 = mutableIntState4;
                mutableIntState2.setIntValue(momentDetailModel.getVideoDuration());
                mutableState.setValue(Boolean.TRUE);
                oooO0OO2 = (o0OOo000.OooO0OO) mutableState6.getValue();
                if (oooO0OO2 != null) {
                    oooO0OO2.OooO0oo(true);
                }
                oooO0OO3 = (o0OOo000.OooO0OO) mutableState6.getValue();
                if (oooO0OO3 != null) {
                    oooO0OO3.OooO0o(false);
                }
            }
            EffectsKt.LaunchedEffect(momentDetailModel.getVideoUrl(), new o0ooOOo(r53, num, momentDetailModel, z2, mutableState, mutableState6, state, mutableIntState2, null), composerStartRestartGroup, i4);
            State stateCollectAsState = SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47371OooO00o, null, composerStartRestartGroup, 8, 1);
            composerStartRestartGroup.startReplaceableGroup(941485441);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(941485441, 8, -1, "com.yalla.yalla.ui.composable.moment.checkVideoSize (MomentVideoComp.kt:778)");
            }
            List list2 = list;
            Modifier modifierOooOO0 = OooOO0(Float.parseFloat((String) list2.get(0)), Float.parseFloat((String) list2.get(1)), composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM480paddingqDBjuR0$default = zBooleanValue ? PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(10), 0.0f, Dp.m3765constructorimpl(30), 0.0f, 10, null) : PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(61), 0.0f, Dp.m3765constructorimpl(33), 0.0f, 10, null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 8;
            Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(f, companion2.then(modifierM480paddingqDBjuR0$default));
            long j = o0oO0O0o.f47078o000o0O;
            Modifier modifierOooO0O1 = o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(BackgroundKt.m169backgroundbw27NRU$default(modifierOooO0O0, j, null, 2, null).then(modifierOooOO0), new o0OOO0o(r53, momentDetailModel, o0oo0oo2)), false, false, 0L, false, null, null, null, new o0Oo0oo(momentAdapterTag2, zBooleanValue, zBooleanValue2, momentDetailModel, stateCollectAsState, mutableState2), 255);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(companion2, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f))), j, null, 2, null);
            if (zBooleanValue) {
                j = o0oO0O0o.f47153o00OOOo0;
            }
            State state2 = state;
            MutableState mutableState8 = mutableState6;
            MutableIntState mutableIntState5 = mutableIntState2;
            MomentAdapterTag momentAdapterTag4 = momentAdapterTag2;
            o0OOo000.OooO.OooO00o(modifierM169backgroundbw27NRU$default, 4, new OooOOO(momentDetailModel, mutableState8, state2, mutableIntState2), j, new OooOOOO(momentDetailModel, mutableIntState2, mutableFloatState), new OooOo00(mutableState, objectRef, momentDetailModel, mutableState5, mutableIntState2), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState5);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new OooOo(mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue8;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(mutableFloatState);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Oooo000(mutableFloatState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0Oo(boxScopeInstance, mutableState, momentDetailModel, function0, (Function0) objRememberedValue9, composerStartRestartGroup, 566);
            Boolean bool = (Boolean) state2.getValue();
            o0OOo000.OooO0OO oooO0OO4 = (o0OOo000.OooO0OO) mutableState8.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged4 = composerStartRestartGroup.changed(mutableIntState5);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new Oooo0(mutableIntState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO00o(boxScopeInstance, bool, oooO0OO4, momentAdapterTag4, (Function0) objRememberedValue10, composerStartRestartGroup, 518);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o000oOoO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(MomentImageModel momentImageModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1172415895);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1172415895, i, -1, "com.yalla.yalla.ui.composable.moment.VideoForLocal (MomentVideoComp.kt:737)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m169backgroundbw27NRU$default(com.facebook.OooOo.OooO0O0(8, PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(61), 0.0f, Dp.m3765constructorimpl(15), 0.0f, 10, null).then(OooOO0(momentImageModel.getWidth(), momentImageModel.getHeight(), composerStartRestartGroup))), o0oO0O0o.f46964OooOo0, null, 2, null), null, false, p509o0o0O0.Oooo0.f50390OooO00o, composerStartRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(momentImageModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MomentUserListVM OooO0oO(MutableState mutableState) {
        return (MomentUserListVM) mutableState.getValue();
    }

    public static final o0OOo000.OooO0OO OooO0oo(MutableState mutableState) {
        return (o0OOo000.OooO0OO) mutableState.getValue();
    }

    @Composable
    public static final Modifier OooOO0(float f, float f2, Composer composer) {
        Modifier modifierM509height3ABfNKs;
        composer.startReplaceableGroup(-826099325);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-826099325, 0, -1, "com.yalla.yalla.ui.composable.moment.checkVideoSize (MomentVideoComp.kt:783)");
        }
        float f3 = f / f2;
        if (f3 == 1.0f) {
            modifierM509height3ABfNKs = SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(184));
        } else if (f3 <= 0.6666667f) {
            modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(185)), Dp.m3765constructorimpl(278));
        } else if (f3 > 0.6666667f && f3 < 1.0f) {
            modifierM509height3ABfNKs = AspectRatioKt.aspectRatio$default(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(185)), f3, false, 2, null);
        } else if (f3 <= 1.0f || f3 >= 1.5f) {
            modifierM509height3ABfNKs = f3 >= 1.5f ? SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(278)), Dp.m3765constructorimpl(185)) : SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(184));
        } else {
            modifierM509height3ABfNKs = AspectRatioKt.aspectRatio$default(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(278)), f3, false, 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierM509height3ABfNKs;
    }

    public static final void OooOO0O(o0OOo000.OooO0OO oooO0OO, Boolean bool, String str, boolean z, boolean z2) {
        if (z2 && z) {
            MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            if (p427o0OoOO00.o0OOO0o.OooO0oO() == RoomState.Close) {
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(Intrinsics.areEqual(bool, Boolean.TRUE));
                }
                if (oooO0OO != null) {
                    oooO0OO.OooO00o(str);
                    return;
                }
                return;
            }
        }
        if (oooO0OO != null) {
            oooO0OO.pause();
        }
    }
}
