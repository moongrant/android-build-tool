package p649o0ooOOoo;

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
import com.common.videoplayer.view.VideoView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class yb implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f51010OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f51011OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f51012OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f51013OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f51014OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f51015OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f51016OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f51017OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51018OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f51019OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final VideoView f51020OooOO0O;

    public yb(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull VideoView videoView) {
        this.f51011OooO00o = constraintLayout;
        this.f51012OooO0O0 = textView;
        this.f51013OooO0OO = imageView;
        this.f51014OooO0Oo = imageView2;
        this.f51016OooO0o0 = imageView3;
        this.f51015OooO0o = imageView4;
        this.f51017OooO0oO = imageView5;
        this.f51018OooO0oo = linearLayoutCompat;
        this.f51010OooO = textView2;
        this.f51019OooOO0 = textView3;
        this.f51020OooOO0O = videoView;
    }

    @NonNull
    public static yb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51011OooO00o;
    }

    @NonNull
    public static yb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_dialog_theme_receive, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btConfirm;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.btConfirm);
        if (textView != null) {
            i = R.id.flTheme;
            if (((CardView) o00Oo0.OooO00o(viewInflate, R.id.flTheme)) != null) {
                i = R.id.ivBg;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBg);
                if (imageView != null) {
                    i = R.id.ivBgShape;
                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBgShape);
                    if (imageView2 != null) {
                        i = R.id.ivBgStroke;
                        ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBgStroke);
                        if (imageView3 != null) {
                            i = R.id.ivClose;
                            ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
                            if (imageView4 != null) {
                                i = R.id.ivTheme;
                                ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTheme);
                                if (imageView5 != null) {
                                    i = R.id.llBottom;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llBottom);
                                    if (linearLayoutCompat != null) {
                                        i = R.id.tvReceived;
                                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvReceived);
                                        if (textView2 != null) {
                                            i = R.id.tvView;
                                            TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvView);
                                            if (textView3 != null) {
                                                i = R.id.videoView;
                                                VideoView videoView = (VideoView) o00Oo0.OooO00o(viewInflate, R.id.videoView);
                                                if (videoView != null) {
                                                    return new yb((ConstraintLayout) viewInflate, textView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayoutCompat, textView2, textView3, videoView);
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
