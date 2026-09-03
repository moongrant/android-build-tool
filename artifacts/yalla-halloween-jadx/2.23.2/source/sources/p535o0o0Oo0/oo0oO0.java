package p535o0o0Oo0;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentGift;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f54256OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentGift f54257OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(Activity activity, MomentGift momentGift) {
        super(0);
        this.f54256OooO0Oo = activity;
        this.f54257OooO0o0 = momentGift;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this.f54256OooO0Oo, String.valueOf(this.f54257OooO0o0.getUserId()), false, 12);
        return Unit.INSTANCE;
    }
}
