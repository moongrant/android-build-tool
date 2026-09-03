package p559o0oOo;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.util.Function.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p181o00o0000.OooOO0;
import p562o0oOo000.o00oO0o;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 extends OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO00o f56230OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public String f56231OooO0Oo = "";

    @Override // p181o00o0000.OooOO0
    public final void OooO00o(@Nullable BaseViewHolder baseViewHolder) {
        super.OooO00o(baseViewHolder);
        if (this.f38400OooO00o == 2) {
            SVGAView sVGAView = baseViewHolder != null ? (SVGAView) baseViewHolder.getView(o0OO00O.vLoading) : null;
            if (this.f56230OooO0OO == null) {
                this.f56230OooO0OO = new OooO00o(o00oO0o.anim_loading_horse_green, 33, sVGAView != null ? sVGAView.getContext() : null, sVGAView, true);
            }
            OooO00o oooO00o = this.f56230OooO0OO;
            if (oooO00o != null) {
                oooO00o.OooO0OO();
                return;
            }
            return;
        }
        String str = this.f56231OooO0Oo;
        if (!(str == null || str.length() == 0)) {
            TextView textView = baseViewHolder != null ? (TextView) baseViewHolder.getView(o0OO00O.tvLoadEnd) : null;
            if (textView != null) {
                textView.setText(this.f56231OooO0Oo);
            }
        }
        OooO00o oooO00o2 = this.f56230OooO0OO;
        if (oooO00o2 != null) {
            oooO00o2.f32268OooO0oo = true;
        }
    }

    @Override // p181o00o0000.OooOO0
    public final int OooO0O0() {
        return oo0o0Oo.layout_load_more;
    }

    @Override // p181o00o0000.OooOO0
    public final int OooO0OO() {
        return o0OO00O.tvLoadEnd;
    }

    @Override // p181o00o0000.OooOO0
    public final int OooO0Oo() {
        return o0OO00O.tvLoadFiled;
    }

    @Override // p181o00o0000.OooOO0
    public final void OooO0o(int i) {
        this.f38400OooO00o = i;
    }

    @Override // p181o00o0000.OooOO0
    public final int OooO0o0() {
        return o0OO00O.vLoading;
    }
}
