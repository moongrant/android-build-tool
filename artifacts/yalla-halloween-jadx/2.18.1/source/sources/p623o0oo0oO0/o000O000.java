package p623o0oo0oO0;

import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.group.join.bean.GroupJoinRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f48643Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f48644Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f48645Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f48646Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f48647OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f48648OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O000(o0000O0 o0000o1, String str, String str2, String str3, String str4, Function1<? super BaseResp, Unit> function1) {
        super(0);
        this.f48644Oooo0o = o0000o1;
        this.f48645Oooo0oO = str;
        this.f48646Oooo0oo = str2;
        this.f48643Oooo = str3;
        this.f48648OoooO00 = str4;
        this.f48647OoooO0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f48644Oooo0o.f48630OooO00o, new GroupJoinRequest(this.f48645Oooo0oO, this.f48646Oooo0oo, this.f48643Oooo, this.f48648OoooO00), new o000(this.f48647OoooO0), null, 8, null);
        return Unit.INSTANCE;
    }
}
