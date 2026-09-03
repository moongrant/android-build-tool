package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import p418o0Oo0oo.oo000o;
import p657o0ooo00o.oO0;

/* JADX INFO: loaded from: classes3.dex */
public class SimplePagerTitleView extends TextView implements oO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f26513Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f26514Oooo0oO;

    public SimplePagerTitleView(Context context) {
        super(context, null);
        setGravity(17);
        int iOooO00o = oo000o.OooO00o(context, 10.0d);
        setPadding(iOooO00o, 0, iOooO00o, 0);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public void OooO00o(int i, int i2) {
        setTextColor(this.f26514Oooo0oO);
    }

    public void OooO0O0(int i, int i2, float f, boolean z) {
    }

    public void OooO0OO(int i, int i2) {
        setTextColor(this.f26513Oooo0o);
    }

    public void OooO0Oo(int i, int i2, float f, boolean z) {
    }

    @Override // p657o0ooo00o.oO0
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) (((fontMetrics.bottom - fontMetrics.top) / 2.0f) + (getHeight() / 2));
    }

    @Override // p657o0ooo00o.oO0
    public int getContentLeft() {
        String string;
        Rect rect = new Rect();
        if (getText().toString().contains("\n")) {
            string = "";
            for (String str : getText().toString().split("\\n")) {
                if (str.length() > string.length()) {
                    string = str;
                }
            }
        } else {
            string = getText().toString();
        }
        getPaint().getTextBounds(string, 0, string.length(), rect);
        return ((getWidth() / 2) + getLeft()) - (rect.width() / 2);
    }

    @Override // p657o0ooo00o.oO0
    public int getContentRight() {
        String string;
        Rect rect = new Rect();
        if (getText().toString().contains("\n")) {
            string = "";
            for (String str : getText().toString().split("\\n")) {
                if (str.length() > string.length()) {
                    string = str;
                }
            }
        } else {
            string = getText().toString();
        }
        getPaint().getTextBounds(string, 0, string.length(), rect);
        return (rect.width() / 2) + (getWidth() / 2) + getLeft();
    }

    @Override // p657o0ooo00o.oO0
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public int getNormalColor() {
        return this.f26514Oooo0oO;
    }

    public int getSelectedColor() {
        return this.f26513Oooo0o;
    }

    public void setNormalColor(int i) {
        this.f26514Oooo0oO = i;
    }

    public void setSelectedColor(int i) {
        this.f26513Oooo0o = i;
    }
}
