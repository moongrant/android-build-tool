package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f44577OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44578OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44579OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44580OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44581OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f44582OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44583OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f44584OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44585OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44586OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f44587OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44588OooOO0o;

    public o0OO00OO(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull SVGAView sVGAView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f44578OooO00o = constraintLayout;
        this.f44579OooO0O0 = imageView;
        this.f44580OooO0OO = sVGAView;
        this.f44581OooO0Oo = imageView2;
        this.f44583OooO0o0 = imageView3;
        this.f44582OooO0o = imageView4;
        this.f44584OooO0oO = linearLayoutCompat;
        this.f44585OooO0oo = textView;
        this.f44577OooO = view;
        this.f44586OooOO0 = textView2;
        this.f44587OooOO0O = textView3;
        this.f44588OooOO0o = textView4;
    }

    @NonNull
    public static o0OO00OO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44578OooO00o;
    }

    @NonNull
    public static o0OO00OO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.item_gift_send, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.currency;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.giftImage;
            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                i = o0OO00O.ivGiftBackpackTimeTag;
                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = o0OO00O.ivGiftNewTag;
                    ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView3 != null) {
                        i = o0OO00O.ivGiftTag;
                        ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView4 != null) {
                            i = o0OO00O.layoutGiftBackpackTimeTag;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat != null) {
                                i = o0OO00O.price;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.selectBg), viewInflate)) != null) {
                                    i = o0OO00O.tvGiftBackpackTag;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = o0OO00O.tvGiftBackpackTimeTag;
                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = o0OO00O.tvGiftTag;
                                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView4 != null) {
                                                return new o0OO00OO((ConstraintLayout) viewInflate, imageView, sVGAView, imageView2, imageView3, imageView4, linearLayoutCompat, textView, viewOooO00o, textView2, textView3, textView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
