package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO {
    @Composable
    @NotNull
    public static State OooO00o(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1279189910);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1279189910, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)");
        }
        State<Color> stateLeadingIconColor = textFieldColorsWithIcons.leadingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateLeadingIconColor;
    }

    @Composable
    @NotNull
    public static State OooO0O0(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-712140408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-712140408, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)");
        }
        State<Color> stateTrailingIconColor = textFieldColorsWithIcons.trailingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateTrailingIconColor;
    }
}
