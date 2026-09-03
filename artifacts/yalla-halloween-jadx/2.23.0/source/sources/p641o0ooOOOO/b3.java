package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57541OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f57542OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57543OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57544OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f57545OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f57546OooO0o0;

    public b3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5) {
        this.f57541OooO00o = linearLayoutCompat;
        this.f57542OooO0O0 = imageView;
        this.f57543OooO0OO = imageView2;
        this.f57544OooO0Oo = imageView3;
        this.f57546OooO0o0 = imageView4;
        this.f57545OooO0o = imageView5;
    }

    @NonNull
    public static b3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57541OooO00o;
    }

    @NonNull
    public static b3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.layout_send_moment_emoji_at_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivAddImage;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.ivAddVideo;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = oO00O0oO.ivAt;
                ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    i = oO00O0oO.ivEmoji;
                    ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView4 != null) {
                        i = oO00O0oO.ivPoll;
                        ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView5 != null) {
                            return new b3((LinearLayoutCompat) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
