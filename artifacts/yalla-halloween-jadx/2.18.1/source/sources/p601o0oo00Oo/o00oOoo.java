package p601o0oo00Oo;

import android.widget.ImageView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.view.AutoImage;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p522o0o0O0o.oOO00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oOoo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AutoImage f48160Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SVGAView f48161Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(AutoImage autoImage, SVGAView sVGAView) {
        super(1);
        this.f48160Oooo0o = autoImage;
        this.f48161Oooo0oO = sVGAView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f48160Oooo0o.addView(this.f48161Oooo0oO);
            this.f48160Oooo0o.f24776Oooo0oo = null;
        } else {
            AutoImage autoImage = this.f48160Oooo0o;
            if (autoImage.f24776Oooo0oo == null) {
                autoImage.f24776Oooo0oo = new NetImageView(autoImage.getContext());
            }
            NetImageView netImageView = autoImage.f24776Oooo0oo;
            if (netImageView != null) {
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(autoImage.getContext());
                oooO00o.f48429OooO0OO = autoImage.f24774Oooo0o;
                boolean z = false;
                oooO00o.f48427OooO00o = 0;
                oooO00o.f48441OooOOOo = autoImage.f24779OoooO00;
                oooO00o.f48454OooOoo0 = 1;
                oooO00o.OooO0oO(autoImage.f24778OoooO0);
                if (oOO00O.OooO0OO(autoImage.f24777OoooO) && oOO00O.OooO0OO(Boolean.valueOf(StringsKt__StringsKt.contains(autoImage.f24774Oooo0o, ".gif", true)))) {
                    z = true;
                }
                oooO00o.f48432OooO0o0 = z;
                oooO00o.OooO0o(netImageView);
                ImageView.ScaleType scaleType = autoImage.f24780OoooO0O;
                if (scaleType != null) {
                    netImageView.setScaleType(scaleType);
                }
                autoImage.addView(netImageView);
            }
            autoImage.f24775Oooo0oO = null;
        }
        return Unit.INSTANCE;
    }
}
