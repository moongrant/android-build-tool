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
import p176o00OooOo.o0OOO0OO;
import p176o00OooOo.o0OOOO00;
import p176o00OooOo.o0OOOO0o;
import p176o00OooOo.o0OOo000;
import p176o00OooOo.o0o0000;
import p255o00ooO0O.o000O0O0;
import p447o0OoOo0O.o0O0OOOo;
import p536o0o0OOo0.oO000;
import p536o0o0OOo0.oO00000o;
import p536o0o0OOo0.oO0000O;
import p536o0o0OOo0.oO0000Oo;
import p536o0o0OOo0.oO0000o0;
import p536o0o0OOo0.oO000O0;

/* JADX INFO: loaded from: classes.dex */
public class VerifyCodeView extends LinearLayout {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f12156OoooOoO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12157Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f12158OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f12159OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12160OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f12161OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f12162OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Drawable f12163OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO00o f12164OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f12165OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public String f12166o000oOoO;

    public interface OooO00o {
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12157Oooo = 6;
        this.f12160OoooO00 = 120;
        this.f12159OoooO0 = 120;
        this.f12161OoooO0O = -16777216;
        this.f12158OoooO = 24;
        this.f12162OoooOO0 = 0;
        this.f12166o000oOoO = "number";
        this.f12163OoooOOO = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0OOOo.verificationCodeView);
        this.f12157Oooo = typedArrayObtainStyledAttributes.getInt(0, this.f12157Oooo);
        this.f12162OoooOO0 = (int) typedArrayObtainStyledAttributes.getDimension(4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        typedArrayObtainStyledAttributes.getDrawable(1);
        this.f12163OoooOOO = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f12166o000oOoO = typedArrayObtainStyledAttributes.getString(8);
        this.f12160OoooO00 = (int) typedArrayObtainStyledAttributes.getDimension(7, this.f12160OoooO00);
        this.f12159OoooO0 = (int) typedArrayObtainStyledAttributes.getDimension(3, this.f12159OoooO0);
        this.f12158OoooO = (int) typedArrayObtainStyledAttributes.getDimension(6, this.f12158OoooO);
        this.f12161OoooO0O = typedArrayObtainStyledAttributes.getColor(5, this.f12161OoooO0O);
        setOrientation(0);
        setLayoutDirection(0);
        o0OOOO00 o0oooo01 = new o0OOOO00(this);
        o0OOOO0o o0oooo0o2 = new o0OOOO0o(this);
        for (int i = 0; i < this.f12157Oooo; i++) {
            EditText editText = new EditText(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f12160OoooO00, this.f12159OoooO0);
            if (i != this.f12157Oooo - 1) {
                layoutParams.setMarginEnd(this.f12162OoooOO0);
            }
            editText.setTextColor(this.f12161OoooO0O);
            editText.setTextSize(0, this.f12158OoooO);
            editText.setWidth(this.f12160OoooO00);
            editText.setHeight(this.f12159OoooO0);
            editText.setGravity(17);
            editText.setOnKeyListener(o0oooo0o2);
            editText.setIncludeFontPadding(false);
            editText.setPaddingRelative(0, 0, 0, 0);
            editText.setLayoutParams(layoutParams);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
            editText.setId(i);
            editText.setTextAlignment(4);
            editText.setTextDirection(2);
            editText.setEms(1);
            editText.setSingleLine(true);
            editText.addTextChangedListener(o0oooo01);
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
            Drawable drawable = this.f12163OoooOOO;
            if (drawable != null) {
                editText.setBackground(drawable);
            }
            if ("number".equals(this.f12166o000oOoO)) {
                editText.setInputType(2);
            } else if ("password".equals(this.f12166o000oOoO)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else if (ViewHierarchyConstants.TEXT_KEY.equals(this.f12166o000oOoO)) {
                editText.setInputType(1);
            } else if ("phone".equals(this.f12166o000oOoO)) {
                editText.setInputType(3);
            }
            editText.setOnTouchListener(new o0OOo000(this, editText));
            editText.setCustomSelectionActionModeCallback(new o0o0000());
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
            for (int i = 0; i < verifyCodeView.f12157Oooo; i++) {
                String string = ((EditText) verifyCodeView.getChildAt(i)).getText().toString();
                if (string.length() == 0) {
                    break;
                }
                sb.append(string);
            }
            OooO00o oooO00o = verifyCodeView.f12164OoooOOo;
            if (oooO00o != null) {
                String varCode = sb.toString();
                SmsCodeActivity this$0 = (SmsCodeActivity) ((o0OOO0OO) oooO00o).f32769Oooo;
                SmsCodeActivity.OooO00o oooO00o2 = SmsCodeActivity.f21864oo000o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(varCode, "varCode");
                Objects.requireNonNull(this$0);
                if (com.yalla.support.common.util.OooO0OO.OooO00o(varCode) || varCode.length() != 6) {
                    return;
                }
                OooOo oooOo = new OooOo(new oO0000o0(this$0, varCode), new oO000(this$0), new oO000O0(this$0), false, 8);
                BaseActivityK.OooOoo0(this$0, null, 0L, 3, null);
                ClientCodeType clientCodeType = this$0.f21869Oooooo0;
                int i2 = clientCodeType == null ? -1 : SmsCodeActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
                if (i2 == 6) {
                    this$0.Oooo0O0().phoneChange(this$0.f21870OoooooO, varCode).observe(this$0, oooOo);
                    return;
                }
                if (i2 == 8) {
                    this$0.Oooo0O0().protectionLoginByPhone(this$0.f21870OoooooO, varCode, this$0.getIntent().getIntExtra("IS_ACTIVATE", 0)).observe(this$0, new OooOo(oO00000o.f43621Oooo, new oO0000O(this$0), new oO0000Oo(this$0), false, 8));
                } else if (i2 != 9) {
                    this$0.Oooo0O0().verCode(this$0.f21870OoooooO, varCode, this$0.Oooo00O()).observe(this$0, oooOo);
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
        this.f12165OoooOo0 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setOnCompleteListener(OooO00o oooO00o) {
        this.f12164OoooOOo = oooO00o;
    }
}
