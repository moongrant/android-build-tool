package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43881Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f43881Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        PrivateChatActivity privateChatActivity = this.f43881Oooo0o;
        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
        PrivateChatVM privateChatVMOooo0O0 = privateChatActivity.Oooo0O0();
        Intrinsics.checkNotNull(num2);
        privateChatVMOooo0O0.sendEmotionMessage(num2.intValue());
        return Unit.INSTANCE;
    }
}
