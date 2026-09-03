package p563o0oOo0;

import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.VipLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o00OOO.OooO00o;
import p254o00ooO0O.oOO00O;
import p464o0Ooo0oO.o000OO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 extends Lambda implements Function1<UserInfo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000OO f44978Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessage f44979Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000OOo f44980Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o000OO o000oo2, FriendRequestMessage friendRequestMessage, o000OOo o000ooo2) {
        super(1);
        this.f44978Oooo0o = o000oo2;
        this.f44979Oooo0oO = friendRequestMessage;
        this.f44980Oooo0oo = o000ooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserInfo userInfo) {
        UserInfo userInfo2 = userInfo;
        if (userInfo2 != null) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f44978Oooo0o.OooO00o(R.id.nivHeader).getContext());
            oooO00o.f48429OooO0OO = userInfo2.getUserHeader();
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO00o(OooO00o.OooO0o0());
            oooO00o.OooO0o((ImageView) this.f44978Oooo0o.OooO00o(R.id.nivHeader));
            ((UserPremiumView) this.f44978Oooo0o.OooO00o(R.id.vipView)).OooO0Oo(userInfo2.isPremium(), userInfo2.getPremiumLevel());
            this.f44978Oooo0o.OooO0o0(R.id.tvTitle, userInfo2.getUserName());
            o000OO o000oo2 = this.f44978Oooo0o;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LV.");
            sbOooO0o0.append(userInfo2.getUserLevel());
            sbOooO0o0.append(' ');
            o000oo2.OooO0o0(R.id.tvLevel, sbOooO0o0.toString());
            this.f44978Oooo0o.OooO0o0(R.id.tvContent, this.f44979Oooo0oO.getMessage());
            int state = this.f44979Oooo0oO.getState();
            if (state == -1) {
                this.f44978Oooo0o.OooO0OO(R.id.btStatus, false);
                this.f44978Oooo0o.OooO0OO(R.id.btAgree, false);
                this.f44978Oooo0o.OooO0OO(R.id.btRefuse, false);
                this.f44978Oooo0o.OooO0Oo(R.id.tvContent, R.string.add_you_as_friend);
            } else if (state != 0) {
                if (state == 1) {
                    this.f44978Oooo0o.OooO0OO(R.id.btStatus, false);
                    this.f44978Oooo0o.OooO0OO(R.id.btAgree, true);
                    this.f44978Oooo0o.OooO0OO(R.id.btRefuse, true);
                    this.f44978Oooo0o.OooO0Oo(R.id.btStatus, R.string.agreed);
                } else if (state == 2) {
                    this.f44978Oooo0o.OooO0OO(R.id.btStatus, false);
                    this.f44978Oooo0o.OooO0OO(R.id.btAgree, true);
                    this.f44978Oooo0o.OooO0OO(R.id.btRefuse, true);
                    this.f44978Oooo0o.OooO0Oo(R.id.btStatus, R.string.ignored);
                } else if (state == 3) {
                    this.f44978Oooo0o.OooO0OO(R.id.btStatus, false);
                    this.f44978Oooo0o.OooO0OO(R.id.btAgree, true);
                    this.f44978Oooo0o.OooO0OO(R.id.btRefuse, true);
                    this.f44978Oooo0o.OooO0Oo(R.id.btStatus, R.string.friend_request_expired);
                }
            } else if (System.currentTimeMillis() - this.f44979Oooo0oO.getTime() < this.f44980Oooo0oo.f45057OooOOo0) {
                this.f44978Oooo0o.OooO0OO(R.id.btStatus, true);
                this.f44978Oooo0o.OooO0OO(R.id.btAgree, false);
                this.f44978Oooo0o.OooO0OO(R.id.btRefuse, false);
            } else {
                this.f44978Oooo0o.OooO0OO(R.id.btStatus, false);
                this.f44978Oooo0o.OooO0OO(R.id.btAgree, true);
                this.f44978Oooo0o.OooO0OO(R.id.btRefuse, true);
                this.f44978Oooo0o.OooO0Oo(R.id.btStatus, R.string.friend_request_expired);
            }
            o000OO o000oo3 = this.f44978Oooo0o;
            o000oo3.OooO0OO(R.id.vLine, o000oo3.getBindingAdapterPosition() == this.f44980Oooo0oo.getItemCount() - 1);
            ImageView imageView = (ImageView) this.f44978Oooo0o.OooO00o(R.id.ivKaVip);
            if (userInfo2.getVipLevel() > VipLevel.Vip0.getValue()) {
                oOO00O.OooO(imageView);
                imageView.setImageResource(VipLevel.INSTANCE.OooO00o(userInfo2.getVipLevel()));
            } else {
                oOO00O.OooO00o(imageView);
            }
        }
        return Unit.INSTANCE;
    }
}
