package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.xmlpull.v1.XmlPullParser;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final float[][] f7289OooOooo = {new float[]{0.5f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE}, new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final float[][] f7290Oooo000 = {new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -1.0f}, new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f}, new float[]{-1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE}, new float[]{1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE}, new float[]{-1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE}, new float[]{1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE}};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f7291OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f7292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f7293OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f7294OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7295OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f7296OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f7297OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f7298OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f7299OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f7300OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f7301OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f7302OooOO0o;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f7306OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final MotionLayout f7307OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f7308OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f7309OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f7310OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f7311OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f7312OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f7313OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f7314OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f7315OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f7316OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f7317OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f7318OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f7319OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f7320OooOooO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f7304OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float[] f7303OooOOO = new float[2];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int[] f7305OooOOOO = new int[2];

    public OooO0O0(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f7292OooO00o = 0;
        this.f7293OooO0O0 = 0;
        this.f7294OooO0OO = 0;
        this.f7295OooO0Oo = -1;
        this.f7297OooO0o0 = -1;
        this.f7296OooO0o = -1;
        this.f7298OooO0oO = 0.5f;
        this.f7299OooO0oo = 0.5f;
        this.f7291OooO = -1;
        this.f7300OooOO0 = false;
        this.f7301OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7302OooOO0o = 1.0f;
        this.f7309OooOOoo = 4.0f;
        this.f7312OooOo00 = 1.2f;
        this.f7311OooOo0 = true;
        this.f7313OooOo0O = 1.0f;
        this.f7314OooOo0o = 0;
        this.f7310OooOo = 10.0f;
        this.f7316OooOoO0 = 10.0f;
        this.f7315OooOoO = 1.0f;
        this.f7317OooOoOO = Float.NaN;
        this.f7319OooOoo0 = Float.NaN;
        this.f7318OooOoo = 0;
        this.f7320OooOooO = 0;
        this.f7307OooOOo = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.OnSwipe);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == o000O00.OnSwipe_touchAnchorId) {
                this.f7295OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7295OooO0Oo);
            } else if (index == o000O00.OnSwipe_touchAnchorSide) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f7292OooO00o);
                this.f7292OooO00o = i2;
                float[][] fArr = f7289OooOooo;
                this.f7299OooO0oo = fArr[i2][0];
                this.f7298OooO0oO = fArr[i2][1];
            } else if (index == o000O00.OnSwipe_dragDirection) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f7293OooO0O0);
                this.f7293OooO0O0 = i3;
                float[][] fArr2 = f7290Oooo000;
                if (i3 < 6) {
                    this.f7301OooOO0O = fArr2[i3][0];
                    this.f7302OooOO0o = fArr2[i3][1];
                } else {
                    this.f7302OooOO0o = Float.NaN;
                    this.f7301OooOO0O = Float.NaN;
                    this.f7300OooOO0 = true;
                }
            } else if (index == o000O00.OnSwipe_maxVelocity) {
                this.f7309OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f7309OooOOoo);
            } else if (index == o000O00.OnSwipe_maxAcceleration) {
                this.f7312OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f7312OooOo00);
            } else if (index == o000O00.OnSwipe_moveWhenScrollAtTop) {
                this.f7311OooOo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7311OooOo0);
            } else if (index == o000O00.OnSwipe_dragScale) {
                this.f7313OooOo0O = typedArrayObtainStyledAttributes.getFloat(index, this.f7313OooOo0O);
            } else if (index == o000O00.OnSwipe_dragThreshold) {
                this.f7310OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f7310OooOo);
            } else if (index == o000O00.OnSwipe_touchRegionId) {
                this.f7297OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7297OooO0o0);
            } else if (index == o000O00.OnSwipe_onTouchUp) {
                this.f7294OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f7294OooO0OO);
            } else if (index == o000O00.OnSwipe_nestedScrollFlags) {
                this.f7314OooOo0o = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == o000O00.OnSwipe_limitBoundsTo) {
                this.f7296OooO0o = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == o000O00.OnSwipe_rotationCenterId) {
                this.f7291OooO = typedArrayObtainStyledAttributes.getResourceId(index, this.f7291OooO);
            } else if (index == o000O00.OnSwipe_springDamping) {
                this.f7316OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7316OooOoO0);
            } else if (index == o000O00.OnSwipe_springMass) {
                this.f7315OooOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f7315OooOoO);
            } else if (index == o000O00.OnSwipe_springStiffness) {
                this.f7317OooOoOO = typedArrayObtainStyledAttributes.getFloat(index, this.f7317OooOoOO);
            } else if (index == o000O00.OnSwipe_springStopThreshold) {
                this.f7319OooOoo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7319OooOoo0);
            } else if (index == o000O00.OnSwipe_springBoundary) {
                this.f7318OooOoo = typedArrayObtainStyledAttributes.getInt(index, this.f7318OooOoo);
            } else if (index == o000O00.OnSwipe_autoCompleteMode) {
                this.f7320OooOooO = typedArrayObtainStyledAttributes.getInt(index, this.f7320OooOooO);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF OooO00o(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f7296OooO0o;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF OooO0O0(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f7297OooO0o0;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void OooO0OO(boolean z) {
        if (z) {
            float[][] fArr = f7290Oooo000;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f7289OooOooo;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f7290Oooo000;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f7289OooOooo;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = f7289OooOooo;
        int i = this.f7292OooO00o;
        this.f7299OooO0oo = fArr5[i][0];
        this.f7298OooO0oO = fArr5[i][1];
        int i2 = this.f7293OooO0O0;
        float[][] fArr6 = f7290Oooo000;
        if (i2 >= 6) {
            return;
        }
        this.f7301OooOO0O = fArr6[i2][0];
        this.f7302OooOO0o = fArr6[i2][1];
    }

    public final String toString() {
        if (Float.isNaN(this.f7301OooOO0O)) {
            return "rotation";
        }
        return this.f7301OooOO0O + " , " + this.f7302OooOO0o;
    }
}
