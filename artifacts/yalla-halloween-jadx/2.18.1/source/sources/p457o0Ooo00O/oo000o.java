package p457o0Ooo00O;

import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UCropActivity f40407Oooo0o;

    public oo000o(UCropActivity uCropActivity) {
        this.f40407Oooo0o = uCropActivity;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<android.view.ViewGroup>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GestureCropImageView gestureCropImageView = this.f40407Oooo0o.f20307OoooOOo;
        AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) ((ViewGroup) view).getChildAt(0);
        if (view.isSelected()) {
            if (aspectRatioTextView.f20446o000oOoO != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                float f = aspectRatioTextView.f20444OoooOOo;
                float f2 = aspectRatioTextView.f20445OoooOo0;
                aspectRatioTextView.f20444OoooOOo = f2;
                aspectRatioTextView.f20445OoooOo0 = f;
                aspectRatioTextView.f20446o000oOoO = f2 / f;
            }
            aspectRatioTextView.OooO0o();
        }
        gestureCropImageView.setTargetAspectRatio(aspectRatioTextView.f20446o000oOoO);
        this.f40407Oooo0o.f20307OoooOOo.setImageToWrapCropBounds(true);
        if (view.isSelected()) {
            return;
        }
        for (ViewGroup viewGroup : this.f40407Oooo0o.f20315OooooOo) {
            viewGroup.setSelected(viewGroup == view);
        }
    }
}
