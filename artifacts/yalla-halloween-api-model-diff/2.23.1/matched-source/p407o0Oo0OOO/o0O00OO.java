package p407o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final Switch f44438OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44439OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatEditText f44440OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f44441OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44443OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44444OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SetLuckyNumberLayout f44445OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44446OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44447OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final Switch f44448OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44449OooOO0o;

    public o0O00OO(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull SetLuckyNumberLayout setLuckyNumberLayout, @NonNull AppCompatTextView appCompatTextView2, @NonNull Switch r9, @NonNull AppCompatTextView appCompatTextView3, @NonNull Switch r11, @NonNull AppCompatTextView appCompatTextView4) {
        this.f44439OooO00o = constraintLayout;
        this.f44440OooO0O0 = appCompatEditText;
        this.f44441OooO0OO = appCompatImageView;
        this.f44442OooO0Oo = appCompatTextView;
        this.f44444OooO0o0 = imageView;
        this.f44443OooO0o = constraintLayout2;
        this.f44445OooO0oO = setLuckyNumberLayout;
        this.f44446OooO0oo = appCompatTextView2;
        this.f44438OooO = r9;
        this.f44447OooOO0 = appCompatTextView3;
        this.f44448OooOO0O = r11;
        this.f44449OooOO0o = appCompatTextView4;
    }

    @NonNull
    public static o0O00OO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44439OooO00o;
    }

    @NonNull
    public static o0O00OO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.dialog_room_lucky_number_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.editNumber;
        AppCompatEditText appCompatEditText = (AppCompatEditText) OooO0O0.OooO00o(i, viewInflate);
        if (appCompatEditText != null) {
            i = o0Oo0oo.editNumberClear;
            AppCompatImageView appCompatImageView = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
            if (appCompatImageView != null) {
                i = o0Oo0oo.editNumberWarning;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                if (appCompatTextView != null) {
                    i = o0Oo0oo.history;
                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = o0Oo0oo.numberSetting;
                        SetLuckyNumberLayout setLuckyNumberLayout = (SetLuckyNumberLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (setLuckyNumberLayout != null) {
                            i = o0Oo0oo.setLuckyNumber;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                            if (appCompatTextView2 != null) {
                                i = o0Oo0oo.setLuckyNumberSwitch;
                                Switch r9 = (Switch) OooO0O0.OooO00o(i, viewInflate);
                                if (r9 != null) {
                                    i = o0Oo0oo.setManageLuckyNumber;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (appCompatTextView3 != null) {
                                        i = o0Oo0oo.setManageLuckyNumberSwitch;
                                        Switch r11 = (Switch) OooO0O0.OooO00o(i, viewInflate);
                                        if (r11 != null) {
                                            i = o0Oo0oo.submit;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (appCompatTextView4 != null) {
                                                i = o0Oo0oo.title;
                                                if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                    return new o0O00OO(constraintLayout, appCompatEditText, appCompatImageView, appCompatTextView, imageView, constraintLayout, setLuckyNumberLayout, appCompatTextView2, r9, appCompatTextView3, r11, appCompatTextView4);
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
