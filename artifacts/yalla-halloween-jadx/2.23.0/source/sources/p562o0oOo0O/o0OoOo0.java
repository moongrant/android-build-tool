package p562o0oOo0O;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import o00OOOOo.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO0O0OoO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 extends OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public com.yalla.yalla.util.Function.OooO00o f56193OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public String f56194OooO0Oo = "";

    @Override // o00OOOOo.OooO00o
    public final void OooO00o(@Nullable BaseViewHolder baseViewHolder) {
        super.OooO00o(baseViewHolder);
        if (this.f37350OooO00o == 2) {
            SVGAView sVGAView = baseViewHolder != null ? (SVGAView) baseViewHolder.getView(oO00O0oO.vLoading) : null;
            if (this.f56193OooO0OO == null) {
                this.f56193OooO0OO = new com.yalla.yalla.util.Function.OooO00o(oO0O0OoO.anim_loading_horse_green, 33, sVGAView != null ? sVGAView.getContext() : null, sVGAView, true);
            }
            com.yalla.yalla.util.Function.OooO00o oooO00o = this.f56193OooO0OO;
            if (oooO00o != null) {
                oooO00o.OooO0OO();
                return;
            }
            return;
        }
        String str = this.f56194OooO0Oo;
        if (!(str == null || str.length() == 0)) {
            TextView textView = baseViewHolder != null ? (TextView) baseViewHolder.getView(oO00O0oO.tvLoadEnd) : null;
            if (textView != null) {
                textView.setText(this.f56194OooO0Oo);
            }
        }
        com.yalla.yalla.util.Function.OooO00o oooO00o2 = this.f56193OooO0OO;
        if (oooO00o2 != null) {
            oooO00o2.f32804OooO0oo = true;
        }
    }

    @Override // o00OOOOo.OooO00o
    public final int OooO0O0() {
        return oO00OO0O.layout_load_more;
    }

    @Override // o00OOOOo.OooO00o
    public final int OooO0OO() {
        return oO00O0oO.tvLoadEnd;
    }

    @Override // o00OOOOo.OooO00o
    public final int OooO0Oo() {
        return oO00O0oO.tvLoadFiled;
    }

    @Override // o00OOOOo.OooO00o
    public final void OooO0o(int i) {
        this.f37350OooO00o = i;
    }

    @Override // o00OOOOo.OooO00o
    public final int OooO0o0() {
        return oO00O0oO.vLoading;
    }
}
