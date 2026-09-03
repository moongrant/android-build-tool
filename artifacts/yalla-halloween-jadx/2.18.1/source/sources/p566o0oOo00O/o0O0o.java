package p566o0oOo00O;

import android.view.View;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p554o0oOOOoo.ooOOOOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45310Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(UserInfoActivity userInfoActivity) {
        super(1);
        this.f45310Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) throws Exception {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(OooOOO.OooO0OO(R.string.share), OooOOO.OooO0OO(R.string.report));
        UserInfoModel userInfoModel = this.f45310Oooo0o.f23457OooooOO;
        if (userInfoModel != null) {
            Intrinsics.checkNotNull(userInfoModel);
            if (userInfoModel.getIsFriend()) {
                arrayListArrayListOf.add(0, OooOOO.OooO0OO(R.string.User_Info_Menu_ramark));
            }
            UserInfoModel userInfoModel2 = this.f45310Oooo0o.f23457OooooOO;
            Intrinsics.checkNotNull(userInfoModel2);
            if (userInfoModel2.getIsBlack()) {
                arrayListArrayListOf.add(OooOOO.OooO0OO(R.string.Unblock));
            } else {
                arrayListArrayListOf.add(OooOOO.OooO0OO(R.string.Block));
            }
        }
        UserInfoActivity userInfoActivity = this.f45310Oooo0o;
        ooOOOOoo oooooooo = new ooOOOOoo(userInfoActivity, arrayListArrayListOf, new o0oOOo(arrayListArrayListOf, userInfoActivity));
        ImageView anchor = this.f45310Oooo0o.Oooo00o().f50401OooO0o0;
        Intrinsics.checkNotNullExpressionValue(anchor, "binding.ivMore");
        int iOooO00o = OooOo00.OooO00o(-10);
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        oooooooo.OooO00o(anchor, true, iOooO00o);
        return Unit.INSTANCE;
    }
}
