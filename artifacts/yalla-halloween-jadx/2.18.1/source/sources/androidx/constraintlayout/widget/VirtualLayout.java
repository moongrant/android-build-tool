package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.OooOOO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f7731OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f7732o000oOoO;

    public VirtualLayout(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0(ConstraintLayout constraintLayout) {
        OooO(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_Layout_android_visibility) {
                    this.f7731OoooOO0 = true;
                } else if (index == o000O00.ConstraintLayout_Layout_android_elevation) {
                    this.f7732o000oOoO = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void OooOo0(OooOOO oooOOO, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7731OoooOO0 || this.f7732o000oOoO) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f7491Oooo0oO; i++) {
                    View viewById = constraintLayout.getViewById(this.f7490Oooo0o[i]);
                    if (viewById != null) {
                        if (this.f7731OoooOO0) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f7732o000oOoO && elevation > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OooO0oo();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        OooO0oo();
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
