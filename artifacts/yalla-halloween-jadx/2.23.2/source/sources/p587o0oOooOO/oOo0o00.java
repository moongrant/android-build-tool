package p587o0oOooOO;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0OoOo0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.AutoImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p368o0OOo0Oo.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AutoImage f56887OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f56888OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o00(AutoImage autoImage, SVGAView sVGAView) {
        super(1);
        this.f56887OooO0Oo = autoImage;
        this.f56888OooO0o0 = sVGAView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        AutoImage autoImage = this.f56887OooO0Oo;
        if (zBooleanValue) {
            autoImage.addView(this.f56888OooO0o0);
            autoImage.f29800OooO0o = null;
        } else {
            if (autoImage.f29800OooO0o == null) {
                autoImage.f29800OooO0o = new NetImageView(autoImage.getContext());
            }
            NetImageView netImageView = autoImage.f29800OooO0o;
            if (netImageView != null) {
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(autoImage.getContext());
                oooO00o.f43126OooO0OO = autoImage.f29799OooO0Oo;
                boolean z = false;
                oooO00o.f43124OooO00o = 0;
                oooO00o.f43138OooOOOo = autoImage.f29803OooO0oo;
                oooO00o.f43151OooOoo0 = 1;
                oooO00o.OooO0o0(autoImage.f29798OooO);
                if (o0OoOo0.OooO00o(autoImage.f29805OooOO0O) && o0OoOo0.OooO00o(Boolean.valueOf(StringsKt__StringsKt.contains(autoImage.f29799OooO0Oo, ".gif", true)))) {
                    z = true;
                }
                oooO00o.f43129OooO0o0 = z;
                oooO00o.OooO0Oo(netImageView);
                ImageView.ScaleType scaleType = autoImage.f29804OooOO0;
                if (scaleType != null) {
                    netImageView.setScaleType(scaleType);
                }
                autoImage.addView(netImageView);
            }
            autoImage.f29801OooO0o0 = null;
        }
        return Unit.INSTANCE;
    }
}
