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
public final class u implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f58905OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58906OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58907OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58908OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58909OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58910OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58911OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f58912OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58913OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58914OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f58915OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58916OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58917OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58918OooOOO0;

    public u(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull StateButton stateButton, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f58906OooO00o = linearLayout;
        this.f58907OooO0O0 = constraintLayout;
        this.f58908OooO0OO = constraintLayout2;
        this.f58909OooO0Oo = constraintLayout3;
        this.f58911OooO0o0 = imageView;
        this.f58910OooO0o = imageView2;
        this.f58912OooO0oO = imageView3;
        this.f58913OooO0oo = imageView4;
        this.f58905OooO = imageView5;
        this.f58914OooOO0 = textView;
        this.f58915OooOO0O = stateButton;
        this.f58916OooOO0o = textView2;
        this.f58918OooOOO0 = textView3;
        this.f58917OooOOO = textView4;
    }

    @NonNull
    public static u inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58906OooO00o;
    }

    @NonNull
    public static u inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_delete_account_check, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flCheckFacebook;
        ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
        if (constraintLayout != null) {
            i = oO00O0oO.flCheckInstagram;
            if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.flCheckTwitter;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                if (constraintLayout2 != null) {
                    i = oO00O0oO.flCheckWeChat;
                    if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.flCheckYallaChat;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                        if (constraintLayout3 != null) {
                            i = oO00O0oO.ivFacebook;
                            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                i = oO00O0oO.ivInstagram;
                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    i = oO00O0oO.ivSelectFacebook;
                                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView != null) {
                                        i = oO00O0oO.ivSelectInstagram;
                                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                        if (imageView2 != null) {
                                            i = oO00O0oO.ivSelectTwitter;
                                            ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                            if (imageView3 != null) {
                                                i = oO00O0oO.ivSelectWeChat;
                                                ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                if (imageView4 != null) {
                                                    i = oO00O0oO.ivSelectYallaChat;
                                                    ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                    if (imageView5 != null) {
                                                        i = oO00O0oO.ivTwitter;
                                                        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            i = oO00O0oO.ivWeChat;
                                                            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                i = oO00O0oO.ivYallaChat;
                                                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                    i = oO00O0oO.tvCancel;
                                                                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView != null) {
                                                                        i = oO00O0oO.tvDeleteAccountNext;
                                                                        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                                                        if (stateButton != null) {
                                                                            i = oO00O0oO.tvFacebook;
                                                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                i = oO00O0oO.tvFacebookName;
                                                                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                if (textView2 != null) {
                                                                                    i = oO00O0oO.tvInstagram;
                                                                                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                        i = oO00O0oO.tvInstagramName;
                                                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                            i = oO00O0oO.tvTwitter;
                                                                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                i = oO00O0oO.tvTwitterName;
                                                                                                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                                if (textView3 != null) {
                                                                                                    i = oO00O0oO.tvWeChat;
                                                                                                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                        i = oO00O0oO.tvWeChatName;
                                                                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                            i = oO00O0oO.tvYallaChat;
                                                                                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                                i = oO00O0oO.tvYallaChatName;
                                                                                                                TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                                                if (textView4 != null) {
                                                                                                                    return new u((LinearLayout) viewInflate, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, imageView3, imageView4, imageView5, textView, stateButton, textView2, textView3, textView4);
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
