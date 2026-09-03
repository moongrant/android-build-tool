package p250o00oo0oO;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 extends o000O00O {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000O000<o000O000<Object>> f34211OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(int i, o000O000<o000O000<Object>> o000o001, Context context) {
        super(context, i);
        this.f34211OoooO00 = o000o001;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && isShowing() && this.f34211OoooO00.f34202OooO0Oo) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (x <= 0 || y <= 0 || x > decorView.getWidth() || y > decorView.getHeight()) {
                cancel();
                return true;
            }
        }
        return false;
    }
}
