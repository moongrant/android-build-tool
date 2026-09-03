package p509o0o00ooO;

import android.widget.ImageView;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0O.o00000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ p1 f50747OooO00o;

    public o1(p1 p1Var) {
        this.f50747OooO00o = p1Var;
    }

    @Override // p148o00Oo0O.o00000O, p148o00Oo0O.o00000OO
    public final void OooO0OO(@Nullable SmartSwipeWrapper smartSwipeWrapper, float f) {
        Intrinsics.checkNotNull(smartSwipeWrapper);
        float width = smartSwipeWrapper.getWidth() * f;
        p1 p1Var = this.f50747OooO00o;
        if (width > p1Var.f50770OooOo0O) {
            OooO00o.OooO0O0("102096");
            LiveEventBus.get("ROOM_CHAT_REPLY").post(p1Var.f50771OooOo0o);
        }
    }

    @Override // p148o00Oo0O.o00000O, p148o00Oo0O.o00000OO
    public final void OooO0oo(@Nullable SmartSwipeWrapper smartSwipeWrapper, float f) {
        p1 p1Var = this.f50747OooO00o;
        ImageView imageView = p1Var.f50760OooOO0o;
        if (imageView == null) {
            return;
        }
        Intrinsics.checkNotNull(smartSwipeWrapper);
        float width = smartSwipeWrapper.getWidth() * f;
        float f2 = p1Var.f50770OooOo0O;
        imageView.setAlpha(Math.min(width, f2) / f2);
    }
}
