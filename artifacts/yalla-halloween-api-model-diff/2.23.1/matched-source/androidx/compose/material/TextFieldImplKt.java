package androidx.compose.material;

import androidx.compose.animation.OooOo;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aß\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&2\u0006\u0010'\u001a\u00020(2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&H\u0001¢\u0006\u0002\u00108\u001aW\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u0012\u0010H\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u000e\u0010\u0014\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0015\u001a\u00020\u0016X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,376:1\n50#2:377\n49#2:378\n1097#3,6:379\n658#4:385\n646#4:386\n658#4:387\n646#4:388\n154#5:389\n154#5:390\n154#5:391\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:377\n81#1:378\n81#1:379,6\n112#1:385\n112#1:386\n115#1:387\n115#1:388\n373#1:389\n374#1:390\n376#1:391\n*E\n"})
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @NotNull
    private static final Modifier IconDefaultSizeModifier;

    @NotNull
    public static final String LabelId = "Label";

    @NotNull
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @NotNull
    public static final String PlaceholderId = "Hint";

    @NotNull
    public static final String TextFieldId = "TextField";

    @NotNull
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m3775constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m3775constructorimpl(12);

    static {
        float f = 48;
        IconDefaultSizeModifier = SizeKt.m509defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CommonDecorationBox(@NotNull final TextFieldType type, @NotNull final String value, @NotNull final Function2<? super Composer, ? super Integer, Unit> innerTextField, @NotNull final VisualTransformation visualTransformation, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, boolean z, boolean z2, boolean z3, @NotNull final InteractionSource interactionSource, @NotNull final PaddingValues contentPadding, @NotNull final TextFieldColors colors, @Nullable Function2<? super Composer, ? super Integer, Unit> function6, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        InputPhase inputPhase;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function7;
        final Function2<? super Composer, ? super Integer, Unit> function8;
        final Function2<? super Composer, ? super Integer, Unit> function9;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function10;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-712568069);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(type) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        int i6 = i3 & 4;
        int i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(innerTextField) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= 196608;
        } else if ((i & 458752) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        int i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        int i10 = i3 & 128;
        if (i10 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function5) ? 8388608 : Configuration.BLOCK_SIZE;
        }
        int i11 = i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i11 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        int i12 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i12 != 0) {
            i4 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 536870912 : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        int i13 = i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i13 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = i2 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        int i14 = i5;
        if ((i3 & 4096) != 0) {
            i14 |= 384;
        } else if ((i2 & 896) == 0) {
            if (!composerStartRestartGroup.changed(contentPadding)) {
                i7 = 128;
            }
            i14 |= i7;
        }
        if ((i3 & 8192) != 0) {
            i14 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i14 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i15 = i3 & 16384;
        if (i15 != 0) {
            i14 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function6) ? 16384 : 8192;
        }
        if ((i4 & 1533916891) == 306783378 && (46811 & i14) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function7 = function3;
            function8 = function4;
            function9 = function5;
            z4 = z;
            z5 = z2;
            z6 = z3;
            function10 = function6;
            composer2 = composerStartRestartGroup;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function11 = i8 != 0 ? null : function3;
            Function2<? super Composer, ? super Integer, Unit> function12 = i9 != 0 ? null : function4;
            Function2<? super Composer, ? super Integer, Unit> function13 = i10 != 0 ? null : function5;
            boolean z7 = i11 != 0 ? false : z;
            boolean z8 = i12 != 0 ? true : z2;
            boolean z9 = i13 != 0 ? false : z3;
            Function2<? super Composer, ? super Integer, Unit> function14 = i15 != 0 ? null : function6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-712568069, i4, i14, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final String text = ((TransformedText) objRememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i14 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            InputPhase inputPhase2 = inputPhase;
            final int i16 = i4;
            final boolean z10 = z8;
            final boolean z11 = z9;
            final int i17 = i14;
            Function3<InputPhase, Composer, Integer, Color> function15 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase3, Composer composer3, Integer num) {
                    return Color.m1671boximpl(m1254invokeXeAY9LY(inputPhase3, composer3, num.intValue()));
                }

                @Composable
                /* JADX INFO: renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1254invokeXeAY9LY(@NotNull InputPhase it, @Nullable Composer composer3, int i18) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    composer3.startReplaceableGroup(697243846);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(697243846, i18, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                    }
                    TextFieldColors textFieldColors = colors;
                    boolean z12 = z10;
                    boolean z13 = it == InputPhase.UnfocusedEmpty ? false : z11;
                    InteractionSource interactionSource2 = interactionSource;
                    int i19 = (i16 >> 27) & 14;
                    int i20 = i17;
                    long jM1691unboximpl = textFieldColors.labelColor(z12, z13, interactionSource2, composer3, i19 | ((i20 << 3) & 896) | (i20 & 7168)).getValue().m1691unboximpl();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceableGroup();
                    return jM1691unboximpl;
                }
            };
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long jM3341getColor0d7_KjU = subtitle1.m3341getColor0d7_KjU();
            Color.Companion companion = Color.INSTANCE;
            boolean z12 = (Color.m1682equalsimpl0(jM3341getColor0d7_KjU, companion.m1717getUnspecified0d7_KjU()) && !Color.m1682equalsimpl0(caption.m3341getColor0d7_KjU(), companion.m1717getUnspecified0d7_KjU())) || (!Color.m1682equalsimpl0(subtitle1.m3341getColor0d7_KjU(), companion.m1717getUnspecified0d7_KjU()) && Color.m1682equalsimpl0(caption.m3341getColor0d7_KjU(), companion.m1717getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(2129141006);
            long jM3341getColor0d7_KjU2 = materialTheme.getTypography(composerStartRestartGroup, 6).getCaption().m3341getColor0d7_KjU();
            if (z12) {
                if (!(jM3341getColor0d7_KjU2 != companion.m1717getUnspecified0d7_KjU())) {
                    jM3341getColor0d7_KjU2 = function15.invoke(inputPhase2, composerStartRestartGroup, 0).m1691unboximpl();
                }
            }
            long j = jM3341getColor0d7_KjU2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2129141197);
            long jM3341getColor0d7_KjU3 = materialTheme.getTypography(composerStartRestartGroup, 6).getSubtitle1().m3341getColor0d7_KjU();
            if (z12) {
                if (!(jM3341getColor0d7_KjU3 != companion.m1717getUnspecified0d7_KjU())) {
                    jM3341getColor0d7_KjU3 = function15.invoke(inputPhase2, composerStartRestartGroup, 0).m1691unboximpl();
                }
            }
            long j2 = jM3341getColor0d7_KjU3;
            composerStartRestartGroup.endReplaceableGroup();
            final Function2<? super Composer, ? super Integer, Unit> function16 = function11;
            final boolean z13 = z9;
            final int i18 = i14;
            final boolean z14 = z8;
            final Function2<? super Composer, ? super Integer, Unit> function17 = function12;
            final Function2<? super Composer, ? super Integer, Unit> function18 = function13;
            final boolean z15 = z7;
            final boolean z16 = z12;
            final Function2<? super Composer, ? super Integer, Unit> function19 = function14;
            composer2 = composerStartRestartGroup;
            textFieldTransitionScope.m1259TransitionDTcfvLk(inputPhase2, j, j2, function15, function2 != null, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.3

                /* JADX INFO: renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        try {
                            iArr[TextFieldType.Filled.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[TextFieldType.Outlined.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                    m1252invokeRIQooxk(f.floatValue(), color.m1691unboximpl(), color2.m1691unboximpl(), f2.floatValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* JADX INFO: renamed from: invoke-RIQooxk, reason: not valid java name */
                public final void m1252invokeRIQooxk(final float f, final long j3, final long j4, final float f2, @Nullable Composer composer3, int i19) {
                    int i20;
                    ComposableLambda composableLambda;
                    ComposableLambda composableLambda2;
                    final long jM1691unboximpl;
                    final long jM1691unboximpl2;
                    if ((i19 & 14) == 0) {
                        i20 = (composer3.changed(f) ? 4 : 2) | i19;
                    } else {
                        i20 = i19;
                    }
                    if ((i19 & 112) == 0) {
                        i20 |= composer3.changed(j3) ? 32 : 16;
                    }
                    if ((i19 & 896) == 0) {
                        i20 |= composer3.changed(j4) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    }
                    if ((i19 & 7168) == 0) {
                        i20 |= composer3.changed(f2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    final int i21 = i20;
                    if ((46811 & i21) == 9362 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(341865432, i21, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:118)");
                    }
                    final Function2<Composer, Integer, Unit> function20 = function2;
                    if (function20 != null) {
                        final boolean z17 = z16;
                        composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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
                            public final void invoke(@Nullable Composer composer4, int i22) {
                                if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(362863774, i22, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
                                }
                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme2.getTypography(composer4, 6).getSubtitle1(), materialTheme2.getTypography(composer4, 6).getCaption(), f);
                                TextFieldImplKt.m1251DecorationeuL9pac(j4, z17 ? textStyleLerp.m3338copyv2rsoow((16252927 & 1) != 0 ? textStyleLerp.spanStyle.m3279getColor0d7_KjU() : j3, (16252927 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? textStyleLerp.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null) : textStyleLerp, null, function20, composer4, ((i21 >> 6) & 14) | 384, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda3 = composableLambda;
                    if (function16 == null) {
                        composableLambda2 = null;
                    } else {
                        if (!(text.length() == 0) || f2 <= 0.0f) {
                            composableLambda2 = null;
                        } else {
                            final TextFieldColors textFieldColors = colors;
                            final boolean z18 = z14;
                            final int i22 = i16;
                            final int i23 = i18;
                            final Function2<Composer, Integer, Unit> function21 = function16;
                            composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                    invoke(modifier, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer4, int i24) {
                                    int i25;
                                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                                    if ((i24 & 14) == 0) {
                                        i25 = (composer4.changed(modifier) ? 4 : 2) | i24;
                                    } else {
                                        i25 = i24;
                                    }
                                    if ((i25 & 91) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1120552650, i24, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:137)");
                                    }
                                    Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                    TextFieldColors textFieldColors2 = textFieldColors;
                                    boolean z19 = z18;
                                    int i26 = i22;
                                    int i27 = i23;
                                    Function2<Composer, Integer, Unit> function22 = function21;
                                    composer4.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer4, 0, -1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer4);
                                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                    }
                                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    TextFieldImplKt.m1251DecorationeuL9pac(textFieldColors2.placeholderColor(z19, composer4, ((i26 >> 27) & 14) | ((i27 >> 6) & 112)).getValue().m1691unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function22, composer4, (i26 >> 6) & 7168, 4);
                                    if (OooO0o.OooO00o(composer4)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        }
                    }
                    ComposableLambda composableLambda4 = composableLambda2;
                    final String strM1199getString4foXLRw = Strings_androidKt.m1199getString4foXLRw(Strings.INSTANCE.m1194getDefaultErrorMessageUdPEhr4(), composer3, 6);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Object objValueOf = Boolean.valueOf(z13);
                    final boolean z19 = z13;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged2 = composer3.changed(objValueOf) | composer3.changed(strM1199getString4foXLRw);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                if (z19) {
                                    SemanticsPropertiesKt.error(semantics, strM1199getString4foXLRw);
                                }
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null);
                    if (colors instanceof TextFieldColorsWithIcons) {
                        composer3.startReplaceableGroup(-1083197701);
                        TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                        boolean z20 = z14;
                        boolean z21 = z13;
                        InteractionSource interactionSource2 = interactionSource;
                        int i24 = (i16 >> 27) & 14;
                        int i25 = i18;
                        jM1691unboximpl = textFieldColorsWithIcons.leadingIconColor(z20, z21, interactionSource2, composer3, ((i25 << 3) & 896) | i24 | ((i25 << 3) & 112)).getValue().m1691unboximpl();
                        composer3.endReplaceableGroup();
                    } else {
                        composer3.startReplaceableGroup(-1083197605);
                        TextFieldColors textFieldColors2 = colors;
                        boolean z22 = z14;
                        boolean z23 = z13;
                        int i26 = (i16 >> 27) & 14;
                        int i27 = i18;
                        jM1691unboximpl = textFieldColors2.leadingIconColor(z22, z23, composer3, i26 | ((i27 << 3) & 112) | ((i27 >> 3) & 896)).getValue().m1691unboximpl();
                        composer3.endReplaceableGroup();
                    }
                    final Function2<Composer, Integer, Unit> function22 = function17;
                    ComposableLambda composableLambda5 = function22 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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
                        public final void invoke(@Nullable Composer composer4, int i28) {
                            if ((i28 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1505327088, i28, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:160)");
                            }
                            TextFieldImplKt.m1251DecorationeuL9pac(jM1691unboximpl, null, null, function22, composer4, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    if (colors instanceof TextFieldColorsWithIcons) {
                        composer3.startReplaceableGroup(-1083197259);
                        TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) colors;
                        boolean z24 = z14;
                        boolean z25 = z13;
                        InteractionSource interactionSource3 = interactionSource;
                        int i28 = (i16 >> 27) & 14;
                        int i29 = i18;
                        jM1691unboximpl2 = textFieldColorsWithIcons2.trailingIconColor(z24, z25, interactionSource3, composer3, ((i29 << 3) & 896) | i28 | ((i29 << 3) & 112)).getValue().m1691unboximpl();
                        composer3.endReplaceableGroup();
                    } else {
                        composer3.startReplaceableGroup(-1083197162);
                        TextFieldColors textFieldColors3 = colors;
                        boolean z26 = z14;
                        boolean z27 = z13;
                        int i30 = (i16 >> 27) & 14;
                        int i31 = i18;
                        jM1691unboximpl2 = textFieldColors3.trailingIconColor(z26, z27, composer3, i30 | ((i31 << 3) & 112) | ((i31 >> 3) & 896)).getValue().m1691unboximpl();
                        composer3.endReplaceableGroup();
                    }
                    final Function2<Composer, Integer, Unit> function23 = function18;
                    ComposableLambda composableLambda6 = function23 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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
                        public final void invoke(@Nullable Composer composer4, int i32) {
                            if ((i32 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1894727196, i32, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:171)");
                            }
                            TextFieldImplKt.m1251DecorationeuL9pac(jM1691unboximpl2, null, null, function23, composer4, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }) : null;
                    int i32 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i32 == 1) {
                        composer3.startReplaceableGroup(-1083196826);
                        Function2<Composer, Integer, Unit> function24 = innerTextField;
                        boolean z28 = z15;
                        PaddingValues paddingValues = contentPadding;
                        int i33 = i16;
                        TextFieldKt.TextFieldLayout(modifierSemantics$default, function24, composableLambda3, composableLambda4, composableLambda5, composableLambda6, z28, f, paddingValues, composer3, ((i33 >> 6) & 3670016) | ((i33 >> 3) & 112) | ((i21 << 21) & 29360128) | ((i18 << 18) & 234881024));
                        composer3.endReplaceableGroup();
                    } else if (i32 != 2) {
                        composer3.startReplaceableGroup(-1083194783);
                        composer3.endReplaceableGroup();
                    } else {
                        Object objOooO00o = OooOo00.OooO00o(composer3, -1083196270, -492369756);
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objOooO00o == companion3.getEmpty()) {
                            objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1504boximpl(Size.INSTANCE.m1525getZeroNHjbRc()), null, 2, null);
                            composer3.updateRememberedValue(objOooO00o);
                        }
                        composer3.endReplaceableGroup();
                        final MutableState mutableState = (MutableState) objOooO00o;
                        final PaddingValues paddingValues2 = contentPadding;
                        final Function2<Composer, Integer, Unit> function25 = function19;
                        final int i34 = i18;
                        ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
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
                            public final void invoke(@Nullable Composer composer4, int i35) {
                                if ((i35 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(139886979, i35, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                                }
                                Modifier modifierM1150outlineCutout12SF9DM = OutlinedTextFieldKt.m1150outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                Function2<Composer, Integer, Unit> function26 = function25;
                                int i36 = i34;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, true, composer4, 48, -1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1150outlineCutout12SF9DM);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer4);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(1661576646);
                                if (function26 != null) {
                                    function26.invoke(composer4, Integer.valueOf((i36 >> 12) & 14));
                                }
                                if (OooOo.OooO00o(composer4)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        Function2<Composer, Integer, Unit> function26 = innerTextField;
                        boolean z29 = z15;
                        Object objValueOf2 = Float.valueOf(f);
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged3 = composer3.changed(objValueOf2) | composer3.changed(mutableState);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == companion3.getEmpty()) {
                            objRememberedValue3 = new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                    m1253invokeuvyYCjk(size.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke-uvyYCjk, reason: not valid java name */
                                public final void m1253invokeuvyYCjk(long j5) {
                                    float fM1516getWidthimpl = Size.m1516getWidthimpl(j5) * f;
                                    float fM1513getHeightimpl = Size.m1513getHeightimpl(j5) * f;
                                    if (Size.m1516getWidthimpl(mutableState.getValue().getPackedValue()) == fM1516getWidthimpl) {
                                        if (Size.m1513getHeightimpl(mutableState.getValue().getPackedValue()) == fM1513getHeightimpl) {
                                            return;
                                        }
                                    }
                                    mutableState.setValue(Size.m1504boximpl(androidx.compose.ui.geometry.SizeKt.Size(fM1516getWidthimpl, fM1513getHeightimpl)));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        Function1 function1 = (Function1) objRememberedValue3;
                        PaddingValues paddingValues3 = contentPadding;
                        int i35 = i16;
                        OutlinedTextFieldKt.OutlinedTextFieldLayout(modifierSemantics$default, function26, composableLambda4, composableLambda3, composableLambda5, composableLambda6, z29, f, function1, composableLambda7, paddingValues3, composer3, ((i35 >> 6) & 3670016) | ((i35 >> 3) & 112) | 805306368 | ((i21 << 21) & 29360128), (i18 >> 6) & 14);
                        composer3.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function11;
            function8 = function12;
            function9 = function13;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            function10 = function14;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.4
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

            public final void invoke(@Nullable Composer composer3, int i19) {
                TextFieldImplKt.CommonDecorationBox(type, value, innerTextField, visualTransformation, function2, function7, function8, function9, z4, z5, z6, interactionSource, contentPadding, colors, function10, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableOpenTarget(index = 0)
    /* JADX INFO: renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m1251DecorationeuL9pac(final long j, @Nullable TextStyle textStyle, @Nullable Float f, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final TextStyle textStyle2;
        int i4;
        Float f2;
        int i5;
        int i6;
        final int i7;
        TextStyle textStyle3;
        Float f3;
        ComposableLambda composableLambda;
        final Float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-399493340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                textStyle2 = textStyle;
                i3 |= composerStartRestartGroup.changed(textStyle2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        textStyle3 = null;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i4 != 0) {
                        f3 = null;
                    } else {
                        f3 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-399493340, i7, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                    }
                    final Float f5 = f3;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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
                        public final void invoke(@Nullable Composer composer2, int i9) {
                            if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                            }
                            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(j))};
                            final Float f6 = f5;
                            final Function2<Composer, Integer, Unit> function2 = content;
                            final int i10 = i7;
                            final long j2 = j;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i11) {
                                    if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1132188434, i11, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                                    }
                                    if (f6 != null) {
                                        composer3.startReplaceableGroup(-452621938);
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f6)}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer3.startReplaceableGroup(-452621758);
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(j2)))}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    if (textStyle3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-2009952671);
                        TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i7 >> 3) & 14) | 48);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-2009952619);
                        composableLambda.invoke(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle2 = textStyle3;
                    f4 = f3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f4 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        TextFieldImplKt.m1251DecorationeuL9pac(j, textStyle2, f4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            f2 = f;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i7, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                final Float f6 = f3;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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
                    public final void invoke(@Nullable Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                        }
                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(j))};
                        final Float f7 = f6;
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i10 = i7;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i11) {
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1132188434, i11, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                                }
                                if (f7 != null) {
                                    composer3.startReplaceableGroup(-452621938);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f7)}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-452621758);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(j2)))}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i7 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f4 = f3;
            } else {
                if (i8 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i7, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                final Float f7 = f3;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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
                    public final void invoke(@Nullable Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                        }
                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(j))};
                        final Float f8 = f7;
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i10 = i7;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i11) {
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1132188434, i11, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                                }
                                if (f8 != null) {
                                    composer3.startReplaceableGroup(-452621938);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f8)}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-452621758);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(j2)))}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i7 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f4 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    TextFieldImplKt.m1251DecorationeuL9pac(j, textStyle2, f4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        textStyle2 = textStyle;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i7, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                final Float f8 = f3;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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
                    public final void invoke(@Nullable Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                        }
                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(j))};
                        final Float f9 = f8;
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i10 = i7;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i11) {
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1132188434, i11, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                                }
                                if (f9 != null) {
                                    composer3.startReplaceableGroup(-452621938);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f9)}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-452621758);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(j2)))}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i7 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f4 = f3;
            } else {
                if (i8 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i7, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                final Float f9 = f3;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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
                    public final void invoke(@Nullable Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                        }
                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(j))};
                        final Float f10 = f9;
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i10 = i7;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i11) {
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1132188434, i11, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                                }
                                if (f10 != null) {
                                    composer3.startReplaceableGroup(-452621938);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f10)}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-452621758);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(j2)))}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i7 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f4 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    TextFieldImplKt.m1251DecorationeuL9pac(j, textStyle2, f4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        f2 = f;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i6 = 2048;
            } else {
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((i7 & 5851) == 1170) {
            if (i8 != 0) {
                textStyle3 = null;
            } else {
                textStyle3 = textStyle2;
            }
            if (i4 != 0) {
                f3 = null;
            } else {
                f3 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-399493340, i7, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
            }
            final Float f10 = f3;
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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
                public final void invoke(@Nullable Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                    }
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(j))};
                    final Float f11 = f10;
                    final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                    final int i10 = i7;
                    final long j2 = j;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i11) {
                            if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1132188434, i11, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                            }
                            if (f11 != null) {
                                composer3.startReplaceableGroup(-452621938);
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f11)}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-452621758);
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(j2)))}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                composer3.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            if (textStyle3 != null) {
                composerStartRestartGroup.startReplaceableGroup(-2009952671);
                TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i7 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2009952619);
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f4 = f3;
        } else {
            if (i8 != 0) {
                textStyle3 = null;
            } else {
                textStyle3 = textStyle2;
            }
            if (i4 != 0) {
                f3 = null;
            } else {
                f3 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-399493340, i7, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
            }
            final Float f11 = f3;
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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
                public final void invoke(@Nullable Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                    }
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(j))};
                    final Float f12 = f11;
                    final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                    final int i10 = i7;
                    final long j2 = j;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i11) {
                            if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1132188434, i11, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                            }
                            if (f12 != null) {
                                composer3.startReplaceableGroup(-452621938);
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f12)}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-452621758);
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(j2)))}, function2, composer3, ((i10 >> 6) & 112) | 8);
                                composer3.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            if (textStyle3 != null) {
                composerStartRestartGroup.startReplaceableGroup(-2009952671);
                TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i7 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2009952619);
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f4 = f3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

            public final void invoke(@Nullable Composer composer2, int i9) {
                TextFieldImplKt.m1251DecorationeuL9pac(j, textStyle2, f4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
