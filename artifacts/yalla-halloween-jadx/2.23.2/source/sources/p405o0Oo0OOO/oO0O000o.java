package p405o0Oo0OOO;

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
import com.yalla.android.videoplayer.view.VideoView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000o implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44856OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44857OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f44858OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44859OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44860OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f44861OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44862OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f44863OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f44864OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44865OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final VideoView f44866OooOO0O;

    public oO0O000o(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull VideoView videoView) {
        this.f44857OooO00o = constraintLayout;
        this.f44858OooO0O0 = textView;
        this.f44859OooO0OO = imageView;
        this.f44860OooO0Oo = imageView2;
        this.f44862OooO0o0 = imageView3;
        this.f44861OooO0o = imageView4;
        this.f44863OooO0oO = imageView5;
        this.f44864OooO0oo = linearLayoutCompat;
        this.f44856OooO = textView2;
        this.f44865OooOO0 = textView3;
        this.f44866OooOO0O = videoView;
    }

    @NonNull
    public static oO0O000o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44857OooO00o;
    }

    @NonNull
    public static oO0O000o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_dialog_theme_receive, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btConfirm;
        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = o0OO00O.flTheme;
            if (((CardView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.ivBg;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ivBgShape;
                    ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = o0OO00O.ivBgStroke;
                        ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView3 != null) {
                            i = o0OO00O.ivClose;
                            ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView4 != null) {
                                i = o0OO00O.ivTheme;
                                ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView5 != null) {
                                    i = o0OO00O.llBottom;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                                    if (linearLayoutCompat != null) {
                                        i = o0OO00O.tvReceived;
                                        TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView2 != null) {
                                            i = o0OO00O.tvView;
                                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView3 != null) {
                                                i = o0OO00O.videoView;
                                                VideoView videoView = (VideoView) OooO0O0.OooO00o(i, viewInflate);
                                                if (videoView != null) {
                                                    return new oO0O000o((ConstraintLayout) viewInflate, textView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayoutCompat, textView2, textView3, videoView);
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
