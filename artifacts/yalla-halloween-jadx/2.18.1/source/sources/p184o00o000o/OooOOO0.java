package p184o00o000o;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.app.base.model.GiftAnimationModel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import o00Oo00.OooO0OO;
import p515o0o0O00.o00O00;
import p557o0oOOoOo.oO00O0o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOo f33006OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO00O0o0 f33007OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0OO<Boolean> f33010OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ExecutorService f33011OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f33008OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<GiftAnimationModel> f33009OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO00o f33012OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f33013OooO0oo = false;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 100) {
                if (i != 101) {
                    return;
                }
                OooOo oooOo = OooOOO0.this.f33006OooO00o;
                oO00O0o0 oo00o0o0 = oooOo.f33022OoooOOo;
                if (oo00o0o0 != null) {
                    oooOo.f33018OoooO0.startAnimation(oo00o0o0.f44673OooO0OO);
                }
                OooOOO0.this.f33008OooO0OO = false;
                return;
            }
            OooOo oooOo2 = OooOOO0.this.f33006OooO00o;
            int iIntValue = ((Integer) message.obj).intValue();
            Objects.requireNonNull(oooOo2);
            oooOo2.OooO0o(iIntValue + "");
        }
    }

    public OooOOO0(Activity activity, OooOo oooOo, OooO0OO<Boolean> oooO0OO) {
        this.f33006OooO00o = oooOo;
        this.f33010OooO0o = oooO0OO;
        oO00O0o0 oo00o0o0 = new oO00O0o0(activity);
        this.f33007OooO0O0 = oo00o0o0;
        OooOO0 oooOO1 = new OooOO0(this);
        Animation animation = oo00o0o0.f44672OooO0O0;
        if (animation != null) {
            animation.setAnimationListener(oooOO1);
        }
        oO00O0o0 oo00o0o1 = this.f33007OooO0O0;
        OooOO0O oooOO0O = new OooOO0O(this);
        Animation animation2 = oo00o0o1.f44673OooO0OO;
        if (animation2 != null) {
            animation2.setAnimationListener(oooOO0O);
        }
        this.f33006OooO00o.f33022OoooOOo = this.f33007OooO0O0;
    }

    public final void OooO00o(GiftAnimationModel giftAnimationModel) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("addGiftAnimation giftAnimationModel = ");
        sbOooO0o0.append(giftAnimationModel.toJSONString());
        o00O00.OooO0O0(sbOooO0o0.toString());
        OooO0OO().add(giftAnimationModel);
        if (OooO0OO().size() != 1 || this.f33008OooO0OO) {
            return;
        }
        OooO0Oo(OooO0OO().get(0));
    }

    public final void OooO0O0() {
        if (OooO0OO() != null) {
            OooO0OO().clear();
        }
        this.f33013OooO0oo = false;
        this.f33008OooO0OO = false;
        OooOo oooOo = this.f33006OooO00o;
        if (oooOo != null) {
            if (oooOo.f33022OoooOOo != null) {
                oooOo.f33018OoooO0.clearAnimation();
            }
            LinearLayout linearLayout = oooOo.f33021OoooOOO;
            if (linearLayout != null) {
                linearLayout.clearAnimation();
            }
            this.f33006OooO00o.OooO0Oo(8);
        }
    }

    public final ArrayList<GiftAnimationModel> OooO0OO() {
        if (this.f33009OooO0Oo == null) {
            this.f33009OooO0Oo = new ArrayList<>();
        }
        return this.f33009OooO0Oo;
    }

    public final void OooO0Oo(GiftAnimationModel giftAnimationModel) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("startGiftAnimation giftAnimationModel = ");
        sbOooO0o0.append(giftAnimationModel.toJSONString());
        o00O00.OooO0O0(sbOooO0o0.toString());
        try {
            this.f33008OooO0OO = true;
            OooO0OO<Boolean> oooO0OO = this.f33010OooO0o;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(Boolean.TRUE);
            }
            this.f33006OooO00o.OooO0o0(giftAnimationModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
