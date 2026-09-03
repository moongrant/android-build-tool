package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class wg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50902OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50903OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f50904OooO0OO;

    public wg(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull SVGAView sVGAView) {
        this.f50902OooO00o = linearLayoutCompat;
        this.f50903OooO0O0 = imageView;
        this.f50904OooO0OO = sVGAView;
    }

    @NonNull
    public static wg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50902OooO00o;
    }

    @NonNull
    public static wg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_layout_user_info_penant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivPendant;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPendant);
        if (imageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaPendant);
            if (sVGAView != null) {
                return new wg(linearLayoutCompat, imageView, sVGAView);
            }
            i = R.id.svgaPendant;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
