package com.yalla.yalla.ui.view.editTextSpan;

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
import p039OoooOoo.o00OO;
import p585o0oOooOO.e;
import p585o0oOooOO.f;
import p585o0oOooOO.g;
import p585o0oOooOO.h;
import p585o0oOooOO.i;
import p585o0oOooOO.k;
import p585o0oOooOO.l;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
public class EditTextSpan extends EditText {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f30970OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap f30971OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public i f30972OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f30973OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public f f30974OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public k f30975OooO0oo;

    public interface OooO00o {
    }

    public EditTextSpan(Context context) {
        super(context);
        this.f30971OooO0Oo = new HashMap();
        this.f30973OooO0o0 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30972OooO0o = null;
        this.f30974OooO0oO = null;
        this.f30970OooO = false;
        getSpanManager();
        addTextChangedListener(new e(this));
    }

    public final void OooO00o(String str, h hVar) {
        int length;
        int selectionStart = getSelectionStart();
        if (!TextUtils.isEmpty(str)) {
            getMaskKeys().put(str, str);
        }
        hVar.f56768OooO = str;
        StringBuilder sbOooO00o = o00OO.OooO00o(str);
        sbOooO00o.append(hVar.f56769OooO0Oo);
        String string = sbOooO00o.toString();
        if (TextUtils.isEmpty(string)) {
            length = selectionStart;
        } else {
            length = string.length() + selectionStart;
            getText().insert(selectionStart, string);
            f fVar = this.f30974OooO0oO;
            if (fVar != null) {
                fVar.OooO00o(getText(), selectionStart, length);
            }
        }
        hVar.f56772OooO0oO = selectionStart;
        hVar.f56773OooO0oo = length;
        k spanManager = getSpanManager();
        spanManager.OooO00o();
        spanManager.f56774OooO00o.add(hVar);
        getText().insert(getSelectionEnd(), getEnd_());
    }

    public String getEnd_() {
        if (this.f30973OooO0o0 == null) {
            this.f30973OooO0o0 = "";
        }
        return this.f30973OooO0o0;
    }

    public Map<String, String> getMaskKeys() {
        if (this.f30971OooO0Oo == null) {
            this.f30971OooO0Oo = new HashMap();
        }
        return this.f30971OooO0Oo;
    }

    public i getSpanKeyListener() {
        return this.f30972OooO0o;
    }

    public k getSpanManager() {
        if (this.f30975OooO0oo == null) {
            this.f30975OooO0oo = new k();
        }
        return this.f30975OooO0oo;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f30970OooO;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        g gVar = new g(super.onCreateInputConnection(editorInfo), this);
        editorInfo.imeOptions &= -1073741825;
        return gVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        super.onSelectionChanged(i, i2);
        h hVar = getSpanManager().f56775OooO0O0;
        if (hVar != null) {
            int i3 = hVar.f56772OooO0oO;
            z = (i3 == i && hVar.f56773OooO0oo == i2) || (i3 == i2 && hVar.f56773OooO0oo == i);
        }
        if (z) {
            return;
        }
        h hVarOooO0Oo = getSpanManager().OooO0Oo(i, i2);
        if (hVarOooO0Oo != null && hVarOooO0Oo.f56773OooO0oo == i2) {
            this.f30970OooO = false;
        }
        h hVarOooO0o0 = getSpanManager().OooO0o0(i, i2);
        if (hVarOooO0o0 != null) {
            try {
                if (i == i2) {
                    if (hVarOooO0o0.OooO00o(i) < 0 || hVarOooO0o0.OooO00o(i) >= getSelectionEnd()) {
                        setSelection(0);
                        return;
                    } else {
                        setSelection(hVarOooO0o0.OooO00o(i));
                        return;
                    }
                }
                int i4 = hVarOooO0o0.f56773OooO0oo;
                if (i2 < i4) {
                    setSelection(i, i4);
                }
                int i5 = hVarOooO0o0.f56772OooO0oO;
                if (i > i5) {
                    setSelection(i5, i2);
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
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        rect.offset(20, 20);
        return super.requestRectangleOnScreen(rect, z);
    }

    public void setBackListener(OooO00o oooO00o) {
    }

    public void setEditTextSpanTouchEventListener(l lVar) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        this.f30970OooO = z;
    }

    public EditTextSpan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30971OooO0Oo = new HashMap();
        this.f30973OooO0o0 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30972OooO0o = null;
        this.f30974OooO0oO = null;
        this.f30970OooO = false;
        getSpanManager();
        addTextChangedListener(new e(this));
    }

    public EditTextSpan(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30971OooO0Oo = new HashMap();
        this.f30973OooO0o0 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30972OooO0o = null;
        this.f30974OooO0oO = null;
        this.f30970OooO = false;
        getSpanManager();
        addTextChangedListener(new e(this));
    }
}
