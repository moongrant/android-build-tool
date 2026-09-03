package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59218OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f59220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f59221OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateButton f59222OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f59223OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f59224OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f59225OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59226OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59227OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59228OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final View f59229OooOO0o;

    public x(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull StateButton stateButton3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull View view) {
        this.f59219OooO00o = constraintLayout;
        this.f59220OooO0O0 = stateButton;
        this.f59221OooO0OO = stateButton2;
        this.f59222OooO0Oo = stateButton3;
        this.f59224OooO0o0 = imageView;
        this.f59223OooO0o = imageView2;
        this.f59225OooO0oO = imageView3;
        this.f59226OooO0oo = imageView4;
        this.f59218OooO = linearLayout;
        this.f59227OooOO0 = textView;
        this.f59228OooOO0O = constraintLayout2;
        this.f59229OooOO0o = view;
    }

    @NonNull
    public static x inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59219OooO00o;
    }

    @NonNull
    public static x inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_login, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btFaceBook;
        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = oO00O0oO.btLoginPhone;
            StateButton stateButton2 = (StateButton) OooOO0.OooO00o(i, viewInflate);
            if (stateButton2 != null) {
                i = oO00O0oO.btYallaChat;
                StateButton stateButton3 = (StateButton) OooOO0.OooO00o(i, viewInflate);
                if (stateButton3 != null) {
                    i = oO00O0oO.ivClose;
                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = oO00O0oO.ivLoginIcon;
                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = oO00O0oO.ivLoginTwitter;
                            ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView3 != null) {
                                i = oO00O0oO.ivLoginWechat;
                                ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView4 != null) {
                                    i = oO00O0oO.llCenter;
                                    if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                        i = oO00O0oO.llMore;
                                        if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                            i = oO00O0oO.llOr;
                                            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                            if (linearLayout != null) {
                                                i = oO00O0oO.tvLogo;
                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                    i = oO00O0oO.tvTermsService;
                                                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView != null) {
                                                        i = oO00O0oO.tvTips;
                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            i = oO00O0oO.vSpacer;
                                                            View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
                                                            if (viewOooO00o != null) {
                                                                return new x(constraintLayout, stateButton, stateButton2, stateButton3, imageView, imageView2, imageView3, imageView4, linearLayout, textView, constraintLayout, viewOooO00o);
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
