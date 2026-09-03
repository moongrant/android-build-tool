package p457o0Ooo00O;

import android.view.View;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UCropActivity f40406Oooo0o;

    public o0ooOOo(UCropActivity uCropActivity) {
        this.f40406Oooo0o = uCropActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UCropActivity uCropActivity = this.f40406Oooo0o;
        GestureCropImageView gestureCropImageView = uCropActivity.f20307OoooOOo;
        gestureCropImageView.OooOOO0(-gestureCropImageView.getCurrentAngle());
        uCropActivity.f20307OoooOOo.setImageToWrapCropBounds(true);
    }
}
