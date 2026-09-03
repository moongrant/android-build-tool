package p046Oooooo0;

import android.media.AudioRecord;
import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.AudioSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p028Oooo0oO.o00O0O0;
import p039OoooOoo.o0o0Oo;
import p041Ooooo0o.o00000;
import p042OooooO0.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OOOO0 {
    public static int OooO00o(@NonNull AudioSpec audioSpec) {
        int iOooO0o0 = audioSpec.OooO0o0();
        if (iOooO0o0 == -1) {
            o00O0O0.OooO00o("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        o00O0O0.OooO00o("AudioConfigUtil", "Using provided AUDIO source: " + iOooO0o0);
        return iOooO0o0;
    }

    public static int OooO0O0(@NonNull AudioSpec audioSpec) {
        int iOooO0o = audioSpec.OooO0o();
        if (iOooO0o == -1) {
            o00O0O0.OooO00o("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        o00O0O0.OooO00o("AudioConfigUtil", "Using provided AUDIO source format: " + iOooO0o);
        return iOooO0o;
    }

    public static int OooO0OO(int i, int i2, int i3, int i4, int i5, Range<Integer> range) {
        int iDoubleValue = (int) (new Rational(i4, i5).doubleValue() * new Rational(i2, i3).doubleValue() * ((double) i));
        String string = o00O0O0.OooO0o0("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(iDoubleValue)) : "";
        if (!AudioSpec.f3874OooO00o.equals(range)) {
            iDoubleValue = ((Integer) range.clamp(Integer.valueOf(iDoubleValue))).intValue();
            if (o00O0O0.OooO0o0("AudioConfigUtil")) {
                StringBuilder sbOooO00o = o0o0Oo.OooO00o(string);
                sbOooO00o.append(String.format("\nClamped to range %s -> %dbps", range, Integer.valueOf(iDoubleValue)));
                string = sbOooO00o.toString();
            }
        }
        o00O0O0.OooO00o("AudioConfigUtil", string);
        return iDoubleValue;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public static int OooO0Oo(@NonNull Range<Integer> range, int i, int i2, final int i3) {
        boolean z;
        ArrayList arrayList = null;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            if (range.contains(Integer.valueOf(i4))) {
                if (i4 > 0 && i > 0) {
                    z = AudioRecord.getMinBufferSize(i4, i == 1 ? 16 : 12, i2) > 0;
                }
                if (z) {
                    return i4;
                }
                StringBuilder sbOooO00o = o00000.OooO00o("Sample rate ", i4, "Hz is not supported by audio source with channel count ", i, " and source format ");
                sbOooO00o.append(i2);
                o00O0O0.OooO00o("AudioConfigUtil", sbOooO00o.toString());
            } else {
                o00O0O0.OooO00o("AudioConfigUtil", "Sample rate " + i4 + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                o00O0O0.OooO00o("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(oOO00O.f1797OooO00o);
                Collections.sort(arrayList, new Comparator() { // from class: Oooooo0.o0o0Oo
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Integer num = (Integer) obj;
                        Integer num2 = (Integer) obj2;
                        int iIntValue = num.intValue();
                        int i6 = i3;
                        int iAbs = Math.abs(iIntValue - i6) - Math.abs(num2.intValue() - i6);
                        return (int) (iAbs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(iAbs));
                    }
                });
            }
            if (i5 >= arrayList.size()) {
                o00O0O0.OooO00o("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            int i6 = i5 + 1;
            int iIntValue = ((Integer) arrayList.get(i5)).intValue();
            i5 = i6;
            i4 = iIntValue;
        }
    }
}
