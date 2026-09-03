package p496o0o00o;

import com.yalla.yalla.app.golbalData.OooO00o;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p426o0OoOO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Ooooo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49174OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49174OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String id = o0OOO0o.OooO00o(num.intValue());
        String name = "";
        if (id.length() > 0) {
            HashMap<String, CountryModel> map = OooO00o.f22727OooO00o;
            Intrinsics.checkNotNullParameter(id, "id");
            CountryModel countryModelOooO00o = OooO00o.OooO00o(id);
            if (countryModelOooO00o != null) {
                name = countryModelOooO00o.getName();
                Intrinsics.checkNotNullExpressionValue(name, "countryModel.name");
            }
        }
        int i = UserInfoEditActivity.f27283Oooo0oO;
        this.f49174OooO0Oo.OooOoO().f58084OooOO0.setText(name);
        return Unit.INSTANCE;
    }
}
