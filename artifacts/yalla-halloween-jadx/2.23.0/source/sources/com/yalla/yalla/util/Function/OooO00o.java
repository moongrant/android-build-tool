package com.yalla.yalla.util.Function;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ArrayRes;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f32796OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f32797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0OO f32798OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final View f32799OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f32800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f32801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f32802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f32803OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f32804OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f32805OooOO0;

    /* JADX INFO: renamed from: com.yalla.yalla.util.Function.OooO00o$OooO00o, reason: collision with other inner class name */
    public class RunnableC0375OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f32806OooO0Oo;

        public RunnableC0375OooO00o(int i) {
            this.f32806OooO0Oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO oooO0OO;
            OooO00o oooO00o = OooO00o.this;
            boolean z = oooO00o.f32804OooO0oo;
            int i = this.f32806OooO0Oo;
            if (z) {
                if (z) {
                    oooO00o.f32796OooO = 2;
                    oooO00o.f32805OooOO0 = i;
                    return;
                }
                return;
            }
            oooO00o.f32803OooO0oO = false;
            if (i == 0 && (oooO0OO = oooO00o.f32798OooO0O0) != null) {
                oooO0OO.OooO0O0();
            }
            oooO00o.f32799OooO0OO.setBackgroundResource(oooO00o.f32800OooO0Oo[i]);
            if (i != oooO00o.f32801OooO0o) {
                oooO00o.OooO0O0(i + 1);
                return;
            }
            OooO0OO oooO0OO2 = oooO00o.f32798OooO0O0;
            if (oooO0OO2 != null) {
                oooO0OO2.OooO0OO();
            }
            oooO00o.f32803OooO0oO = true;
            oooO00o.OooO0O0(0);
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f32808OooO0Oo;

        public OooO0O0(int i) {
            this.f32808OooO0Oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO oooO0OO;
            OooO00o oooO00o = OooO00o.this;
            boolean z = oooO00o.f32804OooO0oo;
            int i = this.f32808OooO0Oo;
            if (z) {
                if (z) {
                    oooO00o.f32796OooO = 4;
                    oooO00o.f32805OooOO0 = i;
                    return;
                }
                return;
            }
            if (i == 0 && (oooO0OO = oooO00o.f32798OooO0O0) != null) {
                oooO0OO.OooO0O0();
            }
            oooO00o.f32799OooO0OO.setBackgroundResource(oooO00o.f32800OooO0Oo[i]);
            if (i != oooO00o.f32801OooO0o) {
                oooO00o.OooO00o(i + 1);
                return;
            }
            if (oooO00o.f32797OooO00o) {
                OooO0OO oooO0OO2 = oooO00o.f32798OooO0O0;
                if (oooO0OO2 != null) {
                    oooO0OO2.OooO0OO();
                }
                oooO00o.OooO00o(0);
                return;
            }
            OooO0OO oooO0OO3 = oooO00o.f32798OooO0O0;
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
        this.f32799OooO0OO = imageView;
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = typedArrayObtainTypedArray.getResourceId(i3, -1);
        }
        typedArrayObtainTypedArray.recycle();
        this.f32800OooO0Oo = iArr;
        this.f32802OooO0o0 = i2;
        this.f32801OooO0o = length - 1;
        this.f32797OooO00o = z;
        OooO00o(0);
    }

    public final void OooO00o(int i) {
        this.f32799OooO0OO.postDelayed(new OooO0O0(i), this.f32802OooO0o0);
    }

    public final void OooO0O0(int i) {
        RunnableC0375OooO00o runnableC0375OooO00o = new RunnableC0375OooO00o(i);
        boolean z = this.f32803OooO0oO;
        this.f32799OooO0OO.postDelayed(runnableC0375OooO00o, this.f32802OooO0o0);
    }

    public final void OooO0OO() {
        if (this.f32804OooO0oo) {
            this.f32804OooO0oo = false;
            int i = this.f32796OooO;
            if (i == 1) {
                throw null;
            }
            if (i == 2) {
                OooO0O0(this.f32805OooOO0);
            } else {
                if (i == 3) {
                    throw null;
                }
                if (i != 4) {
                    return;
                }
                OooO00o(this.f32805OooOO0);
            }
        }
    }
}
