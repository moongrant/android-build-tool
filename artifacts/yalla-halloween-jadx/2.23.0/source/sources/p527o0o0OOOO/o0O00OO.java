package p527o0o0OOOO;

import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessage f53640OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(FriendRequestMessageVM friendRequestMessageVM, FriendRequestMessage friendRequestMessage) {
        super(0);
        this.f53639OooO0Oo = friendRequestMessageVM;
        this.f53640OooO0o0 = friendRequestMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("104024");
        this.f53639OooO0Oo.applyFriendRequest(false, this.f53640OooO0o0.getTargetUserId());
        return Unit.INSTANCE;
    }
}
