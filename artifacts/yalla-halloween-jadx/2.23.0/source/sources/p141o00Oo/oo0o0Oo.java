package p141o00Oo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public interface oo0o0Oo {
    @Composable
    @NotNull
    State<Color> thumbColor(boolean z, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> tickColor(boolean z, boolean z2, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> trackColor(boolean z, boolean z2, @Nullable Composer composer, int i);
}
