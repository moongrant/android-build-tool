package p566o0oOo00O;

import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o00O extends Lambda implements Function2<Integer, SelectDialogModel<String>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45314Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(UserInfoEditActivity userInfoEditActivity) {
        super(2);
        this.f45314Oooo0o = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<String> selectDialogModel) {
        String str;
        num.intValue();
        SelectDialogModel<String> item = selectDialogModel;
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfoEditActivity userInfoEditActivity = this.f45314Oooo0o;
        int tag = item.getTag();
        Integer value = OooOOO.f41216OooO00o.OooOOOo().getValue();
        if (value != null && tag == value.intValue()) {
            str = null;
        } else {
            str = item.getTag() + "";
        }
        userInfoEditActivity.f23502OoooooO = str;
        this.f45314Oooo0o.OooOooo().f50501OooOO0O.setText(this.f45314Oooo0o.Oooo000(String.valueOf(item.getTag())));
        this.f45314Oooo0o.Oooo0o0();
        return Unit.INSTANCE;
    }
}
