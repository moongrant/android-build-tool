package p660o0ooo0o0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p659o0ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO0O0 f51229Oooo0oO = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String[] f51230Oooo0o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<String> f51231OooO00o = new ArrayList(20);

        @NotNull
        public final OooO00o OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            OooO0O0 oooO0O0 = o00O.f51229Oooo0oO;
            oooO0O0.OooO00o(name);
            oooO0O0.OooO0O0(value, name);
            OooO0OO(name, value);
            return this;
        }

        @NotNull
        public final OooO00o OooO0O0(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                OooO0OO(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                OooO0OO("", strSubstring3);
            } else {
                OooO0OO("", line);
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @NotNull
        public final OooO00o OooO0OO(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f51231OooO00o.add(name);
            this.f51231OooO00o.add(StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @NotNull
        public final o00O OooO0Oo() {
            Object[] array = this.f51231OooO00o.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new o00O((String[]) array);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @NotNull
        public final OooO00o OooO0o(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < this.f51231OooO00o.size()) {
                if (StringsKt.OooO(name, (String) this.f51231OooO00o.get(i))) {
                    this.f51231OooO00o.remove(i);
                    this.f51231OooO00o.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @Nullable
        public final String OooO0o0(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            IntProgression intProgressionStep = RangesKt.step(RangesKt.downTo(this.f51231OooO00o.size() - 2, 0), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!StringsKt.OooO(name, (String) this.f51231OooO00o.get(first))) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return (String) this.f51231OooO00o.get(first + 1);
        }

        @NotNull
        public final OooO00o OooO0oO(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            OooO0O0 oooO0O0 = o00O.f51229Oooo0oO;
            oooO0O0.OooO00o(name);
            oooO0O0.OooO0O0(value, name);
            OooO0o(name);
            OooO0OO(name, value);
            return this;
        }
    }

    public static final class OooO0O0 {
        public final void OooO00o(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(o00OOO00.OooOO0("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public final void OooO0O0(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(o00OOO00.OooOO0("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(o00OOO00.OooOOo(str2) ? "" : OooOo00.OooO0Oo(": ", str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public final o00O OooO0OO(@NotNull String... namesAndValues) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (!(strArr[i] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr[i];
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                strArr[i] = StringsKt.trim((CharSequence) str).toString();
            }
            IntProgression intProgressionStep = RangesKt.step(ArraysKt.getIndices(strArr), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step < 0 ? first >= last : first <= last) {
                while (true) {
                    String str2 = strArr[first];
                    String str3 = strArr[first + 1];
                    OooO00o(str2);
                    OooO0O0(str3, str2);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            return new o00O(strArr);
        }
    }

    public o00O(String[] strArr) {
        this.f51230Oooo0o = strArr;
    }

    @Nullable
    public final String OooO00o(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f51230Oooo0o;
        IntProgression intProgressionStep = RangesKt.step(RangesKt.downTo(strArr.length - 2, 0), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (!StringsKt.OooO(name, strArr[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return strArr[first + 1];
        }
        return null;
    }

    @NotNull
    public final String OooO0O0(int i) {
        return this.f51230Oooo0o[i * 2];
    }

    @NotNull
    public final OooO00o OooO0OO() {
        OooO00o oooO00o = new OooO00o();
        CollectionsKt.addAll(oooO00o.f51231OooO00o, this.f51230Oooo0o);
        return oooO00o;
    }

    @NotNull
    public final String OooO0o0(int i) {
        return this.f51230Oooo0o[(i * 2) + 1];
    }

    @NotNull
    public final List<String> OooO0oO(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int length = this.f51230Oooo0o.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (StringsKt.OooO(name, OooO0O0(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(OooO0o0(i));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o00O) && Arrays.equals(this.f51230Oooo0o, ((o00O) obj).f51230Oooo0o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f51230Oooo0o);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int length = this.f51230Oooo0o.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i = 0; i < length; i++) {
            pairArr[i] = TuplesKt.to(OooO0O0(i), OooO0o0(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f51230Oooo0o.length / 2;
        for (int i = 0; i < length; i++) {
            String strOooO0O0 = OooO0O0(i);
            String strOooO0o0 = OooO0o0(i);
            sb.append(strOooO0O0);
            sb.append(": ");
            if (o00OOO00.OooOOo(strOooO0O0)) {
                strOooO0o0 = "██";
            }
            sb.append(strOooO0o0);
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
