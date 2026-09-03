package androidx.media3.extractor;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o {
    public static void OooO00o(long j, o000O000 o000o001, TrackOutput[] trackOutputArr) {
        int i;
        int iOooOo0O;
        while (true) {
            if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 == 0) {
                    i = -1;
                    break;
                }
                int iOooOo0O2 = o000o001.OooOo0O();
                i2 += iOooOo0O2;
                if (iOooOo0O2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 == 0) {
                    i3 = -1;
                    break;
                } else {
                    iOooOo0O = o000o001.OooOo0O();
                    i3 += iOooOo0O;
                }
            } while (iOooOo0O == 255);
            int i4 = o000o001.f34963OooO0O0;
            int i5 = i4 + i3;
            if (i3 == -1 || i3 > o000o001.f34964OooO0OO - i4) {
                Log.OooO0o("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = o000o001.f34964OooO0OO;
            } else if (i == 4 && i3 >= 8) {
                int iOooOo0O3 = o000o001.OooOo0O();
                int iOooOoOO = o000o001.OooOoOO();
                int iOooO0o = iOooOoOO == 49 ? o000o001.OooO0o() : 0;
                int iOooOo0O4 = o000o001.OooOo0O();
                if (iOooOoOO == 47) {
                    o000o001.Oooo00o(1);
                }
                boolean z = iOooOo0O3 == 181 && (iOooOoOO == 49 || iOooOoOO == 47) && iOooOo0O4 == 3;
                if (iOooOoOO == 49) {
                    z &= iOooO0o == 1195456820;
                }
                if (z) {
                    OooO0O0(j, o000o001, trackOutputArr);
                }
            }
            o000o001.Oooo00O(i5);
        }
    }

    public static void OooO0O0(long j, o000O000 o000o001, TrackOutput[] trackOutputArr) {
        int iOooOo0O = o000o001.OooOo0O();
        if ((iOooOo0O & 64) != 0) {
            o000o001.Oooo00o(1);
            int i = (iOooOo0O & 31) * 3;
            int i2 = o000o001.f34963OooO0O0;
            for (TrackOutput trackOutput : trackOutputArr) {
                o000o001.Oooo00O(i2);
                trackOutput.OooO0OO(i, o000o001);
                if (j != -9223372036854775807L) {
                    trackOutput.OooO0o0(j, 1, i, 0, null);
                }
            }
        }
    }
}
