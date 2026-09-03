package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class n9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50076OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50077OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f50078OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50079OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f50080OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50081OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50082OooO0oO;

    public n9(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull SVGAView sVGAView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2) {
        this.f50076OooO00o = constraintLayout;
        this.f50077OooO0O0 = imageView;
        this.f50078OooO0OO = sVGAView;
        this.f50079OooO0Oo = imageView2;
        this.f50081OooO0o0 = textView;
        this.f50080OooO0o = view;
        this.f50082OooO0oO = textView2;
    }

    @NonNull
    public static n9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50076OooO00o;
    }

    @NonNull
    public static n9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_gift_send, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.currency;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.currency);
        if (imageView != null) {
            i = R.id.giftImage;
            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.giftImage);
            if (sVGAView != null) {
                i = R.id.ivGiftTag;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftTag);
                if (imageView2 != null) {
                    i = R.id.price;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.price);
                    if (textView != null) {
                        i = R.id.selectBg;
                        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.selectBg);
                        if (viewOooO00o != null) {
                            i = R.id.tvGiftTag;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGiftTag);
                            if (textView2 != null) {
                                return new n9((ConstraintLayout) viewInflate, imageView, sVGAView, imageView2, textView, viewOooO00o, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
