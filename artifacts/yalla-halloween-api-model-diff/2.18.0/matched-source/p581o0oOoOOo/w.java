package p581o0oOoOOo;

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
import p169o00Ooo0.o000OOo;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.oOO00O;
import p256o00ooO0o.o00O00OO;
import p472o0Oooo0.o00O000;
import p517o0o0O00.o00O00;
import p532o0o0OOO.o00OO0O0;
import p608o0oo0O.OooOo;
import p627o0oo0oo.o000OO0O;
import p651o0ooOOoo.d8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class w extends o00O00OO<w> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f46351OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46352OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f46353OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f46354OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f46355OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f46356OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f46357OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f46358OooOOO0;

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            AppCompatEditText view = w.this.OooOOOo().f49153OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
            w.this.OooOOO(iIntValue);
            w wVar = w.this;
            wVar.OooOOOO(String.valueOf(wVar.OooOOOo().f49153OooO0O0.getText()).length() > iIntValue, true);
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
            int i = w.this.OooOOOo().f49158OooO0oO.currCost;
            int i2 = w.this.OooOOOo().f49158OooO0oO.currRange;
            boolean zIsChecked = w.this.OooOOOo().f49151OooO.isChecked();
            String strValueOf = String.valueOf(w.this.OooOOOo().f49153OooO0O0.getText());
            boolean zIsChecked2 = w.this.OooOOOo().f49161OooOO0O.isChecked();
            if (strValueOf.length() > i2) {
                w.this.OooOOOO(true, false);
            } else {
                Intrinsics.checkNotNullParameter(strValueOf, "<this>");
                try {
                    j = Long.parseLong(strValueOf);
                } catch (NumberFormatException unused) {
                    j = -1;
                }
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("房间幸运数字-房主\ncurrCost:'");
                sbOooO0O0.append(w.this.f46355OooOO0O);
                sbOooO0O0.append("', currRange:'");
                sbOooO0O0.append(w.this.f46356OooOO0o);
                sbOooO0O0.append("', currLuckyNumber:'");
                sbOooO0O0.append(w.this.f46357OooOOO);
                sbOooO0O0.append("', currSettableFromManage:'");
                sbOooO0O0.append(w.this.f46358OooOOO0);
                sbOooO0O0.append("'\nnewCost:'");
                sbOooO0O0.append(i);
                sbOooO0O0.append("', newRange:'");
                sbOooO0O0.append(i2);
                sbOooO0O0.append("', newLuckyNumberStr:'");
                sbOooO0O0.append(strValueOf);
                sbOooO0O0.append("', newLuckyNumberSettableFromManage:'");
                sbOooO0O0.append(zIsChecked2);
                sbOooO0O0.append("', newLuckyNumberSettable:'");
                sbOooO0O0.append(zIsChecked);
                sbOooO0O0.append('\'');
                o00O00.OooO0O0(sbOooO0O0.toString());
                Integer value = o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.getValue();
                if (value != null && value.intValue() == 1) {
                    if (zIsChecked) {
                        if (strValueOf.length() == 0) {
                            w.this.OooOOOO(true, false);
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = -1;
                    }
                    p160o00OoOO.o00O000.OooO().OooO0o0(i, i2, j2, zIsChecked2);
                    w.this.OooO0Oo();
                } else if (value != null && value.intValue() == 2) {
                    if (strValueOf.length() == 0) {
                        w.this.OooOOOO(true, false);
                    } else {
                        p160o00OoOO.o00O000 o00o000OooO = p160o00OoOO.o00O000.OooO();
                        w wVar = w.this;
                        o00o000OooO.OooO0o0(wVar.f46355OooOO0O, wVar.f46356OooOO0o, j, wVar.f46358OooOOO0);
                        w.this.OooO0Oo();
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
            AppCompatEditText view2 = w.this.OooOOOo().f49153OooO0O0;
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
            new RoomLuckyNumberHistoryDialog(w.this.f46352OooO0oO).OooOOO0();
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
            w.this.OooOOOo().f49153OooO0O0.setText("");
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
            AppCompatEditText view = w.this.OooOOOo().f49153OooO0O0;
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
                w wVar = w.this;
                wVar.OooOOOO(charSequence2.length() > wVar.OooOOOo().f49158OooO0oO.currRange, true);
                if (wVar.OooOOOo().f49153OooO0O0.hasFocus()) {
                    if (charSequence2.length() > 0) {
                        AppCompatImageView appCompatImageView = wVar.OooOOOo().f49154OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
                        oOO00O.OooO(appCompatImageView);
                    } else {
                        AppCompatImageView appCompatImageView2 = wVar.OooOOOo().f49154OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                        oOO00O.OooO00o(appCompatImageView2);
                    }
                } else {
                    AppCompatImageView appCompatImageView3 = wVar.OooOOOo().f49154OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.editNumberClear");
                    oOO00O.OooO00o(appCompatImageView3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<d8> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d8 invoke() {
            d8 d8VarInflate = d8.inflate(LayoutInflater.from(w.this.f34221OooO00o), w.this.f34223OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(d8VarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            return d8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46352OooO0oO = activity;
        this.f46353OooO0oo = LazyKt.lazy(new OooOOO0());
        this.f46351OooO = R.drawable.bgs_button_2a2b3e_r8;
        this.f46354OooOO0 = R.drawable.bgs_button_2a2b3e_stroke_fe6c6c_r8;
        ConstraintLayout constraintLayout = OooOOOo().f49152OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oo(constraintLayout);
        Window windowOooO0o0 = OooO0o0();
        if (windowOooO0o0 != null) {
            windowOooO0o0.setGravity(80);
        }
        Window window = this.f34222OooO0O0.getWindow();
        if (window != null) {
            window.setDimAmount(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        ConstraintLayout constraintLayout2 = OooOOOo().f49156OooO0o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.layout");
        o00O0O.OooO0Oo(constraintLayout2, new OooO0O0());
        ImageView imageView = OooOOOo().f49157OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.history");
        o00O0O.OooO0Oo(imageView, new OooO0OO());
        AppCompatImageView appCompatImageView = OooOOOo().f49154OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
        o00O0O.OooO0Oo(appCompatImageView, new OooO0o());
        OooOOOo().f49151OooO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0oOoOOo.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                w this$0 = this.f46349OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOo.OooO0O0("102239");
                AppCompatEditText view = this$0.OooOOOo().f49153OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.editNumber");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
                if (!z) {
                    this$0.OooOOOo().f49161OooOO0O.setChecked(false);
                }
                this$0.OooOOo0(z);
            }
        });
        OooOOOo().f49161OooOO0O.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0oOoOOo.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                w this$0 = this.f46347OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOo.OooO0O0("102241");
                AppCompatEditText view = this$0.OooOOOo().f49153OooO0O0;
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
        OooOOOo().f49158OooO0oO.setRangeListener(new OooO());
        OooOOOo().f49158OooO0oO.setCostListener(new OooOO0());
        AppCompatEditText appCompatEditText = OooOOOo().f49153OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
        o000oOoO o000oooo2 = new o000oOoO();
        OooOO0O listener = new OooOO0O();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oooo2.f20529Oooo = listener;
        appCompatEditText.addTextChangedListener(o000oooo2);
        OooOOOo().f49153OooO0O0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0oOoOOo.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                w this$0 = this.f46340Oooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z) {
                    if (String.valueOf(this$0.OooOOOo().f49153OooO0O0.getText()).length() > 0) {
                        AppCompatImageView appCompatImageView2 = this$0.OooOOOo().f49154OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                        oOO00O.OooO(appCompatImageView2);
                        return;
                    }
                }
                AppCompatImageView appCompatImageView3 = this$0.OooOOOo().f49154OooO0OO;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.editNumberClear");
                oOO00O.OooO00o(appCompatImageView3);
            }
        });
        AppCompatTextView appCompatTextView = OooOOOo().f49162OooOO0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.submit");
        o00O0O.OooO0Oo(appCompatTextView, new OooO00o());
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
        Integer value = oooO00o.OooO00o().OooO0oO().getValue();
        this.f46355OooOO0O = (value == null ? 0 : value).intValue();
        Integer value2 = oooO00o.OooO00o().OooO().getValue();
        this.f46356OooOO0o = (value2 == null ? 1 : value2).intValue();
        Boolean value3 = oooO00o.OooO00o().OooOO0O().getValue();
        this.f46358OooOOO0 = (value3 == null ? Boolean.FALSE : value3).booleanValue();
        Long value4 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f46357OooOOO = (value4 == null ? -1L : value4).longValue();
    }

    public final void OooOOO(int i) {
        String str;
        OooOOOo().f49153OooO0O0.setFilters(new InputFilter[]{new o000OOo(), new InputFilter.LengthFilter(i)});
        if (i != 2) {
            str = i != 3 ? "9" : "999";
        } else {
            str = "99";
        }
        Integer value = o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.getValue();
        if (value != null && value.intValue() == 1) {
            OooOOOo().f49153OooO0O0.setHint(o000OO0O.OooO00o(o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_host), str));
            OooOOOo().f49155OooO0Oo.setText(o000OO0O.OooO00o(o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_host), str));
        } else if (value != null && value.intValue() == 2) {
            OooOOOo().f49153OooO0O0.setHint(o000OO0O.OooO00o(o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_manage), str));
            OooOOOo().f49155OooO0Oo.setText(o000OO0O.OooO00o(o000O0O0.OooO0OO(R.string.room_lucky_number_set_lucky_numbers_edit_hint_xxx_for_manage), str));
        }
    }

    @Override // p251o00oo0oO.o000O000
    public final void OooOOO0() {
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
        Integer value = oooO00o.OooO00o().OooOO0().getValue();
        if (value == null) {
            return;
        }
        if (value.intValue() != 1) {
            return;
        }
        Integer value2 = oooO00o.OooO00o().OooO0oO().getValue();
        this.f46355OooOO0O = value2 == null ? 0 : value2.intValue();
        Integer value3 = oooO00o.OooO00o().OooO().getValue();
        this.f46356OooOO0o = value3 == null ? 1 : value3.intValue();
        Boolean value4 = oooO00o.OooO00o().OooOO0O().getValue();
        this.f46358OooOOO0 = value4 == null ? false : value4.booleanValue();
        Long value5 = oooO00o.OooO00o().OooO0oo().getValue();
        this.f46357OooOOO = value5 == null ? -1L : value5.longValue();
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("房间幸运数字-show\ncurrCost:'");
        sbOooO0O0.append(this.f46355OooOO0O);
        sbOooO0O0.append("'\ncurrRange:'");
        sbOooO0O0.append(this.f46356OooOO0o);
        sbOooO0O0.append("'\ncurrSettableForManage:'");
        sbOooO0O0.append(this.f46358OooOOO0);
        sbOooO0O0.append("'\ncurrLuckyNumber:'");
        sbOooO0O0.append(this.f46357OooOOO);
        sbOooO0O0.append('\'');
        o00O00.OooO0O0(sbOooO0O0.toString());
        SetLuckyNumberLayout setLuckyNumberLayout = OooOOOo().f49158OooO0oO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberLayout, "binding.numberSetting");
        oOO00O.OooO00o(setLuckyNumberLayout);
        AppCompatTextView appCompatTextView = OooOOOo().f49159OooO0oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.setLuckyNumber");
        oOO00O.OooO(appCompatTextView);
        Switch r1 = OooOOOo().f49151OooO;
        Intrinsics.checkNotNullExpressionValue(r1, "binding.setLuckyNumberSwitch");
        oOO00O.OooO00o(r1);
        AppCompatEditText appCompatEditText = OooOOOo().f49153OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
        oOO00O.OooO(appCompatEditText);
        AppCompatTextView appCompatTextView2 = OooOOOo().f49160OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.setManageLuckyNumber");
        oOO00O.OooO00o(appCompatTextView2);
        Switch r2 = OooOOOo().f49161OooOO0O;
        Intrinsics.checkNotNullExpressionValue(r2, "binding.setManageLuckyNumberSwitch");
        oOO00O.OooO00o(r2);
        OooOOOo().f49158OooO0oO.OooO0Oo(this.f46355OooOO0O);
        OooOOOo().f49158OooO0oO.OooO0o0(this.f46356OooOO0o);
        OooOOOo().f49151OooO.setChecked(this.f46357OooOOO > -1);
        OooOOOo().f49161OooOO0O.setChecked(this.f46358OooOOO0);
        if (this.f46357OooOOO > -1) {
            OooOOOo().f49153OooO0O0.setText(String.valueOf(this.f46357OooOOO));
        }
        OooOOO(this.f46356OooOO0o);
        Integer value6 = oooO00o.OooO00o().f43354OooOOOO.getValue();
        if (value6 == null || value6.intValue() != 1) {
            if (value6 != null && value6.intValue() == 2) {
                super.OooOOO0();
                return;
            }
            return;
        }
        SetLuckyNumberLayout setLuckyNumberLayout2 = OooOOOo().f49158OooO0oO;
        Intrinsics.checkNotNullExpressionValue(setLuckyNumberLayout2, "binding.numberSetting");
        oOO00O.OooO(setLuckyNumberLayout2);
        Switch r0 = OooOOOo().f49151OooO;
        Intrinsics.checkNotNullExpressionValue(r0, "binding.setLuckyNumberSwitch");
        oOO00O.OooO(r0);
        OooOOo0(this.f46357OooOOO > -1);
        super.OooOOO0();
    }

    public final void OooOOOO(boolean z, boolean z2) {
        if (z) {
            AppCompatTextView appCompatTextView = OooOOOo().f49155OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.editNumberWarning");
            oOO00O.OooO(appCompatTextView);
            OooOOOo().f49153OooO0O0.setBackgroundResource(this.f46354OooOO0);
            if (z2) {
                OooOOOo().f49162OooOO0o.setEnabled(false);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = OooOOOo().f49155OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.editNumberWarning");
        oOO00O.OooO00o(appCompatTextView2);
        OooOOOo().f49153OooO0O0.setBackgroundResource(this.f46351OooO);
        if (z2) {
            OooOOOo().f49162OooOO0o.setEnabled(true);
        }
    }

    public final d8 OooOOOo() {
        return (d8) this.f46353OooO0oo.getValue();
    }

    public final void OooOOo0(boolean z) {
        if (!z) {
            AppCompatEditText appCompatEditText = OooOOOo().f49153OooO0O0;
            Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.editNumber");
            oOO00O.OooO00o(appCompatEditText);
            AppCompatImageView appCompatImageView = OooOOOo().f49154OooO0OO;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
            oOO00O.OooO00o(appCompatImageView);
            AppCompatTextView appCompatTextView = OooOOOo().f49160OooOO0;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.setManageLuckyNumber");
            oOO00O.OooO00o(appCompatTextView);
            Switch r5 = OooOOOo().f49161OooOO0O;
            Intrinsics.checkNotNullExpressionValue(r5, "binding.setManageLuckyNumberSwitch");
            oOO00O.OooO00o(r5);
            return;
        }
        AppCompatEditText appCompatEditText2 = OooOOOo().f49153OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText2, "binding.editNumber");
        oOO00O.OooO(appCompatEditText2);
        AppCompatTextView appCompatTextView2 = OooOOOo().f49160OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.setManageLuckyNumber");
        oOO00O.OooO(appCompatTextView2);
        Switch r6 = OooOOOo().f49161OooOO0O;
        Intrinsics.checkNotNullExpressionValue(r6, "binding.setManageLuckyNumberSwitch");
        oOO00O.OooO(r6);
        Integer value = o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.getValue();
        if (value == null || value.intValue() != 1) {
            AppCompatTextView appCompatTextView3 = OooOOOo().f49160OooOO0;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.setManageLuckyNumber");
            oOO00O.OooO00o(appCompatTextView3);
            Switch r7 = OooOOOo().f49161OooOO0O;
            Intrinsics.checkNotNullExpressionValue(r7, "binding.setManageLuckyNumberSwitch");
            oOO00O.OooO00o(r7);
        }
        if (OooOOOo().f49153OooO0O0.hasFocus()) {
            if (String.valueOf(OooOOOo().f49153OooO0O0.getText()).length() > 0) {
                AppCompatImageView appCompatImageView2 = OooOOOo().f49154OooO0OO;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                oOO00O.OooO(appCompatImageView2);
            }
        }
    }
}
