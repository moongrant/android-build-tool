package p159o00OoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p157o00OoOO0.o00oO0o;
import p157o00OoOO0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f38471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f38472OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f38473OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f38474OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f38475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f38476OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f38477OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Space f38478OooO0oo;

    public o000OOo(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Space space) {
        this.f38471OooO00o = frameLayout;
        this.f38472OooO0O0 = frameLayout2;
        this.f38473OooO0OO = imageView;
        this.f38474OooO0Oo = textView;
        this.f38476OooO0o0 = textView2;
        this.f38475OooO0o = textView3;
        this.f38477OooO0oO = textView4;
        this.f38478OooO0oo = space;
    }

    @NonNull
    public static o000OOo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f38471OooO00o;
    }

    @NonNull
    public static o000OOo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o00oO0o.yl_dialog_vertical_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oo000o.flCustom;
        FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = oo000o.ivClose;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oo000o.tvConfirm;
                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = oo000o.tvMessage;
                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        i = oo000o.tvRefuse;
                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView3 != null) {
                            i = oo000o.tvTitle;
                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView4 != null) {
                                i = oo000o.vCloseHolder;
                                Space space = (Space) OooOO0.OooO00o(i, viewInflate);
                                if (space != null) {
                                    return new o000OOo((FrameLayout) viewInflate, frameLayout, imageView, textView, textView2, textView3, textView4, space);
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
