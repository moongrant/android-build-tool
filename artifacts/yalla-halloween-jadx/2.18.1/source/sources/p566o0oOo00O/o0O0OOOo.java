package p566o0oOo00O;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
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
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0OOOo extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45309Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(UserInfoActivity userInfoActivity) {
        super(3);
        this.f45309Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
        o0O00OO<Boolean> it = o0o00oo2;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0oo0o.OooO0Oo(it, OooOOO.OooO0OO(R.string.Unfollow), OooOOO.OooO0OO(R.string.unFollow_tips), null, false, false, null, null, OooOOO.OooO0OO(R.string.Unfollow), false, null, false, new o0O0OO0(this.f45309Oooo0o), null, false, null, o0O0OOO0.f45308Oooo0o, null, null, ooo00o2, i & 14, 1572864, 454392);
        }
        return Unit.INSTANCE;
    }
}
