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
public final class m6 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49991OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49992OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f49993OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f49994OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateButton f49995OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49996OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49997OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49998OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49999OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50000OooOO0;

    public m6(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull StateButton stateButton3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.f49992OooO00o = constraintLayout;
        this.f49993OooO0O0 = stateButton;
        this.f49994OooO0OO = stateButton2;
        this.f49995OooO0Oo = stateButton3;
        this.f49997OooO0o0 = imageView;
        this.f49996OooO0o = imageView2;
        this.f49998OooO0oO = imageView3;
        this.f49999OooO0oo = imageView4;
        this.f49991OooO = textView;
        this.f50000OooOO0 = constraintLayout2;
    }

    @NonNull
    public static m6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49992OooO00o;
    }

    @NonNull
    public static m6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_login, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btFaceBook;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btFaceBook);
        if (stateButton != null) {
            i = R.id.btLoginPhone;
            StateButton stateButton2 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btLoginPhone);
            if (stateButton2 != null) {
                i = R.id.btYallaChat;
                StateButton stateButton3 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btYallaChat);
                if (stateButton3 != null) {
                    i = R.id.ivClose;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
                    if (imageView != null) {
                        i = R.id.ivLoginIcon;
                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLoginIcon);
                        if (imageView2 != null) {
                            i = R.id.ivLoginTwitter;
                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLoginTwitter);
                            if (imageView3 != null) {
                                i = R.id.ivLoginWechat;
                                ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLoginWechat);
                                if (imageView4 != null) {
                                    i = R.id.llCenter;
                                    if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llCenter)) != null) {
                                        i = R.id.llMore;
                                        if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llMore)) != null) {
                                            i = R.id.llOr;
                                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llOr)) != null) {
                                                i = R.id.tvLogo;
                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLogo)) != null) {
                                                    i = R.id.tvTermsService;
                                                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTermsService);
                                                    if (textView != null) {
                                                        i = R.id.tvTips;
                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTips)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            return new m6(constraintLayout, stateButton, stateButton2, stateButton3, imageView, imageView2, imageView3, imageView4, textView, constraintLayout);
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
