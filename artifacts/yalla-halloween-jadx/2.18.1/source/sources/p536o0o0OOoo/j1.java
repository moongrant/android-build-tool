package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43804Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ShareToFriendsActivity shareToFriendsActivity) {
        super(1);
        this.f43804Oooo0o = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ShareToFriendsActivity.OooOooo(this.f43804Oooo0o, bool.booleanValue());
        return Unit.INSTANCE;
    }
}
