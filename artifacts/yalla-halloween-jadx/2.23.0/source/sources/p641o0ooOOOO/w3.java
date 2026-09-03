package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.view.UserTagView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59127OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59128OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f59130OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f59132OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59133OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f59134OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f59135OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59136OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f59137OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final StateButton f59138OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final StateButton f59139OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final StateButton f59140OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59141OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final NetImageView f59142OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final UserTagView f59143OooOOo0;

    public w3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull FragmentContainerView fragmentContainerView, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull StateButton stateButton3, @NonNull StateButton stateButton4, @NonNull SVGAView sVGAView, @NonNull NetImageView netImageView, @NonNull UserTagView userTagView) {
        this.f59128OooO00o = constraintLayout;
        this.f59129OooO0O0 = imageView;
        this.f59130OooO0OO = imageView2;
        this.f59131OooO0Oo = constraintLayout2;
        this.f59133OooO0o0 = constraintLayout3;
        this.f59132OooO0o = fragmentContainerView;
        this.f59134OooO0oO = view;
        this.f59135OooO0oo = view2;
        this.f59127OooO = textView;
        this.f59136OooOO0 = textView2;
        this.f59137OooOO0O = stateButton;
        this.f59138OooOO0o = stateButton2;
        this.f59140OooOOO0 = stateButton3;
        this.f59139OooOOO = stateButton4;
        this.f59141OooOOOO = sVGAView;
        this.f59142OooOOOo = netImageView;
        this.f59143OooOOo0 = userTagView;
    }

    @NonNull
    public static w3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59128OooO00o;
    }

    @NonNull
    public static w3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_activity_top, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bgLeft;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.bgRight;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = oO00O0oO.clBottom;
                ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                if (constraintLayout != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                    i = oO00O0oO.flCenter;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) OooOO0.OooO00o(i, viewInflate);
                    if (fragmentContainerView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.lineBg), viewInflate)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.shape), viewInflate)) != null) {
                        i = oO00O0oO.tvCoin;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            i = oO00O0oO.tvRanking;
                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView2 != null) {
                                i = oO00O0oO.tvReceiveGift;
                                StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                if (stateButton != null) {
                                    i = oO00O0oO.tvSentGift;
                                    StateButton stateButton2 = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                    if (stateButton2 != null) {
                                        i = oO00O0oO.tvTopRoom;
                                        StateButton stateButton3 = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                        if (stateButton3 != null) {
                                            i = oO00O0oO.tvYallaBillion;
                                            StateButton stateButton4 = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                            if (stateButton4 != null) {
                                                i = oO00O0oO.userHeadFrame;
                                                SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                                if (sVGAView != null) {
                                                    i = oO00O0oO.userPhoto;
                                                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                                    if (netImageView != null) {
                                                        i = oO00O0oO.userTagView;
                                                        UserTagView userTagView = (UserTagView) OooOO0.OooO00o(i, viewInflate);
                                                        if (userTagView != null) {
                                                            return new w3(constraintLayout2, imageView, imageView2, constraintLayout, constraintLayout2, fragmentContainerView, viewOooO00o, viewOooO00o2, textView, textView2, stateButton, stateButton2, stateButton3, stateButton4, sVGAView, netImageView, userTagView);
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
