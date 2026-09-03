package p534o0o0OOoo;

import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53583OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o0(FriendRequestMessageVM friendRequestMessageVM) {
        super(0);
        this.f53583OooO0Oo = friendRequestMessageVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f53583OooO0Oo.clearMessage();
        return Unit.INSTANCE;
    }
}
