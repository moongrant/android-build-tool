package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.OooO;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f4835OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Paint f4836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Paint f4837OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Paint f4838OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f4839OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f4840OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Rect f4841OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f4842OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f4843OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f4844OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f4845OooOOO0;

    public MockView(Context context) {
        super(context);
        this.f4836OooO0Oo = new Paint();
        this.f4838OooO0o0 = new Paint();
        this.f4837OooO0o = new Paint();
        this.f4839OooO0oO = true;
        this.f4840OooO0oo = true;
        this.f4835OooO = null;
        this.f4841OooOO0 = new Rect();
        this.f4842OooOO0O = Color.argb(255, 0, 0, 0);
        this.f4843OooOO0o = Color.argb(255, 200, 200, 200);
        this.f4845OooOOO0 = Color.argb(255, 50, 50, 50);
        this.f4844OooOOO = 4;
        OooO00o(context, null);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.MockView_mock_label) {
                    this.f4835OooO = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == OooO.MockView_mock_showDiagonals) {
                    this.f4839OooO0oO = typedArrayObtainStyledAttributes.getBoolean(index, this.f4839OooO0oO);
                } else if (index == OooO.MockView_mock_diagonalsColor) {
                    this.f4842OooOO0O = typedArrayObtainStyledAttributes.getColor(index, this.f4842OooOO0O);
                } else if (index == OooO.MockView_mock_labelBackgroundColor) {
                    this.f4845OooOOO0 = typedArrayObtainStyledAttributes.getColor(index, this.f4845OooOOO0);
                } else if (index == OooO.MockView_mock_labelColor) {
                    this.f4843OooOO0o = typedArrayObtainStyledAttributes.getColor(index, this.f4843OooOO0o);
                } else if (index == OooO.MockView_mock_showLabel) {
                    this.f4840OooO0oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f4840OooO0oo);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f4835OooO == null) {
            try {
                this.f4835OooO = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.f4842OooOO0O;
        Paint paint = this.f4836OooO0Oo;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.f4843OooOO0o;
        Paint paint2 = this.f4838OooO0o0;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.f4837OooO0o.setColor(this.f4845OooOOO0);
        this.f4844OooOOO = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f4844OooOOO);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f4839OooO0oO) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f4836OooO0Oo);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f4836OooO0Oo);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f4836OooO0Oo);
            canvas.drawLine(f, 0.0f, f, f2, this.f4836OooO0Oo);
            canvas.drawLine(f, f2, 0.0f, f2, this.f4836OooO0Oo);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f4836OooO0Oo);
        }
        String str = this.f4835OooO;
        if (str == null || !this.f4840OooO0oo) {
            return;
        }
        int length = str.length();
        Paint paint = this.f4838OooO0o0;
        Rect rect = this.f4841OooOO0;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.f4844OooOOO;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(rect, this.f4837OooO0o);
        canvas.drawText(this.f4835OooO, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4836OooO0Oo = new Paint();
        this.f4838OooO0o0 = new Paint();
        this.f4837OooO0o = new Paint();
        this.f4839OooO0oO = true;
        this.f4840OooO0oo = true;
        this.f4835OooO = null;
        this.f4841OooOO0 = new Rect();
        this.f4842OooOO0O = Color.argb(255, 0, 0, 0);
        this.f4843OooOO0o = Color.argb(255, 200, 200, 200);
        this.f4845OooOOO0 = Color.argb(255, 50, 50, 50);
        this.f4844OooOOO = 4;
        OooO00o(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4836OooO0Oo = new Paint();
        this.f4838OooO0o0 = new Paint();
        this.f4837OooO0o = new Paint();
        this.f4839OooO0oO = true;
        this.f4840OooO0oo = true;
        this.f4835OooO = null;
        this.f4841OooOO0 = new Rect();
        this.f4842OooOO0O = Color.argb(255, 0, 0, 0);
        this.f4843OooOO0o = Color.argb(255, 200, 200, 200);
        this.f4845OooOOO0 = Color.argb(255, 50, 50, 50);
        this.f4844OooOOO = 4;
        OooO00o(context, attributeSet);
    }
}
