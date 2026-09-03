package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class z2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45732OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f45733OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f45734OooO0OO;

    public z2(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f45732OooO00o = constraintLayout;
        this.f45733OooO0O0 = sVGAView;
        this.f45734OooO0OO = textView;
    }

    @NonNull
    public static z2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45732OooO00o;
    }

    @NonNull
    public static z2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_new_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.giftImage;
        SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
        if (sVGAView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i2 = o0OO00O.text;
            TextView textView = (TextView) OooO0O0.OooO00o(i2, viewInflate);
            if (textView != null) {
                return new z2(constraintLayout, sVGAView, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
