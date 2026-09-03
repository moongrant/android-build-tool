package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.manager.data.SharedSvgaManager;
import com.yalla.yalla.common.ui.dialog.LifeCycleDialog;
import com.yalla.yalla.common.ui.view.SVGAView;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.oOO00O;
import p502o0o00o0.o00000O;
import p516o0o0O000.o00oO0o;
import p516o0o0O000.o0ooOOo;
import p536o0o0OOoo.m;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.vh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class s1 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final vh f46300OoooO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            s1.this.f46300OoooO.f50825OooO0OO.OooO0Oo();
            SVGAView sVGAView = s1.this.f46300OoooO.f50825OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "bind.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        vh vhVarInflate = vh.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(vhVarInflate, "inflate(LayoutInflater.from(context))");
        this.f46300OoooO = vhVarInflate;
        ConstraintLayout constraintLayout = vhVarInflate.f50823OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "bind.root");
        OooO0oO(constraintLayout);
        Window window = this.f41544Oooo0oO.getWindow();
        if (window != null) {
            window.setDimAmount(0.6f);
        }
        vhVarInflate.f50823OooO00o.setOnClickListener(new m(this, 1));
        vhVarInflate.f50824OooO0O0.setLoops(0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    @NotNull
    public final s1 OooOO0O(@NotNull String path) {
        boolean z;
        Intrinsics.checkNotNullParameter(path, "url");
        this.f46300OoooO.f50824OooO0O0.setImageDrawable(null);
        this.f46300OoooO.f50824OooO0O0.OooO0o0(false);
        this.f46300OoooO.f50825OooO0OO.OooO0OO();
        SVGAView svgaImageView = this.f46300OoooO.f50824OooO0O0;
        Intrinsics.checkNotNullExpressionValue(svgaImageView, "bind.image");
        LifeCycleDialog lifecycleOwner = this.f41544Oooo0oO;
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(svgaImageView, "svgaImageView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        try {
            if (OooO0OO.OooO0O0(path)) {
                new URL(path);
                String lowerCase = ".svga".toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                if (StringsKt__StringsJVMKt.endsWith$default(path, lowerCase, false, 2, null)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (z) {
            SharedSvgaManager.INSTANCE.loadSvga(path).observe(lifecycleOwner, new o00oO0o(oooO00o, svgaImageView, 0));
        } else {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(svgaImageView.getContext());
            oooO00o2.f48429OooO0OO = path;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o0(new o0ooOOo(oooO00o, svgaImageView));
        }
        return this;
    }
}
