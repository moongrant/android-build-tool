package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\tH\u0002¢\u0006\u0002\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BaselinesOffsetColumn", "", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ListItem", "icon", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", ViewHierarchyConstants.TEXT_KEY, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "offset", "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,429:1\n74#2:430\n75#2,11:432\n88#2:457\n74#2:458\n75#2,11:460\n88#2:485\n76#3:431\n76#3:459\n456#4,14:443\n456#4,14:471\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n353#1:430\n353#1:432,11\n353#1:457\n395#1:458\n395#1:460,11\n395#1:485\n353#1:431\n395#1:459\n353#1:443,14\n395#1:471,14\n*E\n"})
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1631148337);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1631148337, i, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:347)");
        }
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt.BaselinesOffsetColumn.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo3measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                int height;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                long jM3724copyZbe2FdA$default = Constraints.m3724copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(measurables, 10));
                Iterator<T> it = measurables.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Measurable) it.next()).mo2794measureBRTryo0(jM3724copyZbe2FdA$default));
                }
                Iterator it2 = arrayList.iterator();
                int iMax = 0;
                while (it2.hasNext()) {
                    iMax = Math.max(iMax, ((Placeable) it2.next()).getWidth());
                }
                int size = arrayList.size();
                final Integer[] numArr = new Integer[size];
                for (int i3 = 0; i3 < size; i3++) {
                    numArr[i3] = 0;
                }
                List<Dp> list2 = list;
                int size2 = arrayList.size();
                int height2 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    Placeable placeable = (Placeable) arrayList.get(i4);
                    if (i4 > 0) {
                        int i5 = i4 - 1;
                        height = ((Placeable) arrayList.get(i5)).getHeight() - ((Placeable) arrayList.get(i5)).get(AlignmentLineKt.getLastBaseline());
                    } else {
                        height = 0;
                    }
                    int iMax2 = Math.max(0, (Layout.mo318roundToPx0680j_4(list2.get(i4).m3779unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - height);
                    numArr[i4] = Integer.valueOf(iMax2 + height2);
                    height2 += placeable.getHeight() + iMax2;
                }
                return MeasureScope.CC.OooOOo0(Layout, iMax, height2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        List<Placeable> list3 = arrayList;
                        Integer[] numArr2 = numArr;
                        int size3 = list3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            Placeable.PlacementScope.placeRelative$default(layout, list3.get(i6), 0, numArr2[i6].intValue(), 0.0f, 4, null);
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list2, i3);
            }
        };
        Density density = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier2);
        int i3 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
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
        Updater.m1316setimpl(composerM1309constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1316setimpl(composerM1309constructorimpl, density, companion.getSetDensity());
        Updater.m1316setimpl(composerM1309constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1316setimpl(composerM1309constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        androidx.compose.animation.OooOO0.OooO00o((i3 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.BaselinesOffsetColumn.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                ListItemKt.BaselinesOffsetColumn(list, modifier2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x018d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    public static final void ListItem(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @NotNull final Function2<? super Composer, ? super Integer, Unit> text, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function7;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function9;
        boolean z3;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle2;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle3;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle4;
        Modifier modifierSemantics;
        Function2<? super Composer, ? super Integer, Unit> function10;
        Function2<? super Composer, ? super Integer, Unit> function11;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function12;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-450923337);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 112) == 0) {
                function6 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function7 = function3;
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            function8 = function4;
                            if (composerStartRestartGroup.changedInstance(function8)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= 196608;
                        } else if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(text)) {
                                i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i4 != 0) {
                                function9 = null;
                            } else {
                                function9 = function7;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function8 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function13 = i10 == 0 ? function5 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                            }
                            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            TextStyle subtitle1 = typography.getSubtitle1();
                            ContentAlpha contentAlpha = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1, contentAlpha.getHigh(composerStartRestartGroup, 6), text);
                            Intrinsics.checkNotNull(function2ApplyTextStyle);
                            function2ApplyTextStyle2 = applyTextStyle(typography.getBody2(), contentAlpha.getMedium(composerStartRestartGroup, 6), function9);
                            function2ApplyTextStyle3 = applyTextStyle(typography.getOverline(), contentAlpha.getHigh(composerStartRestartGroup, 6), function8);
                            function2ApplyTextStyle4 = applyTextStyle(typography.getCaption(), contentAlpha.getHigh(composerStartRestartGroup, 6), function13);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }
                            });
                            if (function2ApplyTextStyle2 == null || function2ApplyTextStyle3 != null) {
                                function10 = function8;
                                if ((function2ApplyTextStyle3 == null || !z3) && function2ApplyTextStyle2 != null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280382);
                                    TwoLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280579);
                                function10 = function8;
                                OneLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 24576, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function11 = function13;
                            z4 = z3;
                            function12 = function10;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function11 = function5;
                            function9 = function7;
                            z4 = z2;
                            function12 = function8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier4 = modifier3;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                        final Function2<? super Composer, ? super Integer, Unit> function15 = function11;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier4, function14, function9, z4, function12, function15, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    function8 = function4;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle2 = typography2.getSubtitle1();
                        ContentAlpha contentAlpha2 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle2, contentAlpha2.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography2.getBody2(), contentAlpha2.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography2.getOverline(), contentAlpha2.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography2.getCaption(), contentAlpha2.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography3 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle3 = typography3.getSubtitle1();
                        ContentAlpha contentAlpha3 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle3, contentAlpha3.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography3.getBody2(), contentAlpha3.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography3.getOverline(), contentAlpha3.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography3.getCaption(), contentAlpha3.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier5 = modifier3;
                    final Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                    final Function2<? super Composer, ? super Integer, Unit> function17 = function11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier5, function16, function9, z4, function12, function17, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                z2 = z;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function8 = function4;
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle4 = typography4.getSubtitle1();
                        ContentAlpha contentAlpha4 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle4, contentAlpha4.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography4.getBody2(), contentAlpha4.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography4.getOverline(), contentAlpha4.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography4.getCaption(), contentAlpha4.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography5 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle5 = typography5.getSubtitle1();
                        ContentAlpha contentAlpha5 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle5, contentAlpha5.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography5.getBody2(), contentAlpha5.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography5.getOverline(), contentAlpha5.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography5.getCaption(), contentAlpha5.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = modifier3;
                    final Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                    final Function2<? super Composer, ? super Integer, Unit> function19 = function11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier6, function18, function9, z4, function12, function19, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                function8 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle6 = typography6.getSubtitle1();
                    ContentAlpha contentAlpha6 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle6, contentAlpha6.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography6.getBody2(), contentAlpha6.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography6.getOverline(), contentAlpha6.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography6.getCaption(), contentAlpha6.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography7 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle7 = typography7.getSubtitle1();
                    ContentAlpha contentAlpha7 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle7, contentAlpha7.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography7.getBody2(), contentAlpha7.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography7.getOverline(), contentAlpha7.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography7.getCaption(), contentAlpha7.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                final Function2<? super Composer, ? super Integer, Unit> function111 = function11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier7, function110, function9, z4, function12, function111, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            function7 = function3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function8 = function4;
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography8 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle8 = typography8.getSubtitle1();
                        ContentAlpha contentAlpha8 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle8, contentAlpha8.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography8.getBody2(), contentAlpha8.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography8.getOverline(), contentAlpha8.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography8.getCaption(), contentAlpha8.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography9 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle9 = typography9.getSubtitle1();
                        ContentAlpha contentAlpha9 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle9, contentAlpha9.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography9.getBody2(), contentAlpha9.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography9.getOverline(), contentAlpha9.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography9.getCaption(), contentAlpha9.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier3;
                    final Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                    final Function2<? super Composer, ? super Integer, Unit> function113 = function11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier8, function112, function9, z4, function12, function113, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                function8 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography10 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle10 = typography10.getSubtitle1();
                    ContentAlpha contentAlpha10 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle10, contentAlpha10.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography10.getBody2(), contentAlpha10.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography10.getOverline(), contentAlpha10.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography10.getCaption(), contentAlpha10.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography11 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle11 = typography11.getSubtitle1();
                    ContentAlpha contentAlpha11 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11, contentAlpha11.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography11.getBody2(), contentAlpha11.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography11.getOverline(), contentAlpha11.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography11.getCaption(), contentAlpha11.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier9 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                final Function2<? super Composer, ? super Integer, Unit> function115 = function11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier9, function114, function9, z4, function12, function115, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function8 = function4;
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography12 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle12 = typography12.getSubtitle1();
                    ContentAlpha contentAlpha12 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle12, contentAlpha12.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography12.getBody2(), contentAlpha12.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography12.getOverline(), contentAlpha12.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography12.getCaption(), contentAlpha12.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography13 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle13 = typography13.getSubtitle1();
                    ContentAlpha contentAlpha13 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle13, contentAlpha13.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography13.getBody2(), contentAlpha13.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography13.getOverline(), contentAlpha13.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography13.getCaption(), contentAlpha13.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier10 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                final Function2<? super Composer, ? super Integer, Unit> function117 = function11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier10, function116, function9, z4, function12, function117, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function8 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography14 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle14 = typography14.getSubtitle1();
                ContentAlpha contentAlpha14 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle14, contentAlpha14.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography14.getBody2(), contentAlpha14.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography14.getOverline(), contentAlpha14.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography14.getCaption(), contentAlpha14.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography15 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle15 = typography15.getSubtitle1();
                ContentAlpha contentAlpha15 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle15, contentAlpha15.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography15.getBody2(), contentAlpha15.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography15.getOverline(), contentAlpha15.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography15.getCaption(), contentAlpha15.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function118 = function6;
            final Function2<? super Composer, ? super Integer, Unit> function119 = function11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier11, function118, function9, z4, function12, function119, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        function6 = function2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function7 = function3;
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function8 = function4;
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography16 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle16 = typography16.getSubtitle1();
                        ContentAlpha contentAlpha16 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle16, contentAlpha16.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography16.getBody2(), contentAlpha16.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography16.getOverline(), contentAlpha16.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography16.getCaption(), contentAlpha16.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i4 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function8 = null;
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography17 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle17 = typography17.getSubtitle1();
                        ContentAlpha contentAlpha17 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle17, contentAlpha17.getHigh(composerStartRestartGroup, 6), text);
                        Intrinsics.checkNotNull(function2ApplyTextStyle);
                        function2ApplyTextStyle2 = applyTextStyle(typography17.getBody2(), contentAlpha17.getMedium(composerStartRestartGroup, 6), function9);
                        function2ApplyTextStyle3 = applyTextStyle(typography17.getOverline(), contentAlpha17.getHigh(composerStartRestartGroup, 6), function8);
                        function2ApplyTextStyle4 = applyTextStyle(typography17.getCaption(), contentAlpha17.getHigh(composerStartRestartGroup, 6), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z4 = z3;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier12 = modifier3;
                    final Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                    final Function2<? super Composer, ? super Integer, Unit> function1111 = function11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier12, function1110, function9, z4, function12, function1111, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                function8 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography18 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle18 = typography18.getSubtitle1();
                    ContentAlpha contentAlpha18 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle18, contentAlpha18.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography18.getBody2(), contentAlpha18.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography18.getOverline(), contentAlpha18.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography18.getCaption(), contentAlpha18.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography19 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle19 = typography19.getSubtitle1();
                    ContentAlpha contentAlpha19 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle19, contentAlpha19.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography19.getBody2(), contentAlpha19.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography19.getOverline(), contentAlpha19.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography19.getCaption(), contentAlpha19.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier13 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function1112 = function6;
                final Function2<? super Composer, ? super Integer, Unit> function1113 = function11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier13, function1112, function9, z4, function12, function1113, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function8 = function4;
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle110 = typography110.getSubtitle1();
                    ContentAlpha contentAlpha110 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle110, contentAlpha110.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography110.getBody2(), contentAlpha110.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography110.getOverline(), contentAlpha110.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography110.getCaption(), contentAlpha110.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle111 = typography111.getSubtitle1();
                    ContentAlpha contentAlpha111 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111, contentAlpha111.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography111.getBody2(), contentAlpha111.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography111.getOverline(), contentAlpha111.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography111.getCaption(), contentAlpha111.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                final Function2<? super Composer, ? super Integer, Unit> function1115 = function11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier14, function1114, function9, z4, function12, function1115, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function8 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle112 = typography112.getSubtitle1();
                ContentAlpha contentAlpha112 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle112, contentAlpha112.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography112.getBody2(), contentAlpha112.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography112.getOverline(), contentAlpha112.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography112.getCaption(), contentAlpha112.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle113 = typography113.getSubtitle1();
                ContentAlpha contentAlpha113 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle113, contentAlpha113.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography113.getBody2(), contentAlpha113.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography113.getOverline(), contentAlpha113.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography113.getCaption(), contentAlpha113.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier15 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
            final Function2<? super Composer, ? super Integer, Unit> function1117 = function11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier15, function1116, function9, z4, function12, function1117, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        function7 = function3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function8 = function4;
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle114 = typography114.getSubtitle1();
                    ContentAlpha contentAlpha114 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle114, contentAlpha114.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography114.getBody2(), contentAlpha114.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography114.getOverline(), contentAlpha114.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography114.getCaption(), contentAlpha114.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i4 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function8 = null;
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle115 = typography115.getSubtitle1();
                    ContentAlpha contentAlpha115 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle115, contentAlpha115.getHigh(composerStartRestartGroup, 6), text);
                    Intrinsics.checkNotNull(function2ApplyTextStyle);
                    function2ApplyTextStyle2 = applyTextStyle(typography115.getBody2(), contentAlpha115.getMedium(composerStartRestartGroup, 6), function9);
                    function2ApplyTextStyle3 = applyTextStyle(typography115.getOverline(), contentAlpha115.getHigh(composerStartRestartGroup, 6), function8);
                    function2ApplyTextStyle4 = applyTextStyle(typography115.getCaption(), contentAlpha115.getHigh(composerStartRestartGroup, 6), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z4 = z3;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier16 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function1118 = function6;
                final Function2<? super Composer, ? super Integer, Unit> function1119 = function11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier16, function1118, function9, z4, function12, function1119, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function8 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle116 = typography116.getSubtitle1();
                ContentAlpha contentAlpha116 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle116, contentAlpha116.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography116.getBody2(), contentAlpha116.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography116.getOverline(), contentAlpha116.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography116.getCaption(), contentAlpha116.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle117 = typography117.getSubtitle1();
                ContentAlpha contentAlpha117 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle117, contentAlpha117.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography117.getBody2(), contentAlpha117.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography117.getOverline(), contentAlpha117.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography117.getCaption(), contentAlpha117.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier17 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function11110 = function6;
            final Function2<? super Composer, ? super Integer, Unit> function11111 = function11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier17, function11110, function9, z4, function12, function11111, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                function8 = function4;
                if (composerStartRestartGroup.changedInstance(function8)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle118 = typography118.getSubtitle1();
                ContentAlpha contentAlpha118 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle118, contentAlpha118.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography118.getBody2(), contentAlpha118.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography118.getOverline(), contentAlpha118.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography118.getCaption(), contentAlpha118.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i4 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function8 = null;
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle119 = typography119.getSubtitle1();
                ContentAlpha contentAlpha119 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle119, contentAlpha119.getHigh(composerStartRestartGroup, 6), text);
                Intrinsics.checkNotNull(function2ApplyTextStyle);
                function2ApplyTextStyle2 = applyTextStyle(typography119.getBody2(), contentAlpha119.getMedium(composerStartRestartGroup, 6), function9);
                function2ApplyTextStyle3 = applyTextStyle(typography119.getOverline(), contentAlpha119.getHigh(composerStartRestartGroup, 6), function8);
                function2ApplyTextStyle4 = applyTextStyle(typography119.getCaption(), contentAlpha119.getHigh(composerStartRestartGroup, 6), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z4 = z3;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier18 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function11112 = function6;
            final Function2<? super Composer, ? super Integer, Unit> function11113 = function11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier18, function11112, function9, z4, function12, function11113, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        function8 = function4;
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(text)) {
                i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        if ((i3 & 2995931) == 599186) {
            if (i13 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i14 != 0) {
                function6 = null;
            }
            if (i4 != 0) {
                function9 = null;
            } else {
                function9 = function7;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i8 != 0) {
                function8 = null;
            }
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
            }
            Typography typography1110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1110 = typography1110.getSubtitle1();
            ContentAlpha contentAlpha1110 = ContentAlpha.INSTANCE;
            function2ApplyTextStyle = applyTextStyle(subtitle1110, contentAlpha1110.getHigh(composerStartRestartGroup, 6), text);
            Intrinsics.checkNotNull(function2ApplyTextStyle);
            function2ApplyTextStyle2 = applyTextStyle(typography1110.getBody2(), contentAlpha1110.getMedium(composerStartRestartGroup, 6), function9);
            function2ApplyTextStyle3 = applyTextStyle(typography1110.getOverline(), contentAlpha1110.getHigh(composerStartRestartGroup, 6), function8);
            function2ApplyTextStyle4 = applyTextStyle(typography1110.getCaption(), contentAlpha1110.getHigh(composerStartRestartGroup, 6), function13);
            modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            if (function2ApplyTextStyle2 == null) {
                function10 = function8;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                function10 = function8;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function13;
            z4 = z3;
            function12 = function10;
            modifier3 = modifier2;
        } else {
            if (i13 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i14 != 0) {
                function6 = null;
            }
            if (i4 != 0) {
                function9 = null;
            } else {
                function9 = function7;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i8 != 0) {
                function8 = null;
            }
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
            }
            Typography typography1111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1111 = typography1111.getSubtitle1();
            ContentAlpha contentAlpha1111 = ContentAlpha.INSTANCE;
            function2ApplyTextStyle = applyTextStyle(subtitle1111, contentAlpha1111.getHigh(composerStartRestartGroup, 6), text);
            Intrinsics.checkNotNull(function2ApplyTextStyle);
            function2ApplyTextStyle2 = applyTextStyle(typography1111.getBody2(), contentAlpha1111.getMedium(composerStartRestartGroup, 6), function9);
            function2ApplyTextStyle3 = applyTextStyle(typography1111.getOverline(), contentAlpha1111.getHigh(composerStartRestartGroup, 6), function8);
            function2ApplyTextStyle4 = applyTextStyle(typography1111.getCaption(), contentAlpha1111.getHigh(composerStartRestartGroup, 6), function13);
            modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            if (function2ApplyTextStyle2 == null) {
                function10 = function8;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                function10 = function8;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function6, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, (i3 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function13;
            z4 = z3;
            function12 = function10;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier19 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function11114 = function6;
        final Function2<? super Composer, ? super Integer, Unit> function11115 = function11;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i15) {
                ListItemKt.ListItem(modifier19, function11114, function9, z4, function12, function11115, text, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m1106OffsetToBaselineOrCenterKz89ssw(final float f, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i3, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:389)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo3measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                    int iMax;
                    final int iM3884getYimpl;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    final Placeable placeableMo2794measureBRTryo0 = measurables.get(0).mo2794measureBRTryo0(Constraints.m3724copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    int i5 = placeableMo2794measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    if (i5 != Integer.MIN_VALUE) {
                        iM3884getYimpl = Layout.mo318roundToPx0680j_4(f) - i5;
                        iMax = Math.max(Constraints.m3734getMinHeightimpl(j), placeableMo2794measureBRTryo0.getHeight() + iM3884getYimpl);
                    } else {
                        iMax = Math.max(Constraints.m3734getMinHeightimpl(j), placeableMo2794measureBRTryo0.getHeight());
                        iM3884getYimpl = IntOffset.m3884getYimpl(Alignment.INSTANCE.getCenter().mo1326alignKFBX0sM(IntSize.INSTANCE.m3930getZeroYbymL2g(), IntSizeKt.IntSize(0, iMax - placeableMo2794measureBRTryo0.getHeight()), Layout.getLayoutDirection()));
                    }
                    return MeasureScope.CC.OooOOo0(Layout, placeableMo2794measureBRTryo0.getWidth(), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, 0, iM3884getYimpl, 0.0f, 4, null);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list, i5);
                }
            };
            Density density = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            int i5 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 9) & 7168) | 6;
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
            Updater.m1316setimpl(composerM1309constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1316setimpl(composerM1309constructorimpl, density, companion.getSetDensity());
            Updater.m1316setimpl(composerM1309constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1316setimpl(composerM1309constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            androidx.compose.animation.OooOO0.OooO00o((i5 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                ListItemKt.m1106OffsetToBaselineOrCenterKz89ssw(f, modifier2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    private static final Function2<Composer, Integer, Unit> applyTextStyle(final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function2) {
        if (function2 == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.applyTextStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-830176860, i, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:422)");
                }
                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f))};
                final TextStyle textStyle2 = textStyle;
                final Function2<Composer, Integer, Unit> function3 = function2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 1665877604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.applyTextStyle.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i2) {
                        if ((i2 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1665877604, i2, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:423)");
                        }
                        TextKt.ProvideTextStyle(textStyle2, function3, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
