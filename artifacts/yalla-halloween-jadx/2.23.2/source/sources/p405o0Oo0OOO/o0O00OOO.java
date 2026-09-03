package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44456OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f44458OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44459OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44460OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44461OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44462OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44463OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44464OooO0oo;

    public o0O00OOO(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f44457OooO00o = linearLayout;
        this.f44458OooO0O0 = textView;
        this.f44459OooO0OO = textView2;
        this.f44460OooO0Oo = textView3;
        this.f44462OooO0o0 = linearLayout2;
        this.f44461OooO0o = textView4;
        this.f44463OooO0oO = textView5;
        this.f44464OooO0oo = textView6;
        this.f44456OooO = textView7;
    }

    @NonNull
    public static o0O00OOO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44457OooO00o;
    }

    @NonNull
    public static o0O00OOO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.facebook;
        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = o0OO00O.friends;
            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = o0OO00O.instagram;
                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = o0OO00O.moments;
                    TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView4 != null) {
                        i = o0OO00O.scrollView;
                        if (((HorizontalScrollView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.title;
                            TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView5 != null) {
                                i = o0OO00O.twitter;
                                TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView6 != null) {
                                    i = o0OO00O.whatsApp;
                                    TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView7 != null) {
                                        return new o0O00OOO(linearLayout, textView, textView2, textView3, linearLayout, textView4, textView5, textView6, textView7);
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
