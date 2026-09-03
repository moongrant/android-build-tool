package p590o0oOooOO;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.SkillCardModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import p168o00Ooo0.oo000o;
import p206o00o0o0o.o000OO0O;
import p522o0o0O0o.o000O0Oo;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o3 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MixedRoomActivity f47182OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View f47183OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View f47184OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public NetImageView f47185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public NetImageView f47186OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public NetImageView f47187OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ImageView f47188OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f47189OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f47190OooOO0 = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList<SkillCardModel> f47181OooO = new ArrayList<>();

    public class OooO00o implements Animator.AnimatorListener {
        public OooO00o() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            o3.this.f47184OooO0OO.setVisibility(8);
            o3.this.f47190OooOO0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ArrayList<SkillCardModel> arrayList;
            o3.this.f47184OooO0OO.setVisibility(8);
            o3 o3Var = o3.this;
            if (!o3Var.f47189OooO0oo || (arrayList = o3Var.f47181OooO) == null || arrayList.size() <= 0) {
                o3.this.f47190OooOO0 = false;
            } else {
                o3.this.OooO0O0(o3.this.f47181OooO.get(0));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public o3(MixedRoomActivity mixedRoomActivity) {
        this.f47182OooO00o = mixedRoomActivity;
        this.f47183OooO0O0 = mixedRoomActivity.findViewById(R.id.ly_anmi_panda);
        this.f47184OooO0OO = this.f47183OooO0O0.findViewById(R.id.ly_anmi_panda);
        this.f47188OooO0oO = (ImageView) this.f47183OooO0O0.findViewById(R.id.iv_skill_bg);
        this.f47185OooO0Oo = (NetImageView) this.f47183OooO0O0.findViewById(R.id.senduserhead_panda);
        this.f47187OooO0o0 = (NetImageView) this.f47183OooO0O0.findViewById(R.id.targetuserhead_panda);
        this.f47186OooO0o = (NetImageView) this.f47183OooO0O0.findViewById(R.id.iv_anmi_panda);
    }

    public final void OooO00o(SkillCardModel skillCardModel) {
        if (this.f47190OooOO0) {
            this.f47181OooO.add(skillCardModel);
        } else {
            this.f47190OooOO0 = true;
            OooO0O0(skillCardModel);
        }
    }

    public final void OooO0O0(SkillCardModel skillCardModel) {
        if (this.f47181OooO.size() > 0) {
            this.f47181OooO.remove(0);
        }
        this.f47190OooOO0 = true;
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f47182OooO00o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        float f = 37;
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(skillCardModel.from.getUserHeader(), OooOo00.OooO00o(f), true);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f47185OooO0Oo);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f47182OooO00o);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(skillCardModel.target.getUserHeader(), OooOo00.OooO00o(f), true);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(this.f47187OooO0o0);
        this.f47184OooO0OO.setVisibility(0);
        int i = skillCardModel.cardType;
        int i2 = R.drawable.send_skill_hats;
        if (i != 1) {
            if (i == 2) {
                i2 = R.drawable.send_skill_speak;
            } else if (i == 3) {
                i2 = R.drawable.send_skill_voice_change;
            }
        }
        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this.f47182OooO00o);
        oooO00o3.f48433OooO0oO = i2;
        oooO00o3.f48427OooO00o = 1;
        oooO00o3.f48432OooO0o0 = true;
        oooO00o3.OooO0o(this.f47186OooO0o);
        int i3 = skillCardModel.cardType;
        int i4 = R.drawable.bg_roomchat_skill_panda;
        if (i3 != 1 && i3 == 2) {
            i4 = R.drawable.bg_roomchat_skill_speaking;
        }
        this.f47188OooO0oO.setImageResource(i4);
        if (oo000o.OooO0o0()) {
            this.f47186OooO0o.setScaleX(-1.0f);
        }
        this.f47184OooO0OO.setX(oo000o.OooO0o0() ? -OooOo00.OooO00o(100.0f) : o000O0Oo.f42985OooO00o);
        int iOooO00o = OooOo00.OooO00o(100.0f) + o000OO0O.OooO0oo();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f47184OooO0OO.animate();
        if (!oo000o.OooO0o0()) {
            iOooO00o = -iOooO00o;
        }
        viewPropertyAnimatorAnimate.translationX(iOooO00o).setDuration(5000L).setInterpolator(new LinearInterpolator()).setListener(new OooO00o()).start();
    }
}
