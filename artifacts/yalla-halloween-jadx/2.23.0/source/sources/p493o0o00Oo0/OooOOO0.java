package p493o0o00Oo0;

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
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p417o0OoO0.o0ooOOo;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList<SkillCardModel> f48740OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MixedRoomActivity f48741OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f48742OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View f48743OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public NetImageView f48744OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public NetImageView f48745OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public NetImageView f48746OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ImageView f48747OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f48748OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f48749OooOO0 = false;

    public class OooO00o implements Animator.AnimatorListener {
        public OooO00o() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            OooOOO0 oooOOO0 = OooOOO0.this;
            oooOOO0.f48743OooO0OO.setVisibility(8);
            oooOOO0.f48749OooOO0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ArrayList<SkillCardModel> arrayList;
            OooOOO0 oooOOO0 = OooOOO0.this;
            oooOOO0.f48743OooO0OO.setVisibility(8);
            if (!oooOOO0.f48748OooO0oo || (arrayList = oooOOO0.f48740OooO) == null || arrayList.size() <= 0) {
                oooOOO0.f48749OooOO0 = false;
            } else {
                oooOOO0.OooO0O0(oooOOO0.f48740OooO.get(0));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public OooOOO0(int i, MixedRoomActivity mixedRoomActivity) {
        this.f48741OooO00o = mixedRoomActivity;
        View viewFindViewById = mixedRoomActivity.findViewById(i);
        this.f48742OooO0O0 = viewFindViewById;
        this.f48740OooO = new ArrayList<>();
        this.f48743OooO0OO = viewFindViewById.findViewById(oO00O0oO.ly_anmi_panda);
        this.f48747OooO0oO = (ImageView) viewFindViewById.findViewById(oO00O0oO.iv_skill_bg);
        this.f48744OooO0Oo = (NetImageView) viewFindViewById.findViewById(oO00O0oO.senduserhead_panda);
        this.f48746OooO0o0 = (NetImageView) viewFindViewById.findViewById(oO00O0oO.targetuserhead_panda);
        this.f48745OooO0o = (NetImageView) viewFindViewById.findViewById(oO00O0oO.iv_anmi_panda);
    }

    public final void OooO00o(SkillCardModel skillCardModel) {
        if (this.f48749OooOO0) {
            this.f48740OooO.add(skillCardModel);
        } else {
            this.f48749OooOO0 = true;
            OooO0O0(skillCardModel);
        }
    }

    public final void OooO0O0(SkillCardModel skillCardModel) {
        int i;
        int i2;
        if (this.f48740OooO.size() > 0) {
            this.f48740OooO.remove(0);
        }
        this.f48749OooOO0 = true;
        MixedRoomActivity mixedRoomActivity = this.f48741OooO00o;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(mixedRoomActivity);
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.f43911OooO0OO = OooOOO.OooO00o(skillCardModel.getNewFrom().getUserHeader().getValue());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(this.f48744OooO0Oo);
        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(mixedRoomActivity);
        oooO00o2.OooO00o(OooO.OooO0OO());
        oooO00o2.f43911OooO0OO = OooOOO.OooO00o(skillCardModel.getNewTarget().getUserHeader().getValue());
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.OooO0Oo(this.f48746OooO0o0);
        this.f48743OooO0OO.setVisibility(0);
        int cardType = skillCardModel.getCardType();
        if (cardType == 1) {
            i = oOo00OO0.send_skill_hats;
        } else if (cardType != 2) {
            i = cardType != 3 ? oOo00OO0.send_skill_hats : oOo00OO0.send_skill_voice_change;
        } else {
            i = oOo00OO0.send_skill_speak;
        }
        OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(mixedRoomActivity);
        oooO00o3.f43915OooO0oO = i;
        oooO00o3.f43909OooO00o = 1;
        oooO00o3.f43914OooO0o0 = true;
        oooO00o3.OooO0Oo(this.f48745OooO0o);
        int cardType2 = skillCardModel.getCardType();
        if (cardType2 == 1) {
            i2 = oOo00OO0.bg_roomchat_skill_panda;
        } else if (cardType2 != 2) {
            i2 = cardType2 != 3 ? oOo00OO0.bg_roomchat_skill_panda : oOo00OO0.bg_roomchat_skill_panda;
        } else {
            i2 = oOo00OO0.bg_roomchat_skill_speaking;
        }
        this.f48747OooO0oO.setImageResource(i2);
        if (p591o0oo000O.OooO.OooO0o0()) {
            this.f48745OooO0o.setScaleX(-1.0f);
        }
        this.f48743OooO0OO.setX(p591o0oo000O.OooO.OooO0o0() ? -o0000O0.OooO00o(100.0f) : o0ooOOo.f45529OooO00o);
        int iOooO00o = o0000O0.OooO00o(100.0f) + o0000O00.OooO0O0();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f48743OooO0OO.animate();
        if (!p591o0oo000O.OooO.OooO0o0()) {
            iOooO00o = -iOooO00o;
        }
        viewPropertyAnimatorAnimate.translationX(iOooO00o).setDuration(5000L).setInterpolator(new LinearInterpolator()).setListener(new OooO00o()).start();
    }
}
