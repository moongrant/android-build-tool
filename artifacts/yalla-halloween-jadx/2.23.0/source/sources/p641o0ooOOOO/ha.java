package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.internal.FlowLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ha implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58075OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58076OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f58077OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FlowLayout f58078OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58079OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58080OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58081OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f58082OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f58083OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58084OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58085OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58086OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58087OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f58088OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58089OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f58090OooOOOo;

    public ha(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull FlowLayout flowLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull FixTextView fixTextView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f58076OooO00o = linearLayout;
        this.f58077OooO0O0 = editText;
        this.f58078OooO0OO = flowLayout;
        this.f58079OooO0Oo = imageView;
        this.f58081OooO0o0 = imageView2;
        this.f58080OooO0o = imageView3;
        this.f58082OooO0oO = view;
        this.f58083OooO0oo = netImageView;
        this.f58075OooO = textView;
        this.f58084OooOO0 = textView2;
        this.f58085OooOO0O = textView3;
        this.f58086OooOO0o = textView4;
        this.f58088OooOOO0 = fixTextView;
        this.f58087OooOOO = textView5;
        this.f58089OooOOOO = textView6;
        this.f58090OooOOOo = textView7;
    }

    @NonNull
    public static ha inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58076OooO00o;
    }

    @NonNull
    public static ha inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_user_info_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.cl_userinfo_edit_birthday;
        if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.cl_userinfo_edit_country;
            if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.cl_userinfo_edit_gender;
                if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.cl_userinfo_edit_sign;
                    if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.cl_userinfo_edit_tag;
                        if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.etName;
                            EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
                            if (editText != null) {
                                i = oO00O0oO.flTag;
                                FlowLayout flowLayout = (FlowLayout) OooOO0.OooO00o(i, viewInflate);
                                if (flowLayout != null) {
                                    i = oO00O0oO.ivClear;
                                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView != null) {
                                        i = oO00O0oO.ivHeaderErr;
                                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                        if (imageView2 != null) {
                                            i = oO00O0oO.ivHeaderIcon;
                                            ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                            if (imageView3 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.ivNameClick), viewInflate)) != null) {
                                                i = oO00O0oO.iv_tag;
                                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                    i = oO00O0oO.ll_edit;
                                                    if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                        i = oO00O0oO.nivHeader;
                                                        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                                        if (netImageView != null) {
                                                            i = oO00O0oO.tvBirthday;
                                                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView != null) {
                                                                i = oO00O0oO.tv_birthday_hint;
                                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                    i = oO00O0oO.tvCountry;
                                                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView2 != null) {
                                                                        i = oO00O0oO.tv_country_hint;
                                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                            i = oO00O0oO.tvGender;
                                                                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i = oO00O0oO.tv_gender_hint;
                                                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                    i = oO00O0oO.tvNum;
                                                                                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                    if (textView4 != null) {
                                                                                        i = oO00O0oO.tvSign;
                                                                                        FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, viewInflate);
                                                                                        if (fixTextView != null) {
                                                                                            i = oO00O0oO.tvSignHint;
                                                                                            TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                            if (textView5 != null) {
                                                                                                i = oO00O0oO.tv_tag;
                                                                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                    i = oO00O0oO.tvTagHint;
                                                                                                    TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                                    if (textView6 != null) {
                                                                                                        i = oO00O0oO.tvUserNameHint;
                                                                                                        TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                                        if (textView7 != null) {
                                                                                                            i = oO00O0oO.v;
                                                                                                            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                                return new ha((LinearLayout) viewInflate, editText, flowLayout, imageView, imageView2, imageView3, viewOooO00o, netImageView, textView, textView2, textView3, textView4, fixTextView, textView5, textView6, textView7);
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
