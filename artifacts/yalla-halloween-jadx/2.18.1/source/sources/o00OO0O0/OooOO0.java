package o00OO0O0;

import android.widget.ImageView;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends p213o00o0ooo.o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f31383OooO00o;

    public OooOO0(OooOO0O oooOO0O) {
        this.f31383OooO00o = oooOO0O;
    }

    @Override // p213o00o0ooo.o00O0, p213o00o0ooo.o00O0O00
    public final void OooO0Oo(@Nullable SmartSwipeWrapper smartSwipeWrapper, float f) {
        Intrinsics.checkNotNull(smartSwipeWrapper);
        if (smartSwipeWrapper.getWidth() * f > this.f31383OooO00o.f31396OooOOOO) {
            o0O00000.OooO0OO("InRoom_Replymessage_slide");
            LiveEventBus.get("ROOM_CHAT_REPLY").post(this.f31383OooO00o.f31397OooOOOo);
        }
    }

    @Override // p213o00o0ooo.o00O0, p213o00o0ooo.o00O0O00
    public final void OooO0o(@Nullable SmartSwipeWrapper smartSwipeWrapper, float f) {
        ImageView imageView = this.f31383OooO00o.f31395OooOOO0;
        if (imageView == null) {
            return;
        }
        Intrinsics.checkNotNull(smartSwipeWrapper);
        imageView.setAlpha(Math.min(smartSwipeWrapper.getWidth() * f, this.f31383OooO00o.f31396OooOOOO) / this.f31383OooO00o.f31396OooOOOO);
    }
}
