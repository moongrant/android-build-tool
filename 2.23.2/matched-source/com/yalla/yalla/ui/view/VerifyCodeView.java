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
import com.yalla.yalla.ui.activity.account.Oooo000;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import p384o0OOoo0O.o000oOoO;
import p491o0o00O0o.o0O00o00;
import p491o0o00O0o.o0OO0;
import p491o0o00O0o.o0OO00OO;
import p491o0o00O0o.o0OO00o0;
import p491o0o00O0o.o0OO0O0;
import p491o0o00O0o.o0OOooO0;
import p562o0oOo000.o00000;
import p562o0oOo000.o0Oo0oo;
import p587o0oOooOO.r2;
import p587o0oOooOO.s2;
import p587o0oOooOO.t2;
import p587o0oOooOO.u2;

/* JADX INFO: loaded from: classes4.dex */
public class VerifyCodeView extends LinearLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f30271OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f30272OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f30273OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30274OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f30275OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f30276OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f30277OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f30278OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Drawable f30279OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO00o f30280OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f30281OooOOO0;

    public interface OooO00o {
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30273OooO0Oo = 6;
        this.f30275OooO0o0 = 120;
        this.f30274OooO0o = 120;
        this.f30276OooO0oO = -16777216;
        this.f30277OooO0oo = 24;
        this.f30272OooO = 0;
        this.f30278OooOO0 = "number";
        this.f30279OooOO0O = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00000.verificationCodeView);
        this.f30273OooO0Oo = typedArrayObtainStyledAttributes.getInt(o00000.verificationCodeView_box, 6);
        this.f30272OooO = (int) typedArrayObtainStyledAttributes.getDimension(o00000.verificationCodeView_box_margin_box, 0.0f);
        typedArrayObtainStyledAttributes.getDrawable(o00000.verificationCodeView_box_bg_focus);
        this.f30279OooOO0O = typedArrayObtainStyledAttributes.getDrawable(o00000.verificationCodeView_box_bg_normal);
        this.f30278OooOO0 = typedArrayObtainStyledAttributes.getString(o00000.verificationCodeView_inputType);
        float f = 120;
        this.f30275OooO0o0 = (int) typedArrayObtainStyledAttributes.getDimension(o00000.verificationCodeView_box_width, f);
        this.f30274OooO0o = (int) typedArrayObtainStyledAttributes.getDimension(o00000.verificationCodeView_box_height, f);
        this.f30277OooO0oo = (int) typedArrayObtainStyledAttributes.getDimension(o00000.verificationCodeView_box_textSize, 24);
        this.f30276OooO0oO = typedArrayObtainStyledAttributes.getColor(o00000.verificationCodeView_box_textColor, -16777216);
        setOrientation(0);
        setLayoutDirection(0);
        r2 r2Var = new r2(this);
        s2 s2Var = new s2(this);
        int i = 0;
        while (true) {
            int i2 = this.f30273OooO0Oo;
            if (i >= i2) {
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            EditText editText = new EditText(getContext());
            int i3 = this.f30275OooO0o0;
            int i4 = this.f30274OooO0o;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i4);
            if (i != i2 - 1) {
                layoutParams.setMarginEnd(this.f30272OooO);
            }
            editText.setTextColor(this.f30276OooO0oO);
            editText.setTextSize(0, this.f30277OooO0oo);
            editText.setWidth(i3);
            editText.setHeight(i4);
            editText.setGravity(17);
            editText.setOnKeyListener(s2Var);
            editText.setIncludeFontPadding(false);
            editText.setPaddingRelative(0, 0, 0, 0);
            editText.setLayoutParams(layoutParams);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
            editText.setId(i);
            editText.setTextAlignment(4);
            editText.setTextDirection(2);
            editText.setEms(1);
            editText.setSingleLine(true);
            editText.addTextChangedListener(r2Var);
            editText.setLongClickable(false);
            if (Build.VERSION.SDK_INT >= 29) {
                editText.setTextCursorDrawable(o0Oo0oo.shape_edit_cursor);
            } else {
                Drawable drawableOooO0O0 = o0000.OooO0O0(o0Oo0oo.shape_edit_cursor);
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
            Drawable drawable = this.f30279OooOO0O;
            if (drawable != null) {
                editText.setBackground(drawable);
            }
            String str = this.f30278OooOO0;
            if ("number".equals(str)) {
                editText.setInputType(2);
            } else if ("password".equals(str)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else if (ViewHierarchyConstants.TEXT_KEY.equals(str)) {
                editText.setInputType(1);
            } else if ("phone".equals(str)) {
                editText.setInputType(3);
            }
            editText.setOnTouchListener(new t2(this, editText));
            editText.setCustomSelectionActionModeCallback(new u2());
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
            for (int i = 0; i < verifyCodeView.f30273OooO0Oo; i++) {
                String string = ((EditText) verifyCodeView.getChildAt(i)).getText().toString();
                if (string.length() == 0) {
                    break;
                }
                sb.append(string);
            }
            OooO00o oooO00o = verifyCodeView.f30280OooOO0o;
            if (oooO00o != null) {
                String string2 = sb.toString();
                SmsCodeActivity this$0 = (SmsCodeActivity) ((o0O00o00) oooO00o).f49015OooO0Oo;
                int i2 = SmsCodeActivity.f24843Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(string2);
                this$0.getClass();
                if (OooOo00.OooO00o(string2) || string2.length() != 6) {
                    return;
                }
                o000oOoO o000oooo2 = new o000oOoO(new Oooo000(this$0, string2), new o0OO0O0(this$0), new o0OOooO0(this$0), false, 8);
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ClientCodeType clientCodeType = this$0.f24848OooOo0O;
                int i3 = clientCodeType == null ? -1 : SmsCodeActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
                if (i3 == 6) {
                    this$0.OooOooo().phoneChange(this$0.f24845OooOo, string2).observe(this$0, o000oooo2);
                    return;
                }
                if (i3 == 8) {
                    this$0.OooOooo().protectionLoginByPhone(this$0.f24845OooOo, string2, this$0.getIntent().getIntExtra("IS_ACTIVATE", 0)).observe(this$0, new o000oOoO(o0OO00OO.f49042OooO0Oo, new o0OO00o0(this$0), new o0OO0(this$0), false, 8));
                } else if (i3 != 9) {
                    this$0.OooOooo().verCode(this$0.f24845OooOo, string2, this$0.OooOoo0()).observe(this$0, o000oooo2);
                } else {
                    this$0.OooOooo().postAddTrustDevice(o0OoOo0.OooO0o(0, string2), 7).observe(this$0, o000oooo2);
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
        this.f30281OooOOO0 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setOnCompleteListener(OooO00o oooO00o) {
        this.f30280OooOO0o = oooO00o;
    }
}
