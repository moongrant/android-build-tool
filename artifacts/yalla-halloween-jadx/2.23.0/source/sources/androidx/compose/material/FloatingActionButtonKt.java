package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ar\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", ViewHierarchyConstants.TEXT_KEY, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,336:1\n25#2:337\n25#2:344\n1114#3,6:338\n1114#3,6:345\n154#4:351\n154#4:352\n154#4:353\n154#4:354\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n*L\n85#1:337\n152#1:344\n85#1:338,6\n152#1:345,6\n332#1:351\n333#1:352\n334#1:353\n335#1:354\n*E\n"})
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m3765constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m3765constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m3765constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m3765constructorimpl(20);

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0182  */
    /* JADX WARN: Code duplicated, block: B:124:0x0185  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018d  */
    /* JADX WARN: Code duplicated, block: B:131:0x019f  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:141:0x01db  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:152:0x0233  */
    /* JADX WARN: Code duplicated, block: B:155:0x029e  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    public static final void m1100ExtendedFloatingActionButtonwqdebIU(@NotNull final Function2<? super Composer, ? super Integer, Unit> text, @NotNull final Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        long j3;
        int i8;
        FloatingActionButtonElevation floatingActionButtonElevationM1099elevationxZ9QkE;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function4;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeCopy;
        long jM1025getSecondary0d7_KjU;
        long jM1041contentColorForek8zF_U;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape2;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long j5;
        Modifier modifier4;
        final int i9;
        Object objRememberedValue;
        final Modifier modifier5;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape3;
        final long j6;
        final long j7;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555720195);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i & 458752) != 0) {
                        i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                    }
                    if ((i & 3670016) == 0) {
                        j3 = j;
                        if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j3)) {
                            i11 = 524288;
                        } else {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        }
                        i3 |= i11;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) == 0) {
                        int i13 = i3;
                        if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) {
                            i10 = Configuration.BLOCK_SIZE;
                        } else {
                            i10 = 8388608;
                        }
                        i8 = i13 | i10;
                    } else {
                        i8 = i3;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                            int i14 = composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE) ? 67108864 : 33554432;
                            i8 |= i14;
                        } else {
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                        }
                        i8 |= i14;
                    } else {
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    if ((i8 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i8 &= -458753;
                            } else {
                                shapeCopy = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                                i8 &= -3670017;
                            } else {
                                jM1025getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                                i8 &= -29360129;
                            } else {
                                jM1041contentColorForek8zF_U = j2;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                                i8 &= -234881025;
                            }
                            function5 = function4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape2 = shapeCopy;
                            j4 = jM1025getSecondary0d7_KjU;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                            j5 = jM1041contentColorForek8zF_U;
                            int i15 = i8;
                            modifier4 = modifier3;
                            i9 = i15;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i8 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i8 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i8 &= -29360129;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i8 &= -234881025;
                            }
                            shape2 = shape;
                            j5 = j2;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            j4 = j3;
                            i9 = i8;
                            modifier4 = modifier2;
                            function5 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                        }
                        float f = ExtendedFabSize;
                        Modifier modifierM527sizeInqDBjuR0$default = SizeKt.m527sizeInqDBjuR0$default(modifier4, f, f, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                    ComposerKt.traceEventStart(1418981691, i16, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                                }
                                float f2 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f2, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function7 = function5;
                                int i17 = i9;
                                Function2<Composer, Integer, Unit> function8 = text;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223598);
                                if (function7 != null) {
                                    function7.invoke(composer2, Integer.valueOf((i17 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                }
                                composer2.endReplaceableGroup();
                                function8.invoke(composer2, Integer.valueOf(i17 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i16 = ((i9 >> 3) & 14) | 12582912;
                        int i17 = i9 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function7 = function5;
                        m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda, composerStartRestartGroup, (i17 & 896) | i16 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        function6 = function7;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape3 = shape2;
                        j6 = j4;
                        j7 = j5;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        shape3 = shape;
                        modifier5 = modifier2;
                        function6 = function3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        j6 = j3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j7 = j2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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
                            FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) == 0) {
                    int i18 = i3;
                    if ((i2 & 128) == 0) {
                        i10 = Configuration.BLOCK_SIZE;
                    } else {
                        i10 = Configuration.BLOCK_SIZE;
                    }
                    i8 = i18 | i10;
                } else {
                    i8 = i3;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE)) {
                        }
                        i8 |= i14;
                    } else {
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    i8 |= i14;
                } else {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                }
                if ((i8 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i19 = i8;
                        modifier4 = modifier3;
                        i9 = i19;
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i110 = i8;
                        modifier4 = modifier3;
                        i9 = i110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f2 = ExtendedFabSize;
                    Modifier modifierM527sizeInqDBjuR0$default2 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f2, f2, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                ComposerKt.traceEventStart(1418981691, i111, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                            }
                            float f3 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f3, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function8 = function5;
                            int i112 = i9;
                            Function2<Composer, Integer, Unit> function9 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223598);
                            if (function8 != null) {
                                function8.invoke(composer2, Integer.valueOf((i112 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function9.invoke(composer2, Integer.valueOf(i112 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i111 = ((i9 >> 3) & 14) | 12582912;
                    int i112 = i9 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                    m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default2, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda2, composerStartRestartGroup, (i112 & 896) | i111 | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function8;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j6 = j4;
                    j7 = j5;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i113 = i8;
                        modifier4 = modifier3;
                        i9 = i113;
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i114 = i8;
                        modifier4 = modifier3;
                        i9 = i114;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f3 = ExtendedFabSize;
                    Modifier modifierM527sizeInqDBjuR0$default3 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f3, f3, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                ComposerKt.traceEventStart(1418981691, i115, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                            }
                            float f4 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f4, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function9 = function5;
                            int i116 = i9;
                            Function2<Composer, Integer, Unit> function10 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223598);
                            if (function9 != null) {
                                function9.invoke(composer2, Integer.valueOf((i116 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function10.invoke(composer2, Integer.valueOf(i116 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i115 = ((i9 >> 3) & 14) | 12582912;
                    int i116 = i9 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                    m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default3, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda3, composerStartRestartGroup, (i116 & 896) | i115 | (i116 & 7168) | (57344 & i116) | (458752 & i116) | (i116 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function9;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j6 = j4;
                    j7 = j5;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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

                    public final void invoke(@Nullable Composer composer2, int i117) {
                        FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function3 = function2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i & 458752) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) == 0) {
                    int i117 = i3;
                    if ((i2 & 128) == 0) {
                        i10 = Configuration.BLOCK_SIZE;
                    } else {
                        i10 = Configuration.BLOCK_SIZE;
                    }
                    i8 = i117 | i10;
                } else {
                    i8 = i3;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE)) {
                        }
                        i8 |= i14;
                    } else {
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    i8 |= i14;
                } else {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                }
                if ((i8 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i118 = i8;
                        modifier4 = modifier3;
                        i9 = i118;
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i119 = i8;
                        modifier4 = modifier3;
                        i9 = i119;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f4 = ExtendedFabSize;
                    Modifier modifierM527sizeInqDBjuR0$default4 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f4, f4, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                ComposerKt.traceEventStart(1418981691, i1110, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                            }
                            float f5 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f5, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function10 = function5;
                            int i1111 = i9;
                            Function2<Composer, Integer, Unit> function11 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223598);
                            if (function10 != null) {
                                function10.invoke(composer2, Integer.valueOf((i1111 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function11.invoke(composer2, Integer.valueOf(i1111 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1110 = ((i9 >> 3) & 14) | 12582912;
                    int i1111 = i9 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function10 = function5;
                    m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default4, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda4, composerStartRestartGroup, (i1111 & 896) | i1110 | (i1111 & 7168) | (57344 & i1111) | (458752 & i1111) | (i1111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function10;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j6 = j4;
                    j7 = j5;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i1112 = i8;
                        modifier4 = modifier3;
                        i9 = i1112;
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i1113 = i8;
                        modifier4 = modifier3;
                        i9 = i1113;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f5 = ExtendedFabSize;
                    Modifier modifierM527sizeInqDBjuR0$default5 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f5, f5, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                        public final void invoke(@Nullable Composer composer2, int i1114) {
                            if ((i1114 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1418981691, i1114, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                            }
                            float f6 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f6, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function11 = function5;
                            int i1115 = i9;
                            Function2<Composer, Integer, Unit> function12 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223598);
                            if (function11 != null) {
                                function11.invoke(composer2, Integer.valueOf((i1115 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function12.invoke(composer2, Integer.valueOf(i1115 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1114 = ((i9 >> 3) & 14) | 12582912;
                    int i1115 = i9 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function11 = function5;
                    m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default5, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda5, composerStartRestartGroup, (i1115 & 896) | i1114 | (i1115 & 7168) | (57344 & i1115) | (458752 & i1115) | (i1115 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function11;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j6 = j4;
                    j7 = j5;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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
                        FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i & 3670016) == 0) {
                j3 = j;
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((i & 29360128) == 0) {
                int i1116 = i3;
                if ((i2 & 128) == 0) {
                    i10 = Configuration.BLOCK_SIZE;
                } else {
                    i10 = Configuration.BLOCK_SIZE;
                }
                i8 = i1116 | i10;
            } else {
                i8 = i3;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE)) {
                    }
                    i8 |= i14;
                } else {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                }
                i8 |= i14;
            } else {
                floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
            }
            if ((i8 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i1117 = i8;
                    modifier4 = modifier3;
                    i9 = i1117;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i1118 = i8;
                    modifier4 = modifier3;
                    i9 = i1118;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f6 = ExtendedFabSize;
                Modifier modifierM527sizeInqDBjuR0$default6 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f6, f6, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                            ComposerKt.traceEventStart(1418981691, i1119, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                        }
                        float f7 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f7, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function12 = function5;
                        int i11110 = i9;
                        Function2<Composer, Integer, Unit> function13 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223598);
                        if (function12 != null) {
                            function12.invoke(composer2, Integer.valueOf((i11110 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function13.invoke(composer2, Integer.valueOf(i11110 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1119 = ((i9 >> 3) & 14) | 12582912;
                int i11110 = i9 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function12 = function5;
                m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default6, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda6, composerStartRestartGroup, (i11110 & 896) | i1119 | (i11110 & 7168) | (57344 & i11110) | (458752 & i11110) | (i11110 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function12;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j6 = j4;
                j7 = j5;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i11111 = i8;
                    modifier4 = modifier3;
                    i9 = i11111;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i11112 = i8;
                    modifier4 = modifier3;
                    i9 = i11112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f7 = ExtendedFabSize;
                Modifier modifierM527sizeInqDBjuR0$default7 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f7, f7, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                            ComposerKt.traceEventStart(1418981691, i11113, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                        }
                        float f8 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f8, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function13 = function5;
                        int i11114 = i9;
                        Function2<Composer, Integer, Unit> function14 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223598);
                        if (function13 != null) {
                            function13.invoke(composer2, Integer.valueOf((i11114 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function14.invoke(composer2, Integer.valueOf(i11114 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11113 = ((i9 >> 3) & 14) | 12582912;
                int i11114 = i9 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function13 = function5;
                m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default7, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda7, composerStartRestartGroup, (i11114 & 896) | i11113 | (i11114 & 7168) | (57344 & i11114) | (458752 & i11114) | (i11114 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function13;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j6 = j4;
                j7 = j5;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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
                    FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i & 458752) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) == 0) {
                    int i11115 = i3;
                    if ((i2 & 128) == 0) {
                        i10 = Configuration.BLOCK_SIZE;
                    } else {
                        i10 = Configuration.BLOCK_SIZE;
                    }
                    i8 = i11115 | i10;
                } else {
                    i8 = i3;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE)) {
                        }
                        i8 |= i14;
                    } else {
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    i8 |= i14;
                } else {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                }
                if ((i8 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i11116 = i8;
                        modifier4 = modifier3;
                        i9 = i11116;
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i11117 = i8;
                        modifier4 = modifier3;
                        i9 = i11117;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f8 = ExtendedFabSize;
                    Modifier modifierM527sizeInqDBjuR0$default8 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f8, f8, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                ComposerKt.traceEventStart(1418981691, i11118, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                            }
                            float f9 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f9, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function14 = function5;
                            int i11119 = i9;
                            Function2<Composer, Integer, Unit> function15 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223598);
                            if (function14 != null) {
                                function14.invoke(composer2, Integer.valueOf((i11119 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function15.invoke(composer2, Integer.valueOf(i11119 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i11118 = ((i9 >> 3) & 14) | 12582912;
                    int i11119 = i9 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function14 = function5;
                    m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default8, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda8, composerStartRestartGroup, (i11119 & 896) | i11118 | (i11119 & 7168) | (57344 & i11119) | (458752 & i11119) | (i11119 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j6 = j4;
                    j7 = j5;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i111110 = i8;
                        modifier4 = modifier3;
                        i9 = i111110;
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i8 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            i8 &= -3670017;
                        } else {
                            jM1025getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                            i8 &= -29360129;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i8 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j4 = jM1025getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        j5 = jM1041contentColorForek8zF_U;
                        int i111111 = i8;
                        modifier4 = modifier3;
                        i9 = i111111;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f9 = ExtendedFabSize;
                    Modifier modifierM527sizeInqDBjuR0$default9 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f9, f9, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                ComposerKt.traceEventStart(1418981691, i111112, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                            }
                            float f10 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f10, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function15 = function5;
                            int i111113 = i9;
                            Function2<Composer, Integer, Unit> function16 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223598);
                            if (function15 != null) {
                                function15.invoke(composer2, Integer.valueOf((i111113 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function16.invoke(composer2, Integer.valueOf(i111113 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i111112 = ((i9 >> 3) & 14) | 12582912;
                    int i111113 = i9 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function15 = function5;
                    m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default9, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda9, composerStartRestartGroup, (i111113 & 896) | i111112 | (i111113 & 7168) | (57344 & i111113) | (458752 & i111113) | (i111113 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function15;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j6 = j4;
                    j7 = j5;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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

                    public final void invoke(@Nullable Composer composer2, int i111114) {
                        FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i & 3670016) == 0) {
                j3 = j;
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((i & 29360128) == 0) {
                int i111114 = i3;
                if ((i2 & 128) == 0) {
                    i10 = Configuration.BLOCK_SIZE;
                } else {
                    i10 = Configuration.BLOCK_SIZE;
                }
                i8 = i111114 | i10;
            } else {
                i8 = i3;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE)) {
                    }
                    i8 |= i14;
                } else {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                }
                i8 |= i14;
            } else {
                floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
            }
            if ((i8 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i111115 = i8;
                    modifier4 = modifier3;
                    i9 = i111115;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i111116 = i8;
                    modifier4 = modifier3;
                    i9 = i111116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f10 = ExtendedFabSize;
                Modifier modifierM527sizeInqDBjuR0$default10 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f10, f10, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                    public final void invoke(@Nullable Composer composer2, int i111117) {
                        if ((i111117 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1418981691, i111117, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                        }
                        float f11 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f11, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function16 = function5;
                        int i111118 = i9;
                        Function2<Composer, Integer, Unit> function17 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223598);
                        if (function16 != null) {
                            function16.invoke(composer2, Integer.valueOf((i111118 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function17.invoke(composer2, Integer.valueOf(i111118 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i111117 = ((i9 >> 3) & 14) | 12582912;
                int i111118 = i9 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function16 = function5;
                m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default10, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda10, composerStartRestartGroup, (i111118 & 896) | i111117 | (i111118 & 7168) | (57344 & i111118) | (458752 & i111118) | (i111118 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function16;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j6 = j4;
                j7 = j5;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i111119 = i8;
                    modifier4 = modifier3;
                    i9 = i111119;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i1111110 = i8;
                    modifier4 = modifier3;
                    i9 = i1111110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f11 = ExtendedFabSize;
                Modifier modifierM527sizeInqDBjuR0$default11 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f11, f11, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                    public final void invoke(@Nullable Composer composer2, int i1111111) {
                        if ((i1111111 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1418981691, i1111111, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                        }
                        float f12 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f12, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function17 = function5;
                        int i1111112 = i9;
                        Function2<Composer, Integer, Unit> function18 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223598);
                        if (function17 != null) {
                            function17.invoke(composer2, Integer.valueOf((i1111112 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function18.invoke(composer2, Integer.valueOf(i1111112 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1111111 = ((i9 >> 3) & 14) | 12582912;
                int i1111112 = i9 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function17 = function5;
                m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default11, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda11, composerStartRestartGroup, (i1111112 & 896) | i1111111 | (i1111112 & 7168) | (57344 & i1111112) | (458752 & i1111112) | (i1111112 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function17;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j6 = j4;
                j7 = j5;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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

                public final void invoke(@Nullable Composer composer2, int i1111113) {
                    FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        function3 = function2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i & 458752) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i & 3670016) == 0) {
                j3 = j;
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((i & 29360128) == 0) {
                int i1111113 = i3;
                if ((i2 & 128) == 0) {
                    i10 = Configuration.BLOCK_SIZE;
                } else {
                    i10 = Configuration.BLOCK_SIZE;
                }
                i8 = i1111113 | i10;
            } else {
                i8 = i3;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE)) {
                    }
                    i8 |= i14;
                } else {
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                }
                i8 |= i14;
            } else {
                floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
            }
            if ((i8 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i1111114 = i8;
                    modifier4 = modifier3;
                    i9 = i1111114;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i1111115 = i8;
                    modifier4 = modifier3;
                    i9 = i1111115;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f12 = ExtendedFabSize;
                Modifier modifierM527sizeInqDBjuR0$default12 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f12, f12, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                    public final void invoke(@Nullable Composer composer2, int i1111116) {
                        if ((i1111116 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1418981691, i1111116, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                        }
                        float f13 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f13, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function18 = function5;
                        int i1111117 = i9;
                        Function2<Composer, Integer, Unit> function19 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223598);
                        if (function18 != null) {
                            function18.invoke(composer2, Integer.valueOf((i1111117 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function19.invoke(composer2, Integer.valueOf(i1111117 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1111116 = ((i9 >> 3) & 14) | 12582912;
                int i1111117 = i9 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function18 = function5;
                m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default12, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda12, composerStartRestartGroup, (i1111117 & 896) | i1111116 | (i1111117 & 7168) | (57344 & i1111117) | (458752 & i1111117) | (i1111117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function18;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j6 = j4;
                j7 = j5;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i1111118 = i8;
                    modifier4 = modifier3;
                    i9 = i1111118;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i8 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        i8 &= -3670017;
                    } else {
                        jM1025getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                        i8 &= -29360129;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i8 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j4 = jM1025getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    j5 = jM1041contentColorForek8zF_U;
                    int i1111119 = i8;
                    modifier4 = modifier3;
                    i9 = i1111119;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f13 = ExtendedFabSize;
                Modifier modifierM527sizeInqDBjuR0$default13 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f13, f13, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                    public final void invoke(@Nullable Composer composer2, int i11111110) {
                        if ((i11111110 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1418981691, i11111110, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                        }
                        float f14 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f14, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function19 = function5;
                        int i11111111 = i9;
                        Function2<Composer, Integer, Unit> function110 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223598);
                        if (function19 != null) {
                            function19.invoke(composer2, Integer.valueOf((i11111111 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function110.invoke(composer2, Integer.valueOf(i11111111 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11111110 = ((i9 >> 3) & 14) | 12582912;
                int i11111111 = i9 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function19 = function5;
                m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default13, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda13, composerStartRestartGroup, (i11111111 & 896) | i11111110 | (i11111111 & 7168) | (57344 & i11111111) | (458752 & i11111111) | (i11111111 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function19;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j6 = j4;
                j7 = j5;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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

                public final void invoke(@Nullable Composer composer2, int i11111112) {
                    FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) != 0) {
            i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
        }
        if ((i & 3670016) == 0) {
            j3 = j;
            if ((i2 & 64) == 0) {
                i11 = 524288;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        } else {
            j3 = j;
        }
        if ((i & 29360128) == 0) {
            int i11111112 = i3;
            if ((i2 & 128) == 0) {
                i10 = Configuration.BLOCK_SIZE;
            } else {
                i10 = Configuration.BLOCK_SIZE;
            }
            i8 = i11111112 | i10;
        } else {
            i8 = i3;
        }
        if ((i & 234881024) == 0) {
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevationM1099elevationxZ9QkE)) {
                }
                i8 |= i14;
            } else {
                floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
            }
            i8 |= i14;
        } else {
            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation;
        }
        if ((i8 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i8 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i2 & 64) != 0) {
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    i8 &= -3670017;
                } else {
                    jM1025getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                    i8 &= -29360129;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i8 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j4 = jM1025getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                j5 = jM1041contentColorForek8zF_U;
                int i11111113 = i8;
                modifier4 = modifier3;
                i9 = i11111113;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i8 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i2 & 64) != 0) {
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    i8 &= -3670017;
                } else {
                    jM1025getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                    i8 &= -29360129;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i8 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j4 = jM1025getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                j5 = jM1041contentColorForek8zF_U;
                int i11111114 = i8;
                modifier4 = modifier3;
                i9 = i11111114;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
            }
            float f14 = ExtendedFabSize;
            Modifier modifierM527sizeInqDBjuR0$default14 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f14, f14, 0.0f, 0.0f, 12, null);
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                public final void invoke(@Nullable Composer composer2, int i11111115) {
                    if ((i11111115 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1418981691, i11111115, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                    }
                    float f15 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f15, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function110 = function5;
                    int i11111116 = i9;
                    Function2<Composer, Integer, Unit> function111 = text;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1435223598);
                    if (function110 != null) {
                        function110.invoke(composer2, Integer.valueOf((i11111116 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function111.invoke(composer2, Integer.valueOf(i11111116 & 14));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11111115 = ((i9 >> 3) & 14) | 12582912;
            int i11111116 = i9 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function110 = function5;
            m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default14, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda14, composerStartRestartGroup, (i11111116 & 896) | i11111115 | (i11111116 & 7168) | (57344 & i11111116) | (458752 & i11111116) | (i11111116 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            function6 = function110;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape3 = shape2;
            j6 = j4;
            j7 = j5;
            floatingActionButtonElevation3 = floatingActionButtonElevation2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i8 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i2 & 64) != 0) {
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    i8 &= -3670017;
                } else {
                    jM1025getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                    i8 &= -29360129;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i8 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j4 = jM1025getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                j5 = jM1041contentColorForek8zF_U;
                int i11111117 = i8;
                modifier4 = modifier3;
                i9 = i11111117;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i8 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i2 & 64) != 0) {
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    i8 &= -3670017;
                } else {
                    jM1025getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i8 >> 18) & 14);
                    i8 &= -29360129;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i8 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j4 = jM1025getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM1099elevationxZ9QkE;
                j5 = jM1041contentColorForek8zF_U;
                int i11111118 = i8;
                modifier4 = modifier3;
                i9 = i11111118;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555720195, i9, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
            }
            float f15 = ExtendedFabSize;
            Modifier modifierM527sizeInqDBjuR0$default15 = SizeKt.m527sizeInqDBjuR0$default(modifier4, f15, f15, 0.0f, 0.0f, 12, null);
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                public final void invoke(@Nullable Composer composer2, int i11111119) {
                    if ((i11111119 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1418981691, i11111119, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                    }
                    float f16 = function5 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f16, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function111 = function5;
                    int i111111110 = i9;
                    Function2<Composer, Integer, Unit> function112 = text;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1435223598);
                    if (function111 != null) {
                        function111.invoke(composer2, Integer.valueOf((i111111110 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function112.invoke(composer2, Integer.valueOf(i111111110 & 14));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11111119 = ((i9 >> 3) & 14) | 12582912;
            int i111111110 = i9 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function111 = function5;
            m1101FloatingActionButtonbogVsAg(onClick, modifierM527sizeInqDBjuR0$default15, mutableInteractionSource4, shape2, j4, j5, floatingActionButtonElevation2, composableLambda15, composerStartRestartGroup, (i111111110 & 896) | i11111119 | (i111111110 & 7168) | (57344 & i111111110) | (458752 & i111111110) | (i111111110 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            function6 = function111;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape3 = shape2;
            j6 = j4;
            j7 = j5;
            floatingActionButtonElevation3 = floatingActionButtonElevation2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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

            public final void invoke(@Nullable Composer composer2, int i111111111) {
                FloatingActionButtonKt.m1100ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j6, j7, floatingActionButtonElevation3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:113:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x014d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:139:0x026a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0280  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0120  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    public static final void m1101FloatingActionButtonbogVsAg(@NotNull final Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        int i5;
        Shape shapeCopy;
        final long jM1041contentColorForek8zF_U;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        int i6;
        int i7;
        long jM1025getSecondary0d7_KjU;
        long j3;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        final long j4;
        FloatingActionButtonElevation floatingActionButtonElevationM1099elevationxZ9QkE;
        Object objRememberedValue;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final long j5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1028985328);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shapeCopy = shape;
                        if (composerStartRestartGroup.changed(shapeCopy)) {
                            i9 = 2048;
                        }
                        i3 |= i9;
                    } else {
                        shapeCopy = shape;
                    }
                    i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    i3 |= i9;
                } else {
                    shapeCopy = shape;
                }
                if ((i & 57344) != 0) {
                    i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
                }
                if ((i & 458752) == 0) {
                    jM1041contentColorForek8zF_U = j2;
                    if ((i2 & 32) == 0 || !composerStartRestartGroup.changed(jM1041contentColorForek8zF_U)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i3 |= i8;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        int i11 = composerStartRestartGroup.changed(floatingActionButtonElevation2) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
                        i3 |= i11;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i3 |= i11;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i6 = 8388608;
                        } else {
                            i6 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            }
                            if ((i2 & 16) != 0) {
                                i7 = i3 & (-57345);
                                jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                            } else {
                                i7 = i3;
                                jM1025getSecondary0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                                i7 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                j3 = jM1025getSecondary0d7_KjU;
                                i3 = i7 & (-3670017);
                                modifier3 = modifier2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = shapeCopy;
                                j4 = jM1041contentColorForek8zF_U;
                                floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            } else {
                                j3 = jM1025getSecondary0d7_KjU;
                                i3 = i7;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                            }
                            long j6 = j4;
                            FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationM1099elevationxZ9QkE;
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            Modifier modifier5 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                                }
                            }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                                    final Function2<Composer, Integer, Unit> function2 = content;
                                    final int i13 = i3;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i14) {
                                            if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                            }
                                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                            final Function2<Composer, Integer, Unit> function3 = function2;
                                            final int i15 = i13;
                                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i16) {
                                                    if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                                    }
                                                    Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    Function2<Composer, Integer, Unit> function4 = function3;
                                                    int i17 = i15;
                                                    composer5.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                    Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), composer4, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 56);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource5;
                            shape3 = shape2;
                            j5 = j3;
                            modifier4 = modifier5;
                            jM1041contentColorForek8zF_U = j6;
                            floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            j3 = j;
                        }
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                        }
                        long j7 = j4;
                        FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationM1099elevationxZ9QkE;
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                        Modifier modifier6 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                            }
                        }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                                final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                                final int i13 = i3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                        if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                        }
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                        final int i15 = i13;
                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i16) {
                                                if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                                }
                                                Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                                Alignment center = Alignment.INSTANCE.getCenter();
                                                Function2<Composer, Integer, Unit> function4 = function3;
                                                int i17 = i15;
                                                composer5.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer4, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource6;
                        shape3 = shape2;
                        j5 = j3;
                        modifier4 = modifier6;
                        jM1041contentColorForek8zF_U = j7;
                        floatingActionButtonElevation2 = floatingActionButtonElevation4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        shape3 = shapeCopy;
                        composer2 = composerStartRestartGroup;
                        j5 = j;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i12) {
                            FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i6 = 12582912;
                i3 |= i6;
                if ((23967451 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j8 = j4;
                    FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                    Modifier modifier7 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                        }
                    }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource7, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i13 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i14) {
                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                    final int i15 = i13;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i16) {
                                            if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                            }
                                            Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function4 = function3;
                                            int i17 = i15;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource7;
                    shape3 = shape2;
                    j5 = j3;
                    modifier4 = modifier7;
                    jM1041contentColorForek8zF_U = j8;
                    floatingActionButtonElevation2 = floatingActionButtonElevation5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j9 = j4;
                    FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource3;
                    Modifier modifier8 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                        }
                    }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource8, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i13 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i14) {
                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                    final int i15 = i13;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i16) {
                                            if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                            }
                                            Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function4 = function3;
                                            int i17 = i15;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource8;
                    shape3 = shape2;
                    j5 = j3;
                    modifier4 = modifier8;
                    jM1041contentColorForek8zF_U = j9;
                    floatingActionButtonElevation2 = floatingActionButtonElevation6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i12) {
                        FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    shapeCopy = shape;
                    if (composerStartRestartGroup.changed(shapeCopy)) {
                        i9 = 2048;
                    }
                    i3 |= i9;
                } else {
                    shapeCopy = shape;
                }
                i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i9;
            } else {
                shapeCopy = shape;
            }
            if ((i & 57344) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i & 458752) == 0) {
                jM1041contentColorForek8zF_U = j2;
                if ((i2 & 32) == 0) {
                    i8 = 65536;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            } else {
                jM1041contentColorForek8zF_U = j2;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i3 |= i11;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i3 |= i11;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 8388608;
                    } else {
                        i6 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j10 = j4;
                    FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource3;
                    Modifier modifier9 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                        }
                    }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i13 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i14) {
                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                    final int i15 = i13;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i16) {
                                            if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                            }
                                            Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function4 = function3;
                                            int i17 = i15;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource9;
                    shape3 = shape2;
                    j5 = j3;
                    modifier4 = modifier9;
                    jM1041contentColorForek8zF_U = j10;
                    floatingActionButtonElevation2 = floatingActionButtonElevation7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j11 = j4;
                    FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource3;
                    Modifier modifier10 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                        }
                    }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i13 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i14) {
                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                    final int i15 = i13;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i16) {
                                            if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                            }
                                            Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function4 = function3;
                                            int i17 = i15;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource10;
                    shape3 = shape2;
                    j5 = j3;
                    modifier4 = modifier10;
                    jM1041contentColorForek8zF_U = j11;
                    floatingActionButtonElevation2 = floatingActionButtonElevation8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i12) {
                        FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if ((23967451 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j12 = j4;
                FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevationM1099elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource3;
                Modifier modifier11 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i13 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i14) {
                                if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                final int i15 = i13;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i16) {
                                        if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                        }
                                        Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function4 = function3;
                                        int i17 = i15;
                                        composer5.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                        Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        composer5.disableReusing();
                                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer4, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource11;
                shape3 = shape2;
                j5 = j3;
                modifier4 = modifier11;
                jM1041contentColorForek8zF_U = j12;
                floatingActionButtonElevation2 = floatingActionButtonElevation9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j13 = j4;
                FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevationM1099elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource3;
                Modifier modifier12 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i13 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i14) {
                                if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                final int i15 = i13;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i16) {
                                        if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                        }
                                        Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function4 = function3;
                                        int i17 = i15;
                                        composer5.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                        Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        composer5.disableReusing();
                                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer4, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource12;
                shape3 = shape2;
                j5 = j3;
                modifier4 = modifier12;
                jM1041contentColorForek8zF_U = j13;
                floatingActionButtonElevation2 = floatingActionButtonElevation10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i12) {
                    FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    shapeCopy = shape;
                    if (composerStartRestartGroup.changed(shapeCopy)) {
                        i9 = 2048;
                    }
                    i3 |= i9;
                } else {
                    shapeCopy = shape;
                }
                i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i9;
            } else {
                shapeCopy = shape;
            }
            if ((i & 57344) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i & 458752) == 0) {
                jM1041contentColorForek8zF_U = j2;
                if ((i2 & 32) == 0) {
                    i8 = 65536;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            } else {
                jM1041contentColorForek8zF_U = j2;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i3 |= i11;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i3 |= i11;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 8388608;
                    } else {
                        i6 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j14 = j4;
                    FloatingActionButtonElevation floatingActionButtonElevation11 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource3;
                    Modifier modifier13 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                        }
                    }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource13, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i13 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i14) {
                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                    final int i15 = i13;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i16) {
                                            if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                            }
                                            Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function4 = function3;
                                            int i17 = i15;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource13;
                    shape3 = shape2;
                    j5 = j3;
                    modifier4 = modifier13;
                    jM1041contentColorForek8zF_U = j14;
                    floatingActionButtonElevation2 = floatingActionButtonElevation11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            i7 = i3 & (-57345);
                            jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                        } else {
                            i7 = i3;
                            jM1025getSecondary0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j3 = jM1025getSecondary0d7_KjU;
                            i3 = i7;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j4 = jM1041contentColorForek8zF_U;
                            floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j15 = j4;
                    FloatingActionButtonElevation floatingActionButtonElevation12 = floatingActionButtonElevationM1099elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource3;
                    Modifier modifier14 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                        }
                    }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i13 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i14) {
                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                    final int i15 = i13;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i16) {
                                            if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                            }
                                            Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function4 = function3;
                                            int i17 = i15;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource14;
                    shape3 = shape2;
                    j5 = j3;
                    modifier4 = modifier14;
                    jM1041contentColorForek8zF_U = j15;
                    floatingActionButtonElevation2 = floatingActionButtonElevation12;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i12) {
                        FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if ((23967451 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j16 = j4;
                FloatingActionButtonElevation floatingActionButtonElevation13 = floatingActionButtonElevationM1099elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource3;
                Modifier modifier15 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i13 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i14) {
                                if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                final int i15 = i13;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i16) {
                                        if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                        }
                                        Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function4 = function3;
                                        int i17 = i15;
                                        composer5.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                        Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        composer5.disableReusing();
                                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer4, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource15;
                shape3 = shape2;
                j5 = j3;
                modifier4 = modifier15;
                jM1041contentColorForek8zF_U = j16;
                floatingActionButtonElevation2 = floatingActionButtonElevation13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j17 = j4;
                FloatingActionButtonElevation floatingActionButtonElevation14 = floatingActionButtonElevationM1099elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource3;
                Modifier modifier16 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i13 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i14) {
                                if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                final int i15 = i13;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i16) {
                                        if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                        }
                                        Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function4 = function3;
                                        int i17 = i15;
                                        composer5.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                        Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        composer5.disableReusing();
                                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer4, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource16;
                shape3 = shape2;
                j5 = j3;
                modifier4 = modifier16;
                jM1041contentColorForek8zF_U = j17;
                floatingActionButtonElevation2 = floatingActionButtonElevation14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i12) {
                    FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                shapeCopy = shape;
                if (composerStartRestartGroup.changed(shapeCopy)) {
                    i9 = 2048;
                }
                i3 |= i9;
            } else {
                shapeCopy = shape;
            }
            i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i9;
        } else {
            shapeCopy = shape;
        }
        if ((i & 57344) != 0) {
            i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
        }
        if ((i & 458752) == 0) {
            jM1041contentColorForek8zF_U = j2;
            if ((i2 & 32) == 0) {
                i8 = 65536;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        } else {
            jM1041contentColorForek8zF_U = j2;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                }
                i3 |= i11;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i3 |= i11;
        } else {
            floatingActionButtonElevation2 = floatingActionButtonElevation;
        }
        if ((i2 & 128) != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 8388608;
                } else {
                    i6 = Configuration.BLOCK_SIZE;
                }
            }
            if ((23967451 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j18 = j4;
                FloatingActionButtonElevation floatingActionButtonElevation15 = floatingActionButtonElevationM1099elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource3;
                Modifier modifier17 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource17, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i13 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i14) {
                                if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                final int i15 = i13;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i16) {
                                        if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                        }
                                        Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function4 = function3;
                                        int i17 = i15;
                                        composer5.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                        Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        composer5.disableReusing();
                                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer4, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource17;
                shape3 = shape2;
                j5 = j3;
                modifier4 = modifier17;
                jM1041contentColorForek8zF_U = j18;
                floatingActionButtonElevation2 = floatingActionButtonElevation15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        i7 = i3 & (-57345);
                        jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                    } else {
                        i7 = i3;
                        jM1025getSecondary0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j3 = jM1025getSecondary0d7_KjU;
                        i3 = i7;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM1041contentColorForek8zF_U;
                        floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j19 = j4;
                FloatingActionButtonElevation floatingActionButtonElevation16 = floatingActionButtonElevationM1099elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource3;
                Modifier modifier18 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource18, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i13 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i14) {
                                if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                                final int i15 = i13;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i16) {
                                        if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                        }
                                        Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function4 = function3;
                                        int i17 = i15;
                                        composer5.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                        Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        composer5.disableReusing();
                                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer4, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource18;
                shape3 = shape2;
                j5 = j3;
                modifier4 = modifier18;
                jM1041contentColorForek8zF_U = j19;
                floatingActionButtonElevation2 = floatingActionButtonElevation16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i12) {
                    FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i6 = 12582912;
        i3 |= i6;
        if ((23967451 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    i7 = i3 & (-57345);
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                } else {
                    i7 = i3;
                    jM1025getSecondary0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                    i7 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    i7 = i3 & (-57345);
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                } else {
                    i7 = i3;
                    jM1025getSecondary0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                    i7 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
            }
            long j110 = j4;
            FloatingActionButtonElevation floatingActionButtonElevation17 = floatingActionButtonElevationM1099elevationxZ9QkE;
            MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource3;
            Modifier modifier19 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                }
            }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource19, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i12) {
                    if ((i12 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                    final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                    final int i13 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i14) {
                            if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i15 = i13;
                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer5, int i16) {
                                    if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                    }
                                    Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function4 = function3;
                                    int i17 = i15;
                                    composer5.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                    Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    composer5.disableReusing();
                                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer4, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer3, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource19;
            shape3 = shape2;
            j5 = j3;
            modifier4 = modifier19;
            jM1041contentColorForek8zF_U = j110;
            floatingActionButtonElevation2 = floatingActionButtonElevation17;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    i7 = i3 & (-57345);
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                } else {
                    i7 = i3;
                    jM1025getSecondary0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                    i7 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    i7 = i3 & (-57345);
                    jM1025getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1025getSecondary0d7_KjU();
                } else {
                    i7 = i3;
                    jM1025getSecondary0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1025getSecondary0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                    i7 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1099elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j3 = jM1025getSecondary0d7_KjU;
                    i3 = i7;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM1041contentColorForek8zF_U;
                    floatingActionButtonElevationM1099elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
            }
            long j111 = j4;
            FloatingActionButtonElevation floatingActionButtonElevation18 = floatingActionButtonElevationM1099elevationxZ9QkE;
            MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource3;
            Modifier modifier110 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1186SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.m3169setRolekuIjeqM(semantics, Role.INSTANCE.m3155getButtono7Vup1c());
                }
            }, 1, null), false, shape2, j3, j4, null, floatingActionButtonElevationM1099elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m3779unboximpl(), mutableInteractionSource110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i12) {
                    if ((i12 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972871863, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(j4)))};
                    final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                    final int i13 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i14) {
                            if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i15 = i13;
                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.3.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer5, int i16) {
                                    if ((i16 & 11) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1567914264, i16, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                    }
                                    Modifier modifierM507defaultMinSizeVpY3zN4 = SizeKt.m507defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function4 = function3;
                                    int i17 = i15;
                                    composer5.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                    Density density = (Density) OooO00o.OooO00o(composer5, -1323940314);
                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM507defaultMinSizeVpY3zN4);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    composer5.disableReusing();
                                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer5);
                                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer5, composer5), composer5, 2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function4.invoke(composer5, Integer.valueOf((i17 >> 21) & 14));
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer4, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer3, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource110;
            shape3 = shape2;
            j5 = j3;
            modifier4 = modifier110;
            jM1041contentColorForek8zF_U = j111;
            floatingActionButtonElevation2 = floatingActionButtonElevation18;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i12) {
                FloatingActionButtonKt.m1101FloatingActionButtonbogVsAg(onClick, modifier4, mutableInteractionSource4, shape3, j5, jM1041contentColorForek8zF_U, floatingActionButtonElevation2, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
