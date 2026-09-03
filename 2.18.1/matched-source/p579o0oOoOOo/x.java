package p579o0oOoOOo;

import android.content.Context;
import android.os.Handler;
import android.text.InputFilter;
import android.view.LayoutInflater;
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
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o000oOoO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.ui.view.SetLuckyNumberLayout;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.o000OOo;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.o00O00OO;
import p470o0Oooo0.o00O000;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;
import p625o0oo0oo.o000O0O0;
import p649o0ooOOoo.e8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class x extends o00O00OO<x> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f46338OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46339OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f46340OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f46341OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f46342OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f46343OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f46344OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f46345OooOOO0;

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            AppCompatEditText view = x.this.OooOOOo().f49216OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
            x.this.OooOOO(iIntValue);
            x xVar = x.this;
            xVar.OooOOOO(String.valueOf(xVar.OooOOOo().f49216OooO0O0.getText()).length() > iIntValue, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            long j;
            long j2;
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            OooOo.OooO0O0("102240");
            int i = x.this.OooOOOo().f49221OooO0oO.currCost;
            int i2 = x.this.OooOOOo().f49221OooO0oO.currRange;
            boolean zIsChecked = x.this.OooOOOo().f49214OooO.isChecked();
            String strValueOf = String.valueOf(x.this.OooOOOo().f49216OooO0O0.getText());
            boolean zIsChecked2 = x.this.OooOOOo().f49224OooOO0O.isChecked();
            if (strValueOf.length() > i2) {
                x.this.OooOOOO(true, false);
            } else {
                Intrinsics.checkNotNullParameter(strValueOf, "<this>");
                try {
                    j = Long.parseLong(strValueOf);
                } catch (NumberFormatException unused) {
                    j = -1;
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("房间幸运数字-房主\ncurrCost:'");
                sbOooO0o0.append(x.this.f46342OooOO0O);
                sbOooO0o0.append("', currRange:'");
                sbOooO0o0.append(x.this.f46343OooOO0o);
                sbOooO0o0.append("', currLuckyNumber:'");
                sbOooO0o0.append(x.this.f46344OooOOO);
                sbOooO0o0.append("', currSettableFromManage:'");
                sbOooO0o0.append(x.this.f46345OooOOO0);
                sbOooO0o0.append("'\nnewCost:'");
                sbOooO0o0.append(i);
                sbOooO0o0.append("', newRange:'");
                sbOooO0o0.append(i2);
                sbOooO0o0.append("', newLuckyNumberStr:'");
                sbOooO0o0.append(strValueOf);
                sbOooO0o0.append("', newLuckyNumberSettableFromManage:'");
                sbOooO0o0.append(zIsChecked2);
                sbOooO0o0.append("', newLuckyNumberSettable:'");
                sbOooO0o0.append(zIsChecked);
                sbOooO0o0.append('\'');
                o00O00.OooO0O0(sbOooO0o0.toString());
                Integer value = o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue();
                if (value != null && value.intValue() == 1) {
                    if (zIsChecked) {
                        if (strValueOf.length() == 0) {
                            x.this.OooOOOO(true, false);
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = -1;
                    }
                    p159o00OoOO.o00O000.OooO().OooO0o0(i, i2, j2, zIsChecked2);
                    x.this.OooO0Oo();
                } else if (value != null && value.intValue() == 2) {
                    if (strValueOf.length() == 0) {
                        x.this.OooOOOO(true, false);
                    } else {
                        p159o00OoOO.o00O000 o00o000OooO = p159o00OoOO.o00O000.OooO();
                        x xVar = x.this;
                        o00o000OooO.OooO0o0(xVar.f46342OooOO0O, xVar.f46343OooOO0o, j, xVar.f46345OooOOO0);
                        x.this.OooO0Oo();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            AppCompatEditText view2 = x.this.OooOOOo().f49216OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.editNumber");
            Intrinsics.checkNotNullParameter(view2, "view");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
            Context context2 = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.hideSoftInputFromWindow(view2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            new RoomLuckyNumberHistoryDialog(x.this.f46339OooO0oO).OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            x.this.OooOOOo().f49216OooO0O0.setText("");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Integer, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            num.intValue();
            AppCompatEditText view = x.this.OooOOOo().f49216OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {
        public OooOO0O() {
            super(4);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004f  */
        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            CharSequence charSequence2 = charSequence;
            num.intValue();
            num2.intValue();
            num3.intValue();
            if (charSequence2 != null) {
                x xVar = x.this;
                xVar.OooOOOO(charSequence2.length() > xVar.OooOOOo().f49221OooO0oO.currRange, true);
                if (xVar.OooOOOo().f49216OooO0O0.hasFocus()) {
                    if (charSequence2.length() > 0) {
                        AppCompatImageView appCompatImageView = xVar.OooOOOo().f49217OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
                        oOO00O.OooO(appCompatImageView);
                    } else {
                        AppCompatImageView appCompatImageView2 = xVar.OooOOOo().f49217OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                        oOO00O.OooO00o(appCompatImageView2);
                    }
                } else {
                    AppCompatImageView appCompatImageView3 = xVar.OooOOOo().f49217OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.editNumberClear");
                    oOO00O.OooO00o(appCompatImageView3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<e8> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e8 invoke() {
            e8 e8VarInflate = e8.inflate(LayoutInflater.from(x.this.f34199OooO00o), x.this.f34201OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(e8VarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            return e8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46339OooO0oO = activity;
        this.f46340OooO0oo = LazyKt.lazy(new OooOOO0());
        this.f46338OooO = R.drawable.bgs_button_2a2b3e_r8;
        this.f46341OooOO0 = R.drawable.bgs_button_2a2b3e_stroke_fe6c6c_r8;
        ConstraintLayout constraintLayout = OooOOOo().f49215OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oo(constraintLayout);
        Window windowOooO0o0 = OooO0o0();
        if (windowOooO0o0 != null) {
            windowOooO0o0.setGravity(80);
        }
        Window window = this.f34200OooO0O0.getWindow();
        if (window != null) {
            window.setDimAmount(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        ConstraintLayout constraintLayout2 = OooOOOo().f49219OooO0o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.layout");
        o00O0O.OooO0Oo(constraintLayout2, new OooO0O0());
        ImageView imageView = OooOOOo().f49220OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.history");
        o00O0O.OooO0Oo(imageView, new OooO0OO());
        AppCompatImageView appCompatImageView = OooOOOo().f49217OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
        o00O0O.OooO0Oo(appCompatImageView, new OooO0o());
        OooOOOo().f49214OooO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0oOoOOo.w
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                x this$0 = this.f46336OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOo.OooO0O0("102239");
                AppCompatEditText view = this$0.OooOOOo().f49216OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
                if (!z) {
                    this$0.OooOOOo().f49224OooOO0O.setChecked(false);
                }
                this$0.OooOOo0(z);
            }
        });
        OooOOOo().f49224OooOO0O.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0oOoOOo.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                x this$0 = this.f46334OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOo.OooO0O0("102241");
                AppCompatEditText view = this$0.OooOOOo().f49216OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
            }
        });
        OooOOOo().f49221OooO0oO.setRangeListener(new OooO());
        OooOOOo().f49221OooO0oO.setCostListener(new OooOO0());
        AppCompatEditText appCompatEditText = OooOOOo().f49216OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
        o000oOoO o000oooo2 = new o000oOoO();
        OooOO0O listener = new OooOO0O();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oooo2.f20509Oooo0o = listener;
        appCompatEditText.addTextChangedListener(o000oooo2);
        OooOOOo().f49216OooO0O0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0oOoOOo.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                x this$0 = this.f46327Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z) {
                    if (String.valueOf(this$0.OooOOOo().f49216OooO0O0.getText()).length() > 0) {
                        AppCompatImageView appCompatImageView2 = this$0.OooOOOo().f49217OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                        oOO00O.OooO(appCompatImageView2);
                        return;
                    }
                }
                AppCompatImageView appCompatImageView3 = this$0.OooOOOo().f49217OooO0OO;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.editNumberClear");
                oOO00O.OooO00o(appCompatImageView3);
            }
        });
        AppCompatTextView appCompatTextView = OooOOOo().f49225OooOO0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.submit");
        o00O0O.OooO0Oo(appCompatTextView, new OooO00o());
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        Integer value = oooO00o.OooO00o().OooO0oO().getValue();
        this.f46342OooOO0O = (value == null ? 0 : value).intValue();
        Integer value2 = oooO00o.OooO00o().OooO().getValue();
        this.f46343OooOO0o = (value2 == null ? 1 : value2).intValue();
        Boolean value3 = oooO00o.OooO00o().OooOO0O().getValue();
        this.f46345OooOOO0 = (value3 == null ? Boolean.FALSE : value3).booleanValue();
        Long value4 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f46344OooOOO = (value4 == null ? -1L : value4).longValue();
    }

    public final void OooOOO(int i) {
        String str;
        OooOOOo().f49216OooO0O0.setFilters(new InputFilter[]{new o000OOo(), new InputFilter.LengthFilter(i)});
        if (i != 2) {
            str = i != 3 ? "9" : "999";
        } else {
            str = "99";
        }
        Integer value = o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue();
        if (value != null && value.intValue() == 1) {
            OooOOOo().f49216OooO0O0.setHint(o000O0O0.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_host), str));
            OooOOOo().f49218OooO0Oo.setText(o000O0O0.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_host), str));
        } else if (value != null && value.intValue() == 2) {
            OooOOOo().f49216OooO0O0.setHint(o000O0O0.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_manage), str));
            OooOOOo().f49218OooO0Oo.setText(o000O0O0.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_manage), str));
        }
    }

    @Override // p250o00oo0oO.o000O000
    public final void OooOOO0() {
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        Integer value = oooO00o.OooO00o().OooOO0().getValue();
        if (value == null) {
            return;
        }
        if (value.intValue() != 1) {
            return;
        }
        Integer value2 = oooO00o.OooO00o().OooO0oO().getValue();
        this.f46342OooOO0O = value2 == null ? 0 : value2.intValue();
        Integer value3 = oooO00o.OooO00o().OooO().getValue();
        this.f46343OooOO0o = value3 == null ? 1 : value3.intValue();
        Boolean value4 = oooO00o.OooO00o().OooOO0O().getValue();
        this.f46345OooOOO0 = value4 == null ? false : value4.booleanValue();
        Long value5 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f46344OooOOO = value5 == null ? -1L : value5.longValue();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("房间幸运数字-show\ncurrCost:'");
        sbOooO0o0.append(this.f46342OooOO0O);
        sbOooO0o0.append("'\ncurrRange:'");
        sbOooO0o0.append(this.f46343OooOO0o);
        sbOooO0o0.append("'\ncurrSettableForManage:'");
        sbOooO0o0.append(this.f46345OooOOO0);
        sbOooO0o0.append("'\ncurrLuckyNumber:'");
        sbOooO0o0.append(this.f46344OooOOO);
        sbOooO0o0.append('\'');
        o00O00.OooO0O0(sbOooO0o0.toString());
        SetLuckyNumberLayout setLuckyNumberLayout = OooOOOo().f49221OooO0oO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberLayout, "binding.numberSetting");
        oOO00O.OooO00o(setLuckyNumberLayout);
        AppCompatTextView appCompatTextView = OooOOOo().f49222OooO0oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.setLuckyNumber");
        oOO00O.OooO(appCompatTextView);
        Switch r1 = OooOOOo().f49214OooO;
        Intrinsics.checkNotNullExpressionValue(r1, "binding.setLuckyNumberSwitch");
        oOO00O.OooO00o(r1);
        AppCompatEditText appCompatEditText = OooOOOo().f49216OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
        oOO00O.OooO(appCompatEditText);
        AppCompatTextView appCompatTextView2 = OooOOOo().f49223OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.setManageLuckyNumber");
        oOO00O.OooO00o(appCompatTextView2);
        Switch r2 = OooOOOo().f49224OooOO0O;
        Intrinsics.checkNotNullExpressionValue(r2, "binding.setManageLuckyNumberSwitch");
        oOO00O.OooO00o(r2);
        OooOOOo().f49221OooO0oO.OooO0Oo(this.f46342OooOO0O);
        OooOOOo().f49221OooO0oO.OooO0o0(this.f46343OooOO0o);
        OooOOOo().f49214OooO.setChecked(this.f46344OooOOO > -1);
        OooOOOo().f49224OooOO0O.setChecked(this.f46345OooOOO0);
        if (this.f46344OooOOO > -1) {
            OooOOOo().f49216OooO0O0.setText(String.valueOf(this.f46344OooOOO));
        }
        OooOOO(this.f46343OooOO0o);
        Integer value6 = oooO00o.OooO00o().f43329OooOOOO.getValue();
        if (value6 == null || value6.intValue() != 1) {
            if (value6 != null && value6.intValue() == 2) {
                super.OooOOO0();
                return;
            }
            return;
        }
        SetLuckyNumberLayout setLuckyNumberLayout2 = OooOOOo().f49221OooO0oO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberLayout2, "binding.numberSetting");
        oOO00O.OooO(setLuckyNumberLayout2);
        Switch r0 = OooOOOo().f49214OooO;
        Intrinsics.checkNotNullExpressionValue(r0, "binding.setLuckyNumberSwitch");
        oOO00O.OooO(r0);
        OooOOo0(this.f46344OooOOO > -1);
        super.OooOOO0();
    }

    public final void OooOOOO(boolean z, boolean z2) {
        if (z) {
            AppCompatTextView appCompatTextView = OooOOOo().f49218OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.editNumberWarning");
            oOO00O.OooO(appCompatTextView);
            OooOOOo().f49216OooO0O0.setBackgroundResource(this.f46341OooOO0);
            if (z2) {
                OooOOOo().f49225OooOO0o.setEnabled(false);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = OooOOOo().f49218OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.editNumberWarning");
        oOO00O.OooO00o(appCompatTextView2);
        OooOOOo().f49216OooO0O0.setBackgroundResource(this.f46338OooO);
        if (z2) {
            OooOOOo().f49225OooOO0o.setEnabled(true);
        }
    }

    public final e8 OooOOOo() {
        return (e8) this.f46340OooO0oo.getValue();
    }

    public final void OooOOo0(boolean z) {
        if (!z) {
            AppCompatEditText appCompatEditText = OooOOOo().f49216OooO0O0;
            Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
            oOO00O.OooO00o(appCompatEditText);
            AppCompatImageView appCompatImageView = OooOOOo().f49217OooO0OO;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
            oOO00O.OooO00o(appCompatImageView);
            AppCompatTextView appCompatTextView = OooOOOo().f49223OooOO0;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.setManageLuckyNumber");
            oOO00O.OooO00o(appCompatTextView);
            Switch r5 = OooOOOo().f49224OooOO0O;
            Intrinsics.checkNotNullExpressionValue(r5, "binding.setManageLuckyNumberSwitch");
            oOO00O.OooO00o(r5);
            return;
        }
        AppCompatEditText appCompatEditText2 = OooOOOo().f49216OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText2, "binding.editNumber");
        oOO00O.OooO(appCompatEditText2);
        AppCompatTextView appCompatTextView2 = OooOOOo().f49223OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.setManageLuckyNumber");
        oOO00O.OooO(appCompatTextView2);
        Switch r6 = OooOOOo().f49224OooOO0O;
        Intrinsics.checkNotNullExpressionValue(r6, "binding.setManageLuckyNumberSwitch");
        oOO00O.OooO(r6);
        Integer value = o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue();
        if (value == null || value.intValue() != 1) {
            AppCompatTextView appCompatTextView3 = OooOOOo().f49223OooOO0;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.setManageLuckyNumber");
            oOO00O.OooO00o(appCompatTextView3);
            Switch r7 = OooOOOo().f49224OooOO0O;
            Intrinsics.checkNotNullExpressionValue(r7, "binding.setManageLuckyNumberSwitch");
            oOO00O.OooO00o(r7);
        }
        if (OooOOOo().f49216OooO0O0.hasFocus()) {
            if (String.valueOf(OooOOOo().f49216OooO0O0.getText()).length() > 0) {
                AppCompatImageView appCompatImageView2 = OooOOOo().f49217OooO0OO;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                oOO00O.OooO(appCompatImageView2);
            }
        }
    }
}
