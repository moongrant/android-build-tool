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
import p557o0oOOooO.oO0;
import p557o0oOOooO.oO00o0;
import p557o0oOOooO.oO0O000;
import p557o0oOOooO.oO0OO00o;
import p557o0oOOooO.oOo0000O;
import p557o0oOOooO.oOo000o0;
import p557o0oOOooO.oOo00ooO;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class MessageEditText extends EmojiEditText {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public HashMap f30431OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oO00o0 f30432OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public String f30433OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public oOo0000O f30434OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f30435OooOo0o;

    public interface OooO00o {
    }

    public MessageEditText(Context context) {
        super(context);
        this.f30431OooOOoo = new HashMap();
        this.f30433OooOo00 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30432OooOo0 = null;
        this.f30435OooOo0o = false;
        getSpanManager();
        addTextChangedListener(new oO0(this));
    }

    public final void OooO0Oo(oOo00ooO ooo00ooo) {
        int length;
        int selectionStart = getSelectionStart();
        if (!TextUtils.isEmpty("@")) {
            getMaskKeys().put("@", "@");
        }
        ooo00ooo.f56179OooO = "@";
        String str = "@" + ooo00ooo.f56180OooO0Oo;
        if (TextUtils.isEmpty(str)) {
            length = selectionStart;
        } else {
            length = str.length() + selectionStart;
            getText().insert(selectionStart, str);
            oO00o0 oo00o0 = this.f30432OooOo0;
            if (oo00o0 != null) {
                oo00o0.OooO00o(getText(), selectionStart, length);
            }
        }
        ooo00ooo.f56183OooO0oO = selectionStart;
        ooo00ooo.f56184OooO0oo = length;
        oOo0000O spanManager = getSpanManager();
        spanManager.OooO00o();
        spanManager.f56176OooO00o.add(ooo00ooo);
        getText().insert(getSelectionEnd(), getEnd_());
    }

    public String getEnd_() {
        if (this.f30433OooOo00 == null) {
            this.f30433OooOo00 = "";
        }
        return this.f30433OooOo00;
    }

    public Map<String, String> getMaskKeys() {
        if (this.f30431OooOOoo == null) {
            this.f30431OooOOoo = new HashMap();
        }
        return this.f30431OooOOoo;
    }

    public oO0OO00o getSpanKeyListener() {
        return null;
    }

    public oOo0000O getSpanManager() {
        if (this.f30434OooOo0O == null) {
            this.f30434OooOo0O = new oOo0000O();
        }
        return this.f30434OooOo0O;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f30435OooOo0o;
    }

    @Override // com.yalla.support.emojifaceutil.EmojiEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new oO0O000((EmojiEditText.OooO0O0) super.onCreateInputConnection(editorInfo), this);
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
        oOo00ooO ooo00ooo = getSpanManager().f56177OooO0O0;
        if (ooo00ooo != null) {
            int i3 = ooo00ooo.f56183OooO0oO;
            z = (i3 == i && ooo00ooo.f56184OooO0oo == i2) || (i3 == i2 && ooo00ooo.f56184OooO0oo == i);
        }
        if (z) {
            return;
        }
        oOo00ooO ooo00oooOooO0Oo = getSpanManager().OooO0Oo(i, i2);
        if (ooo00oooOooO0Oo != null && ooo00oooOooO0Oo.f56184OooO0oo == i2) {
            this.f30435OooOo0o = false;
        }
        oOo00ooO ooo00oooOooO0o0 = getSpanManager().OooO0o0(i, i2);
        if (ooo00oooOooO0o0 != null) {
            try {
                if (i == i2) {
                    if (ooo00oooOooO0o0.OooO00o(i) < 0 || ooo00oooOooO0o0.OooO00o(i) >= getSelectionEnd()) {
                        setSelection(0);
                        return;
                    } else {
                        setSelection(ooo00oooOooO0o0.OooO00o(i));
                        return;
                    }
                }
                int i4 = ooo00oooOooO0o0.f56184OooO0oo;
                if (i2 < i4) {
                    setSelection(i, i4);
                }
                int i5 = ooo00oooOooO0o0.f56183OooO0oO;
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

    public void setEditTextSpanTouchEventListener(oOo000o0 ooo000o0) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        this.f30435OooOo0o = z;
    }

    public MessageEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30431OooOOoo = new HashMap();
        this.f30433OooOo00 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30432OooOo0 = null;
        this.f30435OooOo0o = false;
        getSpanManager();
        addTextChangedListener(new oO0(this));
    }

    public MessageEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30431OooOOoo = new HashMap();
        this.f30433OooOo00 = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        this.f30432OooOo0 = null;
        this.f30435OooOo0o = false;
        getSpanManager();
        addTextChangedListener(new oO0(this));
    }
}
