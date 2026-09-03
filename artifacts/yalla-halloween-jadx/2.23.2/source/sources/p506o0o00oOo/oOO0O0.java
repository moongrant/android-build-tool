package p506o0o00oOo;

import android.view.View;
import android.widget.ImageView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p465o0OooOo.o0O0O0o0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50523OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50523OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(o0000.OooO0OO(o000000.share), o0000.OooO0OO(o000000.Report));
        UserInfoActivity userInfoActivity = this.f50523OooO0Oo;
        UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
        if (userInfoModel != null) {
            Intrinsics.checkNotNull(userInfoModel);
            if (userInfoModel.getIsFriend()) {
                arrayListArrayListOf.add(0, o0000.OooO0OO(o000000.User_Info_Menu_ramark));
            }
            UserInfoModel userInfoModel2 = userInfoActivity.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel2);
            if (userInfoModel2.getIsBlack()) {
                arrayListArrayListOf.add(o0000.OooO0OO(o000000.Unblock));
            } else {
                arrayListArrayListOf.add(o0000.OooO0OO(o000000.Block));
            }
        }
        o0O0O0o0 o0o0o0o0 = new o0O0O0o0(userInfoActivity, arrayListArrayListOf, new oOO0O00O(arrayListArrayListOf, userInfoActivity));
        ImageView anchor = userInfoActivity.OooOooO().f45623OooO0o0;
        Intrinsics.checkNotNullExpressionValue(anchor, "ivMore");
        int iOooO00o = o0000O0.OooO00o(-10);
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        o0o0o0o0.OooO0O0(anchor, iOooO00o, true);
        return Unit.INSTANCE;
    }
}
