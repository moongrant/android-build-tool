package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class na implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50083OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50084OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50085OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50086OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50087OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f50088OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50089OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f50090OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f50091OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50092OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f50093OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final StateButton f50094OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final StateButton f50095OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final StateButton f50096OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final SVGAView f50097OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final NetImageView f50098OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final UserTagView f50099OooOOo0;

    public na(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull FragmentContainerView fragmentContainerView, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull StateButton stateButton3, @NonNull StateButton stateButton4, @NonNull SVGAView sVGAView, @NonNull NetImageView netImageView, @NonNull UserTagView userTagView) {
        this.f50084OooO00o = constraintLayout;
        this.f50085OooO0O0 = imageView;
        this.f50086OooO0OO = imageView2;
        this.f50087OooO0Oo = constraintLayout2;
        this.f50089OooO0o0 = constraintLayout3;
        this.f50088OooO0o = fragmentContainerView;
        this.f50090OooO0oO = view;
        this.f50091OooO0oo = view2;
        this.f50083OooO = textView;
        this.f50092OooOO0 = textView2;
        this.f50093OooOO0O = stateButton;
        this.f50094OooOO0o = stateButton2;
        this.f50096OooOOO0 = stateButton3;
        this.f50095OooOOO = stateButton4;
        this.f50097OooOOOO = sVGAView;
        this.f50098OooOOOo = netImageView;
        this.f50099OooOOo0 = userTagView;
    }

    @NonNull
    public static na inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50084OooO00o;
    }

    @NonNull
    public static na inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_top, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bgLeft;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.bgLeft);
        if (imageView != null) {
            i = R.id.bgRight;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.bgRight);
            if (imageView2 != null) {
                i = R.id.clBottom;
                ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.clBottom);
                if (constraintLayout != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                    i = R.id.flCenter;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) o00Oo0.OooO00o(viewInflate, R.id.flCenter);
                    if (fragmentContainerView != null) {
                        i = R.id.lineBg;
                        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.lineBg);
                        if (viewOooO00o != null) {
                            i = R.id.shape;
                            View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.shape);
                            if (viewOooO00o2 != null) {
                                i = R.id.tvCoin;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCoin);
                                if (textView != null) {
                                    i = R.id.tvRanking;
                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvRanking);
                                    if (textView2 != null) {
                                        i = R.id.tvReceiveGift;
                                        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.tvReceiveGift);
                                        if (stateButton != null) {
                                            i = R.id.tvSentGift;
                                            StateButton stateButton2 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.tvSentGift);
                                            if (stateButton2 != null) {
                                                i = R.id.tvTopRoom;
                                                StateButton stateButton3 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.tvTopRoom);
                                                if (stateButton3 != null) {
                                                    i = R.id.tvYallaBillion;
                                                    StateButton stateButton4 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.tvYallaBillion);
                                                    if (stateButton4 != null) {
                                                        i = R.id.userHeadFrame;
                                                        SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.userHeadFrame);
                                                        if (sVGAView != null) {
                                                            i = R.id.userPhoto;
                                                            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.userPhoto);
                                                            if (netImageView != null) {
                                                                i = R.id.userTagView;
                                                                UserTagView userTagView = (UserTagView) o00Oo0.OooO00o(viewInflate, R.id.userTagView);
                                                                if (userTagView != null) {
                                                                    return new na(constraintLayout2, imageView, imageView2, constraintLayout, constraintLayout2, fragmentContainerView, viewOooO00o, viewOooO00o2, textView, textView2, stateButton, stateButton2, stateButton3, stateButton4, sVGAView, netImageView, userTagView);
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
