package p649o0ooOOoo;

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
import com.app.base.view.FixTextView;
import com.google.android.material.internal.FlowLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class rh implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50491OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50492OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50493OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FlowLayout f50494OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50495OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50496OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f50497OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f50498OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f50499OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50500OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f50501OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50502OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50503OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f50504OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50505OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f50506OooOOOo;

    public rh(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull FlowLayout flowLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull FixTextView fixTextView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f50492OooO00o = linearLayout;
        this.f50493OooO0O0 = editText;
        this.f50494OooO0OO = flowLayout;
        this.f50495OooO0Oo = imageView;
        this.f50497OooO0o0 = imageView2;
        this.f50496OooO0o = imageView3;
        this.f50498OooO0oO = view;
        this.f50499OooO0oo = netImageView;
        this.f50491OooO = textView;
        this.f50500OooOO0 = textView2;
        this.f50501OooOO0O = textView3;
        this.f50502OooOO0o = textView4;
        this.f50504OooOOO0 = fixTextView;
        this.f50503OooOOO = textView5;
        this.f50505OooOOOO = textView6;
        this.f50506OooOOOo = textView7;
    }

    @NonNull
    public static rh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50492OooO00o;
    }

    @NonNull
    public static rh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_user_info_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.cl_userinfo_edit_birthday;
        if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.cl_userinfo_edit_birthday)) != null) {
            i = R.id.cl_userinfo_edit_country;
            if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.cl_userinfo_edit_country)) != null) {
                i = R.id.cl_userinfo_edit_gender;
                if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.cl_userinfo_edit_gender)) != null) {
                    i = R.id.cl_userinfo_edit_sign;
                    if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.cl_userinfo_edit_sign)) != null) {
                        i = R.id.cl_userinfo_edit_tag;
                        if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.cl_userinfo_edit_tag)) != null) {
                            i = R.id.etName;
                            EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etName);
                            if (editText != null) {
                                i = R.id.flTag;
                                FlowLayout flowLayout = (FlowLayout) o00Oo0.OooO00o(viewInflate, R.id.flTag);
                                if (flowLayout != null) {
                                    i = R.id.ivClear;
                                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClear);
                                    if (imageView != null) {
                                        i = R.id.ivHeaderErr;
                                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeaderErr);
                                        if (imageView2 != null) {
                                            i = R.id.ivHeaderIcon;
                                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeaderIcon);
                                            if (imageView3 != null) {
                                                i = R.id.ivNameClick;
                                                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.ivNameClick);
                                                if (viewOooO00o != null) {
                                                    i = R.id.iv_tag;
                                                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_tag)) != null) {
                                                        i = R.id.ll_edit;
                                                        if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_edit)) != null) {
                                                            i = R.id.nivHeader;
                                                            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.nivHeader);
                                                            if (netImageView != null) {
                                                                i = R.id.tvBirthday;
                                                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBirthday);
                                                                if (textView != null) {
                                                                    i = R.id.tv_birthday_hint;
                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_birthday_hint)) != null) {
                                                                        i = R.id.tvCountry;
                                                                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCountry);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tv_country_hint;
                                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_country_hint)) != null) {
                                                                                i = R.id.tvGender;
                                                                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGender);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tv_gender_hint;
                                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_gender_hint)) != null) {
                                                                                        i = R.id.tvNum;
                                                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNum);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.tvSign;
                                                                                            FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(viewInflate, R.id.tvSign);
                                                                                            if (fixTextView != null) {
                                                                                                i = R.id.tvSignHint;
                                                                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSignHint);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.tv_tag;
                                                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_tag)) != null) {
                                                                                                        i = R.id.tvTagHint;
                                                                                                        TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTagHint);
                                                                                                        if (textView6 != null) {
                                                                                                            i = R.id.tvUserNameHint;
                                                                                                            TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvUserNameHint);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.v;
                                                                                                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.v)) != null) {
                                                                                                                    return new rh((LinearLayout) viewInflate, editText, flowLayout, imageView, imageView2, imageView3, viewOooO00o, netImageView, textView, textView2, textView3, textView4, fixTextView, textView5, textView6, textView7);
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
