package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44235OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44236OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44237OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44238OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44239OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44240OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44241OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44242OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44243OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44244OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f44245OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44246OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44247OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44248OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44249OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f44250OooOOOo;

    public o000OOo0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull StateButton stateButton, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f44236OooO00o = linearLayout;
        this.f44237OooO0O0 = linearLayout2;
        this.f44238OooO0OO = linearLayout3;
        this.f44239OooO0Oo = linearLayout4;
        this.f44241OooO0o0 = linearLayout5;
        this.f44240OooO0o = linearLayout6;
        this.f44242OooO0oO = linearLayout7;
        this.f44243OooO0oo = textView;
        this.f44235OooO = textView2;
        this.f44244OooOO0 = textView3;
        this.f44245OooOO0O = stateButton;
        this.f44246OooOO0o = textView4;
        this.f44248OooOOO0 = textView5;
        this.f44247OooOOO = textView6;
        this.f44249OooOOOO = textView7;
        this.f44250OooOOOo = textView8;
    }

    @NonNull
    public static o000OOo0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44236OooO00o;
    }

    @NonNull
    public static o000OOo0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_delete_account_submit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.llBadge;
        LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
        if (linearLayout != null) {
            i = o0OO00O.llCoin;
            LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
            if (linearLayout2 != null) {
                i = o0OO00O.llCrystal;
                LinearLayout linearLayout3 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                if (linearLayout3 != null) {
                    i = o0OO00O.llFans;
                    LinearLayout linearLayout4 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayout4 != null) {
                        i = o0OO00O.llFriends;
                        LinearLayout linearLayout5 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayout5 != null) {
                            i = o0OO00O.llLevel;
                            LinearLayout linearLayout6 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayout6 != null) {
                                i = o0OO00O.tvBadge;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = o0OO00O.tvCancel;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = o0OO00O.tvCoin;
                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = o0OO00O.tvConfirmDelete;
                                            StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                            if (stateButton != null) {
                                                i = o0OO00O.tvCrystal;
                                                TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView4 != null) {
                                                    i = o0OO00O.tvDeletePrompt;
                                                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                        i = o0OO00O.tvDeletePromptContent1;
                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            i = o0OO00O.tvDeletePromptContent2;
                                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                i = o0OO00O.tvDeletePromptContent3;
                                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                    i = o0OO00O.tvDeletePromptContent4;
                                                                    TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView5 != null) {
                                                                        i = o0OO00O.tvDeleteTitle;
                                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                            i = o0OO00O.tvFans;
                                                                            TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i = o0OO00O.tvFriends;
                                                                                TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                if (textView7 != null) {
                                                                                    i = o0OO00O.tvLevel;
                                                                                    TextView textView8 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                    if (textView8 != null) {
                                                                                        return new o000OOo0((LinearLayout) viewInflate, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, textView2, textView3, stateButton, textView4, textView5, textView6, textView7, textView8);
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
