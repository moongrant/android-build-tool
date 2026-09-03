package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import o0OO0.OooO0o;
import p636o0ooO0oO.o0oO0Ooo;

/* JADX INFO: loaded from: classes5.dex */
public class SimplePagerTitleView extends TextView implements o0oO0Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33187OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33188OooO0o0;

    public SimplePagerTitleView(Context context) {
        super(context, null);
        setGravity(17);
        int iOooO0O0 = OooO0o.OooO0O0(context, 10.0d);
        setPadding(iOooO0O0, 0, iOooO0O0, 0);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public void OooO00o(int i, int i2) {
        setTextColor(this.f33188OooO0o0);
    }

    public void OooO0O0(int i, int i2, float f, boolean z) {
    }

    public void OooO0OO(int i, int i2) {
        setTextColor(this.f33187OooO0Oo);
    }

    public void OooO0Oo(int i, int i2, float f, boolean z) {
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) (((fontMetrics.bottom - fontMetrics.top) / 2.0f) + (getHeight() / 2));
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
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

    @Override // p636o0ooO0oO.o0oO0Ooo
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

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public int getNormalColor() {
        return this.f33188OooO0o0;
    }

    public int getSelectedColor() {
        return this.f33187OooO0Oo;
    }

    public void setNormalColor(int i) {
        this.f33188OooO0o0 = i;
    }

    public void setSelectedColor(int i) {
        this.f33187OooO0Oo = i;
    }
}
