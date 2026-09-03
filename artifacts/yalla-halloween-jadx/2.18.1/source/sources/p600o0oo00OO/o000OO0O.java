package p600o0oo00OO;

import android.app.Activity;
import com.yalla.yalla.model.VisitorUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.user.UserVisitorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VisitorUserInfoModel f48056Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserVisitorVM f48057Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(VisitorUserInfoModel visitorUserInfoModel, UserVisitorVM userVisitorVM) {
        super(0);
        this.f48056Oooo0o = visitorUserInfoModel;
        this.f48057Oooo0oO = userVisitorVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String vid;
        if (!this.f48056Oooo0o.getIsnew() && (vid = this.f48056Oooo0o.getVid()) != null) {
            this.f48057Oooo0oO.visitorClick(vid);
        }
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        if (activityOooO0O0 != null) {
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, activityOooO0O0, String.valueOf(this.f48056Oooo0o.getUserId()), false, 12);
        }
        return Unit.INSTANCE;
    }
}
