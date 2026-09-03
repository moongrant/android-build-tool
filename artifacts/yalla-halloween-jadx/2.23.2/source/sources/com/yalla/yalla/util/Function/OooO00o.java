package com.yalla.yalla.util.Function;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ArrayRes;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f32260OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f32261OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0OO f32262OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final View f32263OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f32264OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f32265OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f32266OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f32267OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f32268OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f32269OooOO0;

    /* JADX INFO: renamed from: com.yalla.yalla.util.Function.OooO00o$OooO00o, reason: collision with other inner class name */
    public class RunnableC0374OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f32270OooO0Oo;

        public RunnableC0374OooO00o(int i) {
            this.f32270OooO0Oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO oooO0OO;
            OooO00o oooO00o = OooO00o.this;
            boolean z = oooO00o.f32268OooO0oo;
            int i = this.f32270OooO0Oo;
            if (z) {
                if (z) {
                    oooO00o.f32260OooO = 2;
                    oooO00o.f32269OooOO0 = i;
                    return;
                }
                return;
            }
            oooO00o.f32267OooO0oO = false;
            if (i == 0 && (oooO0OO = oooO00o.f32262OooO0O0) != null) {
                oooO0OO.OooO0O0();
            }
            oooO00o.f32263OooO0OO.setBackgroundResource(oooO00o.f32264OooO0Oo[i]);
            if (i != oooO00o.f32265OooO0o) {
                oooO00o.OooO0O0(i + 1);
                return;
            }
            OooO0OO oooO0OO2 = oooO00o.f32262OooO0O0;
            if (oooO0OO2 != null) {
                oooO0OO2.OooO0OO();
            }
            oooO00o.f32267OooO0oO = true;
            oooO00o.OooO0O0(0);
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f32272OooO0Oo;

        public OooO0O0(int i) {
            this.f32272OooO0Oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO oooO0OO;
            OooO00o oooO00o = OooO00o.this;
            boolean z = oooO00o.f32268OooO0oo;
            int i = this.f32272OooO0Oo;
            if (z) {
                if (z) {
                    oooO00o.f32260OooO = 4;
                    oooO00o.f32269OooOO0 = i;
                    return;
                }
                return;
            }
            if (i == 0 && (oooO0OO = oooO00o.f32262OooO0O0) != null) {
                oooO0OO.OooO0O0();
            }
            oooO00o.f32263OooO0OO.setBackgroundResource(oooO00o.f32264OooO0Oo[i]);
            if (i != oooO00o.f32265OooO0o) {
                oooO00o.OooO00o(i + 1);
                return;
            }
            if (oooO00o.f32261OooO00o) {
                OooO0OO oooO0OO2 = oooO00o.f32262OooO0O0;
                if (oooO0OO2 != null) {
                    oooO0OO2.OooO0OO();
                }
                oooO00o.OooO00o(0);
                return;
            }
            OooO0OO oooO0OO3 = oooO00o.f32262OooO0O0;
            if (oooO0OO3 != null) {
                oooO0OO3.OooO00o();
            }
        }
    }

    public interface OooO0OO {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();
    }

    public OooO00o(@ArrayRes int i, int i2, Context context, ImageView imageView, boolean z) {
        this.f32263OooO0OO = imageView;
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = typedArrayObtainTypedArray.getResourceId(i3, -1);
        }
        typedArrayObtainTypedArray.recycle();
        this.f32264OooO0Oo = iArr;
        this.f32266OooO0o0 = i2;
        this.f32265OooO0o = length - 1;
        this.f32261OooO00o = z;
        OooO00o(0);
    }

    public final void OooO00o(int i) {
        this.f32263OooO0OO.postDelayed(new OooO0O0(i), this.f32266OooO0o0);
    }

    public final void OooO0O0(int i) {
        RunnableC0374OooO00o runnableC0374OooO00o = new RunnableC0374OooO00o(i);
        boolean z = this.f32267OooO0oO;
        this.f32263OooO0OO.postDelayed(runnableC0374OooO00o, this.f32266OooO0o0);
    }

    public final void OooO0OO() {
        if (this.f32268OooO0oo) {
            this.f32268OooO0oo = false;
            int i = this.f32260OooO;
            if (i == 1) {
                throw null;
            }
            if (i == 2) {
                OooO0O0(this.f32269OooOO0);
            } else {
                if (i == 3) {
                    throw null;
                }
                if (i != 4) {
                    return;
                }
                OooO00o(this.f32269OooOO0);
            }
        }
    }
}
