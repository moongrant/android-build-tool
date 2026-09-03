package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0OO0 f6502OooO00o = new o00O0OO0();

    @DoNotInline
    public final void OooO00o(@NotNull RenderNode renderNode, @Nullable p145o00Oo0.o000OO0O o000oo0o2) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setRenderEffect(null);
    }
}
