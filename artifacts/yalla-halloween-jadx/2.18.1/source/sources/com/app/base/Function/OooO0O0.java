package com.app.base.Function;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import androidx.annotation.ArrayRes;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f11340OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f11341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC0074OooO0O0 f11342OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View f11343OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f11344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f11345OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f11346OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f11347OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11348OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f11349OooOO0;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f11350Oooo0o;

        public OooO00o(int i) {
            this.f11350Oooo0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0074OooO0O0 interfaceC0074OooO0O0;
            OooO0O0 oooO0O0 = OooO0O0.this;
            boolean z = oooO0O0.f11348OooO0oo;
            if (z) {
                if (z) {
                    oooO0O0.f11340OooO = 4;
                    oooO0O0.f11349OooOO0 = this.f11350Oooo0o;
                    return;
                }
                return;
            }
            if (this.f11350Oooo0o == 0 && (interfaceC0074OooO0O0 = oooO0O0.f11342OooO0O0) != null) {
                interfaceC0074OooO0O0.OooO0O0();
            }
            OooO0O0 oooO0O1 = OooO0O0.this;
            oooO0O1.f11343OooO0OO.setBackgroundResource(oooO0O1.f11344OooO0Oo[this.f11350Oooo0o]);
            int i = this.f11350Oooo0o;
            OooO0O0 oooO0O2 = OooO0O0.this;
            if (i != oooO0O2.f11345OooO0o) {
                oooO0O2.OooO00o(i + 1);
                return;
            }
            if (oooO0O2.f11341OooO00o) {
                InterfaceC0074OooO0O0 interfaceC0074OooO0O1 = oooO0O2.f11342OooO0O0;
                if (interfaceC0074OooO0O1 != null) {
                    interfaceC0074OooO0O1.OooO0OO();
                }
                OooO0O0.this.OooO00o(0);
                return;
            }
            InterfaceC0074OooO0O0 interfaceC0074OooO0O2 = oooO0O2.f11342OooO0O0;
            if (interfaceC0074OooO0O2 != null) {
                interfaceC0074OooO0O2.OooO00o();
            }
        }
    }

    /* JADX INFO: renamed from: com.app.base.Function.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0074OooO0O0 {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();
    }

    public OooO0O0(View view, Context context, @ArrayRes int i, int i2, boolean z) {
        this.f11343OooO0OO = view;
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = typedArrayObtainTypedArray.getResourceId(i3, -1);
        }
        typedArrayObtainTypedArray.recycle();
        this.f11344OooO0Oo = iArr;
        this.f11346OooO0o0 = i2;
        this.f11345OooO0o = iArr.length - 1;
        this.f11341OooO00o = z;
        OooO00o(0);
    }

    public final void OooO00o(int i) {
        this.f11343OooO0OO.postDelayed(new OooO00o(i), this.f11346OooO0o0);
    }

    public final void OooO0O0() {
        if (this.f11348OooO0oo) {
            this.f11348OooO0oo = false;
            int i = this.f11340OooO;
            if (i == 1) {
                throw null;
            }
            if (i == 2) {
                this.f11343OooO0OO.postDelayed(new com.app.base.Function.OooO00o(this, this.f11349OooOO0), this.f11346OooO0o0);
            } else {
                if (i == 3) {
                    throw null;
                }
                if (i != 4) {
                    return;
                }
                OooO00o(this.f11349OooOO0);
            }
        }
    }
}
