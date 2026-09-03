package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.OooO00o;
import androidx.constraintlayout.motion.widget.OooO0OO;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import p060o0000o.OooO;
import p060o0000o.OooOOO;
import p060o0000o.OooOo;
import p060o0000o.o00Oo0;
import p060o0000o.o00oO0o;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f7134OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f7135OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f7136OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f7137Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f7138Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f7139OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f7140OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f7141OooooOo;

    public MotionEffect(Context context) {
        super(context);
        this.f7134OoooOo0 = 0.1f;
        this.f7135OoooOoO = 49;
        this.f7136OoooOoo = 50;
        this.f7137Ooooo00 = 0;
        this.f7138Ooooo0o = 0;
        this.f7139OooooO0 = true;
        this.f7140OooooOO = -1;
        this.f7141OooooOo = -1;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public final void OooOo0(MotionLayout motionLayout, HashMap<View, o00Oo0> map) {
        OooOOO oooOOO;
        OooOOO oooOOO2;
        OooOOO oooOOO3;
        OooOOO oooOOO4;
        boolean z;
        OooOOO oooOOO5;
        OooOOO oooOOO6;
        int i;
        MotionEffect motionEffect = this;
        HashMap<View, o00Oo0> map2 = map;
        View[] viewArrOooOOO0 = motionEffect.OooOOO0((ConstraintLayout) getParent());
        if (viewArrOooOOO0 == null) {
            Log.v("FadeMove", OooO.OooO00o() + " views = null");
            return;
        }
        OooOOO oooOOO7 = new OooOOO();
        OooOOO oooOOO8 = new OooOOO();
        oooOOO7.OooO0oo("alpha", Float.valueOf(motionEffect.f7134OoooOo0));
        oooOOO8.OooO0oo("alpha", Float.valueOf(motionEffect.f7134OoooOo0));
        int i2 = motionEffect.f7135OoooOoO;
        oooOOO7.f27684OooO00o = i2;
        oooOOO8.f27684OooO00o = motionEffect.f7136OoooOoo;
        OooOo oooOo = new OooOo();
        oooOo.f27684OooO00o = i2;
        oooOo.f27717OooOOOO = 0;
        oooOo.OooO0oo("percentX", 0);
        oooOo.OooO0oo("percentY", 0);
        OooOo oooOo2 = new OooOo();
        oooOo2.f27684OooO00o = motionEffect.f7136OoooOoo;
        oooOo2.f27717OooOOOO = 0;
        oooOo2.OooO0oo("percentX", 1);
        oooOo2.OooO0oo("percentY", 1);
        OooOOO oooOOO9 = null;
        if (motionEffect.f7137Ooooo00 > 0) {
            oooOOO = new OooOOO();
            oooOOO2 = new OooOOO();
            oooOOO.OooO0oo("translationX", Integer.valueOf(motionEffect.f7137Ooooo00));
            oooOOO.f27684OooO00o = motionEffect.f7136OoooOoo;
            oooOOO2.OooO0oo("translationX", 0);
            oooOOO2.f27684OooO00o = motionEffect.f7136OoooOoo - 1;
        } else {
            oooOOO = null;
            oooOOO2 = null;
        }
        if (motionEffect.f7138Ooooo0o > 0) {
            OooOOO oooOOO10 = new OooOOO();
            OooOOO oooOOO11 = new OooOOO();
            oooOOO10.OooO0oo("translationY", Integer.valueOf(motionEffect.f7138Ooooo0o));
            oooOOO10.f27684OooO00o = motionEffect.f7136OoooOoo;
            oooOOO11.OooO0oo("translationY", 0);
            oooOOO11.f27684OooO00o = motionEffect.f7136OoooOoo - 1;
            oooOOO3 = oooOOO10;
            oooOOO9 = oooOOO11;
        } else {
            oooOOO3 = null;
        }
        int i3 = motionEffect.f7141OooooOo;
        if (i3 == -1) {
            int[] iArr = new int[4];
            int i4 = 0;
            while (i4 < viewArrOooOOO0.length) {
                o00Oo0 o00oo1 = map2.get(viewArrOooOOO0[i4]);
                if (o00oo1 == null) {
                    oooOOO6 = oooOOO9;
                } else {
                    o00oO0o o00oo0o2 = o00oo1.f27768OooO0oO;
                    float f = o00oo0o2.f27802OoooO00;
                    o00oO0o o00oo0o3 = o00oo1.f27766OooO0o;
                    oooOOO6 = oooOOO9;
                    float f2 = f - o00oo0o3.f27802OoooO00;
                    float f3 = o00oo0o2.f27801OoooO0 - o00oo0o3.f27801OoooO0;
                    if (f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        i = 1;
                        iArr[1] = iArr[1] + 1;
                    } else {
                        i = 1;
                    }
                    if (f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        iArr[2] = iArr[2] + i;
                    }
                }
                i4++;
                oooOOO9 = oooOOO6;
            }
            oooOOO4 = oooOOO9;
            int i5 = iArr[0];
            i3 = 0;
            for (int i6 = 1; i6 < 4; i6++) {
                if (i5 < iArr[i6]) {
                    i5 = iArr[i6];
                    i3 = i6;
                }
            }
        } else {
            oooOOO4 = oooOOO9;
        }
        int i7 = 0;
        while (i7 < viewArrOooOOO0.length) {
            o00Oo0 o00oo2 = map2.get(viewArrOooOOO0[i7]);
            if (o00oo2 == null) {
                oooOOO5 = oooOOO4;
            } else {
                o00oO0o o00oo0o4 = o00oo2.f27768OooO0oO;
                float f4 = o00oo0o4.f27802OoooO00;
                o00oO0o o00oo0o5 = o00oo2.f27766OooO0o;
                float f5 = f4 - o00oo0o5.f27802OoooO00;
                float f6 = o00oo0o4.f27801OoooO0 - o00oo0o5.f27801OoooO0;
                if (i3 == 0) {
                    if (f6 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (!motionEffect.f7139OooooO0 || f5 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                        z = false;
                    }
                } else if (i3 == 1) {
                    if (f6 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (!motionEffect.f7139OooooO0 || f5 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                        z = false;
                    }
                } else if (i3 != 2) {
                    z = i3 != 3 || f5 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (motionEffect.f7139OooooO0 && f6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                } else if (f5 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (!motionEffect.f7139OooooO0 || f6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    z = false;
                }
                if (z) {
                    int i8 = motionEffect.f7140OooooOO;
                    if (i8 == -1) {
                        o00oo2.OooO00o(oooOOO7);
                        o00oo2.OooO00o(oooOOO8);
                        o00oo2.OooO00o(oooOo);
                        o00oo2.OooO00o(oooOo2);
                        if (motionEffect.f7137Ooooo00 > 0) {
                            o00oo2.OooO00o(oooOOO);
                            o00oo2.OooO00o(oooOOO2);
                        }
                        if (motionEffect.f7138Ooooo0o > 0) {
                            o00oo2.OooO00o(oooOOO3);
                            OooOOO oooOOO12 = oooOOO4;
                            o00oo2.OooO00o(oooOOO12);
                            oooOOO5 = oooOOO12;
                        } else {
                            oooOOO5 = oooOOO4;
                        }
                    } else {
                        oooOOO5 = oooOOO4;
                        OooO00o oooO00o = motionLayout.f7148Oooo0o;
                        if (oooO00o != null) {
                            for (OooO0OO oooO0OO : oooO00o.f7265OooOOo0.f7356OooO0O0) {
                                if (oooO0OO.f7322OooO00o == i8) {
                                    oooO0OO.f7326OooO0o.OooO00o(o00oo2);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    oooOOO5 = oooOOO4;
                }
            }
            i7++;
            motionEffect = this;
            map2 = map;
            oooOOO4 = oooOOO5;
        }
    }

    public final void OooOo0O(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f7135OoooOoO);
                    this.f7135OoooOoO = i2;
                    this.f7135OoooOoO = Math.max(Math.min(i2, 99), 0);
                } else if (index == o000O00.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f7136OoooOoo);
                    this.f7136OoooOoo = i3;
                    this.f7136OoooOoo = Math.max(Math.min(i3, 99), 0);
                } else if (index == o000O00.MotionEffect_motionEffect_translationX) {
                    this.f7137Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7137Ooooo00);
                } else if (index == o000O00.MotionEffect_motionEffect_translationY) {
                    this.f7138Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7138Ooooo0o);
                } else if (index == o000O00.MotionEffect_motionEffect_alpha) {
                    this.f7134OoooOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7134OoooOo0);
                } else if (index == o000O00.MotionEffect_motionEffect_move) {
                    this.f7141OooooOo = typedArrayObtainStyledAttributes.getInt(index, this.f7141OooooOo);
                } else if (index == o000O00.MotionEffect_motionEffect_strict) {
                    this.f7139OooooO0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7139OooooO0);
                } else if (index == o000O00.MotionEffect_motionEffect_viewTransition) {
                    this.f7140OooooOO = typedArrayObtainStyledAttributes.getResourceId(index, this.f7140OooooOO);
                }
            }
            int i4 = this.f7135OoooOoO;
            int i5 = this.f7136OoooOoo;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f7135OoooOoO = i4 - 1;
                } else {
                    this.f7136OoooOoo = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7134OoooOo0 = 0.1f;
        this.f7135OoooOoO = 49;
        this.f7136OoooOoo = 50;
        this.f7137Ooooo00 = 0;
        this.f7138Ooooo0o = 0;
        this.f7139OooooO0 = true;
        this.f7140OooooOO = -1;
        this.f7141OooooOo = -1;
        OooOo0O(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7134OoooOo0 = 0.1f;
        this.f7135OoooOoO = 49;
        this.f7136OoooOoo = 50;
        this.f7137Ooooo00 = 0;
        this.f7138Ooooo0o = 0;
        this.f7139OooooO0 = true;
        this.f7140OooooOO = -1;
        this.f7141OooooOo = -1;
        OooOo0O(context, attributeSet);
    }
}
