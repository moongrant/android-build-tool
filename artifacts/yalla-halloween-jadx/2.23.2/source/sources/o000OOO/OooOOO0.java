package o000OOO;

import android.view.Display;
import android.view.View;
import androidx.media3.common.util.Log;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import p473o0OoooOo.o0OOO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO0 implements OooOOOO.OooO0O0.OooO00o, o0OOO0OO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34551OooO0Oo;

    public /* synthetic */ OooOOO0(Object obj) {
        this.f34551OooO0Oo = obj;
    }

    @Override // p473o0OoooOo.o0OOO0OO
    public final void OooO00o(Object obj) {
        MainRoomPopularFragment.initView$lambda$3$lambda$1((MainRoomPopularFragment) this.f34551OooO0Oo, (RoomIndexModel) obj);
    }

    public final void OooO0O0(Display display) {
        OooOOOO oooOOOO = (OooOOOO) this.f34551OooO0Oo;
        oooOOOO.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            oooOOOO.f34562OooOO0O = refreshRate;
            oooOOOO.f34563OooOO0o = (refreshRate * 80) / 100;
        } else {
            Log.OooO0o("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            oooOOOO.f34562OooOO0O = -9223372036854775807L;
            oooOOOO.f34563OooOO0o = -9223372036854775807L;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicInfoHeadView.OooO00o((TopicInfoHeadView) this.f34551OooO0Oo, i);
    }
}
