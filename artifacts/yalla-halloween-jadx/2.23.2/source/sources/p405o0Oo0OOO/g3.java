package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class g3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final MarqueeText f43880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43881OooO0OO;

    public g3(@NonNull ConstraintLayout constraintLayout, @NonNull MarqueeText marqueeText, @NonNull ConstraintLayout constraintLayout2) {
        this.f43879OooO00o = constraintLayout;
        this.f43880OooO0O0 = marqueeText;
        this.f43881OooO0OO = constraintLayout2;
    }

    @NonNull
    public static g3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43879OooO00o;
    }

    @NonNull
    public static g3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_week_star_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.content;
        MarqueeText marqueeText = (MarqueeText) OooO0O0.OooO00o(i, viewInflate);
        if (marqueeText != null) {
            i = o0OO00O.ivBg;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.ivEnd;
                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.ivStart;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        return new g3(constraintLayout, marqueeText, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
