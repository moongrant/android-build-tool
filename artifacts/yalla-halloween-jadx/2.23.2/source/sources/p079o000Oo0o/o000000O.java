package p079o000Oo0o;

import androidx.annotation.Nullable;
import androidx.media3.extractor.OooO0O0;
import androidx.media3.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f34906OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long[] f34907OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f34908OooO0Oo;

    public o000000O() {
        super(new OooO0O0());
        this.f34906OooO0O0 = -9223372036854775807L;
        this.f34907OooO0OO = new long[0];
        this.f34908OooO0Oo = new long[0];
    }

    @Nullable
    public static Serializable OooO0O0(int i, o000O000 o000o001) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(o000o001.OooOOOO()));
        }
        if (i == 1) {
            return Boolean.valueOf(o000o001.OooOo0O() == 1);
        }
        if (i == 2) {
            return OooO0Oo(o000o001);
        }
        if (i != 3) {
            if (i == 8) {
                return OooO0OO(o000o001);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(o000o001.OooOOOO())).doubleValue());
                o000o001.Oooo00o(2);
                return date;
            }
            int iOooOoO0 = o000o001.OooOoO0();
            ArrayList arrayList = new ArrayList(iOooOoO0);
            for (int i2 = 0; i2 < iOooOoO0; i2++) {
                Serializable serializableOooO0O0 = OooO0O0(o000o001.OooOo0O(), o000o001);
                if (serializableOooO0O0 != null) {
                    arrayList.add(serializableOooO0O0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strOooO0Oo = OooO0Oo(o000o001);
            int iOooOo0O = o000o001.OooOo0O();
            if (iOooOo0O == 9) {
                return map;
            }
            Serializable serializableOooO0O1 = OooO0O0(iOooOo0O, o000o001);
            if (serializableOooO0O1 != null) {
                map.put(strOooO0Oo, serializableOooO0O1);
            }
        }
    }

    public static HashMap<String, Object> OooO0OO(o000O000 o000o001) {
        int iOooOoO0 = o000o001.OooOoO0();
        HashMap<String, Object> map = new HashMap<>(iOooOoO0);
        for (int i = 0; i < iOooOoO0; i++) {
            String strOooO0Oo = OooO0Oo(o000o001);
            Serializable serializableOooO0O0 = OooO0O0(o000o001.OooOo0O(), o000o001);
            if (serializableOooO0O0 != null) {
                map.put(strOooO0Oo, serializableOooO0O0);
            }
        }
        return map;
    }

    public static String OooO0Oo(o000O000 o000o001) {
        int iOooOoOO = o000o001.OooOoOO();
        int i = o000o001.f34963OooO0O0;
        o000o001.Oooo00o(iOooOoOO);
        return new String(o000o001.f34962OooO00o, i, iOooOoOO);
    }

    public final boolean OooO00o(long j, o000O000 o000o001) {
        if (o000o001.OooOo0O() != 2 || !"onMetaData".equals(OooO0Oo(o000o001)) || o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 == 0 || o000o001.OooOo0O() != 8) {
            return false;
        }
        HashMap<String, Object> mapOooO0OO = OooO0OO(o000o001);
        Object obj = mapOooO0OO.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f34906OooO0O0 = (long) (dDoubleValue * 1000000.0d);
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
                this.f34907OooO0OO = new long[size];
                this.f34908OooO0Oo = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f34907OooO0OO = new long[0];
                        this.f34908OooO0Oo = new long[0];
                        break;
                    }
                    this.f34907OooO0OO[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f34908OooO0Oo[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
