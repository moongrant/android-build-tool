package p496o0o00o;

import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
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
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49105OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserInfoActivity f49106OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserInfoActivity userInfoActivity) {
            super(1);
            this.f49106OooO0Oo = userInfoActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0OO000.OooO00o("105073");
            int i = SupportTopActivity.f27192OooOo0O;
            UserInfoActivity context = this.f49106OooO0Oo;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SupportTopActivity.class));
            return Unit.INSTANCE;
        }
    }

    public o0OOo000(UserInfoActivity userInfoActivity) {
        this.f49105OooO0o0 = userInfoActivity;
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
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        UserInfoActivity userInfoActivity = this.f49105OooO0o0;
        LinearLayout linearLayout = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57684OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.head.details.llSupport");
        o000OO00.OooOOOO(linearLayout);
        View view = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57680OooO0oo;
        Intrinsics.checkNotNullExpressionValue(view, "binding.head.details.headLine");
        o000OO00.OooO0O0(view);
        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(userInfoActivity);
        oooO00o2.OooO00o(OooO.OooO0OO());
        oooO00o2.f43911OooO0OO = data2.get(0).getUserHeader();
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.f43925OooOOo0 = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo.getDrawable();
        oooO00o2.OooO0Oo(userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57688OooOOo);
        if (data2.size() > 1) {
            OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(userInfoActivity);
            oooO00o3.OooO00o(OooO.OooO0OO());
            oooO00o3.f43911OooO0OO = data2.get(1).getUserHeader();
            oooO00o3.f43909OooO00o = 0;
            oooO00o3.f43925OooOOo0 = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo.getDrawable();
            oooO00o3.OooO0Oo(userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57690OooOOoo);
        } else {
            FrameLayout frameLayout = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57677OooO0o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.head.details.flTopUser2");
            o000OO00.OooO0O0(frameLayout);
        }
        if (data2.size() > 2) {
            OooOO0.OooO00o oooO00o4 = new OooOO0.OooO00o(userInfoActivity);
            oooO00o4.OooO00o(OooO.OooO0OO());
            oooO00o4.f43911OooO0OO = data2.get(2).getUserHeader();
            oooO00o4.f43909OooO00o = 0;
            oooO00o4.f43925OooOOo0 = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo.getDrawable();
            oooO00o4.OooO0Oo(userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57693OooOo00);
        } else {
            FrameLayout frameLayout2 = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57679OooO0oO;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.head.details.flTopUser3");
            o000OO00.OooO0O0(frameLayout2);
        }
        LinearLayout linearLayout2 = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57684OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.head.details.llSupport");
        o000OO00.OooO0oo(linearLayout2, new OooO00o(userInfoActivity));
    }
}
