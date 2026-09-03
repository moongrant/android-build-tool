package p591o0oOooOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooOo00;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o00Ooo;
import p145o00Oo0.o0OoOo0;
import p191o00o0O.o000OOo;
import p191o00o0O.o0Oo0oo;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends Lambda implements Function1<o0Oo0oo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f47341Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(float f) {
        super(1);
        this.f47341Oooo0o = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0Oo0oo o0oo0oo2) {
        o0Oo0oo Canvas = o0oo0oo2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        o000O0o o000o0oOooO00o = o00Ooo.OooO00o();
        float f = 2;
        o0OoOo0 o0oooo1 = (o0OoOo0) o000o0oOooO00o;
        o0oooo1.OooOO0((OooOo00.OooO0Oo(Canvas.OooO0OO()) / f) - this.f47341Oooo0o, OooOo00.OooO0O0(Canvas.OooO0OO()) - this.f47341Oooo0o);
        o0oooo1.OooOOO(OooOo00.OooO0Oo(Canvas.OooO0OO()) / f, OooOo00.OooO0O0(Canvas.OooO0OO()) - (this.f47341Oooo0o * f));
        o0oooo1.OooOOO((OooOo00.OooO0Oo(Canvas.OooO0OO()) / f) + this.f47341Oooo0o, OooOo00.OooO0O0(Canvas.OooO0OO()) - this.f47341Oooo0o);
        o0oooo1.OooOOO(OooOo00.OooO0Oo(Canvas.OooO0OO()) / f, OooOo00.OooO0O0(Canvas.OooO0OO()));
        o0oooo1.close();
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        Canvas.Oooo0oO(o000o0oOooO00o, o0000O0.f41693OooO0OO, 1.0f, o000OOo.f33065OooO00o, null, 3);
        return Unit.INSTANCE;
    }
}
