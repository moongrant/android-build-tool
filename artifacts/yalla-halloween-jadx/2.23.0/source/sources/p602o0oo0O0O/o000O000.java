package p602o0oo0O0O;

import com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.group.create.bean.GroupCreateRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f56882OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f56883OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56884OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f56885OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f56886OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f56887OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f56888OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(o000OO o000oo2, String str, String str2, String str3, String str4, String str5, TopicGroupCreateVM.OooO oooO) {
        super(0);
        this.f56883OooO0Oo = o000oo2;
        this.f56885OooO0o0 = str;
        this.f56884OooO0o = str2;
        this.f56886OooO0oO = str3;
        this.f56887OooO0oo = str4;
        this.f56882OooO = str5;
        this.f56888OooOO0 = oooO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f56883OooO0Oo.f56891OooO00o, new GroupCreateRequest(this.f56885OooO0o0, this.f56884OooO0o, this.f56886OooO0oO, this.f56887OooO0oo, this.f56882OooO), new o000(this.f56888OooOO0), null, 8, null);
        return Unit.INSTANCE;
    }
}
