package p563o0oOo0;

import androidx.recyclerview.widget.OooOo;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f45094OooO00o = new OooO00o();

    public static final class OooO00o extends OooOo.OooO<FriendInfo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f45095OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f45096OooO0O0 = "";

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(FriendInfo friendInfo, FriendInfo friendInfo2) {
            String userIdx;
            String userName;
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (this.f45095OooO00o || !Intrinsics.areEqual(oldItem.getFriend().getMemoName(), newItem.getFriend().getMemoName()) || oldItem.getFriend().getInRoom() != newItem.getFriend().getInRoom()) {
                return false;
            }
            UserInfo userInfo = oldItem.getUserInfo();
            if (!(userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo()))) {
                return false;
            }
            UserInfo userInfo2 = oldItem.getUserInfo();
            Integer numValueOf = userInfo2 != null ? Integer.valueOf(userInfo2.getVipLevel()) : null;
            UserInfo userInfo3 = newItem.getUserInfo();
            if (!Intrinsics.areEqual(numValueOf, userInfo3 != null ? Integer.valueOf(userInfo3.getVipLevel()) : null)) {
                return false;
            }
            UserInfo userInfo4 = oldItem.getUserInfo();
            Integer numValueOf2 = userInfo4 != null ? Integer.valueOf(userInfo4.getVipState()) : null;
            UserInfo userInfo5 = newItem.getUserInfo();
            if (!Intrinsics.areEqual(numValueOf2, userInfo5 != null ? Integer.valueOf(userInfo5.getVipState()) : null) || !(!StringsKt.isBlank(this.f45096OooO0O0))) {
                return false;
            }
            UserInfo userInfo6 = newItem.getUserInfo();
            if (!((userInfo6 == null || (userName = userInfo6.getUserName()) == null || !StringsKt__StringsKt.contains(userName, this.f45096OooO0O0, true)) ? false : true)) {
                return false;
            }
            UserInfo userInfo7 = newItem.getUserInfo();
            if (!((userInfo7 == null || (userIdx = userInfo7.getUserIdx()) == null || !StringsKt__StringsKt.contains(userIdx, this.f45096OooO0O0, true)) ? false : true)) {
                return false;
            }
            String memoName = newItem.getFriend().getMemoName();
            return memoName != null && StringsKt__StringsKt.contains(memoName, this.f45096OooO0O0, true);
        }

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO0O0(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getFriend().getFriendId() == newItem.getFriend().getFriendId();
        }
    }
}
