package com.yalla.yalla.ui.adapter;

import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27549OooO00o = new OooO00o();

    public static final class OooO00o extends androidx.recyclerview.widget.OooOo.OooO<FriendInfo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f27550OooO00o;

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            UserInfo userInfo = oldItem.getUserInfo();
            return (userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo())) && Intrinsics.areEqual(oldItem.getFriend().getMemoName(), newItem.getFriend().getMemoName()) && !this.f27550OooO00o;
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
