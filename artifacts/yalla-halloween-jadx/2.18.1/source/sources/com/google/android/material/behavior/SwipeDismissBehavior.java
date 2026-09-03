package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.OooO;
import com.google.android.material.snackbar.OooOO0O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p072o000O0o0.o0000OO0;
import p427o0OoO0o.o00000;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00000 f16521OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f16522OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f16523OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16524OooO0Oo = 2;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f16526OooO0o0 = 0.5f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f16525OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f16527OooO0oO = 0.5f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f16528OooO0oo = new OooO00o();

    public class OooO00o extends o00000.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f16529OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f16530OooO0O0 = -1;

        public OooO00o() {
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO(@NonNull View view, int i, int i2) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f16525OooO0o) + this.f16529OooO00o;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f16527OooO0oO) + this.f16529OooO00o;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            } else {
                view.setAlpha(SwipeDismissBehavior.OooOo0(1.0f - ((f - width) / (width2 - width))));
            }
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO00o(@NonNull View view, int i) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
            int i2 = SwipeDismissBehavior.this.f16524OooO0Oo;
            if (i2 == 0) {
                if (z) {
                    width = this.f16529OooO00o - view.getWidth();
                    width2 = this.f16529OooO00o;
                } else {
                    width = this.f16529OooO00o;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i2 != 1) {
                width = this.f16529OooO00o - view.getWidth();
                width2 = view.getWidth() + this.f16529OooO00o;
            } else if (z) {
                width = this.f16529OooO00o;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f16529OooO00o - view.getWidth();
                width2 = this.f16529OooO00o;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0O0(@NonNull View view, int i) {
            return view.getTop();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0OO(@NonNull View view) {
            return view.getWidth();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0oO(@NonNull View view, int i) {
            this.f16530OooO0O0 = i;
            this.f16529OooO00o = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0oo(int i) {
            OooO0O0 oooO0O0 = SwipeDismissBehavior.this.f16522OooO0O0;
            if (oooO0O0 != null) {
                OooO oooO = (OooO) oooO0O0;
                if (i == 0) {
                    OooOO0O.OooO0O0().OooO0o(oooO.f17721OooO00o.f17703OooOOO0);
                } else if (i == 1 || i == 2) {
                    OooOO0O.OooO0O0().OooO0o0(oooO.f17721OooO00o.f17703OooOOO0);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0055  */
        /* JADX WARN: Code duplicated, block: B:28:0x0057  */
        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooOO0(@NonNull View view, float f, float f2) {
            boolean z;
            int i;
            OooO0O0 oooO0O0;
            this.f16530OooO0O0 = -1;
            int width = view.getWidth();
            boolean z2 = true;
            if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                boolean z3 = ViewCompat.OooO.OooO0Oo(view) == 1;
                int i2 = SwipeDismissBehavior.this.f16524OooO0Oo;
                if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z3 ? f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : !z3 ? f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f16529OooO00o) >= Math.round(view.getWidth() * SwipeDismissBehavior.this.f16526OooO0o0)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                int left = view.getLeft();
                int i3 = this.f16529OooO00o;
                i = left < i3 ? i3 - width : i3 + width;
            } else {
                i = this.f16529OooO00o;
                z2 = false;
            }
            if (SwipeDismissBehavior.this.f16521OooO00o.OooOo0o(i, view.getTop())) {
                OooO0OO oooO0OO = new OooO0OO(view, z2);
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO0(view, oooO0OO);
            } else {
                if (!z2 || (oooO0O0 = SwipeDismissBehavior.this.f16522OooO0O0) == null) {
                    return;
                }
                ((OooO) oooO0O0).OooO00o(view);
            }
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final boolean OooOO0O(View view, int i) {
            int i2 = this.f16530OooO0O0;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.OooOo00(view);
        }
    }

    public interface OooO0O0 {
    }

    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final View f16532Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final boolean f16533Oooo0oO;

        public OooO0OO(View view, boolean z) {
            this.f16532Oooo0o = view;
            this.f16533Oooo0oO = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0O0 oooO0O0;
            o00000 o00000Var = SwipeDismissBehavior.this.f16521OooO00o;
            if (o00000Var != null && o00000Var.OooO()) {
                View view = this.f16532Oooo0o;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO0(view, this);
            } else {
                if (!this.f16533Oooo0oO || (oooO0O0 = SwipeDismissBehavior.this.f16522OooO0O0) == null) {
                    return;
                }
                ((OooO) oooO0O0).OooO00o(this.f16532Oooo0o);
            }
        }
    }

    public static float OooOo0(float f) {
        return Math.min(Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f), 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean zOooOo0 = this.f16523OooO0OO;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zOooOo0 = coordinatorLayout.OooOo0(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f16523OooO0OO = zOooOo0;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16523OooO0OO = false;
        }
        if (!zOooOo0) {
            return false;
        }
        if (this.f16521OooO00o == null) {
            this.f16521OooO00o = new o00000(coordinatorLayout.getContext(), coordinatorLayout, this.f16528OooO0oo);
        }
        return this.f16521OooO00o.OooOo(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(v) == 0) {
            ViewCompat.OooO0o.OooOOoo(v, 1);
            ViewCompat.OooOo00(1048576, v);
            ViewCompat.OooOOO(v, 0);
            if (OooOo00(v)) {
                ViewCompat.OooOo0(v, o0000OO0.OooO00o.f28205OooOOO, new com.google.android.material.behavior.OooO00o(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOoo(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        o00000 o00000Var = this.f16521OooO00o;
        if (o00000Var == null) {
            return false;
        }
        o00000Var.OooOOo0(motionEvent);
        return true;
    }

    public boolean OooOo00(@NonNull View view) {
        return true;
    }
}
