package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO00o f7576Oooo0o;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public OooO00o getConstraintSet() {
        if (this.f7576Oooo0o == null) {
            this.f7576Oooo0o = new OooO00o();
        }
        OooO00o oooO00o = this.f7576Oooo0o;
        Objects.requireNonNull(oooO00o);
        int childCount = getChildCount();
        oooO00o.f7598OooO0o.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oooO00o.f7599OooO0o0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!oooO00o.f7598OooO0o.containsKey(Integer.valueOf(id))) {
                oooO00o.f7598OooO0o.put(Integer.valueOf(id), new OooO00o.C0043OooO00o());
            }
            OooO00o.C0043OooO00o c0043OooO00o = oooO00o.f7598OooO0o.get(Integer.valueOf(id));
            if (c0043OooO00o != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    c0043OooO00o.OooO0Oo(id, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        OooO00o.OooO0O0 oooO0O0 = c0043OooO00o.f7620OooO0o0;
                        oooO0O0.f7695OoooooO = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        oooO0O0.f7694Oooooo0 = barrier.getType();
                        c0043OooO00o.f7620OooO0o0.f7696Ooooooo = barrier.getReferencedIds();
                        c0043OooO00o.f7620OooO0o0.f7693Oooooo = barrier.getMargin();
                    }
                }
                c0043OooO00o.OooO0Oo(id, layoutParams);
            }
        }
        return this.f7576Oooo0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* JADX INFO: renamed from: o000000, reason: collision with root package name */
        public float f7577o000000;

        /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
        public float f7578o000OOo;

        /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
        public float f7579o00oO0O;

        /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
        public boolean f7580o00oO0o;

        /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
        public float f7581o0O0O00;

        /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
        public float f7582o0OO00O;

        /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
        public float f7583o0OOO0o;

        /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
        public float f7584o0Oo0oo;

        /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
        public float f7585o0ooOO0;

        /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
        public float f7586o0ooOOo;

        /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
        public float f7587o0ooOoO;

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public float f7588oo000o;

        /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
        public float f7589oo0o0Oo;

        public LayoutParams() {
            this.f7588oo000o = 1.0f;
            this.f7580o00oO0o = false;
            this.f7579o00oO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7585o0ooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7586o0ooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7587o0ooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7583o0OOO0o = 1.0f;
            this.f7584o0Oo0oo = 1.0f;
            this.f7582o0OO00O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7589oo0o0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7581o0O0O00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7578o000OOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7577o000000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7588oo000o = 1.0f;
            this.f7580o00oO0o = false;
            this.f7579o00oO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7585o0ooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7586o0ooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7587o0ooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7583o0OOO0o = 1.0f;
            this.f7584o0Oo0oo = 1.0f;
            this.f7582o0OO00O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7589oo0o0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7581o0O0O00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7578o000OOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7577o000000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintSet_android_alpha) {
                    this.f7588oo000o = typedArrayObtainStyledAttributes.getFloat(index, this.f7588oo000o);
                } else if (index == o000O00.ConstraintSet_android_elevation) {
                    this.f7579o00oO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f7579o00oO0O);
                    this.f7580o00oO0o = true;
                } else if (index == o000O00.ConstraintSet_android_rotationX) {
                    this.f7586o0ooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f7586o0ooOOo);
                } else if (index == o000O00.ConstraintSet_android_rotationY) {
                    this.f7587o0ooOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f7587o0ooOoO);
                } else if (index == o000O00.ConstraintSet_android_rotation) {
                    this.f7585o0ooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7585o0ooOO0);
                } else if (index == o000O00.ConstraintSet_android_scaleX) {
                    this.f7583o0OOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f7583o0OOO0o);
                } else if (index == o000O00.ConstraintSet_android_scaleY) {
                    this.f7584o0Oo0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7584o0Oo0oo);
                } else if (index == o000O00.ConstraintSet_android_transformPivotX) {
                    this.f7582o0OO00O = typedArrayObtainStyledAttributes.getFloat(index, this.f7582o0OO00O);
                } else if (index == o000O00.ConstraintSet_android_transformPivotY) {
                    this.f7589oo0o0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7589oo0o0Oo);
                } else if (index == o000O00.ConstraintSet_android_translationX) {
                    this.f7581o0O0O00 = typedArrayObtainStyledAttributes.getFloat(index, this.f7581o0O0O00);
                } else if (index == o000O00.ConstraintSet_android_translationY) {
                    this.f7578o000OOo = typedArrayObtainStyledAttributes.getFloat(index, this.f7578o000OOo);
                } else if (index == o000O00.ConstraintSet_android_translationZ) {
                    this.f7577o000000 = typedArrayObtainStyledAttributes.getFloat(index, this.f7577o000000);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
