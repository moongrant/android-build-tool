package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ga implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57988OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57989OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f57990OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ca f57991OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final bb f57992OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57993OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f57994OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57995OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57996OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57997OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final Toolbar f57998OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57999OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58000OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58001OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58002OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58003OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f58004OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final View f58005OooOOo0;

    public ga(@NonNull ConstraintLayout constraintLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ca caVar, @NonNull bb bbVar, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull Toolbar toolbar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout6, @NonNull View view, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f57989OooO00o = constraintLayout;
        this.f57990OooO0O0 = coordinatorLayout;
        this.f57991OooO0OO = caVar;
        this.f57992OooO0Oo = bbVar;
        this.f57994OooO0o0 = imageView;
        this.f57993OooO0o = linearLayout;
        this.f57995OooO0oO = linearLayout2;
        this.f57996OooO0oo = linearLayout3;
        this.f57988OooO = linearLayout4;
        this.f57997OooOO0 = linearLayout5;
        this.f57998OooOO0O = toolbar;
        this.f57999OooOO0o = textView;
        this.f58001OooOOO0 = textView2;
        this.f58000OooOOO = textView3;
        this.f58002OooOOOO = textView4;
        this.f58003OooOOOo = linearLayout6;
        this.f58005OooOOo0 = view;
        this.f58004OooOOo = viewPagerFixed;
    }

    @NonNull
    public static ga inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57989OooO00o;
    }

    @NonNull
    public static ga inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_user_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.clUserInfo;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) OooOO0.OooO00o(i, viewInflate);
        if (coordinatorLayout != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.delete_account), viewInflate)) != null) {
            ca caVarOooO00o = ca.OooO00o(viewOooO00o);
            i = oO00O0oO.head;
            View viewOooO00o3 = OooOO0.OooO00o(i, viewInflate);
            if (viewOooO00o3 != null) {
                bb bbVarOooO00o = bb.OooO00o(viewOooO00o3);
                i = oO00O0oO.iv_more;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.ll_bottom;
                    LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        i = oO00O0oO.ll_follow;
                        LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayout2 != null) {
                            i = oO00O0oO.ll_friend;
                            LinearLayout linearLayout3 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayout3 != null) {
                                i = oO00O0oO.ll_inroom;
                                LinearLayout linearLayout4 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                if (linearLayout4 != null) {
                                    i = oO00O0oO.ll_message;
                                    LinearLayout linearLayout5 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                    if (linearLayout5 != null) {
                                        i = oO00O0oO.toolbar;
                                        Toolbar toolbar = (Toolbar) OooOO0.OooO00o(i, viewInflate);
                                        if (toolbar != null) {
                                            i = oO00O0oO.tv_follow;
                                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = oO00O0oO.tv_friend;
                                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = oO00O0oO.tv_inroom;
                                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = oO00O0oO.tv_title;
                                                        TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            i = oO00O0oO.user_edit_container;
                                                            LinearLayout linearLayout6 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                                            if (linearLayout6 != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.v_line), viewInflate)) != null) {
                                                                i = oO00O0oO.vp_userinfo;
                                                                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooOO0.OooO00o(i, viewInflate);
                                                                if (viewPagerFixed != null) {
                                                                    return new ga((ConstraintLayout) viewInflate, coordinatorLayout, caVarOooO00o, bbVarOooO00o, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, toolbar, textView, textView2, textView3, textView4, linearLayout6, viewOooO00o2, viewPagerFixed);
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
