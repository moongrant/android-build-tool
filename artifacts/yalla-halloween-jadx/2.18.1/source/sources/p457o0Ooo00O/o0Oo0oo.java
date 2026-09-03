package p457o0Ooo00O;

import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements HorizontalProgressWheelView.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UCropActivity f40405OooO00o;

    public o0Oo0oo(UCropActivity uCropActivity) {
        this.f40405OooO00o = uCropActivity;
    }

    @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.OooO00o
    public final void OooO00o() {
        this.f40405OooO00o.f20307OoooOOo.setImageToWrapCropBounds(true);
    }

    @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.OooO00o
    public final void OooO0O0(float f) {
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            GestureCropImageView gestureCropImageView = this.f40405OooO00o.f20307OoooOOo;
            gestureCropImageView.OooOOO((((this.f40405OooO00o.f20307OoooOOo.getMaxScale() - this.f40405OooO00o.f20307OoooOOo.getMinScale()) / 15000.0f) * f) + gestureCropImageView.getCurrentScale(), gestureCropImageView.f20352OooooOo.centerX(), gestureCropImageView.f20352OooooOo.centerY());
            return;
        }
        GestureCropImageView gestureCropImageView2 = this.f40405OooO00o.f20307OoooOOo;
        float maxScale = (((this.f40405OooO00o.f20307OoooOOo.getMaxScale() - this.f40405OooO00o.f20307OoooOOo.getMinScale()) / 15000.0f) * f) + gestureCropImageView2.getCurrentScale();
        float fCenterX = gestureCropImageView2.f20352OooooOo.centerX();
        float fCenterY = gestureCropImageView2.f20352OooooOo.centerY();
        if (maxScale >= gestureCropImageView2.getMinScale()) {
            gestureCropImageView2.OooO0oo(maxScale / gestureCropImageView2.getCurrentScale(), fCenterX, fCenterY);
        }
    }

    @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.OooO00o
    public final void OooO0OO() {
        this.f40405OooO00o.f20307OoooOOo.OooOO0O();
    }
}
