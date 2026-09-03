package p534o0o0OOoo;

import com.yalla.yalla.data.db.table.FriendRequestMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00Oo0 extends Lambda implements Function1<FriendRequestMessage, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO00Oo0 f53591OooO0Oo = new oO00Oo0();

    public oO00Oo0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(FriendRequestMessage friendRequestMessage) {
        FriendRequestMessage it = friendRequestMessage;
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getTargetUserId());
    }
}
