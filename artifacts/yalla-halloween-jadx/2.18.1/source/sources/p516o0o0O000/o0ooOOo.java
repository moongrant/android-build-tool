package p516o0o0O000;

import android.graphics.drawable.BitmapDrawable;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.util.netimage.listener.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo extends OooO00o<BitmapDrawable> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f42123Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SVGAView f42124Oooo0oO;

    public o0ooOOo(Function0<Unit> function0, SVGAView sVGAView) {
        this.f42123Oooo0o = function0;
        this.f42124Oooo0oO = sVGAView;
    }

    @Override // com.yalla.yalla.util.netimage.listener.OooO00o
    public final void onSuccess(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        Function0<Unit> function0 = this.f42123Oooo0o;
        if (function0 != null) {
            function0.invoke();
        }
        if (bitmapDrawable2 == null) {
            return;
        }
        this.f42124Oooo0oO.setImageDrawable(bitmapDrawable2);
    }
}
