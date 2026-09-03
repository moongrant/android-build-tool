package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static /* synthetic */ Object OooO00o(BringIntoViewRequester bringIntoViewRequester, Rect rect, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, continuation);
    }
}
