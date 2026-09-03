package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59006OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59007OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59008OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59009OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59010OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59011OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59012OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59013OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f59014OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59015OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f59016OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59017OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f59018OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59019OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f59020OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f59021OooOOOo;

    public v(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull StateButton stateButton, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f59007OooO00o = linearLayout;
        this.f59008OooO0O0 = linearLayout2;
        this.f59009OooO0OO = linearLayout3;
        this.f59010OooO0Oo = linearLayout4;
        this.f59012OooO0o0 = linearLayout5;
        this.f59011OooO0o = linearLayout6;
        this.f59013OooO0oO = linearLayout7;
        this.f59014OooO0oo = textView;
        this.f59006OooO = textView2;
        this.f59015OooOO0 = textView3;
        this.f59016OooOO0O = stateButton;
        this.f59017OooOO0o = textView4;
        this.f59019OooOOO0 = textView5;
        this.f59018OooOOO = textView6;
        this.f59020OooOOOO = textView7;
        this.f59021OooOOOo = textView8;
    }

    @NonNull
    public static v inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59007OooO00o;
    }

    @NonNull
    public static v inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_delete_account_submit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.llBadge;
        LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
        if (linearLayout != null) {
            i = oO00O0oO.llCoin;
            LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
            if (linearLayout2 != null) {
                i = oO00O0oO.llCrystal;
                LinearLayout linearLayout3 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                if (linearLayout3 != null) {
                    i = oO00O0oO.llFans;
                    LinearLayout linearLayout4 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayout4 != null) {
                        i = oO00O0oO.llFriends;
                        LinearLayout linearLayout5 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayout5 != null) {
                            i = oO00O0oO.llLevel;
                            LinearLayout linearLayout6 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayout6 != null) {
                                i = oO00O0oO.tvBadge;
                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = oO00O0oO.tvCancel;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = oO00O0oO.tvCoin;
                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = oO00O0oO.tvConfirmDelete;
                                            StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                            if (stateButton != null) {
                                                i = oO00O0oO.tvCrystal;
                                                TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView4 != null) {
                                                    i = oO00O0oO.tvDeletePrompt;
                                                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                        i = oO00O0oO.tvDeletePromptContent1;
                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            i = oO00O0oO.tvDeletePromptContent2;
                                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                i = oO00O0oO.tvDeletePromptContent3;
                                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                    i = oO00O0oO.tvDeletePromptContent4;
                                                                    TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView5 != null) {
                                                                        i = oO00O0oO.tvDeleteTitle;
                                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                            i = oO00O0oO.tvFans;
                                                                            TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i = oO00O0oO.tvFriends;
                                                                                TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                if (textView7 != null) {
                                                                                    i = oO00O0oO.tvLevel;
                                                                                    TextView textView8 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                    if (textView8 != null) {
                                                                                        return new v((LinearLayout) viewInflate, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, textView2, textView3, stateButton, textView4, textView5, textView6, textView7, textView8);
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
