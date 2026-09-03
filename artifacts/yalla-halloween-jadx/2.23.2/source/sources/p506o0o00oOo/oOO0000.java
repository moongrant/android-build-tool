package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50516OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0000(UserInfoActivity userInfoActivity) {
        super(0);
        this.f50516OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f50516OooO0Oo.OooOooo().setHalfDialogWebPageInfo(WebPageInfo.f32279OooOOo);
        return Unit.INSTANCE;
    }
}
