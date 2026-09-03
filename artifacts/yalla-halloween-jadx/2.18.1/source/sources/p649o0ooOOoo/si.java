package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class si implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50623OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50624OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50625OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50626OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50627OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f50628OooO0o0;

    public si(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5) {
        this.f50623OooO00o = linearLayout;
        this.f50624OooO0O0 = imageView;
        this.f50625OooO0OO = imageView2;
        this.f50626OooO0Oo = imageView3;
        this.f50628OooO0o0 = imageView4;
        this.f50627OooO0o = imageView5;
    }

    @NonNull
    public static si inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50623OooO00o;
    }

    @NonNull
    public static si inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivGiftNumberHundred;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftNumberHundred);
        if (imageView != null) {
            i = R.id.ivGiftNumberOne;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftNumberOne);
            if (imageView2 != null) {
                i = R.id.ivGiftNumberTen;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftNumberTen);
                if (imageView3 != null) {
                    i = R.id.ivGiftNumberThousand;
                    ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftNumberThousand);
                    if (imageView4 != null) {
                        i = R.id.ivGiftNumberX;
                        ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftNumberX);
                        if (imageView5 != null) {
                            i = R.id.llGiftNumber;
                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llGiftNumber)) != null) {
                                return new si((LinearLayout) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
