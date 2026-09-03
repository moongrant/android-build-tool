package p383o0OOooO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import o00O0OOO.OooO0o;
import org.jetbrains.annotations.NotNull;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo0 implements OooO0o {
    @Override // o00O0OOO.OooO0o
    public final void OooO00o(@NotNull String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event, "Moments_post_pic_success")) {
            o0OO000.OooO00o("203008");
        } else if (Intrinsics.areEqual(event, "Moments_post_pic_cancel")) {
            o0OO000.OooO00o("203016");
        }
    }
}
