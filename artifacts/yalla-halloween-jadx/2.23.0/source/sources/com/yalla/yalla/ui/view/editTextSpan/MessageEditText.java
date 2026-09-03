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
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.HashMap;
import java.util.Map;
import p585o0oOooOO.f;
import p585o0oOooOO.h;
import p585o0oOooOO.i;
import p585o0oOooOO.k;
import p585o0oOooOO.l;
import p585o0oOooOO.m;
import p585o0oOooOO.n;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
public class MessageEditText extends EmojiEditText {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public HashMap f30976OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public f f30977OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public String f30978OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public k f30979OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f30980OooOo0o;

    public interface OooO00o {
    }

    public MessageEditText(Context context) {
        super(context);
        this.f30976OooOOoo = new HashMap();
        this.f30978OooOo00 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30977OooOo0 = null;
        this.f30980OooOo0o = false;
        getSpanManager();
        addTextChangedListener(new m(this));
    }

    public final void OooO0Oo(h hVar) {
        int length;
        int selectionStart = getSelectionStart();
        if (!TextUtils.isEmpty("@")) {
            getMaskKeys().put("@", "@");
        }
        hVar.f56768OooO = "@";
        String str = "@" + hVar.f56769OooO0Oo;
        if (TextUtils.isEmpty(str)) {
            length = selectionStart;
        } else {
            length = str.length() + selectionStart;
            getText().insert(selectionStart, str);
            f fVar = this.f30977OooOo0;
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
        if (this.f30978OooOo00 == null) {
            this.f30978OooOo00 = "";
        }
        return this.f30978OooOo00;
    }

    public Map<String, String> getMaskKeys() {
        if (this.f30976OooOOoo == null) {
            this.f30976OooOOoo = new HashMap();
        }
        return this.f30976OooOOoo;
    }

    public i getSpanKeyListener() {
        return null;
    }

    public k getSpanManager() {
        if (this.f30979OooOo0O == null) {
            this.f30979OooOo0O = new k();
        }
        return this.f30979OooOo0O;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f30980OooOo0o;
    }

    @Override // com.yalla.support.emojifaceutil.EmojiEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new n((EmojiEditText.OooO0O0) super.onCreateInputConnection(editorInfo), this);
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
            this.f30980OooOo0o = false;
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
        this.f30980OooOo0o = z;
    }

    public MessageEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30976OooOOoo = new HashMap();
        this.f30978OooOo00 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30977OooOo0 = null;
        this.f30980OooOo0o = false;
        getSpanManager();
        addTextChangedListener(new m(this));
    }

    public MessageEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30976OooOOoo = new HashMap();
        this.f30978OooOo00 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30977OooOo0 = null;
        this.f30980OooOo0o = false;
        getSpanManager();
        addTextChangedListener(new m(this));
    }
}
