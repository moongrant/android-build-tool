package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.billingclient.api.o0Oo0oo;
import p631o0ooO0Oo.o00oOoo;

/* JADX INFO: loaded from: classes5.dex */
public class SimplePagerTitleView extends TextView implements o00oOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33721OooO0o0;

    public SimplePagerTitleView(Context context) {
        super(context, null);
        setGravity(17);
        int iOooO00o = o0Oo0oo.OooO00o(context, 10.0d);
        setPadding(iOooO00o, 0, iOooO00o, 0);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public void OooO00o(int i, int i2) {
        setTextColor(this.f33721OooO0o0);
    }

    public void OooO0O0(int i, int i2, float f, boolean z) {
    }

    public void OooO0OO(int i, int i2) {
        setTextColor(this.f33720OooO0Oo);
    }

    public void OooO0Oo(int i, int i2, float f, boolean z) {
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) (((fontMetrics.bottom - fontMetrics.top) / 2.0f) + (getHeight() / 2));
    }

    @Override // p631o0ooO0Oo.o00oOoo
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

    @Override // p631o0ooO0Oo.o00oOoo
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

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public int getNormalColor() {
        return this.f33721OooO0o0;
    }

    public int getSelectedColor() {
        return this.f33720OooO0Oo;
    }

    public void setNormalColor(int i) {
        this.f33721OooO0o0 = i;
    }

    public void setSelectedColor(int i) {
        this.f33720OooO0Oo = i;
    }
}
