package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43713OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43714OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f43715OooO0OO;

    public a1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull SVGAView sVGAView) {
        this.f43713OooO00o = linearLayoutCompat;
        this.f43714OooO0O0 = imageView;
        this.f43715OooO0OO = sVGAView;
    }

    @NonNull
    public static a1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43713OooO00o;
    }

    @NonNull
    public static a1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_layout_user_info_penant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivPendant;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            int i2 = o0OO00O.svgaPendant;
            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i2, viewInflate);
            if (sVGAView != null) {
                return new a1(linearLayoutCompat, imageView, sVGAView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
