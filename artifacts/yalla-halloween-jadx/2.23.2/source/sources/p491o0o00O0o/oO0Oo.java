package p491o0o00O0o;

import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f49070OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(UntieAccountBindActivity untieAccountBindActivity) {
        super(0);
        this.f49070OooO0Oo = untieAccountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UntieAccountBindActivity untieAccountBindActivity = this.f49070OooO0Oo;
        int i = untieAccountBindActivity.f24891OooOo0O;
        BaseActivityK.OooOo0o(untieAccountBindActivity, null, 0L, 3);
        int i2 = untieAccountBindActivity.f24891OooOo0O;
        if (i2 == 4) {
            AppConfigRepo.f24292OooO00o.getClass();
            AppConfigRepo.f24293OooO0O0.observe(untieAccountBindActivity, new UntieAccountBindActivity.OooO0OO(new o0oo0000(untieAccountBindActivity)));
        } else if (i2 == 9) {
            untieAccountBindActivity.OooOo().OooO0OO();
        } else if (i2 == 12) {
            untieAccountBindActivity.OooOo().OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
