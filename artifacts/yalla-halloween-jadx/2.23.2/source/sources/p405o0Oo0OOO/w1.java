package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45655OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45656OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f45657OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FlowLayout f45658OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45660OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f45661OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f45662OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f45663OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45664OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f45665OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45666OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f45667OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f45668OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f45669OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f45670OooOOOo;

    public w1(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull FlowLayout flowLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull FixTextView fixTextView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f45656OooO00o = linearLayout;
        this.f45657OooO0O0 = editText;
        this.f45658OooO0OO = flowLayout;
        this.f45659OooO0Oo = imageView;
        this.f45661OooO0o0 = imageView2;
        this.f45660OooO0o = imageView3;
        this.f45662OooO0oO = view;
        this.f45663OooO0oo = netImageView;
        this.f45655OooO = textView;
        this.f45664OooOO0 = textView2;
        this.f45665OooOO0O = textView3;
        this.f45666OooOO0o = textView4;
        this.f45668OooOOO0 = fixTextView;
        this.f45667OooOOO = textView5;
        this.f45669OooOOOO = textView6;
        this.f45670OooOOOo = textView7;
    }

    @NonNull
    public static w1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45656OooO00o;
    }

    @NonNull
    public static w1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_user_info_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.cl_userinfo_edit_birthday;
        if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.cl_userinfo_edit_country;
            if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.cl_userinfo_edit_gender;
                if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.cl_userinfo_edit_sign;
                    if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.cl_userinfo_edit_tag;
                        if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.etName;
                            EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
                            if (editText != null) {
                                i = o0OO00O.flTag;
                                FlowLayout flowLayout = (FlowLayout) OooO0O0.OooO00o(i, viewInflate);
                                if (flowLayout != null) {
                                    i = o0OO00O.ivClear;
                                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView != null) {
                                        i = o0OO00O.ivHeaderErr;
                                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                        if (imageView2 != null) {
                                            i = o0OO00O.ivHeaderIcon;
                                            ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                            if (imageView3 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.ivNameClick), viewInflate)) != null) {
                                                i = o0OO00O.iv_tag;
                                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                    i = o0OO00O.ll_edit;
                                                    if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                        i = o0OO00O.nivHeader;
                                                        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (netImageView != null) {
                                                            i = o0OO00O.tvBirthday;
                                                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView != null) {
                                                                i = o0OO00O.tv_birthday_hint;
                                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                    i = o0OO00O.tvCountry;
                                                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView2 != null) {
                                                                        i = o0OO00O.tv_country_hint;
                                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                            i = o0OO00O.tvGender;
                                                                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i = o0OO00O.tv_gender_hint;
                                                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                    i = o0OO00O.tvNum;
                                                                                    TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                    if (textView4 != null) {
                                                                                        i = o0OO00O.tvSign;
                                                                                        FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                        if (fixTextView != null) {
                                                                                            i = o0OO00O.tvSignHint;
                                                                                            TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                            if (textView5 != null) {
                                                                                                i = o0OO00O.tv_tag;
                                                                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                    i = o0OO00O.tvTagHint;
                                                                                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                                    if (textView6 != null) {
                                                                                                        i = o0OO00O.tvUserNameHint;
                                                                                                        TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                                        if (textView7 != null) {
                                                                                                            i = o0OO00O.v;
                                                                                                            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                                return new w1((LinearLayout) viewInflate, editText, flowLayout, imageView, imageView2, imageView3, viewOooO00o, netImageView, textView, textView2, textView3, textView4, fixTextView, textView5, textView6, textView7);
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
