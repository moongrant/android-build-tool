package p457o0Ooo0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p363o0OOo00O.OooO;
import p460o0Ooo0o.oo0o0O0;
import p550o0oOOO0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f47648OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(o00O00OO o00o00oo2) {
        super(1);
        this.f47648OooO0Oo = o00o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        oo0o0O0.OooO00o("_ChangeVoice", "video voice change: " + iIntValue);
        OooO oooOOooO0o0 = this.f47648OooO0Oo.OooO0o0();
        if (oooOOooO0o0 != null) {
            oooOOooO0o0.OooO0oO(iIntValue / 100.0f);
        }
        return Unit.INSTANCE;
    }
}
