package p539o0o0OoOO;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0OoOo0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.AutoImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p362o0OOo0O.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AutoImage f55425OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f55426OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AutoImage autoImage, SVGAView sVGAView) {
        super(1);
        this.f55425OooO0Oo = autoImage;
        this.f55426OooO0o0 = sVGAView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        AutoImage autoImage = this.f55425OooO0Oo;
        if (zBooleanValue) {
            autoImage.addView(this.f55426OooO0o0);
            autoImage.f30346OooO0o = null;
        } else {
            if (autoImage.f30346OooO0o == null) {
                autoImage.f30346OooO0o = new NetImageView(autoImage.getContext());
            }
            NetImageView netImageView = autoImage.f30346OooO0o;
            if (netImageView != null) {
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(autoImage.getContext());
                oooO00o.f43911OooO0OO = autoImage.f30345OooO0Oo;
                boolean z = false;
                oooO00o.f43909OooO00o = 0;
                oooO00o.f43923OooOOOo = autoImage.f30349OooO0oo;
                oooO00o.f43936OooOoo0 = 1;
                oooO00o.OooO0o0(autoImage.f30344OooO);
                if (o0OoOo0.OooO00o(autoImage.f30351OooOO0O) && o0OoOo0.OooO00o(Boolean.valueOf(StringsKt__StringsKt.contains(autoImage.f30345OooO0Oo, ".gif", true)))) {
                    z = true;
                }
                oooO00o.f43914OooO0o0 = z;
                oooO00o.OooO0Oo(netImageView);
                ImageView.ScaleType scaleType = autoImage.f30350OooOO0;
                if (scaleType != null) {
                    netImageView.setScaleType(scaleType);
                }
                autoImage.addView(netImageView);
            }
            autoImage.f30347OooO0o0 = null;
        }
        return Unit.INSTANCE;
    }
}
