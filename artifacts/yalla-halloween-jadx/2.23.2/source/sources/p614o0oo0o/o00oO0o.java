package p614o0oo0o;

import com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.group.join.bean.GroupJoinRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f57532OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f57533OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f57534OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f57535OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f57536OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f57537OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(o000oOoO o000oooo2, String str, String str2, String str3, String str4, TopicGroupJoinVM.OooO oooO) {
        super(0);
        this.f57533OooO0Oo = o000oooo2;
        this.f57535OooO0o0 = str;
        this.f57534OooO0o = str2;
        this.f57536OooO0oO = str3;
        this.f57537OooO0oo = str4;
        this.f57532OooO = oooO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f57533OooO0Oo.f57514OooO00o, new GroupJoinRequest(this.f57535OooO0o0, this.f57534OooO0o, this.f57536OooO0oO, this.f57537OooO0oo), new oo000o(this.f57532OooO), null, 8, null);
        return Unit.INSTANCE;
    }
}
