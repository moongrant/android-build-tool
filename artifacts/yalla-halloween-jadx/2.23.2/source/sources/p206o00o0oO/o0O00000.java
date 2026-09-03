package p206o00o0oO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p205o00o0o0o.o000O0;
import p205o00o0o0o.o000O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f39387OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f39388OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f39389OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f39390OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f39391OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f39392OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f39393OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Space f39394OooO0oo;

    public o0O00000(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Space space) {
        this.f39387OooO00o = frameLayout;
        this.f39388OooO0O0 = frameLayout2;
        this.f39389OooO0OO = imageView;
        this.f39390OooO0Oo = textView;
        this.f39392OooO0o0 = textView2;
        this.f39391OooO0o = textView3;
        this.f39393OooO0oO = textView4;
        this.f39394OooO0oo = space;
    }

    @NonNull
    public static o0O00000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f39387OooO00o;
    }

    @NonNull
    public static o0O00000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o000O0.yl_dialog_vertical_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o000O00O.flCustom;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o000O00O.ivClose;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o000O00O.tvConfirm;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = o000O00O.tvMessage;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        i = o000O00O.tvRefuse;
                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView3 != null) {
                            i = o000O00O.tvTitle;
                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView4 != null) {
                                i = o000O00O.vCloseHolder;
                                Space space = (Space) OooO0O0.OooO00o(i, viewInflate);
                                if (space != null) {
                                    return new o0O00000((FrameLayout) viewInflate, frameLayout, imageView, textView, textView2, textView3, textView4, space);
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
