package p519o0o0O0oO;

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
import com.code.android.util.o000O0o;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p041Ooooo0o.o00000;
import p157o00OoOO0.Oooo0;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;
import p579o0oOoo.oOOo0O00;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLuckyNumberSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyNumberSettingDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberSettingDialog\n+ 2 TextViewUtil2.kt\ncom/code/android/util/TextViewUtil2Kt\n*L\n1#1,285:1\n32#2,2:286\n*S KotlinDebug\n*F\n+ 1 RoomLuckyNumberSettingDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberSettingDialog\n*L\n70#1:286,2\n*E\n"})
public final class t1 extends Oooo0<t1> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f53147OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f53148OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f53149OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f53150OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f53151OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f53152OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f53153OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f53154OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(@NotNull MixedRoomActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f53148OooO0oO = activity;
        this.f53149OooO0oo = LazyKt.lazy(new s1(this));
        this.f53147OooO = oOo00OO0.bgs_button_2a2b3e_r8;
        this.f53150OooOO0 = oOo00OO0.bgs_button_2a2b3e_stroke_fe6c6c_r8;
        ConstraintLayout constraintLayout = OooOOOO().f58833OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setGravity(80);
        }
        Window window = this.f10134OooO0O0.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        ConstraintLayout constraintLayout2 = OooOOOO().f58837OooO0o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.layout");
        o000OO00.OooO0oo(constraintLayout2, new m1(this));
        ImageView imageView = OooOOOO().f58838OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.history");
        o000OO00.OooO0oo(imageView, new n1(this));
        AppCompatImageView appCompatImageView = OooOOOO().f58835OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
        o000OO00.OooO0oo(appCompatImageView, new o1(this));
        OooOOOO().f58832OooO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0O0oO.i1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                t1 this$0 = this.f52358OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("102239");
                AppCompatEditText view = this$0.OooOOOO().f58834OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
                OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
                if (!z) {
                    this$0.OooOOOO().f58842OooOO0O.setChecked(false);
                }
                this$0.OooOOOo(z);
            }
        });
        OooOOOO().f58842OooOO0O.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0O0oO.j1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                t1 this$0 = this.f52375OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("102241");
                AppCompatEditText view = this$0.OooOOOO().f58834OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
                OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            }
        });
        OooOOOO().f58839OooO0oO.setRangeListener(new p1(this));
        OooOOOO().f58839OooO0oO.setCostListener(new q1(this));
        AppCompatEditText appCompatEditText = OooOOOO().f58834OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
        o000O0o o000o0o2 = new o000O0o();
        r1 listener = new r1(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000o0o2.f10362OooO0Oo = listener;
        appCompatEditText.addTextChangedListener(o000o0o2);
        OooOOOO().f58834OooO0O0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0O0oO.k1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                t1 this$0 = this.f52402OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z) {
                    if (String.valueOf(this$0.OooOOOO().f58834OooO0O0.getText()).length() > 0) {
                        AppCompatImageView appCompatImageView2 = this$0.OooOOOO().f58835OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                        o000OO00.OooOOOO(appCompatImageView2);
                        return;
                    }
                }
                AppCompatImageView appCompatImageView3 = this$0.OooOOOO().f58835OooO0OO;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.editNumberClear");
                o000OO00.OooO0O0(appCompatImageView3);
            }
        });
        AppCompatTextView appCompatTextView = OooOOOO().f58843OooOO0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.submit");
        o000OO00.OooO0oo(appCompatTextView, new l1(this));
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        Integer value = oooO00o.OooO00o().OooO0o().getValue();
        this.f53151OooOO0O = (value == null ? 0 : value).intValue();
        Integer value2 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f53152OooOO0o = (value2 == null ? 1 : value2).intValue();
        Boolean value3 = oooO00o.OooO00o().OooO().getValue();
        this.f53154OooOOO0 = (value3 == null ? Boolean.FALSE : value3).booleanValue();
        Long value4 = oooO00o.OooO00o().OooO0oO().getValue();
        this.f53153OooOOO = (value4 == null ? -1L : value4).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.code.android.easydialog.OooO
    public final void OooOO0o() {
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        Integer num = (Integer) ((MutableLiveData) oooO00o.OooO00o().f25029Oooo0.getValue()).getValue();
        if (num == null) {
            return;
        }
        if (num.intValue() != 1) {
            return;
        }
        Integer value = oooO00o.OooO00o().OooO0o().getValue();
        this.f53151OooOO0O = value == null ? 0 : value.intValue();
        Integer value2 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f53152OooOO0o = value2 == null ? 1 : value2.intValue();
        Boolean value3 = oooO00o.OooO00o().OooO().getValue();
        this.f53154OooOOO0 = value3 == null ? false : value3.booleanValue();
        Long value4 = oooO00o.OooO00o().OooO0oO().getValue();
        long jLongValue = value4 == null ? -1L : value4.longValue();
        this.f53153OooOOO = jLongValue;
        int i = this.f53151OooOO0O;
        int i2 = this.f53152OooOO0o;
        boolean z = this.f53154OooOOO0;
        StringBuilder sbOooO00o = o00000.OooO00o("房间幸运数字-show\ncurrCost:'", i, "'\ncurrRange:'", i2, "'\ncurrSettableForManage:'");
        sbOooO00o.append(z);
        sbOooO00o.append("'\ncurrLuckyNumber:'");
        sbOooO00o.append(jLongValue);
        sbOooO00o.append("'");
        OooOOO0.OooO0O0(sbOooO00o.toString());
        SetLuckyNumberLayout setLuckyNumberLayout = OooOOOO().f58839OooO0oO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberLayout, "binding.numberSetting");
        o000OO00.OooO0O0(setLuckyNumberLayout);
        AppCompatTextView appCompatTextView = OooOOOO().f58840OooO0oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.setLuckyNumber");
        o000OO00.OooOOOO(appCompatTextView);
        Switch r1 = OooOOOO().f58832OooO;
        Intrinsics.checkNotNullExpressionValue(r1, "binding.setLuckyNumberSwitch");
        o000OO00.OooO0O0(r1);
        AppCompatEditText appCompatEditText = OooOOOO().f58834OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
        o000OO00.OooOOOO(appCompatEditText);
        AppCompatTextView appCompatTextView2 = OooOOOO().f58841OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.setManageLuckyNumber");
        o000OO00.OooO0O0(appCompatTextView2);
        Switch r2 = OooOOOO().f58842OooOO0O;
        Intrinsics.checkNotNullExpressionValue(r2, "binding.setManageLuckyNumberSwitch");
        o000OO00.OooO0O0(r2);
        OooOOOO().f58839OooO0oO.OooO0O0(this.f53151OooOO0O);
        OooOOOO().f58839OooO0oO.OooO0OO(this.f53152OooOO0o);
        OooOOOO().f58832OooO.setChecked(this.f53153OooOOO > -1);
        OooOOOO().f58842OooOO0O.setChecked(this.f53154OooOOO0);
        if (this.f53153OooOOO > -1) {
            OooOOOO().f58834OooO0O0.setText(String.valueOf(this.f53153OooOOO));
        }
        OooOOO0(this.f53152OooOO0o);
        Integer value5 = oooO00o.OooO00o().f25008OooOO0o.getValue();
        if (value5 == null || value5.intValue() != 1) {
            if (value5 != null && value5.intValue() == 2) {
                super.OooOO0o();
                return;
            }
            return;
        }
        SetLuckyNumberLayout setLuckyNumberLayout2 = OooOOOO().f58839OooO0oO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberLayout2, "binding.numberSetting");
        o000OO00.OooOOOO(setLuckyNumberLayout2);
        Switch r0 = OooOOOO().f58832OooO;
        Intrinsics.checkNotNullExpressionValue(r0, "binding.setLuckyNumberSwitch");
        o000OO00.OooOOOO(r0);
        OooOOOo(this.f53153OooOOO > -1);
        super.OooOO0o();
    }

    public final void OooOOO(boolean z, boolean z2) {
        if (z) {
            AppCompatTextView appCompatTextView = OooOOOO().f58836OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.editNumberWarning");
            o000OO00.OooOOOO(appCompatTextView);
            OooOOOO().f58834OooO0O0.setBackgroundResource(this.f53150OooOO0);
            if (z2) {
                OooOOOO().f58843OooOO0o.setEnabled(false);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = OooOOOO().f58836OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.editNumberWarning");
        o000OO00.OooO0O0(appCompatTextView2);
        OooOOOO().f58834OooO0O0.setBackgroundResource(this.f53147OooO);
        if (z2) {
            OooOOOO().f58843OooOO0o.setEnabled(true);
        }
    }

    public final void OooOOO0(int i) {
        String str;
        OooOOOO().f58834OooO0O0.setFilters(new InputFilter[]{new oOOo0O00(), new InputFilter.LengthFilter(i)});
        if (i != 2) {
            str = i != 3 ? "9" : "999";
        } else {
            str = "99";
        }
        Integer value = OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue();
        if (value != null && value.intValue() == 1) {
            AppCompatEditText appCompatEditText = OooOOOO().f58834OooO0O0;
            int i2 = oO00OOo0.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_host;
            appCompatEditText.setHint(o0000O.OooO00o(o0000.OooO0OO(i2), str));
            OooOOOO().f58836OooO0Oo.setText(o0000O.OooO00o(o0000.OooO0OO(i2), str));
            return;
        }
        if (value != null && value.intValue() == 2) {
            AppCompatEditText appCompatEditText2 = OooOOOO().f58834OooO0O0;
            int i3 = oO00OOo0.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_manage;
            appCompatEditText2.setHint(o0000O.OooO00o(o0000.OooO0OO(i3), str));
            OooOOOO().f58836OooO0Oo.setText(o0000O.OooO00o(o0000.OooO0OO(i3), str));
        }
    }

    public final p641o0ooOOOO.t1 OooOOOO() {
        return (p641o0ooOOOO.t1) this.f53149OooO0oo.getValue();
    }

    public final void OooOOOo(boolean z) {
        if (!z) {
            AppCompatEditText appCompatEditText = OooOOOO().f58834OooO0O0;
            Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
            o000OO00.OooO0O0(appCompatEditText);
            AppCompatImageView appCompatImageView = OooOOOO().f58835OooO0OO;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
            o000OO00.OooO0O0(appCompatImageView);
            AppCompatTextView appCompatTextView = OooOOOO().f58841OooOO0;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.setManageLuckyNumber");
            o000OO00.OooO0O0(appCompatTextView);
            Switch r5 = OooOOOO().f58842OooOO0O;
            Intrinsics.checkNotNullExpressionValue(r5, "binding.setManageLuckyNumberSwitch");
            o000OO00.OooO0O0(r5);
            return;
        }
        AppCompatEditText appCompatEditText2 = OooOOOO().f58834OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText2, "binding.editNumber");
        o000OO00.OooOOOO(appCompatEditText2);
        AppCompatTextView appCompatTextView2 = OooOOOO().f58841OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.setManageLuckyNumber");
        o000OO00.OooOOOO(appCompatTextView2);
        Switch r6 = OooOOOO().f58842OooOO0O;
        Intrinsics.checkNotNullExpressionValue(r6, "binding.setManageLuckyNumberSwitch");
        o000OO00.OooOOOO(r6);
        Integer value = OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue();
        if (value == null || value.intValue() != 1) {
            AppCompatTextView appCompatTextView3 = OooOOOO().f58841OooOO0;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.setManageLuckyNumber");
            o000OO00.OooO0O0(appCompatTextView3);
            Switch r7 = OooOOOO().f58842OooOO0O;
            Intrinsics.checkNotNullExpressionValue(r7, "binding.setManageLuckyNumberSwitch");
            o000OO00.OooO0O0(r7);
        }
        if (OooOOOO().f58834OooO0O0.hasFocus()) {
            if (String.valueOf(OooOOOO().f58834OooO0O0.getText()).length() > 0) {
                AppCompatImageView appCompatImageView2 = OooOOOO().f58835OooO0OO;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                o000OO00.OooOOOO(appCompatImageView2);
            }
        }
    }
}
