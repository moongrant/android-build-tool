package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.VerifyCodeView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f57869OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f57871OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57872OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57873OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57874OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57875OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57876OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57877OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f57878OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f57879OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57880OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f57881OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f57882OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f57883OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f57884OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f57885OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f57886OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f57887OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public final VerifyCodeView f57888OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f57889OooOo00;

    public f0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull VerifyCodeView verifyCodeView) {
        this.f57870OooO00o = linearLayout;
        this.f57871OooO0O0 = imageView;
        this.f57872OooO0OO = imageView2;
        this.f57873OooO0Oo = imageView3;
        this.f57875OooO0o0 = linearLayout2;
        this.f57874OooO0o = linearLayout3;
        this.f57876OooO0oO = linearLayout4;
        this.f57877OooO0oo = linearLayout5;
        this.f57869OooO = textView;
        this.f57878OooOO0 = textView2;
        this.f57879OooOO0O = textView3;
        this.f57880OooOO0o = textView4;
        this.f57882OooOOO0 = textView5;
        this.f57881OooOOO = textView6;
        this.f57883OooOOOO = textView7;
        this.f57884OooOOOo = textView8;
        this.f57886OooOOo0 = textView9;
        this.f57885OooOOo = textView10;
        this.f57887OooOOoo = textView11;
        this.f57889OooOo00 = textView12;
        this.f57888OooOo0 = verifyCodeView;
    }

    @NonNull
    public static f0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57870OooO00o;
    }

    @NonNull
    public static f0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_verification_code, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivOtherLogin;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.ivSms;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = oO00O0oO.ivWhatsApp;
                ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = oO00O0oO.llSms;
                    LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayout2 != null) {
                        i = oO00O0oO.llSmsOrWhatApp;
                        LinearLayout linearLayout3 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayout3 != null) {
                            i = oO00O0oO.llTurnLoginProtection;
                            LinearLayout linearLayout4 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayout4 != null) {
                                i = oO00O0oO.tv_again;
                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = oO00O0oO.tvBottomText;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = oO00O0oO.tv_feedback;
                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = oO00O0oO.tvNotReceive;
                                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView4 != null) {
                                                i = oO00O0oO.tvPhoneError;
                                                TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView5 != null) {
                                                    i = oO00O0oO.tv_phone_number;
                                                    TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView6 != null) {
                                                        i = oO00O0oO.tvSms;
                                                        TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView7 != null) {
                                                            i = oO00O0oO.tvSmsTime;
                                                            TextView textView8 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView8 != null) {
                                                                i = oO00O0oO.tv_tips;
                                                                TextView textView9 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (textView9 != null) {
                                                                    i = oO00O0oO.tvVerification;
                                                                    TextView textView10 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView10 != null) {
                                                                        i = oO00O0oO.tvWhatsApp;
                                                                        TextView textView11 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                        if (textView11 != null) {
                                                                            i = oO00O0oO.tvWhatsAppTime;
                                                                            TextView textView12 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                            if (textView12 != null) {
                                                                                i = oO00O0oO.verificationCodeView;
                                                                                VerifyCodeView verifyCodeView = (VerifyCodeView) OooOO0.OooO00o(i, viewInflate);
                                                                                if (verifyCodeView != null) {
                                                                                    return new f0(linearLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, verifyCodeView);
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
