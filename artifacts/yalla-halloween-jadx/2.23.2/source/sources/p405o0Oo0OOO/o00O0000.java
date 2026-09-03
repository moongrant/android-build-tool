package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44265OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f44267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f44268OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateButton f44269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f44270OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44271OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f44272OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44273OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44274OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44275OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final View f44276OooOO0o;

    public o00O0000(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull StateButton stateButton3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull View view) {
        this.f44266OooO00o = constraintLayout;
        this.f44267OooO0O0 = stateButton;
        this.f44268OooO0OO = stateButton2;
        this.f44269OooO0Oo = stateButton3;
        this.f44271OooO0o0 = imageView;
        this.f44270OooO0o = imageView2;
        this.f44272OooO0oO = imageView3;
        this.f44273OooO0oo = imageView4;
        this.f44265OooO = linearLayout;
        this.f44274OooOO0 = textView;
        this.f44275OooOO0O = constraintLayout2;
        this.f44276OooOO0o = view;
    }

    @NonNull
    public static o00O0000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44266OooO00o;
    }

    @NonNull
    public static o00O0000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_login, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btFaceBook;
        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = o0OO00O.btLoginPhone;
            StateButton stateButton2 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
            if (stateButton2 != null) {
                i = o0OO00O.btYallaChat;
                StateButton stateButton3 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                if (stateButton3 != null) {
                    i = o0OO00O.ivClose;
                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = o0OO00O.ivLoginIcon;
                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = o0OO00O.ivLoginTwitter;
                            ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView3 != null) {
                                i = o0OO00O.ivLoginWechat;
                                ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView4 != null) {
                                    i = o0OO00O.llCenter;
                                    if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                        i = o0OO00O.llMore;
                                        if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                            i = o0OO00O.llOr;
                                            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                            if (linearLayout != null) {
                                                i = o0OO00O.tvLogo;
                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                    i = o0OO00O.tvTermsService;
                                                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView != null) {
                                                        i = o0OO00O.tvTips;
                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            i = o0OO00O.vSpacer;
                                                            View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
                                                            if (viewOooO00o != null) {
                                                                return new o00O0000(constraintLayout, stateButton, stateButton2, stateButton3, imageView, imageView2, imageView3, imageView4, linearLayout, textView, constraintLayout, viewOooO00o);
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
