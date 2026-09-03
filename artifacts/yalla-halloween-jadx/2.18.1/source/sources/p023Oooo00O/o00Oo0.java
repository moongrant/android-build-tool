package p023Oooo00O;

import OooO00o.OooO00o;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0<T, V extends o0O0O00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0ooOOo<T, V> f1179OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final AnimationEndReason f1180OooO0O0;

    public o00Oo0(@NotNull o0ooOOo<T, V> endState, @NotNull AnimationEndReason endReason) {
        Intrinsics.checkNotNullParameter(endState, "endState");
        Intrinsics.checkNotNullParameter(endReason, "endReason");
        this.f1179OooO00o = endState;
        this.f1180OooO0O0 = endReason;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AnimationResult(endReason=");
        sbOooO0o0.append(this.f1180OooO0O0);
        sbOooO0o0.append(", endState=");
        sbOooO0o0.append(this.f1179OooO00o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
