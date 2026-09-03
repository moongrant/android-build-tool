package p558o0oOOoo;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f44743OooO00o;

    public o0O000(RoomScreenShotManager roomScreenShotManager) {
        this.f44743OooO00o = roomScreenShotManager;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) > Math.abs(f2)) {
            boolean z = true;
            if (!oo000o.OooO0o0() ? f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                z = false;
            }
            if (z) {
                this.f44743OooO00o.f23135OooO0O0.getHandler().removeCallbacks(this.f44743OooO00o.f23139OooO0o0);
                this.f44743OooO00o.OooO0Oo();
            }
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f44743OooO00o.f23135OooO0O0.performClick();
        return super.onSingleTapConfirmed(e);
    }
}
