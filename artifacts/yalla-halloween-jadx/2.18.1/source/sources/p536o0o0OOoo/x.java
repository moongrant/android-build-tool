package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43886Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(PrivateChatActivity privateChatActivity) {
        super(2);
        this.f43886Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String str2 = str;
        Integer num2 = num;
        PrivateChatActivity privateChatActivity = this.f43886Oooo0o;
        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
        PrivateChatVM privateChatVMOooo0O0 = privateChatActivity.Oooo0O0();
        Intrinsics.checkNotNull(num2);
        int iIntValue = num2.intValue();
        Intrinsics.checkNotNull(str2);
        privateChatVMOooo0O0.sendGifMessage(iIntValue, str2);
        return Unit.INSTANCE;
    }
}
