package p496o0o00o;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.user.MyUserInfoModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<MyUserInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f49112OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49113OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(PremiumActivity premiumActivity, boolean z) {
        super(1);
        this.f49112OooO0Oo = z;
        this.f49113OooO0o0 = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MyUserInfoModel myUserInfoModel) {
        boolean z = this.f49112OooO0Oo;
        PremiumActivity premiumActivity = this.f49113OooO0o0;
        if (z && premiumActivity.f27150OooOoo.getValue() > PremiumLevel.Premium0.getValue()) {
            PremiumActivity.OooOoOO(premiumActivity);
        }
        int i = PremiumActivity.f27140Oooo0oO;
        premiumActivity.Oooo0o0(false);
        return Unit.INSTANCE;
    }
}
