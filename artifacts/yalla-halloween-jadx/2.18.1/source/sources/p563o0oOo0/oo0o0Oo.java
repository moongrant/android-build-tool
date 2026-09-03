package p563o0oOo0;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.app.base.view.SexView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.Oooo0;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.VipLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import o00OOO.OooO00o;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p464o0Ooo0oO.o0000O0O;
import p464o0Ooo0oO.o000OO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0Oo extends o0000O0O<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f45115OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Context f45116OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public String f45117OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner) {
        super(Integer.valueOf(R.layout.message_item_friend), o0O0O00.f45094OooO00o);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f45116OooOOo0 = context;
        this.f45115OooOOo = lifecycleOwner;
        this.f45117OooOOoo = "";
    }

    @Override // p464o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO holder, FriendInfo friendInfo) {
        FriendInfo item = friendInfo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfo userInfo = item.getUserInfo();
        if (userInfo == null) {
            return;
        }
        String memoName = item.getFriend().getMemoName();
        holder.OooO0o0(R.id.tv_name, !(memoName == null || StringsKt.isBlank(memoName)) ? item.getFriend().getMemoName() : userInfo.getUserName());
        holder.OooO00o(R.id.tv_bio);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f45116OooOOo0);
        oooO00o.OooO00o(OooO00o.OooO00o());
        oooO00o.f48429OooO0OO = userInfo.getUserHeader();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o((ImageView) holder.OooO00o(R.id.niv_header));
        SVGAView sVGAView = (SVGAView) holder.OooO00o(R.id.svgaView);
        String userHeaderFrame = userInfo.getUserHeaderFrame();
        if (userHeaderFrame == null || StringsKt.isBlank(userHeaderFrame)) {
            oOO00O.OooO00o(sVGAView);
        } else {
            oOO00O.OooO(sVGAView);
            sVGAView.OooO0oo(String.valueOf(userInfo.getUserHeaderFrame()), this.f45115OooOOo);
            sVGAView.OooO();
        }
        TextView textView = (TextView) holder.OooO00o(R.id.tv_name);
        TextView textView2 = (TextView) holder.OooO00o(R.id.tv_bio);
        String str = this.f45117OooOOoo;
        String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string == null || StringsKt.isBlank(string)) {
            oOO00O.OooO(textView2);
            String bio = userInfo.getBio();
            textView2.setText(!(bio == null || StringsKt.isBlank(bio)) ? userInfo.getBio() : o000O0O0.OooO0OO(R.string.Userinfo_Sign_Hint));
        } else {
            Oooo0.OooO0O0(textView, o000O0O0.OooO00o(R.color.color_00d8c9), string);
            String memoName2 = item.getFriend().getMemoName();
            if (!(memoName2 == null || StringsKt.isBlank(memoName2)) && StringsKt__StringsKt.contains$default(userInfo.getUserName(), string, false, 2, (Object) null)) {
                textView2.setText(o000O0O0.OooO0OO(R.string.User_Edit_Remark_name) + ' ' + userInfo.getUserName());
                oOO00O.OooO(textView2);
            } else if (StringsKt__StringsKt.contains$default(userInfo.getUserIdx(), string, false, 2, (Object) null)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ID:");
                sbOooO0o0.append(userInfo.getUserIdx());
                textView2.setText(sbOooO0o0.toString());
                oOO00O.OooO(textView2);
            } else {
                oOO00O.OooO00o(textView2);
            }
            Oooo0.OooO0O0(textView2, o000O0O0.OooO00o(R.color.color_00d8c9), string);
        }
        ((UserPremiumView) holder.OooO00o(R.id.vipView)).OooO0Oo(userInfo.isPremium(), userInfo.getPremiumLevel());
        ((SexView) holder.OooO00o(R.id.sexView)).setSex(userInfo.getSex());
        holder.OooO0OO(R.id.iv_room, !item.getFriend().getInRoom());
        holder.OooO0OO(R.id.iv_official, !userInfo.isOfficialRole());
        ImageView imageView = (ImageView) holder.OooO00o(R.id.ivKaVip);
        UserInfo userInfo2 = item.getUserInfo();
        if ((userInfo2 != null ? userInfo2.getVipLevel() : 0) <= VipLevel.Vip0.getValue()) {
            oOO00O.OooO00o(imageView);
            return;
        }
        oOO00O.OooO(imageView);
        VipLevel.Companion companion = VipLevel.INSTANCE;
        UserInfo userInfo3 = item.getUserInfo();
        imageView.setImageResource(companion.OooO00o(userInfo3 != null ? userInfo3.getVipLevel() : 0));
    }
}
