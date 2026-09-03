package o000O00;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1360#2:652\n1446#2,5:653\n1559#2:658\n1590#2,4:659\n1559#2:663\n1590#2,4:664\n1855#2:670\n1559#2:671\n1590#2,4:672\n1856#2:676\n215#3,2:668\n1#4:677\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n85#1:652\n85#1:653,5\n229#1:658\n229#1:659,4\n247#1:663\n247#1:664,4\n295#1:670\n307#1:671\n307#1:672,4\n295#1:676\n269#1:668,2\n*E\n"})
public final class o00O0O {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Pattern f34384OooOOOo = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Pattern f34385OooOOo0 = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f34386OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f34387OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f34388OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f34389OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f34390OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f34391OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f34392OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f34393OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f34394OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f34395OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f34396OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f34397OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f34398OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f34399OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f34400OooOOOO;

    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n731#2,9:652\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n412#1:652,9\n*E\n"})
    public static final class OooO00o implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f34401OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final String f34402OooO0o0;

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
            this.f34401OooO0Oo = (String) listEmptyList.get(0);
            this.f34402OooO0o0 = (String) listEmptyList.get(1);
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO00o oooO00o) {
            OooO00o other = oooO00o;
            Intrinsics.checkNotNullParameter(other, "other");
            int i = Intrinsics.areEqual(this.f34401OooO0Oo, other.f34401OooO0Oo) ? 2 : 0;
            return Intrinsics.areEqual(this.f34402OooO0o0, other.f34402OooO0o0) ? i + 1 : i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f34403OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ArrayList f34404OooO0O0 = new ArrayList();
    }

    public o00O0O(@Nullable String str) {
        this.f34387OooO00o = str;
        ArrayList arrayList = new ArrayList();
        this.f34390OooO0Oo = arrayList;
        this.f34391OooO0o = LazyKt.lazy(new o0OO00O(this));
        this.f34393OooO0oO = LazyKt.lazy(new o0OOO0o(this));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f34394OooO0oo = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new oo0o0Oo(this));
        this.f34395OooOO0 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o00Ooo(this));
        this.f34396OooOO0O = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o00Oo0(this));
        this.f34397OooOO0o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o00oO0o(this));
        this.f34399OooOOO0 = LazyKt.lazy(new oo000o(this));
        this.f34398OooOOO = LazyKt.lazy(new o0Oo0oo(this));
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f34384OooOOOo.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z = false;
        String strSubstring = str.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        OooO00o(strSubstring, arrayList, sb);
        if (!StringsKt.OooO0o(sb, ".*") && !StringsKt.OooO0o(sb, "([^/]+?)")) {
            z = true;
        }
        this.f34400OooOOOO = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriRegex.toString()");
        this.f34392OooO0o0 = StringsKt.OooOoO(string, ".*", "\\E.*\\Q");
    }

    public static void OooO00o(String str, List list, StringBuilder sb) {
        Matcher matcher = f34385OooOOo0.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNull(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public final boolean OooO0O0(Matcher matcher, Bundle bundle, Map<String, OooO> map) {
        ArrayList arrayList = this.f34390OooO0Oo;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i2));
            OooO oooO = map.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                if (oooO != null) {
                    throw null;
                }
                bundle.putString(str, value);
                arrayList2.add(Unit.INSTANCE);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooO0OO(Uri uri, Bundle bundle, Map<String, OooO> map) {
        boolean z;
        boolean z2;
        String query;
        for (Map.Entry entry : ((Map) this.f34394OooO0oo.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            OooO0O0 oooO0O0 = (OooO0O0) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f34386OooO && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = CollectionsKt.listOf(query);
            }
            if (queryParameters != null) {
                Iterator<T> it = queryParameters.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        String str3 = oooO0O0.f34403OooO00o;
                        Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                        if (matcher == null || !matcher.matches()) {
                            z = false;
                        } else {
                            Bundle bundle2 = new Bundle();
                            try {
                                ArrayList arrayList = oooO0O0.f34404OooO0O0;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                int i = 0;
                                for (Object obj : arrayList) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    String str4 = (String) obj;
                                    String strGroup = matcher.group(i2);
                                    if (strGroup == null) {
                                        strGroup = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                                    }
                                    try {
                                        OooO oooO = map.get(str4);
                                        if (!bundle.containsKey(str4)) {
                                            z2 = true;
                                        } else {
                                            if (oooO != null) {
                                                throw null;
                                            }
                                            z2 = false;
                                        }
                                        if (z2) {
                                            if (Intrinsics.areEqual(strGroup, '{' + str4 + '}')) {
                                                continue;
                                            } else {
                                                if (oooO != null) {
                                                    throw null;
                                                }
                                                bundle2.putString(str4, strGroup);
                                            }
                                        }
                                        arrayList2.add(Unit.INSTANCE);
                                        i = i2;
                                    } catch (IllegalArgumentException unused) {
                                        continue;
                                    }
                                }
                                bundle.putAll(bundle2);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                    } else {
                        z = true;
                    }
                }
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        return Intrinsics.areEqual(this.f34387OooO00o, o00o0o2.f34387OooO00o) && Intrinsics.areEqual(this.f34388OooO0O0, o00o0o2.f34388OooO0O0) && Intrinsics.areEqual(this.f34389OooO0OO, o00o0o2.f34389OooO0OO);
    }

    public final int hashCode() {
        String str = this.f34387OooO00o;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f34388OooO0O0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f34389OooO0OO;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
