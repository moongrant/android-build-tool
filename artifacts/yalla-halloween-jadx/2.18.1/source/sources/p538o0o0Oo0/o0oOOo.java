package p538o0o0Oo0;

import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p199o00o0Oo.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOOo implements o00O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f44070OooO00o;

    public o0oOOo(ShowImageActivity showImageActivity) {
        this.f44070OooO00o = showImageActivity;
    }

    @Override // p199o00o0Oo.o00O000o
    public final void OooO00o(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }

    @Override // p199o00o0Oo.o00O000o
    public final void OooO0O0(@NotNull MotionEvent ev, float f) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f44070OooO00o;
        if (showImageActivity.f22531o0OoOo0) {
            return;
        }
        ShowImageActivity.OooOoOO(showImageActivity, ev, f);
    }

    @Override // p199o00o0Oo.o00O000o
    public final void OooO0OO(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (Math.abs(this.f44070OooO00o.f22532ooOO) > 99.0f) {
            this.f44070OooO00o.Oooo00o();
        } else {
            this.f44070OooO00o.Oooo0O0();
        }
    }

    @Override // p199o00o0Oo.o00O000o
    public final void OooO0Oo(@NotNull MotionEvent ev, float f) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f44070OooO00o;
        if (showImageActivity.f22531o0OoOo0) {
            return;
        }
        ShowImageActivity.OooOoOO(showImageActivity, ev, f);
    }

    @Override // p199o00o0Oo.o00O000o
    public final void OooO0o(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }

    @Override // p199o00o0Oo.o00O000o
    public final void OooO0o0(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }
}
