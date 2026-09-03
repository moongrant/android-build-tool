package p502o0o00oOO;

import android.widget.ImageView;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p122o00O0o0O.OooO0O0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO00 extends OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f49470OooO00o;

    public o0OOO00(o0OOO0 o0ooo1) {
        this.f49470OooO00o = o0ooo1;
    }

    @Override // p122o00O0o0O.OooO0O0, p122o00O0o0O.OooO0OO
    public final void OooO0OO(@Nullable SmartSwipeWrapper smartSwipeWrapper, float f) {
        Intrinsics.checkNotNull(smartSwipeWrapper);
        float width = smartSwipeWrapper.getWidth() * f;
        o0OOO0 o0ooo1 = this.f49470OooO00o;
        if (width > o0ooo1.f49468OooOo0O) {
            o0OO000.OooO00o("102096");
            LiveEventBus.get("ROOM_CHAT_REPLY").post(o0ooo1.f49469OooOo0o);
        }
    }

    @Override // p122o00O0o0O.OooO0O0, p122o00O0o0O.OooO0OO
    public final void OooO0oo(@Nullable SmartSwipeWrapper smartSwipeWrapper, float f) {
        o0OOO0 o0ooo1 = this.f49470OooO00o;
        ImageView imageView = o0ooo1.f49458OooOO0o;
        if (imageView == null) {
            return;
        }
        Intrinsics.checkNotNull(smartSwipeWrapper);
        float width = smartSwipeWrapper.getWidth() * f;
        float f2 = o0ooo1.f49468OooOo0O;
        imageView.setAlpha(Math.min(width, f2) / f2);
    }
}
