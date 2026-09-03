package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44342OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FixTextView f44346OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44347OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44348OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44349OooO0oo;

    public o00OO00O(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f44342OooO00o = frameLayout;
        this.f44343OooO0O0 = imageView;
        this.f44344OooO0OO = imageView2;
        this.f44345OooO0Oo = linearLayout;
        this.f44347OooO0o0 = netImageView;
        this.f44346OooO0o = fixTextView;
        this.f44348OooO0oO = textView;
        this.f44349OooO0oo = textView2;
    }

    @NonNull
    public static o00OO00O OooO00o(@NonNull View view) {
        int i = o0OO00O.ivEventState;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
        if (imageView != null) {
            i = o0OO00O.ivMore;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, view);
            if (imageView2 != null) {
                i = o0OO00O.llSub;
                LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, view);
                if (linearLayout != null) {
                    i = o0OO00O.niv;
                    NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, view);
                    if (netImageView != null) {
                        i = o0OO00O.tvEvent;
                        FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, view);
                        if (fixTextView != null) {
                            i = o0OO00O.tvEventTime;
                            TextView textView = (TextView) OooO0O0.OooO00o(i, view);
                            if (textView != null) {
                                i = o0OO00O.tvSubscribe;
                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, view);
                                if (textView2 != null) {
                                    return new o00OO00O((FrameLayout) view, imageView, imageView2, linearLayout, netImageView, fixTextView, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static o00OO00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44342OooO00o;
    }

    @NonNull
    public static o00OO00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.chatline_event, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
