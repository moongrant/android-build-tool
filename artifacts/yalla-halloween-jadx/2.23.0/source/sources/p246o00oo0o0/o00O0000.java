package p246o00oo0o0;

import androidx.annotation.Nullable;
import com.google.common.base.OooO;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0000 implements o000OOo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00O0000 f40726OooO0OO = new o00O0000(Collections.emptyMap());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f40727OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, byte[]> f40728OooO0O0;

    public o00O0000() {
        this(Collections.emptyMap());
    }

    public static boolean OooO0O0(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final o00O0000 OooO00o(o00 o00Var) {
        byte[] bytes;
        Map<String, byte[]> map = this.f40728OooO0O0;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(o00Var.f40676OooO0O0));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap(o00Var.f40675OooO00o);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(OooO.f19059OooO0OO);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return OooO0O0(map, map2) ? this : new o00O0000(map2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00O0000.class != obj.getClass()) {
            return false;
        }
        return OooO0O0(this.f40728OooO0O0, ((o00O0000) obj).f40728OooO0O0);
    }

    public final int hashCode() {
        if (this.f40727OooO00o == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f40728OooO0O0.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f40727OooO00o = iHashCode;
        }
        return this.f40727OooO00o;
    }

    public o00O0000(Map<String, byte[]> map) {
        this.f40728OooO0O0 = Collections.unmodifiableMap(map);
    }
}
