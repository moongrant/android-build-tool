package p485o0o00O0;

import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p116o00O0OOo.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 implements OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f47984OooO00o;

    public o0OO0(ShowImageActivity showImageActivity) {
        this.f47984OooO00o = showImageActivity;
    }

    @Override // p116o00O0OOo.OooOO0O
    public final void OooO00o(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }

    @Override // p116o00O0OOo.OooOO0O
    public final void OooO0O0(@NotNull MotionEvent ev, float f) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f47984OooO00o;
        if (showImageActivity.f26263OooOoo) {
            return;
        }
        ShowImageActivity.OooOo0O(showImageActivity, ev, f);
    }

    @Override // p116o00O0OOo.OooOO0O
    public final void OooO0OO(@NotNull MotionEvent ev, float f) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f47984OooO00o;
        if (showImageActivity.f26263OooOoo) {
            return;
        }
        ShowImageActivity.OooOo0O(showImageActivity, ev, f);
    }

    @Override // p116o00O0OOo.OooOO0O
    public final void OooO0Oo(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f47984OooO00o;
        if (Math.abs(showImageActivity.f26265OooOooO) > 99.0f) {
            showImageActivity.OooOoO();
        } else {
            showImageActivity.OooOoOO();
        }
    }

    @Override // p116o00O0OOo.OooOO0O
    public final void OooO0o(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }

    @Override // p116o00O0OOo.OooOO0O
    public final void OooO0o0(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }
}
