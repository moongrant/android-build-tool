package p086o000OooO;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p060o0000o.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Deprecated
    public static final Pattern f28513OooOOO0 = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f28514OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f28515OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f28519OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f28522OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f28523OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f28525OooOO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f28516OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f28517OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<String> f28518OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Map<String, OooO0O0> f28520OooO0o0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f28521OooO0oO = LazyKt.lazy(new o0OO00O(this));

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f28524OooOO0O = LazyKt.lazy(new o0Oo0oo(this));

    public static final class OooO00o implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public String f28526Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public String f28527Oooo0oO;

        public OooO00o(@NotNull String mimeType) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> listSplit = new Regex("/").split(mimeType, 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            }
            this.f28526Oooo0o = (String) listEmptyList.get(0);
            this.f28527Oooo0oO = (String) listEmptyList.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(@NotNull OooO00o other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = Intrinsics.areEqual(this.f28526Oooo0o, other.f28526Oooo0o) ? 2 : 0;
            return Intrinsics.areEqual(this.f28527Oooo0oO, other.f28527Oooo0oO) ? i + 1 : i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f28528OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<String> f28529OooO0O0 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r16v0, types: [o000OooO.o0OOO0o] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    public o0OOO0o(@Nullable String str) {
        int i;
        List listEmptyList;
        Iterator<String> it;
        this.f28515OooO00o = str;
        boolean z = true;
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.f28522OooO0oo = uri.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f28513OooOOO0.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (this.f28522OooO0oo) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String strSubstring = str.substring(0, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Intrinsics.checkNotNullExpressionValue(fillInPattern, "fillInPattern");
                    this.f28525OooOO0o = OooO00o(strSubstring, sb, fillInPattern);
                }
                Iterator<String> it2 = uri.getQueryParameterNames().iterator();
                while (it2.hasNext()) {
                    String paramName = it2.next();
                    StringBuilder sb2 = new StringBuilder();
                    String queryParam = uri.getQueryParameter(paramName);
                    if (queryParam == null) {
                        this.f28514OooO = z;
                        queryParam = paramName;
                    }
                    ?? Matcher = fillInPattern.matcher(queryParam);
                    OooO0O0 oooO0O0 = new OooO0O0();
                    int iEnd = 0;
                    ?? r3 = z;
                    while (true) {
                        it = it2;
                        if (!Matcher.find()) {
                            break;
                        }
                        String name = Matcher.group(r3);
                        Objects.requireNonNull(name, "null cannot be cast to non-null type kotlin.String");
                        Intrinsics.checkNotNullParameter(name, "name");
                        oooO0O0.f28529OooO0O0.add(name);
                        Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                        String strSubstring2 = queryParam.substring(iEnd, Matcher.start());
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(Pattern.quote(strSubstring2));
                        sb2.append("(.+?)?");
                        iEnd = Matcher.end();
                        r3 = 1;
                        it2 = it;
                    }
                    if (iEnd < queryParam.length()) {
                        Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                        String strSubstring3 = queryParam.substring(iEnd);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(strSubstring3));
                    }
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "argRegex.toString()");
                    oooO0O0.f28528OooO00o = StringsKt.OooOo00(string, ".*", "\\E.*\\Q");
                    Map<String, OooO0O0> map = this.f28520OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                    map.put(paramName, oooO0O0);
                    z = true;
                    it2 = it;
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(fillInPattern, "fillInPattern");
                this.f28525OooOO0o = OooO00o(str, sb, fillInPattern);
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "uriRegex.toString()");
            this.f28519OooO0o = StringsKt.OooOo00(string2, ".*", "\\E.*\\Q");
        }
        if (this.f28517OooO0OO != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f28517OooO0OO).matches()) {
                throw new IllegalArgumentException(OooO.OooO00o(OooO00o.OooO00o.OooO0o0("The given mimeType "), this.f28517OooO0OO, " does not match to required \"type/subtype\" format").toString());
            }
            String mimeType = this.f28517OooO0OO;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> listSplit = new Regex("/").split(mimeType, 0);
            if (listSplit.isEmpty()) {
                i = 1;
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        i = 1;
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    }
                }
                i = 1;
                listEmptyList = CollectionsKt.emptyList();
            }
            this.f28523OooOO0 = StringsKt.OooOo00(oo000o.OooO00o("^(", (String) listEmptyList.get(0), "|[*]+)/(", (String) listEmptyList.get(i), "|[*]+)$"), "*|[*]", "[\\s\\S]");
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final boolean OooO00o(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !StringsKt__StringsKt.contains$default(str, ".*", false, 2, (Object) null);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup, "null cannot be cast to non-null type kotlin.String");
            this.f28518OooO0Oo.add(strGroup);
            String strSubstring = str.substring(iEnd, matcher.start());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(Pattern.quote(strSubstring));
            sb.append("([^/]+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
        return Intrinsics.areEqual(this.f28515OooO00o, o0ooo0o2.f28515OooO00o) && Intrinsics.areEqual(this.f28516OooO0O0, o0ooo0o2.f28516OooO0O0) && Intrinsics.areEqual(this.f28517OooO0OO, o0ooo0o2.f28517OooO0OO);
    }

    public final int hashCode() {
        String str = this.f28515OooO00o;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f28516OooO0O0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28517OooO0OO;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
