package o000000;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26615OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0O00OO<o0O0O00.o000000> f26616OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0O0O00.o000000 f26617OooO0OO;

    public OooOOOO(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f26615OooO00o = layoutNode;
    }

    public final o0O0O00.o000000 OooO00o() {
        o0O00OO<o0O0O00.o000000> o0o00ooOooO0Oo = this.f26616OooO0O0;
        if (o0o00ooOooO0Oo == null) {
            o0O0O00.o000000 o000000Var = this.f26617OooO0OO;
            if (o000000Var == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
            o0o00ooOooO0Oo = o0OOO00.OooO0Oo(o000000Var);
        }
        this.f26616OooO0O0 = o0o00ooOooO0Oo;
        return o0o00ooOooO0Oo.getValue();
    }
}
