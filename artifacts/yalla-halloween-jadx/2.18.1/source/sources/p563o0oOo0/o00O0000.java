package p563o0oOo0;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.view.SexView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import o00OOO.OooO00o;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p464o0Ooo0oO.o0000O0O;
import p464o0Ooo0oO.o000OO;
import p522o0o0O0o.oo0o0O0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000 extends o0000O0O<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Long> f45070OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f45071OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public String f45072OooOOoo;

    public o00O0000() {
        super(Integer.valueOf(R.layout.message_item_share_to_friends), o0O0ooO.f45097OooO00o);
        this.f45070OooOOo = new LinkedHashSet<>();
        this.f45072OooOOoo = "";
    }

    public static void OooO(o00O0000 o00o0001, int i, long j, Function1 action, int i2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            action = o00.f44958Oooo0o;
        }
        Objects.requireNonNull(o00o0001);
        Intrinsics.checkNotNullParameter(action, "action");
        if (i <= -1) {
            int itemCount = o00o0001.getItemCount();
            for (int i3 = 0; i3 < itemCount; i3++) {
                if (o00o0001.getData(i3).getFriend().getFriendId() == j) {
                    i = i3;
                }
            }
        }
        if (i == -1) {
            return;
        }
        long friendId = o00o0001.getData(i).getFriend().getFriendId();
        if (o00o0001.f45070OooOOo.contains(Long.valueOf(friendId))) {
            o00o0001.f45070OooOOo.remove(Long.valueOf(friendId));
        } else if (o00o0001.f45070OooOOo.size() > 6) {
            action.invoke(Boolean.FALSE);
        } else {
            o00o0001.f45070OooOOo.add(Long.valueOf(friendId));
            action.invoke(Boolean.TRUE);
        }
        o00o0001.notifyItemChanged(i);
    }

    @Override // p464o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO holder, FriendInfo friendInfo) {
        FriendInfo item = friendInfo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfo userInfo = item.getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        ImageView imageView = (ImageView) holder.OooO00o(R.id.ivSelect);
        if (this.f45071OooOOo0) {
            imageView.setSelected(this.f45070OooOOo.contains(Long.valueOf(item.getFriend().getFriendId())));
            oOO00O.OooO(imageView);
        } else {
            oOO00O.OooO00o(imageView);
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(holder.itemView.getContext());
        oooO00o.OooO00o(OooO00o.OooO0o0());
        oooO00o.f48429OooO0OO = userInfo.getUserHeader();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o((ImageView) holder.OooO00o(R.id.friendHead));
        TextView textView = (TextView) holder.OooO00o(R.id.tvFriendName);
        String memoName = item.getFriend().getMemoName();
        String memoName2 = null;
        if (memoName == null || StringsKt.isBlank(memoName)) {
            UserInfo userInfo2 = item.getUserInfo();
            if (userInfo2 != null) {
                memoName2 = userInfo2.getUserName();
            }
        } else {
            memoName2 = item.getFriend().getMemoName();
        }
        textView.setText(memoName2);
        TextView textView2 = (TextView) holder.OooO00o(R.id.tvBio);
        if (!StringsKt.isBlank(this.f45072OooOOoo)) {
            oo0o0O0.OooO0o0(textView, new String[]{this.f45072OooOOoo}, o000O0O0.OooO00o(R.color.color_00d8c9));
            String memoName3 = item.getFriend().getMemoName();
            if (!(memoName3 == null || StringsKt.isBlank(memoName3)) && StringsKt__StringsKt.contains(userInfo.getUserName(), this.f45072OooOOoo, true)) {
                textView2.setText(o000O0O0.OooO0OO(R.string.User_Edit_Remark_name) + ' ' + userInfo.getUserName());
                oOO00O.OooO(textView2);
            } else if (StringsKt__StringsKt.contains$default(userInfo.getUserIdx(), this.f45072OooOOoo, false, 2, (Object) null)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ID:");
                sbOooO0o0.append(userInfo.getUserIdx());
                textView2.setText(sbOooO0o0.toString());
                oOO00O.OooO(textView2);
            } else {
                oOO00O.OooO00o(textView2);
            }
            oo0o0O0.OooO0o0(textView2, new String[]{this.f45072OooOOoo}, o000O0O0.OooO00o(R.color.color_00d8c9));
        } else {
            oOO00O.OooO(textView2);
            String bio = userInfo.getBio();
            textView2.setText(bio == null || StringsKt.isBlank(bio) ? "" : userInfo.getBio());
        }
        ((SexView) holder.OooO00o(R.id.sex)).setSex(userInfo.getSex());
        ((UserPremiumView) holder.OooO00o(R.id.vip)).OooO0Oo(userInfo.isPremium(), userInfo.getPremiumLevel());
    }

    public final void OooO0oo(boolean z) {
        this.f45071OooOOo0 = z;
        this.f45070OooOOo.clear();
        notifyDataSetChanged();
    }
}
