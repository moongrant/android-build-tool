package com.yalla.yalla.ui.adapter;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.data.repository.UserInfoRepo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p406o0Oo0Ooo.m0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O extends p400o0Oo0OO.OooOO0O<FriendRequestMessage> {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27621OooOOoo = new OooO00o();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final long f27622OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27623OooOOo0;

    public static final class OooO00o extends androidx.recyclerview.widget.OooOo.OooO<FriendRequestMessage> {
        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(FriendRequestMessage friendRequestMessage, FriendRequestMessage friendRequestMessage2) {
            FriendRequestMessage oldItem = friendRequestMessage;
            FriendRequestMessage newItem = friendRequestMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getMessage(), newItem.getMessage()) && oldItem.getState() == newItem.getState() && oldItem.getTime() == newItem.getTime();
        }

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO0O0(FriendRequestMessage friendRequestMessage, FriendRequestMessage friendRequestMessage2) {
            FriendRequestMessage oldItem = friendRequestMessage;
            FriendRequestMessage newItem = friendRequestMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getTargetUserId() == newItem.getTargetUserId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(@NotNull FragmentActivity activity) {
        super(Integer.valueOf(oO00OO0O.message_item_friend_request), f27621OooOOoo);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27623OooOOo0 = activity;
        this.f27622OooOOo = 2592000000L;
    }

    @Override // p400o0Oo0OO.OooOO0O
    public final void OooO0o(PagingViewHolder holder, FriendRequestMessage friendRequestMessage) {
        FriendRequestMessage item = friendRequestMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
        long targetUserId = item.getTargetUserId();
        View tagView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(tagView, "holder.itemView");
        o00Oo0 block = new o00Oo0(holder, item, this);
        userInfoRepo.getClass();
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_userinfo, Long.valueOf(targetUserId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new m0(targetUserId, tagView, block, null), 2, null);
    }
}
