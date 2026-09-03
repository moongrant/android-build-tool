package p566o0oOo00O;

import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.SupportInfo;
import com.yalla.yalla.common.model.UserSupportRank;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p391o0OOooOo.o0O00000;
import p516o0o0O000.o0OOO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0o0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45305OooO00o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ UserInfoActivity f45306Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserInfoActivity userInfoActivity) {
            super(1);
            this.f45306Oooo0o = userInfoActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0O00000.OooO0OO("Me_profile_supporter");
            SupportTopActivity.OooO00o oooO00o = SupportTopActivity.f23411OooooO0;
            UserInfoActivity context = this.f45306Oooo0o;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SupportTopActivity.class));
            return Unit.INSTANCE;
        }
    }

    public o0O0O0o0(UserInfoActivity userInfoActivity) {
        this.f45305OooO00o = userInfoActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        SupportInfo data;
        List<SupportInfo.UserData> data2;
        super.onFinish(str);
        if (str == null) {
            return;
        }
        o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
        UserSupportRank userSupportRank = (UserSupportRank) o0OOO0o.OooO0O0(str, UserSupportRank.class);
        if (userSupportRank == null || (data = userSupportRank.getData()) == null || (data2 = data.getData()) == null || data2.size() <= 0) {
            return;
        }
        UserInfoActivity userInfoActivity = this.f45305OooO00o;
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        LinearLayout linearLayout = userInfoActivity.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50050OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.head.details.llSupport");
        o00O0O.OooO(linearLayout);
        View view = this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50044OooO0oO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.head.details.headLine");
        o00O0O.OooO00o(view);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f45305OooO00o);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48429OooO0OO = data2.get(0).getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.f48443OooOOo0 = this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50051OooOOOO.getDrawable();
        oooO00o2.OooO0o(this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50054OooOOo0);
        if (data2.size() > 1) {
            oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this.f45305OooO00o);
            oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o3.f48429OooO0OO = data2.get(1).getUserHeader();
            oooO00o3.f48427OooO00o = 0;
            oooO00o3.f48443OooOOo0 = this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50051OooOOOO.getDrawable();
            oooO00o3.OooO0o(this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50053OooOOo);
        } else {
            FrameLayout frameLayout = this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50043OooO0o0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.head.details.flTopUser2");
            o00O0O.OooO00o(frameLayout);
        }
        if (data2.size() > 2) {
            oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(this.f45305OooO00o);
            oooO00o4.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o4.f48429OooO0OO = data2.get(2).getUserHeader();
            oooO00o4.f48427OooO00o = 0;
            oooO00o4.f48443OooOOo0 = this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50051OooOOOO.getDrawable();
            oooO00o4.OooO0o(this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50055OooOOoo);
        } else {
            FrameLayout frameLayout2 = this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50042OooO0o;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.head.details.flTopUser3");
            o00O0O.OooO00o(frameLayout2);
        }
        LinearLayout linearLayout2 = this.f45305OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50050OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.head.details.llSupport");
        o00O0O.OooO0Oo(linearLayout2, new OooO00o(this.f45305OooO00o));
    }
}
