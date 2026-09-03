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
public final class o000OO00 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f44221OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44222OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44223OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44224OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44225OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f44226OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44227OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f44228OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44229OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44230OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f44231OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44232OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44233OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44234OooOOO0;

    public o000OO00(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull StateButton stateButton, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f44222OooO00o = linearLayout;
        this.f44223OooO0O0 = constraintLayout;
        this.f44224OooO0OO = constraintLayout2;
        this.f44225OooO0Oo = constraintLayout3;
        this.f44227OooO0o0 = imageView;
        this.f44226OooO0o = imageView2;
        this.f44228OooO0oO = imageView3;
        this.f44229OooO0oo = imageView4;
        this.f44221OooO = imageView5;
        this.f44230OooOO0 = textView;
        this.f44231OooOO0O = stateButton;
        this.f44232OooOO0o = textView2;
        this.f44234OooOOO0 = textView3;
        this.f44233OooOOO = textView4;
    }

    @NonNull
    public static o000OO00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44222OooO00o;
    }

    @NonNull
    public static o000OO00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_delete_account_check, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flCheckFacebook;
        ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
        if (constraintLayout != null) {
            i = o0OO00O.flCheckInstagram;
            if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.flCheckTwitter;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
                if (constraintLayout2 != null) {
                    i = o0OO00O.flCheckWeChat;
                    if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.flCheckYallaChat;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (constraintLayout3 != null) {
                            i = o0OO00O.ivFacebook;
                            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                i = o0OO00O.ivInstagram;
                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    i = o0OO00O.ivSelectFacebook;
                                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView != null) {
                                        i = o0OO00O.ivSelectInstagram;
                                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                        if (imageView2 != null) {
                                            i = o0OO00O.ivSelectTwitter;
                                            ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                            if (imageView3 != null) {
                                                i = o0OO00O.ivSelectWeChat;
                                                ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                if (imageView4 != null) {
                                                    i = o0OO00O.ivSelectYallaChat;
                                                    ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (imageView5 != null) {
                                                        i = o0OO00O.ivTwitter;
                                                        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            i = o0OO00O.ivWeChat;
                                                            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                i = o0OO00O.ivYallaChat;
                                                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                    i = o0OO00O.tvCancel;
                                                                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView != null) {
                                                                        i = o0OO00O.tvDeleteAccountNext;
                                                                        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                                                        if (stateButton != null) {
                                                                            i = o0OO00O.tvFacebook;
                                                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                i = o0OO00O.tvFacebookName;
                                                                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                if (textView2 != null) {
                                                                                    i = o0OO00O.tvInstagram;
                                                                                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                        i = o0OO00O.tvInstagramName;
                                                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                            i = o0OO00O.tvTwitter;
                                                                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                i = o0OO00O.tvTwitterName;
                                                                                                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                                if (textView3 != null) {
                                                                                                    i = o0OO00O.tvWeChat;
                                                                                                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                        i = o0OO00O.tvWeChatName;
                                                                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                            i = o0OO00O.tvYallaChat;
                                                                                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                                i = o0OO00O.tvYallaChatName;
                                                                                                                TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                                                if (textView4 != null) {
                                                                                                                    return new o000OO00((LinearLayout) viewInflate, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, imageView3, imageView4, imageView5, textView, stateButton, textView2, textView3, textView4);
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
