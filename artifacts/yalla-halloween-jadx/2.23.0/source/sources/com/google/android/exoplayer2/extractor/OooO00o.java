package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Log;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o {
    public static void OooO00o(long j, o00Oo00 o00oo00, TrackOutput[] trackOutputArr) {
        int i;
        int iOooOo0O;
        while (true) {
            if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 == 0) {
                    i = -1;
                    break;
                }
                int iOooOo0O2 = o00oo00.OooOo0O();
                i2 += iOooOo0O2;
                if (iOooOo0O2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 == 0) {
                    i3 = -1;
                    break;
                } else {
                    iOooOo0O = o00oo00.OooOo0O();
                    i3 += iOooOo0O;
                }
            } while (iOooOo0O == 255);
            int i4 = o00oo00.f40592OooO0O0;
            int i5 = i4 + i3;
            if (i3 == -1 || i3 > o00oo00.f40593OooO0OO - i4) {
                Log.OooO0o("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = o00oo00.f40593OooO0OO;
            } else if (i == 4 && i3 >= 8) {
                int iOooOo0O3 = o00oo00.OooOo0O();
                int iOooOoOO = o00oo00.OooOoOO();
                int iOooO0o = iOooOoOO == 49 ? o00oo00.OooO0o() : 0;
                int iOooOo0O4 = o00oo00.OooOo0O();
                if (iOooOoOO == 47) {
                    o00oo00.Oooo00o(1);
                }
                boolean z = iOooOo0O3 == 181 && (iOooOoOO == 49 || iOooOoOO == 47) && iOooOo0O4 == 3;
                if (iOooOoOO == 49) {
                    z &= iOooO0o == 1195456820;
                }
                if (z) {
                    OooO0O0(j, o00oo00, trackOutputArr);
                }
            }
            o00oo00.Oooo00O(i5);
        }
    }

    public static void OooO0O0(long j, o00Oo00 o00oo00, TrackOutput[] trackOutputArr) {
        int iOooOo0O = o00oo00.OooOo0O();
        if ((iOooOo0O & 64) != 0) {
            o00oo00.Oooo00o(1);
            int i = (iOooOo0O & 31) * 3;
            int i2 = o00oo00.f40592OooO0O0;
            for (TrackOutput trackOutput : trackOutputArr) {
                o00oo00.Oooo00O(i2);
                trackOutput.OooO0O0(i, o00oo00);
                if (j != -9223372036854775807L) {
                    trackOutput.OooO0o0(j, 1, i, 0, null);
                }
            }
        }
    }
}
