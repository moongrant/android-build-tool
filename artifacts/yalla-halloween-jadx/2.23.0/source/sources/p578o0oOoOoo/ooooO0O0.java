package p578o0oOoOoo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0OOo000.OooO0OO;
import p455o0Ooo0O0.oo0o0Oo;
import p468o0OoooO0.o0OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO0O0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f56513OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(oo0o0Oo oo0o0oo) {
        super(1);
        this.f56513OooO0Oo = oo0o0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        o0OO0O0.OooO00o("_ChangeVoice", "video voice change: " + iIntValue);
        OooO0OO oooO0OOOooO0o0 = this.f56513OooO0Oo.OooO0o0();
        if (oooO0OOOooO0o0 != null) {
            oooO0OOOooO0o0.OooO0oO(iIntValue / 100.0f);
        }
        return Unit.INSTANCE;
    }
}
