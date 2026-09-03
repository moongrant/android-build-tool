package p506o0o00oOo;

import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.SupportInfo;
import com.yalla.yalla.model.UserSupportRank;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o00 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50570OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserInfoActivity f50571OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserInfoActivity userInfoActivity) {
            super(1);
            this.f50571OooO0Oo = userInfoActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0oo0000.OooO00o.OooO0O0("105073");
            int i = SupportTopActivity.f26727OooOo0O;
            UserInfoActivity context = this.f50571OooO0Oo;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SupportTopActivity.class));
            return Unit.INSTANCE;
        }
    }

    public oOo0o00(UserInfoActivity userInfoActivity) {
        this.f50570OooO0o0 = userInfoActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@Nullable String str, @Nullable String str2) {
        super.OooO0O0(str, str2);
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@Nullable String str) {
        UserSupportRank userSupportRank;
        SupportInfo data;
        List<SupportInfo.UserData> data2;
        if (str == null || (userSupportRank = (UserSupportRank) com.code.android.json.OooO00o.OooO0OO(UserSupportRank.class, str)) == null || (data = userSupportRank.getData()) == null || (data2 = data.getData()) == null || data2.size() <= 0) {
            return;
        }
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        UserInfoActivity userInfoActivity = this.f50570OooO0o0;
        LinearLayout llSupport = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45448OooOOO;
        Intrinsics.checkNotNullExpressionValue(llSupport, "llSupport");
        o000O.OooOOOO(llSupport);
        View headLine = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45444OooO0oo;
        Intrinsics.checkNotNullExpressionValue(headLine, "headLine");
        o000O.OooO0O0(headLine);
        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(userInfoActivity);
        oooO00o2.OooO00o(d1.OooO0OO());
        oooO00o2.f43126OooO0OO = data2.get(0).getUserHeader();
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.f43140OooOOo0 = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo.getDrawable();
        oooO00o2.OooO0Oo(userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45452OooOOo);
        if (data2.size() > 1) {
            Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(userInfoActivity);
            oooO00o3.OooO00o(d1.OooO0OO());
            oooO00o3.f43126OooO0OO = data2.get(1).getUserHeader();
            oooO00o3.f43124OooO00o = 0;
            oooO00o3.f43140OooOOo0 = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo.getDrawable();
            oooO00o3.OooO0Oo(userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45454OooOOoo);
        } else {
            FrameLayout flTopUser2 = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45441OooO0o;
            Intrinsics.checkNotNullExpressionValue(flTopUser2, "flTopUser2");
            o000O.OooO0O0(flTopUser2);
        }
        if (data2.size() > 2) {
            Oooo000.OooO00o oooO00o4 = new Oooo000.OooO00o(userInfoActivity);
            oooO00o4.OooO00o(d1.OooO0OO());
            oooO00o4.f43126OooO0OO = data2.get(2).getUserHeader();
            oooO00o4.f43124OooO00o = 0;
            oooO00o4.f43140OooOOo0 = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo.getDrawable();
            oooO00o4.OooO0Oo(userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45457OooOo00);
        } else {
            FrameLayout flTopUser3 = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45443OooO0oO;
            Intrinsics.checkNotNullExpressionValue(flTopUser3, "flTopUser3");
            o000O.OooO0O0(flTopUser3);
        }
        LinearLayout llSupport2 = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45448OooOOO;
        Intrinsics.checkNotNullExpressionValue(llSupport2, "llSupport");
        o000O.OooO0oo(llSupport2, new OooO00o(userInfoActivity));
    }
}
