package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.VerifyCodeView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class v6 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50761OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50764OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50768OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50769OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50770OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f50771OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50772OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50773OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50774OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50775OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f50776OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f50777OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f50778OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f50779OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public final VerifyCodeView f50780OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f50781OooOo00;

    public v6(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull VerifyCodeView verifyCodeView) {
        this.f50762OooO00o = linearLayout;
        this.f50763OooO0O0 = imageView;
        this.f50764OooO0OO = imageView2;
        this.f50765OooO0Oo = imageView3;
        this.f50767OooO0o0 = linearLayout2;
        this.f50766OooO0o = linearLayout3;
        this.f50768OooO0oO = linearLayout4;
        this.f50769OooO0oo = linearLayout5;
        this.f50761OooO = textView;
        this.f50770OooOO0 = textView2;
        this.f50771OooOO0O = textView3;
        this.f50772OooOO0o = textView4;
        this.f50774OooOOO0 = textView5;
        this.f50773OooOOO = textView6;
        this.f50775OooOOOO = textView7;
        this.f50776OooOOOo = textView8;
        this.f50778OooOOo0 = textView9;
        this.f50777OooOOo = textView10;
        this.f50779OooOOoo = textView11;
        this.f50781OooOo00 = textView12;
        this.f50780OooOo0 = verifyCodeView;
    }

    @NonNull
    public static v6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50762OooO00o;
    }

    @NonNull
    public static v6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_verification_code, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivOtherLogin;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivOtherLogin);
        if (imageView != null) {
            i = R.id.ivSms;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSms);
            if (imageView2 != null) {
                i = R.id.ivWhatsApp;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivWhatsApp);
                if (imageView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = R.id.llSms;
                    LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llSms);
                    if (linearLayout2 != null) {
                        i = R.id.llSmsOrWhatApp;
                        LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llSmsOrWhatApp);
                        if (linearLayout3 != null) {
                            i = R.id.llTurnLoginProtection;
                            LinearLayout linearLayout4 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llTurnLoginProtection);
                            if (linearLayout4 != null) {
                                i = R.id.tv_again;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_again);
                                if (textView != null) {
                                    i = R.id.tvBottomText;
                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBottomText);
                                    if (textView2 != null) {
                                        i = R.id.tv_feedback;
                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_feedback);
                                        if (textView3 != null) {
                                            i = R.id.tvNotReceive;
                                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNotReceive);
                                            if (textView4 != null) {
                                                i = R.id.tvPhoneError;
                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPhoneError);
                                                if (textView5 != null) {
                                                    i = R.id.tv_phone_number;
                                                    TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_phone_number);
                                                    if (textView6 != null) {
                                                        i = R.id.tvSms;
                                                        TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSms);
                                                        if (textView7 != null) {
                                                            i = R.id.tvSmsTime;
                                                            TextView textView8 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSmsTime);
                                                            if (textView8 != null) {
                                                                i = R.id.tv_tips;
                                                                TextView textView9 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_tips);
                                                                if (textView9 != null) {
                                                                    i = R.id.tvVerification;
                                                                    TextView textView10 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvVerification);
                                                                    if (textView10 != null) {
                                                                        i = R.id.tvWhatsApp;
                                                                        TextView textView11 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvWhatsApp);
                                                                        if (textView11 != null) {
                                                                            i = R.id.tvWhatsAppTime;
                                                                            TextView textView12 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvWhatsAppTime);
                                                                            if (textView12 != null) {
                                                                                i = R.id.verificationCodeView;
                                                                                VerifyCodeView verifyCodeView = (VerifyCodeView) o00Oo0.OooO00o(viewInflate, R.id.verificationCodeView);
                                                                                if (verifyCodeView != null) {
                                                                                    return new v6(linearLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, verifyCodeView);
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
