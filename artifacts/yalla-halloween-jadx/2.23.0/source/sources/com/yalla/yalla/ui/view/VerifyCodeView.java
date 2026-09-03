package com.yalla.yalla.ui.view;

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
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import p377o0OOoOo.o0000OO0;
import p474o0o00.o0O0000O;
import p474o0o00.o0O0OOOo;
import p474o0o00.o0O0o0;
import p474o0o00.o0O0o000;
import p474o0o00.o0O0o00O;
import p474o0o00.oo0OOoo;
import p539o0o0OoOO.m3;
import p539o0o0OoOO.n3;
import p539o0o0OoOO.o3;
import p539o0o0OoOO.p3;
import p584o0oOooO0.oO00Oo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
public class VerifyCodeView extends LinearLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f30816OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f30817OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f30818OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30819OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f30820OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f30821OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f30822OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f30823OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Drawable f30824OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO00o f30825OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f30826OooOOO0;

    public interface OooO00o {
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30818OooO0Oo = 6;
        this.f30820OooO0o0 = 120;
        this.f30819OooO0o = 120;
        this.f30821OooO0oO = -16777216;
        this.f30822OooO0oo = 24;
        this.f30817OooO = 0;
        this.f30823OooOO0 = "number";
        this.f30824OooOO0O = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO00Oo0.verificationCodeView);
        this.f30818OooO0Oo = typedArrayObtainStyledAttributes.getInt(oO00Oo0.verificationCodeView_box, 6);
        this.f30817OooO = (int) typedArrayObtainStyledAttributes.getDimension(oO00Oo0.verificationCodeView_box_margin_box, 0.0f);
        typedArrayObtainStyledAttributes.getDrawable(oO00Oo0.verificationCodeView_box_bg_focus);
        this.f30824OooOO0O = typedArrayObtainStyledAttributes.getDrawable(oO00Oo0.verificationCodeView_box_bg_normal);
        this.f30823OooOO0 = typedArrayObtainStyledAttributes.getString(oO00Oo0.verificationCodeView_inputType);
        float f = 120;
        this.f30820OooO0o0 = (int) typedArrayObtainStyledAttributes.getDimension(oO00Oo0.verificationCodeView_box_width, f);
        this.f30819OooO0o = (int) typedArrayObtainStyledAttributes.getDimension(oO00Oo0.verificationCodeView_box_height, f);
        this.f30822OooO0oo = (int) typedArrayObtainStyledAttributes.getDimension(oO00Oo0.verificationCodeView_box_textSize, 24);
        this.f30821OooO0oO = typedArrayObtainStyledAttributes.getColor(oO00Oo0.verificationCodeView_box_textColor, -16777216);
        setOrientation(0);
        setLayoutDirection(0);
        m3 m3Var = new m3(this);
        n3 n3Var = new n3(this);
        int i = 0;
        while (true) {
            int i2 = this.f30818OooO0Oo;
            if (i >= i2) {
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            EditText editText = new EditText(getContext());
            int i3 = this.f30820OooO0o0;
            int i4 = this.f30819OooO0o;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i4);
            if (i != i2 - 1) {
                layoutParams.setMarginEnd(this.f30817OooO);
            }
            editText.setTextColor(this.f30821OooO0oO);
            editText.setTextSize(0, this.f30822OooO0oo);
            editText.setWidth(i3);
            editText.setHeight(i4);
            editText.setGravity(17);
            editText.setOnKeyListener(n3Var);
            editText.setIncludeFontPadding(false);
            editText.setPaddingRelative(0, 0, 0, 0);
            editText.setLayoutParams(layoutParams);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
            editText.setId(i);
            editText.setTextAlignment(4);
            editText.setTextDirection(2);
            editText.setEms(1);
            editText.setSingleLine(true);
            editText.addTextChangedListener(m3Var);
            editText.setLongClickable(false);
            if (Build.VERSION.SDK_INT >= 29) {
                editText.setTextCursorDrawable(oOo00OO0.shape_edit_cursor);
            } else {
                Drawable drawableOooO0O0 = o0000.OooO0O0(oOo00OO0.shape_edit_cursor);
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
            Drawable drawable = this.f30824OooOO0O;
            if (drawable != null) {
                editText.setBackground(drawable);
            }
            String str = this.f30823OooOO0;
            if ("number".equals(str)) {
                editText.setInputType(2);
            } else if ("password".equals(str)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else if (ViewHierarchyConstants.TEXT_KEY.equals(str)) {
                editText.setInputType(1);
            } else if ("phone".equals(str)) {
                editText.setInputType(3);
            }
            editText.setOnTouchListener(new o3(this, editText));
            editText.setCustomSelectionActionModeCallback(new p3());
            if (i == 0) {
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                editText.requestFocus();
            }
            addView(editText, i);
            i++;
        }
    }

    public static void OooO00o(VerifyCodeView verifyCodeView) {
        if (verifyCodeView.getCurrentAmount() == verifyCodeView.getChildCount()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < verifyCodeView.f30818OooO0Oo; i++) {
                String string = ((EditText) verifyCodeView.getChildAt(i)).getText().toString();
                if (string.length() == 0) {
                    break;
                }
                sb.append(string);
            }
            OooO00o oooO00o = verifyCodeView.f30825OooOO0o;
            if (oooO00o != null) {
                String varCode = sb.toString();
                SmsCodeActivity this$0 = (SmsCodeActivity) ((o0O0000O) oooO00o).f47295OooO0Oo;
                int i2 = SmsCodeActivity.f25298Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(varCode, "varCode");
                this$0.getClass();
                if (OooOo00.OooO00o(varCode) || varCode.length() != 6) {
                    return;
                }
                o0000OO0 o0000oo1 = new o0000OO0(new com.yalla.yalla.ui.activity.account.OooOo00(this$0, varCode), new o0O0o00O(this$0), new o0O0o0(this$0), false, 8);
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ClientCodeType clientCodeType = this$0.f25303OooOo0O;
                int i3 = clientCodeType == null ? -1 : SmsCodeActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
                if (i3 == 6) {
                    this$0.OooOooo().phoneChange(this$0.f25300OooOo, varCode).observe(this$0, o0000oo1);
                    return;
                }
                if (i3 == 8) {
                    this$0.OooOooo().protectionLoginByPhone(this$0.f25300OooOo, varCode, this$0.getIntent().getIntExtra("IS_ACTIVATE", 0)).observe(this$0, new o0000OO0(o0O0OOOo.f47317OooO0Oo, new oo0OOoo(this$0), new o0O0o000(this$0), false, 8));
                } else if (i3 != 9) {
                    this$0.OooOooo().verCode(this$0.f25300OooOo, varCode, this$0.OooOoo0()).observe(this$0, o0000oo1);
                } else {
                    this$0.OooOooo().postAddTrustDevice(o0OoOo0.OooO0o(0, varCode), 7).observe(this$0, o0000oo1);
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
        this.f30826OooOOO0 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setOnCompleteListener(OooO00o oooO00o) {
        this.f30825OooOO0o = oooO00o;
    }
}
