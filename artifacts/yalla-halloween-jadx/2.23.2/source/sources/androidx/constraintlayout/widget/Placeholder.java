package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f5180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f5181OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f5182OooO0o0;

    public Placeholder(Context context) {
        super(context);
        this.f5180OooO0Oo = -1;
        this.f5182OooO0o0 = null;
        this.f5181OooO0o = 4;
        OooO00o(null);
    }

    public final void OooO00o(AttributeSet attributeSet) {
        super.setVisibility(this.f5181OooO0o);
        this.f5180OooO0Oo = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ConstraintLayout_placeholder_content) {
                    this.f5180OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f5180OooO0Oo);
                } else if (index == OooO.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f5181OooO0o = typedArrayObtainStyledAttributes.getInt(index, this.f5181OooO0o);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f5182OooO0o0;
    }

    public int getEmptyVisibility() {
        return this.f5181OooO0o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f5180OooO0Oo == i) {
            return;
        }
        View view = this.f5182OooO0o0;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f5182OooO0o0.getLayoutParams()).f4984OooooOo = false;
            this.f5182OooO0o0 = null;
        }
        this.f5180OooO0Oo = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f5181OooO0o = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5180OooO0Oo = -1;
        this.f5182OooO0o0 = null;
        this.f5181OooO0o = 4;
        OooO00o(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5180OooO0Oo = -1;
        this.f5182OooO0o0 = null;
        this.f5181OooO0o = 4;
        OooO00o(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f5180OooO0Oo = -1;
        this.f5182OooO0o0 = null;
        this.f5181OooO0o = 4;
        OooO00o(attributeSet);
    }
}
