package p501o0o00o00;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.SkillCardModel;
import java.util.ArrayList;
import p368o0OOo0Oo.Oooo000;
import p403o0Oo0OO.OooO0OO;
import p423o0OoO0OO.o000O000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList<SkillCardModel> f50158OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MixedRoomActivity f50159OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f50160OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View f50161OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public NetImageView f50162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public NetImageView f50163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public NetImageView f50164OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ImageView f50165OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f50166OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f50167OooOO0 = false;

    public class OooO00o implements Animator.AnimatorListener {
        public OooO00o() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.f50161OooO0OO.setVisibility(8);
            oooOO0O.f50167OooOO0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ArrayList<SkillCardModel> arrayList;
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.f50161OooO0OO.setVisibility(8);
            if (!oooOO0O.f50166OooO0oo || (arrayList = oooOO0O.f50158OooO) == null || arrayList.size() <= 0) {
                oooOO0O.f50167OooOO0 = false;
            } else {
                oooOO0O.OooO0O0(oooOO0O.f50158OooO.get(0));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public OooOO0O(int i, MixedRoomActivity mixedRoomActivity) {
        this.f50159OooO00o = mixedRoomActivity;
        View viewFindViewById = mixedRoomActivity.findViewById(i);
        this.f50160OooO0O0 = viewFindViewById;
        this.f50158OooO = new ArrayList<>();
        this.f50161OooO0OO = viewFindViewById.findViewById(o0OO00O.ly_anmi_panda);
        this.f50165OooO0oO = (ImageView) viewFindViewById.findViewById(o0OO00O.iv_skill_bg);
        this.f50162OooO0Oo = (NetImageView) viewFindViewById.findViewById(o0OO00O.senduserhead_panda);
        this.f50164OooO0o0 = (NetImageView) viewFindViewById.findViewById(o0OO00O.targetuserhead_panda);
        this.f50163OooO0o = (NetImageView) viewFindViewById.findViewById(o0OO00O.iv_anmi_panda);
    }

    public final void OooO00o(SkillCardModel skillCardModel) {
        if (this.f50167OooOO0) {
            this.f50158OooO.add(skillCardModel);
        } else {
            this.f50167OooOO0 = true;
            OooO0O0(skillCardModel);
        }
    }

    public final void OooO0O0(SkillCardModel skillCardModel) {
        int i;
        int i2;
        if (this.f50158OooO.size() > 0) {
            this.f50158OooO.remove(0);
        }
        this.f50167OooOO0 = true;
        MixedRoomActivity mixedRoomActivity = this.f50159OooO00o;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(mixedRoomActivity);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = OooO0OO.OooO00o(skillCardModel.getNewFrom().getUserHeader().getValue());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(this.f50162OooO0Oo);
        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(mixedRoomActivity);
        oooO00o2.OooO00o(d1.OooO0OO());
        oooO00o2.f43126OooO0OO = OooO0OO.OooO00o(skillCardModel.getNewTarget().getUserHeader().getValue());
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.OooO0Oo(this.f50164OooO0o0);
        this.f50161OooO0OO.setVisibility(0);
        int cardType = skillCardModel.getCardType();
        if (cardType == 1) {
            i = o0Oo0oo.send_skill_hats;
        } else if (cardType != 2) {
            i = cardType != 3 ? o0Oo0oo.send_skill_hats : o0Oo0oo.send_skill_voice_change;
        } else {
            i = o0Oo0oo.send_skill_speak;
        }
        Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(mixedRoomActivity);
        oooO00o3.f43130OooO0oO = i;
        oooO00o3.f43124OooO00o = 1;
        oooO00o3.f43129OooO0o0 = true;
        oooO00o3.OooO0Oo(this.f50163OooO0o);
        int cardType2 = skillCardModel.getCardType();
        if (cardType2 == 1) {
            i2 = o0Oo0oo.bg_roomchat_skill_panda;
        } else if (cardType2 != 2) {
            i2 = cardType2 != 3 ? o0Oo0oo.bg_roomchat_skill_panda : o0Oo0oo.bg_roomchat_skill_panda;
        } else {
            i2 = o0Oo0oo.bg_roomchat_skill_speaking;
        }
        this.f50165OooO0oO.setImageResource(i2);
        if (OooOo00.OooO0o0()) {
            this.f50163OooO0o.setScaleX(-1.0f);
        }
        this.f50161OooO0OO.setX(OooOo00.OooO0o0() ? -o0000O0.OooO00o(100.0f) : o000O000.f46650OooO00o);
        int iOooO00o = o0000O0.OooO00o(100.0f) + o0000O00.OooO0OO();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f50161OooO0OO.animate();
        if (!OooOo00.OooO0o0()) {
            iOooO00o = -iOooO00o;
        }
        viewPropertyAnimatorAnimate.translationX(iOooO00o).setDuration(5000L).setInterpolator(new LinearInterpolator()).setListener(new OooO00o()).start();
    }
}
