package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class k6 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49810OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49812OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49813OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49814OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49815OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49816OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49817OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49818OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49819OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f49820OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49821OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49822OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49823OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49824OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49825OooOOOo;

    public k6(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull StateButton stateButton, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f49811OooO00o = linearLayout;
        this.f49812OooO0O0 = linearLayout2;
        this.f49813OooO0OO = linearLayout3;
        this.f49814OooO0Oo = linearLayout4;
        this.f49816OooO0o0 = linearLayout5;
        this.f49815OooO0o = linearLayout6;
        this.f49817OooO0oO = linearLayout7;
        this.f49818OooO0oo = textView;
        this.f49810OooO = textView2;
        this.f49819OooOO0 = textView3;
        this.f49820OooOO0O = stateButton;
        this.f49821OooOO0o = textView4;
        this.f49823OooOOO0 = textView5;
        this.f49822OooOOO = textView6;
        this.f49824OooOOOO = textView7;
        this.f49825OooOOOo = textView8;
    }

    @NonNull
    public static k6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49811OooO00o;
    }

    @NonNull
    public static k6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_delete_account_submit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.llBadge;
        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llBadge);
        if (linearLayout != null) {
            i = R.id.llCoin;
            LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llCoin);
            if (linearLayout2 != null) {
                i = R.id.llCrystal;
                LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llCrystal);
                if (linearLayout3 != null) {
                    i = R.id.llFans;
                    LinearLayout linearLayout4 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llFans);
                    if (linearLayout4 != null) {
                        i = R.id.llFriends;
                        LinearLayout linearLayout5 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llFriends);
                        if (linearLayout5 != null) {
                            i = R.id.llLevel;
                            LinearLayout linearLayout6 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llLevel);
                            if (linearLayout6 != null) {
                                i = R.id.tvBadge;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadge);
                                if (textView != null) {
                                    i = R.id.tvCancel;
                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCancel);
                                    if (textView2 != null) {
                                        i = R.id.tvCoin;
                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCoin);
                                        if (textView3 != null) {
                                            i = R.id.tvConfirmDelete;
                                            StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.tvConfirmDelete);
                                            if (stateButton != null) {
                                                i = R.id.tvCrystal;
                                                TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCrystal);
                                                if (textView4 != null) {
                                                    i = R.id.tvDeletePrompt;
                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDeletePrompt)) != null) {
                                                        i = R.id.tvDeletePromptContent1;
                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDeletePromptContent1)) != null) {
                                                            i = R.id.tvDeletePromptContent2;
                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDeletePromptContent2)) != null) {
                                                                i = R.id.tvDeletePromptContent3;
                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDeletePromptContent3)) != null) {
                                                                    i = R.id.tvDeletePromptContent4;
                                                                    TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDeletePromptContent4);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvDeleteTitle;
                                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDeleteTitle)) != null) {
                                                                            i = R.id.tvFans;
                                                                            TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFans);
                                                                            if (textView6 != null) {
                                                                                i = R.id.tvFriends;
                                                                                TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFriends);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.tvLevel;
                                                                                    TextView textView8 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLevel);
                                                                                    if (textView8 != null) {
                                                                                        return new k6((LinearLayout) viewInflate, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, textView2, textView3, stateButton, textView4, textView5, textView6, textView7, textView8);
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
