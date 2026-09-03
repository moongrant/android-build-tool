package androidx.compose.ui.layout;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 {
    @NotNull
    public static List OooO00o(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, @Nullable Object obj, @NotNull Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return subcomposeIntermediateMeasureScope.measurablesForSlot(obj);
    }
}
