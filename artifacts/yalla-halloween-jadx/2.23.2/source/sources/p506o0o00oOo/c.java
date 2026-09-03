package p506o0o00oOo;

import androidx.compose.foundation.layout.oo000o;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Lambda implements Function2<Integer, SelectDialogModel<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50395OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserInfoEditActivity userInfoEditActivity) {
        super(2);
        this.f50395OooO0Oo = userInfoEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<String> selectDialogModel) {
        num.intValue();
        SelectDialogModel<String> item = selectDialogModel;
        Intrinsics.checkNotNullParameter(item, "item");
        int tag = item.getTag();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Integer num2 = (Integer) o0O00oO0.OooOOO().getValue();
        String strOooO00o = (num2 != null && tag == num2.intValue()) ? null : oo000o.OooO00o(item.getTag());
        UserInfoEditActivity userInfoEditActivity = this.f50395OooO0Oo;
        userInfoEditActivity.f26827OooOoOO = strOooO00o;
        userInfoEditActivity.OooOoO().f45665OooOO0O.setText(userInfoEditActivity.OooOoOO(String.valueOf(item.getTag())));
        userInfoEditActivity.Oooo000();
        return Unit.INSTANCE;
    }
}
