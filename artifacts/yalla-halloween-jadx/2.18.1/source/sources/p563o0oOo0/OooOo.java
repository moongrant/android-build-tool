package p563o0oOo0;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.view.SexView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p464o0Ooo0oO.o0000O0O;
import p464o0Ooo0oO.o000OO;
import p522o0o0O0o.oo0o0O0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class OooOo extends o0000O0O<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f44955OooOOo0;

    public static final class OooO00o extends androidx.recyclerview.widget.OooOo.OooO<FriendInfo> {
        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            UserInfo userInfo = oldItem.getUserInfo();
            return (userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo())) && Intrinsics.areEqual(oldItem.getFriend().getMemoName(), newItem.getFriend().getMemoName());
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

    public OooOo() {
        super(Integer.valueOf(R.layout.moment_item_at_friends), new OooO00o());
        this.f44955OooOOo0 = "";
    }

    @Override // p464o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO helper, FriendInfo friendInfo) {
        FriendInfo model = friendInfo;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        UserInfo userInfo = model.getUserInfo();
        if (userInfo != null) {
            String memoName = model.getFriend().getMemoName();
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(helper.itemView.getContext());
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48429OooO0OO = userInfo.getUserHeader();
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o((ImageView) helper.OooO00o(R.id.friendHead));
            TextView textView = (TextView) helper.OooO00o(R.id.tvFriendName);
            if (memoName == null || StringsKt.isBlank(memoName)) {
                memoName = userInfo.getUserName();
            }
            textView.setText(memoName);
            oo0o0O0.OooO0Oo(textView, OooOOO.OooO00o(R.color.color_87000000));
            if (!StringsKt.isBlank(this.f44955OooOOo0)) {
                oo0o0O0.OooO0o0(textView, new String[]{this.f44955OooOOo0}, OooOOO.OooO00o(R.color.color_00d8c9));
            }
            TextView textView2 = (TextView) helper.OooO00o(R.id.tvBio);
            String bio = userInfo.getBio();
            textView2.setText(bio == null || StringsKt.isBlank(bio) ? "" : userInfo.getBio());
            oo0o0O0.OooO0Oo(textView2, OooOOO.OooO00o(R.color.color_38000000));
            if (!StringsKt.isBlank(this.f44955OooOOo0)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ID:");
                sbOooO0o0.append(userInfo.getUserIdx());
                textView2.setText(sbOooO0o0.toString());
                oo0o0O0.OooO0o0(textView2, new String[]{this.f44955OooOOo0}, OooOOO.OooO00o(R.color.color_00d8c9));
            }
            ((SexView) helper.OooO00o(R.id.sex)).setSex(userInfo.getSex());
            ((UserPremiumView) helper.OooO00o(R.id.vip)).OooO0Oo(userInfo.isPremium(), userInfo.getPremiumLevel());
        }
    }
}
