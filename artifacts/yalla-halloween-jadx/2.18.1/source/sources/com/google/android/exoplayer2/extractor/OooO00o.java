package com.google.android.exoplayer2.extractor;

import android.util.Log;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {
    public static void OooO00o(long j, o000 o000Var, TrackOutput[] trackOutputArr) {
        int i;
        int iOooOOo0;
        while (true) {
            if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 == 0) {
                    i = -1;
                    break;
                }
                int iOooOOo1 = o000Var.OooOOo0();
                i2 += iOooOOo1;
                if (iOooOOo1 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 == 0) {
                    i3 = -1;
                    break;
                } else {
                    iOooOOo0 = o000Var.OooOOo0();
                    i3 += iOooOOo0;
                }
            } while (iOooOOo0 == 255);
            int i4 = o000Var.f36662OooO0O0;
            int i5 = i4 + i3;
            if (i3 == -1 || i3 > o000Var.f36663OooO0OO - i4) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = o000Var.f36663OooO0OO;
            } else if (i == 4 && i3 >= 8) {
                int iOooOOo2 = o000Var.OooOOo0();
                int iOooOo0O = o000Var.OooOo0O();
                int iOooO0Oo = iOooOo0O == 49 ? o000Var.OooO0Oo() : 0;
                int iOooOOo3 = o000Var.OooOOo0();
                if (iOooOo0O == 47) {
                    o000Var.OooOoo0(1);
                }
                boolean z = iOooOOo2 == 181 && (iOooOo0O == 49 || iOooOo0O == 47) && iOooOOo3 == 3;
                if (iOooOo0O == 49) {
                    z &= iOooO0Oo == 1195456820;
                }
                if (z) {
                    OooO0O0(j, o000Var, trackOutputArr);
                }
            }
            o000Var.OooOoOO(i5);
        }
    }

    public static void OooO0O0(long j, o000 o000Var, TrackOutput[] trackOutputArr) {
        int iOooOOo0 = o000Var.OooOOo0();
        if ((iOooOOo0 & 64) != 0) {
            o000Var.OooOoo0(1);
            int i = (iOooOOo0 & 31) * 3;
            int i2 = o000Var.f36662OooO0O0;
            for (TrackOutput trackOutput : trackOutputArr) {
                o000Var.OooOoOO(i2);
                trackOutput.OooO0OO(o000Var, i);
                trackOutput.OooO0Oo(j, 1, i, 0, null);
            }
        }
    }
}
