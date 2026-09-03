package com.app.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.OooOo;
import p175o00OooOo.o0OOO0;
import p175o00OooOo.o0OOO00;
import p175o00OooOo.o0OOO0OO;
import p175o00OooOo.o0OOOO00;
import p175o00OooOo.o0OOOO0o;
import p254o00ooO0O.o000O0O0;
import p444o0OoOo0O.o0O0OO0;
import p534o0o0OOo0.oO000;
import p534o0o0OOo0.oO0000Oo;
import p534o0o0OOo0.oO0000o0;
import p534o0o0OOo0.oO000O0;
import p534o0o0OOo0.oO000O0O;
import p534o0o0OOo0.oO0Ooooo;

/* JADX INFO: loaded from: classes.dex */
public class VerifyCodeView extends LinearLayout {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f12141OoooOOO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12142Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f12143Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12144Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f12145Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Drawable f12146OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f12147OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12148OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public String f12149OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooO00o f12150OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f12151o000oOoO;

    public interface OooO00o {
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12143Oooo0o = 6;
        this.f12144Oooo0oO = 120;
        this.f12145Oooo0oo = 120;
        this.f12142Oooo = -16777216;
        this.f12148OoooO00 = 24;
        this.f12147OoooO0 = 0;
        this.f12149OoooO0O = "number";
        this.f12146OoooO = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0OO0.verificationCodeView);
        this.f12143Oooo0o = typedArrayObtainStyledAttributes.getInt(0, this.f12143Oooo0o);
        this.f12147OoooO0 = (int) typedArrayObtainStyledAttributes.getDimension(4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        typedArrayObtainStyledAttributes.getDrawable(1);
        this.f12146OoooO = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f12149OoooO0O = typedArrayObtainStyledAttributes.getString(8);
        this.f12144Oooo0oO = (int) typedArrayObtainStyledAttributes.getDimension(7, this.f12144Oooo0oO);
        this.f12145Oooo0oo = (int) typedArrayObtainStyledAttributes.getDimension(3, this.f12145Oooo0oo);
        this.f12148OoooO00 = (int) typedArrayObtainStyledAttributes.getDimension(6, this.f12148OoooO00);
        this.f12142Oooo = typedArrayObtainStyledAttributes.getColor(5, this.f12142Oooo);
        setOrientation(0);
        setLayoutDirection(0);
        o0OOO0 o0ooo1 = new o0OOO0(this);
        o0OOO0OO o0ooo0oo2 = new o0OOO0OO(this);
        for (int i = 0; i < this.f12143Oooo0o; i++) {
            EditText editText = new EditText(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f12144Oooo0oO, this.f12145Oooo0oo);
            if (i != this.f12143Oooo0o - 1) {
                layoutParams.setMarginEnd(this.f12147OoooO0);
            }
            editText.setTextColor(this.f12142Oooo);
            editText.setTextSize(0, this.f12148OoooO00);
            editText.setWidth(this.f12144Oooo0oO);
            editText.setHeight(this.f12145Oooo0oo);
            editText.setGravity(17);
            editText.setOnKeyListener(o0ooo0oo2);
            editText.setIncludeFontPadding(false);
            editText.setPaddingRelative(0, 0, 0, 0);
            editText.setLayoutParams(layoutParams);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
            editText.setId(i);
            editText.setTextAlignment(4);
            editText.setTextDirection(2);
            editText.setEms(1);
            editText.setSingleLine(true);
            editText.addTextChangedListener(o0ooo1);
            editText.setLongClickable(false);
            if (Build.VERSION.SDK_INT >= 29) {
                editText.setTextCursorDrawable(R.drawable.shape_edit_cursor);
            } else {
                Drawable drawableOooO0O0 = o000O0O0.OooO0O0(R.drawable.shape_edit_cursor);
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    declaredField.getInt(editText);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(editText);
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, drawableOooO0O0);
                } catch (Throwable unused) {
                }
            }
            Drawable drawable = this.f12146OoooO;
            if (drawable != null) {
                editText.setBackground(drawable);
            }
            if ("number".equals(this.f12149OoooO0O)) {
                editText.setInputType(2);
            } else if ("password".equals(this.f12149OoooO0O)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else if (ViewHierarchyConstants.TEXT_KEY.equals(this.f12149OoooO0O)) {
                editText.setInputType(1);
            } else if ("phone".equals(this.f12149OoooO0O)) {
                editText.setInputType(3);
            }
            editText.setOnTouchListener(new o0OOOO00(this, editText));
            editText.setCustomSelectionActionModeCallback(new o0OOOO0o());
            if (i == 0) {
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                editText.requestFocus();
            }
            addView(editText, i);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void OooO00o(VerifyCodeView verifyCodeView) {
        if (verifyCodeView.getCurrentAmount() == verifyCodeView.getChildCount()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < verifyCodeView.f12143Oooo0o; i++) {
                String string = ((EditText) verifyCodeView.getChildAt(i)).getText().toString();
                if (string.length() == 0) {
                    break;
                }
                sb.append(string);
            }
            OooO00o oooO00o = verifyCodeView.f12150OoooOO0;
            if (oooO00o != null) {
                String varCode = sb.toString();
                SmsCodeActivity this$0 = (SmsCodeActivity) ((o0OOO00) oooO00o).f32749OooO0Oo;
                SmsCodeActivity.OooO00o oooO00o2 = SmsCodeActivity.f21845o00Ooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(varCode, "varCode");
                Objects.requireNonNull(this$0);
                if (com.yalla.support.common.util.OooO0OO.OooO00o(varCode) || varCode.length() != 6) {
                    return;
                }
                OooOo oooOo = new OooOo(new oO000O0(this$0, varCode), new oO000O0O(this$0), new oO0Ooooo(this$0), false, 8);
                BaseActivityK.OooOoo0(this$0, null, 0L, 3, null);
                ClientCodeType clientCodeType = this$0.f21849OooooO0;
                int i2 = clientCodeType == null ? -1 : SmsCodeActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
                if (i2 == 6) {
                    this$0.Oooo0O0().phoneChange(this$0.f21851OooooOo, varCode).observe(this$0, oooOo);
                    return;
                }
                if (i2 == 8) {
                    this$0.Oooo0O0().protectionLoginByPhone(this$0.f21851OooooOo, varCode, this$0.getIntent().getIntExtra("IS_ACTIVATE", 0)).observe(this$0, new OooOo(oO0000Oo.f43609Oooo0o, new oO0000o0(this$0), new oO000(this$0), false, 8));
                } else if (i2 != 9) {
                    this$0.Oooo0O0().verCode(this$0.f21851OooooOo, varCode, this$0.Oooo00O()).observe(this$0, oooOo);
                } else {
                    this$0.Oooo0O0().postAddTrustDevice(com.yalla.support.common.util.OooO.OooO0o0(varCode), 7).observe(this$0, oooOo);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsertionDisabled(EditText editText) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(editText);
            Class<?> cls = Class.forName("android.widget.Editor");
            Field declaredField2 = cls.getDeclaredField("mInsertionControllerEnabled");
            declaredField2.setAccessible(true);
            Boolean bool = Boolean.FALSE;
            declaredField2.set(obj, bool);
            Field declaredField3 = cls.getDeclaredField("mSelectionControllerEnabled");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, bool);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0OO() {
        int childCount = getChildCount();
        int currentAmount = getCurrentAmount();
        for (int i = 0; i < childCount; i++) {
            EditText editText = (EditText) getChildAt(i);
            if (i != currentAmount) {
                editText.setFocusable(false);
                editText.setFocusableInTouchMode(false);
                editText.clearFocus();
            } else {
                editText.setFocusableInTouchMode(true);
                editText.setFocusable(true);
                editText.requestFocus();
            }
        }
    }

    public final void OooO0Oo() {
        int childCount = getChildCount();
        int currentAmount = getCurrentAmount();
        if (currentAmount != childCount) {
            OooO0OO();
            return;
        }
        EditText editText = (EditText) getChildAt(currentAmount - 1);
        editText.setFocusableInTouchMode(true);
        editText.setFocusable(true);
        editText.requestFocus();
    }

    public int getCurrentAmount() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((EditText) getChildAt(i)).getText().length() == 0) {
                return i;
            }
        }
        return childCount;
    }

    public void setBackgroundErrorResource(@DrawableRes int i) {
        this.f12151o000oOoO = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setOnCompleteListener(OooO00o oooO00o) {
        this.f12150OoooOO0 = oooO00o;
    }
}
