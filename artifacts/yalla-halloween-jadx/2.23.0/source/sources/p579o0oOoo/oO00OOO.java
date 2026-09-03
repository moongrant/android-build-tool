package p579o0oOoo;

import android.graphics.drawable.BitmapDrawable;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.listener.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p519o0o0O0oO.f5;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OOO extends OooO00o<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56557OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ SVGAView f56558OooO0oo;

    public oO00OOO(f5 f5Var, SVGAView sVGAView) {
        this.f56557OooO0oO = f5Var;
        this.f56558OooO0oo = sVGAView;
    }

    @Override // com.yalla.netimage.listener.OooO00o
    public final void OooO0oo(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        Function0<Unit> function0 = this.f56557OooO0oO;
        if (function0 != null) {
            function0.invoke();
        }
        this.f56558OooO0oo.setImageDrawable(bitmapDrawable2);
    }
}
