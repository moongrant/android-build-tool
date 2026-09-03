package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49069OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(UserInfoActivity userInfoActivity) {
        super(0);
        this.f49069OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f49069OooO0Oo.OooOooo().setHalfDialogWebPageInfo(WebPageInfo.f32815OooOOo);
        return Unit.INSTANCE;
    }
}
