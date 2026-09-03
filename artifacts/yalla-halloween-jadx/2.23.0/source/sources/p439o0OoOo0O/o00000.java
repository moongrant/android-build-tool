package p439o0OoOo0O;

import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import com.code.android.videoplayer.view.VideoView;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import kotlin.jvm.internal.Intrinsics;
import p152o00OoO.OooO;
import p152o00OoO.OooOO0;
import p152o00OoO.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f46096OooO0Oo;

    public o00000(RoomFrameUIController roomFrameUIController) {
        this.f46096OooO0Oo = roomFrameUIController;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String it = str;
        RoomFrameUIController roomFrameUIController = this.f46096OooO0Oo;
        VideoView videoView = roomFrameUIController.f23547OooO0Oo;
        if (videoView != null) {
            o000OO00.OooOOOO(videoView);
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        OooOOO0 oooOOO0 = new OooOOO0(it);
        OooOO0 oooOO1 = roomFrameUIController.f23548OooO0o;
        oooOO1.OooO00o(oooOOO0);
        OooO oooO = oooOO1.f38118OooO00o;
        if (oooO != null) {
            oooO.OooO0O0();
        }
    }
}
