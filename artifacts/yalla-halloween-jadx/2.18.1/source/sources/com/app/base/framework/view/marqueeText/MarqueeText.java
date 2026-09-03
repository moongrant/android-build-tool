package com.app.base.framework.view.marqueeText;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextDirectionHeuristic;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class MarqueeText extends TextView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f11744Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f11745Oooo0oO;

    public MarqueeText(Context context) {
        super(context);
        this.f11744Oooo0o = 1;
        this.f11745Oooo0oO = 4;
        OooO00o();
    }

    public final void OooO00o() {
        int i = !oo000o.OooO0o0() ? 1 : 0;
        this.f11744Oooo0o = i ^ 1;
        this.f11745Oooo0oO = i != 0 ? 3 : 4;
    }

    @Override // android.view.View
    public int getLayoutDirection() {
        return this.f11744Oooo0o;
    }

    @Override // android.view.View
    public int getTextDirection() {
        return this.f11745Oooo0oO;
    }

    @Override // android.widget.TextView
    @NonNull
    public TextDirectionHeuristic getTextDirectionHeuristic() {
        return super.getTextDirectionHeuristic();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    public MarqueeText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11744Oooo0o = 1;
        this.f11745Oooo0oO = 4;
        OooO00o();
    }

    public MarqueeText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11744Oooo0o = 1;
        this.f11745Oooo0oO = 4;
        OooO00o();
    }
}
