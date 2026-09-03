package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f7415Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public RectF f7416OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Path f7417OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f7418OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ViewOutlineProvider f7419OoooO0O;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.f7415Oooo) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f7418OoooO00);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f7415Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7418OoooO00 = Float.NaN;
        OooO00o(context, null);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f7418OoooO00;
    }

    public float getRoundPercent() {
        return this.f7415Oooo;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f7418OoooO00 = f;
            float f2 = this.f7415Oooo;
            this.f7415Oooo = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f7418OoooO00 != f;
        this.f7418OoooO00 = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7417OoooO0 == null) {
                this.f7417OoooO0 = new Path();
            }
            if (this.f7416OoooO == null) {
                this.f7416OoooO = new RectF();
            }
            if (this.f7419OoooO0O == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f7419OoooO0O = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f7416OoooO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
            this.f7417OoooO0.reset();
            Path path = this.f7417OoooO0;
            RectF rectF = this.f7416OoooO;
            float f3 = this.f7418OoooO00;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.f7415Oooo != f;
        this.f7415Oooo = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7417OoooO0 == null) {
                this.f7417OoooO0 = new Path();
            }
            if (this.f7416OoooO == null) {
                this.f7416OoooO = new RectF();
            }
            if (this.f7419OoooO0O == null) {
                OooO00o oooO00o = new OooO00o();
                this.f7419OoooO0O = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f7415Oooo) / 2.0f;
            this.f7416OoooO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width, height);
            this.f7417OoooO0.reset();
            this.f7417OoooO0.addRoundRect(this.f7416OoooO, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7415Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7418OoooO00 = Float.NaN;
        OooO00o(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7415Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7418OoooO00 = Float.NaN;
        OooO00o(context, attributeSet);
    }
}
