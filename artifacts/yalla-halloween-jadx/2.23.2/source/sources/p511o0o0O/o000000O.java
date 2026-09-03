package p511o0o0O;

import com.yalla.yalla.model.gift.MyGiftModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.UserGiftVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f50951OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50952OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MyGiftModel.Data f50953OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f50954OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000000O(long j, MyGiftModel.Data data, UserInfoActivity userInfoActivity, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.f50951OooO0Oo = j;
        this.f50953OooO0o0 = data;
        this.f50952OooO0o = userInfoActivity;
        this.f50954OooO0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserGiftVM userGiftVM = new UserGiftVM();
        long j = this.f50951OooO0Oo;
        MyGiftModel.Data data = this.f50953OooO0o0;
        userGiftVM.sendGift(j, data.getGiftid(), 1, data.getImageurl()).observe(this.f50952OooO0o, new o00000O0(new o000000(this.f50954OooO0oO)));
        OooO00o.OooO0O0("105079");
        return Unit.INSTANCE;
    }
}
