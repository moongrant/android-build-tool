package p198o00o0Oo;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.OooOOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.OooO00o;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.InteractiveComponentSizeKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCustomSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1281:1\n25#2:1282\n36#2:1290\n25#2:1298\n25#2:1305\n36#2:1312\n456#2,8:1337\n464#2,3:1351\n467#2,3:1359\n456#2,8:1381\n464#2,3:1395\n36#2:1404\n36#2:1411\n467#2,3:1418\n456#2,8:1440\n464#2,3:1454\n25#2:1458\n25#2:1465\n67#2,3:1472\n66#2:1475\n467#2,3:1484\n83#2,3:1503\n1097#3,6:1283\n1097#3,6:1291\n1097#3,6:1299\n1097#3,6:1306\n1097#3,6:1313\n1097#3,6:1405\n1097#3,6:1412\n1097#3,6:1459\n1097#3,6:1466\n1097#3,6:1476\n1097#3,6:1506\n1#4:1289\n92#5:1297\n92#5:1319\n92#5:1356\n92#5:1357\n88#5:1358\n92#5:1400\n92#5:1401\n88#5:1402\n88#5:1403\n81#5:1482\n66#6,6:1320\n72#6:1354\n76#6:1363\n66#6,6:1364\n72#6:1398\n76#6:1422\n66#6,6:1423\n72#6:1457\n76#6:1488\n78#7,11:1326\n91#7:1362\n78#7,11:1370\n91#7:1421\n78#7,11:1429\n91#7:1487\n4144#8,6:1345\n4144#8,6:1389\n4144#8,6:1448\n76#9:1355\n76#9:1399\n154#10:1483\n154#10:1516\n154#10:1517\n154#10:1518\n2333#11,14:1489\n135#12:1512\n81#13:1513\n107#13,2:1514\n*S KotlinDebug\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt\n*L\n159#1:1282\n165#1:1290\n312#1:1298\n313#1:1305\n317#1:1312\n606#1:1337,8\n606#1:1351,3\n606#1:1359,3\n666#1:1381,8\n666#1:1395,3\n696#1:1404\n708#1:1411\n666#1:1418,3\n731#1:1440,8\n731#1:1454,3\n736#1:1458\n738#1:1465\n739#1:1472,3\n739#1:1475\n731#1:1484,3\n908#1:1503,3\n159#1:1283,6\n165#1:1291,6\n312#1:1299,6\n313#1:1306,6\n317#1:1313,6\n696#1:1405,6\n708#1:1412,6\n736#1:1459,6\n738#1:1466,6\n739#1:1476,6\n908#1:1506,6\n171#1:1297\n324#1:1319\n616#1:1356\n617#1:1357\n618#1:1358\n676#1:1400\n677#1:1401\n678#1:1402\n679#1:1403\n781#1:1482\n606#1:1320,6\n606#1:1354\n606#1:1363\n666#1:1364,6\n666#1:1398\n666#1:1422\n731#1:1423,6\n731#1:1457\n731#1:1488\n606#1:1326,11\n606#1:1362\n666#1:1370,11\n666#1:1421\n731#1:1429,11\n731#1:1487\n606#1:1345,6\n666#1:1389,6\n731#1:1448,6\n610#1:1355\n670#1:1399\n788#1:1483\n1218#1:1516\n1219#1:1517\n1220#1:1518\n866#1:1489,14\n1004#1:1512\n736#1:1513\n736#1:1514,2\n*E\n"})
public final class o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f39058OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float f39059OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f39060OooO0OO;

    @SourceDebugExtension({"SMAP\nCustomSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt$Track$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1281:1\n1477#2:1282\n1502#2,3:1283\n1505#2,3:1293\n1549#2:1297\n1620#2,3:1298\n372#3,7:1286\n215#4:1296\n216#4:1301\n*S KotlinDebug\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt$Track$1\n*L\n842#1:1282\n842#1:1283,3\n842#1:1293,3\n845#1:1297\n845#1:1298,3\n842#1:1286,7\n843#1:1296\n843#1:1301\n*E\n"})
    public static final class OooO extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ State<Color> f39061OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f39062OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f39063OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f39064OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f39065OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f39066OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f39067OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ List<Float> f39068OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ State<Color> f39069OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f39070OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(float f, State<Color> state, float f2, float f3, float f4, State<Color> state2, boolean z, List<Float> list, State<Color> state3, State<Color> state4) {
            super(1);
            this.f39062OooO0Oo = f;
            this.f39064OooO0o0 = state;
            this.f39063OooO0o = f2;
            this.f39065OooO0oO = f3;
            this.f39066OooO0oo = f4;
            this.f39061OooO = state2;
            this.f39067OooOO0 = z;
            this.f39068OooOO0O = list;
            this.f39069OooOO0o = state3;
            this.f39070OooOOO0 = state4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            boolean z = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
            float fM1448getYimpl = Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0());
            float f = this.f39062OooO0Oo;
            long jOffset = OffsetKt.Offset(f, fM1448getYimpl);
            long jOffset2 = OffsetKt.Offset(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) - f, Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()));
            long j = z ? jOffset2 : jOffset;
            long j2 = z ? jOffset : jOffset2;
            long jM1691unboximpl = this.f39064OooO0o0.getValue().m1691unboximpl();
            float f2 = this.f39063OooO0o;
            StrokeCap.Companion companion = StrokeCap.INSTANCE;
            long j3 = j2;
            long j4 = j;
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(Canvas, jM1691unboximpl, j, j2, f2, companion.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            float fM1447getXimpl = Offset.m1447getXimpl(j4);
            float fM1447getXimpl2 = Offset.m1447getXimpl(j3) - Offset.m1447getXimpl(j4);
            float f3 = this.f39065OooO0oO;
            long jOffset3 = OffsetKt.Offset((fM1447getXimpl2 * f3) + fM1447getXimpl, Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()));
            float fM1447getXimpl3 = Offset.m1447getXimpl(j4);
            float fM1447getXimpl4 = Offset.m1447getXimpl(j3) - Offset.m1447getXimpl(j4);
            float f4 = this.f39066OooO0oo;
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(Canvas, this.f39061OooO.getValue().m1691unboximpl(), OffsetKt.Offset((fM1447getXimpl4 * f4) + fM1447getXimpl3, Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0())), jOffset3, this.f39063OooO0o, companion.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            if (this.f39067OooOO0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : this.f39068OooOO0O) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Boolean boolValueOf = Boolean.valueOf(fFloatValue > f3 || fFloatValue < f4);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                float f5 = this.f39063OooO0o;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Offset.m1436boximpl(OffsetKt.Offset(Offset.m1447getXimpl(OffsetKt.m1470lerpWko1d7g(j4, j3, ((Number) it.next()).floatValue())), Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()))));
                    }
                    long j5 = j4;
                    long j6 = j3;
                    androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo00o(Canvas, arrayList2, PointMode.INSTANCE.m1958getPointsr_lszbg(), (zBooleanValue ? this.f39069OooOO0o : this.f39070OooOOO0).getValue().m1691unboximpl(), f5, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    j3 = j6;
                    j4 = j5;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCustomSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt$CustomSlider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1281:1\n76#2:1282\n76#2:1283\n486#3,4:1284\n490#3,2:1292\n494#3:1298\n25#4:1288\n25#4:1299\n25#4:1306\n67#4,3:1313\n66#4:1316\n36#4:1323\n1097#5,3:1289\n1100#5,3:1295\n1097#5,6:1300\n1097#5,6:1307\n1097#5,6:1317\n1097#5,6:1324\n486#6:1294\n*S KotlinDebug\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt$CustomSlider$3\n*L\n182#1:1282\n187#1:1283\n198#1:1284,4\n198#1:1292,2\n198#1:1298\n198#1:1288\n199#1:1299\n200#1:1306\n202#1:1313,3\n202#1:1316\n246#1:1323\n198#1:1289,3\n198#1:1295,3\n199#1:1300,6\n200#1:1307,6\n202#1:1317,6\n246#1:1324,6\n198#1:1294\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ List<Float> f39071OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f39072OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f39073OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f39074OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f39075OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f39076OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o00Oo00 f39077OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f39078OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Float, Unit>> f39079OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f39080OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, o00Oo00 o00oo00, o00OOOOo o00ooooo2, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
            super(3);
            this.f39072OooO0Oo = closedFloatingPointRange;
            this.f39074OooO0o0 = i;
            this.f39073OooO0o = f;
            this.f39075OooO0oO = mutableInteractionSource;
            this.f39076OooO0oo = z;
            this.f39071OooO = list;
            this.f39077OooOO0 = o00oo00;
            this.f39078OooOO0O = o00ooooo2;
            this.f39079OooOO0o = state;
            this.f39080OooOOO0 = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final float access$invoke$scaleToOffset(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
            float fFloatValue = ((Number) closedFloatingPointRange.getStart()).floatValue();
            float fFloatValue2 = ((Number) closedFloatingPointRange.getEndInclusive()).floatValue();
            float f2 = floatRef.element;
            float f3 = floatRef2.element;
            float f4 = o00OO0O0.f39058OooO00o;
            float f5 = fFloatValue2 - fFloatValue;
            return MathHelpersKt.lerp(f2, f3, RangesKt.coerceIn((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f - fFloatValue) / f5, 0.0f, 1.0f));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            Function1<InspectorInfo, Unit> noInspectorInfo;
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
                    ComposerKt.traceEventStart(1301204583, iIntValue, -1, "com.code.android.uikit.slider.core.CustomSlider.<anonymous> (CustomSlider.kt:181)");
                }
                boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                final float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                Ref.FloatRef floatRef = new Ref.FloatRef();
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                o00OOOOo o00ooooo2 = this.f39078OooOO0O;
                floatRef.element = Math.max(fM3743getMaxWidthimpl - density.mo326toPx0680j_4(o00ooooo2.f39166OooO00o), 0.0f);
                floatRef2.element = Math.min(density.mo326toPx0680j_4(o00ooooo2.f39166OooO00o), floatRef.element);
                Object objOooO00o = OooOo00.OooO00o(composer2, 773894976, -492369756);
                Composer.Companion companion = Composer.INSTANCE;
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composer2, -492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Object empty = companion.getEmpty();
                float f = this.f39073OooO0o;
                ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f39072OooO0Oo;
                if (objRememberedValue == empty) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(access$invoke$scaleToOffset(closedFloatingPointRange, floatRef2, floatRef, f)), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue2;
                Float fValueOf = Float.valueOf(floatRef2.element);
                Float fValueOf2 = Float.valueOf(floatRef.element);
                ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.f39072OooO0Oo;
                State<Function1<Float, Unit>> state = this.f39079OooOO0o;
                composer2.startReplaceableGroup(1618982084);
                boolean zChanged = composer2.changed(fValueOf) | composer2.changed(fValueOf2) | composer2.changed(closedFloatingPointRange2);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new o0O00o0(new o00O(mutableState, mutableState2, floatRef2, floatRef, state, closedFloatingPointRange2));
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                final o0O00o0 o0o00o1 = (o0O00o0) objRememberedValue3;
                o00O0OOO o00o0ooo2 = new o00O0OOO(closedFloatingPointRange, floatRef2, floatRef);
                ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.f39072OooO0Oo;
                ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(floatRef2.element, floatRef.element);
                float f2 = this.f39073OooO0o;
                int i = this.f39074OooO0o0;
                int i2 = i >> 9;
                o00OO0O0.OooO0Oo(o00o0ooo2, closedFloatingPointRange3, closedFloatingPointRangeRangeTo, mutableState, f2, composer2, ((i << 12) & 57344) | (i2 & 112) | 3072);
                final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new o00OO00O(mutableState, this.f39071OooO, floatRef2, floatRef, coroutineScopeOooO00o, o0o00o1, this.f39080OooOOO0), composer2, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                final MutableInteractionSource mutableInteractionSource = this.f39075OooO0oO;
                final boolean z2 = this.f39076OooO0oo;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    final boolean z3 = z;
                    noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: com.code.android.uikit.slider.core.CustomSliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Unit invoke(InspectorInfo inspectorInfo) {
                            InspectorInfo inspectorInfo2 = inspectorInfo;
                            OooOOO0.OooO00o(inspectorInfo2, "$this$null", "sliderTapModifier").set("draggableState", o0o00o1);
                            inspectorInfo2.getProperties().set("interactionSource", mutableInteractionSource);
                            inspectorInfo2.getProperties().set("maxPx", Float.valueOf(fM3743getMaxWidthimpl));
                            OooO00o.OooO00o(z3, inspectorInfo2.getProperties(), "isRtl", inspectorInfo2).set("rawOffset", mutableState);
                            inspectorInfo2.getProperties().set("gestureEndAction", stateRememberUpdatedState);
                            inspectorInfo2.getProperties().set("pressOffset", mutableState2);
                            inspectorInfo2.getProperties().set("enabled", Boolean.valueOf(z2));
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                Modifier modifierComposed = ComposedModifierKt.composed(companion2, noInspectorInfo, new o0o0Oo(z2, o0o00o1, mutableInteractionSource, fM3743getMaxWidthimpl, z, mutableState2, mutableState, stateRememberUpdatedState));
                Orientation orientation = Orientation.Horizontal;
                boolean zBooleanValue = ((Boolean) o0o00o1.f39175OooO0O0.getValue()).booleanValue();
                boolean z4 = this.f39076OooO0oo;
                MutableInteractionSource mutableInteractionSource2 = this.f39075OooO0oO;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer2.changed(stateRememberUpdatedState);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new oo0oOO0(stateRememberUpdatedState, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                Modifier modifierDraggable = DraggableKt.draggable(companion2, o0o00o1, orientation, (252 & 4) != 0 ? true : z4, (252 & 8) != 0 ? null : mutableInteractionSource2, (252 & 16) != 0 ? false : zBooleanValue, (252 & 32) != 0 ? new DraggableKt.C06261(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : (Function3) objRememberedValue4, (252 & 128) != 0 ? false : z);
                float fCoerceIn = RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                float fFloatValue = closedFloatingPointRange.getStart().floatValue();
                float fFloatValue2 = closedFloatingPointRange.getEndInclusive().floatValue() - fFloatValue;
                int i3 = i >> 6;
                o00OO0O0.OooO0o0(this.f39076OooO0oo, RangesKt.coerceIn((fFloatValue2 > 0.0f ? 1 : (fFloatValue2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (fCoerceIn - fFloatValue) / fFloatValue2, 0.0f, 1.0f), this.f39071OooO, this.f39077OooOO0, floatRef.element - floatRef2.element, this.f39075OooO0oO, modifierComposed.then(modifierDraggable), this.f39078OooOO0O, composer2, (i2 & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE | ((i >> 15) & 7168) | (458752 & i3) | (i3 & 29360128));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f39081OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f39082OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f39083OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Float, Unit> f39084OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f39085OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f39086OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f39087OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f39088OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ o00Oo00 f39089OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f39090OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f39091OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f39092OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(float f, Function1<? super Float, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, o00Oo00 o00oo00, o00OOOOo o00ooooo2, int i2, int i3) {
            super(2);
            this.f39082OooO0Oo = f;
            this.f39084OooO0o0 = function1;
            this.f39083OooO0o = modifier;
            this.f39085OooO0oO = z;
            this.f39086OooO0oo = closedFloatingPointRange;
            this.f39081OooO = i;
            this.f39087OooOO0 = function0;
            this.f39088OooOO0O = mutableInteractionSource;
            this.f39089OooOO0o = o00oo00;
            this.f39091OooOOO0 = o00ooooo2;
            this.f39090OooOOO = i2;
            this.f39092OooOOOO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00OO0O0.OooO00o(this.f39082OooO0Oo, this.f39084OooO0o0, this.f39083OooO0o, this.f39085OooO0oO, this.f39086OooO0oo, this.f39081OooO, this.f39087OooOO0, this.f39088OooOO0O, this.f39089OooOO0o, this.f39091OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39090OooOOO | 1), this.f39092OooOOOO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.code.android.uikit.slider.core.CustomSliderKt$SliderThumb$1$1$1", f = "CustomSlider.kt", i = {}, l = {740}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f39093OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f39094OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f39095OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f39096OooO0oO;

        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f39097OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f39098OooO0o0;

            public OooO00o(MutableState mutableState, SnapshotStateList snapshotStateList) {
                this.f39097OooO0Oo = snapshotStateList;
                this.f39098OooO0o0 = mutableState;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Interaction interaction = (Interaction) obj;
                boolean z = interaction instanceof PressInteraction.Press;
                SnapshotStateList<Interaction> snapshotStateList = this.f39097OooO0Oo;
                MutableState<Boolean> mutableState = this.f39098OooO0o0;
                if (z) {
                    o00OO0O0.OooO0o(mutableState, true);
                    snapshotStateList.add(interaction);
                } else if (interaction instanceof PressInteraction.Release) {
                    o00OO0O0.OooO0o(mutableState, false);
                    snapshotStateList.remove(((PressInteraction.Release) interaction).getPress());
                } else if (interaction instanceof PressInteraction.Cancel) {
                    o00OO0O0.OooO0o(mutableState, false);
                    snapshotStateList.remove(((PressInteraction.Cancel) interaction).getPress());
                } else if (interaction instanceof DragInteraction.Start) {
                    o00OO0O0.OooO0o(mutableState, true);
                    snapshotStateList.add(interaction);
                } else if (interaction instanceof DragInteraction.Stop) {
                    o00OO0O0.OooO0o(mutableState, false);
                    snapshotStateList.remove(((DragInteraction.Stop) interaction).getStart());
                } else if (interaction instanceof DragInteraction.Cancel) {
                    o00OO0O0.OooO0o(mutableState, false);
                    snapshotStateList.remove(((DragInteraction.Cancel) interaction).getStart());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableInteractionSource mutableInteractionSource, MutableState mutableState, SnapshotStateList snapshotStateList, Continuation continuation) {
            super(2, continuation);
            this.f39095OooO0o0 = mutableInteractionSource;
            this.f39094OooO0o = snapshotStateList;
            this.f39096OooO0oO = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            SnapshotStateList<Interaction> snapshotStateList = this.f39094OooO0o;
            return new OooO0OO(this.f39095OooO0o0, this.f39096OooO0oO, snapshotStateList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f39093OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f39095OooO0o0.getInteractions();
                OooO00o oooO00o = new OooO00o(this.f39096OooO0oO, this.f39094OooO0o);
                this.f39093OooO0Oo = 1;
                if (interactions.collect(oooO00o, this) == coroutine_suspended) {
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

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f39099OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f39100OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f39101OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f39102OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f39103OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o00Oo00 f39104OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f39105OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f39106OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f39107OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope, Modifier modifier, float f, MutableInteractionSource mutableInteractionSource, o00Oo00 o00oo00, boolean z, float f2, float f3, int i) {
            super(2);
            this.f39100OooO0Oo = boxScope;
            this.f39102OooO0o0 = modifier;
            this.f39101OooO0o = f;
            this.f39103OooO0oO = mutableInteractionSource;
            this.f39104OooO0oo = o00oo00;
            this.f39099OooO = z;
            this.f39105OooOO0 = f2;
            this.f39106OooOO0O = f3;
            this.f39107OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00OO0O0.OooO0O0(this.f39100OooO0Oo, this.f39102OooO0o0, this.f39101OooO0o, this.f39103OooO0oO, this.f39104OooO0oo, this.f39099OooO, this.f39105OooOO0, this.f39106OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39107OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ List<Float> f39108OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f39109OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f39110OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00Oo00 f39111OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f39112OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f39113OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f39114OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f39115OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f39116OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f39117OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Modifier modifier, o00Oo00 o00oo00, boolean z, float f, float f2, List<Float> list, float f3, float f4, boolean z2, int i) {
            super(2);
            this.f39109OooO0Oo = modifier;
            this.f39111OooO0o0 = o00oo00;
            this.f39110OooO0o = z;
            this.f39112OooO0oO = f;
            this.f39113OooO0oo = f2;
            this.f39108OooO = list;
            this.f39114OooOO0 = f3;
            this.f39115OooOO0O = f4;
            this.f39116OooOO0o = z2;
            this.f39117OooOOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00OO0O0.OooO0OO(this.f39109OooO0Oo, this.f39111OooO0o0, this.f39110OooO0o, this.f39112OooO0oO, this.f39113OooO0oo, this.f39108OooO, this.f39114OooOO0, this.f39115OooOO0O, this.f39116OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39117OooOOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        Dp.m3775constructorimpl(24);
        f39058OooO00o = Dp.m3775constructorimpl(1);
        f39059OooO0O0 = Dp.m3775constructorimpl(6);
        f39060OooO0OO = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:130:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01be  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01da  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:154:0x0205  */
    /* JADX WARN: Code duplicated, block: B:157:0x020b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0217  */
    /* JADX WARN: Code duplicated, block: B:162:0x0231  */
    /* JADX WARN: Code duplicated, block: B:164:0x023c  */
    /* JADX WARN: Code duplicated, block: B:165:0x023e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0241  */
    /* JADX WARN: Code duplicated, block: B:169:0x025d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0265 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0267  */
    /* JADX WARN: Code duplicated, block: B:173:0x026d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0277 A[LOOP:0: B:174:0x0275->B:175:0x0277, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x033b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0355  */
    /* JADX WARN: Code duplicated, block: B:186:0x0368  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(float f, @NotNull Function1<? super Float, Unit> onValueChange, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, @Nullable Function0<Unit> function0, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable o00Oo00 o00oo00, @Nullable o00OOOOo o00ooooo2, @Nullable Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0<Unit> function1;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        boolean z2;
        int i14;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        o00Oo00 o00oo00OooO00o;
        o00OOOOo o00ooooo3;
        MutableInteractionSource mutableInteractionSource3;
        o00Oo00 o00oo01;
        o00OOOOo o00ooooo4;
        Function0<Unit> function2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        boolean z3;
        int i16;
        int i17;
        Object objRememberedValue;
        boolean z4;
        boolean zChanged;
        Object objRememberedValue2;
        int i18;
        ArrayList arrayList;
        int i19;
        Object obj;
        boolean z5;
        Function0<Unit> function3;
        o00Oo00 o00oo02;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        o00OOOOo o00ooooo5;
        int i20;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1769461487);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i21 = i3 & 4;
        if (i21 == 0) {
            if ((i2 & 896) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        int i22 = composerStartRestartGroup.changed(closedFloatingPointRange2) ? 16384 : 8192;
                        i4 |= i22;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i4 |= i22;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        i8 = i;
                        if (composerStartRestartGroup.changed(i8)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                        function1 = function0;
                    } else {
                        function1 = function0;
                        if ((i2 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i13 = 8388608;
                        } else {
                            i13 = Configuration.BLOCK_SIZE;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 1879048192) != 0) {
                        i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                    }
                    if ((i4 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                i14 = i4 & (-57345);
                                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            } else {
                                i14 = i4;
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i15 = 0;
                            } else {
                                i15 = i;
                            }
                            if (i10 != 0) {
                                function1 = null;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                                i14 &= -234881025;
                            } else {
                                o00oo00OooO00o = o00oo00;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                                i14 &= -1879048193;
                            } else {
                                o00ooooo3 = o00ooooo2;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            o00oo01 = o00oo00OooO00o;
                            o00ooooo4 = o00ooooo3;
                            function2 = function1;
                            closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                            z3 = z2;
                            i16 = i14;
                            i17 = i15;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i4 &= -1879048193;
                            }
                            modifier2 = modifier;
                            i17 = i;
                            mutableInteractionSource3 = mutableInteractionSource;
                            o00oo01 = o00oo00;
                            i16 = i4;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            function2 = function1;
                            z3 = z;
                            o00ooooo4 = o00ooooo2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                        }
                        if (i17 >= 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                        Object objValueOf = Integer.valueOf(i17);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(objValueOf);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            if (i17 == 0) {
                                arrayList = CollectionsKt.emptyList();
                            } else {
                                i18 = i17 + 2;
                                arrayList = new ArrayList(i18);
                                for (i19 = 0; i19 < i18; i19++) {
                                    arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                                }
                            }
                            composerStartRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                        }
                        obj = objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        float f2 = 2;
                        o00OOOOo o00ooooo6 = o00ooooo4;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        int i23 = i17;
                        ClosedFloatingPointRange<Float> closedFloatingPointRange5 = closedFloatingPointRange3;
                        boolean z6 = z3;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f2), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo6, stateRememberUpdatedState, function2)), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z6;
                        function3 = function2;
                        o00oo02 = o00oo01;
                        mutableInteractionSource4 = mutableInteractionSource5;
                        modifier3 = modifier2;
                        o00ooooo5 = o00ooooo6;
                        i20 = i23;
                        closedFloatingPointRange4 = closedFloatingPointRange5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z5 = z;
                        o00oo02 = o00oo00;
                        closedFloatingPointRange4 = closedFloatingPointRange2;
                        i20 = i8;
                        function3 = function1;
                        mutableInteractionSource4 = mutableInteractionSource;
                        o00ooooo5 = o00ooooo2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
                }
                i4 |= 196608;
                i8 = i;
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                    }
                    if (i17 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                    Object objValueOf2 = Integer.valueOf(i17);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(objValueOf2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    } else {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    obj = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f3 = 2;
                    o00OOOOo o00ooooo7 = o00ooooo4;
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                    int i24 = i17;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange6 = closedFloatingPointRange3;
                    boolean z7 = z3;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f3), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f3), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo7, stateRememberUpdatedState2, function2)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z7;
                    function3 = function2;
                    o00oo02 = o00oo01;
                    mutableInteractionSource4 = mutableInteractionSource6;
                    modifier3 = modifier2;
                    o00ooooo5 = o00ooooo7;
                    i20 = i24;
                    closedFloatingPointRange4 = closedFloatingPointRange6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                    }
                    if (i17 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                    Object objValueOf3 = Integer.valueOf(i17);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(objValueOf3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    } else {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    obj = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f4 = 2;
                    o00OOOOo o00ooooo8 = o00ooooo4;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                    int i25 = i17;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange7 = closedFloatingPointRange3;
                    boolean z8 = z3;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f4), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f4), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo8, stateRememberUpdatedState3, function2)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z8;
                    function3 = function2;
                    o00oo02 = o00oo01;
                    mutableInteractionSource4 = mutableInteractionSource7;
                    modifier3 = modifier2;
                    o00ooooo5 = o00ooooo8;
                    i20 = i25;
                    closedFloatingPointRange4 = closedFloatingPointRange7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
            }
            i4 |= 3072;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i4 |= i22;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i4 |= i22;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                    }
                    if (i17 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                    Object objValueOf4 = Integer.valueOf(i17);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(objValueOf4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    } else {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    obj = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f5 = 2;
                    o00OOOOo o00ooooo9 = o00ooooo4;
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource3;
                    int i26 = i17;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange8 = closedFloatingPointRange3;
                    boolean z9 = z3;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f5), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f5), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo9, stateRememberUpdatedState4, function2)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z9;
                    function3 = function2;
                    o00oo02 = o00oo01;
                    mutableInteractionSource4 = mutableInteractionSource8;
                    modifier3 = modifier2;
                    o00ooooo5 = o00ooooo9;
                    i20 = i26;
                    closedFloatingPointRange4 = closedFloatingPointRange8;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                    }
                    if (i17 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                    Object objValueOf5 = Integer.valueOf(i17);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(objValueOf5);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    } else {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    obj = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f6 = 2;
                    o00OOOOo o00ooooo10 = o00ooooo4;
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource3;
                    int i27 = i17;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange9 = closedFloatingPointRange3;
                    boolean z10 = z3;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f6), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f6), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo10, stateRememberUpdatedState5, function2)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z10;
                    function3 = function2;
                    o00oo02 = o00oo01;
                    mutableInteractionSource4 = mutableInteractionSource9;
                    modifier3 = modifier2;
                    o00ooooo5 = o00ooooo10;
                    i20 = i27;
                    closedFloatingPointRange4 = closedFloatingPointRange9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                }
                if (i17 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                Object objValueOf6 = Integer.valueOf(i17);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(objValueOf6);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                } else {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                float f7 = 2;
                o00OOOOo o00ooooo11 = o00ooooo4;
                MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource3;
                int i28 = i17;
                ClosedFloatingPointRange<Float> closedFloatingPointRange10 = closedFloatingPointRange3;
                boolean z11 = z3;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f7), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f7), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo11, stateRememberUpdatedState6, function2)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z11;
                function3 = function2;
                o00oo02 = o00oo01;
                mutableInteractionSource4 = mutableInteractionSource10;
                modifier3 = modifier2;
                o00ooooo5 = o00ooooo11;
                i20 = i28;
                closedFloatingPointRange4 = closedFloatingPointRange10;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                }
                if (i17 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                Object objValueOf7 = Integer.valueOf(i17);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(objValueOf7);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                } else {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                float f8 = 2;
                o00OOOOo o00ooooo12 = o00ooooo4;
                MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource3;
                int i29 = i17;
                ClosedFloatingPointRange<Float> closedFloatingPointRange11 = closedFloatingPointRange3;
                boolean z12 = z3;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f8), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f8), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo12, stateRememberUpdatedState7, function2)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z12;
                function3 = function2;
                o00oo02 = o00oo01;
                mutableInteractionSource4 = mutableInteractionSource11;
                modifier3 = modifier2;
                o00ooooo5 = o00ooooo12;
                i20 = i29;
                closedFloatingPointRange4 = closedFloatingPointRange11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
        }
        i4 |= 384;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i4 |= i22;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i4 |= i22;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                    }
                    if (i17 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                    Object objValueOf8 = Integer.valueOf(i17);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(objValueOf8);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    } else {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    obj = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f9 = 2;
                    o00OOOOo o00ooooo13 = o00ooooo4;
                    MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource3;
                    int i210 = i17;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange12 = closedFloatingPointRange3;
                    boolean z13 = z3;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f9), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f9), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo13, stateRememberUpdatedState8, function2)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z13;
                    function3 = function2;
                    o00oo02 = o00oo01;
                    mutableInteractionSource4 = mutableInteractionSource12;
                    modifier3 = modifier2;
                    o00ooooo5 = o00ooooo13;
                    i20 = i210;
                    closedFloatingPointRange4 = closedFloatingPointRange12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            i14 = i4 & (-57345);
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        } else {
                            i14 = i4;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i15 = 0;
                        } else {
                            i15 = i;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            o00oo00OooO00o = o00oo00;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                            i14 &= -1879048193;
                        } else {
                            o00ooooo3 = o00ooooo2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        o00oo01 = o00oo00OooO00o;
                        o00ooooo4 = o00ooooo3;
                        function2 = function1;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        z3 = z2;
                        i16 = i14;
                        i17 = i15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                    }
                    if (i17 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                    Object objValueOf9 = Integer.valueOf(i17);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(objValueOf9);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    } else {
                        if (i17 == 0) {
                            arrayList = CollectionsKt.emptyList();
                        } else {
                            i18 = i17 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    obj = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f10 = 2;
                    o00OOOOo o00ooooo14 = o00ooooo4;
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource3;
                    int i211 = i17;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange13 = closedFloatingPointRange3;
                    boolean z14 = z3;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f10), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f10), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo14, stateRememberUpdatedState9, function2)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z14;
                    function3 = function2;
                    o00oo02 = o00oo01;
                    mutableInteractionSource4 = mutableInteractionSource13;
                    modifier3 = modifier2;
                    o00ooooo5 = o00ooooo14;
                    i20 = i211;
                    closedFloatingPointRange4 = closedFloatingPointRange13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                }
                if (i17 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                Object objValueOf10 = Integer.valueOf(i17);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(objValueOf10);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                } else {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                float f11 = 2;
                o00OOOOo o00ooooo15 = o00ooooo4;
                MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource3;
                int i212 = i17;
                ClosedFloatingPointRange<Float> closedFloatingPointRange14 = closedFloatingPointRange3;
                boolean z15 = z3;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f11), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f11), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo15, stateRememberUpdatedState10, function2)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z15;
                function3 = function2;
                o00oo02 = o00oo01;
                mutableInteractionSource4 = mutableInteractionSource14;
                modifier3 = modifier2;
                o00ooooo5 = o00ooooo15;
                i20 = i212;
                closedFloatingPointRange4 = closedFloatingPointRange14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                }
                if (i17 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                Object objValueOf11 = Integer.valueOf(i17);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(objValueOf11);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                } else {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                float f12 = 2;
                o00OOOOo o00ooooo16 = o00ooooo4;
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource3;
                int i213 = i17;
                ClosedFloatingPointRange<Float> closedFloatingPointRange15 = closedFloatingPointRange3;
                boolean z16 = z3;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f12), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f12), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo16, stateRememberUpdatedState11, function2)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z16;
                function3 = function2;
                o00oo02 = o00oo01;
                mutableInteractionSource4 = mutableInteractionSource15;
                modifier3 = modifier2;
                o00ooooo5 = o00ooooo16;
                i20 = i213;
                closedFloatingPointRange4 = closedFloatingPointRange15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
        }
        i4 |= 3072;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                closedFloatingPointRange2 = closedFloatingPointRange;
                if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                }
                i4 |= i22;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i4 |= i22;
        } else {
            closedFloatingPointRange2 = closedFloatingPointRange;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                i8 = i;
                if (composerStartRestartGroup.changed(i8)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                }
                if (i17 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                Object objValueOf12 = Integer.valueOf(i17);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(objValueOf12);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                } else {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                float f13 = 2;
                o00OOOOo o00ooooo17 = o00ooooo4;
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource3;
                int i214 = i17;
                ClosedFloatingPointRange<Float> closedFloatingPointRange16 = closedFloatingPointRange3;
                boolean z17 = z3;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f13), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f13), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo17, stateRememberUpdatedState12, function2)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z17;
                function3 = function2;
                o00oo02 = o00oo01;
                mutableInteractionSource4 = mutableInteractionSource16;
                modifier3 = modifier2;
                o00ooooo5 = o00ooooo17;
                i20 = i214;
                closedFloatingPointRange4 = closedFloatingPointRange16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        i14 = i4 & (-57345);
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    } else {
                        i14 = i4;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        o00oo00OooO00o = o00oo00;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                        i14 &= -1879048193;
                    } else {
                        o00ooooo3 = o00ooooo2;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    o00oo01 = o00oo00OooO00o;
                    o00ooooo4 = o00ooooo3;
                    function2 = function1;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    z3 = z2;
                    i16 = i14;
                    i17 = i15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
                }
                if (i17 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
                Object objValueOf13 = Integer.valueOf(i17);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(objValueOf13);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                } else {
                    if (i17 == 0) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        i18 = i17 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                float f14 = 2;
                o00OOOOo o00ooooo18 = o00ooooo4;
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource3;
                int i215 = i17;
                ClosedFloatingPointRange<Float> closedFloatingPointRange17 = closedFloatingPointRange3;
                boolean z18 = z3;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f14), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f14), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo18, stateRememberUpdatedState13, function2)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z18;
                function3 = function2;
                o00oo02 = o00oo01;
                mutableInteractionSource4 = mutableInteractionSource17;
                modifier3 = modifier2;
                o00ooooo5 = o00ooooo18;
                i20 = i215;
                closedFloatingPointRange4 = closedFloatingPointRange17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
        }
        i4 |= 196608;
        i8 = i;
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i13 = 8388608;
            } else {
                i13 = Configuration.BLOCK_SIZE;
            }
            i4 |= i13;
        }
        if ((i2 & 234881024) != 0) {
            i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(o00oo00)) ? 33554432 : 67108864;
        }
        if ((i2 & 1879048192) != 0) {
            i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(o00ooooo2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
        }
        if ((i4 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    i14 = i4 & (-57345);
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                } else {
                    i14 = i4;
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i15 = 0;
                } else {
                    i15 = i;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                    i14 &= -234881025;
                } else {
                    o00oo00OooO00o = o00oo00;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                    i14 &= -1879048193;
                } else {
                    o00ooooo3 = o00ooooo2;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                o00oo01 = o00oo00OooO00o;
                o00ooooo4 = o00ooooo3;
                function2 = function1;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                z3 = z2;
                i16 = i14;
                i17 = i15;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    i14 = i4 & (-57345);
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                } else {
                    i14 = i4;
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i15 = 0;
                } else {
                    i15 = i;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                    i14 &= -234881025;
                } else {
                    o00oo00OooO00o = o00oo00;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                    i14 &= -1879048193;
                } else {
                    o00ooooo3 = o00ooooo2;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                o00oo01 = o00oo00OooO00o;
                o00ooooo4 = o00ooooo3;
                function2 = function1;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                z3 = z2;
                i16 = i14;
                i17 = i15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
            }
            if (i17 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
            Object objValueOf14 = Integer.valueOf(i17);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(objValueOf14);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                if (i17 == 0) {
                    arrayList = CollectionsKt.emptyList();
                } else {
                    i18 = i17 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                if (i17 == 0) {
                    arrayList = CollectionsKt.emptyList();
                } else {
                    i18 = i17 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            float f15 = 2;
            o00OOOOo o00ooooo19 = o00ooooo4;
            MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource3;
            int i216 = i17;
            ClosedFloatingPointRange<Float> closedFloatingPointRange18 = closedFloatingPointRange3;
            boolean z19 = z3;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f15), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f15), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo19, stateRememberUpdatedState14, function2)), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z19;
            function3 = function2;
            o00oo02 = o00oo01;
            mutableInteractionSource4 = mutableInteractionSource18;
            modifier3 = modifier2;
            o00ooooo5 = o00ooooo19;
            i20 = i216;
            closedFloatingPointRange4 = closedFloatingPointRange18;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    i14 = i4 & (-57345);
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                } else {
                    i14 = i4;
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i15 = 0;
                } else {
                    i15 = i;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                    i14 &= -234881025;
                } else {
                    o00oo00OooO00o = o00oo00;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                    i14 &= -1879048193;
                } else {
                    o00ooooo3 = o00ooooo2;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                o00oo01 = o00oo00OooO00o;
                o00ooooo4 = o00ooooo3;
                function2 = function1;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                z3 = z2;
                i16 = i14;
                i17 = i15;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    i14 = i4 & (-57345);
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                } else {
                    i14 = i4;
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i15 = 0;
                } else {
                    i15 = i;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    o00oo00OooO00o = o0oOO.OooO00o(0L, 0L, 0L, composerStartRestartGroup, 6, 1023);
                    i14 &= -234881025;
                } else {
                    o00oo00OooO00o = o00oo00;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    o00ooooo3 = new o00OOOOo(0.0f, null, null, 255);
                    i14 &= -1879048193;
                } else {
                    o00ooooo3 = o00ooooo2;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                o00oo01 = o00oo00OooO00o;
                o00ooooo4 = o00ooooo3;
                function2 = function1;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                z3 = z2;
                i16 = i14;
                i17 = i15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1769461487, i16, -1, "com.code.android.uikit.slider.core.CustomSlider (CustomSlider.kt:161)");
            }
            if (i17 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i16 >> 3) & 14);
            Object objValueOf15 = Integer.valueOf(i17);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(objValueOf15);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                if (i17 == 0) {
                    arrayList = CollectionsKt.emptyList();
                } else {
                    i18 = i17 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                if (i17 == 0) {
                    arrayList = CollectionsKt.emptyList();
                } else {
                    i18 = i17 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i17 + 1)));
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            float f16 = 2;
            o00OOOOo o00ooooo110 = o00ooooo4;
            MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource3;
            int i217 = i17;
            ClosedFloatingPointRange<Float> closedFloatingPointRange19 = closedFloatingPointRange3;
            boolean z110 = z3;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.m521requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f16), Dp.m3775constructorimpl(o00ooooo4.f39166OooO00o * f16), 0.0f, 0.0f, 12, null), false, new o00OOO00(z3, closedFloatingPointRange3, i17, RangesKt.coerceIn(f, closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue()), onValueChange, function2), 1, null), f, closedFloatingPointRange3, i17), z3, mutableInteractionSource3), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1301204583, true, new OooO00o(closedFloatingPointRange3, i16, f, mutableInteractionSource3, z3, (List) obj, o00oo01, o00ooooo110, stateRememberUpdatedState15, function2)), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z110;
            function3 = function2;
            o00oo02 = o00oo01;
            mutableInteractionSource4 = mutableInteractionSource19;
            modifier3 = modifier2;
            o00ooooo5 = o00ooooo110;
            i20 = i217;
            closedFloatingPointRange4 = closedFloatingPointRange19;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, onValueChange, modifier3, z5, closedFloatingPointRange4, i20, function3, mutableInteractionSource4, o00oo02, o00ooooo5, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(BoxScope boxScope, Modifier modifier, float f, MutableInteractionSource mutableInteractionSource, o00Oo00 o00oo00, boolean z, float f2, float f3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1214473622);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(o00oo00) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? 8388608 : Configuration.BLOCK_SIZE;
        }
        if ((23967451 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1214473622, i2, -1, "com.code.android.uikit.slider.core.SliderThumb (CustomSlider.kt:729)");
            }
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM482paddingqDBjuR0$default, companion.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue2;
            int i3 = i2 >> 9;
            int i4 = i3 & 14;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(mutableInteractionSource) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new OooO0OO(mutableInteractionSource, mutableState, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i4 | 64);
            float fM3775constructorimpl = snapshotStateList.isEmpty() ^ true ? f39059OooO0O0 : f39058OooO00o;
            Modifier modifierHoverable$default = HoverableKt.hoverable$default(ScaleKt.scale(SizeKt.m527sizeVpY3zN4(modifier, f2, f2), ((Boolean) mutableState.getValue()).booleanValue() ? f3 / f2 : 1.0f), mutableInteractionSource, false, 2, null);
            if (!z) {
                fM3775constructorimpl = Dp.m3775constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m170backgroundbw27NRU(ShadowKt.m1359shadows4CzXII$default(modifierHoverable$default, fM3775constructorimpl, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), o00oo00.thumbColor(z, composerStartRestartGroup, ((i2 >> 15) & 14) | (i3 & 112)).getValue().m1691unboximpl(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(boxScope, modifier, f, mutableInteractionSource, o00oo00, z, f2, f3, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Modifier modifier, o00Oo00 o00oo00, boolean z, float f, float f2, List<Float> list, float f3, float f4, boolean z2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-709327292);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-709327292, i, -1, "com.code.android.uikit.slider.core.Track (CustomSlider.kt:804)");
        }
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        CanvasKt.Canvas(modifier, new OooO(f3, o00oo00.trackColor(z, false, composerStartRestartGroup, i2), f4, f2, f, o00oo00.trackColor(z, true, composerStartRestartGroup, i2), z2, list, o00oo00.tickColor(z, false, composerStartRestartGroup, i2), o00oo00.tickColor(z, true, composerStartRestartGroup, i2)), composerStartRestartGroup, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(modifier, o00oo00, z, f, f2, list, f3, f4, z2, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00cc: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void OooO0Oo(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00cc: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public static final void OooO0o(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OooO0o0(boolean z, float f, List list, o00Oo00 o00oo00, float f2, MutableInteractionSource mutableInteractionSource, Modifier modifier, o00OOOOo o00ooooo2, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2095484453);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2095484453, i, -1, "com.code.android.uikit.slider.core.SliderImpl (CustomSlider.kt:599)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierThen = modifier.then(SizeKt.m513heightInVpY3zN4$default(SizeKt.m532widthInVpY3zN4$default(companion, o00ooooo2.f39171OooO0o0, 0.0f, 2, null), 0.0f, o00ooooo2.f39169OooO0Oo, 1, null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo326toPx0680j_4 = density.mo326toPx0680j_4(o00ooooo2.f39168OooO0OO);
        float f3 = o00ooooo2.f39166OooO00o;
        float fMo326toPx0680j_5 = density.mo326toPx0680j_4(f3);
        float fMo322toDpu2uoSUM = density.mo322toDpu2uoSUM(f2);
        float f4 = 2;
        float fM3775constructorimpl = Dp.m3775constructorimpl(f3 * f4);
        float fM3775constructorimpl2 = Dp.m3775constructorimpl(o00ooooo2.f39167OooO0O0 * f4);
        float fM3775constructorimpl3 = Dp.m3775constructorimpl(fMo322toDpu2uoSUM * f);
        int i2 = i >> 6;
        OooO0OO(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, 3, null), o00oo00, z, 0.0f, f, list, fMo326toPx0680j_5, fMo326toPx0680j_4, o00ooooo2.f39170OooO0o, composerStartRestartGroup, (i2 & 112) | 265216 | ((i << 6) & 896) | ((i << 9) & 57344));
        composerStartRestartGroup.startReplaceableGroup(1291321642);
        Function6<BoxScope, Dp, Float, Float, Composer, Integer, Unit> function6 = o00ooooo2.f39173OooO0oo;
        if (function6 != null) {
            function6.invoke(boxScopeInstance, Dp.m3773boximpl(fM3775constructorimpl3), Float.valueOf(f), Float.valueOf(fMo326toPx0680j_5), composerStartRestartGroup, Integer.valueOf(((i << 3) & 896) | 6));
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (o00ooooo2.f39172OooO0oO == null) {
            composerStartRestartGroup.startReplaceableGroup(1291321737);
            composer2 = composerStartRestartGroup;
            OooO0O0(boxScopeInstance, companion, fM3775constructorimpl3, mutableInteractionSource, o00oo00, z, fM3775constructorimpl, fM3775constructorimpl2, composer2, (i2 & 7168) | 54 | ((i << 3) & 57344) | (458752 & (i << 15)));
            composer2.endReplaceableGroup();
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(1291321859);
            o00ooooo2.f39172OooO0oO.invoke(boxScopeInstance, companion, Dp.m3773boximpl(fM3775constructorimpl3), mutableInteractionSource, o00oo00, Boolean.valueOf(z), Dp.m3773boximpl(fM3775constructorimpl), Dp.m3773boximpl(fM3775constructorimpl2), composer2, Integer.valueOf((458752 & (i << 15)) | (i2 & 7168) | 54 | ((i << 3) & 57344)));
            composer2.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00OO0OO(z, f, list, o00oo00, f2, mutableInteractionSource, modifier, o00ooooo2, i));
    }
}
