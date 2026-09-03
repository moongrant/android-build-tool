package p495o0o00Ooo;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f48852OooO0Oo;

    public o0O0o000(RoomScreenShotManager roomScreenShotManager) {
        this.f48852OooO0Oo = roomScreenShotManager;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r0 = true;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFling(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (Math.abs(f) > Math.abs(f2)) {
            boolean z = OooO.OooO0o0() ? false : false;
            if (z) {
                RoomScreenShotManager roomScreenShotManager = this.f48852OooO0Oo;
                roomScreenShotManager.f26813OooO0O0.getHandler().removeCallbacks(roomScreenShotManager.f26817OooO0o0);
                roomScreenShotManager.OooO0OO();
            }
        }
        return super.onFling(motionEvent, e2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f48852OooO0Oo.f26813OooO0O0.performClick();
        return super.onSingleTapConfirmed(e);
    }
}
