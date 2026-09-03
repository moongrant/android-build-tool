package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final Switch f58832OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58833OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatEditText f58834OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f58835OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58837OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58838OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SetLuckyNumberLayout f58839OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58840OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58841OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final Switch f58842OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58843OooOO0o;

    public t1(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull SetLuckyNumberLayout setLuckyNumberLayout, @NonNull AppCompatTextView appCompatTextView2, @NonNull Switch r9, @NonNull AppCompatTextView appCompatTextView3, @NonNull Switch r11, @NonNull AppCompatTextView appCompatTextView4) {
        this.f58833OooO00o = constraintLayout;
        this.f58834OooO0O0 = appCompatEditText;
        this.f58835OooO0OO = appCompatImageView;
        this.f58836OooO0Oo = appCompatTextView;
        this.f58838OooO0o0 = imageView;
        this.f58837OooO0o = constraintLayout2;
        this.f58839OooO0oO = setLuckyNumberLayout;
        this.f58840OooO0oo = appCompatTextView2;
        this.f58832OooO = r9;
        this.f58841OooOO0 = appCompatTextView3;
        this.f58842OooOO0O = r11;
        this.f58843OooOO0o = appCompatTextView4;
    }

    @NonNull
    public static t1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58833OooO00o;
    }

    @NonNull
    public static t1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_room_lucky_number_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.editNumber;
        AppCompatEditText appCompatEditText = (AppCompatEditText) OooOO0.OooO00o(i, viewInflate);
        if (appCompatEditText != null) {
            i = oO00O0oO.editNumberClear;
            AppCompatImageView appCompatImageView = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
            if (appCompatImageView != null) {
                i = oO00O0oO.editNumberWarning;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                if (appCompatTextView != null) {
                    i = oO00O0oO.history;
                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = oO00O0oO.numberSetting;
                        SetLuckyNumberLayout setLuckyNumberLayout = (SetLuckyNumberLayout) OooOO0.OooO00o(i, viewInflate);
                        if (setLuckyNumberLayout != null) {
                            i = oO00O0oO.setLuckyNumber;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                            if (appCompatTextView2 != null) {
                                i = oO00O0oO.setLuckyNumberSwitch;
                                Switch r9 = (Switch) OooOO0.OooO00o(i, viewInflate);
                                if (r9 != null) {
                                    i = oO00O0oO.setManageLuckyNumber;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                    if (appCompatTextView3 != null) {
                                        i = oO00O0oO.setManageLuckyNumberSwitch;
                                        Switch r11 = (Switch) OooOO0.OooO00o(i, viewInflate);
                                        if (r11 != null) {
                                            i = oO00O0oO.submit;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                            if (appCompatTextView4 != null) {
                                                i = oO00O0oO.title;
                                                if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                    return new t1(constraintLayout, appCompatEditText, appCompatImageView, appCompatTextView, imageView, constraintLayout, setLuckyNumberLayout, appCompatTextView2, r9, appCompatTextView3, r11, appCompatTextView4);
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
