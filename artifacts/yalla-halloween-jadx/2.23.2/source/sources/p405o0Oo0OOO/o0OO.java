package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f44552OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44553OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f44556OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44557OooO0o0;

    public o0OO(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5) {
        this.f44552OooO00o = linearLayoutCompat;
        this.f44553OooO0O0 = imageView;
        this.f44554OooO0OO = imageView2;
        this.f44555OooO0Oo = imageView3;
        this.f44557OooO0o0 = imageView4;
        this.f44556OooO0o = imageView5;
    }

    @NonNull
    public static o0OO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44552OooO00o;
    }

    @NonNull
    public static o0OO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.layout_send_moment_emoji_at_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivAddImage;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.ivAddVideo;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = o0OO00O.ivAt;
                ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    i = o0OO00O.ivEmoji;
                    ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView4 != null) {
                        i = o0OO00O.ivPoll;
                        ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView5 != null) {
                            return new o0OO((LinearLayoutCompat) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
