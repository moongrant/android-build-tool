package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.videoplayer.view.VideoView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class f5 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f57907OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57908OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f57909OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57910OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57911OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f57912OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f57913OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f57914OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57915OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f57916OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final VideoView f57917OooOO0O;

    public f5(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull VideoView videoView) {
        this.f57908OooO00o = constraintLayout;
        this.f57909OooO0O0 = textView;
        this.f57910OooO0OO = imageView;
        this.f57911OooO0Oo = imageView2;
        this.f57913OooO0o0 = imageView3;
        this.f57912OooO0o = imageView4;
        this.f57914OooO0oO = imageView5;
        this.f57915OooO0oo = linearLayoutCompat;
        this.f57907OooO = textView2;
        this.f57916OooOO0 = textView3;
        this.f57917OooOO0O = videoView;
    }

    @NonNull
    public static f5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57908OooO00o;
    }

    @NonNull
    public static f5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_dialog_theme_receive, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btConfirm;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.flTheme;
            if (((CardView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.ivBg;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.ivBgShape;
                    ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = oO00O0oO.ivBgStroke;
                        ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView3 != null) {
                            i = oO00O0oO.ivClose;
                            ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView4 != null) {
                                i = oO00O0oO.ivTheme;
                                ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView5 != null) {
                                    i = oO00O0oO.llBottom;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                                    if (linearLayoutCompat != null) {
                                        i = oO00O0oO.tvReceived;
                                        TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView2 != null) {
                                            i = oO00O0oO.tvView;
                                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView3 != null) {
                                                i = oO00O0oO.videoView;
                                                VideoView videoView = (VideoView) OooOO0.OooO00o(i, viewInflate);
                                                if (videoView != null) {
                                                    return new f5((ConstraintLayout) viewInflate, textView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayoutCompat, textView2, textView3, videoView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
