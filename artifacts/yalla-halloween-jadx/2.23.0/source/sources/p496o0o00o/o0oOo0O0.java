package p496o0o00o;

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
import p361o0OOo00o.OooOO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49122OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49122OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(o0000.OooO0OO(oO00OOo0.share), o0000.OooO0OO(oO00OOo0.Report));
        UserInfoActivity userInfoActivity = this.f49122OooO0Oo;
        UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
        if (userInfoModel != null) {
            Intrinsics.checkNotNull(userInfoModel);
            if (userInfoModel.getIsFriend()) {
                arrayListArrayListOf.add(0, o0000.OooO0OO(oO00OOo0.User_Info_Menu_ramark));
            }
            UserInfoModel userInfoModel2 = userInfoActivity.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel2);
            if (userInfoModel2.getIsBlack()) {
                arrayListArrayListOf.add(o0000.OooO0OO(oO00OOo0.Unblock));
            } else {
                arrayListArrayListOf.add(o0000.OooO0OO(oO00OOo0.Block));
            }
        }
        OooOO0O oooOO0O = new OooOO0O(userInfoActivity, arrayListArrayListOf, new o0O0o0(arrayListArrayListOf, userInfoActivity));
        ImageView anchor = userInfoActivity.OooOooO().f57994OooO0o0;
        Intrinsics.checkNotNullExpressionValue(anchor, "binding.ivMore");
        int iOooO00o = o0000O0.OooO00o(-10);
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        oooOO0O.OooO0O0(anchor, iOooO00o, true);
        return Unit.INSTANCE;
    }
}
