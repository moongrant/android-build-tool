package p032OoooO0;

import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o0OO00O;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o000oOoO;
import p048OoooooO.o00OOOO0;
import p054o00000oo.o00O0O00;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o0O0ooO;
import p145o00Oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f3114Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f3115Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3116Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f3117Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(o0Oo0oo o0oo0oo2, o0O0000O o0o0000o2, oo0oOO0 oo0ooo0, o00O0O00 o00o0o01) {
        super(3);
        this.f3115Oooo0o = o0oo0oo2;
        this.f3116Oooo0oO = o0o0000o2;
        this.f3117Oooo0oo = oo0ooo0;
        this.f3114Oooo = o00o0o01;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        boolean z;
        o00OOOO0 o00oooo0OooO0OO;
        o00OOOO0 composed = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        ooo00o2.OooO0o0(1634330012);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = o000oOoO.OooO0o0(1.0f);
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        Oooo0 oooo0 = (Oooo0) objOooO0o;
        o0Oo0oo o0oo0oo2 = this.f3115Oooo0o;
        if (o0oo0oo2 instanceof o0O0ooO) {
            long j = ((o0O0ooO) o0oo0oo2).f32140OooO0O0;
            o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
            z = (j > o00000O0.f32062OooO ? 1 : (j == o00000O0.f32062OooO ? 0 : -1)) == 0 ? false : true;
        }
        if (this.f3116Oooo0oO.OooO0O0() && o0OO00O.OooO0OO(this.f3117Oooo0oo.f27237OooO0O0) && z) {
            o0Oo0oo o0oo0oo3 = this.f3115Oooo0o;
            oo0oOO0 oo0ooo0 = this.f3117Oooo0oo;
            o00Oo00.OooO0OO(o0oo0oo3, oo0ooo0.f27236OooO00o, new o0OO00O(oo0ooo0.f27237OooO0O0), new o00O00o0(oooo0, null), ooo00o2);
            o00oooo0OooO0OO = DrawModifierKt.OooO0OO(composed, new oo00o(oooo0, this.f3114Oooo, this.f3117Oooo0oo, this.f3116Oooo0oO, this.f3115Oooo0o));
        } else {
            o00oooo0OooO0OO = o00OOOO0.OooO00o.f4198Oooo0o;
        }
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0OO;
    }
}
