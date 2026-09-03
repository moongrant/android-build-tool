package o0OO0oO;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends ViewOutlineProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Chip f37991OooO00o;

    public OooO00o(Chip chip) {
        this.f37991OooO00o = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        com.google.android.material.chip.OooO00o oooO00o = this.f37991OooO00o.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.getOutline(outline);
        } else {
            outline.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }
}
