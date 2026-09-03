package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class r5 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58724OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58725OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f58726OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58727OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58728OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58729OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f58730OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58731OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58732OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58733OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58734OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58735OooOO0o;

    public r5(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.f58725OooO00o = constraintLayout;
        this.f58726OooO0O0 = textView;
        this.f58727OooO0OO = textView2;
        this.f58728OooO0Oo = textView3;
        this.f58730OooO0o0 = textView4;
        this.f58729OooO0o = textView5;
        this.f58731OooO0oO = textView6;
        this.f58732OooO0oo = textView7;
        this.f58724OooO = textView8;
        this.f58733OooOO0 = textView9;
        this.f58734OooOO0O = textView10;
        this.f58735OooOO0o = textView11;
    }

    @NonNull
    public static r5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58725OooO00o;
    }

    @NonNull
    public static r5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_view_score_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.tvScore0;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.tvScore1;
            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = oO00O0oO.tvScore10;
                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    i = oO00O0oO.tvScore2;
                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView4 != null) {
                        i = oO00O0oO.tvScore3;
                        TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView5 != null) {
                            i = oO00O0oO.tvScore4;
                            TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView6 != null) {
                                i = oO00O0oO.tvScore5;
                                TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView7 != null) {
                                    i = oO00O0oO.tvScore6;
                                    TextView textView8 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView8 != null) {
                                        i = oO00O0oO.tvScore7;
                                        TextView textView9 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView9 != null) {
                                            i = oO00O0oO.tvScore8;
                                            TextView textView10 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView10 != null) {
                                                i = oO00O0oO.tvScore9;
                                                TextView textView11 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView11 != null) {
                                                    return new r5((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
