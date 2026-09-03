package p641o0ooOO0o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000o00;
import p654o0ooo00o.o000O0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O000 implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String[] f57773OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ArrayList f57774OooO00o = new ArrayList(20);

        @NotNull
        public final void OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            OooO0O0.OooO00o(name);
            OooO0O0.OooO0O0(value, name);
            OooO0O0(name, value);
        }

        @NotNull
        public final void OooO0O0(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f57774OooO00o;
            arrayList.add(name);
            arrayList.add(StringsKt.trim((CharSequence) value).toString());
        }

        @NotNull
        public final o0O000 OooO0OO() {
            Object[] array = this.f57774OooO00o.toArray(new String[0]);
            if (array != null) {
                return new o0O000((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        @NotNull
        public final void OooO0Oo(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f57774OooO00o;
                if (i >= arrayList.size()) {
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(name, (String) arrayList.get(i), true)) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    public static final class OooO0O0 {
        public static void OooO00o(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(oO000o00.OooO("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
                i = i2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0023  */
        public static void OooO0O0(String str, String str2) {
            boolean z;
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt == '\t') {
                    z = true;
                } else {
                    if (' ' <= cCharAt && cCharAt < 127) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus(oO000o00.OooO("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2), oO000o00.OooOOo0(str2) ? "" : Intrinsics.stringPlus(": ", str)).toString());
                }
                i = i2;
            }
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public static o0O000 OooO0OO(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            int i = 0;
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                String str = strArr[i2];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i2] = StringsKt.trim((CharSequence) str).toString();
                i2 = i3;
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    int i4 = i + 2;
                    String str2 = strArr[i];
                    String str3 = strArr[i + 1];
                    OooO00o(str2);
                    OooO0O0(str3, str2);
                    if (i == progressionLastElement) {
                        break;
                    }
                    i = i4;
                }
            }
            return new o0O000(strArr);
        }
    }

    public o0O000(String[] strArr) {
        this.f57773OooO0Oo = strArr;
    }

    @Nullable
    public final String OooO00o(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f57773OooO0Oo;
        int length = strArr.length - 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement <= length) {
            while (true) {
                int i = length - 2;
                if (StringsKt__StringsJVMKt.equals(name, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length != progressionLastElement) {
                    length = i;
                }
            }
        }
        return null;
    }

    @Nullable
    public final Date OooO0O0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strOooO00o = OooO00o(name);
        if (strOooO00o == null) {
            return null;
        }
        return o000O0.OooO00o(strOooO00o);
    }

    @NotNull
    public final String OooO0OO(int i) {
        return this.f57773OooO0Oo[i * 2];
    }

    @NotNull
    public final OooO00o OooO0Oo() {
        OooO00o oooO00o = new OooO00o();
        CollectionsKt__MutableCollectionsKt.addAll(oooO00o.f57774OooO00o, this.f57773OooO0Oo);
        return oooO00o;
    }

    @NotNull
    public final String OooO0o0(int i) {
        return this.f57773OooO0Oo[(i * 2) + 1];
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O000) {
            if (Arrays.equals(this.f57773OooO0Oo, ((o0O000) obj).f57773OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57773OooO0Oo);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int length = this.f57773OooO0Oo.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i = 0; i < length; i++) {
            pairArr[i] = TuplesKt.to(OooO0OO(i), OooO0o0(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f57773OooO0Oo.length / 2;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            String strOooO0OO = OooO0OO(i);
            String strOooO0o0 = OooO0o0(i);
            sb.append(strOooO0OO);
            sb.append(": ");
            if (oO000o00.OooOOo0(strOooO0OO)) {
                strOooO0o0 = "██";
            }
            sb.append(strOooO0o0);
            sb.append("\n");
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
