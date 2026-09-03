package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.login.widget.ToolTipPopup;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends p571o0oOoO0.o0000oo<MusicTable> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        MusicTable musicTable = (MusicTable) obj;
        if (musicTable == null) {
            return;
        }
        int i = p562o0oOo000.o0OO00O.tv_music_name;
        viewHolder.setText(i, musicTable.mDisplayName);
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_music_author, musicTable.mArtist);
        int i2 = p562o0oOo000.o0OO00O.iv_playing;
        View view = viewHolder.getView(i2);
        MusicTable value = MusicState.f22362OooO00o.getValue();
        if (value == null || !value.mTitleKey.equals(musicTable.mTitleKey)) {
            viewHolder.setGone(i2, false);
            viewHolder.setTextColor(i, com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white));
            view.clearAnimation();
            return;
        }
        viewHolder.setVisible(i2, true);
        viewHolder.setTextColor(i, com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9));
        if (MusicState.f22363OooO0O0.getValue() == MusicState.State.Playing) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setFillAfter(false);
            rotateAnimation.setDuration(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(Integer.MAX_VALUE);
            view.startAnimation(rotateAnimation);
        }
    }
}
