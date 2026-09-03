package o000O0O0;

import android.view.View;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000oOoO implements MediaCodecUtil.OooO, BaseQuickAdapter.OooO0O0 {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreCountryRoomListFragment.initView$lambda$2(baseQuickAdapter, view, i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO
    public final int OooO0o0(Object obj) {
        String str = ((androidx.media3.exoplayer.mediacodec.OooO0o) obj).f7754OooO00o;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (o00.f34910OooO00o >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
