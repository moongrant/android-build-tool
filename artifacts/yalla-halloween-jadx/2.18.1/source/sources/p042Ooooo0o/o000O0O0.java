package p042Ooooo0o;

import android.content.res.Resources;
import com.google.android.gms.internal.measurement.zzjd;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.ranges.RangesKt;
import o00000O.o0OO00O;
import p027Oooo0o.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 {
    public static final long OooO00o(int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(OooOOO0.OooO00o("start cannot be negative. [start: ", i, ']').toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(OooOOO0.OooO00o("end cannot negative. [end: ", i2, ']').toString());
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
        return j;
    }

    public static final long OooO0O0(long j, int i) {
        o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
        int i2 = (int) (j >> 32);
        int iCoerceIn = RangesKt.coerceIn(i2, 0, i);
        int iCoerceIn2 = RangesKt.coerceIn(o0OO00O.OooO0Oo(j), 0, i);
        return (iCoerceIn == i2 && iCoerceIn2 == o0OO00O.OooO0Oo(j)) ? j : OooO00o(iCoerceIn, iCoerceIn2);
    }

    public static String OooO0OO(String str, Resources resources) {
        Exception e;
        String str2;
        try {
            InputStream inputStreamOpen = resources.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStreamOpen.read();
                if (i != -1) {
                    byteArrayOutputStream.write(i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStreamOpen.close();
                    str2 = new String(byteArray, "UTF-8");
                    try {
                        return str2.replaceAll("\\r\\n", "\n");
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                e.printStackTrace();
                return str2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = null;
        }
    }

    public static String OooO0Oo(zzjd zzjdVar) {
        StringBuilder sb = new StringBuilder(zzjdVar.zzd());
        for (int i = 0; i < zzjdVar.zzd(); i++) {
            byte bZza = zzjdVar.zza(i);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
                            sb.append((char) ((bZza & 7) + 48));
                        } else {
                            sb.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
