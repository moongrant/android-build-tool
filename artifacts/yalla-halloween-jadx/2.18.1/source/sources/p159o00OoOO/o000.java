package p159o00OoOO;

import android.view.animation.Animation;
import com.app.base.mixedroom.MixedRoomActivity;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes.dex */
public final class o000 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f32398OooO00o;

    public o000(MixedRoomActivity mixedRoomActivity) {
        this.f32398OooO00o = mixedRoomActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f32398OooO00o.f11800o0ooOoO = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f32398OooO00o.f11803ooOO.setVisibility(0);
        this.f32398OooO00o.f11803ooOO.setText(R.string.chatline_new);
    }
}
