package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59024OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f59026OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f59027OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59028OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59029OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59030OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f59031OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f59032OooO0oo;

    public v1(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f59025OooO00o = linearLayout;
        this.f59026OooO0O0 = textView;
        this.f59027OooO0OO = textView2;
        this.f59028OooO0Oo = textView3;
        this.f59030OooO0o0 = linearLayout2;
        this.f59029OooO0o = textView4;
        this.f59031OooO0oO = textView5;
        this.f59032OooO0oo = textView6;
        this.f59024OooO = textView7;
    }

    @NonNull
    public static v1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59025OooO00o;
    }

    @NonNull
    public static v1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.facebook;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.friends;
            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = oO00O0oO.instagram;
                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = oO00O0oO.moments;
                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView4 != null) {
                        i = oO00O0oO.scrollView;
                        if (((HorizontalScrollView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.title;
                            TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView5 != null) {
                                i = oO00O0oO.twitter;
                                TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView6 != null) {
                                    i = oO00O0oO.whatsApp;
                                    TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView7 != null) {
                                        return new v1(linearLayout, textView, textView2, textView3, linearLayout, textView4, textView5, textView6, textView7);
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
