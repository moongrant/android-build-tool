package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p579o0oOoOOo.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43896Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f43896Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
        o0O00OO<Boolean> it = o0o00oo2;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            k0.f45988OooO00o.OooO00o(PrivateChatActivity.OooOoO(this.f43896Oooo0o).getHalfDialogWebPageInfo(), new y(this.f43896Oooo0o), ooo00o2, 392);
        }
        return Unit.INSTANCE;
    }
}
