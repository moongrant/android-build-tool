package p675oO0Oo;

import android.content.Context;
import android.os.Handler;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O0o;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p041Ooooo0o.o00000;
import p205o00o0o0o.o0000OO0;
import p373o0OOo0oO.o00Oo0;
import p407o0Oo0OOO.o0O00OO;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p587o0oOooO.oOOOoo00;
import p593o0oOoooO.h0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLuckyNumberSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyNumberSettingDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberSettingDialog\n+ 2 TextViewUtil2.kt\ncom/code/android/util/TextViewUtil2Kt\n*L\n1#1,285:1\n32#2,2:286\n*S KotlinDebug\n*F\n+ 1 RoomLuckyNumberSettingDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberSettingDialog\n*L\n70#1:286,2\n*E\n"})
public final class s3 extends o0000OO0<s3> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f59951OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59952OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f59953OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f59954OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f59955OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f59956OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f59957OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f59958OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(@NotNull MixedRoomActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59952OooO0oO = activity;
        this.f59953OooO0oo = LazyKt.lazy(new r3(this));
        this.f59951OooO = o0OOO0o.bgs_button_2a2b3e_r8;
        this.f59954OooOO0 = o0OOO0o.bgs_button_2a2b3e_stroke_fe6c6c_r8;
        ConstraintLayout constraintLayout = OooOOOO().f44439OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setGravity(80);
        }
        Window window = this.f38483OooO0O0.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        ConstraintLayout layout = OooOOOO().f44443OooO0o;
        Intrinsics.checkNotNullExpressionValue(layout, "layout");
        o000O.OooO0oo(layout, new l3(this));
        ImageView history = OooOOOO().f44444OooO0o0;
        Intrinsics.checkNotNullExpressionValue(history, "history");
        o000O.OooO0oo(history, new m3(this));
        AppCompatImageView editNumberClear = OooOOOO().f44441OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editNumberClear, "editNumberClear");
        o000O.OooO0oo(editNumberClear, new n3(this));
        OooOOOO().f44438OooO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oO0Oo.h3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                s3 this$0 = this.f59215OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h0.OooO0O0("102239");
                AppCompatEditText view = this$0.OooOOOO().f44440OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "editNumber");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
                o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
                if (!z) {
                    this$0.OooOOOO().f44448OooOO0O.setChecked(false);
                }
                this$0.OooOOOo(z);
            }
        });
        OooOOOO().f44448OooOO0O.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oO0Oo.i3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                s3 this$0 = this.f59247OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h0.OooO0O0("102241");
                AppCompatEditText view = this$0.OooOOOO().f44440OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "editNumber");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
                o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            }
        });
        OooOOOO().f44445OooO0oO.setRangeListener(new o3(this));
        OooOOOO().f44445OooO0oO.setCostListener(new p3(this));
        AppCompatEditText editNumber = OooOOOO().f44440OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editNumber, "editNumber");
        o000O0o o000o0o2 = new o000O0o();
        q3 listener = new q3(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000o0o2.f13435OooO0Oo = listener;
        editNumber.addTextChangedListener(o000o0o2);
        OooOOOO().f44440OooO0O0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oO0Oo.j3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                s3 this$0 = this.f59260OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z) {
                    if (String.valueOf(this$0.OooOOOO().f44440OooO0O0.getText()).length() > 0) {
                        AppCompatImageView editNumberClear2 = this$0.OooOOOO().f44441OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(editNumberClear2, "editNumberClear");
                        o000O.OooOOOO(editNumberClear2);
                        return;
                    }
                }
                AppCompatImageView editNumberClear3 = this$0.OooOOOO().f44441OooO0OO;
                Intrinsics.checkNotNullExpressionValue(editNumberClear3, "editNumberClear");
                o000O.OooO0O0(editNumberClear3);
            }
        });
        AppCompatTextView submit = OooOOOO().f44449OooOO0o;
        Intrinsics.checkNotNullExpressionValue(submit, "submit");
        o000O.OooO0oo(submit, new k3(this));
        OooO0O0.OooO00o oooO00o = OooO0O0.f24541OoooOOO;
        Integer value = oooO00o.OooO00o().OooO0o().getValue();
        this.f59955OooOO0O = (value == null ? 0 : value).intValue();
        Integer value2 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f59956OooOO0o = (value2 == null ? 1 : value2).intValue();
        Boolean value3 = oooO00o.OooO00o().OooO().getValue();
        this.f59958OooOOO0 = (value3 == null ? Boolean.FALSE : value3).booleanValue();
        Long value4 = oooO00o.OooO00o().OooO0oO().getValue();
        this.f59957OooOOO = (value4 == null ? -1L : value4).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p185o00o00Oo.o0000oo
    public final void OooOO0o() {
        OooO0O0.OooO00o oooO00o = OooO0O0.f24541OoooOOO;
        Integer num = (Integer) ((MutableLiveData) oooO00o.OooO00o().f24575Oooo0.getValue()).getValue();
        if (num == null) {
            return;
        }
        if (num.intValue() != 1) {
            return;
        }
        Integer value = oooO00o.OooO00o().OooO0o().getValue();
        this.f59955OooOO0O = value == null ? 0 : value.intValue();
        Integer value2 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f59956OooOO0o = value2 == null ? 1 : value2.intValue();
        Boolean value3 = oooO00o.OooO00o().OooO().getValue();
        this.f59958OooOOO0 = value3 == null ? false : value3.booleanValue();
        Long value4 = oooO00o.OooO00o().OooO0oO().getValue();
        long jLongValue = value4 == null ? -1L : value4.longValue();
        this.f59957OooOOO = jLongValue;
        int i = this.f59955OooOO0O;
        int i2 = this.f59956OooOO0o;
        boolean z = this.f59958OooOOO0;
        StringBuilder sbOooO00o = o00000.OooO00o("房间幸运数字-show\ncurrCost:'", i, "'\ncurrRange:'", i2, "'\ncurrSettableForManage:'");
        sbOooO00o.append(z);
        sbOooO00o.append("'\ncurrLuckyNumber:'");
        sbOooO00o.append(jLongValue);
        sbOooO00o.append("'");
        OooOOOO.OooO0O0(sbOooO00o.toString());
        SetLuckyNumberLayout numberSetting = OooOOOO().f44445OooO0oO;
        Intrinsics.checkNotNullExpressionValue(numberSetting, "numberSetting");
        o000O.OooO0O0(numberSetting);
        AppCompatTextView setLuckyNumber = OooOOOO().f44446OooO0oo;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumber, "setLuckyNumber");
        o000O.OooOOOO(setLuckyNumber);
        Switch setLuckyNumberSwitch = OooOOOO().f44438OooO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberSwitch, "setLuckyNumberSwitch");
        o000O.OooO0O0(setLuckyNumberSwitch);
        AppCompatEditText editNumber = OooOOOO().f44440OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editNumber, "editNumber");
        o000O.OooOOOO(editNumber);
        AppCompatTextView setManageLuckyNumber = OooOOOO().f44447OooOO0;
        Intrinsics.checkNotNullExpressionValue(setManageLuckyNumber, "setManageLuckyNumber");
        o000O.OooO0O0(setManageLuckyNumber);
        Switch setManageLuckyNumberSwitch = OooOOOO().f44448OooOO0O;
        Intrinsics.checkNotNullExpressionValue(setManageLuckyNumberSwitch, "setManageLuckyNumberSwitch");
        o000O.OooO0O0(setManageLuckyNumberSwitch);
        OooOOOO().f44445OooO0oO.OooO0O0(this.f59955OooOO0O);
        OooOOOO().f44445OooO0oO.OooO0OO(this.f59956OooOO0o);
        OooOOOO().f44438OooO.setChecked(this.f59957OooOOO > -1);
        OooOOOO().f44448OooOO0O.setChecked(this.f59958OooOOO0);
        if (this.f59957OooOOO > -1) {
            OooOOOO().f44440OooO0O0.setText(String.valueOf(this.f59957OooOOO));
        }
        OooOOO0(this.f59956OooOO0o);
        Integer value5 = oooO00o.OooO00o().f24554OooOO0o.getValue();
        if (value5 == null || value5.intValue() != 1) {
            if (value5 != null && value5.intValue() == 2) {
                super.OooOO0o();
                return;
            }
            return;
        }
        SetLuckyNumberLayout numberSetting2 = OooOOOO().f44445OooO0oO;
        Intrinsics.checkNotNullExpressionValue(numberSetting2, "numberSetting");
        o000O.OooOOOO(numberSetting2);
        Switch setLuckyNumberSwitch2 = OooOOOO().f44438OooO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberSwitch2, "setLuckyNumberSwitch");
        o000O.OooOOOO(setLuckyNumberSwitch2);
        OooOOOo(this.f59957OooOOO > -1);
        super.OooOO0o();
    }

    public final void OooOOO(boolean z, boolean z2) {
        if (z) {
            AppCompatTextView editNumberWarning = OooOOOO().f44442OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(editNumberWarning, "editNumberWarning");
            o000O.OooOOOO(editNumberWarning);
            OooOOOO().f44440OooO0O0.setBackgroundResource(this.f59954OooOO0);
            if (z2) {
                OooOOOO().f44449OooOO0o.setEnabled(false);
                return;
            }
            return;
        }
        AppCompatTextView editNumberWarning2 = OooOOOO().f44442OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(editNumberWarning2, "editNumberWarning");
        o000O.OooO0O0(editNumberWarning2);
        OooOOOO().f44440OooO0O0.setBackgroundResource(this.f59951OooO);
        if (z2) {
            OooOOOO().f44449OooOO0o.setEnabled(true);
        }
    }

    public final void OooOOO0(int i) {
        String str;
        OooOOOO().f44440OooO0O0.setFilters(new InputFilter[]{new oOOOoo00(), new InputFilter.LengthFilter(i)});
        if (i != 2) {
            str = i != 3 ? "9" : "999";
        } else {
            str = "99";
        }
        Integer value = OooO0O0.f24541OoooOOO.OooO00o().f24554OooOO0o.getValue();
        if (value != null && value.intValue() == 1) {
            AppCompatEditText appCompatEditText = OooOOOO().f44440OooO0O0;
            int i2 = o000OOo.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_host;
            appCompatEditText.setHint(o0000O.OooO00o(o0000.OooO0OO(i2), str));
            OooOOOO().f44442OooO0Oo.setText(o0000O.OooO00o(o0000.OooO0OO(i2), str));
            return;
        }
        if (value != null && value.intValue() == 2) {
            AppCompatEditText appCompatEditText2 = OooOOOO().f44440OooO0O0;
            int i3 = o000OOo.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_manage;
            appCompatEditText2.setHint(o0000O.OooO00o(o0000.OooO0OO(i3), str));
            OooOOOO().f44442OooO0Oo.setText(o0000O.OooO00o(o0000.OooO0OO(i3), str));
        }
    }

    public final o0O00OO OooOOOO() {
        return (o0O00OO) this.f59953OooO0oo.getValue();
    }

    public final void OooOOOo(boolean z) {
        if (!z) {
            AppCompatEditText editNumber = OooOOOO().f44440OooO0O0;
            Intrinsics.checkNotNullExpressionValue(editNumber, "editNumber");
            o000O.OooO0O0(editNumber);
            AppCompatImageView editNumberClear = OooOOOO().f44441OooO0OO;
            Intrinsics.checkNotNullExpressionValue(editNumberClear, "editNumberClear");
            o000O.OooO0O0(editNumberClear);
            AppCompatTextView setManageLuckyNumber = OooOOOO().f44447OooOO0;
            Intrinsics.checkNotNullExpressionValue(setManageLuckyNumber, "setManageLuckyNumber");
            o000O.OooO0O0(setManageLuckyNumber);
            Switch setManageLuckyNumberSwitch = OooOOOO().f44448OooOO0O;
            Intrinsics.checkNotNullExpressionValue(setManageLuckyNumberSwitch, "setManageLuckyNumberSwitch");
            o000O.OooO0O0(setManageLuckyNumberSwitch);
            return;
        }
        AppCompatEditText editNumber2 = OooOOOO().f44440OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editNumber2, "editNumber");
        o000O.OooOOOO(editNumber2);
        AppCompatTextView setManageLuckyNumber2 = OooOOOO().f44447OooOO0;
        Intrinsics.checkNotNullExpressionValue(setManageLuckyNumber2, "setManageLuckyNumber");
        o000O.OooOOOO(setManageLuckyNumber2);
        Switch setManageLuckyNumberSwitch2 = OooOOOO().f44448OooOO0O;
        Intrinsics.checkNotNullExpressionValue(setManageLuckyNumberSwitch2, "setManageLuckyNumberSwitch");
        o000O.OooOOOO(setManageLuckyNumberSwitch2);
        Integer value = OooO0O0.f24541OoooOOO.OooO00o().f24554OooOO0o.getValue();
        if (value == null || value.intValue() != 1) {
            AppCompatTextView setManageLuckyNumber3 = OooOOOO().f44447OooOO0;
            Intrinsics.checkNotNullExpressionValue(setManageLuckyNumber3, "setManageLuckyNumber");
            o000O.OooO0O0(setManageLuckyNumber3);
            Switch setManageLuckyNumberSwitch3 = OooOOOO().f44448OooOO0O;
            Intrinsics.checkNotNullExpressionValue(setManageLuckyNumberSwitch3, "setManageLuckyNumberSwitch");
            o000O.OooO0O0(setManageLuckyNumberSwitch3);
        }
        if (OooOOOO().f44440OooO0O0.hasFocus()) {
            if (String.valueOf(OooOOOO().f44440OooO0O0.getText()).length() > 0) {
                AppCompatImageView editNumberClear2 = OooOOOO().f44441OooO0OO;
                Intrinsics.checkNotNullExpressionValue(editNumberClear2, "editNumberClear");
                o000O.OooOOOO(editNumberClear2);
            }
        }
    }
}
