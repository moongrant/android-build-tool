package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43800Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ShareToFriendsActivity shareToFriendsActivity) {
        super(1);
        this.f43800Oooo0o = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        ShareToFriendsActivity shareToFriendsActivity = this.f43800Oooo0o;
        ShareToFriendsActivity.OooO00o oooO00o = ShareToFriendsActivity.f22209o00o0O;
        shareToFriendsActivity.Oooo00o(it);
        return Unit.INSTANCE;
    }
}
