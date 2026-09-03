package p297o0O0OoOo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.OooO0O0;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f35961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long[] f35962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f35963OooO0Oo;

    public o0000OO0() {
        super(new OooO0O0());
        this.f35961OooO0O0 = -9223372036854775807L;
        this.f35962OooO0OO = new long[0];
        this.f35963OooO0Oo = new long[0];
    }

    @Nullable
    public static Object OooO0Oo(o000 o000Var, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(o000Var.OooOO0O()));
        }
        if (i == 1) {
            return Boolean.valueOf(o000Var.OooOOo0() == 1);
        }
        if (i == 2) {
            return OooO0o(o000Var);
        }
        if (i != 3) {
            if (i == 8) {
                return OooO0o0(o000Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(o000Var.OooOO0O())).doubleValue());
                o000Var.OooOoo0(2);
                return date;
            }
            int iOooOo00 = o000Var.OooOo00();
            ArrayList arrayList = new ArrayList(iOooOo00);
            for (int i2 = 0; i2 < iOooOo00; i2++) {
                Object objOooO0Oo = OooO0Oo(o000Var, o000Var.OooOOo0());
                if (objOooO0Oo != null) {
                    arrayList.add(objOooO0Oo);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strOooO0o = OooO0o(o000Var);
            int iOooOOo0 = o000Var.OooOOo0();
            if (iOooOOo0 == 9) {
                return map;
            }
            Object objOooO0Oo2 = OooO0Oo(o000Var, iOooOOo0);
            if (objOooO0Oo2 != null) {
                map.put(strOooO0o, objOooO0Oo2);
            }
        }
    }

    public static String OooO0o(o000 o000Var) {
        int iOooOo0O = o000Var.OooOo0O();
        int i = o000Var.f36662OooO0O0;
        o000Var.OooOoo0(iOooOo0O);
        return new String(o000Var.f36661OooO00o, i, iOooOo0O);
    }

    public static HashMap<String, Object> OooO0o0(o000 o000Var) {
        int iOooOo00 = o000Var.OooOo00();
        HashMap<String, Object> map = new HashMap<>(iOooOo00);
        for (int i = 0; i < iOooOo00; i++) {
            String strOooO0o = OooO0o(o000Var);
            Object objOooO0Oo = OooO0Oo(o000Var, o000Var.OooOOo0());
            if (objOooO0Oo != null) {
                map.put(strOooO0o, objOooO0Oo);
            }
        }
        return map;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean OooO0O0(o000 o000Var) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean OooO0OO(o000 o000Var, long j) {
        if (o000Var.OooOOo0() != 2 || !"onMetaData".equals(OooO0o(o000Var)) || o000Var.OooOOo0() != 8) {
            return false;
        }
        HashMap<String, Object> mapOooO0o0 = OooO0o0(o000Var);
        Object obj = mapOooO0o0.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f35961OooO0O0 = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapOooO0o0.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f35962OooO0OO = new long[size];
                this.f35963OooO0Oo = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f35962OooO0OO = new long[0];
                        this.f35963OooO0Oo = new long[0];
                        break;
                    }
                    this.f35962OooO0OO[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f35963OooO0Oo[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
