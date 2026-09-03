package o000Oo0;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooOo implements OooOOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooOo f34831OooO0OO = new OooOo(Collections.emptyMap());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f34832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, byte[]> f34833OooO0O0;

    public OooOo() {
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

    public final OooOo OooO00o(OooOo00 oooOo00) {
        byte[] bytes;
        Map<String, byte[]> map = this.f34833OooO0O0;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(oooOo00.f34835OooO0O0));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap(oooOo00.f34834OooO00o);
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
                bytes = ((String) value2).getBytes(com.google.common.base.OooOO0.f18592OooO0OO);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return OooO0O0(map, map2) ? this : new OooOo(map2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOo.class != obj.getClass()) {
            return false;
        }
        return OooO0O0(this.f34833OooO0O0, ((OooOo) obj).f34833OooO0O0);
    }

    public final int hashCode() {
        if (this.f34832OooO00o == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f34833OooO0O0.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f34832OooO00o = iHashCode;
        }
        return this.f34832OooO00o;
    }

    public OooOo(Map<String, byte[]> map) {
        this.f34833OooO0O0 = Collections.unmodifiableMap(map);
    }
}
