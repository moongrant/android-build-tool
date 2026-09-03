package p659o0oooO;

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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.o0O;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo0 {
    public static final Map OooO00o(ArrayList arrayList) {
        String str = o0OOOO00.f59787OooO0o0;
        o0OOOO00 o0oooo00OooO00o = o0OOOO00.OooO00o.OooO00o("/", false);
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(o0oooo00OooO00o, new o000OO0O(o0oooo00OooO00o)));
        for (o000OO0O o000oo0o2 : CollectionsKt.sortedWith(arrayList, new o000O0O0())) {
            if (((o000OO0O) mapMutableMapOf.put(o000oo0o2.f59642OooO00o, o000oo0o2)) == null) {
                while (true) {
                    o0OOOO00 o0oooo00OooO0O0 = o000oo0o2.f59642OooO00o.OooO0O0();
                    if (o0oooo00OooO0O0 == null) {
                        break;
                    }
                    o000OO0O o000oo0o3 = (o000OO0O) mapMutableMapOf.get(o0oooo00OooO0O0);
                    o0OOOO00 o0oooo01 = o000oo0o2.f59642OooO00o;
                    if (o000oo0o3 != null) {
                        o000oo0o3.f59649OooO0oo.add(o0oooo01);
                        break;
                    }
                    o000OO0O o000oo0o4 = new o000OO0O(o0oooo00OooO0O0);
                    mapMutableMapOf.put(o0oooo00OooO0O0, o000oo0o4);
                    o000oo0o4.f59649OooO0oo.add(o0oooo01);
                    o000oo0o2 = o000oo0o4;
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
    public static final o000OO0O OooO0OO(@NotNull o0o0000 o0o0000Var) throws IOException {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(o0o0000Var, "<this>");
        int iO0000Ooo = o0o0000Var.o0000Ooo();
        if (iO0000Ooo != 33639248) {
            throw new IOException("bad zip: expected " + OooO0O0(33639248) + " but was " + OooO0O0(iO0000Ooo));
        }
        o0o0000Var.skip(4L);
        int iOooO0oO = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        if ((iOooO0oO & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + OooO0O0(iOooO0oO));
        }
        int iOooO0oO2 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO3 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO4 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        if (iOooO0oO3 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((iOooO0oO4 >> 9) & 127) + 1980, ((iOooO0oO4 >> 5) & 15) - 1, iOooO0oO4 & 31, (iOooO0oO3 >> 11) & 31, (iOooO0oO3 >> 5) & 63, (iOooO0oO3 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l = lValueOf;
        o0o0000Var.o0000Ooo();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = ((long) o0o0000Var.o0000Ooo()) & 4294967295L;
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = ((long) o0o0000Var.o0000Ooo()) & 4294967295L;
        int iOooO0oO5 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO6 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        int iOooO0oO7 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        o0o0000Var.skip(8L);
        Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = ((long) o0o0000Var.o0000Ooo()) & 4294967295L;
        String strOooooOO = o0o0000Var.OooooOO(iOooO0oO5);
        if (StringsKt__StringsKt.contains$default((CharSequence) strOooooOO, (char) 0, false, 2, (Object) null)) {
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
        OooO0Oo(o0o0000Var, iOooO0oO6, new o000O(booleanRef, j2, longRef2, o0o0000Var, longRef, longRef3));
        if (j2 > 0 && !booleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strOooooOO2 = o0o0000Var.OooooOO(iOooO0oO7);
        String str = o0OOOO00.f59787OooO0o0;
        return new o000OO0O(o0OOOO00.OooO00o.OooO00o("/", false).OooO0OO(strOooooOO), StringsKt__StringsJVMKt.endsWith$default(strOooooOO, "/", false, 2, null), strOooooOO2, longRef.element, longRef2.element, iOooO0oO2, l, longRef3.element);
    }

    public static final void OooO0Oo(o0o0000 o0o0000Var, int i, Function2 function2) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iOooO0oO = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
            long jOooO0oO = ((long) o0o0000Var.OooO0oO()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < jOooO0oO) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            o0o0000Var.OoooOoO(jOooO0oO);
            oo0OOoo oo0oooo = o0o0000Var.f59801OooO0o0;
            long j3 = oo0oooo.f59828OooO0o0;
            function2.invoke(Integer.valueOf(iOooO0oO), Long.valueOf(jOooO0oO));
            long j4 = (oo0oooo.f59828OooO0o0 + jOooO0oO) - j3;
            if (j4 < 0) {
                throw new IOException(OooO00o.OooO00o("unsupported zip: too many bytes processed for ", iOooO0oO));
            }
            if (j4 > 0) {
                oo0oooo.skip(j4);
            }
            j = j2 - jOooO0oO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o0O OooO0o0(o0o0000 o0o0000Var, o0O o0o) throws IOException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = o0o != null ? o0o.f59747OooO0o : 0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int iO0000Ooo = o0o0000Var.o0000Ooo();
        if (iO0000Ooo != 67324752) {
            throw new IOException("bad zip: expected " + OooO0O0(67324752) + " but was " + OooO0O0(iO0000Ooo));
        }
        o0o0000Var.skip(2L);
        int iOooO0oO = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        if ((iOooO0oO & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + OooO0O0(iOooO0oO));
        }
        o0o0000Var.skip(18L);
        long jOooO0oO = ((long) o0o0000Var.OooO0oO()) & 65535;
        int iOooO0oO2 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
        o0o0000Var.skip(jOooO0oO);
        if (o0o == null) {
            o0o0000Var.skip(iOooO0oO2);
            return null;
        }
        OooO0Oo(o0o0000Var, iOooO0oO2, new o000OO00(o0o0000Var, objectRef, objectRef2, objectRef3));
        return new o0O(o0o.f59743OooO00o, o0o.f59744OooO0O0, null, o0o.f59746OooO0Oo, (Long) objectRef3.element, (Long) objectRef.element, (Long) objectRef2.element);
    }
}
