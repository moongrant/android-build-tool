package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.Oooo0;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
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
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u008b\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a{\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0002\b\u0016¢\u0006\u0002\b(H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0002\u0010,\u001a@\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\n\u0010@\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", ViewHierarchyConstants.TEXT_KEY, "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material_release", "color"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,434:1\n25#2:435\n25#2:443\n25#2:451\n36#2:464\n456#2,8:492\n464#2,3:506\n456#2,8:526\n464#2,3:540\n467#2,3:544\n456#2,8:566\n464#2,3:580\n467#2,3:584\n467#2,3:589\n1097#3,6:436\n1097#3,6:444\n1097#3,6:452\n1097#3,3:465\n1100#3,3:469\n76#4:442\n76#4:450\n76#4:458\n66#5,5:459\n71#5:468\n74#5:472\n858#6,5:473\n75#7,14:478\n78#7,11:515\n91#7:547\n78#7,11:555\n91#7:587\n91#7:592\n4144#8,6:500\n4144#8,6:534\n4144#8,6:574\n66#9,6:509\n72#9:543\n76#9:548\n66#9,6:549\n72#9:583\n76#9:588\n81#10:593\n154#11:594\n154#11:595\n154#11:596\n154#11:597\n154#11:598\n154#11:599\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n97#1:435\n159#1:443\n228#1:451\n270#1:464\n305#1:492,8\n305#1:506,3\n308#1:526,8\n308#1:540,3\n308#1:544,3\n313#1:566,8\n313#1:580,3\n313#1:584,3\n305#1:589,3\n97#1:436,6\n159#1:444,6\n228#1:452,6\n270#1:465,3\n270#1:469,3\n98#1:442\n160#1:450\n229#1:458\n270#1:459,5\n270#1:468\n270#1:472\n270#1:473,5\n305#1:478,14\n308#1:515,11\n308#1:547\n313#1:555,11\n313#1:587\n305#1:592\n305#1:500,6\n308#1:534,6\n313#1:574,6\n308#1:509,6\n308#1:543\n308#1:548\n313#1:549,6\n313#1:583\n313#1:588\n270#1:593\n413#1:594\n414#1:595\n422#1:596\n426#1:597\n429#1:598\n433#1:599\n*E\n"})
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m3775constructorimpl(48);
    private static final float LargeTabHeight = Dp.m3775constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m3775constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m3775constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m3775constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m3775constructorimpl(8);

    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:117:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:125:0x0194  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0263  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    public static final void m1217LeadingIconTab0nDMI0(final boolean z, @NotNull final Function0<Unit> onClick, @NotNull final Function2<? super Composer, ? super Integer, Unit> text, @NotNull final Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        final MutableInteractionSource mutableInteractionSource2;
        int i7;
        int i8;
        long jM1691unboximpl;
        long jM1680copywmQWz5c$default;
        final int i9;
        MutableInteractionSource mutableInteractionSource3;
        Object objRememberedValue;
        final Modifier modifier3;
        final boolean z4;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1499861761);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(text) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(icon) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((57344 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((458752 & i) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((3670016 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    if ((29360128 & i) == 0) {
                        int i13 = i3;
                        if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) {
                            i11 = Configuration.BLOCK_SIZE;
                        } else {
                            i11 = 8388608;
                        }
                        i8 = i13 | i11;
                    } else {
                        i8 = i3;
                    }
                    if ((i & 234881024) != 0) {
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j2)) {
                            i10 = 33554432;
                        } else {
                            i10 = 67108864;
                        }
                        i8 |= i10;
                    }
                    if ((i8 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 128) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -29360129;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i9 = i8 & (-234881025);
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1680copywmQWz5c$default = j2;
                                i9 = i8;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i8 &= -29360129;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i8 &= -234881025;
                            }
                            jM1691unboximpl = j;
                            jM1680copywmQWz5c$default = j2;
                            z3 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i9 = i8;
                            modifier2 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                        final Modifier modifier4 = modifier2;
                        final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        final boolean z5 = z3;
                        int i14 = i9;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i15) {
                                if ((i15 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(866677691, i15, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier4, TabKt.SmallTabHeight), z, mutableInteractionSource4, indicationM1288rememberRipple9IZ8Weo, z5, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function2 = icon;
                                int i16 = i9;
                                Function2<Composer, Integer, Unit> function3 = text;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                function2.invoke(composer2, Integer.valueOf((i16 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                                TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i16 >> 3) & 112);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i15 = i14 >> 21;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda, composerStartRestartGroup, (i15 & 112) | (i15 & 14) | 3072 | ((i14 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        z4 = z3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        j3 = jM1691unboximpl;
                        j4 = jM1680copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j3 = j;
                        j4 = j2;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

                        public final void invoke(@Nullable Composer composer2, int i16) {
                            TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((29360128 & i) == 0) {
                    int i16 = i3;
                    if ((i2 & 128) == 0) {
                        i11 = Configuration.BLOCK_SIZE;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i8 = i16 | i11;
                } else {
                    i8 = i3;
                }
                if ((i & 234881024) != 0) {
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i10 = 33554432;
                    } else {
                        i10 = 33554432;
                    }
                    i8 |= i10;
                }
                if ((i8 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo2 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                    final Modifier modifier5 = modifier2;
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                    final boolean z6 = z3;
                    int i17 = i9;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i18) {
                            if ((i18 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(866677691, i18, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier5, TabKt.SmallTabHeight), z, mutableInteractionSource5, indicationM1288rememberRipple9IZ8Weo2, z6, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i19 = i9;
                            Function2<Composer, Integer, Unit> function3 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function2.invoke(composer2, Integer.valueOf((i19 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i19 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i18 = i17 >> 21;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda2, composerStartRestartGroup, (i18 & 112) | (i18 & 14) | 3072 | ((i17 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j3 = jM1691unboximpl;
                    j4 = jM1680copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo3 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                    final Modifier modifier6 = modifier2;
                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                    final boolean z7 = z3;
                    int i19 = i9;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i110) {
                            if ((i110 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(866677691, i110, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier6, TabKt.SmallTabHeight), z, mutableInteractionSource6, indicationM1288rememberRipple9IZ8Weo3, z7, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i111 = i9;
                            Function2<Composer, Integer, Unit> function3 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function2.invoke(composer2, Integer.valueOf((i111 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i111 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i110 = i19 >> 21;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda3, composerStartRestartGroup, (i110 & 112) | (i110 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j3 = jM1691unboximpl;
                    j4 = jM1680copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

                    public final void invoke(@Nullable Composer composer2, int i111) {
                        TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 196608;
            z3 = z2;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((3670016 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((29360128 & i) == 0) {
                    int i111 = i3;
                    if ((i2 & 128) == 0) {
                        i11 = Configuration.BLOCK_SIZE;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i8 = i111 | i11;
                } else {
                    i8 = i3;
                }
                if ((i & 234881024) != 0) {
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i10 = 33554432;
                    } else {
                        i10 = 33554432;
                    }
                    i8 |= i10;
                }
                if ((i8 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo4 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                    final Modifier modifier7 = modifier2;
                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                    final boolean z8 = z3;
                    int i112 = i9;
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i113) {
                            if ((i113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(866677691, i113, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier7, TabKt.SmallTabHeight), z, mutableInteractionSource7, indicationM1288rememberRipple9IZ8Weo4, z8, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i114 = i9;
                            Function2<Composer, Integer, Unit> function3 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function2.invoke(composer2, Integer.valueOf((i114 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i114 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i113 = i112 >> 21;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda4, composerStartRestartGroup, (i113 & 112) | (i113 & 14) | 3072 | ((i112 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j3 = jM1691unboximpl;
                    j4 = jM1680copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo5 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                    final Modifier modifier8 = modifier2;
                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource3;
                    final boolean z9 = z3;
                    int i114 = i9;
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i115) {
                            if ((i115 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(866677691, i115, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier8, TabKt.SmallTabHeight), z, mutableInteractionSource8, indicationM1288rememberRipple9IZ8Weo5, z9, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i116 = i9;
                            Function2<Composer, Integer, Unit> function3 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function2.invoke(composer2, Integer.valueOf((i116 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i116 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i115 = i114 >> 21;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda5, composerStartRestartGroup, (i115 & 112) | (i115 & 14) | 3072 | ((i114 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j3 = jM1691unboximpl;
                    j4 = jM1680copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

                    public final void invoke(@Nullable Composer composer2, int i116) {
                        TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((29360128 & i) == 0) {
                int i116 = i3;
                if ((i2 & 128) == 0) {
                    i11 = Configuration.BLOCK_SIZE;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i8 = i116 | i11;
            } else {
                i8 = i3;
            }
            if ((i & 234881024) != 0) {
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i10 = 33554432;
                } else {
                    i10 = 33554432;
                }
                i8 |= i10;
            }
            if ((i8 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo6 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                final Modifier modifier9 = modifier2;
                final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource3;
                final boolean z10 = z3;
                int i117 = i9;
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i118) {
                        if ((i118 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(866677691, i118, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier9, TabKt.SmallTabHeight), z, mutableInteractionSource9, indicationM1288rememberRipple9IZ8Weo6, z10, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i119 = i9;
                        Function2<Composer, Integer, Unit> function3 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i119 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i119 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i118 = i117 >> 21;
                m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda6, composerStartRestartGroup, (i118 & 112) | (i118 & 14) | 3072 | ((i117 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource2 = mutableInteractionSource3;
                j3 = jM1691unboximpl;
                j4 = jM1680copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo7 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                final Modifier modifier10 = modifier2;
                final MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource3;
                final boolean z11 = z3;
                int i119 = i9;
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1110) {
                        if ((i1110 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(866677691, i1110, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier10, TabKt.SmallTabHeight), z, mutableInteractionSource10, indicationM1288rememberRipple9IZ8Weo7, z11, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i1111 = i9;
                        Function2<Composer, Integer, Unit> function3 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i1111 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i1111 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1110 = i119 >> 21;
                m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda7, composerStartRestartGroup, (i1110 & 112) | (i1110 & 14) | 3072 | ((i119 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource2 = mutableInteractionSource3;
                j3 = jM1691unboximpl;
                j4 = jM1680copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

                public final void invoke(@Nullable Composer composer2, int i1111) {
                    TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((458752 & i) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((3670016 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((29360128 & i) == 0) {
                    int i1111 = i3;
                    if ((i2 & 128) == 0) {
                        i11 = Configuration.BLOCK_SIZE;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i8 = i1111 | i11;
                } else {
                    i8 = i3;
                }
                if ((i & 234881024) != 0) {
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i10 = 33554432;
                    } else {
                        i10 = 33554432;
                    }
                    i8 |= i10;
                }
                if ((i8 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo8 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                    final Modifier modifier11 = modifier2;
                    final MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource3;
                    final boolean z12 = z3;
                    int i1112 = i9;
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1113) {
                            if ((i1113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(866677691, i1113, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier11, TabKt.SmallTabHeight), z, mutableInteractionSource11, indicationM1288rememberRipple9IZ8Weo8, z12, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i1114 = i9;
                            Function2<Composer, Integer, Unit> function3 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function2.invoke(composer2, Integer.valueOf((i1114 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i1114 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1113 = i1112 >> 21;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda8, composerStartRestartGroup, (i1113 & 112) | (i1113 & 14) | 3072 | ((i1112 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j3 = jM1691unboximpl;
                    j4 = jM1680copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i9 = i8 & (-234881025);
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                            i9 = i8;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo9 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                    final Modifier modifier12 = modifier2;
                    final MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource3;
                    final boolean z13 = z3;
                    int i1114 = i9;
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1115) {
                            if ((i1115 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(866677691, i1115, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier12, TabKt.SmallTabHeight), z, mutableInteractionSource12, indicationM1288rememberRipple9IZ8Weo9, z13, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i1116 = i9;
                            Function2<Composer, Integer, Unit> function3 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function2.invoke(composer2, Integer.valueOf((i1116 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i1116 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1115 = i1114 >> 21;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda9, composerStartRestartGroup, (i1115 & 112) | (i1115 & 14) | 3072 | ((i1114 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j3 = jM1691unboximpl;
                    j4 = jM1680copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

                    public final void invoke(@Nullable Composer composer2, int i1116) {
                        TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((29360128 & i) == 0) {
                int i1116 = i3;
                if ((i2 & 128) == 0) {
                    i11 = Configuration.BLOCK_SIZE;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i8 = i1116 | i11;
            } else {
                i8 = i3;
            }
            if ((i & 234881024) != 0) {
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i10 = 33554432;
                } else {
                    i10 = 33554432;
                }
                i8 |= i10;
            }
            if ((i8 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo10 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                final Modifier modifier13 = modifier2;
                final MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource3;
                final boolean z14 = z3;
                int i1117 = i9;
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1118) {
                        if ((i1118 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(866677691, i1118, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier13, TabKt.SmallTabHeight), z, mutableInteractionSource13, indicationM1288rememberRipple9IZ8Weo10, z14, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i1119 = i9;
                        Function2<Composer, Integer, Unit> function3 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i1119 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i1119 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1118 = i1117 >> 21;
                m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda10, composerStartRestartGroup, (i1118 & 112) | (i1118 & 14) | 3072 | ((i1117 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource2 = mutableInteractionSource3;
                j3 = jM1691unboximpl;
                j4 = jM1680copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo11 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                final Modifier modifier14 = modifier2;
                final MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource3;
                final boolean z15 = z3;
                int i1119 = i9;
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11110) {
                        if ((i11110 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(866677691, i11110, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier14, TabKt.SmallTabHeight), z, mutableInteractionSource14, indicationM1288rememberRipple9IZ8Weo11, z15, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i11111 = i9;
                        Function2<Composer, Integer, Unit> function3 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i11111 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i11111 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11110 = i1119 >> 21;
                m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda11, composerStartRestartGroup, (i11110 & 112) | (i11110 & 14) | 3072 | ((i1119 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource2 = mutableInteractionSource3;
                j3 = jM1691unboximpl;
                j4 = jM1680copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

                public final void invoke(@Nullable Composer composer2, int i11111) {
                    TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 196608;
        z3 = z2;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((3670016 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((29360128 & i) == 0) {
                int i11111 = i3;
                if ((i2 & 128) == 0) {
                    i11 = Configuration.BLOCK_SIZE;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i8 = i11111 | i11;
            } else {
                i8 = i3;
            }
            if ((i & 234881024) != 0) {
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i10 = 33554432;
                } else {
                    i10 = 33554432;
                }
                i8 |= i10;
            }
            if ((i8 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo12 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                final Modifier modifier15 = modifier2;
                final MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource3;
                final boolean z16 = z3;
                int i11112 = i9;
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11113) {
                        if ((i11113 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(866677691, i11113, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier15, TabKt.SmallTabHeight), z, mutableInteractionSource15, indicationM1288rememberRipple9IZ8Weo12, z16, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i11114 = i9;
                        Function2<Composer, Integer, Unit> function3 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i11114 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i11114 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11113 = i11112 >> 21;
                m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda12, composerStartRestartGroup, (i11113 & 112) | (i11113 & 14) | 3072 | ((i11112 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource2 = mutableInteractionSource3;
                j3 = jM1691unboximpl;
                j4 = jM1680copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i9 = i8 & (-234881025);
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                        i9 = i8;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo13 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
                final Modifier modifier16 = modifier2;
                final MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource3;
                final boolean z17 = z3;
                int i11114 = i9;
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11115) {
                        if ((i11115 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(866677691, i11115, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier16, TabKt.SmallTabHeight), z, mutableInteractionSource16, indicationM1288rememberRipple9IZ8Weo13, z17, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i11116 = i9;
                        Function2<Composer, Integer, Unit> function3 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i11116 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i11116 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11115 = i11114 >> 21;
                m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda13, composerStartRestartGroup, (i11115 & 112) | (i11115 & 14) | 3072 | ((i11114 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource2 = mutableInteractionSource3;
                j3 = jM1691unboximpl;
                j4 = jM1680copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

                public final void invoke(@Nullable Composer composer2, int i11116) {
                    TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 1572864;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((29360128 & i) == 0) {
            int i11116 = i3;
            if ((i2 & 128) == 0) {
                i11 = Configuration.BLOCK_SIZE;
            } else {
                i11 = Configuration.BLOCK_SIZE;
            }
            i8 = i11116 | i11;
        } else {
            i8 = i3;
        }
        if ((i & 234881024) != 0) {
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                i10 = 33554432;
            } else {
                i10 = 33554432;
            }
            i8 |= i10;
        }
        if ((i8 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i9 = i8 & (-234881025);
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                    i9 = i8;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i9 = i8 & (-234881025);
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                    i9 = i8;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
            }
            final Indication indicationM1288rememberRipple9IZ8Weo14 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
            final Modifier modifier17 = modifier2;
            final MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource3;
            final boolean z18 = z3;
            int i11117 = i9;
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11118) {
                    if ((i11118 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(866677691, i11118, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier17, TabKt.SmallTabHeight), z, mutableInteractionSource17, indicationM1288rememberRipple9IZ8Weo14, z18, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function2 = icon;
                    int i11119 = i9;
                    Function2<Composer, Integer, Unit> function3 = text;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    function2.invoke(composer2, Integer.valueOf((i11119 >> 9) & 14));
                    SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                    TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i11119 >> 3) & 112);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11118 = i11117 >> 21;
            m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda14, composerStartRestartGroup, (i11118 & 112) | (i11118 & 14) | 3072 | ((i11117 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            z4 = z3;
            mutableInteractionSource2 = mutableInteractionSource3;
            j3 = jM1691unboximpl;
            j4 = jM1680copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i9 = i8 & (-234881025);
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                    i9 = i8;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i9 = i8 & (-234881025);
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                    i9 = i8;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1499861761, i9, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
            }
            final Indication indicationM1288rememberRipple9IZ8Weo15 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i9 >> 15) & 896) | 6, 2);
            final Modifier modifier18 = modifier2;
            final MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource3;
            final boolean z19 = z3;
            int i11119 = i9;
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i111110) {
                    if ((i111110 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(866677691, i111110, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SelectableKt.m700selectableO2vRcR0(SizeKt.m511height3ABfNKs(modifier18, TabKt.SmallTabHeight), z, mutableInteractionSource18, indicationM1288rememberRipple9IZ8Weo15, z19, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), TabKt.HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function2 = icon;
                    int i111111 = i9;
                    Function2<Composer, Integer, Unit> function3 = text;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    function2.invoke(composer2, Integer.valueOf((i111111 >> 9) & 14));
                    SpacerKt.Spacer(SizeKt.m522requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                    TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function3, composer2, (i111111 >> 3) & 112);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i111110 = i11119 >> 21;
            m1220TabTransitionKlgxPg(jM1691unboximpl, jM1680copywmQWz5c$default, z, composableLambda15, composerStartRestartGroup, (i111110 & 112) | (i111110 & 14) | 3072 | ((i11119 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            z4 = z3;
            mutableInteractionSource2 = mutableInteractionSource3;
            j3 = jM1691unboximpl;
            j4 = jM1680copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
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

            public final void invoke(@Nullable Composer composer2, int i111111) {
                TabKt.m1217LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z4, mutableInteractionSource2, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:116:0x016d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:120:0x0174  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0206  */
    /* JADX WARN: Code duplicated, block: B:146:0x0263  */
    /* JADX WARN: Code duplicated, block: B:151:0x027b  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x0134, please report this as an issue */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Tab-0nD-MI0, reason: not valid java name */
    public static final void m1218Tab0nDMI0(final boolean z, @NotNull final Function0<Unit> onClick, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable MutableInteractionSource mutableInteractionSource, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i9;
        int i10;
        int i11;
        long j3;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function5;
        MutableInteractionSource mutableInteractionSource2;
        long jM1691unboximpl;
        long jM1680copywmQWz5c$default;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        final Function2<? super Composer, ? super Integer, Unit> function7;
        Object objRememberedValue;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function8;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function9;
        final MutableInteractionSource mutableInteractionSource3;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1486097588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= 196608;
                        function4 = function3;
                    } else {
                        function4 = function3;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) {
                            i13 = Configuration.BLOCK_SIZE;
                        } else {
                            i13 = 8388608;
                        }
                        i3 |= i13;
                    }
                    if ((234881024 & i) == 0) {
                        j3 = j2;
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j3)) {
                            i12 = 33554432;
                        } else {
                            i12 = 67108864;
                        }
                        i3 |= i12;
                    } else {
                        j3 = j2;
                    }
                    if ((191739611 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            }
                            if (i10 != 0) {
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
                            if ((i2 & 128) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i3 &= -29360129;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i3 &= -234881025;
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1680copywmQWz5c$default = j3;
                            }
                            function6 = function4;
                            function7 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i3 &= -234881025;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            jM1691unboximpl = j;
                            z3 = z3;
                            jM1680copywmQWz5c$default = j3;
                            function6 = function4;
                            function7 = function2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                        }
                        final ComposableLambda composableLambda = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i15) {
                                if ((i15 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1729014781, i15, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                                TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }) : null;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                invoke(columnScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i15) {
                                Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                                if ((i15 & 81) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-178151495, i15, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                                }
                                TabKt.TabBaselineLayout(composableLambda, function6, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i15 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i16 = i3 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<? super Composer, ? super Integer, Unit> function11 = function7;
                        m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda2, composerStartRestartGroup, i15 | (57344 & i16) | (458752 & i16) | (i16 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function11;
                        z4 = z3;
                        function9 = function10;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        j4 = jM1691unboximpl;
                        j5 = jM1680copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z4 = z3;
                        function9 = function4;
                        function8 = function2;
                        j5 = j3;
                        mutableInteractionSource3 = mutableInteractionSource;
                        j4 = j;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

                        public final void invoke(@Nullable Composer composer2, int i17) {
                            TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i13 = Configuration.BLOCK_SIZE;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i13;
                }
                if ((234881024 & i) == 0) {
                    j3 = j2;
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i12 = 33554432;
                    } else {
                        i12 = 33554432;
                    }
                    i3 |= i12;
                } else {
                    j3 = j2;
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda3 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i17) {
                            if ((i17 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729014781, i17, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i17) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i17 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178151495, i17, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                            }
                            TabKt.TabBaselineLayout(composableLambda3, function6, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i17 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i18 = i3 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function12 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function13 = function7;
                    m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda4, composerStartRestartGroup, i17 | (57344 & i18) | (458752 & i18) | (i18 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function13;
                    z4 = z3;
                    function9 = function12;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j4 = jM1691unboximpl;
                    j5 = jM1680copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda5 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i19) {
                            if ((i19 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729014781, i19, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i19) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i19 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178151495, i19, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                            }
                            TabKt.TabBaselineLayout(composableLambda5, function6, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i19 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i110 = i3 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function15 = function7;
                    m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda6, composerStartRestartGroup, i19 | (57344 & i110) | (458752 & i110) | (i110 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function15;
                    z4 = z3;
                    function9 = function14;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j4 = jM1691unboximpl;
                    j5 = jM1680copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

                    public final void invoke(@Nullable Composer composer2, int i111) {
                        TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i13 = Configuration.BLOCK_SIZE;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i13;
                }
                if ((234881024 & i) == 0) {
                    j3 = j2;
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i12 = 33554432;
                    } else {
                        i12 = 33554432;
                    }
                    i3 |= i12;
                } else {
                    j3 = j2;
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda7 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i111) {
                            if ((i111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729014781, i111, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i111) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i111 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178151495, i111, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                            }
                            TabKt.TabBaselineLayout(composableLambda7, function6, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i111 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i112 = i3 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function17 = function7;
                    m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda8, composerStartRestartGroup, i111 | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function17;
                    z4 = z3;
                    function9 = function16;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j4 = jM1691unboximpl;
                    j5 = jM1680copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda9 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i113) {
                            if ((i113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729014781, i113, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i113) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i113 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178151495, i113, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                            }
                            TabKt.TabBaselineLayout(composableLambda9, function6, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i113 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i114 = i3 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function19 = function7;
                    m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda10, composerStartRestartGroup, i113 | (57344 & i114) | (458752 & i114) | (i114 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function19;
                    z4 = z3;
                    function9 = function18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j4 = jM1691unboximpl;
                    j5 = jM1680copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

                    public final void invoke(@Nullable Composer composer2, int i115) {
                        TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i13 = Configuration.BLOCK_SIZE;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i3 |= i13;
            }
            if ((234881024 & i) == 0) {
                j3 = j2;
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i12 = 33554432;
                } else {
                    i12 = 33554432;
                }
                i3 |= i12;
            } else {
                j3 = j2;
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                final Function2<? super Composer, ? super Integer, Unit> composableLambda11 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i115) {
                        if ((i115 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729014781, i115, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }) : null;
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i115) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i115 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178151495, i115, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                        }
                        TabKt.TabBaselineLayout(composableLambda11, function6, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i115 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i116 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                Function2<? super Composer, ? super Integer, Unit> function111 = function7;
                m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda12, composerStartRestartGroup, i115 | (57344 & i116) | (458752 & i116) | (i116 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function111;
                z4 = z3;
                function9 = function110;
                mutableInteractionSource3 = mutableInteractionSource2;
                j4 = jM1691unboximpl;
                j5 = jM1680copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                final Function2<? super Composer, ? super Integer, Unit> composableLambda13 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i117) {
                        if ((i117 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729014781, i117, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }) : null;
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i117) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i117 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178151495, i117, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                        }
                        TabKt.TabBaselineLayout(composableLambda13, function6, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i117 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i118 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                Function2<? super Composer, ? super Integer, Unit> function113 = function7;
                m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda14, composerStartRestartGroup, i117 | (57344 & i118) | (458752 & i118) | (i118 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function113;
                z4 = z3;
                function9 = function112;
                mutableInteractionSource3 = mutableInteractionSource2;
                j4 = jM1691unboximpl;
                j5 = jM1680copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

                public final void invoke(@Nullable Composer composer2, int i119) {
                    TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i13 = Configuration.BLOCK_SIZE;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i13;
                }
                if ((234881024 & i) == 0) {
                    j3 = j2;
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i12 = 33554432;
                    } else {
                        i12 = 33554432;
                    }
                    i3 |= i12;
                } else {
                    j3 = j2;
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda15 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i119) {
                            if ((i119 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729014781, i119, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i119) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i119 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178151495, i119, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                            }
                            TabKt.TabBaselineLayout(composableLambda15, function6, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i119 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i1110 = i3 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function115 = function7;
                    m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda16, composerStartRestartGroup, i119 | (57344 & i1110) | (458752 & i1110) | (i1110 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function115;
                    z4 = z3;
                    function9 = function114;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j4 = jM1691unboximpl;
                    j5 = jM1680copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        }
                        if (i10 != 0) {
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
                        if ((i2 & 128) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i3 &= -29360129;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda17 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1111) {
                            if ((i1111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729014781, i1111, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i1111) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i1111 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178151495, i1111, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                            }
                            TabKt.TabBaselineLayout(composableLambda17, function6, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1111 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i1112 = i3 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function117 = function7;
                    m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda18, composerStartRestartGroup, i1111 | (57344 & i1112) | (458752 & i1112) | (i1112 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function117;
                    z4 = z3;
                    function9 = function116;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j4 = jM1691unboximpl;
                    j5 = jM1680copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

                    public final void invoke(@Nullable Composer composer2, int i1113) {
                        TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i13 = Configuration.BLOCK_SIZE;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i3 |= i13;
            }
            if ((234881024 & i) == 0) {
                j3 = j2;
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i12 = 33554432;
                } else {
                    i12 = 33554432;
                }
                i3 |= i12;
            } else {
                j3 = j2;
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                final Function2<? super Composer, ? super Integer, Unit> composableLambda19 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1113) {
                        if ((i1113 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729014781, i1113, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }) : null;
                ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i1113) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i1113 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178151495, i1113, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                        }
                        TabKt.TabBaselineLayout(composableLambda19, function6, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1113 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1114 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function118 = function6;
                Function2<? super Composer, ? super Integer, Unit> function119 = function7;
                m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda110, composerStartRestartGroup, i1113 | (57344 & i1114) | (458752 & i1114) | (i1114 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function119;
                z4 = z3;
                function9 = function118;
                mutableInteractionSource3 = mutableInteractionSource2;
                j4 = jM1691unboximpl;
                j5 = jM1680copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                final Function2<? super Composer, ? super Integer, Unit> composableLambda111 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1115) {
                        if ((i1115 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729014781, i1115, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }) : null;
                ComposableLambda composableLambda112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i1115) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i1115 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178151495, i1115, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                        }
                        TabKt.TabBaselineLayout(composableLambda111, function6, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1115 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1116 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1111 = function7;
                m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda112, composerStartRestartGroup, i1115 | (57344 & i1116) | (458752 & i1116) | (i1116 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function1111;
                z4 = z3;
                function9 = function1110;
                mutableInteractionSource3 = mutableInteractionSource2;
                j4 = jM1691unboximpl;
                j5 = jM1680copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

                public final void invoke(@Nullable Composer composer2, int i1117) {
                    TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i13 = Configuration.BLOCK_SIZE;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i3 |= i13;
            }
            if ((234881024 & i) == 0) {
                j3 = j2;
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i12 = 33554432;
                } else {
                    i12 = 33554432;
                }
                i3 |= i12;
            } else {
                j3 = j2;
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                final Function2<? super Composer, ? super Integer, Unit> composableLambda113 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        if ((i1117 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729014781, i1117, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }) : null;
                ComposableLambda composableLambda114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i1117) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i1117 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178151495, i1117, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                        }
                        TabKt.TabBaselineLayout(composableLambda113, function6, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1117 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1118 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1112 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1113 = function7;
                m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda114, composerStartRestartGroup, i1117 | (57344 & i1118) | (458752 & i1118) | (i1118 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function1113;
                z4 = z3;
                function9 = function1112;
                mutableInteractionSource3 = mutableInteractionSource2;
                j4 = jM1691unboximpl;
                j5 = jM1680copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    if (i10 != 0) {
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
                    if ((i2 & 128) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i3 &= -29360129;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i3 &= -234881025;
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                final Function2<? super Composer, ? super Integer, Unit> composableLambda115 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1119) {
                        if ((i1119 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729014781, i1119, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }) : null;
                ComposableLambda composableLambda116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i1119) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i1119 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178151495, i1119, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                        }
                        TabKt.TabBaselineLayout(composableLambda115, function6, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1119 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i11110 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1115 = function7;
                m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda116, composerStartRestartGroup, i1119 | (57344 & i11110) | (458752 & i11110) | (i11110 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function1115;
                z4 = z3;
                function9 = function1114;
                mutableInteractionSource3 = mutableInteractionSource2;
                j4 = jM1691unboximpl;
                j5 = jM1680copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

                public final void invoke(@Nullable Composer composer2, int i11111) {
                    TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            function4 = function3;
        } else {
            function4 = function3;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i & 29360128) != 0) {
            if ((i2 & 128) == 0) {
                i13 = Configuration.BLOCK_SIZE;
            } else {
                i13 = Configuration.BLOCK_SIZE;
            }
            i3 |= i13;
        }
        if ((234881024 & i) == 0) {
            j3 = j2;
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                i12 = 33554432;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        } else {
            j3 = j2;
        }
        if ((191739611 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i8 != 0) {
                    function4 = null;
                }
                if (i10 != 0) {
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
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i3 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i3 &= -234881025;
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                function6 = function4;
                function7 = function5;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i8 != 0) {
                    function4 = null;
                }
                if (i10 != 0) {
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
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i3 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i3 &= -234881025;
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
            }
            final Function2<? super Composer, ? super Integer, Unit> composableLambda117 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11111) {
                    if ((i11111 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1729014781, i11111, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                    }
                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                    TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }) : null;
            ComposableLambda composableLambda118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i11111) {
                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                    if ((i11111 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-178151495, i11111, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                    }
                    TabKt.TabBaselineLayout(composableLambda117, function6, composer2, (i3 >> 12) & 112);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11111 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i11112 = i3 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
            Function2<? super Composer, ? super Integer, Unit> function1117 = function7;
            m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda118, composerStartRestartGroup, i11111 | (57344 & i11112) | (458752 & i11112) | (i11112 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function1117;
            z4 = z3;
            function9 = function1116;
            mutableInteractionSource3 = mutableInteractionSource2;
            j4 = jM1691unboximpl;
            j5 = jM1680copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i8 != 0) {
                    function4 = null;
                }
                if (i10 != 0) {
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
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i3 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i3 &= -234881025;
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                function6 = function4;
                function7 = function5;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i8 != 0) {
                    function4 = null;
                }
                if (i10 != 0) {
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
                if ((i2 & 128) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i3 &= -29360129;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i3 &= -234881025;
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
            }
            final Function2<? super Composer, ? super Integer, Unit> composableLambda119 = function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11113) {
                    if ((i11113 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1729014781, i11113, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                    }
                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                    TextKt.ProvideTextStyle(button.m3338copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), function7, composer2, (i3 >> 9) & 112);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }) : null;
            ComposableLambda composableLambda1110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer2, int i11113) {
                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                    if ((i11113 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-178151495, i11113, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                    }
                    TabKt.TabBaselineLayout(composableLambda119, function6, composer2, (i3 >> 12) & 112);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11113 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i11114 = i3 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function1118 = function6;
            Function2<? super Composer, ? super Integer, Unit> function1119 = function7;
            m1219TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource2, jM1691unboximpl, jM1680copywmQWz5c$default, composableLambda1110, composerStartRestartGroup, i11113 | (57344 & i11114) | (458752 & i11114) | (i11114 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function1119;
            z4 = z3;
            function9 = function1118;
            mutableInteractionSource3 = mutableInteractionSource2;
            j4 = jM1691unboximpl;
            j5 = jM1680copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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

            public final void invoke(@Nullable Composer composer2, int i11115) {
                TabKt.m1218Tab0nDMI0(z, onClick, modifier3, z4, function8, function9, mutableInteractionSource3, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c  */
    /* JADX WARN: Code duplicated, block: B:117:0x017d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:131:0x021d  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Tab-EVJuX4I, reason: not valid java name */
    public static final void m1219TabEVJuX4I(final boolean z, @NotNull final Function0<Unit> onClick, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, long j, long j2, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        int i8;
        final long jM1680copywmQWz5c$default;
        int i9;
        long jM1691unboximpl;
        Object objRememberedValue;
        final int i10;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(713679175);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((458752 & i) == 0) {
                        int i14 = i3;
                        if ((i2 & 32) == 0 || !composerStartRestartGroup.changed(j)) {
                            i12 = 65536;
                        } else {
                            i12 = 131072;
                        }
                        i8 = i14 | i12;
                    } else {
                        i8 = i3;
                    }
                    if ((i & 3670016) == 0) {
                        jM1680copywmQWz5c$default = j2;
                        if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(jM1680copywmQWz5c$default)) {
                            i11 = 524288;
                        } else {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        }
                        i8 |= i11;
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i9 = 8388608;
                            } else {
                                i9 = Configuration.BLOCK_SIZE;
                            }
                        }
                        if ((23967451 & i8) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if (i6 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                }
                                if ((i2 & 32) != 0) {
                                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                    i8 &= -458753;
                                } else {
                                    jM1691unboximpl = j;
                                }
                                if ((i2 & 64) != 0) {
                                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i8 &= -3670017;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i8 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i8 &= -3670017;
                                }
                                jM1691unboximpl = j;
                            }
                            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            long j4 = jM1680copywmQWz5c$default;
                            i10 = i8;
                            final Modifier modifier3 = modifier2;
                            final boolean z5 = z3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                            }
                            final Indication indicationM1288rememberRipple9IZ8Weo = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                            int i15 = i10 >> 15;
                            m1220TabTransitionKlgxPg(jM1691unboximpl, j4, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i16) {
                                    if ((i16 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1237246709, i16, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource4, indicationM1288rememberRipple9IZ8Weo, z5, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                    int i17 = ((i10 >> 12) & 7168) | 432;
                                    composer2.startReplaceableGroup(-483455358);
                                    int i18 = i17 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i18 & 112) | (i18 & 14));
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                    int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                    }
                                    androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                    function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, (i15 & 112) | (i15 & 14) | 3072 | ((i10 << 6) & 896));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            z4 = z5;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            j3 = jM1691unboximpl;
                            jM1680copywmQWz5c$default = j4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            j3 = j;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                            public final void invoke(@Nullable Composer composer2, int i16) {
                                TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i9 = 12582912;
                    i8 |= i9;
                    if ((23967451 & i8) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                        long j5 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier4 = modifier2;
                        final boolean z6 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo2 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i16 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j5, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i17) {
                                if ((i17 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i17, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier4, z, mutableInteractionSource5, indicationM1288rememberRipple9IZ8Weo2, z6, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i18 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i19 = i18 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i19 & 112) | (i19 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i110 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i110 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i18 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i16 & 112) | (i16 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        z4 = z6;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                        long j6 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier5 = modifier2;
                        final boolean z7 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo3 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i17 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j6, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i18) {
                                if ((i18 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i18, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier5, z, mutableInteractionSource6, indicationM1288rememberRipple9IZ8Weo3, z7, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i19 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i110 = i19 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i110 & 112) | (i110 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i111 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i111 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i19 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i17 & 112) | (i17 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier5;
                        z4 = z7;
                        mutableInteractionSource3 = mutableInteractionSource6;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                        public final void invoke(@Nullable Composer composer2, int i18) {
                            TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) == 0) {
                    int i18 = i3;
                    if ((i2 & 32) == 0) {
                        i12 = 65536;
                    } else {
                        i12 = 65536;
                    }
                    i8 = i18 | i12;
                } else {
                    i8 = i3;
                }
                if ((i & 3670016) == 0) {
                    jM1680copywmQWz5c$default = j2;
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i8 |= i11;
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i9 = 8388608;
                        } else {
                            i9 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i8) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                        long j7 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier6 = modifier2;
                        final boolean z8 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo4 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i19 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j7, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i110) {
                                if ((i110 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i110, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier6, z, mutableInteractionSource7, indicationM1288rememberRipple9IZ8Weo4, z8, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i111 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i112 = i111 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i112 & 112) | (i112 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i113 = ((((i111 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i113 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i19 & 112) | (i19 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier6;
                        z4 = z8;
                        mutableInteractionSource3 = mutableInteractionSource7;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j7;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                        long j8 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier7 = modifier2;
                        final boolean z9 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo5 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i110 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j8, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i111) {
                                if ((i111 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i111, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier7, z, mutableInteractionSource8, indicationM1288rememberRipple9IZ8Weo5, z9, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i112 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i113 = i112 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i113 & 112) | (i113 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i114 = ((((i112 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i114 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i112 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i110 & 112) | (i110 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier7;
                        z4 = z9;
                        mutableInteractionSource3 = mutableInteractionSource8;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                        public final void invoke(@Nullable Composer composer2, int i111) {
                            TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i9 = 12582912;
                i8 |= i9;
                if ((23967451 & i8) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                    long j9 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier8 = modifier2;
                    final boolean z10 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo6 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i111 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j9, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i112) {
                            if ((i112 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i112, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier8, z, mutableInteractionSource9, indicationM1288rememberRipple9IZ8Weo6, z10, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i113 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i114 = i113 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i114 & 112) | (i114 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i115 = ((((i113 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i115 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i113 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i111 & 112) | (i111 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier8;
                    z4 = z10;
                    mutableInteractionSource3 = mutableInteractionSource9;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                    long j10 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier9 = modifier2;
                    final boolean z11 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo7 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i112 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j10, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i113) {
                            if ((i113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i113, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier9, z, mutableInteractionSource10, indicationM1288rememberRipple9IZ8Weo7, z11, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i114 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i115 = i114 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i115 & 112) | (i115 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i116 = ((((i114 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i116 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i114 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i112 & 112) | (i112 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier9;
                    z4 = z11;
                    mutableInteractionSource3 = mutableInteractionSource10;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    int i113 = i3;
                    if ((i2 & 32) == 0) {
                        i12 = 65536;
                    } else {
                        i12 = 65536;
                    }
                    i8 = i113 | i12;
                } else {
                    i8 = i3;
                }
                if ((i & 3670016) == 0) {
                    jM1680copywmQWz5c$default = j2;
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i8 |= i11;
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i9 = 8388608;
                        } else {
                            i9 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i8) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                        long j11 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier10 = modifier2;
                        final boolean z12 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo8 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i114 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j11, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i115) {
                                if ((i115 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i115, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier10, z, mutableInteractionSource11, indicationM1288rememberRipple9IZ8Weo8, z12, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i116 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i117 = i116 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i117 & 112) | (i117 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i118 = ((((i116 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i118 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i116 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i114 & 112) | (i114 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier10;
                        z4 = z12;
                        mutableInteractionSource3 = mutableInteractionSource11;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j11;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                        long j12 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier11 = modifier2;
                        final boolean z13 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo9 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i115 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j12, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i116) {
                                if ((i116 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i116, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier11, z, mutableInteractionSource12, indicationM1288rememberRipple9IZ8Weo9, z13, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i117 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i118 = i117 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i118 & 112) | (i118 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i119 = ((((i117 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i119 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i117 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i115 & 112) | (i115 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier11;
                        z4 = z13;
                        mutableInteractionSource3 = mutableInteractionSource12;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                        public final void invoke(@Nullable Composer composer2, int i116) {
                            TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i9 = 12582912;
                i8 |= i9;
                if ((23967451 & i8) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                    long j13 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier12 = modifier2;
                    final boolean z14 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo10 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i116 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j13, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i117) {
                            if ((i117 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i117, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier12, z, mutableInteractionSource13, indicationM1288rememberRipple9IZ8Weo10, z14, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i118 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i119 = i118 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i119 & 112) | (i119 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i1110 = ((((i118 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i1110 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i118 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i116 & 112) | (i116 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier12;
                    z4 = z14;
                    mutableInteractionSource3 = mutableInteractionSource13;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                    long j14 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier13 = modifier2;
                    final boolean z15 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo11 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i117 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j14, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i118) {
                            if ((i118 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i118, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier13, z, mutableInteractionSource14, indicationM1288rememberRipple9IZ8Weo11, z15, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i119 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i1110 = i119 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1110 & 112) | (i1110 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i1111 = ((((i119 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i1111 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i119 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i117 & 112) | (i117 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier13;
                    z4 = z15;
                    mutableInteractionSource3 = mutableInteractionSource14;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                    public final void invoke(@Nullable Composer composer2, int i118) {
                        TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                int i118 = i3;
                if ((i2 & 32) == 0) {
                    i12 = 65536;
                } else {
                    i12 = 65536;
                }
                i8 = i118 | i12;
            } else {
                i8 = i3;
            }
            if ((i & 3670016) == 0) {
                jM1680copywmQWz5c$default = j2;
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i8 |= i11;
            } else {
                jM1680copywmQWz5c$default = j2;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i9 = 8388608;
                    } else {
                        i9 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i8) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                    long j15 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier14 = modifier2;
                    final boolean z16 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo12 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i119 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j15, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1110) {
                            if ((i1110 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i1110, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier14, z, mutableInteractionSource15, indicationM1288rememberRipple9IZ8Weo12, z16, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i1111 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i1112 = i1111 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1112 & 112) | (i1112 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i1113 = ((((i1111 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i1113 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1111 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i119 & 112) | (i119 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier14;
                    z4 = z16;
                    mutableInteractionSource3 = mutableInteractionSource15;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j15;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                    long j16 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier15 = modifier2;
                    final boolean z17 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo13 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i1110 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j16, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1111) {
                            if ((i1111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i1111, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier15, z, mutableInteractionSource16, indicationM1288rememberRipple9IZ8Weo13, z17, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i1112 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i1113 = i1112 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1113 & 112) | (i1113 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i1114 = ((((i1112 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i1114 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1112 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i1110 & 112) | (i1110 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier15;
                    z4 = z17;
                    mutableInteractionSource3 = mutableInteractionSource16;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j16;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                    public final void invoke(@Nullable Composer composer2, int i1111) {
                        TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i9 = 12582912;
            i8 |= i9;
            if ((23967451 & i8) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
                long j17 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier16 = modifier2;
                final boolean z18 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo14 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i1111 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j17, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1112) {
                        if ((i1112 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i1112, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier16, z, mutableInteractionSource17, indicationM1288rememberRipple9IZ8Weo14, z18, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i1113 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i1114 = i1113 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1114 & 112) | (i1114 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i1115 = ((((i1113 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i1115 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1113 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i1111 & 112) | (i1111 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier16;
                z4 = z18;
                mutableInteractionSource3 = mutableInteractionSource17;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j17;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
                long j18 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier17 = modifier2;
                final boolean z19 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo15 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i1112 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j18, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1113) {
                        if ((i1113 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i1113, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier17, z, mutableInteractionSource18, indicationM1288rememberRipple9IZ8Weo15, z19, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i1114 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i1115 = i1114 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1115 & 112) | (i1115 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i1116 = ((((i1114 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i1116 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1114 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i1112 & 112) | (i1112 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier17;
                z4 = z19;
                mutableInteractionSource3 = mutableInteractionSource18;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                public final void invoke(@Nullable Composer composer2, int i1113) {
                    TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    int i1113 = i3;
                    if ((i2 & 32) == 0) {
                        i12 = 65536;
                    } else {
                        i12 = 65536;
                    }
                    i8 = i1113 | i12;
                } else {
                    i8 = i3;
                }
                if ((i & 3670016) == 0) {
                    jM1680copywmQWz5c$default = j2;
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i8 |= i11;
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i9 = 8388608;
                        } else {
                            i9 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i8) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource2;
                        long j19 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier18 = modifier2;
                        final boolean z110 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo16 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i1114 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j19, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1115) {
                                if ((i1115 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i1115, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier18, z, mutableInteractionSource19, indicationM1288rememberRipple9IZ8Weo16, z110, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i1116 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i1117 = i1116 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1117 & 112) | (i1117 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i1118 = ((((i1116 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i1118 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1116 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i1114 & 112) | (i1114 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier18;
                        z4 = z110;
                        mutableInteractionSource3 = mutableInteractionSource19;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j19;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 32) != 0) {
                                jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                                i8 &= -458753;
                            } else {
                                jM1691unboximpl = j;
                            }
                            if ((i2 & 64) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i8 &= -3670017;
                            }
                        }
                        final MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource2;
                        long j110 = jM1680copywmQWz5c$default;
                        i10 = i8;
                        final Modifier modifier19 = modifier2;
                        final boolean z111 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        final Indication indicationM1288rememberRipple9IZ8Weo17 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                        int i1115 = i10 >> 15;
                        m1220TabTransitionKlgxPg(jM1691unboximpl, j110, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1116) {
                                if ((i1116 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1237246709, i1116, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier19, z, mutableInteractionSource110, indicationM1288rememberRipple9IZ8Weo17, z111, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i1117 = ((i10 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                int i1118 = i1117 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1118 & 112) | (i1118 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                int i1119 = ((((i1117 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i1119 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1117 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i1115 & 112) | (i1115 & 14) | 3072 | ((i10 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier19;
                        z4 = z111;
                        mutableInteractionSource3 = mutableInteractionSource110;
                        j3 = jM1691unboximpl;
                        jM1680copywmQWz5c$default = j110;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                        public final void invoke(@Nullable Composer composer2, int i1116) {
                            TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i9 = 12582912;
                i8 |= i9;
                if ((23967451 & i8) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource111 = mutableInteractionSource2;
                    long j111 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier110 = modifier2;
                    final boolean z112 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo18 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i1116 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j111, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1117) {
                            if ((i1117 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i1117, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier110, z, mutableInteractionSource111, indicationM1288rememberRipple9IZ8Weo18, z112, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i1118 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i1119 = i1118 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i1119 & 112) | (i1119 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i11110 = ((((i1118 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i11110 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1118 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i1116 & 112) | (i1116 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier110;
                    z4 = z112;
                    mutableInteractionSource3 = mutableInteractionSource111;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource112 = mutableInteractionSource2;
                    long j112 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier111 = modifier2;
                    final boolean z113 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo19 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i1117 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j112, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1118) {
                            if ((i1118 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i1118, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier111, z, mutableInteractionSource112, indicationM1288rememberRipple9IZ8Weo19, z113, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i1119 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i11110 = i1119 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11110 & 112) | (i11110 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i11111 = ((((i1119 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i11111 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1119 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i1117 & 112) | (i1117 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier111;
                    z4 = z113;
                    mutableInteractionSource3 = mutableInteractionSource112;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                    public final void invoke(@Nullable Composer composer2, int i1118) {
                        TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                int i1118 = i3;
                if ((i2 & 32) == 0) {
                    i12 = 65536;
                } else {
                    i12 = 65536;
                }
                i8 = i1118 | i12;
            } else {
                i8 = i3;
            }
            if ((i & 3670016) == 0) {
                jM1680copywmQWz5c$default = j2;
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i8 |= i11;
            } else {
                jM1680copywmQWz5c$default = j2;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i9 = 8388608;
                    } else {
                        i9 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i8) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource113 = mutableInteractionSource2;
                    long j113 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier112 = modifier2;
                    final boolean z114 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo110 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i1119 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j113, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11110) {
                            if ((i11110 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i11110, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier112, z, mutableInteractionSource113, indicationM1288rememberRipple9IZ8Weo110, z114, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i11111 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i11112 = i11111 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11112 & 112) | (i11112 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i11113 = ((((i11111 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i11113 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11111 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i1119 & 112) | (i1119 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier112;
                    z4 = z114;
                    mutableInteractionSource3 = mutableInteractionSource113;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource114 = mutableInteractionSource2;
                    long j114 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier113 = modifier2;
                    final boolean z115 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo111 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i11110 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j114, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11111) {
                            if ((i11111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i11111, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier113, z, mutableInteractionSource114, indicationM1288rememberRipple9IZ8Weo111, z115, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i11112 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i11113 = i11112 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11113 & 112) | (i11113 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i11114 = ((((i11112 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i11114 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11112 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i11110 & 112) | (i11110 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier113;
                    z4 = z115;
                    mutableInteractionSource3 = mutableInteractionSource114;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                    public final void invoke(@Nullable Composer composer2, int i11111) {
                        TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i9 = 12582912;
            i8 |= i9;
            if ((23967451 & i8) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource115 = mutableInteractionSource2;
                long j115 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier114 = modifier2;
                final boolean z116 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo112 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i11111 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j115, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11112) {
                        if ((i11112 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i11112, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier114, z, mutableInteractionSource115, indicationM1288rememberRipple9IZ8Weo112, z116, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i11113 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i11114 = i11113 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11114 & 112) | (i11114 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i11115 = ((((i11113 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i11115 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11113 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i11111 & 112) | (i11111 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier114;
                z4 = z116;
                mutableInteractionSource3 = mutableInteractionSource115;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource116 = mutableInteractionSource2;
                long j116 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier115 = modifier2;
                final boolean z117 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo113 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i11112 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j116, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11113) {
                        if ((i11113 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i11113, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier115, z, mutableInteractionSource116, indicationM1288rememberRipple9IZ8Weo113, z117, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i11114 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i11115 = i11114 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11115 & 112) | (i11115 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i11116 = ((((i11114 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i11116 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11114 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i11112 & 112) | (i11112 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier115;
                z4 = z117;
                mutableInteractionSource3 = mutableInteractionSource116;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                public final void invoke(@Nullable Composer composer2, int i11113) {
                    TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((458752 & i) == 0) {
                int i11113 = i3;
                if ((i2 & 32) == 0) {
                    i12 = 65536;
                } else {
                    i12 = 65536;
                }
                i8 = i11113 | i12;
            } else {
                i8 = i3;
            }
            if ((i & 3670016) == 0) {
                jM1680copywmQWz5c$default = j2;
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i8 |= i11;
            } else {
                jM1680copywmQWz5c$default = j2;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i9 = 8388608;
                    } else {
                        i9 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i8) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource117 = mutableInteractionSource2;
                    long j117 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier116 = modifier2;
                    final boolean z118 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo114 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i11114 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j117, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11115) {
                            if ((i11115 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i11115, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier116, z, mutableInteractionSource117, indicationM1288rememberRipple9IZ8Weo114, z118, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i11116 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i11117 = i11116 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11117 & 112) | (i11117 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i11118 = ((((i11116 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i11118 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11116 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i11114 & 112) | (i11114 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier116;
                    z4 = z118;
                    mutableInteractionSource3 = mutableInteractionSource117;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 32) != 0) {
                            jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                            i8 &= -458753;
                        } else {
                            jM1691unboximpl = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i8 &= -3670017;
                        }
                    }
                    final MutableInteractionSource mutableInteractionSource118 = mutableInteractionSource2;
                    long j118 = jM1680copywmQWz5c$default;
                    i10 = i8;
                    final Modifier modifier117 = modifier2;
                    final boolean z119 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    final Indication indicationM1288rememberRipple9IZ8Weo115 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                    int i11115 = i10 >> 15;
                    m1220TabTransitionKlgxPg(jM1691unboximpl, j118, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11116) {
                            if ((i11116 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1237246709, i11116, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier117, z, mutableInteractionSource118, indicationM1288rememberRipple9IZ8Weo115, z119, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i11117 = ((i10 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            int i11118 = i11117 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11118 & 112) | (i11118 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            int i11119 = ((((i11117 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i11119 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11117 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i11115 & 112) | (i11115 & 14) | 3072 | ((i10 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier117;
                    z4 = z119;
                    mutableInteractionSource3 = mutableInteractionSource118;
                    j3 = jM1691unboximpl;
                    jM1680copywmQWz5c$default = j118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                    public final void invoke(@Nullable Composer composer2, int i11116) {
                        TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i9 = 12582912;
            i8 |= i9;
            if ((23967451 & i8) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource119 = mutableInteractionSource2;
                long j119 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier118 = modifier2;
                final boolean z1110 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo116 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i11116 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j119, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11117) {
                        if ((i11117 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i11117, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier118, z, mutableInteractionSource119, indicationM1288rememberRipple9IZ8Weo116, z1110, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i11118 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i11119 = i11118 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11119 & 112) | (i11119 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i111110 = ((((i11118 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i111110 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11118 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i11116 & 112) | (i11116 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier118;
                z4 = z1110;
                mutableInteractionSource3 = mutableInteractionSource119;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j119;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource1110 = mutableInteractionSource2;
                long j1110 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier119 = modifier2;
                final boolean z1111 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo117 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i11117 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j1110, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11118) {
                        if ((i11118 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i11118, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier119, z, mutableInteractionSource1110, indicationM1288rememberRipple9IZ8Weo117, z1111, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i11119 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i111110 = i11119 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i111110 & 112) | (i111110 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i111111 = ((((i11119 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i111111 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11119 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i11117 & 112) | (i11117 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier119;
                z4 = z1111;
                mutableInteractionSource3 = mutableInteractionSource1110;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j1110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                public final void invoke(@Nullable Composer composer2, int i11118) {
                    TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) == 0) {
            int i11118 = i3;
            if ((i2 & 32) == 0) {
                i12 = 65536;
            } else {
                i12 = 65536;
            }
            i8 = i11118 | i12;
        } else {
            i8 = i3;
        }
        if ((i & 3670016) == 0) {
            jM1680copywmQWz5c$default = j2;
            if ((i2 & 64) == 0) {
                i11 = 524288;
            } else {
                i11 = 524288;
            }
            i8 |= i11;
        } else {
            jM1680copywmQWz5c$default = j2;
        }
        if ((i2 & 128) != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
            }
            if ((23967451 & i8) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource1111 = mutableInteractionSource2;
                long j1111 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier1110 = modifier2;
                final boolean z1112 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo118 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i11119 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j1111, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i111110) {
                        if ((i111110 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i111110, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier1110, z, mutableInteractionSource1111, indicationM1288rememberRipple9IZ8Weo118, z1112, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i111111 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i111112 = i111111 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i111112 & 112) | (i111112 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i111113 = ((((i111111 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i111113 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111111 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i11119 & 112) | (i11119 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier1110;
                z4 = z1112;
                mutableInteractionSource3 = mutableInteractionSource1111;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j1111;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 32) != 0) {
                        jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                        i8 &= -458753;
                    } else {
                        jM1691unboximpl = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i8 &= -3670017;
                    }
                }
                final MutableInteractionSource mutableInteractionSource1112 = mutableInteractionSource2;
                long j1112 = jM1680copywmQWz5c$default;
                i10 = i8;
                final Modifier modifier1111 = modifier2;
                final boolean z1113 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                final Indication indicationM1288rememberRipple9IZ8Weo119 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
                int i111110 = i10 >> 15;
                m1220TabTransitionKlgxPg(jM1691unboximpl, j1112, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i111111) {
                        if ((i111111 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1237246709, i111111, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier1111, z, mutableInteractionSource1112, indicationM1288rememberRipple9IZ8Weo119, z1113, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i111112 = ((i10 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        int i111113 = i111112 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i111113 & 112) | (i111113 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        int i111114 = ((((i111112 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i111114 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111112 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i111110 & 112) | (i111110 & 14) | 3072 | ((i10 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier1111;
                z4 = z1113;
                mutableInteractionSource3 = mutableInteractionSource1112;
                j3 = jM1691unboximpl;
                jM1680copywmQWz5c$default = j1112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

                public final void invoke(@Nullable Composer composer2, int i111111) {
                    TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i9 = 12582912;
        i8 |= i9;
        if ((23967451 & i8) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 32) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -458753;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & 64) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i8 &= -3670017;
                }
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 32) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -458753;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & 64) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i8 &= -3670017;
                }
            }
            final MutableInteractionSource mutableInteractionSource1113 = mutableInteractionSource2;
            long j1113 = jM1680copywmQWz5c$default;
            i10 = i8;
            final Modifier modifier1112 = modifier2;
            final boolean z1114 = z3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
            }
            final Indication indicationM1288rememberRipple9IZ8Weo1110 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
            int i111111 = i10 >> 15;
            m1220TabTransitionKlgxPg(jM1691unboximpl, j1113, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i111112) {
                    if ((i111112 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1237246709, i111112, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier1112, z, mutableInteractionSource1113, indicationM1288rememberRipple9IZ8Weo1110, z1114, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                    int i111113 = ((i10 >> 12) & 7168) | 432;
                    composer2.startReplaceableGroup(-483455358);
                    int i111114 = i111113 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i111114 & 112) | (i111114 & 14));
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    int i111115 = ((((i111113 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o((i111115 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111113 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i111111 & 112) | (i111111 & 14) | 3072 | ((i10 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1112;
            z4 = z1114;
            mutableInteractionSource3 = mutableInteractionSource1113;
            j3 = jM1691unboximpl;
            jM1680copywmQWz5c$default = j1113;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 32) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -458753;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & 64) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i8 &= -3670017;
                }
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 32) != 0) {
                    jM1691unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
                    i8 &= -458753;
                } else {
                    jM1691unboximpl = j;
                }
                if ((i2 & 64) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1691unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i8 &= -3670017;
                }
            }
            final MutableInteractionSource mutableInteractionSource1114 = mutableInteractionSource2;
            long j1114 = jM1680copywmQWz5c$default;
            i10 = i8;
            final Modifier modifier1113 = modifier2;
            final boolean z1115 = z3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713679175, i10, -1, "androidx.compose.material.Tab (Tab.kt:222)");
            }
            final Indication indicationM1288rememberRipple9IZ8Weo1111 = RippleKt.m1288rememberRipple9IZ8Weo(true, 0.0f, jM1691unboximpl, composerStartRestartGroup, ((i10 >> 9) & 896) | 6, 2);
            int i111112 = i10 >> 15;
            m1220TabTransitionKlgxPg(jM1691unboximpl, j1114, z, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i111113) {
                    if ((i111113 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1237246709, i111113, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m700selectableO2vRcR0(modifier1113, z, mutableInteractionSource1114, indicationM1288rememberRipple9IZ8Weo1111, z1115, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                    int i111114 = ((i10 >> 12) & 7168) | 432;
                    composer2.startReplaceableGroup(-483455358);
                    int i111115 = i111114 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i111115 & 112) | (i111115 & 14));
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    int i111116 = ((((i111114 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o((i111116 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111114 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i111112 & 112) | (i111112 & 14) | 3072 | ((i10 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1113;
            z4 = z1115;
            mutableInteractionSource3 = mutableInteractionSource1114;
            j3 = jM1691unboximpl;
            jM1680copywmQWz5c$default = j1114;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
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

            public final void invoke(@Nullable Composer composer2, int i111113) {
                TabKt.m1219TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j3, jM1680copywmQWz5c$default, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1249848471);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249848471, i2, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.TabKt.TabBaselineLayout.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo3measure3p2s80s(@NotNull final MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                    Placeable placeableMo2804measureBRTryo0;
                    final Placeable placeableMo2804measureBRTryo1;
                    Measurable measurable;
                    Measurable measurable2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (function2 != null) {
                        Iterator<T> it = measurables.iterator();
                        do {
                            if (!it.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            measurable2 = (Measurable) it.next();
                        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), ViewHierarchyConstants.TEXT_KEY));
                        placeableMo2804measureBRTryo0 = measurable2.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    } else {
                        placeableMo2804measureBRTryo0 = null;
                    }
                    if (function3 != null) {
                        Iterator<T> it2 = measurables.iterator();
                        do {
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            measurable = (Measurable) it2.next();
                        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon"));
                        placeableMo2804measureBRTryo1 = measurable.mo2804measureBRTryo0(j);
                    } else {
                        placeableMo2804measureBRTryo1 = null;
                    }
                    final int iMax = Math.max(placeableMo2804measureBRTryo0 != null ? placeableMo2804measureBRTryo0.getWidth() : 0, placeableMo2804measureBRTryo1 != null ? placeableMo2804measureBRTryo1.getWidth() : 0);
                    final int iMo320roundToPx0680j_4 = Layout.mo320roundToPx0680j_4((placeableMo2804measureBRTryo0 == null || placeableMo2804measureBRTryo1 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                    final Integer numValueOf = placeableMo2804measureBRTryo0 != null ? Integer.valueOf(placeableMo2804measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null;
                    final Integer numValueOf2 = placeableMo2804measureBRTryo0 != null ? Integer.valueOf(placeableMo2804measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null;
                    final Placeable placeable = placeableMo2804measureBRTryo0;
                    return MeasureScope.CC.OooOOo0(Layout, iMax, iMo320roundToPx0680j_4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$measure$1
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
                            Placeable placeable2;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable placeable3 = placeable;
                            if (placeable3 == null || (placeable2 = placeableMo2804measureBRTryo1) == null) {
                                if (placeable3 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable3, iMo320roundToPx0680j_4);
                                    return;
                                }
                                Placeable placeable4 = placeableMo2804measureBRTryo1;
                                if (placeable4 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable4, iMo320roundToPx0680j_4);
                                    return;
                                }
                                return;
                            }
                            MeasureScope measureScope = Layout;
                            int i3 = iMax;
                            int i4 = iMo320roundToPx0680j_4;
                            Integer num = numValueOf;
                            Intrinsics.checkNotNull(num);
                            int iIntValue = num.intValue();
                            Integer num2 = numValueOf2;
                            Intrinsics.checkNotNull(num2);
                            TabKt.placeTextAndIcon(layout, measureScope, placeable3, placeable2, i3, i4, iIntValue, num2.intValue());
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list, i3);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m1327setimpl(composerM1320constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1327setimpl(composerM1320constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2141028452);
            if (function2 != null) {
                Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, ViewHierarchyConstants.TEXT_KEY), HorizontalTextPadding, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                OooO00o.OooO00o(i2 & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(448373045);
            if (function3 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                OooO00o.OooO00o((i2 >> 3) & 14, function3, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt.TabBaselineLayout.3
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                TabKt.TabBaselineLayout(function2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* JADX INFO: renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1220TabTransitionKlgxPg(final long j, final long j2, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-405571117);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-405571117, i2, -1, "androidx.compose.material.TabTransition (Tab.kt:262)");
            }
            int i3 = i2 >> 6;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i4) {
                    if (Oooo0.OooO00o(segment, "$this$animateColor", composer2, -2120892502)) {
                        ComposerKt.traceEventStart(-2120892502, i4, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:270)");
                    }
                    TweenSpec tweenSpecTween = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween(TextFieldImplKt.AnimationDuration, 100, EasingKt.getLinearEasing()) : AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tweenSpecTween;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j3 = zBooleanValue ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            ColorSpace colorSpaceM1685getColorSpaceimpl = Color.m1685getColorSpaceimpl(j3);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM1685getColorSpaceimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1685getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j4 = zBooleanValue2 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM1671boximpl = Color.m1671boximpl(j4);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j5 = zBooleanValue3 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM1671boximpl, Color.m1671boximpl(j5), tabKt$TabTransition$color$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, ShareRequest.THUMB_DATA_SIZE_LIMIT);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(Color.m1680copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$5(stateCreateTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(TabTransition_Klgx_Pg$lambda$5(stateCreateTransitionAnimation))))}, function2, composerStartRestartGroup, (i3 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabTransition$1
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
                TabKt.m1220TabTransitionKlgxPg(j, j2, z, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        int iMo320roundToPx0680j_4 = density.mo320roundToPx0680j_4(TabRowDefaults.INSTANCE.m1228getIndicatorHeightD9Ej5fM()) + density.mo320roundToPx0680j_4(i3 == i4 ? SingleLineTextBaselineWithIcon : DoubleLineTextBaselineWithIcon);
        int iMo319roundToPxR2X_6o = (density.mo319roundToPxR2X_6o(IconDistanceFromBaseline) + placeable2.getHeight()) - i3;
        int i5 = (i2 - i4) - iMo320roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - iMo319roundToPxR2X_6o, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
    }
}
