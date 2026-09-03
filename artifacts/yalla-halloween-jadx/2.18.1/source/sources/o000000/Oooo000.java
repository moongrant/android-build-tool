package o000000;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function2<Unit, o00OOOO0.OooO0O0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f26622Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(LayoutNode layoutNode) {
        super(2);
        this.f26622Oooo0o = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Unit unit, o00OOOO0.OooO0O0 oooO0O0) {
        o0OOO0o o0ooo0o2;
        o00OOOO0.OooO0O0 mod = oooO0O0;
        Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(mod, "mod");
        p036OoooOOO.o000OOo<o0OOO0o> o000ooo2 = this.f26622Oooo0o.f6162o000oOoO;
        int i = o000ooo2.f3664Oooo0oo;
        if (i <= 0) {
            o0ooo0o2 = null;
            break;
        }
        int i2 = i - 1;
        o0OOO0o[] o0ooo0oArr = o000ooo2.f3662Oooo0o;
        while (true) {
            o0ooo0o2 = o0ooo0oArr[i2];
            o0OOO0o o0ooo0o3 = o0ooo0o2;
            if (o0ooo0o3.f26666o00o0O == mod && !o0ooo0o3.f26667o00ooo) {
                break;
            }
            i2--;
            if (i2 < 0) {
                o0ooo0o2 = null;
                break;
            }
        }
        o0OOO0o o0ooo0o4 = o0ooo0o2;
        if (o0ooo0o4 != null) {
            o0ooo0o4.f26667o00ooo = true;
        }
        return Unit.INSTANCE;
    }
}
