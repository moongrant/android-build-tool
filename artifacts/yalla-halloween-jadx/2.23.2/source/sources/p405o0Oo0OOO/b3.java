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
public final class b3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43739OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f43740OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final MarqueeText f43741OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f43742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43743OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f43744OooO0o0;

    public b3(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull MarqueeText marqueeText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2) {
        this.f43739OooO00o = constraintLayout;
        this.f43740OooO0O0 = view;
        this.f43741OooO0OO = marqueeText;
        this.f43742OooO0Oo = imageView;
        this.f43744OooO0o0 = imageView2;
        this.f43743OooO0o = constraintLayout2;
    }

    @NonNull
    public static b3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43739OooO00o;
    }

    @NonNull
    public static b3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_tips_merge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bgContent;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            i = o0OO00O.content;
            MarqueeText marqueeText = (MarqueeText) OooO0O0.OooO00o(i, viewInflate);
            if (marqueeText != null) {
                i = o0OO00O.ivBg;
                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.ivEnd;
                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = o0OO00O.ivStart;
                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            return new b3(constraintLayout, viewOooO00o, marqueeText, imageView, imageView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
