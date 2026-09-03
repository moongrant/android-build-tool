package p566o0oOo00O;

import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
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
import p257o00ooOO0.o0oO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o0 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList<SelectDialogModel<String>> f45311Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45312Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(ArrayList<SelectDialogModel<String>> arrayList, UserInfoEditActivity userInfoEditActivity) {
        super(3);
        this.f45311Oooo0o = arrayList;
        this.f45312Oooo0oO = userInfoEditActivity;
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
            o0oO0O0o.OooO0O0(it, null, this.f45311Oooo0o, null, false, new o0O0o00O(this.f45312Oooo0oO), null, null, 0L, null, null, null, ooo00o2, (i & 14) | 512, 0, 4058);
        }
        return Unit.INSTANCE;
    }
}
