package p186o00o00Oo;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.Function.OooO0O0;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p249o00oo0o0.o0OoO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o extends o0OoO00O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f33035OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public String f33036OooO0Oo = "";

    @Override // p249o00oo0o0.o0OoO00O
    public final void OooO00o(@Nullable OooO00o oooO00o) {
        super.OooO00o(oooO00o);
        if (this.f34190OooO00o == 2) {
            SVGAView sVGAView = oooO00o != null ? (SVGAView) oooO00o.OooO0Oo(R.id.vLoading) : null;
            if (this.f33035OooO0OO == null) {
                this.f33035OooO0OO = new OooO0O0(sVGAView, sVGAView != null ? sVGAView.getContext() : null, R.array.anim_loading_horse_green, 33, true);
            }
            OooO0O0 oooO0O0 = this.f33035OooO0OO;
            if (oooO0O0 != null) {
                oooO0O0.OooO0O0();
                return;
            }
            return;
        }
        String str = this.f33036OooO0Oo;
        if (!(str == null || str.length() == 0)) {
            TextView textView = oooO00o != null ? (TextView) oooO00o.OooO0Oo(R.id.tvLoadEnd) : null;
            if (textView != null) {
                textView.setText(this.f33036OooO0Oo);
            }
        }
        OooO0O0 oooO0O1 = this.f33035OooO0OO;
        if (oooO0O1 != null) {
            oooO0O1.f11348OooO0oo = true;
        }
    }

    @Override // p249o00oo0o0.o0OoO00O
    public final int OooO0O0() {
        return R.layout.layout_load_more;
    }

    @Override // p249o00oo0o0.o0OoO00O
    public final int OooO0OO() {
        return R.id.tvLoadEnd;
    }

    @Override // p249o00oo0o0.o0OoO00O
    public final int OooO0Oo() {
        return R.id.tvLoadFiled;
    }

    @Override // p249o00oo0o0.o0OoO00O
    public final void OooO0o(int i) {
        this.f34190OooO00o = i;
    }

    @Override // p249o00oo0o0.o0OoO00O
    public final int OooO0o0() {
        return R.id.vLoading;
    }
}
