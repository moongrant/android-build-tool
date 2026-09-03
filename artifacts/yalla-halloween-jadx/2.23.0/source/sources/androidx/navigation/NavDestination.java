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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o000O00.o000OOo;
import o000O00.o00O0O;
import o000O00.o0O0O00;
import o000O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;
import p188o00o0O.Oooo0;
import p188o00o0O.o000oOoO;
import p188o00o0O.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,822:1\n232#2,3:823\n1#3:826\n288#4,2:827\n1549#4:830\n1620#4,3:831\n1855#4,2:842\n1855#4,2:845\n1855#4,2:848\n29#5:829\n1206#6,2:834\n1206#6,2:836\n1206#6,2:838\n1206#6,2:840\n32#7:844\n33#7:847\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n191#1:823,3\n231#1:827,2\n464#1:830\n464#1:831,3\n707#1:842,2\n715#1:845,2\n719#1:848,2\n370#1:829\n683#1:834,2\n684#1:836,2\n687#1:838,2\n691#1:840,2\n712#1:844\n712#1:847\n*E\n"})
public class NavDestination {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f6814OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f6815OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f6816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public CharSequence f6817OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooO f6818OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList f6819OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Oooo0<o000O00.OooO0o> f6820OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f6821OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public String f6822OooOO0O;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface ClassType {
        Class<?> value();
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: androidx.navigation.NavDestination$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0142OooO00o extends Lambda implements Function1<NavDestination, NavDestination> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0142OooO00o f6823OooO0Oo = new C0142OooO00o();

            public C0142OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final NavDestination invoke(NavDestination navDestination) {
                NavDestination it = navDestination;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.f6818OooO0o0;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static String OooO00o(@Nullable String str) {
            return str != null ? "android-app://androidx.navigation/".concat(str) : "";
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static String OooO0O0(int i, @NotNull Context context) {
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
        public static Sequence OooO0OO(@NotNull NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return SequencesKt.generateSequence(navDestination, C0142OooO00o.f6823OooO0Oo);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,822:1\n1855#2,2:823\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n127#1:823,2\n*E\n"})
    public static final class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f6824OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final NavDestination f6825OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f6826OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Bundle f6827OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f6828OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f6829OooO0oo;

        public OooO0O0(@NotNull NavDestination destination, @Nullable Bundle bundle, boolean z, int i, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f6825OooO0Oo = destination;
            this.f6827OooO0o0 = bundle;
            this.f6826OooO0o = z;
            this.f6828OooO0oO = i;
            this.f6829OooO0oo = z2;
            this.f6824OooO = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(@NotNull OooO0O0 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.f6826OooO0o;
            if (z && !other.f6826OooO0o) {
                return 1;
            }
            if (!z && other.f6826OooO0o) {
                return -1;
            }
            int i = this.f6828OooO0oO - other.f6828OooO0oO;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = other.f6827OooO0o0;
            Bundle bundle2 = this.f6827OooO0o0;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                Intrinsics.checkNotNull(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = other.f6829OooO0oo;
            boolean z3 = this.f6829OooO0oo;
            if (z3 && !z2) {
                return 1;
            }
            if (z3 || !z2) {
                return this.f6824OooO - other.f6824OooO;
            }
            return -1;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O f6830OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00O0O o00o0o2) {
            super(1);
            this.f6830OooO0Oo = o00o0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String key = str;
            Intrinsics.checkNotNullParameter(key, "key");
            o00O0O o00o0o2 = this.f6830OooO0Oo;
            ArrayList arrayList = o00o0o2.f34390OooO0Oo;
            Collection collectionValues = ((Map) o00o0o2.f34394OooO0oo.getValue()).values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((o00O0O.OooO0O0) it.next()).f34404OooO0O0);
            }
            return Boolean.valueOf(!CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2), (Iterable) o00o0o2.f34396OooOO0O.getValue()).contains(key));
        }
    }

    static {
        new LinkedHashMap();
    }

    public NavDestination(@NotNull Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = OooOOOO.f6915OooO0O0;
        String navigatorName = OooOOOO.OooO00o.OooO00o(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f6816OooO0Oo = navigatorName;
        this.f6819OooO0oO = new ArrayList();
        this.f6820OooO0oo = new Oooo0<>();
        this.f6815OooO = new LinkedHashMap();
    }

    public final void OooO00o(@NotNull o00O0O navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        ArrayList arrayListOooO00o = o000O00.OooOO0.OooO00o(OooO0OO(), new OooO0OO(navDeepLink));
        if (arrayListOooO00o.isEmpty()) {
            this.f6819OooO0oO.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f34387OooO00o + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListOooO00o).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle OooO0O0(@Nullable Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f6815OooO;
        if (bundle == null) {
            if (linkedHashMap == null || linkedHashMap.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            ((o000O00.OooO) entry.getValue()).getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String name2 = (String) entry2.getKey();
                ((o000O00.OooO) entry2.getValue()).getClass();
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                if (!bundle2.containsKey(name2)) {
                    throw null;
                }
                bundle2.get(name2).getClass();
                throw null;
            }
        }
        return bundle2;
    }

    @NotNull
    public final Map<String, o000O00.OooO> OooO0OO() {
        return MapsKt.toMap(this.f6815OooO);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final OooO0O0 OooO0Oo(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri uri = Uri.parse(OooO00o.OooO00o(route));
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        o0O0O00 o0o0o00 = new o0O0O00(null, uri, null);
        return this instanceof OooO ? ((OooO) this).OooOO0(o0o0o00) : OooO0o0(o0o0o00);
    }

    public final void OooO0o(@Nullable String str) {
        if (str == null) {
            this.f6821OooOO0 = 0;
        } else {
            if (!(!StringsKt.isBlank(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String uriPattern = OooO00o.OooO00o(str);
            this.f6821OooOO0 = uriPattern.hashCode();
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            OooO00o(new o00O0O(uriPattern));
        }
        ArrayList arrayList = this.f6819OooO0oO;
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((o00O0O) obj).f34387OooO00o, OooO00o.OooO00o(this.f6822OooOO0O))) {
                TypeIntrinsics.asMutableCollection(arrayList).remove(obj);
                this.f6822OooOO0O = str;
            }
        }
        obj = null;
        TypeIntrinsics.asMutableCollection(arrayList).remove(obj);
        this.f6822OooOO0O = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:106:0x0201  */
    /* JADX WARN: Code duplicated, block: B:111:0x0219  */
    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x023a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240  */
    /* JADX WARN: Code duplicated, block: B:130:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[LOOP:2: B:78:0x017f->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[PHI: r9
      0x0101: PHI (r9v2 java.util.regex.Matcher) = 
      (r9v1 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
      (r9v21 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
     binds: [B:9:0x0028, B:14:0x004d, B:17:0x0055, B:20:0x0062, B:51:0x00fc, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1 A[EDGE_INSN: B:86:0x01a1->B:87:0x01a6 BREAK  A[LOOP:2: B:78:0x017f->B:138:?]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01db  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public OooO0O0 OooO0o0(@NotNull o0O0O00 navDeepLinkRequest) {
        Bundle bundle;
        int size;
        String str;
        boolean z;
        String mimeType;
        int i;
        OooO0O0 oooO0O0;
        Map<String, o000O00.OooO> arguments;
        Bundle bundle2;
        Pattern pattern;
        Matcher matcher;
        String mimeType2;
        Pattern pattern2;
        List<String> listSplit;
        int i2;
        List listEmptyList;
        String str2;
        o00O0O.OooO00o other;
        ListIterator<String> listIterator;
        boolean z2;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        ArrayList<o00O0O> arrayList = this.f6819OooO0oO;
        Matcher matcher2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        OooO0O0 oooO0O1 = null;
        for (o00O0O o00o0o2 : arrayList) {
            Uri deepLink = navDeepLinkRequest.f34408OooO00o;
            if (deepLink != null) {
                Map<String, o000O00.OooO> arguments2 = OooO0OO();
                o00o0o2.getClass();
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(arguments2, "arguments");
                Pattern pattern3 = (Pattern) o00o0o2.f34391OooO0o.getValue();
                Matcher matcher3 = pattern3 != null ? pattern3.matcher(deepLink.toString()) : matcher2;
                if (matcher3 != null && matcher3.matches()) {
                    Bundle bundle3 = new Bundle();
                    if (o00o0o2.OooO0O0(matcher3, bundle3, arguments2) && (!((Boolean) o00o0o2.f34393OooO0oO.getValue()).booleanValue() || o00o0o2.OooO0OO(deepLink, bundle3, arguments2))) {
                        String fragment = deepLink.getFragment();
                        Pattern pattern4 = (Pattern) o00o0o2.f34399OooOOO0.getValue();
                        Matcher matcher4 = pattern4 != null ? pattern4.matcher(String.valueOf(fragment)) : matcher2;
                        if (matcher4 != null && matcher4.matches()) {
                            List list = (List) o00o0o2.f34396OooOO0O.getValue();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            int i3 = 0;
                            for (Object obj : list) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                String str3 = (String) obj;
                                String value = Uri.decode(matcher4.group(i4));
                                o000O00.OooO oooO = arguments2.get(str3);
                                try {
                                    Intrinsics.checkNotNullExpressionValue(value, "value");
                                    if (oooO != null) {
                                        matcher2 = null;
                                        try {
                                            throw null;
                                        } catch (IllegalArgumentException unused) {
                                            break;
                                        }
                                    }
                                    bundle3.putString(str3, value);
                                    arrayList2.add(Unit.INSTANCE);
                                    i3 = i4;
                                    matcher2 = null;
                                } catch (IllegalArgumentException unused2) {
                                    matcher2 = null;
                                }
                            }
                        }
                        if (!o000O00.OooOO0.OooO00o(arguments2, new o0ooOOo(bundle3)).isEmpty()) {
                            bundle = matcher2;
                        } else {
                            bundle = bundle3;
                        }
                    } else {
                        bundle = matcher2;
                    }
                } else {
                    bundle = matcher2;
                }
            } else {
                bundle = matcher2;
            }
            if (deepLink != null) {
                String str4 = o00o0o2.f34387OooO00o;
                if (str4 != null) {
                    List<String> requestedPathSegments = deepLink.getPathSegments();
                    List<String> uriPathSegments = Uri.parse(str4).getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
                    Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
                    size = CollectionsKt.intersect(requestedPathSegments, uriPathSegments).size();
                }
                str = navDeepLinkRequest.f34409OooO0O0;
                if (str == null && Intrinsics.areEqual(str, o00o0o2.f34388OooO0O0)) {
                    z = true;
                } else {
                    z = false;
                }
                mimeType = navDeepLinkRequest.f34410OooO0OO;
                if (mimeType != null) {
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                    mimeType2 = o00o0o2.f34389OooO0OO;
                    if (mimeType2 != null) {
                        pattern2 = (Pattern) o00o0o2.f34398OooOOO.getValue();
                        Intrinsics.checkNotNull(pattern2);
                        if (pattern2.matcher(mimeType).matches()) {
                            Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                            listSplit = new Regex("/").split(mimeType2, 0);
                            if (!listSplit.isEmpty()) {
                                i2 = 1;
                                listEmptyList = CollectionsKt.emptyList();
                                break;
                            }
                            listIterator = listSplit.listIterator(listSplit.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    i2 = 1;
                                    listEmptyList = CollectionsKt.emptyList();
                                    break;
                                }
                                if (listIterator.previous().length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    i2 = 1;
                                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                            String str5 = (String) listEmptyList.get(0);
                            str2 = (String) listEmptyList.get(i2);
                            other = new o00O0O.OooO00o(mimeType);
                            Intrinsics.checkNotNullParameter(other, "other");
                            i = Intrinsics.areEqual(str5, other.f34401OooO0Oo) ? 2 : 0;
                            if (Intrinsics.areEqual(str2, other.f34402OooO0o0)) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                if (bundle != null) {
                    oooO0O0 = new OooO0O0(this, bundle, o00o0o2.f34400OooOOOO, size, z, i);
                    if (oooO0O1 != null || oooO0O0.compareTo(oooO0O1) > 0) {
                        oooO0O1 = oooO0O0;
                    }
                } else if (z || i > -1) {
                    arguments = OooO0OO();
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    bundle2 = new Bundle();
                    if (deepLink != null) {
                        pattern = (Pattern) o00o0o2.f34391OooO0o.getValue();
                        if (pattern != null) {
                            matcher = pattern.matcher(deepLink.toString());
                        } else {
                            matcher = null;
                        }
                        if (matcher != null && matcher.matches()) {
                            o00o0o2.OooO0O0(matcher, bundle2, arguments);
                            if (((Boolean) o00o0o2.f34393OooO0oO.getValue()).booleanValue()) {
                                o00o0o2.OooO0OO(deepLink, bundle2, arguments);
                            }
                        }
                    }
                    if (o000O00.OooOO0.OooO00o(arguments, new o000OOo(bundle2)).isEmpty()) {
                        oooO0O0 = new OooO0O0(this, bundle, o00o0o2.f34400OooOOOO, size, z, i);
                        if (oooO0O1 != null) {
                            oooO0O1 = oooO0O0;
                        } else {
                            oooO0O1 = oooO0O0;
                        }
                    }
                }
                matcher2 = null;
            } else {
                o00o0o2.getClass();
            }
            size = 0;
            str = navDeepLinkRequest.f34409OooO0O0;
            if (str == null) {
                z = false;
            } else {
                z = false;
            }
            mimeType = navDeepLinkRequest.f34410OooO0OO;
            if (mimeType != null) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                mimeType2 = o00o0o2.f34389OooO0OO;
                if (mimeType2 != null) {
                    pattern2 = (Pattern) o00o0o2.f34398OooOOO.getValue();
                    Intrinsics.checkNotNull(pattern2);
                    if (pattern2.matcher(mimeType).matches()) {
                        i = -1;
                    } else {
                        Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                        listSplit = new Regex("/").split(mimeType2, 0);
                        if (!listSplit.isEmpty()) {
                            i2 = 1;
                            listEmptyList = CollectionsKt.emptyList();
                            break;
                        }
                        listIterator = listSplit.listIterator(listSplit.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                i2 = 1;
                                listEmptyList = CollectionsKt.emptyList();
                                break;
                            }
                            if (listIterator.previous().length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                i2 = 1;
                                listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        String str6 = (String) listEmptyList.get(0);
                        str2 = (String) listEmptyList.get(i2);
                        other = new o00O0O.OooO00o(mimeType);
                        Intrinsics.checkNotNullParameter(other, "other");
                        if (Intrinsics.areEqual(str6, other.f34401OooO0Oo)) {
                        }
                        if (Intrinsics.areEqual(str2, other.f34402OooO0o0)) {
                            i++;
                        }
                    }
                } else {
                    i = -1;
                }
            } else {
                i = -1;
            }
            if (bundle != null) {
                oooO0O0 = new OooO0O0(this, bundle, o00o0o2.f34400OooOOOO, size, z, i);
                if (oooO0O1 != null) {
                    oooO0O1 = oooO0O0;
                } else {
                    oooO0O1 = oooO0O0;
                }
            } else if (z) {
                arguments = OooO0OO();
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                bundle2 = new Bundle();
                if (deepLink != null) {
                    pattern = (Pattern) o00o0o2.f34391OooO0o.getValue();
                    if (pattern != null) {
                        matcher = pattern.matcher(deepLink.toString());
                    } else {
                        matcher = null;
                    }
                    if (matcher != null) {
                        o00o0o2.OooO0O0(matcher, bundle2, arguments);
                        if (((Boolean) o00o0o2.f34393OooO0oO.getValue()).booleanValue()) {
                            o00o0o2.OooO0OO(deepLink, bundle2, arguments);
                        }
                    }
                }
                if (o000O00.OooOO0.OooO00o(arguments, new o000OOo(bundle2)).isEmpty()) {
                    oooO0O0 = new OooO0O0(this, bundle, o00o0o2.f34400OooOOOO, size, z, i);
                    if (oooO0O1 != null) {
                        oooO0O1 = oooO0O0;
                    } else {
                        oooO0O1 = oooO0O0;
                    }
                }
            } else {
                arguments = OooO0OO();
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                bundle2 = new Bundle();
                if (deepLink != null) {
                    pattern = (Pattern) o00o0o2.f34391OooO0o.getValue();
                    if (pattern != null) {
                        matcher = pattern.matcher(deepLink.toString());
                    } else {
                        matcher = null;
                    }
                    if (matcher != null) {
                        o00o0o2.OooO0O0(matcher, bundle2, arguments);
                        if (((Boolean) o00o0o2.f34393OooO0oO.getValue()).booleanValue()) {
                            o00o0o2.OooO0OO(deepLink, bundle2, arguments);
                        }
                    }
                }
                if (o000O00.OooOO0.OooO00o(arguments, new o000OOo(bundle2)).isEmpty()) {
                    oooO0O0 = new OooO0O0(this, bundle, o00o0o2.f34400OooOOOO, size, z, i);
                    if (oooO0O1 != null) {
                        oooO0O1 = oooO0O0;
                    } else {
                        oooO0O1 = oooO0O0;
                    }
                }
            }
            matcher2 = null;
        }
        return oooO0O1;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0149  */
    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (obj == null || !(obj instanceof NavDestination)) {
            return false;
        }
        ArrayList arrayList = this.f6819OooO0oO;
        NavDestination navDestination = (NavDestination) obj;
        boolean z7 = CollectionsKt.intersect(arrayList, navDestination.f6819OooO0oO).size() == arrayList.size();
        Oooo0<o000O00.OooO0o> oooo0 = this.f6820OooO0oo;
        int iOooO = oooo0.OooO();
        Oooo0<o000O00.OooO0o> oooo1 = navDestination.f6820OooO0oo;
        if (iOooO == oooo1.OooO()) {
            Iterator it = SequencesKt.asSequence(o0OoOo0.OooO00o(oooo0)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = true;
                    break;
                }
                o000O00.OooO0o oooO0o = (o000O00.OooO0o) it.next();
                if (oooo1.f38807OooO0Oo) {
                    oooo1.OooO0o0();
                }
                int i = 0;
                while (true) {
                    if (i >= oooo1.f38810OooO0oO) {
                        i = -1;
                        break;
                    }
                    if (oooo1.f38808OooO0o[i] == oooO0o) {
                        break;
                    }
                    i++;
                }
                if (!(i >= 0)) {
                    z5 = false;
                    break;
                }
            }
            if (z5) {
                Iterator it2 = SequencesKt.asSequence(o0OoOo0.OooO00o(oooo1)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z6 = true;
                        break;
                    }
                    o000O00.OooO0o oooO0o2 = (o000O00.OooO0o) it2.next();
                    if (oooo0.f38807OooO0Oo) {
                        oooo0.OooO0o0();
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= oooo0.f38810OooO0oO) {
                            i2 = -1;
                            break;
                        }
                        if (oooo0.f38808OooO0o[i2] == oooO0o2) {
                            break;
                        }
                        i2++;
                    }
                    if (!(i2 >= 0)) {
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
        return this.f6821OooOO0 == navDestination.f6821OooOO0 && Intrinsics.areEqual(this.f6822OooOO0O, navDestination.f6822OooOO0O) && z7 && z && z2;
    }

    public int hashCode() {
        int i = this.f6821OooOO0 * 31;
        String str = this.f6822OooOO0O;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (o00O0O o00o0o2 : this.f6819OooO0oO) {
            int i2 = iHashCode * 31;
            String str2 = o00o0o2.f34387OooO00o;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = o00o0o2.f34388OooO0O0;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = o00o0o2.f34389OooO0OO;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        o000oOoO o000ooooOooO00o = o0OoOo0.OooO00o(this.f6820OooO0oo);
        while (o000ooooOooO00o.hasNext()) {
            ((o000O00.OooO0o) o000ooooOooO00o.next()).getClass();
            iHashCode = (((iHashCode * 31) + 0) * 31) + 0;
        }
        for (String str5 : OooO0OO().keySet()) {
            int iOooO00o = o0OO00O.OooO00o(str5, iHashCode * 31, 31);
            o000O00.OooO oooO = OooO0OO().get(str5);
            iHashCode = iOooO00o + (oooO != null ? oooO.hashCode() : 0);
        }
        return iHashCode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.f6821OooOO0));
        sb.append(")");
        String str = this.f6822OooOO0O;
        if (!(str == null || StringsKt.isBlank(str))) {
            sb.append(" route=");
            sb.append(this.f6822OooOO0O);
        }
        if (this.f6817OooO0o != null) {
            sb.append(" label=");
            sb.append(this.f6817OooO0o);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
