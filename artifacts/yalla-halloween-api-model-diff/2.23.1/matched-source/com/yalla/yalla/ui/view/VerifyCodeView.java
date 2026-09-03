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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import p386o0OOoo0O.o0OoOo0;
import p490o0o00O0.o0O0O0Oo;
import p490o0o00O0.o0O0O0o0;
import p490o0o00O0.o0O0OO0;
import p490o0o00O0.o0O0OOO0;
import p490o0o00O0.o0O0oo0o;
import p490o0o00O0.o0oOOo;
import p546o0o0Ooo0.oO0OO00;
import p546o0o0Ooo0.oO0OO0O;
import p546o0o0Ooo0.ooOOO00O;
import p546o0o0Ooo0.ooo0o;
import p565o0oOo000.o000000O;
import p565o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public class VerifyCodeView extends LinearLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f30281OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f30282OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f30283OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30284OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f30285OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f30286OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f30287OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f30288OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Drawable f30289OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO00o f30290OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f30291OooOOO0;

    public interface OooO00o {
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30283OooO0Oo = 6;
        this.f30285OooO0o0 = 120;
        this.f30284OooO0o = 120;
        this.f30286OooO0oO = -16777216;
        this.f30287OooO0oo = 24;
        this.f30282OooO = 0;
        this.f30288OooOO0 = "number";
        this.f30289OooOO0O = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000000O.verificationCodeView);
        this.f30283OooO0Oo = typedArrayObtainStyledAttributes.getInt(o000000O.verificationCodeView_box, 6);
        this.f30282OooO = (int) typedArrayObtainStyledAttributes.getDimension(o000000O.verificationCodeView_box_margin_box, 0.0f);
        typedArrayObtainStyledAttributes.getDrawable(o000000O.verificationCodeView_box_bg_focus);
        this.f30289OooOO0O = typedArrayObtainStyledAttributes.getDrawable(o000000O.verificationCodeView_box_bg_normal);
        this.f30288OooOO0 = typedArrayObtainStyledAttributes.getString(o000000O.verificationCodeView_inputType);
        float f = 120;
        this.f30285OooO0o0 = (int) typedArrayObtainStyledAttributes.getDimension(o000000O.verificationCodeView_box_width, f);
        this.f30284OooO0o = (int) typedArrayObtainStyledAttributes.getDimension(o000000O.verificationCodeView_box_height, f);
        this.f30287OooO0oo = (int) typedArrayObtainStyledAttributes.getDimension(o000000O.verificationCodeView_box_textSize, 24);
        this.f30286OooO0oO = typedArrayObtainStyledAttributes.getColor(o000000O.verificationCodeView_box_textColor, -16777216);
        setOrientation(0);
        setLayoutDirection(0);
        ooOOO00O ooooo00o = new ooOOO00O(this);
        ooo0o ooo0oVar = new ooo0o(this);
        int i = 0;
        while (true) {
            int i2 = this.f30283OooO0Oo;
            if (i >= i2) {
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            EditText editText = new EditText(getContext());
            int i3 = this.f30285OooO0o0;
            int i4 = this.f30284OooO0o;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i4);
            if (i != i2 - 1) {
                layoutParams.setMarginEnd(this.f30282OooO);
            }
            editText.setTextColor(this.f30286OooO0oO);
            editText.setTextSize(0, this.f30287OooO0oo);
            editText.setWidth(i3);
            editText.setHeight(i4);
            editText.setGravity(17);
            editText.setOnKeyListener(ooo0oVar);
            editText.setIncludeFontPadding(false);
            editText.setPaddingRelative(0, 0, 0, 0);
            editText.setLayoutParams(layoutParams);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
            editText.setId(i);
            editText.setTextAlignment(4);
            editText.setTextDirection(2);
            editText.setEms(1);
            editText.setSingleLine(true);
            editText.addTextChangedListener(ooooo00o);
            editText.setLongClickable(false);
            if (Build.VERSION.SDK_INT >= 29) {
                editText.setTextCursorDrawable(o0OOO0o.shape_edit_cursor);
            } else {
                Drawable drawableOooO0O0 = o0000.OooO0O0(o0OOO0o.shape_edit_cursor);
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
            Drawable drawable = this.f30289OooOO0O;
            if (drawable != null) {
                editText.setBackground(drawable);
            }
            String str = this.f30288OooOO0;
            if ("number".equals(str)) {
                editText.setInputType(2);
            } else if ("password".equals(str)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else if (ViewHierarchyConstants.TEXT_KEY.equals(str)) {
                editText.setInputType(1);
            } else if ("phone".equals(str)) {
                editText.setInputType(3);
            }
            editText.setOnTouchListener(new oO0OO00(this, editText));
            editText.setCustomSelectionActionModeCallback(new oO0OO0O());
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
            for (int i = 0; i < verifyCodeView.f30283OooO0Oo; i++) {
                String string = ((EditText) verifyCodeView.getChildAt(i)).getText().toString();
                if (string.length() == 0) {
                    break;
                }
                sb.append(string);
            }
            OooO00o oooO00o = verifyCodeView.f30290OooOO0o;
            if (oooO00o != null) {
                String string2 = sb.toString();
                int i2 = SmsCodeActivity.f24845Oooo0;
                SmsCodeActivity this$0 = ((o0oOOo) oooO00o).f48864OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(string2);
                this$0.getClass();
                if (OooOo00.OooO00o(string2) || string2.length() != 6) {
                    return;
                }
                o0OoOo0 o0oooo1 = new o0OoOo0(new com.yalla.yalla.ui.activity.account.OooOo00(this$0, string2), new o0O0OO0(this$0), new o0O0OOO0(this$0), false, 8);
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ClientCodeType clientCodeType = this$0.f24850OooOo0O;
                int i3 = clientCodeType == null ? -1 : SmsCodeActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
                if (i3 == 6) {
                    this$0.OooOooo().phoneChange(this$0.f24847OooOo, string2).observe(this$0, o0oooo1);
                    return;
                }
                if (i3 == 8) {
                    this$0.OooOooo().protectionLoginByPhone(this$0.f24847OooOo, string2, this$0.getIntent().getIntExtra("IS_ACTIVATE", 0)).observe(this$0, new o0OoOo0(o0O0oo0o.f48849OooO0Oo, new o0O0O0Oo(this$0), new o0O0O0o0(this$0), false, 8));
                } else if (i3 != 9) {
                    this$0.OooOooo().verCode(this$0.f24847OooOo, string2, this$0.OooOoo0()).observe(this$0, o0oooo1);
                } else {
                    this$0.OooOooo().postAddTrustDevice(com.code.android.util.o0OoOo0.OooO0o(0, string2), 7).observe(this$0, o0oooo1);
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
        this.f30291OooOOO0 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setOnCompleteListener(OooO00o oooO00o) {
        this.f30290OooOO0o = oooO00o;
    }
}
