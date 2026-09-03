package o0000OO0;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class o0OOO0o extends o0Oo0oo {
    @Override // o0000OO0.o0Oo0oo, o0000OO0.o0ooOOo
    public final void OooO0O0(@NotNull View composeView, int i, int i2) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        composeView.setSystemGestureExclusionRects(CollectionsKt.mutableListOf(new Rect(0, 0, i, i2)));
    }
}
