package p256o00ooOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;
import p255o00ooO0o.o00O0O0O;
import p255o00ooO0o.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f34395OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f34396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f34397OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f34398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f34399OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f34400OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f34401OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Space f34402OooO0oo;

    public o0O00o0(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Space space) {
        this.f34395OooO00o = frameLayout;
        this.f34396OooO0O0 = frameLayout2;
        this.f34397OooO0OO = imageView;
        this.f34398OooO0Oo = textView;
        this.f34400OooO0o0 = textView2;
        this.f34399OooO0o = textView3;
        this.f34401OooO0oO = textView4;
        this.f34402OooO0oo = space;
    }

    @NonNull
    public static o0O00o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f34395OooO00o;
    }

    @NonNull
    public static o0O00o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o00O0OO0.yl_dialog_vertical_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o00O0O0O.flCustom;
        FrameLayout frameLayout = (FrameLayout) o00Oo0.OooO00o(viewInflate, i);
        if (frameLayout != null) {
            i = o00O0O0O.ivClose;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, i);
            if (imageView != null) {
                i = o00O0O0O.tvConfirm;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, i);
                if (textView != null) {
                    i = o00O0O0O.tvMessage;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, i);
                    if (textView2 != null) {
                        i = o00O0O0O.tvRefuse;
                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, i);
                        if (textView3 != null) {
                            i = o00O0O0O.tvTitle;
                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, i);
                            if (textView4 != null) {
                                i = o00O0O0O.vCloseHolder;
                                Space space = (Space) o00Oo0.OooO00o(viewInflate, i);
                                if (space != null) {
                                    return new o0O00o0((FrameLayout) viewInflate, frameLayout, imageView, textView, textView2, textView3, textView4, space);
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
