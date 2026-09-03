package p184o00o000o;

import android.view.animation.Animation;
import com.app.base.model.GiftAnimationModel;
import java.util.concurrent.ExecutorService;
import o00Oo00.OooO0OO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f33002OooO00o;

    public OooOO0(OooOOO0 oooOOO0) {
        this.f33002OooO00o = oooOOO0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f33002OooO00o.OooO0OO().size() > 0) {
            OooOOO0 oooOOO0 = this.f33002OooO00o;
            GiftAnimationModel giftAnimationModel = oooOOO0.OooO0OO().get(0);
            o00O00.OooO0O0("addGiftAnimationNum giftAnimationModel = " + giftAnimationModel);
            ExecutorService executorService = oooOOO0.f33011OooO0o0;
            if (executorService == null || giftAnimationModel == null) {
                return;
            }
            oooOOO0.f33013OooO0oo = true;
            executorService.execute(new OooOOO(oooOOO0, giftAnimationModel));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        OooO0OO<Boolean> oooO0OO = this.f33002OooO00o.f33010OooO0o;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(Boolean.TRUE);
        }
        this.f33002OooO00o.f33006OooO00o.OooO0o("1");
    }
}
