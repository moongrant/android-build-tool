package p499o0o00o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f50019OooO0Oo;

    public oO0000O(RoomScreenShotManager roomScreenShotManager) {
        this.f50019OooO0Oo = roomScreenShotManager;
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
            boolean z = OooOo00.OooO0o0() ? false : false;
            if (z) {
                RoomScreenShotManager roomScreenShotManager = this.f50019OooO0Oo;
                roomScreenShotManager.f26359OooO0O0.getHandler().removeCallbacks(roomScreenShotManager.f26363OooO0o0);
                roomScreenShotManager.OooO0OO();
            }
        }
        return super.onFling(motionEvent, e2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f50019OooO0Oo.f26359OooO0O0.performClick();
        return super.onSingleTapConfirmed(e);
    }
}
