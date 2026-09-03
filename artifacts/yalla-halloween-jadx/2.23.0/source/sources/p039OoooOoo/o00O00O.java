package p039OoooOoo;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p031OoooO0.OooOOOO;
import p036OoooOOo.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f1680OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HashMap f1681OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f1682OooO00o = new HashMap();

    @AutoValue
    public static abstract class OooO00o {
        public abstract int OooO00o();

        @NonNull
        public abstract o00O000o OooO0O0();
    }

    static {
        HashMap map = new HashMap();
        f1680OooO0O0 = map;
        map.put(o00O000o.f1675OooO0Oo, Range.create(2160, 4319));
        map.put(o00O000o.f1674OooO0OO, Range.create(1080, 1439));
        map.put(o00O000o.f1673OooO0O0, Range.create(720, 1079));
        map.put(o00O000o.f1672OooO00o, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f1681OooO0OO = map2;
        map2.put(0, OooOOOO.f1388OooO00o);
        map2.put(1, OooOOOO.f1390OooO0OO);
    }

    public o00O00O(@NonNull List list, @NonNull HashMap map) {
        HashMap map2;
        Integer num;
        o00O000o o00o000o2;
        HashMap map3 = f1680OooO0O0;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = f1681OooO0OO;
            if (!zHasNext) {
                break;
            }
            o00O000o o00o000o3 = (o00O000o) it.next();
            this.f1682OooO00o.put(new o000O0O0(o00o000o3, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.f1682OooO00o.put(new o000O0O0(o00o000o3, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.f1682OooO00o.get(new o000O0O0((o00O000o) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    o00o000o2 = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    o00o000o2 = (o00O000o) entry2.getKey();
                    break;
                }
            }
            if (o00o000o2 != null) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    if (OooOOOO.OooO00o(size, (Rational) entry3.getValue(), o0000oo.f1474OooO0O0)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f1682OooO00o.get(new o000O0O0(o00o000o2, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f1682OooO00o.entrySet()) {
            Size size2 = (Size) map.get(((OooO00o) entry4.getKey()).OooO0O0());
            if (size2 != null) {
                Size size3 = o0000oo.f1473OooO00o;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: OoooOoo.o00O00
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Size size4 = (Size) obj;
                        Size size5 = (Size) obj2;
                        Size size6 = o0000oo.f1473OooO00o;
                        int height2 = size4.getHeight() * size4.getWidth();
                        int i = height;
                        return Math.abs(height2 - i) - Math.abs((size5.getHeight() * size5.getWidth()) - i);
                    }
                });
            }
        }
    }
}
