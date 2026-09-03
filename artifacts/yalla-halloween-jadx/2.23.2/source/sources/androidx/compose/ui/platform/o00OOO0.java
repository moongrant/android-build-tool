package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooO00o(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        textToolbar.showMenu(rect, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function2, (i & 16) != 0 ? null : function3);
    }
}
