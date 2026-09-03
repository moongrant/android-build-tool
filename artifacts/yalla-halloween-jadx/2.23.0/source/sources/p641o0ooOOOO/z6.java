package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class z6 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59459OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f59460OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f59461OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59462OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59463OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f59464OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f59465OooO0oO;

    public z6(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f59459OooO00o = linearLayout;
        this.f59460OooO0O0 = textView;
        this.f59461OooO0OO = textView2;
        this.f59462OooO0Oo = textView3;
        this.f59464OooO0o0 = textView4;
        this.f59463OooO0o = textView5;
        this.f59465OooO0oO = textView6;
    }

    @NonNull
    public static z6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59459OooO00o;
    }

    @NonNull
    public static z6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_view_layout_moment_message_type, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.type_all;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.type_at_me;
            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = oO00O0oO.type_comment;
                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    i = oO00O0oO.type_gifts;
                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView4 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        i = oO00O0oO.type_like;
                        TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView5 != null) {
                            i = oO00O0oO.type_other;
                            TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView6 != null) {
                                return new z6(linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
