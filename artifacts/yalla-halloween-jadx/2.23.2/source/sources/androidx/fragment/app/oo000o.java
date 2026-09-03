package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {
    @AnimRes
    public static int OooO00o(int i, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Animation f6058OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Animator f6059OooO0O0;

        public OooO00o(Animation animation) {
            this.f6058OooO00o = animation;
            this.f6059OooO0O0 = null;
        }

        public OooO00o(Animator animator) {
            this.f6058OooO00o = null;
            this.f6059OooO0O0 = animator;
        }
    }

    public static class OooO0O0 extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ViewGroup f6060OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f6061OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f6062OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f6063OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f6064OooO0oo;

        public OooO0O0(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f6064OooO0oo = true;
            this.f6060OooO0Oo = viewGroup;
            this.f6062OooO0o0 = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, @NonNull Transformation transformation) {
            this.f6064OooO0oo = true;
            if (this.f6061OooO0o) {
                return !this.f6063OooO0oO;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f6061OooO0o = true;
                androidx.core.view.o00000O.OooO00o(this.f6060OooO0Oo, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.f6061OooO0o;
            ViewGroup viewGroup = this.f6060OooO0Oo;
            if (z || !this.f6064OooO0oo) {
                viewGroup.endViewTransition(this.f6062OooO0o0);
                this.f6063OooO0oO = true;
            } else {
                this.f6064OooO0oo = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, @NonNull Transformation transformation, float f) {
            this.f6064OooO0oo = true;
            if (this.f6061OooO0o) {
                return !this.f6063OooO0oO;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f6061OooO0o = true;
                androidx.core.view.o00000O.OooO00o(this.f6060OooO0Oo, this);
            }
            return true;
        }
    }
}
