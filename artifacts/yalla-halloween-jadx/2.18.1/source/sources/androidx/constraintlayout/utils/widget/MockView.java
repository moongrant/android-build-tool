package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.KotlinVersion;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f7404Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Paint f7405Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Paint f7406Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Paint f7407Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f7408OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f7409OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f7410OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Rect f7411OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f7412OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f7413OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f7414o000oOoO;

    public MockView(Context context) {
        super(context);
        this.f7405Oooo0o = new Paint();
        this.f7406Oooo0oO = new Paint();
        this.f7407Oooo0oo = new Paint();
        this.f7404Oooo = true;
        this.f7410OoooO00 = true;
        this.f7409OoooO0 = null;
        this.f7411OoooO0O = new Rect();
        this.f7408OoooO = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.f7412OoooOO0 = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 200, 200, 200);
        this.f7414o000oOoO = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.f7413OoooOOO = 4;
        OooO00o(context, null);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.MockView_mock_label) {
                    this.f7409OoooO0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == o000O00.MockView_mock_showDiagonals) {
                    this.f7404Oooo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7404Oooo);
                } else if (index == o000O00.MockView_mock_diagonalsColor) {
                    this.f7408OoooO = typedArrayObtainStyledAttributes.getColor(index, this.f7408OoooO);
                } else if (index == o000O00.MockView_mock_labelBackgroundColor) {
                    this.f7414o000oOoO = typedArrayObtainStyledAttributes.getColor(index, this.f7414o000oOoO);
                } else if (index == o000O00.MockView_mock_labelColor) {
                    this.f7412OoooOO0 = typedArrayObtainStyledAttributes.getColor(index, this.f7412OoooOO0);
                } else if (index == o000O00.MockView_mock_showLabel) {
                    this.f7410OoooO00 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7410OoooO00);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f7409OoooO0 == null) {
            try {
                this.f7409OoooO0 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f7405Oooo0o.setColor(this.f7408OoooO);
        this.f7405Oooo0o.setAntiAlias(true);
        this.f7406Oooo0oO.setColor(this.f7412OoooOO0);
        this.f7406Oooo0oO.setAntiAlias(true);
        this.f7407Oooo0oo.setColor(this.f7414o000oOoO);
        this.f7413OoooOOO = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f7413OoooOOO);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f7404Oooo) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, f2, this.f7405Oooo0o);
            canvas.drawLine(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f7405Oooo0o);
            canvas.drawLine(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f7405Oooo0o);
            canvas.drawLine(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, f2, this.f7405Oooo0o);
            canvas.drawLine(f, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, this.f7405Oooo0o);
            canvas.drawLine(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f7405Oooo0o);
        }
        String str = this.f7409OoooO0;
        if (str == null || !this.f7410OoooO00) {
            return;
        }
        this.f7406Oooo0oO.getTextBounds(str, 0, str.length(), this.f7411OoooO0O);
        float fWidth = (width - this.f7411OoooO0O.width()) / 2.0f;
        float fHeight = ((height - this.f7411OoooO0O.height()) / 2.0f) + this.f7411OoooO0O.height();
        this.f7411OoooO0O.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f7411OoooO0O;
        int i = rect.left;
        int i2 = this.f7413OoooOOO;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.f7411OoooO0O, this.f7407Oooo0oo);
        canvas.drawText(this.f7409OoooO0, fWidth, fHeight, this.f7406Oooo0oO);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7405Oooo0o = new Paint();
        this.f7406Oooo0oO = new Paint();
        this.f7407Oooo0oo = new Paint();
        this.f7404Oooo = true;
        this.f7410OoooO00 = true;
        this.f7409OoooO0 = null;
        this.f7411OoooO0O = new Rect();
        this.f7408OoooO = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.f7412OoooOO0 = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 200, 200, 200);
        this.f7414o000oOoO = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.f7413OoooOOO = 4;
        OooO00o(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7405Oooo0o = new Paint();
        this.f7406Oooo0oO = new Paint();
        this.f7407Oooo0oo = new Paint();
        this.f7404Oooo = true;
        this.f7410OoooO00 = true;
        this.f7409OoooO0 = null;
        this.f7411OoooO0O = new Rect();
        this.f7408OoooO = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.f7412OoooOO0 = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 200, 200, 200);
        this.f7414o000oOoO = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.f7413OoooOOO = 4;
        OooO00o(context, attributeSet);
    }
}
