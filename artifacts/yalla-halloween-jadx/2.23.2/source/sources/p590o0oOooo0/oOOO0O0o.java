package p590o0oOooo0;

import android.graphics.drawable.BitmapDrawable;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.listener.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p650o0ooo.g5;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0O0o extends OooO00o<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f57232OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ SVGAView f57233OooO0oo;

    public oOOO0O0o(g5 g5Var, SVGAView sVGAView) {
        this.f57232OooO0oO = g5Var;
        this.f57233OooO0oo = sVGAView;
    }

    @Override // com.yalla.netimage.listener.OooO00o
    public final void OooO0oO(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        Function0<Unit> function0 = this.f57232OooO0oO;
        if (function0 != null) {
            function0.invoke();
        }
        this.f57233OooO0oo.setImageDrawable(bitmapDrawable2);
    }
}
