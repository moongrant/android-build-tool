package p105o000oo0o;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1360#2:652\n1446#2,5:653\n1559#2:658\n1590#2,4:659\n1559#2:663\n1590#2,4:664\n1855#2:670\n1559#2:671\n1590#2,4:672\n1856#2:676\n215#3,2:668\n1#4:677\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n85#1:652\n85#1:653,5\n229#1:658\n229#1:659,4\n247#1:663\n247#1:664,4\n295#1:670\n307#1:671\n307#1:672,4\n295#1:676\n269#1:668,2\n*E\n"})
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Pattern f35722OooOOOo = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Pattern f35723OooOOo0 = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f35724OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f35725OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f35726OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f35727OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f35728OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f35729OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f35730OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f35731OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f35732OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f35733OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f35734OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f35735OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f35736OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f35737OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f35738OooOOOO;

    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n731#2,9:652\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n412#1:652,9\n*E\n"})
    public static final class OooO00o implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f35739OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final String f35740OooO0o0;

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
            this.f35739OooO0Oo = (String) listEmptyList.get(0);
            this.f35740OooO0o0 = (String) listEmptyList.get(1);
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO00o oooO00o) {
            OooO00o other = oooO00o;
            Intrinsics.checkNotNullParameter(other, "other");
            int i = Intrinsics.areEqual(this.f35739OooO0Oo, other.f35739OooO0Oo) ? 2 : 0;
            return Intrinsics.areEqual(this.f35740OooO0o0, other.f35740OooO0o0) ? i + 1 : i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f35741OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ArrayList f35742OooO0O0 = new ArrayList();
    }

    public o000O0Oo(@Nullable String str) {
        this.f35725OooO00o = str;
        ArrayList arrayList = new ArrayList();
        this.f35728OooO0Oo = arrayList;
        this.f35729OooO0o = LazyKt.lazy(new o0O0ooO(this));
        this.f35731OooO0oO = LazyKt.lazy(new o00(this));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f35732OooO0oo = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o00oOoo(this));
        this.f35733OooOO0 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000O0O0(this));
        this.f35734OooOO0O = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OO0O(this));
        this.f35735OooOO0o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OO00(this));
        this.f35737OooOOO0 = LazyKt.lazy(new o000O(this));
        this.f35736OooOOO = LazyKt.lazy(new o00O0000(this));
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f35722OooOOOo.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z = false;
        String strSubstring = str.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        OooO00o(strSubstring, arrayList, sb);
        if (!StringsKt__StringsKt.contains$default(sb, ".*", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(sb, "([^/]+?)", false, 2, (Object) null)) {
            z = true;
        }
        this.f35738OooOOOO = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriRegex.toString()");
        this.f35730OooO0o0 = StringsKt__StringsJVMKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null);
    }

    public static void OooO00o(String str, List list, StringBuilder sb) {
        Matcher matcher = f35723OooOOo0.matcher(str);
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

    public final boolean OooO0O0(Matcher matcher, Bundle bundle, Map<String, o0000O0> map) {
        ArrayList arrayList = this.f35728OooO0Oo;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i2));
            o0000O0 o0000o1 = map.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                if (o0000o1 != null) {
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

    public final boolean OooO0OO(Uri uri, Bundle bundle, Map<String, o0000O0> map) {
        boolean z;
        boolean z2;
        String query;
        for (Map.Entry entry : ((Map) this.f35732OooO0oo.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            OooO0O0 oooO0O0 = (OooO0O0) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f35724OooO && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = CollectionsKt.listOf(query);
            }
            if (queryParameters != null) {
                Iterator<T> it = queryParameters.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        String str3 = oooO0O0.f35741OooO00o;
                        Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                        if (matcher == null || !matcher.matches()) {
                            z = false;
                        } else {
                            Bundle bundle2 = new Bundle();
                            try {
                                ArrayList arrayList = oooO0O0.f35742OooO0O0;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
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
                                        o0000O0 o0000o1 = map.get(str4);
                                        if (!bundle.containsKey(str4)) {
                                            z2 = true;
                                        } else {
                                            if (o0000o1 != null) {
                                                throw null;
                                            }
                                            z2 = false;
                                        }
                                        if (z2) {
                                            if (Intrinsics.areEqual(strGroup, '{' + str4 + '}')) {
                                                continue;
                                            } else {
                                                if (o0000o1 != null) {
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
        if (obj == null || !(obj instanceof o000O0Oo)) {
            return false;
        }
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        return Intrinsics.areEqual(this.f35725OooO00o, o000o0oo2.f35725OooO00o) && Intrinsics.areEqual(this.f35726OooO0O0, o000o0oo2.f35726OooO0O0) && Intrinsics.areEqual(this.f35727OooO0OO, o000o0oo2.f35727OooO0OO);
    }

    public final int hashCode() {
        String str = this.f35725OooO00o;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f35726OooO0O0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35727OooO0OO;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
