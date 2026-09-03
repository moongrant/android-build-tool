package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import com.yalla.yalla.model.http.Response;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import p464o0Oooo.o0O00oO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static int OooO00o(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int OooO0O0(LayoutNode layoutNode) {
        return layoutNode.getNodes().getHead().getAggregateChildKindSet();
    }

    public static void OooO0OO(o0O00oO0 o0o00oo1, Response response, CancellableContinuation cancellableContinuation) {
        o0o00oo1.getClass();
        cancellableContinuation.resumeWith(Result.m4213constructorimpl(o0O00oO0.OooO0O0(response)));
    }
}
