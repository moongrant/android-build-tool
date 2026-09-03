package p563o0oOo0;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.OooOo;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p464o0Ooo0oO.o0000O0O;
import p464o0Ooo0oO.o000OO;
import p520o0o0O0O0.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo extends o0000O0O<FriendRequestMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f45056OooOOo = new OooO00o();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final long f45057OooOOo0;

    public static final class OooO00o extends OooOo.OooO<FriendRequestMessage> {
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

    public o000OOo() {
        super(Integer.valueOf(R.layout.message_item_friend_request), f45056OooOOo);
        this.f45057OooOOo0 = 2592000000L;
    }

    @Override // p464o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO holder, FriendRequestMessage friendRequestMessage) {
        FriendRequestMessage item = friendRequestMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        long targetUserId = item.getTargetUserId();
        View tagView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(tagView, "holder.itemView");
        o000000 block = new o000000(holder, item, this);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(R.id.tag_userinfo, Long.valueOf(targetUserId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00OOO00(targetUserId, tagView, block, null), 2, null);
    }
}
