package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f43806Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(0);
        this.f43806Oooo0o = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FriendRequestMessageActivity friendRequestMessageActivity = this.f43806Oooo0o;
        FriendRequestMessageActivity.OooO00o oooO00o = FriendRequestMessageActivity.f22157OooooOO;
        friendRequestMessageActivity.OooOooo().clearMessage();
        return Unit.INSTANCE;
    }
}
