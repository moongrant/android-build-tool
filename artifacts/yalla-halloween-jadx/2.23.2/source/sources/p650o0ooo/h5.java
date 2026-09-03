package p650o0ooo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p200o00o0OoO.o00OOO0O;
import p200o00o0OoO.o0o0Oo;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.a2;
import p590o0oOooo0.oOOO00o0;
import p590o0oOooo0.oOOO0O0o;
import p590o0oOooo0.oOOO0OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class h5 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final a2 f58268OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(@NotNull BaseActivityK context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        a2 a2VarInflate = a2.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(a2VarInflate, "inflate(...)");
        this.f58268OooOO0O = a2VarInflate;
        ConstraintLayout constraintLayout = a2VarInflate.f43716OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58509OooO0o0.getWindow();
        if (window != null) {
            window.setDimAmount(0.6f);
        }
        a2VarInflate.f43716OooO00o.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.f5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h5 this$0 = this.f58219OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
        a2VarInflate.f43717OooO0O0.setLoops(0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005a  */
    @NotNull
    public final void OooOO0(@NotNull String path) {
        boolean z;
        Intrinsics.checkNotNullParameter(path, "url");
        a2 a2Var = this.f58268OooOO0O;
        a2Var.f43717OooO0O0.setImageDrawable(null);
        SVGAView svgaImageView = a2Var.f43717OooO0O0;
        svgaImageView.OooO0oO(false);
        a2Var.f43718OooO0OO.OooO0Oo();
        Intrinsics.checkNotNullExpressionValue(svgaImageView, "image");
        LifeCycleDialog lifecycleOwner = this.f58509OooO0o0;
        g5 g5Var = new g5(this);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(svgaImageView, "svgaImageView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        try {
            if (OooOo00.OooO0O0(path)) {
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
            o00OOO0O.f39296OooO00o.getClass();
            Intrinsics.checkNotNullParameter(path, "path");
            o00oO0o.OooO00o(new o0o0Oo(path, null)).observe(lifecycleOwner, new oOOO0OO0(new oOOO00o0(g5Var, svgaImageView)));
        } else {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(svgaImageView.getContext());
            oooO00o.f43126OooO0OO = path;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0OO(new oOOO0O0o(g5Var, svgaImageView));
        }
    }
}
