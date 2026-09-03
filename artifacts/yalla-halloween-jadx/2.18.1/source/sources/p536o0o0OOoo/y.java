package p536o0o0OOoo;

import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43889Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PrivateChatActivity privateChatActivity) {
        super(0);
        this.f43889Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVM momentVMOooOoO = PrivateChatActivity.OooOoO(this.f43889Oooo0o);
        WebPageInfo.OooO00o oooO00o = WebPageInfo.f21213OoooOoo;
        momentVMOooOoO.setHalfDialogWebPageInfo(WebPageInfo.f21214Ooooo00);
        return Unit.INSTANCE;
    }
}
