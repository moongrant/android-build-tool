package p563o0oOo0;

import androidx.recyclerview.widget.OooOo;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f45097OooO00o = new OooO00o();

    public static final class OooO00o extends OooOo.OooO<FriendInfo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f45098OooO00o;

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            UserInfo userInfo = oldItem.getUserInfo();
            return (userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo())) && Intrinsics.areEqual(oldItem.getFriend().getMemoName(), newItem.getFriend().getMemoName()) && !this.f45098OooO00o;
        }

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO0O0(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getFriend().getUid() == newItem.getFriend().getUid() && oldItem.getFriend().getFriendId() == newItem.getFriend().getFriendId();
        }
    }
}
