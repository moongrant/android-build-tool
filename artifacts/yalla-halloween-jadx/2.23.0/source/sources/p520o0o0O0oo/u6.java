package p520o0o0O0oo;

import com.yalla.yalla.model.gift.MyGiftModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.UserGiftVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class u6 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f53344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f53345OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MyGiftModel.Data f53346OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f53347OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u6(long j, MyGiftModel.Data data, UserInfoActivity userInfoActivity, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.f53344OooO0Oo = j;
        this.f53346OooO0o0 = data;
        this.f53345OooO0o = userInfoActivity;
        this.f53347OooO0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserGiftVM userGiftVM = new UserGiftVM();
        long j = this.f53344OooO0Oo;
        MyGiftModel.Data data = this.f53346OooO0o0;
        userGiftVM.sendGift(j, data.getGiftid(), 1, data.getImageurl()).observe(this.f53345OooO0o, new w6(new t6(this.f53347OooO0oO)));
        o0OO000.OooO00o("105079");
        return Unit.INSTANCE;
    }
}
