package com.app.base.framework.view.editTextSpan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.HashMap;
import java.util.Map;
import p150o00Oo0Oo.OooOOO;
import p150o00Oo0Oo.OooOOOO;
import p150o00Oo0Oo.OooOo;
import p150o00Oo0Oo.OooOo00;
import p150o00Oo0Oo.Oooo000;
import p150o00Oo0Oo.o000oOoO;
import p150o00Oo0Oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class EditTextSpan extends EditText {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooOOOO f11729Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Map<String, String> f11730Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f11731Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Oooo000 f11732Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public o0OoOo0 f11733OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO00o f11734OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o000oOoO f11735OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f11736OoooO0O;

    public interface OooO00o {
        void OooO00o();
    }

    public EditTextSpan(Context context) {
        super(context);
        this.f11730Oooo0o = new HashMap();
        this.f11731Oooo0oO = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f11732Oooo0oo = null;
        this.f11729Oooo = null;
        this.f11736OoooO0O = false;
        OooO0OO();
    }

    public final int OooO00o(String str, OooOo oooOo) {
        int length;
        int selectionStart = getSelectionStart();
        if (!TextUtils.isEmpty(str)) {
            getMaskKeys().put(str, str);
        }
        oooOo.f32175OoooO0 = str;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(str);
        sbOooO0o0.append(oooOo.f32172Oooo0o);
        String string = sbOooO0o0.toString();
        if (TextUtils.isEmpty(string)) {
            length = selectionStart;
        } else {
            length = string.length() + selectionStart;
            getText().insert(selectionStart, string);
            OooOOOO oooOOOO = this.f11729Oooo;
            if (oooOOOO != null) {
                oooOOOO.OooO0OO(getText(), selectionStart, length);
            }
        }
        oooOo.f32171Oooo = selectionStart;
        oooOo.f32176OoooO00 = length;
        o000oOoO spanManager = getSpanManager();
        spanManager.OooO0O0();
        spanManager.f32178OooO00o.add(oooOo);
        getText().insert(getSelectionEnd(), getEnd_());
        return length;
    }

    public final void OooO0O0() {
        getSpanManager().OooO00o();
        setText("");
        getMaskKeys().clear();
    }

    public final void OooO0OO() {
        getSpanManager();
        addTextChangedListener(new OooOOO(this));
    }

    public String getEnd_() {
        if (this.f11731Oooo0oO == null) {
            this.f11731Oooo0oO = "";
        }
        return this.f11731Oooo0oO;
    }

    public Map<String, String> getMaskKeys() {
        if (this.f11730Oooo0o == null) {
            this.f11730Oooo0o = new HashMap();
        }
        return this.f11730Oooo0o;
    }

    public Oooo000 getSpanKeyListener() {
        return this.f11732Oooo0oo;
    }

    public o000oOoO getSpanManager() {
        if (this.f11735OoooO00 == null) {
            this.f11735OoooO00 = new o000oOoO();
        }
        return this.f11735OoooO00;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f11736OoooO0O;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new OooOo00(super.onCreateInputConnection(editorInfo), this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        OooO00o oooO00o;
        if (i != 4 || (oooO00o = this.f11734OoooO0) == null) {
            return false;
        }
        oooO00o.OooO00o();
        return false;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getSpanManager().OooO0oO(i, i2)) {
            return;
        }
        OooOo oooOoOooO0o0 = getSpanManager().OooO0o0(i, i2);
        if (oooOoOooO0o0 != null && oooOoOooO0o0.f32176OoooO00 == i2) {
            this.f11736OoooO0O = false;
        }
        OooOo oooOoOooO0o = getSpanManager().OooO0o(i, i2);
        if (oooOoOooO0o != null) {
            try {
                if (i == i2) {
                    if (oooOoOooO0o.OooO00o(i) < 0 || oooOoOooO0o.OooO00o(i) >= getSelectionEnd()) {
                        setSelection(0);
                        return;
                    } else {
                        setSelection(oooOoOooO0o.OooO00o(i));
                        return;
                    }
                }
                int i3 = oooOoOooO0o.f32176OoooO00;
                if (i2 < i3) {
                    setSelection(i, i3);
                }
                int i4 = oooOoOooO0o.f32171Oooo;
                if (i > i4) {
                    setSelection(i4, i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
                setSelection(0);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        o0OoOo0 o0oooo1 = this.f11733OoooO;
        if (o0oooo1 != null) {
            o0oooo1.OooO00o();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        rect.offset(20, 20);
        return super.requestRectangleOnScreen(rect, z);
    }

    public void setBackListener(OooO00o oooO00o) {
        this.f11734OoooO0 = oooO00o;
    }

    public void setEditTextSpanTouchEventListener(o0OoOo0 o0oooo1) {
        this.f11733OoooO = o0oooo1;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        this.f11736OoooO0O = z;
    }

    public EditTextSpan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11730Oooo0o = new HashMap();
        this.f11731Oooo0oO = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f11732Oooo0oo = null;
        this.f11729Oooo = null;
        this.f11736OoooO0O = false;
        OooO0OO();
    }

    public EditTextSpan(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11730Oooo0o = new HashMap();
        this.f11731Oooo0oO = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f11732Oooo0oo = null;
        this.f11729Oooo = null;
        this.f11736OoooO0O = false;
        OooO0OO();
    }
}
