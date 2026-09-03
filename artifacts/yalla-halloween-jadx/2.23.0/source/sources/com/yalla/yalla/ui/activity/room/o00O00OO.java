package com.yalla.yalla.ui.activity.room;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 66;
    }
}
