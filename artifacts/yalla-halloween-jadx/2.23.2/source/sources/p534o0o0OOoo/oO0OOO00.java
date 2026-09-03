package p534o0o0OOoo;

import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessage f53614OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(FriendRequestMessageVM friendRequestMessageVM, FriendRequestMessage friendRequestMessage) {
        super(0);
        this.f53613OooO0Oo = friendRequestMessageVM;
        this.f53614OooO0o0 = friendRequestMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("104024");
        this.f53613OooO0Oo.applyFriendRequest(false, this.f53614OooO0o0.getTargetUserId());
        return Unit.INSTANCE;
    }
}
