package p175o00o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.OooO0O0;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo000 extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f38561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long[] f38562OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f38563OooO0Oo;

    public Oooo000() {
        super(new OooO0O0());
        this.f38561OooO0O0 = -9223372036854775807L;
        this.f38562OooO0OO = new long[0];
        this.f38563OooO0Oo = new long[0];
    }

    @Nullable
    public static Serializable OooO0O0(int i, o00Oo00 o00oo00) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(o00oo00.OooOOOO()));
        }
        if (i == 1) {
            return Boolean.valueOf(o00oo00.OooOo0O() == 1);
        }
        if (i == 2) {
            return OooO0Oo(o00oo00);
        }
        if (i != 3) {
            if (i == 8) {
                return OooO0OO(o00oo00);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(o00oo00.OooOOOO())).doubleValue());
                o00oo00.Oooo00o(2);
                return date;
            }
            int iOooOoO0 = o00oo00.OooOoO0();
            ArrayList arrayList = new ArrayList(iOooOoO0);
            for (int i2 = 0; i2 < iOooOoO0; i2++) {
                Serializable serializableOooO0O0 = OooO0O0(o00oo00.OooOo0O(), o00oo00);
                if (serializableOooO0O0 != null) {
                    arrayList.add(serializableOooO0O0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strOooO0Oo = OooO0Oo(o00oo00);
            int iOooOo0O = o00oo00.OooOo0O();
            if (iOooOo0O == 9) {
                return map;
            }
            Serializable serializableOooO0O1 = OooO0O0(iOooOo0O, o00oo00);
            if (serializableOooO0O1 != null) {
                map.put(strOooO0Oo, serializableOooO0O1);
            }
        }
    }

    public static HashMap<String, Object> OooO0OO(o00Oo00 o00oo00) {
        int iOooOoO0 = o00oo00.OooOoO0();
        HashMap<String, Object> map = new HashMap<>(iOooOoO0);
        for (int i = 0; i < iOooOoO0; i++) {
            String strOooO0Oo = OooO0Oo(o00oo00);
            Serializable serializableOooO0O0 = OooO0O0(o00oo00.OooOo0O(), o00oo00);
            if (serializableOooO0O0 != null) {
                map.put(strOooO0Oo, serializableOooO0O0);
            }
        }
        return map;
    }

    public static String OooO0Oo(o00Oo00 o00oo00) {
        int iOooOoOO = o00oo00.OooOoOO();
        int i = o00oo00.f40592OooO0O0;
        o00oo00.Oooo00o(iOooOoOO);
        return new String(o00oo00.f40591OooO00o, i, iOooOoOO);
    }

    public final boolean OooO00o(long j, o00Oo00 o00oo00) {
        if (o00oo00.OooOo0O() != 2 || !"onMetaData".equals(OooO0Oo(o00oo00)) || o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 == 0 || o00oo00.OooOo0O() != 8) {
            return false;
        }
        HashMap<String, Object> mapOooO0OO = OooO0OO(o00oo00);
        Object obj = mapOooO0OO.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f38561OooO0O0 = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapOooO0OO.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f38562OooO0OO = new long[size];
                this.f38563OooO0Oo = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f38562OooO0OO = new long[0];
                        this.f38563OooO0Oo = new long[0];
                        break;
                    }
                    this.f38562OooO0OO[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f38563OooO0Oo[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
