package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import kotlin.KotlinVersion;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f7724Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f7725Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f7726Oooo0oo;

    public Placeholder(Context context) {
        super(context);
        this.f7724Oooo0o = -1;
        this.f7725Oooo0oO = null;
        this.f7726Oooo0oo = 4;
        OooO00o(null);
    }

    public final void OooO00o(AttributeSet attributeSet) {
        super.setVisibility(this.f7726Oooo0oo);
        this.f7724Oooo0o = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_placeholder_content) {
                    this.f7724Oooo0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f7724Oooo0o);
                } else if (index == o000O00.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f7726Oooo0oo = typedArrayObtainStyledAttributes.getInt(index, this.f7726Oooo0oo);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f7725Oooo0oO;
    }

    public int getEmptyVisibility() {
        return this.f7726Oooo0oo;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(KotlinVersion.MAX_COMPONENT_VALUE, 210, 210, 210);
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
        if (this.f7724Oooo0o == i) {
            return;
        }
        View view = this.f7725Oooo0oO;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f7725Oooo0oO.getLayoutParams()).f7553OooooOo = false;
            this.f7725Oooo0oO = null;
        }
        this.f7724Oooo0o = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f7726Oooo0oo = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7724Oooo0o = -1;
        this.f7725Oooo0oO = null;
        this.f7726Oooo0oo = 4;
        OooO00o(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7724Oooo0o = -1;
        this.f7725Oooo0oO = null;
        this.f7726Oooo0oo = 4;
        OooO00o(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f7724Oooo0o = -1;
        this.f7725Oooo0oO = null;
        this.f7726Oooo0oo = 4;
        OooO00o(attributeSet);
    }
}
