package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class f6 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49314OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49315OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49316OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49317OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49319OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49320OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49321OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49322OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49323OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49324OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49325OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49326OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49327OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49328OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49329OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49330OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f49331OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f49332OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f49333OooOo00;

    public f6(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f49315OooO00o = linearLayout;
        this.f49316OooO0O0 = imageView;
        this.f49317OooO0OO = imageView2;
        this.f49318OooO0Oo = imageView3;
        this.f49320OooO0o0 = imageView4;
        this.f49319OooO0o = imageView5;
        this.f49321OooO0oO = imageView6;
        this.f49322OooO0oo = linearLayout2;
        this.f49314OooO = linearLayout3;
        this.f49323OooOO0 = linearLayout4;
        this.f49324OooOO0O = linearLayout5;
        this.f49325OooOO0o = linearLayout6;
        this.f49327OooOOO0 = linearLayout7;
        this.f49326OooOOO = linearLayout8;
        this.f49328OooOOOO = textView;
        this.f49329OooOOOo = textView2;
        this.f49331OooOOo0 = textView3;
        this.f49330OooOOo = textView4;
        this.f49332OooOOoo = textView5;
        this.f49333OooOo00 = textView6;
    }

    @NonNull
    public static f6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49315OooO00o;
    }

    @NonNull
    public static f6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_account_bind, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivFacebook;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivFacebook);
        if (imageView != null) {
            i = R.id.ivInstagram;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivInstagram);
            if (imageView2 != null) {
                i = R.id.ivPhone;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPhone);
                if (imageView3 != null) {
                    i = R.id.ivTwitter;
                    ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTwitter);
                    if (imageView4 != null) {
                        i = R.id.ivWeChat;
                        ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivWeChat);
                        if (imageView5 != null) {
                            i = R.id.ivYallaChat;
                            ImageView imageView6 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivYallaChat);
                            if (imageView6 != null) {
                                i = R.id.llFacebook;
                                LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llFacebook);
                                if (linearLayout != null) {
                                    i = R.id.llInstagram;
                                    LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llInstagram);
                                    if (linearLayout2 != null) {
                                        i = R.id.llPhone;
                                        LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llPhone);
                                        if (linearLayout3 != null) {
                                            i = R.id.llTwitter;
                                            LinearLayout linearLayout4 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llTwitter);
                                            if (linearLayout4 != null) {
                                                i = R.id.llUnprotected;
                                                LinearLayout linearLayout5 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llUnprotected);
                                                if (linearLayout5 != null) {
                                                    i = R.id.llWeChat;
                                                    LinearLayout linearLayout6 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llWeChat);
                                                    if (linearLayout6 != null) {
                                                        i = R.id.llYallaChat;
                                                        LinearLayout linearLayout7 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llYallaChat);
                                                        if (linearLayout7 != null) {
                                                            i = R.id.tvFacebookNum;
                                                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFacebookNum);
                                                            if (textView != null) {
                                                                i = R.id.tvInstagramNum;
                                                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvInstagramNum);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvPhoneNum;
                                                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPhoneNum);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvTwitterNum;
                                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTwitterNum);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvWeChatNum;
                                                                            TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvWeChatNum);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvYallaChat;
                                                                                TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvYallaChat);
                                                                                if (textView6 != null) {
                                                                                    return new f6((LinearLayout) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, textView, textView2, textView3, textView4, textView5, textView6);
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
