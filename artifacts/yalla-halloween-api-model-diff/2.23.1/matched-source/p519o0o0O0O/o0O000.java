package p519o0o0O0O;

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
import androidx.media3.common.util.UnstableApi;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentImageModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.message.o00Oo00;
import com.yalla.yalla.ui.activity.message.o0oOO;
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
import p200o00o0OoO.oo0O;
import p208o00o0oOO.o0O00O0o;
import p425o0OoO0OO.oOO00O;
import p444o0OoOo0O.o000;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentVideoComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 14 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,782:1\n76#2:783\n76#2:784\n76#2:785\n76#2:786\n76#2:840\n76#2:841\n76#2:842\n76#2:843\n76#2:844\n76#2:845\n76#2:939\n25#3:787\n25#3:805\n25#3:812\n25#3:819\n25#3:826\n25#3:833\n36#3:846\n456#3,8:895\n464#3,3:909\n36#3:914\n36#3:921\n467#3,3:928\n456#3,8:961\n464#3,3:975\n467#3,3:980\n456#3,8:998\n464#3,3:1012\n467#3,3:1018\n1097#4,6:788\n1097#4,6:806\n1097#4,6:813\n1097#4,6:820\n1097#4,6:827\n1097#4,6:834\n1097#4,6:847\n1097#4,6:915\n1097#4,6:922\n81#5,11:794\n81#5,11:853\n81#5,11:864\n154#6:875\n154#6:876\n154#6:877\n154#6:913\n154#6:933\n154#6:934\n154#6:935\n154#6:936\n154#6:937\n154#6:938\n154#6:941\n154#6:942\n154#6:943\n154#6:979\n154#6:1016\n154#6:1017\n154#6:1023\n154#6:1024\n154#6:1025\n154#6:1026\n154#6:1027\n154#6:1028\n154#6:1029\n154#6:1030\n154#6:1031\n154#6:1032\n66#7,6:878\n72#7:912\n76#7:932\n66#7,6:944\n72#7:978\n76#7:984\n78#8,11:884\n91#8:931\n78#8,11:950\n91#8:983\n78#8,11:987\n91#8:1021\n4144#9,6:903\n4144#9,6:969\n4144#9,6:1006\n1#10:940\n76#11,2:985\n78#11:1015\n82#11:1022\n81#12:1033\n107#12,2:1034\n81#12:1036\n107#12,2:1037\n81#12:1042\n107#12,2:1043\n81#12:1045\n81#12:1049\n75#13:1039\n108#13,2:1040\n75#14:1046\n108#14,2:1047\n*S KotlinDebug\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt\n*L\n92#1:783\n117#1:784\n118#1:785\n119#1:786\n145#1:840\n146#1:841\n147#1:842\n148#1:843\n149#1:844\n151#1:845\n633#1:939\n126#1:787\n130#1:805\n133#1:812\n136#1:819\n139#1:826\n143#1:833\n152#1:846\n345#1:895,8\n345#1:909,3\n495#1:914\n498#1:921\n345#1:928,3\n639#1:961,8\n639#1:975,3\n639#1:980,3\n671#1:998,8\n671#1:1012,3\n671#1:1018,3\n126#1:788,6\n130#1:806,6\n133#1:813,6\n136#1:820,6\n139#1:827,6\n143#1:834,6\n152#1:847,6\n495#1:915,6\n498#1:922,6\n129#1:794,11\n159#1:853,11\n191#1:864,11\n342#1:875\n343#1:876\n348#1:877\n420#1:913\n515#1:933\n540#1:934\n562#1:935\n584#1:936\n611#1:937\n629#1:938\n633#1:941\n640#1:942\n642#1:943\n663#1:979\n680#1:1016\n682#1:1017\n714#1:1023\n716#1:1024\n742#1:1025\n748#1:1026\n749#1:1027\n755#1:1028\n762#1:1029\n769#1:1030\n770#1:1031\n774#1:1032\n345#1:878,6\n345#1:912\n345#1:932\n639#1:944,6\n639#1:978\n639#1:984\n345#1:884,11\n345#1:931\n639#1:950,11\n639#1:983\n671#1:987,11\n671#1:1021\n345#1:903,6\n639#1:969,6\n671#1:1006,6\n671#1:985,2\n671#1:1015\n671#1:1022\n126#1:1033\n126#1:1034,2\n133#1:1036\n133#1:1037,2\n143#1:1042\n143#1:1043,2\n144#1:1045\n338#1:1049\n136#1:1039\n136#1:1040,2\n152#1:1046\n152#1:1047,2\n*E\n"})
public final class o0O000 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52376OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f52376OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f52376OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Boolean f52377OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p365o0OOo00O.OooO f52378OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Boolean bool, p365o0OOo00O.OooO oooO) {
            super(0);
            this.f52377OooO0Oo = bool;
            this.f52378OooO0o0 = oooO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = this.f52377OooO0Oo;
            h0.OooO0OO("106109", MapsKt.mapOf(TuplesKt.to("state", Integer.valueOf(Intrinsics.areEqual(bool2, bool) ? 1 : 0))));
            if (bool2 != null) {
                boolean zBooleanValue = bool2.booleanValue();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                boolean z = !zBooleanValue;
                ((MutableLiveData) oo0oO0.f47999Oooo000.getValue()).postValue(Boolean.valueOf(z));
                p365o0OOo00O.OooO oooO = this.f52378OooO0o0;
                if (oooO != null) {
                    oooO.OooO0oo(z);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52379OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52380OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p365o0OOo00O.OooO f52381OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Boolean f52382OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f52383OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Integer> f52384OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, Boolean bool, p365o0OOo00O.OooO oooO, MomentAdapterTag momentAdapterTag, Function0<Integer> function0, int i) {
            super(2);
            this.f52380OooO0Oo = boxScope;
            this.f52382OooO0o0 = bool;
            this.f52381OooO0o = oooO;
            this.f52383OooO0oO = momentAdapterTag;
            this.f52384OooO0oo = function0;
            this.f52379OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000.OooO00o(this.f52380OooO0Oo, this.f52382OooO0o0, this.f52381OooO0o, this.f52383OooO0oO, this.f52384OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52379OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52385OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52386OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, int i) {
            super(2);
            this.f52385OooO0Oo = boxScope;
            this.f52386OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52386OooO0o0 | 1);
            o0O000.OooO0O0(this.f52385OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52387OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f52387OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f52387OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentVideoComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$StateArea$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,782:1\n154#2:783\n*S KotlinDebug\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$StateArea$1\n*L\n519#1:783\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52388OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentDetailModel momentDetailModel) {
            super(3);
            this.f52388OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1898088593, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.StateArea.<anonymous> (MomentVideoComp.kt:517)");
                }
                AndroidView_androidKt.AndroidView(o0O000O.f52478OooO0Oo, BoxWithConstraints.matchParentSize(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(8)))), new o0OoOoOo(this.f52388OooO0Oo, BoxWithConstraints), composer2, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52389OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52390OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52391OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f52392OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<p365o0OOo00O.OooOOO> f52393OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f52394OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(BoxScope boxScope, MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Function0<? extends p365o0OOo00O.OooOOO> function0, Function0<Float> function1, int i) {
            super(2);
            this.f52390OooO0Oo = boxScope;
            this.f52392OooO0o0 = mutableState;
            this.f52391OooO0o = momentDetailModel;
            this.f52393OooO0oO = function0;
            this.f52394OooO0oo = function1;
            this.f52389OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000.OooO0Oo(this.f52390OooO0Oo, this.f52392OooO0o0, this.f52391OooO0o, this.f52393OooO0oO, this.f52394OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52389OooO | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentVideoComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$VideoForNetwork$10\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,782:1\n766#2:783\n857#2,2:784\n1#3:786\n*S KotlinDebug\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoCompKt$VideoForNetwork$10\n*L\n386#1:783\n386#1:784,2\n*E\n"})
    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MomentUserListVM> f52395OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f52396OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f52397OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f52398OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52399OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f52400OooO0oo;

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
        public OooOOO(MomentAdapterTag momentAdapterTag, boolean z, boolean z2, MomentDetailModel momentDetailModel, State<Boolean> state, MutableState<MomentUserListVM> mutableState) {
            super(0);
            this.f52396OooO0Oo = momentAdapterTag;
            this.f52398OooO0o0 = z;
            this.f52397OooO0o = z2;
            this.f52399OooO0oO = momentDetailModel;
            this.f52400OooO0oo = state;
            this.f52395OooO = mutableState;
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
            if (this.f52400OooO0oo.getValue().booleanValue()) {
                MutableState mutableState = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                if (p431o0OoOO.o0Oo0oo.OooO0oO() != RoomState.Close) {
                    String strOooO0OO = o0000.OooO0OO(o000OOo.video_watch_tip);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z3 = false;
                    }
                    if (!z3) {
                        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    momentAdapterTag = this.f52396OooO0Oo;
                    if (momentAdapterTag == null) {
                        i = -1;
                    } else {
                        i = OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
                    }
                    if (i != 1) {
                        momentDetailModel = this.f52399OooO0oO;
                        if (i != 2) {
                            z = this.f52398OooO0o0;
                            z2 = this.f52397OooO0o;
                            if (z && !z2) {
                                VideoFeedScreen videoFeedScreen = VideoFeedScreen.INSTANCE;
                                long id = momentDetailModel.getId();
                                long userId = momentDetailModel.getUserId();
                                MutableState<MomentUserListVM> mutableState2 = this.f52395OooO;
                                MomentUserListVM momentUserListVMOooO0oO = o0O000.OooO0oO(mutableState2);
                                if (momentUserListVMOooO0oO == null || (listData = momentUserListVMOooO0oO.getListData()) == null) {
                                    strOooO00o = null;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    for (MomentDetailModel momentDetailModel2 : listData) {
                                        if (momentDetailModel2.getType() == MomentType.Video.getValue()) {
                                            arrayList.add(momentDetailModel2);
                                        }
                                    }
                                    strOooO00o = p187o00o00o0.OooO.OooO00o(new ArrayList(arrayList));
                                }
                                String str = strOooO00o;
                                MomentUserListVM value = mutableState2.getValue();
                                VideoFeedScreen.navigate$default(videoFeedScreen, id, userId, 0, str, value != null ? value.getDateSort() : 0L, null, this.f52396OooO0Oo, 32, null);
                            } else if (z2 || !MomentStateKt.isUnderReview(momentDetailModel)) {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f52396OooO0Oo, 62, null);
                            } else {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 2, null, 0L, this.f52399OooO0oO, this.f52396OooO0Oo, 26, null);
                            }
                        } else if (i != 3 || i == 4) {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 4, null, 0L, this.f52399OooO0oO, this.f52396OooO0Oo, 26, null);
                        } else if (MomentStateKt.isUnderReview(momentDetailModel)) {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 2, null, 0L, this.f52399OooO0oO, this.f52396OooO0Oo, 26, null);
                        } else {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f52396OooO0Oo, 62, null);
                        }
                    }
                }
            } else {
                momentAdapterTag = this.f52396OooO0Oo;
                if (momentAdapterTag == null) {
                    i = -1;
                } else {
                    i = OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
                }
                if (i != 1) {
                    momentDetailModel = this.f52399OooO0oO;
                    if (i != 2) {
                        z = this.f52398OooO0o0;
                        z2 = this.f52397OooO0o;
                        if (z) {
                            if (z2) {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f52396OooO0Oo, 62, null);
                            } else {
                                VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f52396OooO0Oo, 62, null);
                            }
                        } else if (z2) {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f52396OooO0Oo, 62, null);
                        } else {
                            VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 0, null, 0L, null, this.f52396OooO0Oo, 62, null);
                        }
                    } else if (i != 3) {
                        VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 4, null, 0L, this.f52399OooO0oO, this.f52396OooO0Oo, 26, null);
                    } else {
                        VideoFeedScreen.navigate$default(VideoFeedScreen.INSTANCE, momentDetailModel.getId(), 0L, 4, null, 0L, this.f52399OooO0oO, this.f52396OooO0Oo, 26, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentImageModel f52401OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52402OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentImageModel momentImageModel, int i) {
            super(2);
            this.f52401OooO0Oo = momentImageModel;
            this.f52402OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52402OooO0o0 | 1);
            o0O000.OooO0o0(this.f52401OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<p365o0OOo00O.OooO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52403OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f52404OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooO> f52405OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f52406OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MomentDetailModel momentDetailModel, MutableState<p365o0OOo00O.OooO> mutableState, State<Boolean> state, MutableIntState mutableIntState) {
            super(1);
            this.f52403OooO0Oo = momentDetailModel;
            this.f52405OooO0o0 = mutableState;
            this.f52404OooO0o = state;
            this.f52406OooO0oO = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p365o0OOo00O.OooO oooO) {
            p365o0OOo00O.OooO it = oooO;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<p365o0OOo00O.OooO> mutableState = this.f52405OooO0o0;
            mutableState.setValue(it);
            p365o0OOo00O.OooOo oooOoOooO0o0 = it.OooO0o0();
            MomentDetailModel momentDetailModel = this.f52403OooO0Oo;
            String videoUrl = momentDetailModel.getVideoUrl();
            oooOoOooO0o0.getClass();
            Intrinsics.checkNotNullParameter(videoUrl, "<set-?>");
            oooOoOooO0o0.f43057OooO00o = videoUrl;
            it.OooO(momentDetailModel.getVideoUrl());
            it.OooO0oo(Intrinsics.areEqual(o0O000.OooO(this.f52404OooO0o), Boolean.TRUE));
            p365o0OOo00O.OooO value = mutableState.getValue();
            String videoUrl2 = momentDetailModel.getVideoUrl();
            int intValue = this.f52406OooO0oO.getIntValue();
            MutableState mutableState2 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
            p597o0oo00O.OooOOOO.OooO0O0("VideoPlayer ExoPlayerView control " + value + " ,data.videoUrl ==>" + videoUrl2 + "，leftTime is " + intValue + ",RoomStateManager.roomState is " + p431o0OoOO.o0Oo0oo.OooO0oO());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<p365o0OOo00O.OooOOO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f52407OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52408OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<p365o0OOo00O.OooOOO> f52409OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooOOO> f52410OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f52411OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MutableState<Boolean> mutableState, Ref.ObjectRef<p365o0OOo00O.OooOOO> objectRef, MomentDetailModel momentDetailModel, MutableState<p365o0OOo00O.OooOOO> mutableState2, MutableIntState mutableIntState) {
            super(1);
            this.f52407OooO0Oo = mutableState;
            this.f52409OooO0o0 = objectRef;
            this.f52408OooO0o = momentDetailModel;
            this.f52410OooO0oO = mutableState2;
            this.f52411OooO0oo = mutableIntState;
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
        public final Unit invoke(p365o0OOo00O.OooOOO oooOOO) {
            p365o0OOo00O.OooOOO state = oooOOO;
            Intrinsics.checkNotNullParameter(state, "state");
            o0OOo00O.OooOOO.OooO oooO = o0OOo00O.OooOOO.OooO.f43047OooO00o;
            if (Intrinsics.areEqual(state, oooO)) {
                this.f52407OooO0Oo.setValue(Boolean.FALSE);
            }
            MutableState<p365o0OOo00O.OooOOO> mutableState = this.f52410OooO0oO;
            mutableState.setValue(state);
            p365o0OOo00O.OooOOO oooOOO2 = (p365o0OOo00O.OooOOO) mutableState.getValue();
            boolean zAreEqual = Intrinsics.areEqual(oooOOO2, oooO);
            o0OOo00O.OooOOO.OooO0o oooO0o = o0OOo00O.OooOOO.OooO0o.f43050OooO00o;
            Ref.ObjectRef<p365o0OOo00O.OooOOO> objectRef = this.f52409OooO0o0;
            MutableIntState mutableIntState = this.f52411OooO0oo;
            MomentDetailModel momentDetailModel = this.f52408OooO0o;
            if (zAreEqual) {
                if (!Intrinsics.areEqual(objectRef.element, oooO0o)) {
                    h0.OooO0Oo("106050", MapsKt.mapOf(o00Oo00.OooO00o(momentDetailModel, "discovery_id"), o0oOO.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                }
            } else if (Intrinsics.areEqual(oooOOO2, oooO0o)) {
                h0.OooO0OO("106051", MapsKt.mapOf(o00Oo00.OooO00o(momentDetailModel, "discovery_id"), o0oOO.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState.getIntValue(), momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            } else if (Intrinsics.areEqual(oooOOO2, o0OOo00O.OooOOO.OooOO0.f43051OooO00o)) {
                h0.OooO0Oo("106050", MapsKt.mapOf(o00Oo00.OooO00o(momentDetailModel, "discovery_id"), o0oOO.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                h0.OooO0OO("106052", MapsKt.mapOf(o00Oo00.OooO00o(momentDetailModel, "discovery_id"), o0oOO.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState.getIntValue(), momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            }
            objectRef.element = state;
            p597o0oo00O.OooOOOO.OooO0O0("MomentVideoComp videoState is " + ((p365o0OOo00O.OooOOO) mutableState.getValue()) + " data.videoUrl is " + momentDetailModel.getVideoUrl() + ",   time," + (momentDetailModel.getVideoDuration() - mutableIntState.getIntValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function3<Float, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52412OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f52413OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f52414OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MomentDetailModel momentDetailModel, MutableIntState mutableIntState, MutableFloatState mutableFloatState) {
            super(3);
            this.f52412OooO0Oo = momentDetailModel;
            this.f52414OooO0o0 = mutableIntState;
            this.f52413OooO0o = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f, Long l, Long l2) {
            float fFloatValue = f.floatValue();
            long jLongValue = l.longValue();
            l2.longValue();
            this.f52414OooO0o0.setIntValue(RangesKt.coerceAtLeast(this.f52412OooO0Oo.getVideoDuration() - ((int) jLongValue), 0));
            this.f52413OooO0o.setFloatValue(fFloatValue);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f52415OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableFloatState mutableFloatState) {
            super(0);
            this.f52415OooO0Oo = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f52415OooO0Oo.getFloatValue());
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<p365o0OOo00O.OooOOO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooOOO> f52416OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<p365o0OOo00O.OooOOO> mutableState) {
            super(0);
            this.f52416OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final p365o0OOo00O.OooOOO invoke() {
            return this.f52416OooO0Oo.getValue();
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f52417OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MutableIntState mutableIntState) {
            super(0);
            this.f52417OooO0Oo = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f52417OooO0Oo.getIntValue());
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52418OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(int i) {
            super(2);
            this.f52418OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000.OooO0o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f52418OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$2", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52419OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52420OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(MomentDetailModel momentDetailModel, int i, Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
            this.f52419OooO0Oo = momentDetailModel;
            this.f52420OooO0o0 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00Oo0(this.f52419OooO0Oo, this.f52420OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p364o0OOo00.OooO0O0 oooO0O0 = p364o0OOo00.OooO0O0.f43002OooO00o;
            String videoUrl = this.f52419OooO0Oo.getVideoUrl();
            oooO0O0.getClass();
            p364o0OOo00.OooO0O0.OooO00o(videoUrl);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52421OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooO> f52422OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f52423OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f52424OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, MutableState<p365o0OOo00O.OooO> mutableState2, MutableIntState mutableIntState) {
            super(0);
            this.f52421OooO0Oo = momentDetailModel;
            this.f52423OooO0o0 = mutableState;
            this.f52422OooO0o = mutableState2;
            this.f52424OooO0oO = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<p365o0OOo00O.OooO> mutableState = this.f52422OooO0o;
            p365o0OOo00O.OooO oooOOooO0oo = o0O000.OooO0oo(mutableState);
            boolean z = oooOOooO0oo != null && oooOOooO0oo.isPlaying();
            MutableIntState mutableIntState = this.f52424OooO0oO;
            MomentDetailModel momentDetailModel = this.f52421OooO0Oo;
            if (z) {
                h0.OooO0OO("106052", MapsKt.mapOf(o00Oo00.OooO00o(momentDetailModel, "discovery_id"), o0oOO.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration())), TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState.getIntValue(), momentDetailModel.getVideoDuration()))), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            }
            mutableIntState.setIntValue(momentDetailModel.getVideoDuration());
            this.f52423OooO0o0.setValue(Boolean.TRUE);
            p365o0OOo00O.OooO value = mutableState.getValue();
            if (value != null) {
                value.OooO0o(false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$5", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooO> f52425OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52426OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f52427OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f52428OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52429OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MomentUserListVM> f52430OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f52431OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(MomentDetailModel momentDetailModel, boolean z, Integer num, int i, MutableState<MomentUserListVM> mutableState, MutableState<p365o0OOo00O.OooO> mutableState2, State<Boolean> state, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f52426OooO0Oo = momentDetailModel;
            this.f52428OooO0o0 = z;
            this.f52427OooO0o = num;
            this.f52429OooO0oO = i;
            this.f52430OooO0oo = mutableState;
            this.f52425OooO = mutableState2;
            this.f52431OooOO0 = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00oO0o(this.f52426OooO0Oo, this.f52428OooO0o0, this.f52427OooO0o, this.f52429OooO0oO, this.f52430OooO0oo, this.f52425OooO, this.f52431OooOO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MomentUserListVM momentUserListVMOooO0oO = o0O000.OooO0oO(this.f52430OooO0oo);
            Intrinsics.checkNotNull(momentUserListVMOooO0oO);
            boolean zAreEqual = Intrinsics.areEqual(momentUserListVMOooO0oO.getRefreshTrigger(), Boxing.boxBoolean(true));
            MutableState<p365o0OOo00O.OooO> mutableState = this.f52425OooO;
            if (zAreEqual) {
                p365o0OOo00O.OooO oooOOooO0oo = o0O000.OooO0oo(mutableState);
                Boolean boolOooO = o0O000.OooO(this.f52431OooOO0);
                String videoUrl = this.f52426OooO0Oo.getVideoUrl();
                Integer num = this.f52427OooO0o;
                o0O000.OooOO0O(oooOOooO0oo, boolOooO, videoUrl, this.f52428OooO0o0, num != null && num.intValue() == this.f52429OooO0oO);
            } else {
                p365o0OOo00O.OooO oooOOooO0oo2 = o0O000.OooO0oo(mutableState);
                if (oooOOooO0oo2 != null) {
                    oooOOooO0oo2.pause();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p539o0o0Oo00.o0Oo0oo f52432OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52433OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52434OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(int i, MomentDetailModel momentDetailModel, p539o0o0Oo00.o0Oo0oo o0oo0oo2) {
            super(1);
            this.f52432OooO0Oo = o0oo0oo2;
            this.f52434OooO0o0 = i;
            this.f52433OooO0o = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            p539o0o0Oo00.o0Oo0oo o0oo0oo2 = this.f52432OooO0Oo;
            if (o0oo0oo2 != null) {
                o0oo0oo2.OooO0OO(this.f52434OooO0o0, it, this.f52433OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$7", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52435OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f52436OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f52437OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f52438OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Integer f52439OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52440OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooO> f52441OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f52442OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(MomentFollowingVM momentFollowingVM, MomentAdapterTag momentAdapterTag, MutableState<Boolean> mutableState, Integer num, int i, MomentDetailModel momentDetailModel, MutableState<p365o0OOo00O.OooO> mutableState2, State<Boolean> state, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f52436OooO0Oo = momentFollowingVM;
            this.f52438OooO0o0 = momentAdapterTag;
            this.f52437OooO0o = mutableState;
            this.f52439OooO0oO = num;
            this.f52440OooO0oo = i;
            this.f52435OooO = momentDetailModel;
            this.f52441OooOO0 = mutableState2;
            this.f52442OooOO0O = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OOO0o(this.f52436OooO0Oo, this.f52438OooO0o0, this.f52437OooO0o, this.f52439OooO0oO, this.f52440OooO0oo, this.f52435OooO, this.f52441OooOO0, this.f52442OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p365o0OOo00O.OooO oooOOooO0oo;
            Integer num;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Boolean value = this.f52436OooO0Oo.getShowFollowDialog().getValue();
            if (value != null) {
                boolean zBooleanValue = value.booleanValue();
                MomentAdapterTag momentAdapterTag = this.f52438OooO0o0;
                MutableState<p365o0OOo00O.OooO> mutableState = this.f52441OooOO0;
                if (!zBooleanValue) {
                    if (momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment && (num = this.f52439OooO0oO) != null) {
                        int iIntValue = num.intValue();
                        int i = this.f52440OooO0oo;
                        if (iIntValue == i) {
                            MutableState mutableState2 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                            if (p431o0OoOO.o0Oo0oo.OooO0oO() == RoomState.Close) {
                                p365o0OOo00O.OooO oooOOooO0oo2 = o0O000.OooO0oo(mutableState);
                                if (oooOOooO0oo2 != null) {
                                    oooOOooO0oo2.OooO0oo(Intrinsics.areEqual(o0O000.OooO(this.f52442OooOO0O), Boxing.boxBoolean(true)));
                                }
                                p365o0OOo00O.OooO value2 = mutableState.getValue();
                                MomentDetailModel momentDetailModel = this.f52435OooO;
                                if (value2 != null) {
                                    value2.OooO00o(momentDetailModel.getVideoUrl());
                                }
                                p597o0oo00O.OooOOOO.OooO0O0("MomentVideoComp dismissDialog " + num + " currentPosition ===> " + i + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
                            }
                        }
                    }
                    if (momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Top && (oooOOooO0oo = o0O000.OooO0oo(mutableState)) != null) {
                        oooOOooO0oo.OooO0o(true);
                    }
                } else if (momentAdapterTag != MomentAdapterTag.MomentListFollowingFragment_Top) {
                    this.f52437OooO0o.setValue(Boxing.boxBoolean(true));
                    p365o0OOo00O.OooO oooOOooO0oo3 = o0O000.OooO0oo(mutableState);
                    if (oooOOooO0oo3 != null) {
                        oooOOooO0oo3.pause();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$8", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooO> f52443OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52444OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52445OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52446OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f52447OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f52448OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f52449OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f52450OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(int i, Integer num, MomentDetailModel momentDetailModel, boolean z, MutableState<Boolean> mutableState, MutableState<p365o0OOo00O.OooO> mutableState2, State<Boolean> state, MutableIntState mutableIntState, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f52444OooO0Oo = i;
            this.f52446OooO0o0 = num;
            this.f52445OooO0o = momentDetailModel;
            this.f52447OooO0oO = z;
            this.f52448OooO0oo = mutableState;
            this.f52443OooO = mutableState2;
            this.f52449OooOO0 = state;
            this.f52450OooOO0O = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0Oo0oo(this.f52444OooO0Oo, this.f52446OooO0o0, this.f52445OooO0o, this.f52447OooO0oO, this.f52448OooO0oo, this.f52443OooO, this.f52449OooOO0, this.f52450OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer num;
            p365o0OOo00O.OooOo oooOoOooO0o0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState<p365o0OOo00O.OooO> mutableState = this.f52443OooO;
            if (o0O000.OooO0oo(mutableState) != null && (num = this.f52446OooO0o0) != null) {
                if (this.f52444OooO0Oo == num.intValue()) {
                    MutableState mutableState2 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                    if (p431o0OoOO.o0Oo0oo.OooO0oO() == RoomState.Close) {
                        MomentDetailModel momentDetailModel = this.f52445OooO0o;
                        String videoUrl = momentDetailModel.getVideoUrl();
                        p365o0OOo00O.OooO value = mutableState.getValue();
                        if (!Intrinsics.areEqual(videoUrl, (value == null || (oooOoOooO0o0 = value.OooO0o0()) == null) ? null : oooOoOooO0o0.f43057OooO00o) && this.f52447OooO0oO) {
                            this.f52448OooO0oo.setValue(Boxing.boxBoolean(true));
                            p365o0OOo00O.OooO value2 = mutableState.getValue();
                            if (value2 != null) {
                                value2.OooO0oo(Intrinsics.areEqual(o0O000.OooO(this.f52449OooOO0), Boxing.boxBoolean(true)));
                            }
                            p365o0OOo00O.OooO value3 = mutableState.getValue();
                            if (value3 != null) {
                                value3.OooO00o(momentDetailModel.getVideoUrl());
                            }
                            this.f52450OooOO0O.setIntValue(momentDetailModel.getVideoDuration());
                            p597o0oo00O.OooOOOO.OooO0O0("MomentVideoComp  data.videoUrl changed " + mutableState.getValue() + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52451OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(int i) {
            super(2);
            this.f52451OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000.OooO0o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f52451OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$6", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooO> f52452OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f52453OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f52454OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52455OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Integer f52456OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52457OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f52458OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(MomentFollowingVM momentFollowingVM, MomentDetailModel momentDetailModel, boolean z, Integer num, int i, MutableState<p365o0OOo00O.OooO> mutableState, State<Boolean> state, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f52453OooO0Oo = momentFollowingVM;
            this.f52455OooO0o0 = momentDetailModel;
            this.f52454OooO0o = z;
            this.f52456OooO0oO = num;
            this.f52457OooO0oo = i;
            this.f52452OooO = mutableState;
            this.f52458OooOO0 = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(this.f52453OooO0Oo, this.f52455OooO0o0, this.f52454OooO0o, this.f52456OooO0oO, this.f52457OooO0oo, this.f52452OooO, this.f52458OooOO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean zAreEqual = Intrinsics.areEqual(this.f52453OooO0Oo.getRefreshTrigger(), Boxing.boxBoolean(true));
            MutableState<p365o0OOo00O.OooO> mutableState = this.f52452OooO;
            if (zAreEqual) {
                p365o0OOo00O.OooO oooOOooO0oo = o0O000.OooO0oo(mutableState);
                Boolean boolOooO = o0O000.OooO(this.f52458OooOO0);
                String videoUrl = this.f52455OooO0o0.getVideoUrl();
                Integer num = this.f52456OooO0oO;
                o0O000.OooOO0O(oooOOooO0oo, boolOooO, videoUrl, this.f52454OooO0o, num != null && num.intValue() == this.f52457OooO0oo);
            } else {
                p365o0OOo00O.OooO oooOOooO0oo2 = o0O000.OooO0oo(mutableState);
                if (oooOOooO0oo2 != null) {
                    oooOOooO0oo2.pause();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentVideoCompKt$VideoForNetwork$4", f = "MomentVideoComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MomentUserListVM> f52459OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52460OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p539o0o0Oo00.o0Oo0oo f52461OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52462OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f52463OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Integer f52464OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<p365o0OOo00O.OooO> f52465OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f52466OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(int i, MomentDetailModel momentDetailModel, p539o0o0Oo00.o0Oo0oo o0oo0oo2, boolean z, Integer num, MutableState<MomentUserListVM> mutableState, MutableState<p365o0OOo00O.OooO> mutableState2, State<Boolean> state, Continuation<? super oo000o> continuation) {
            super(2, continuation);
            this.f52460OooO0Oo = i;
            this.f52462OooO0o0 = momentDetailModel;
            this.f52461OooO0o = o0oo0oo2;
            this.f52463OooO0oO = z;
            this.f52464OooO0oo = num;
            this.f52459OooO = mutableState;
            this.f52465OooOO0 = mutableState2;
            this.f52466OooOO0O = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new oo000o(this.f52460OooO0Oo, this.f52462OooO0o0, this.f52461OooO0o, this.f52463OooO0oO, this.f52464OooO0oo, this.f52459OooO, this.f52465OooOO0, this.f52466OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0076  */
        /* JADX WARN: Code duplicated, block: B:24:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p365o0OOo00O.OooO oooOOooO0oo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState<MomentUserListVM> mutableState = this.f52459OooO;
            MomentUserListVM momentUserListVMOooO0oO = o0O000.OooO0oO(mutableState);
            Intrinsics.checkNotNull(momentUserListVMOooO0oO);
            Long topPostDetailId = momentUserListVMOooO0oO.getTopPostDetailId();
            int i = this.f52460OooO0Oo;
            State<Boolean> state = this.f52466OooOO0O;
            MomentDetailModel momentDetailModel = this.f52462OooO0o0;
            MutableState<p365o0OOo00O.OooO> mutableState2 = this.f52465OooOO0;
            if (topPostDetailId != null) {
                MutableState mutableState3 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                if (p431o0OoOO.o0Oo0oo.OooO0oO() == RoomState.Close && i == 0) {
                    long id = momentDetailModel.getId();
                    MomentUserListVM value = mutableState.getValue();
                    Intrinsics.checkNotNull(value);
                    Long topPostDetailId2 = value.getTopPostDetailId();
                    if (topPostDetailId2 != null && id == topPostDetailId2.longValue()) {
                        p365o0OOo00O.OooO oooOOooO0oo2 = o0O000.OooO0oo(mutableState2);
                        if (oooOOooO0oo2 != null) {
                            oooOOooO0oo2.OooO0oo(Intrinsics.areEqual(o0O000.OooO(state), Boxing.boxBoolean(true)));
                        }
                        p365o0OOo00O.OooO value2 = mutableState2.getValue();
                        if (value2 != null) {
                            value2.OooO00o(momentDetailModel.getVideoUrl());
                        }
                        p539o0o0Oo00.o0Oo0oo o0oo0oo2 = this.f52461OooO0o;
                        if (o0oo0oo2 != null) {
                            o0oo0oo2.f54443OooO0Oo.setIntValue(0);
                        }
                    } else {
                        oooOOooO0oo = o0O000.OooO0oo(mutableState2);
                        if (oooOOooO0oo != null) {
                            oooOOooO0oo.pause();
                        }
                    }
                } else {
                    oooOOooO0oo = o0O000.OooO0oo(mutableState2);
                    if (oooOOooO0oo != null) {
                        oooOOooO0oo.pause();
                    }
                }
                MomentUserListVM value3 = mutableState.getValue();
                Intrinsics.checkNotNull(value3);
                p597o0oo00O.OooOOOO.OooO0O0("MomentVideoComp topPostDetailId  " + value3.getTopPostDetailId() + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
            } else {
                p365o0OOo00O.OooO oooOOooO0oo3 = o0O000.OooO0oo(mutableState2);
                Boolean boolOooO = o0O000.OooO(state);
                String videoUrl = momentDetailModel.getVideoUrl();
                Integer num = this.f52464OooO0oo;
                o0O000.OooOO0O(oooOOooO0oo3, boolOooO, videoUrl, this.f52463OooO0oO, num != null && num.intValue() == i);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class oo0o0Oo {
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

    public static final Boolean OooO(State state) {
        return (Boolean) state.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, Boolean bool, p365o0OOo00O.OooO oooO, MomentAdapterTag momentAdapterTag, Function0<Integer> function0, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626903165);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1626903165, i, -1, "com.yalla.yalla.ui.composable.moment.BottomArea (MomentVideoComp.kt:607)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(58)), 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        BoxKt.Box(BackgroundKt.background$default(boxScope.align(modifierFillMaxWidth$default, companion2.getBottomCenter()), Brush.Companion.m1644verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(Color.m1680copywmQWz5c$default(o0O0o.f48111OooOo0, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m1671boximpl(o0O0o.f48114OooOo0o)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-2100755938);
        if (momentAdapterTag != MomentAdapterTag.MomentEditRecord) {
            Lazy lazy = o0O00O0o.f39628OooO00o;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(o0O00O0o.OooO0OO(function0.invoke().intValue()), PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion2.getBottomStart()), Dp.m3775constructorimpl(8), 0.0f, 0.0f, Dp.m3775constructorimpl(12), 6, null), o0O0o.f48093OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0O0o.f48117OooOoOO, 0L, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(2)), 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composer2, 3072, 0, 65520);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        float f = 8;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(boxScope.align(SizeKt.m525size3ABfNKs(BackgroundKt.m170backgroundbw27NRU(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null), o0O0o.f48116OooOoO0, RoundedCornerShapeKt.getCircleShape()), Dp.m3775constructorimpl(24)), companion2.getBottomEnd()), false, false, 0L, false, null, null, null, new OooO00o(bool, oooO), 255);
        Composer composer3 = composer2;
        composer3.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(Intrinsics.areEqual(bool, Boolean.TRUE) ? p565o0oOo000.oo0o0Oo.ic_video_muted : p565o0oOo000.oo0o0Oo.ic_video_sound, composer3, 0), "", o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), Dp.m3775constructorimpl(16)), composer3, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
        if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, bool, oooO, momentAdapterTag, function0, i));
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
                ComposerKt.traceEventStart(568640814, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentLoadingView (MomentVideoComp.kt:669)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion, companion2.getCenter()), 0.0f, 1, null);
            int i3 = o0O0o.f48305o00OOooO;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierFillMaxSize$default, o0O0o.f48116OooOoO0, null, 2, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            oo0O.OooO00o("svga/anim_video_loading.svga", true, 0, null, null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(38)), composerStartRestartGroup, 196662, 28);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(1), null, composerStartRestartGroup, 6, 2);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000OOo.video_feed_loading, composerStartRestartGroup, 0), (Modifier) null, o0O0o.f48104OooOOO0, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
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
                ComposerKt.traceEventStart(-1459769636, i, -1, "com.yalla.yalla.ui.composable.moment.MomentVideoComp (MomentVideoComp.kt:90)");
            }
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(o00OO000.f52247OooO0Oo);
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
            if (oOO00O.OooO0o(momentDetailModel.getVideoUrl())) {
                composerStartRestartGroup.startReplaceableGroup(-270847523);
                OooO0o(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (!momentDetailModel.getVideoInfoList().isEmpty()) {
                composerStartRestartGroup.startReplaceableGroup(-270847432);
                MomentImageModel momentImageModel = momentDetailModel.getVideoInfoList().get(0);
                Intrinsics.checkNotNullExpressionValue(momentImageModel, "get(...)");
                OooO0o0(momentImageModel, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-270847349);
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
    public static final void OooO0Oo(BoxScope boxScope, MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Function0<? extends p365o0OOo00O.OooOOO> function0, Function0<Float> function1, Composer composer, int i) {
        long j;
        Unit unit;
        Map<Long, Float> map;
        Float f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-47688544);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-47688544, i, -1, "com.yalla.yalla.ui.composable.moment.StateArea (MomentVideoComp.kt:510)");
        }
        composerStartRestartGroup.startReplaceableGroup(1498563432);
        if (mutableState.getValue().booleanValue()) {
            BoxWithConstraintsKt.BoxWithConstraints(boxScope.matchParentSize(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(8)))), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1898088593, true, new OooOO0(momentDetailModel)), composerStartRestartGroup, 3072, 6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
        if (p431o0OoOO.o0Oo0oo.OooO0oO() != RoomState.Close) {
            composerStartRestartGroup.startReplaceableGroup(1498564240);
            ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.oo0o0Oo.ic_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(48)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1498564492);
            long jAbs = Math.abs(momentDetailModel.getVideoUrl().hashCode());
            p365o0OOo00O.OooOOO oooOOOInvoke = function0.invoke();
            if (Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooOO0.f43051OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(1498564611);
                composerStartRestartGroup.endReplaceableGroup();
                mutableState.setValue(Boolean.FALSE);
            } else {
                if (Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooO.f43047OooO00o)) {
                    composerStartRestartGroup.startReplaceableGroup(1498564697);
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState.setValue(Boolean.FALSE);
                    Map<Long, Float> map2 = VideoPreloadWorker.f32309OooO;
                    if (map2.get(Long.valueOf(jAbs)) == null) {
                        map2.put(Long.valueOf(jAbs), function1.invoke());
                    }
                } else {
                    if (Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooO0o.f43050OooO00o) ? true : Intrinsics.areEqual(oooOOOInvoke, o0OOo00O.OooOOO.OooOOO0.f43053OooO00o)) {
                        composerStartRestartGroup.startReplaceableGroup(1498564926);
                        j = jAbs;
                        ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.oo0o0Oo.ic_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(46)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        j = jAbs;
                        if (oooOOOInvoke instanceof o0OOo00O.OooOOO.OooO0OO) {
                            composerStartRestartGroup.startReplaceableGroup(1498565268);
                            OooO0O0(boxScope, composerStartRestartGroup, i & 14);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(1498565341);
                            String videoUrl = momentDetailModel.getVideoUrl();
                            Map<Long, Float> map3 = VideoPreloadWorker.f32309OooO;
                            p597o0oo00O.OooOOOO.OooO0OO("VideoCache", "preCacheVideo videoUrl " + videoUrl + ", downloadPercentage is :" + map3.get(Long.valueOf(j)) + ",videoProgress() :" + function1.invoke());
                            Float f2 = map3.get(Long.valueOf(j));
                            composerStartRestartGroup.startReplaceableGroup(1498565628);
                            if (f2 == null) {
                                unit = null;
                            } else {
                                if (f2.floatValue() < function1.invoke().floatValue()) {
                                    composerStartRestartGroup.startReplaceableGroup(-188058799);
                                    OooO0O0(boxScope, composerStartRestartGroup, i & 14);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-188058726);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.oo0o0Oo.ic_start_live_play, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(46)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                                unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (unit == null) {
                                OooO0O0(boxScope, composerStartRestartGroup, i & 14);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                }
                map = VideoPreloadWorker.f32309OooO;
                f = map.get(Long.valueOf(j));
                if (f != null && f.floatValue() < function1.invoke().floatValue()) {
                    map.put(Long.valueOf(j), function1.invoke());
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            j = jAbs;
            map = VideoPreloadWorker.f32309OooO;
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

    /* JADX WARN: Code duplicated, block: B:102:0x0493  */
    /* JADX WARN: Code duplicated, block: B:107:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x051b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0527  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v132 */
    /* JADX WARN: Type inference failed for: r2v147 */
    /* JADX WARN: Type inference failed for: r2v23, types: [T] */
    /* JADX WARN: Type inference failed for: r2v69, types: [o0OOo00O.OooO] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @UnstableApi
    public static final void OooO0o(Composer composer, int i) {
        int i2;
        State state;
        boolean z;
        LocalViewModelStoreOwner localViewModelStoreOwner;
        int i3;
        MomentAdapterTag momentAdapterTag;
        List list;
        MutableState mutableState;
        int i4;
        ?? r1;
        MomentAdapterTag momentAdapterTag2;
        boolean z2;
        p365o0OOo00O.OooO oooO;
        ?? r7;
        MutableIntState mutableIntState;
        p365o0OOo00O.OooO oooO2;
        ?? r2;
        boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(96111142);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(96111142, i, -1, "com.yalla.yalla.ui.composable.moment.VideoForNetwork (MomentVideoComp.kt:115)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(o00OO000.f52247OooO0Oo);
            MomentAdapterTag momentAdapterTag3 = (MomentAdapterTag) composerStartRestartGroup.consume(o00OO000.f52245OooO0O0);
            List listSplit$default = StringsKt__StringsKt.split$default(momentDetailModel.getVideoSize(), new String[]{"*"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() < 2) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(i));
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
            MutableState mutableState2 = (MutableState) objRememberedValue;
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
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0OOo00O.OooOOO.OooO00o.f43048OooO00o, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) objRememberedValue3;
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
            ?? r3 = objRememberedValue5;
            if (objRememberedValue5 == companion.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(null);
                r3 = 0;
            }
            composerStartRestartGroup.endReplaceableGroup();
            objectRef.element = r3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) objRememberedValue6;
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState((MutableLiveData) oo0oO0.f47999Oooo000.getValue(), composerStartRestartGroup, 8);
            ProvidableCompositionLocal<p539o0o0Oo00.o0Oo0oo> providableCompositionLocal = o00OO000.f52250OooO0oO;
            p539o0o0Oo00.o0Oo0oo o0oo0oo2 = (p539o0o0Oo00.o0Oo0oo) composerStartRestartGroup.consume(providableCompositionLocal);
            p539o0o0Oo00.o0Oo0oo o0oo0oo3 = (p539o0o0Oo00.o0Oo0oo) composerStartRestartGroup.consume(providableCompositionLocal);
            Integer numValueOf = o0oo0oo3 != null ? Integer.valueOf(o0oo0oo3.f54443OooO0Oo.getIntValue()) : null;
            int iIntValue = ((Number) composerStartRestartGroup.consume(o00OO000.f52251OooO0oo)).intValue();
            boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52244OooO00o)).booleanValue();
            boolean zIsAtLeast = ((LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED);
            p539o0o0Oo00.o0Oo0oo o0oo0oo4 = (p539o0o0Oo00.o0Oo0oo) composerStartRestartGroup.consume(providableCompositionLocal);
            Integer numValueOf2 = Integer.valueOf(momentDetailModel.getVideoDuration());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(numValueOf2);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotIntStateKt.mutableIntStateOf(momentDetailModel.getVideoDuration());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue7;
            EffectsKt.LaunchedEffect(momentDetailModel.getVideoUrl(), new o00Oo0(momentDetailModel, iIntValue, null), composerStartRestartGroup, 64);
            composerStartRestartGroup.startReplaceableGroup(1212425103);
            if (zBooleanValue2) {
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current2 = localViewModelStoreOwner2.getCurrent(composerStartRestartGroup, 6);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                i3 = 2;
                localViewModelStoreOwner = localViewModelStoreOwner2;
                state = stateObserveAsState;
                ViewModel viewModel2 = ViewModelKt.viewModel(MomentDetailActivityVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                z = zIsAtLeast;
                OooOO0O((p365o0OOo00O.OooO) mutableState5.getValue(), (Boolean) state.getValue(), momentDetailModel.getVideoUrl(), z, ((MomentDetailActivityVM) viewModel2).isExpand());
            } else {
                state = stateObserveAsState;
                z = zIsAtLeast;
                localViewModelStoreOwner = localViewModelStoreOwner2;
                i3 = 2;
            }
            int i5 = i3;
            composerStartRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState3 = mutableIntState2;
            com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_PAUSE, new o00Ooo(momentDetailModel, mutableState3, mutableState5, mutableIntState3), composerStartRestartGroup, 6);
            int i6 = momentAdapterTag3 == null ? -1 : oo0o0Oo.$EnumSwitchMapping$0[momentAdapterTag3.ordinal()];
            char c = 3;
            if (i6 != 1) {
                if (i6 == i5 || i6 == 3) {
                    composerStartRestartGroup.startReplaceableGroup(1212427879);
                    Boolean refreshTrigger = momentFollowingVM.getRefreshTrigger();
                    o0ooOOo o0ooooo = new o0ooOOo(momentFollowingVM, momentDetailModel, z, numValueOf, iIntValue, mutableState5, state, null);
                    i4 = 64;
                    EffectsKt.LaunchedEffect(refreshTrigger, o0ooooo, composerStartRestartGroup, 64);
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit = Unit.INSTANCE;
                    z3 = false;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1212428400);
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit2 = Unit.INSTANCE;
                    z3 = false;
                    i4 = 64;
                }
                r1 = z3;
                list = listSplit$default;
                mutableState = mutableState2;
                momentAdapterTag = momentAdapterTag3;
            } else {
                zBooleanValue = zBooleanValue;
                c = 3;
                mutableIntState3 = mutableIntState3;
                z = z;
                mutableState5 = mutableState5;
                numValueOf = numValueOf;
                composerStartRestartGroup.startReplaceableGroup(1212426139);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current3 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel3 = ViewModelKt.viewModel(MomentUserListVM.class, current3, null, null, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2.setValue((MomentUserListVM) viewModel3);
                MomentUserListVM momentUserListVM = (MomentUserListVM) mutableState2.getValue();
                Intrinsics.checkNotNull(momentUserListVM);
                EffectsKt.LaunchedEffect(momentUserListVM.getTopPostDetailId(), new oo000o(iIntValue, momentDetailModel, o0oo0oo4, z, numValueOf, mutableState2, mutableState5, state, null), composerStartRestartGroup, 64);
                MomentUserListVM momentUserListVM2 = (MomentUserListVM) mutableState2.getValue();
                Intrinsics.checkNotNull(momentUserListVM2);
                momentAdapterTag = momentAdapterTag3;
                list = listSplit$default;
                mutableState = mutableState2;
                EffectsKt.LaunchedEffect(momentUserListVM2.getRefreshTrigger(), new o00oO0o(momentDetailModel, z, numValueOf, iIntValue, mutableState2, mutableState5, state, null), composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
                i4 = 64;
                r1 = 0;
            }
            EffectsKt.LaunchedEffect(momentFollowingVM.getShowFollowDialog().getValue(), new o0OOO0o(momentFollowingVM, momentAdapterTag, mutableState3, numValueOf, iIntValue, momentDetailModel, mutableState5, state, null), composerStartRestartGroup, i4);
            StringBuilder sb = new StringBuilder("MomentVideoComp momentPlayPosition is ");
            Integer num = numValueOf;
            sb.append(num);
            sb.append(", currentPosition is ");
            sb.append(iIntValue);
            p597o0oo00O.OooOOOO.OooO0O0(sb.toString());
            if (num != null && num.intValue() == iIntValue) {
                MutableState mutableState6 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                if (p431o0OoOO.o0Oo0oo.OooO0oO() == RoomState.Close) {
                    if (zBooleanValue2) {
                        momentAdapterTag2 = momentAdapterTag;
                        z2 = z;
                    } else {
                        if (Intrinsics.areEqual(momentFollowingVM.getShowFollowDialog().getValue(), Boolean.TRUE)) {
                            momentAdapterTag2 = momentAdapterTag;
                            if (momentAdapterTag2 == MomentAdapterTag.MomentListFollowingFragment_Top) {
                                z2 = z;
                                OooOO0O((p365o0OOo00O.OooO) mutableState5.getValue(), (Boolean) state.getValue(), momentDetailModel.getVideoUrl(), z2, true);
                            } else {
                                z2 = z;
                            }
                        } else {
                            momentAdapterTag2 = momentAdapterTag;
                            z2 = z;
                            OooOO0O((p365o0OOo00O.OooO) mutableState5.getValue(), (Boolean) state.getValue(), momentDetailModel.getVideoUrl(), z2, true);
                        }
                        p597o0oo00O.OooOOOO.OooO0O0("MomentVideoComp momentPlayPosition playing momentAdapterTag " + momentAdapterTag2 + ",data.videoUrl ==>" + momentDetailModel.getVideoUrl());
                    }
                    mutableIntState = mutableIntState3;
                } else {
                    momentAdapterTag2 = momentAdapterTag;
                    z2 = z;
                    oooO = (p365o0OOo00O.OooO) mutableState5.getValue();
                    if (oooO == null && oooO.isPlaying()) {
                        r7 = 1;
                    } else {
                        r7 = r1;
                    }
                    if (r7 != 0) {
                        Pair[] pairArr = new Pair[5];
                        pairArr[r1] = o00Oo00.OooO00o(momentDetailModel, "discovery_id");
                        pairArr[1] = o0oOO.OooO00o(momentDetailModel, "video_id");
                        pairArr[2] = TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration()));
                        pairArr[c] = TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState3.getIntValue(), momentDetailModel.getVideoDuration())));
                        pairArr[4] = TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId());
                        h0.OooO0OO("106052", MapsKt.mapOf(pairArr));
                    }
                    mutableIntState = mutableIntState3;
                    mutableIntState.setIntValue(momentDetailModel.getVideoDuration());
                    mutableState3.setValue(Boolean.TRUE);
                    oooO2 = (p365o0OOo00O.OooO) mutableState5.getValue();
                    if (oooO2 != null) {
                        oooO2.OooO0oo(true);
                    }
                    r2 = (p365o0OOo00O.OooO) mutableState5.getValue();
                    if (r2 != 0) {
                        r2.OooO0o(r1);
                    }
                }
            } else {
                momentAdapterTag2 = momentAdapterTag;
                z2 = z;
                oooO = (p365o0OOo00O.OooO) mutableState5.getValue();
                if (oooO == null) {
                    r7 = r1;
                } else {
                    r7 = r1;
                }
                if (r7 != 0) {
                    Pair[] pairArr2 = new Pair[5];
                    pairArr2[r1] = o00Oo00.OooO00o(momentDetailModel, "discovery_id");
                    pairArr2[1] = o0oOO.OooO00o(momentDetailModel, "video_id");
                    pairArr2[2] = TuplesKt.to("video_time", Integer.valueOf(momentDetailModel.getVideoDuration()));
                    pairArr2[c] = TuplesKt.to("duration_time", Integer.valueOf(RangesKt.coerceAtMost(momentDetailModel.getVideoDuration() - mutableIntState3.getIntValue(), momentDetailModel.getVideoDuration())));
                    pairArr2[4] = TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId());
                    h0.OooO0OO("106052", MapsKt.mapOf(pairArr2));
                }
                mutableIntState = mutableIntState3;
                mutableIntState.setIntValue(momentDetailModel.getVideoDuration());
                mutableState3.setValue(Boolean.TRUE);
                oooO2 = (p365o0OOo00O.OooO) mutableState5.getValue();
                if (oooO2 != null) {
                    oooO2.OooO0oo(true);
                }
                r2 = (p365o0OOo00O.OooO) mutableState5.getValue();
                if (r2 != 0) {
                    r2.OooO0o(r1);
                }
            }
            EffectsKt.LaunchedEffect(momentDetailModel.getVideoUrl(), new o0Oo0oo(iIntValue, num, momentDetailModel, z2, mutableState3, mutableState5, state, mutableIntState, null), composerStartRestartGroup, i4);
            State stateCollectAsState = SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48527OooO00o, null, composerStartRestartGroup, 8, 1);
            composerStartRestartGroup.startReplaceableGroup(941485441);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(941485441, 8, -1, "com.yalla.yalla.ui.composable.moment.checkVideoSize (MomentVideoComp.kt:730)");
            }
            ?? r4 = list;
            Modifier modifierOooOO0 = OooOO0(Float.parseFloat((String) r4.get(r1)), Float.parseFloat((String) r4.get(1)), composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM482paddingqDBjuR0$default = zBooleanValue ? PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(10), 0.0f, Dp.m3775constructorimpl(30), 0.0f, 10, null) : PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(61), 0.0f, Dp.m3775constructorimpl(33), 0.0f, 10, null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 8;
            Modifier modifierOooO00o = o000.OooO00o(f, companion2.then(modifierM482paddingqDBjuR0$default));
            long j = o0O0o.f48230o000o0o0;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(BackgroundKt.m171backgroundbw27NRU$default(modifierOooO00o, j, null, 2, null).then(modifierOooOO0), new o0OO00O(iIntValue, momentDetailModel, o0oo0oo2)), false, false, 0L, false, null, null, null, new OooOOO(momentAdapterTag2, zBooleanValue, zBooleanValue2, momentDetailModel, stateCollectAsState, mutableState), 255);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, r1, composerStartRestartGroup, r1, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r1);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(r1, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(companion2, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), j, null, 2, null);
            if (zBooleanValue) {
                j = o0O0o.f48304o00OOoo;
            }
            State state2 = state;
            MutableState mutableState7 = mutableState5;
            MutableIntState mutableIntState4 = mutableIntState;
            MomentAdapterTag momentAdapterTag4 = momentAdapterTag2;
            p365o0OOo00O.OooOO0O.OooO00o(modifierM171backgroundbw27NRU$default, 4, new OooOOOO(momentDetailModel, mutableState7, state2, mutableIntState), j, new OooOo00(momentDetailModel, mutableIntState, mutableFloatState), new OooOo(mutableState3, objectRef, momentDetailModel, mutableState4, mutableIntState), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState4);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Oooo000(mutableState4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue8;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(mutableFloatState);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Oooo0(mutableFloatState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0Oo(boxScopeInstance, mutableState3, momentDetailModel, function0, (Function0) objRememberedValue9, composerStartRestartGroup, 566);
            Boolean bool = (Boolean) state2.getValue();
            p365o0OOo00O.OooO oooO3 = (p365o0OOo00O.OooO) mutableState7.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged4 = composerStartRestartGroup.changed(mutableIntState4);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new o000oOoO(mutableIntState4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO00o(boxScopeInstance, bool, oooO3, momentAdapterTag4, (Function0) objRememberedValue10, composerStartRestartGroup, 518);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o0OoOo0(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(MomentImageModel momentImageModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1172415895);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1172415895, i, -1, "com.yalla.yalla.ui.composable.moment.VideoForLocal (MomentVideoComp.kt:709)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(8, PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(61), 0.0f, Dp.m3775constructorimpl(15), 0.0f, 10, null).then(OooOO0(momentImageModel.getWidth(), momentImageModel.getHeight(), composerStartRestartGroup))), o0O0o.f48111OooOo0, null, 2, null), null, false, p519o0o0O0O.OooOO0O.f51761OooO00o, composerStartRestartGroup, 3072, 6);
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

    public static final p365o0OOo00O.OooO OooO0oo(MutableState mutableState) {
        return (p365o0OOo00O.OooO) mutableState.getValue();
    }

    @Composable
    public static final Modifier OooOO0(float f, float f2, Composer composer) {
        Modifier modifierM511height3ABfNKs;
        composer.startReplaceableGroup(-826099325);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-826099325, 0, -1, "com.yalla.yalla.ui.composable.moment.checkVideoSize (MomentVideoComp.kt:735)");
        }
        float f3 = f / f2;
        if (f3 == 1.0f) {
            modifierM511height3ABfNKs = SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(184));
        } else if (f3 <= 0.6666667f) {
            modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(185)), Dp.m3775constructorimpl(278));
        } else if (f3 > 0.6666667f && f3 < 1.0f) {
            modifierM511height3ABfNKs = AspectRatioKt.aspectRatio$default(SizeKt.m530width3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(185)), f3, false, 2, null);
        } else if (f3 <= 1.0f || f3 >= 1.5f) {
            modifierM511height3ABfNKs = f3 >= 1.5f ? SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(278)), Dp.m3775constructorimpl(185)) : SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(184));
        } else {
            modifierM511height3ABfNKs = AspectRatioKt.aspectRatio$default(SizeKt.m530width3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(278)), f3, false, 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierM511height3ABfNKs;
    }

    public static final void OooOO0O(p365o0OOo00O.OooO oooO, Boolean bool, String str, boolean z, boolean z2) {
        if (z2 && z) {
            MutableState mutableState = p431o0OoOO.o0Oo0oo.f46817OooO00o;
            if (p431o0OoOO.o0Oo0oo.OooO0oO() == RoomState.Close) {
                if (oooO != null) {
                    oooO.OooO0oo(Intrinsics.areEqual(bool, Boolean.TRUE));
                }
                if (oooO != null) {
                    oooO.OooO00o(str);
                    return;
                }
                return;
            }
        }
        if (oooO != null) {
            oooO.pause();
        }
    }
}
