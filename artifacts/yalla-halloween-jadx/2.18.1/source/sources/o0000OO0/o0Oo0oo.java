package o0000OO0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class o0Oo0oo implements o0ooOOo {
    @Override // o0000OO0.o0ooOOo
    public final void OooO00o(@NotNull WindowManager windowManager, @NotNull View popupView, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(popupView, "popupView");
        Intrinsics.checkNotNullParameter(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }

    @Override // o0000OO0.o0ooOOo
    public void OooO0O0(@NotNull View composeView, int i, int i2) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
    }

    @Override // o0000OO0.o0ooOOo
    public final void OooO0OO(@NotNull View composeView, @NotNull Rect outRect) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }
}
