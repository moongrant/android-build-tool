package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f58844OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58846OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f58847OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58848OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58849OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58850OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58851OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58852OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58853OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58854OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58855OooOO0o;

    public t2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull SVGAView sVGAView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f58845OooO00o = constraintLayout;
        this.f58846OooO0O0 = imageView;
        this.f58847OooO0OO = sVGAView;
        this.f58848OooO0Oo = imageView2;
        this.f58850OooO0o0 = imageView3;
        this.f58849OooO0o = imageView4;
        this.f58851OooO0oO = linearLayoutCompat;
        this.f58852OooO0oo = textView;
        this.f58844OooO = view;
        this.f58853OooOO0 = textView2;
        this.f58854OooOO0O = textView3;
        this.f58855OooOO0o = textView4;
    }

    @NonNull
    public static t2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58845OooO00o;
    }

    @NonNull
    public static t2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.item_gift_send, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.currency;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.giftImage;
            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                i = oO00O0oO.ivGiftBackpackTimeTag;
                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = oO00O0oO.ivGiftNewTag;
                    ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView3 != null) {
                        i = oO00O0oO.ivGiftTag;
                        ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView4 != null) {
                            i = oO00O0oO.layoutGiftBackpackTimeTag;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat != null) {
                                i = oO00O0oO.price;
                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.selectBg), viewInflate)) != null) {
                                    i = oO00O0oO.tvGiftBackpackTag;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = oO00O0oO.tvGiftBackpackTimeTag;
                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = oO00O0oO.tvGiftTag;
                                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView4 != null) {
                                                return new t2((ConstraintLayout) viewInflate, imageView, sVGAView, imageView2, imageView3, imageView4, linearLayoutCompat, textView, viewOooO00o, textView2, textView3, textView4);
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
