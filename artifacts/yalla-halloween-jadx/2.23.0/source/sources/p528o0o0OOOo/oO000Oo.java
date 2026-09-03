package p528o0o0OOOo;

import android.app.Activity;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f53827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PostUserModel f53828OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(Activity activity, PostUserModel postUserModel) {
        super(0);
        this.f53827OooO0Oo = activity;
        this.f53828OooO0o0 = postUserModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this.f53827OooO0Oo, String.valueOf(this.f53828OooO0o0.getUserid()), false, 12);
        return Unit.INSTANCE;
    }
}
