package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p021OooOooo.o0ooOOo;
import p086o000OooO.o0000;
import p086o000OooO.o000oOoO;
import p086o000OooO.o0O0O00;
import p086o000OooO.o0OOO0o;
import p086o000OooO.o0OoOo0;
import p086o000OooO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public class NavDestination {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f8629OoooOO0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final List<o0OOO0o> f8630Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final String f8631Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooO0OO f8632Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public CharSequence f8633Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public String f8634OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public Map<String, o0OoOo0> f8635OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final o0ooOOo<o000oOoO> f8636OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f8637OoooO0O;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface ClassType {
        Class<?> value();
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: androidx.navigation.NavDestination$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0058OooO00o extends Lambda implements Function1<NavDestination, NavDestination> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final C0058OooO00o f8638Oooo0o = new C0058OooO00o();

            public C0058OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final NavDestination invoke(NavDestination navDestination) {
                NavDestination it = navDestination;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.f8632Oooo0oO;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final String OooO00o(@Nullable String str) {
            return str != null ? OooOo00.OooO0Oo("android-app://androidx.navigation/", str) : "";
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final String OooO0O0(@NotNull Context context, int i) {
            String strValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
            Intrinsics.checkNotNullExpressionValue(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }

        @NotNull
        public final Sequence<NavDestination> OooO0OO(@NotNull NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return SequencesKt.generateSequence(navDestination, C0058OooO00o.f8638Oooo0o);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f8639Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final NavDestination f8640Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public final Bundle f8641Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final boolean f8642Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f8643OoooO00;

        public OooO0O0(@NotNull NavDestination destination, @Nullable Bundle bundle, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f8640Oooo0o = destination;
            this.f8641Oooo0oO = bundle;
            this.f8642Oooo0oo = z;
            this.f8639Oooo = z2;
            this.f8643OoooO00 = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(@NotNull OooO0O0 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.f8642Oooo0oo;
            if (z && !other.f8642Oooo0oo) {
                return 1;
            }
            if (!z && other.f8642Oooo0oo) {
                return -1;
            }
            Bundle bundle = this.f8641Oooo0oO;
            if (bundle != null && other.f8641Oooo0oO == null) {
                return 1;
            }
            if (bundle == null && other.f8641Oooo0oO != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.f8641Oooo0oO;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f8639Oooo;
            if (z2 && !other.f8639Oooo) {
                return 1;
            }
            if (z2 || !other.f8639Oooo) {
                return this.f8643OoooO00 - other.f8643OoooO00;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(@NotNull Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String navigatorName = o0000.f28405OooO0O0.OooO00o(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f8631Oooo0o = navigatorName;
        this.f8630Oooo = new ArrayList();
        this.f8636OoooO00 = new o0ooOOo<>();
        this.f8635OoooO0 = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<o000OooO.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000OooO.o0OOO0o$OooO0O0>] */
    public final void OooO00o(@NotNull o0OOO0o navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        Map<String, o0OoOo0> mapOooO0OO = OooO0OO();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, o0OoOo0> entry : mapOooO0OO.entrySet()) {
            Objects.requireNonNull(entry.getValue());
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            List<String> list = navDeepLink.f28518OooO0Oo;
            Collection collectionValues = navDeepLink.f28520OooO0o0.values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((o0OOO0o.OooO0O0) it.next()).f28529OooO0O0);
            }
            if (!CollectionsKt.plus((Collection) list, (Iterable) arrayList2).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f8630Oooo.add(navDeepLink);
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Deep link ");
        sbOooO0o0.append(navDeepLink.f28515OooO00o);
        sbOooO0o0.append(" can't be used to open destination ");
        sbOooO0o0.append(this);
        sbOooO0o0.append(".\nFollowing required arguments are missing: ");
        sbOooO0o0.append(arrayList);
        throw new IllegalArgumentException(sbOooO0o0.toString().toString());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000OooO.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000OooO.o0OoOo0>] */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle OooO0O0(@Nullable Bundle bundle) {
        if (bundle == null) {
            Map<String, o0OoOo0> map = this.f8635OoooO0;
            if (map == null || map.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f8635OoooO0.entrySet()) {
            String name = (String) entry.getKey();
            Objects.requireNonNull((o0OoOo0) entry.getValue());
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it = this.f8635OoooO0.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String name2 = (String) entry2.getKey();
                Objects.requireNonNull((o0OoOo0) entry2.getValue());
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                if (!bundle2.containsKey(name2)) {
                    throw null;
                }
                Objects.requireNonNull(bundle2.get(name2));
                throw null;
            }
        }
        return bundle2;
    }

    @NotNull
    public final Map<String, o0OoOo0> OooO0OO() {
        return MapsKt.toMap(this.f8635OoooO0);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x023d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o000OooO.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o000OooO.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000OooO.o0OOO0o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000OooO.o0OOO0o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public OooO0O0 OooO0o0(@NotNull oo0o0Oo navDeepLinkRequest) {
        ?? r2;
        int i;
        int i2;
        int i3;
        List listEmptyList;
        ?? r5;
        ?? bundle;
        boolean z;
        ?? r6;
        Uri uri;
        Iterator it;
        ?? r3;
        String strGroup;
        Matcher matcher;
        Matcher matcher2;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        ?? r8 = 0;
        if (this.f8630Oooo.isEmpty()) {
            return null;
        }
        OooO0O0 oooO0O0 = null;
        for (o0OOO0o o0ooo0o2 : this.f8630Oooo) {
            Uri deepLink = navDeepLinkRequest.f28534OooO00o;
            if (deepLink != null) {
                Map<String, o0OoOo0> arguments = OooO0OO();
                Objects.requireNonNull(o0ooo0o2);
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                Pattern pattern = (Pattern) o0ooo0o2.f28521OooO0oO.getValue();
                if (pattern != null) {
                    matcher2 = pattern.matcher(deepLink.toString());
                } else {
                    r5 = r8;
                }
                if (r5 == 0 || !r5.matches()) {
                    r5 = matcher2;
                    r5 = matcher2;
                    bundle = r8;
                    break;
                }
                bundle = new Bundle();
                int size = o0ooo0o2.f28518OooO0Oo.size();
                int i4 = 0;
                while (i4 < size) {
                    r5 = matcher2;
                    String str = (String) o0ooo0o2.f28518OooO0Oo.get(i4);
                    i4++;
                    String value = Uri.decode(r5.group(i4));
                    o0OoOo0 o0oooo1 = arguments.get(str);
                    try {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        if (o0oooo1 != null) {
                            throw r8;
                        }
                        bundle.putString(str, value);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                r5 = matcher2;
                if (o0ooo0o2.f28522OooO0oo) {
                    Iterator it2 = o0ooo0o2.f28520OooO0o0.keySet().iterator();
                    r8 = r8;
                    while (true) {
                        if (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            o0OOO0o.OooO0O0 oooO0O1 = (o0OOO0o.OooO0O0) o0ooo0o2.f28520OooO0o0.get(str2);
                            String queryParameter = deepLink.getQueryParameter(str2);
                            if (o0ooo0o2.f28514OooO) {
                                String string = deepLink.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "deepLink.toString()");
                                String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(string, '?', (String) null, 2, (Object) null);
                                if (!Intrinsics.areEqual(strSubstringAfter$default, string)) {
                                    queryParameter = strSubstringAfter$default;
                                }
                            }
                            if (queryParameter != null) {
                                Intrinsics.checkNotNull(oooO0O1);
                                matcher = Pattern.compile(oooO0O1.f28528OooO00o, 32).matcher(queryParameter);
                                if (!matcher.matches()) {
                                    r6 = matcher;
                                }
                            } else {
                                r6 = r8;
                            }
                            r6 = matcher;
                            ?? bundle2 = new Bundle();
                            try {
                                Intrinsics.checkNotNull(oooO0O1);
                                int size2 = oooO0O1.f28529OooO0O0.size();
                                int i5 = 0;
                                r8 = r8;
                                while (i5 < size2) {
                                    if (r6 != 0) {
                                        strGroup = r6.group(i5 + 1);
                                        if (strGroup == null) {
                                            r3 = strGroup;
                                            r3 = "";
                                        }
                                    } else {
                                        r3 = r8;
                                    }
                                    try {
                                        r3 = strGroup;
                                        r8 = (String) oooO0O1.f28529OooO0O0.get(i5);
                                        o0OoOo0 o0oooo2 = arguments.get(r8);
                                        if (r3 != 0) {
                                            uri = deepLink;
                                            try {
                                                ?? sb = new StringBuilder();
                                                it = it2;
                                                try {
                                                    sb.append('{');
                                                    sb.append(r8);
                                                    sb.append('}');
                                                    if (!Intrinsics.areEqual((Object) r3, sb.toString())) {
                                                        if (o0oooo2 != null) {
                                                            r8 = 0;
                                                            throw null;
                                                        }
                                                        bundle2.putString(r8, r3);
                                                        deepLink = uri;
                                                        it2 = it;
                                                        r8 = r8;
                                                    }
                                                } catch (IllegalArgumentException unused2) {
                                                    r8 = 0;
                                                    deepLink = uri;
                                                    it2 = it;
                                                    r8 = r8;
                                                }
                                            } catch (IllegalArgumentException unused3) {
                                                it = it2;
                                                r8 = 0;
                                                deepLink = uri;
                                                it2 = it;
                                                r8 = r8;
                                            }
                                        } else {
                                            uri = deepLink;
                                            it = it2;
                                        }
                                        try {
                                            r8 = 0;
                                            i5++;
                                            deepLink = uri;
                                            it2 = it;
                                        } catch (IllegalArgumentException unused4) {
                                        }
                                    } catch (IllegalArgumentException unused5) {
                                        uri = deepLink;
                                    }
                                }
                                uri = deepLink;
                                it = it2;
                                bundle.putAll(bundle2);
                            } catch (IllegalArgumentException unused6) {
                                uri = deepLink;
                                it = it2;
                            }
                            deepLink = uri;
                            it2 = it;
                            r8 = r8;
                        } else {
                            for (Map.Entry<String, o0OoOo0> entry : arguments.entrySet()) {
                                String key = entry.getKey();
                                if (entry.getValue() != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z || bundle.containsKey(key)) {
                                }
                            }
                        }
                        r5 = matcher2;
                        r5 = matcher2;
                        bundle = r8;
                        break;
                    }
                }
                while (r1.hasNext()) {
                    String key2 = entry.getKey();
                    if (entry.getValue() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                r2 = bundle;
                r8 = r8;
            } else {
                r2 = r8;
                r8 = r8;
            }
            String str3 = navDeepLinkRequest.f28535OooO0O0;
            boolean z2 = str3 != null && Intrinsics.areEqual(str3, o0ooo0o2.f28516OooO0O0);
            String mimeType = navDeepLinkRequest.f28536OooO0OO;
            if (mimeType != null) {
                Objects.requireNonNull(o0ooo0o2);
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                if (o0ooo0o2.f28517OooO0OO != null) {
                    Pattern pattern2 = (Pattern) o0ooo0o2.f28524OooOO0O.getValue();
                    Intrinsics.checkNotNull(pattern2);
                    if (pattern2.matcher(mimeType).matches()) {
                        String mimeType2 = o0ooo0o2.f28517OooO0OO;
                        Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                        List<String> listSplit = new Regex("/").split(mimeType2, 0);
                        if (listSplit.isEmpty()) {
                            i3 = 1;
                            listEmptyList = CollectionsKt.emptyList();
                            break;
                        }
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i3 = 1;
                                listEmptyList = CollectionsKt.emptyList();
                                break;
                            }
                            if (!(listIterator.previous().length() == 0)) {
                                i3 = 1;
                                listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        String str4 = (String) listEmptyList.get(0);
                        String str5 = (String) listEmptyList.get(i3);
                        o0OOO0o.OooO00o other = new o0OOO0o.OooO00o(mimeType);
                        Intrinsics.checkNotNullParameter(other, "other");
                        i2 = Intrinsics.areEqual(str4, other.f28526Oooo0o) ? 2 : 0;
                        if (Intrinsics.areEqual(str5, other.f28527Oooo0oO)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                i = i2;
            } else {
                i = -1;
            }
            if (r2 != 0 || z2 || i > -1) {
                OooO0O0 oooO0O2 = new OooO0O0(this, r2, o0ooo0o2.f28525OooOO0o, z2, i);
                if (oooO0O0 == null || oooO0O2.compareTo(oooO0O0) > 0) {
                    oooO0O0 = oooO0O2;
                }
            }
        }
        return oooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.ArrayList, java.util.List<o000OooO.o0OOO0o>] */
    public final void OooO0oO(@Nullable String str) {
        if (str == null) {
            this.f8637OoooO0O = 0;
        } else {
            if (!(!StringsKt.isBlank(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String uriPattern = f8629OoooOO0.OooO00o(str);
            this.f8637OoooO0O = uriPattern.hashCode();
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            OooO00o(new o0OOO0o(uriPattern));
        }
        ?? r0 = this.f8630Oooo;
        for (Object obj : r0) {
            if (Intrinsics.areEqual(((o0OOO0o) obj).f28515OooO00o, f8629OoooOO0.OooO00o(this.f8634OoooO))) {
                TypeIntrinsics.asMutableCollection(r0).remove(obj);
                this.f8634OoooO = str;
            }
        }
        obj = null;
        TypeIntrinsics.asMutableCollection(r0).remove(obj);
        this.f8634OoooO = str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<o000OooO.o0OOO0o>] */
    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (obj != null && (obj instanceof NavDestination)) {
            NavDestination navDestination = (NavDestination) obj;
            boolean z7 = CollectionsKt.intersect(this.f8630Oooo, navDestination.f8630Oooo).size() == this.f8630Oooo.size();
            if (this.f8636OoooO00.OooOO0o() == navDestination.f8636OoooO00.OooOO0o()) {
                Iterator it = SequencesKt.asSequence(p021OooOooo.o0OOO0o.OooO00o(this.f8636OoooO00)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = true;
                        break;
                    }
                    if (!(navDestination.f8636OoooO00.OooO((o000oOoO) it.next()) >= 0)) {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    Iterator it2 = SequencesKt.asSequence(p021OooOooo.o0OOO0o.OooO00o(navDestination.f8636OoooO00)).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z6 = true;
                            break;
                        }
                        if (!(this.f8636OoooO00.OooO((o000oOoO) it2.next()) >= 0)) {
                            z6 = false;
                            break;
                        }
                    }
                    if (z6) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (OooO0OO().size() == navDestination.OooO0OO().size()) {
                Iterator it3 = MapsKt.asSequence(OooO0OO()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z3 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!(navDestination.OooO0OO().containsKey(entry.getKey()) && Intrinsics.areEqual(navDestination.OooO0OO().get(entry.getKey()), entry.getValue()))) {
                        z3 = false;
                        break;
                    }
                }
                if (z3) {
                    Iterator it4 = MapsKt.asSequence(navDestination.OooO0OO()).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z4 = true;
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        if (!(OooO0OO().containsKey(entry2.getKey()) && Intrinsics.areEqual(OooO0OO().get(entry2.getKey()), entry2.getValue()))) {
                            z4 = false;
                            break;
                        }
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (this.f8637OoooO0O == navDestination.f8637OoooO0O && Intrinsics.areEqual(this.f8634OoooO, navDestination.f8634OoooO) && z7 && z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o000OooO.o0OOO0o>] */
    public int hashCode() {
        int i = this.f8637OoooO0O * 31;
        String str = this.f8634OoooO;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (o0OOO0o o0ooo0o2 : this.f8630Oooo) {
            int i2 = iHashCode * 31;
            String str2 = o0ooo0o2.f28515OooO00o;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = o0ooo0o2.f28516OooO0O0;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = o0ooo0o2.f28517OooO0OO;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        Iterator itOooO00o = p021OooOooo.o0OOO0o.OooO00o(this.f8636OoooO00);
        while (true) {
            OooOooo.o0OOO0o.OooO00o oooO00o = (OooOooo.o0OOO0o.OooO00o) itOooO00o;
            if (!oooO00o.hasNext()) {
                break;
            }
            Objects.requireNonNull((o000oOoO) oooO00o.next());
            iHashCode = (((iHashCode * 31) + 0) * 31) + 0;
        }
        for (String str5 : OooO0OO().keySet()) {
            int iOooO00o = o0O0O00.OooO00o(str5, iHashCode * 31, 31);
            o0OoOo0 o0oooo1 = OooO0OO().get(str5);
            iHashCode = iOooO00o + (o0oooo1 != null ? o0oooo1.hashCode() : 0);
        }
        return iHashCode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.f8637OoooO0O));
        sb.append(")");
        String str = this.f8634OoooO;
        if (!(str == null || StringsKt.isBlank(str))) {
            sb.append(" route=");
            sb.append(this.f8634OoooO);
        }
        if (this.f8633Oooo0oo != null) {
            sb.append(" label=");
            sb.append(this.f8633Oooo0oo);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
