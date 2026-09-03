package p535o0o0Oo0;

import android.app.Activity;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f53734OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PostUserModel f53735OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(Activity activity, PostUserModel postUserModel) {
        super(0);
        this.f53734OooO0Oo = activity;
        this.f53735OooO0o0 = postUserModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this.f53734OooO0Oo, String.valueOf(this.f53735OooO0o0.getUserid()), false, 12);
        return Unit.INSTANCE;
    }
}
