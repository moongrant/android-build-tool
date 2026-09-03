package p185o00o00Oo;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0000oo<o0000oo<Object>> f38493OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(int i, o0000oo<o0000oo<Object>> o0000ooVar, Context context) {
        super(context, i);
        this.f38493OooO0oo = o0000ooVar;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && isShowing() && this.f38493OooO0oo.f38490OooO0Oo) {
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
