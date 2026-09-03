package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class lc implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49950OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49951OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49952OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49953OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49954OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49955OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49956OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49957OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49958OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49959OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f49960OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49961OooOO0o;

    public lc(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.f49951OooO00o = constraintLayout;
        this.f49952OooO0O0 = textView;
        this.f49953OooO0OO = textView2;
        this.f49954OooO0Oo = textView3;
        this.f49956OooO0o0 = textView4;
        this.f49955OooO0o = textView5;
        this.f49957OooO0oO = textView6;
        this.f49958OooO0oo = textView7;
        this.f49950OooO = textView8;
        this.f49959OooOO0 = textView9;
        this.f49960OooOO0O = textView10;
        this.f49961OooOO0o = textView11;
    }

    @NonNull
    public static lc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49951OooO00o;
    }

    @NonNull
    public static lc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_view_score_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.tvScore0;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore0);
        if (textView != null) {
            i = R.id.tvScore1;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore1);
            if (textView2 != null) {
                i = R.id.tvScore10;
                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore10);
                if (textView3 != null) {
                    i = R.id.tvScore2;
                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore2);
                    if (textView4 != null) {
                        i = R.id.tvScore3;
                        TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore3);
                        if (textView5 != null) {
                            i = R.id.tvScore4;
                            TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore4);
                            if (textView6 != null) {
                                i = R.id.tvScore5;
                                TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore5);
                                if (textView7 != null) {
                                    i = R.id.tvScore6;
                                    TextView textView8 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore6);
                                    if (textView8 != null) {
                                        i = R.id.tvScore7;
                                        TextView textView9 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore7);
                                        if (textView9 != null) {
                                            i = R.id.tvScore8;
                                            TextView textView10 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore8);
                                            if (textView10 != null) {
                                                i = R.id.tvScore9;
                                                TextView textView11 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvScore9);
                                                if (textView11 != null) {
                                                    return new lc((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
