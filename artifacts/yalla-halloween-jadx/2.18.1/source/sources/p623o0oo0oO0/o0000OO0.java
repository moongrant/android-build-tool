package p623o0oo0oO0;

import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.group.create.bean.GroupCreateRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f48635Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f48636Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f48637Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f48638Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f48639OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f48640OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f48641OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000OO0(o0000O0 o0000o1, String str, String str2, String str3, String str4, String str5, Function1<? super BaseResp, Unit> function1) {
        super(0);
        this.f48636Oooo0o = o0000o1;
        this.f48637Oooo0oO = str;
        this.f48638Oooo0oo = str2;
        this.f48635Oooo = str3;
        this.f48640OoooO00 = str4;
        this.f48639OoooO0 = str5;
        this.f48641OoooO0O = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f48636Oooo0o.f48630OooO00o, new GroupCreateRequest(this.f48637Oooo0oO, this.f48638Oooo0oo, this.f48635Oooo, this.f48640OoooO00, this.f48639OoooO0), new o0000O(this.f48641OoooO0O), null, 8, null);
        return Unit.INSTANCE;
    }
}
