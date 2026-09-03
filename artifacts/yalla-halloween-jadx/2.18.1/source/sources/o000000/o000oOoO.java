package o000000;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends Lambda implements Function2<o0OO00O, o00OOOO0.OooO0O0, o0OO00O> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f26647Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p036OoooOOO.o000OOo<o0Oo0oo> f26648Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(LayoutNode layoutNode, p036OoooOOO.o000OOo<o0Oo0oo> o000ooo2) {
        super(2);
        this.f26647Oooo0o = layoutNode;
        this.f26648Oooo0oO = o000ooo2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    @Override // kotlin.jvm.functions.Function2
    public final o0OO00O invoke(o0OO00O o0oo00o2, o00OOOO0.OooO0O0 oooO0O0) {
        o0Oo0oo o0oo0oo2;
        boolean z;
        o0OO00O lastProvider = o0oo00o2;
        o00OOOO0.OooO0O0 mod = oooO0O0;
        Intrinsics.checkNotNullParameter(lastProvider, "lastProvider");
        Intrinsics.checkNotNullParameter(mod, "mod");
        if (mod instanceof p710ooOO.o000000) {
            LayoutNode layoutNode = this.f26647Oooo0o;
            p710ooOO.o000000 o000000Var = (p710ooOO.o000000) mod;
            p036OoooOOO.o000OOo<o0Oo0oo> o000ooo2 = this.f26648Oooo0oO;
            Objects.requireNonNull(layoutNode);
            int i = o000ooo2.f3664Oooo0oo;
            if (i <= 0) {
                o0oo0oo2 = null;
                break;
            }
            o0Oo0oo[] o0oo0ooArr = o000ooo2.f3662Oooo0o;
            int i2 = 0;
            while (true) {
                o0oo0oo2 = o0oo0ooArr[i2];
                p076o000OOo.OooOO0O oooOO0O = o0oo0oo2.f26673Oooo0oO;
                if (oooOO0O instanceof p710ooOO.o00000OO) {
                    Function1<p710ooOO.o00000O0, Unit> function1 = ((p710ooOO.o00000OO) oooOO0O).f53449Oooo0oO;
                    if ((function1 instanceof p710ooOO.o00000) && ((p710ooOO.o00000) function1).f53438Oooo0o == o000000Var) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
                if (i2 >= i) {
                    o0oo0oo2 = null;
                    break;
                }
            }
            o0Oo0oo o0oo0oo3 = o0oo0oo2;
            p076o000OOo.OooOO0O oooOO0O2 = o0oo0oo3 != null ? o0oo0oo3.f26673Oooo0oO : null;
            p710ooOO.o00000OO o00000oo2 = oooOO0O2 instanceof p710ooOO.o00000OO ? (p710ooOO.o00000OO) oooOO0O2 : null;
            if (o00000oo2 == null) {
                p710ooOO.o00000 o00000Var = new p710ooOO.o00000(o000000Var);
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function3 = o00oOoo.f6560OooO00o;
                o00000oo2 = new p710ooOO.o00000OO(o00000Var);
            }
            LayoutNode.OooO0oo(this.f26647Oooo0o, o00000oo2, lastProvider, this.f26648Oooo0oO);
            lastProvider = LayoutNode.OooO(this.f26647Oooo0o, o00000oo2, lastProvider);
        }
        if (mod instanceof p076o000OOo.OooOO0O) {
            LayoutNode.OooO0oo(this.f26647Oooo0o, (p076o000OOo.OooOO0O) mod, lastProvider, this.f26648Oooo0oO);
        }
        return mod instanceof p076o000OOo.OooOOO ? LayoutNode.OooO(this.f26647Oooo0o, (p076o000OOo.OooOOO) mod, lastProvider) : lastProvider;
    }
}
