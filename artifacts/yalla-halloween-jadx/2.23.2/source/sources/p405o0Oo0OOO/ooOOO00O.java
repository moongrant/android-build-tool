package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO00O implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45293OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45294OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f45295OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f45296OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f45297OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45298OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f45299OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f45300OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45301OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45302OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f45303OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45304OooOO0o;

    public ooOOO00O(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.f45294OooO00o = constraintLayout;
        this.f45295OooO0O0 = textView;
        this.f45296OooO0OO = textView2;
        this.f45297OooO0Oo = textView3;
        this.f45299OooO0o0 = textView4;
        this.f45298OooO0o = textView5;
        this.f45300OooO0oO = textView6;
        this.f45301OooO0oo = textView7;
        this.f45293OooO = textView8;
        this.f45302OooOO0 = textView9;
        this.f45303OooOO0O = textView10;
        this.f45304OooOO0o = textView11;
    }

    @NonNull
    public static ooOOO00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45294OooO00o;
    }

    @NonNull
    public static ooOOO00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_view_score_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.tvScore0;
        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = o0OO00O.tvScore1;
            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = o0OO00O.tvScore10;
                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    i = o0OO00O.tvScore2;
                    TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView4 != null) {
                        i = o0OO00O.tvScore3;
                        TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView5 != null) {
                            i = o0OO00O.tvScore4;
                            TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView6 != null) {
                                i = o0OO00O.tvScore5;
                                TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView7 != null) {
                                    i = o0OO00O.tvScore6;
                                    TextView textView8 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView8 != null) {
                                        i = o0OO00O.tvScore7;
                                        TextView textView9 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView9 != null) {
                                            i = o0OO00O.tvScore8;
                                            TextView textView10 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView10 != null) {
                                                i = o0OO00O.tvScore9;
                                                TextView textView11 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView11 != null) {
                                                    return new ooOOO00O((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
