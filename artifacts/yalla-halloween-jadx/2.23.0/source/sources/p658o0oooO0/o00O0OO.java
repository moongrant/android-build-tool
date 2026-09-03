package p658o0oooO0;

import android.support.v4.media.OooO00o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O0;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO {
    public static final Map OooO00o(ArrayList arrayList) {
        String str = o000OO00.f60221OooO0o0;
        o000OO00 o000oo00OooO00o = o000OO00.OooO00o.OooO00o("/", false);
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(o000oo00OooO00o, new o00O0O0(o000oo00OooO00o)));
        for (o00O0O0 o00o0o0 : CollectionsKt.sortedWith(arrayList, new o00O0O0O())) {
            if (((o00O0O0) mapMutableMapOf.put(o00o0o0.f60140OooO00o, o00o0o0)) == null) {
                while (true) {
                    o000OO00 o000oo00OooO0O0 = o00o0o0.f60140OooO00o.OooO0O0();
                    if (o000oo00OooO0O0 == null) {
                        break;
                    }
                    o00O0O0 o00o0o1 = (o00O0O0) mapMutableMapOf.get(o000oo00OooO0O0);
                    o000OO00 o000oo01 = o00o0o0.f60140OooO00o;
                    if (o00o0o1 != null) {
                        o00o0o1.f60147OooO0oo.add(o000oo01);
                        break;
                    }
                    o00O0O0 o00o0o2 = new o00O0O0(o000oo00OooO0O0);
                    mapMutableMapOf.put(o000oo00OooO0O0, o00o0o2);
                    o00o0o2.f60147OooO0oo.add(o000oo01);
                    o00o0o0 = o00o0o2;
                }
            }
        }
        return mapMutableMapOf;
    }

    public static final String OooO0O0(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String string = Integer.toString(i, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }

    @NotNull
    public static final o00O0O0 OooO0OO(@NotNull o00O0000 o00o0001) throws IOException {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(o00o0001, "<this>");
        int iO0000Ooo = o00o0001.o0000Ooo();
        if (iO0000Ooo != 33639248) {
            throw new IOException("bad zip: expected " + OooO0O0(33639248) + " but was " + OooO0O0(iO0000Ooo));
        }
        o00o0001.skip(4L);
        int iOooO0oO = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        if ((iOooO0oO & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + OooO0O0(iOooO0oO));
        }
        int iOooO0oO2 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO3 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO4 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        if (iOooO0oO3 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((iOooO0oO4 >> 9) & 127) + 1980, ((iOooO0oO4 >> 5) & 15) - 1, iOooO0oO4 & 31, (iOooO0oO3 >> 11) & 31, (iOooO0oO3 >> 5) & 63, (iOooO0oO3 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l = lValueOf;
        o00o0001.o0000Ooo();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = ((long) o00o0001.o0000Ooo()) & 4294967295L;
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = ((long) o00o0001.o0000Ooo()) & 4294967295L;
        int iOooO0oO5 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO6 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO7 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        o00o0001.skip(8L);
        Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = ((long) o00o0001.o0000Ooo()) & 4294967295L;
        String strOooooO0 = o00o0001.OooooO0(iOooO0oO5);
        if (StringsKt__StringsKt.contains$default((CharSequence) strOooooO0, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = longRef2.element == 4294967295L ? ((long) 8) + 0 : 0L;
        if (longRef.element == 4294967295L) {
            j += (long) 8;
        }
        if (longRef3.element == 4294967295L) {
            j += (long) 8;
        }
        long j2 = j;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        OooO0Oo(o00o0001, iOooO0oO6, new o00O0OO0(booleanRef, j2, longRef2, o00o0001, longRef, longRef3));
        if (j2 > 0 && !booleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strOooooO1 = o00o0001.OooooO0(iOooO0oO7);
        String str = o000OO00.f60221OooO0o0;
        return new o00O0O0(o000OO00.OooO00o.OooO00o("/", false).OooO0OO(strOooooO0), StringsKt.OooOO0O(strOooooO0, "/"), strOooooO1, longRef.element, longRef2.element, iOooO0oO2, l, longRef3.element);
    }

    public static final void OooO0Oo(o00O0000 o00o0001, int i, Function2 function2) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iOooO0oO = o00o0001.OooO0oO() & UShort.MAX_VALUE;
            long jOooO0oO = ((long) o00o0001.OooO0oO()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < jOooO0oO) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            o00o0001.OoooOoO(jOooO0oO);
            o00000O o00000o = o00o0001.f60234OooO0o0;
            long j3 = o00000o.f60177OooO0o0;
            function2.invoke(Integer.valueOf(iOooO0oO), Long.valueOf(jOooO0oO));
            long j4 = (o00000o.f60177OooO0o0 + jOooO0oO) - j3;
            if (j4 < 0) {
                throw new IOException(OooO00o.OooO00o("unsupported zip: too many bytes processed for ", iOooO0oO));
            }
            if (j4 > 0) {
                o00000o.skip(j4);
            }
            j = j2 - jOooO0oO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o0000O0 OooO0o0(o00O0000 o00o0001, o0000O0 o0000o1) throws IOException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = o0000o1 != null ? o0000o1.f60191OooO0o : 0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int iO0000Ooo = o00o0001.o0000Ooo();
        if (iO0000Ooo != 67324752) {
            throw new IOException("bad zip: expected " + OooO0O0(67324752) + " but was " + OooO0O0(iO0000Ooo));
        }
        o00o0001.skip(2L);
        int iOooO0oO = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        if ((iOooO0oO & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + OooO0O0(iOooO0oO));
        }
        o00o0001.skip(18L);
        long jOooO0oO = ((long) o00o0001.OooO0oO()) & 65535;
        int iOooO0oO2 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
        o00o0001.skip(jOooO0oO);
        if (o0000o1 == null) {
            o00o0001.skip(iOooO0oO2);
            return null;
        }
        OooO0Oo(o00o0001, iOooO0oO2, new oo0o0O0(o00o0001, objectRef, objectRef2, objectRef3));
        return new o0000O0(o0000o1.f60187OooO00o, o0000o1.f60188OooO0O0, null, o0000o1.f60190OooO0Oo, (Long) objectRef3.element, (Long) objectRef.element, (Long) objectRef2.element);
    }
}
