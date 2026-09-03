package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class j6 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f49707OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49708OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49709OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49710OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49711OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49712OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49713OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49714OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49715OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f49716OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f49717OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final StateButton f49718OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49719OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49720OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49721OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49722OooOOOo;

    public j6(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull StateButton stateButton, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f49708OooO00o = linearLayout;
        this.f49709OooO0O0 = constraintLayout;
        this.f49710OooO0OO = constraintLayout2;
        this.f49711OooO0Oo = constraintLayout3;
        this.f49713OooO0o0 = constraintLayout4;
        this.f49712OooO0o = imageView;
        this.f49714OooO0oO = imageView2;
        this.f49715OooO0oo = imageView3;
        this.f49707OooO = imageView4;
        this.f49716OooOO0 = imageView5;
        this.f49717OooOO0O = textView;
        this.f49718OooOO0o = stateButton;
        this.f49720OooOOO0 = textView2;
        this.f49719OooOOO = textView3;
        this.f49721OooOOOO = textView4;
        this.f49722OooOOOo = textView5;
    }

    @NonNull
    public static j6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49708OooO00o;
    }

    @NonNull
    public static j6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_delete_account_check, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flCheckFacebook;
        ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.flCheckFacebook);
        if (constraintLayout != null) {
            i = R.id.flCheckInstagram;
            if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.flCheckInstagram)) != null) {
                i = R.id.flCheckTwitter;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.flCheckTwitter);
                if (constraintLayout2 != null) {
                    i = R.id.flCheckWeChat;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.flCheckWeChat);
                    if (constraintLayout3 != null) {
                        i = R.id.flCheckYallaChat;
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.flCheckYallaChat);
                        if (constraintLayout4 != null) {
                            i = R.id.ivFacebook;
                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivFacebook)) != null) {
                                i = R.id.ivInstagram;
                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivInstagram)) != null) {
                                    i = R.id.ivSelectFacebook;
                                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSelectFacebook);
                                    if (imageView != null) {
                                        i = R.id.ivSelectInstagram;
                                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSelectInstagram);
                                        if (imageView2 != null) {
                                            i = R.id.ivSelectTwitter;
                                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSelectTwitter);
                                            if (imageView3 != null) {
                                                i = R.id.ivSelectWeChat;
                                                ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSelectWeChat);
                                                if (imageView4 != null) {
                                                    i = R.id.ivSelectYallaChat;
                                                    ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSelectYallaChat);
                                                    if (imageView5 != null) {
                                                        i = R.id.ivTwitter;
                                                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTwitter)) != null) {
                                                            i = R.id.ivWeChat;
                                                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivWeChat)) != null) {
                                                                i = R.id.ivYallaChat;
                                                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivYallaChat)) != null) {
                                                                    i = R.id.tvCancel;
                                                                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCancel);
                                                                    if (textView != null) {
                                                                        i = R.id.tvDeleteAccountNext;
                                                                        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.tvDeleteAccountNext);
                                                                        if (stateButton != null) {
                                                                            i = R.id.tvFacebook;
                                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFacebook)) != null) {
                                                                                i = R.id.tvFacebookName;
                                                                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFacebookName);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.tvInstagram;
                                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvInstagram)) != null) {
                                                                                        i = R.id.tvInstagramName;
                                                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvInstagramName)) != null) {
                                                                                            i = R.id.tvTwitter;
                                                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTwitter)) != null) {
                                                                                                i = R.id.tvTwitterName;
                                                                                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTwitterName);
                                                                                                if (textView3 != null) {
                                                                                                    i = R.id.tvWeChat;
                                                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvWeChat)) != null) {
                                                                                                        i = R.id.tvWeChatName;
                                                                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvWeChatName);
                                                                                                        if (textView4 != null) {
                                                                                                            i = R.id.tvYallaChat;
                                                                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvYallaChat)) != null) {
                                                                                                                i = R.id.tvYallaChatName;
                                                                                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvYallaChatName);
                                                                                                                if (textView5 != null) {
                                                                                                                    return new j6((LinearLayout) viewInflate, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, imageView, imageView2, imageView3, imageView4, imageView5, textView, stateButton, textView2, textView3, textView4, textView5);
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
