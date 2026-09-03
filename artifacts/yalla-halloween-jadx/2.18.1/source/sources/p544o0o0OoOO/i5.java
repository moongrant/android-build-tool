package p544o0o0OoOO;

import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.chad.library.adapter.base.OooO00o;
import com.facebook.login.widget.ToolTipPopup;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class i5 extends OooO0OO<MusicTable> {
    public i5(Context context) {
        super(context, R.layout.item_music_name);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        MusicTable musicTable = (MusicTable) obj;
        if (musicTable == null) {
            return;
        }
        oooO0o.OooOO0(R.id.tv_music_name, musicTable.mDisplayName);
        oooO0o.OooOO0(R.id.tv_music_author, musicTable.mArtist);
        View viewOooO0Oo = oooO0o.OooO0Oo(R.id.iv_playing);
        MusicState musicState = MusicState.f21402OooO00o;
        MusicTable value = MusicState.f21403OooO0O0.getValue();
        if (value == null || !value.mTitleKey.equals(musicTable.mTitleKey)) {
            oooO0o.OooO0oO(R.id.iv_playing, false);
            oooO0o.OooOO0O(R.id.tv_music_name, OooOOO.OooO00o(R.color.color_white));
            viewOooO0Oo.clearAnimation();
            return;
        }
        oooO0o.OooOO0o(R.id.iv_playing, true);
        oooO0o.OooOO0O(R.id.tv_music_name, OooOOO.OooO00o(R.color.color_00d8c9));
        if (MusicState.f21404OooO0OO.getValue() == MusicState.State.Playing) {
            RotateAnimation rotateAnimation = new RotateAnimation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setFillAfter(false);
            rotateAnimation.setDuration(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(Integer.MAX_VALUE);
            viewOooO0Oo.startAnimation(rotateAnimation);
        }
    }
}
