package p649o0ooOOoo;

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
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SetLuckyNumberLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class e8 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final Switch f49214OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatEditText f49216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f49217OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49218OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49219OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49220OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SetLuckyNumberLayout f49221OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49222OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49223OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final Switch f49224OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49225OooOO0o;

    public e8(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull SetLuckyNumberLayout setLuckyNumberLayout, @NonNull AppCompatTextView appCompatTextView2, @NonNull Switch r9, @NonNull AppCompatTextView appCompatTextView3, @NonNull Switch r11, @NonNull AppCompatTextView appCompatTextView4) {
        this.f49215OooO00o = constraintLayout;
        this.f49216OooO0O0 = appCompatEditText;
        this.f49217OooO0OO = appCompatImageView;
        this.f49218OooO0Oo = appCompatTextView;
        this.f49220OooO0o0 = imageView;
        this.f49219OooO0o = constraintLayout2;
        this.f49221OooO0oO = setLuckyNumberLayout;
        this.f49222OooO0oo = appCompatTextView2;
        this.f49214OooO = r9;
        this.f49223OooOO0 = appCompatTextView3;
        this.f49224OooOO0O = r11;
        this.f49225OooOO0o = appCompatTextView4;
    }

    @NonNull
    public static e8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49215OooO00o;
    }

    @NonNull
    public static e8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_room_lucky_number_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.editNumber;
        AppCompatEditText appCompatEditText = (AppCompatEditText) o00Oo0.OooO00o(viewInflate, R.id.editNumber);
        if (appCompatEditText != null) {
            i = R.id.editNumberClear;
            AppCompatImageView appCompatImageView = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.editNumberClear);
            if (appCompatImageView != null) {
                i = R.id.editNumberWarning;
                AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.editNumberWarning);
                if (appCompatTextView != null) {
                    i = R.id.history;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.history);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.numberSetting;
                        SetLuckyNumberLayout setLuckyNumberLayout = (SetLuckyNumberLayout) o00Oo0.OooO00o(viewInflate, R.id.numberSetting);
                        if (setLuckyNumberLayout != null) {
                            i = R.id.setLuckyNumber;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.setLuckyNumber);
                            if (appCompatTextView2 != null) {
                                i = R.id.setLuckyNumberSwitch;
                                Switch r9 = (Switch) o00Oo0.OooO00o(viewInflate, R.id.setLuckyNumberSwitch);
                                if (r9 != null) {
                                    i = R.id.setManageLuckyNumber;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.setManageLuckyNumber);
                                    if (appCompatTextView3 != null) {
                                        i = R.id.setManageLuckyNumberSwitch;
                                        Switch r11 = (Switch) o00Oo0.OooO00o(viewInflate, R.id.setManageLuckyNumberSwitch);
                                        if (r11 != null) {
                                            i = R.id.submit;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.submit);
                                            if (appCompatTextView4 != null) {
                                                i = R.id.title;
                                                if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.title)) != null) {
                                                    return new e8(constraintLayout, appCompatEditText, appCompatImageView, appCompatTextView, imageView, constraintLayout, setLuckyNumberLayout, appCompatTextView2, r9, appCompatTextView3, r11, appCompatTextView4);
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
