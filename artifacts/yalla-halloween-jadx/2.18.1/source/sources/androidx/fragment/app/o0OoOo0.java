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
public final class o0OoOo0 {
    @AnimRes
    public static int OooO00o(@NonNull Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Animation f8516OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Animator f8517OooO0O0;

        public OooO00o(Animation animation) {
            this.f8516OooO00o = animation;
            this.f8517OooO0O0 = null;
        }

        public OooO00o(Animator animator) {
            this.f8516OooO00o = null;
            this.f8517OooO0O0 = animator;
        }
    }

    public static class OooO0O0 extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f8518Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ViewGroup f8519Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final View f8520Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f8521Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f8522OoooO00;

        public OooO0O0(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f8522OoooO00 = true;
            this.f8519Oooo0o = viewGroup;
            this.f8520Oooo0oO = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, @NonNull Transformation transformation) {
            this.f8522OoooO00 = true;
            if (this.f8521Oooo0oo) {
                return !this.f8518Oooo;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f8521Oooo0oo = true;
                o000O0O0.o0OOO0o.OooO00o(this.f8519Oooo0o, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f8521Oooo0oo || !this.f8522OoooO00) {
                this.f8519Oooo0o.endViewTransition(this.f8520Oooo0oO);
                this.f8518Oooo = true;
            } else {
                this.f8522OoooO00 = false;
                this.f8519Oooo0o.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, @NonNull Transformation transformation, float f) {
            this.f8522OoooO00 = true;
            if (this.f8521Oooo0oo) {
                return !this.f8518Oooo;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f8521Oooo0oo = true;
                o000O0O0.o0OOO0o.OooO00o(this.f8519Oooo0o, this);
            }
            return true;
        }
    }
}
