package p602o0oo0O0O;

import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.conversation.bean.ConversationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f56875OooO = "";

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f56876OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56877OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f56878OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f56879OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f56880OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f56881OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o000OO o000oo2, String str, String str2, String str3, String str4, YallaChatVM.OooOo00 oooOo00) {
        super(0);
        this.f56876OooO0Oo = o000oo2;
        this.f56878OooO0o0 = str;
        this.f56877OooO0o = str2;
        this.f56879OooO0oO = str3;
        this.f56880OooO0oo = str4;
        this.f56881OooOO0 = oooOo00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f56876OooO0Oo.f56891OooO00o, new ConversationRequest(this.f56878OooO0o0, this.f56877OooO0o, this.f56879OooO0oO, this.f56880OooO0oo, this.f56875OooO), new o0000O(this.f56881OooOO0), null, 8, null);
        return Unit.INSTANCE;
    }
}
