package p519o0o0O0oO;

import android.view.LayoutInflater;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.OooOO0O;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p154o00OoO00.o00Oo0;
import p154o00OoO00.o00Ooo;
import p362o0OOo0O.OooOO0;
import p579o0oOoo.oO00OO0O;
import p579o0oOoo.oO00OOO;
import p579o0oOoo.oO00OOOo;
import p641o0ooOOOO.la;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class g5 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final la f52294OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(@NotNull BaseActivityK context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        la laVarInflate = la.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(laVarInflate, "inflate(LayoutInflater.from(context))");
        this.f52294OooOO0O = laVarInflate;
        ConstraintLayout constraintLayout = laVarInflate.f58378OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "bind.root");
        OooO0oO(constraintLayout);
        Window window = this.f52534OooO0o0.getWindow();
        if (window != null) {
            window.setDimAmount(0.6f);
        }
        laVarInflate.f58378OooO00o.setOnClickListener(new OooOO0O(this, 2));
        laVarInflate.f58379OooO0O0.setLoops(0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    @NotNull
    public final void OooOO0(@NotNull String path) {
        boolean z;
        Intrinsics.checkNotNullParameter(path, "url");
        la laVar = this.f52294OooOO0O;
        laVar.f58379OooO0O0.setImageDrawable(null);
        SVGAView svgaImageView = laVar.f58379OooO0O0;
        svgaImageView.OooO0oO(false);
        laVar.f58380OooO0OO.OooO0Oo();
        Intrinsics.checkNotNullExpressionValue(svgaImageView, "bind.image");
        LifeCycleDialog lifecycleOwner = this.f52534OooO0o0;
        f5 f5Var = new f5(this);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(svgaImageView, "svgaImageView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        try {
            if (OooOo00.OooO0O0(path)) {
                new URL(path);
                String lowerCase = ".svga".toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                if (StringsKt.OooOO0O(path, lowerCase)) {
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
            o00Oo0.f38187OooO00o.getClass();
            Intrinsics.checkNotNullParameter(path, "path");
            o00oO0o.OooO00o(new o00Ooo(path, null)).observe(lifecycleOwner, new oO00OOOo(new oO00OO0O(f5Var, svgaImageView)));
        } else {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(svgaImageView.getContext());
            oooO00o.f43911OooO0OO = path;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0OO(new oO00OOO(f5Var, svgaImageView));
        }
    }
}
