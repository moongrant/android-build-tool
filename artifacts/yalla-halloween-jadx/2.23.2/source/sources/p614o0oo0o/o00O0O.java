package p614o0oo0o;

import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.conversation.bean.ConversationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f57517OooO = "";

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f57518OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f57519OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f57520OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f57521OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f57522OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f57523OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o000oOoO o000oooo2, String str, String str2, String str3, String str4, YallaChatVM.OooOo00 oooOo00) {
        super(0);
        this.f57518OooO0Oo = o000oooo2;
        this.f57520OooO0o0 = str;
        this.f57519OooO0o = str2;
        this.f57521OooO0oO = str3;
        this.f57522OooO0oo = str4;
        this.f57523OooOO0 = oooOo00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f57518OooO0Oo.f57514OooO00o, new ConversationRequest(this.f57520OooO0o0, this.f57519OooO0o, this.f57521OooO0oO, this.f57522OooO0oo, this.f57517OooO), new o0OoOo0(this.f57523OooOO0), null, 8, null);
        return Unit.INSTANCE;
    }
}
