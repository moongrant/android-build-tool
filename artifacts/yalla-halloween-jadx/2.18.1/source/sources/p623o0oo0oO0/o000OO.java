package p623o0oo0oO0;

import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.conversation.bean.ConversationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f48649Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f48650Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f48651Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f48652Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f48653OoooO0 = "";

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f48654OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f48655OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o0000O0 o0000o1, String str, String str2, String str3, String str4, Function1 function1) {
        super(0);
        this.f48650Oooo0o = o0000o1;
        this.f48651Oooo0oO = str;
        this.f48652Oooo0oo = str2;
        this.f48649Oooo = str3;
        this.f48654OoooO00 = str4;
        this.f48655OoooO0O = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f48650Oooo0o.f48630OooO00o, new ConversationRequest(this.f48651Oooo0oO, this.f48652Oooo0oo, this.f48649Oooo, this.f48654OoooO00, this.f48653OoooO0), new o0000O0O(this.f48655OoooO0O), null, 8, null);
        return Unit.INSTANCE;
    }
}
