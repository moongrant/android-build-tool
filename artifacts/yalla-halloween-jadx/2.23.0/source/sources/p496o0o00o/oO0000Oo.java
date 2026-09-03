package p496o0o00o;

import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p426o0OoOO.o0OOO0o;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends Lambda implements Function2<Integer, SelectDialogModel<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49129OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(UserInfoEditActivity userInfoEditActivity) {
        super(2);
        this.f49129OooO0Oo = userInfoEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<String> selectDialogModel) {
        num.intValue();
        SelectDialogModel<String> item = selectDialogModel;
        Intrinsics.checkNotNullParameter(item, "item");
        int tag = item.getTag();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Integer num2 = (Integer) o000000O.OooOOO().getValue();
        String strOooO00o = (num2 != null && tag == num2.intValue()) ? null : o0OOO0o.OooO00o(item.getTag());
        UserInfoEditActivity userInfoEditActivity = this.f49129OooO0Oo;
        userInfoEditActivity.f27292OooOoOO = strOooO00o;
        userInfoEditActivity.OooOoO().f58085OooOO0O.setText(userInfoEditActivity.OooOoOO(String.valueOf(item.getTag())));
        userInfoEditActivity.Oooo000();
        return Unit.INSTANCE;
    }
}
