package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43719OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43720OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f43721OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f43722OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f43723OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f43724OooO0o0;

    public a3(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5) {
        this.f43719OooO00o = linearLayout;
        this.f43720OooO0O0 = imageView;
        this.f43721OooO0OO = imageView2;
        this.f43722OooO0Oo = imageView3;
        this.f43724OooO0o0 = imageView4;
        this.f43723OooO0o = imageView5;
    }

    @NonNull
    public static a3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43719OooO00o;
    }

    @NonNull
    public static a3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivGiftNumberHundred;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.ivGiftNumberOne;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = o0OO00O.ivGiftNumberTen;
                ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    i = o0OO00O.ivGiftNumberThousand;
                    ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView4 != null) {
                        i = o0OO00O.ivGiftNumberX;
                        ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView5 != null) {
                            i = o0OO00O.llGiftNumber;
                            if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                return new a3((LinearLayout) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
