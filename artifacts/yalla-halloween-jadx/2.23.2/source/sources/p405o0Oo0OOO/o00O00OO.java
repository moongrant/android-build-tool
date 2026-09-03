package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.VerifyCodeView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44285OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44286OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44287OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44288OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44289OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44290OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44291OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44292OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44293OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44294OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f44295OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44296OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44297OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44298OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44299OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f44300OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f44301OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f44302OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f44303OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public final VerifyCodeView f44304OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f44305OooOo00;

    public o00O00OO(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull VerifyCodeView verifyCodeView) {
        this.f44286OooO00o = linearLayout;
        this.f44287OooO0O0 = imageView;
        this.f44288OooO0OO = imageView2;
        this.f44289OooO0Oo = imageView3;
        this.f44291OooO0o0 = linearLayout2;
        this.f44290OooO0o = linearLayout3;
        this.f44292OooO0oO = linearLayout4;
        this.f44293OooO0oo = linearLayout5;
        this.f44285OooO = textView;
        this.f44294OooOO0 = textView2;
        this.f44295OooOO0O = textView3;
        this.f44296OooOO0o = textView4;
        this.f44298OooOOO0 = textView5;
        this.f44297OooOOO = textView6;
        this.f44299OooOOOO = textView7;
        this.f44300OooOOOo = textView8;
        this.f44302OooOOo0 = textView9;
        this.f44301OooOOo = textView10;
        this.f44303OooOOoo = textView11;
        this.f44305OooOo00 = textView12;
        this.f44304OooOo0 = verifyCodeView;
    }

    @NonNull
    public static o00O00OO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44286OooO00o;
    }

    @NonNull
    public static o00O00OO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_verification_code, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivOtherLogin;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.ivSms;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = o0OO00O.ivWhatsApp;
                ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = o0OO00O.llSms;
                    LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayout2 != null) {
                        i = o0OO00O.llSmsOrWhatApp;
                        LinearLayout linearLayout3 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayout3 != null) {
                            i = o0OO00O.llTurnLoginProtection;
                            LinearLayout linearLayout4 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayout4 != null) {
                                i = o0OO00O.tv_again;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = o0OO00O.tvBottomText;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = o0OO00O.tv_feedback;
                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = o0OO00O.tvNotReceive;
                                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView4 != null) {
                                                i = o0OO00O.tvPhoneError;
                                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView5 != null) {
                                                    i = o0OO00O.tv_phone_number;
                                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView6 != null) {
                                                        i = o0OO00O.tvSms;
                                                        TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView7 != null) {
                                                            i = o0OO00O.tvSmsTime;
                                                            TextView textView8 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView8 != null) {
                                                                i = o0OO00O.tv_tips;
                                                                TextView textView9 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView9 != null) {
                                                                    i = o0OO00O.tvVerification;
                                                                    TextView textView10 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView10 != null) {
                                                                        i = o0OO00O.tvWhatsApp;
                                                                        TextView textView11 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                        if (textView11 != null) {
                                                                            i = o0OO00O.tvWhatsAppTime;
                                                                            TextView textView12 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (textView12 != null) {
                                                                                i = o0OO00O.verificationCodeView;
                                                                                VerifyCodeView verifyCodeView = (VerifyCodeView) OooO0O0.OooO00o(i, viewInflate);
                                                                                if (verifyCodeView != null) {
                                                                                    return new o00O00OO(linearLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, verifyCodeView);
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
