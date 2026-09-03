package p492o0o00OO0;

import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140o00OOOoO.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f49547OooO00o;

    public oo0oO0(ShowImageActivity showImageActivity) {
        this.f49547OooO00o = showImageActivity;
    }

    @Override // p140o00OOOoO.OooO0O0
    public final void OooO00o(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }

    @Override // p140o00OOOoO.OooO0O0
    public final void OooO0O0(@NotNull MotionEvent ev, float f) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f49547OooO00o;
        if (showImageActivity.f25814OooOoo) {
            return;
        }
        ShowImageActivity.OooOo0O(showImageActivity, ev, f);
    }

    @Override // p140o00OOOoO.OooO0O0
    public final void OooO0OO(@NotNull MotionEvent ev, float f) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f49547OooO00o;
        if (showImageActivity.f25814OooOoo) {
            return;
        }
        ShowImageActivity.OooOo0O(showImageActivity, ev, f);
    }

    @Override // p140o00OOOoO.OooO0O0
    public final void OooO0Oo(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ShowImageActivity showImageActivity = this.f49547OooO00o;
        if (Math.abs(showImageActivity.f25816OooOooO) > 99.0f) {
            showImageActivity.OooOoO();
        } else {
            showImageActivity.OooOoOO();
        }
    }

    @Override // p140o00OOOoO.OooO0O0
    public final void OooO0o(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }

    @Override // p140o00OOOoO.OooO0O0
    public final void OooO0o0(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
    }
}
