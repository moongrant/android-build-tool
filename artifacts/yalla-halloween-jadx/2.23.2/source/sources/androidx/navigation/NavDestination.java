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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p105o000oo0o.o0000O0;
import p105o000oo0o.o0000O0O;
import p105o000oo0o.o0000oo;
import p105o000oo0o.o000O0Oo;
import p105o000oo0o.o000OOo0;
import p105o000oo0o.o00O000;
import p105o000oo0o.o00O000o;
import p190o00o0O.Oooo0;
import p190o00o0O.Oooo000;
import p190o00o0O.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,822:1\n232#2,3:823\n1#3:826\n288#4,2:827\n1549#4:830\n1620#4,3:831\n1855#4,2:842\n1855#4,2:845\n1855#4,2:848\n29#5:829\n1206#6,2:834\n1206#6,2:836\n1206#6,2:838\n1206#6,2:840\n32#7:844\n33#7:847\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n191#1:823,3\n231#1:827,2\n464#1:830\n464#1:831,3\n707#1:842,2\n715#1:845,2\n719#1:848,2\n370#1:829\n683#1:834,2\n684#1:836,2\n687#1:838,2\n691#1:840,2\n712#1:844\n712#1:847\n*E\n"})
public class NavDestination {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f9908OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f9909OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f9910OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public CharSequence f9911OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooO f9912OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList f9913OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Oooo000<o0000oo> f9914OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f9915OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public String f9916OooOO0O;

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
        public static final class C0161OooO00o extends Lambda implements Function1<NavDestination, NavDestination> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0161OooO00o f9917OooO0Oo = new C0161OooO00o();

            public C0161OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final NavDestination invoke(NavDestination navDestination) {
                NavDestination it = navDestination;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.f9912OooO0o0;
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
            return SequencesKt.generateSequence(navDestination, C0161OooO00o.f9917OooO0Oo);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,822:1\n1855#2,2:823\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n127#1:823,2\n*E\n"})
    public static final class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f9918OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final NavDestination f9919OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f9920OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Bundle f9921OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f9922OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f9923OooO0oo;

        public OooO0O0(@NotNull NavDestination destination, @Nullable Bundle bundle, boolean z, int i, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f9919OooO0Oo = destination;
            this.f9921OooO0o0 = bundle;
            this.f9920OooO0o = z;
            this.f9922OooO0oO = i;
            this.f9923OooO0oo = z2;
            this.f9918OooO = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(@NotNull OooO0O0 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.f9920OooO0o;
            if (z && !other.f9920OooO0o) {
                return 1;
            }
            if (!z && other.f9920OooO0o) {
                return -1;
            }
            int i = this.f9922OooO0oO - other.f9922OooO0oO;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = other.f9921OooO0o0;
            Bundle bundle2 = this.f9921OooO0o0;
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
            boolean z2 = other.f9923OooO0oo;
            boolean z3 = this.f9923OooO0oo;
            if (z3 && !z2) {
                return 1;
            }
            if (z3 || !z2) {
                return this.f9918OooO - other.f9918OooO;
            }
            return -1;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0Oo f9924OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O0Oo o000o0oo2) {
            super(1);
            this.f9924OooO0Oo = o000o0oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String key = str;
            Intrinsics.checkNotNullParameter(key, "key");
            o000O0Oo o000o0oo2 = this.f9924OooO0Oo;
            ArrayList arrayList = o000o0oo2.f35728OooO0Oo;
            Collection collectionValues = ((Map) o000o0oo2.f35732OooO0oo.getValue()).values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((o000O0Oo.OooO0O0) it.next()).f35742OooO0O0);
            }
            return Boolean.valueOf(!CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2), (Iterable) o000o0oo2.f35734OooOO0O.getValue()).contains(key));
        }
    }

    static {
        new LinkedHashMap();
    }

    public NavDestination(@NotNull Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = OooOOOO.f10009OooO0O0;
        String navigatorName = OooOOOO.OooO00o.OooO00o(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f9910OooO0Oo = navigatorName;
        this.f9913OooO0oO = new ArrayList();
        this.f9914OooO0oo = new Oooo000<>();
        this.f9909OooO = new LinkedHashMap();
    }

    public final void OooO00o(@NotNull o000O0Oo navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        ArrayList arrayListOooO00o = o0000O0O.OooO00o(OooO0OO(), new OooO0OO(navDeepLink));
        if (arrayListOooO00o.isEmpty()) {
            this.f9913OooO0oO.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f35725OooO00o + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListOooO00o).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle OooO0O0(@Nullable Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f9909OooO;
        if (bundle == null) {
            if (linkedHashMap == null || linkedHashMap.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            ((o0000O0) entry.getValue()).getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String name2 = (String) entry2.getKey();
                ((o0000O0) entry2.getValue()).getClass();
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
    public final Map<String, o0000O0> OooO0OO() {
        return MapsKt.toMap(this.f9909OooO);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final OooO0O0 OooO0Oo(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri uri = Uri.parse(OooO00o.OooO00o(route));
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        o00O000 o00o001 = new o00O000(null, uri, null);
        return this instanceof OooO ? ((OooO) this).OooOO0(o00o001) : OooO0o0(o00o001);
    }

    public final void OooO0o(@Nullable String str) {
        if (str == null) {
            this.f9915OooOO0 = 0;
        } else {
            if (!(!StringsKt.isBlank(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String uriPattern = OooO00o.OooO00o(str);
            this.f9915OooOO0 = uriPattern.hashCode();
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            OooO00o(new o000O0Oo(uriPattern));
        }
        ArrayList arrayList = this.f9913OooO0oO;
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((o000O0Oo) obj).f35725OooO00o, OooO00o.OooO00o(this.f9916OooOO0O))) {
                TypeIntrinsics.asMutableCollection(arrayList).remove(obj);
                this.f9916OooOO0O = str;
            }
        }
        obj = null;
        TypeIntrinsics.asMutableCollection(arrayList).remove(obj);
        this.f9916OooOO0O = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x0217  */
    /* JADX WARN: Code duplicated, block: B:114:0x0229  */
    /* JADX WARN: Code duplicated, block: B:116:0x0238  */
    /* JADX WARN: Code duplicated, block: B:118:0x023e  */
    /* JADX WARN: Code duplicated, block: B:130:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[LOOP:2: B:78:0x017d->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0100 A[PHI: r9
      0x0100: PHI (r9v2 java.util.regex.Matcher) = 
      (r9v1 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
      (r9v21 java.util.regex.Matcher)
      (r9v1 java.util.regex.Matcher)
     binds: [B:9:0x0028, B:14:0x004d, B:17:0x0055, B:20:0x0062, B:51:0x00fb, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f A[EDGE_INSN: B:86:0x019f->B:87:0x01a4 BREAK  A[LOOP:2: B:78:0x017d->B:138:?]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public OooO0O0 OooO0o0(@NotNull o00O000 navDeepLinkRequest) {
        Bundle bundle;
        int size;
        String str;
        boolean z;
        String mimeType;
        int i;
        OooO0O0 oooO0O0;
        Map<String, o0000O0> arguments;
        Bundle bundle2;
        Pattern pattern;
        Matcher matcher;
        String mimeType2;
        Pattern pattern2;
        List<String> listSplit;
        int i2;
        List listEmptyList;
        String str2;
        o000O0Oo.OooO00o other;
        ListIterator<String> listIterator;
        boolean z2;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        ArrayList<o000O0Oo> arrayList = this.f9913OooO0oO;
        Matcher matcher2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        OooO0O0 oooO0O1 = null;
        for (o000O0Oo o000o0oo2 : arrayList) {
            Uri deepLink = navDeepLinkRequest.f35756OooO00o;
            if (deepLink != null) {
                Map<String, o0000O0> arguments2 = OooO0OO();
                o000o0oo2.getClass();
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(arguments2, "arguments");
                Pattern pattern3 = (Pattern) o000o0oo2.f35729OooO0o.getValue();
                Matcher matcher3 = pattern3 != null ? pattern3.matcher(deepLink.toString()) : matcher2;
                if (matcher3 != null && matcher3.matches()) {
                    Bundle bundle3 = new Bundle();
                    if (o000o0oo2.OooO0O0(matcher3, bundle3, arguments2) && (!((Boolean) o000o0oo2.f35731OooO0oO.getValue()).booleanValue() || o000o0oo2.OooO0OO(deepLink, bundle3, arguments2))) {
                        String fragment = deepLink.getFragment();
                        Pattern pattern4 = (Pattern) o000o0oo2.f35737OooOOO0.getValue();
                        Matcher matcher4 = pattern4 != null ? pattern4.matcher(String.valueOf(fragment)) : matcher2;
                        if (matcher4 != null && matcher4.matches()) {
                            List list = (List) o000o0oo2.f35734OooOO0O.getValue();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(list));
                            int i3 = 0;
                            for (Object obj : list) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                String str3 = (String) obj;
                                String value = Uri.decode(matcher4.group(i4));
                                o0000O0 o0000o1 = arguments2.get(str3);
                                try {
                                    Intrinsics.checkNotNullExpressionValue(value, "value");
                                    if (o0000o1 != null) {
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
                        if (!o0000O0O.OooO00o(arguments2, new o000OOo0(bundle3)).isEmpty()) {
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
                String str4 = o000o0oo2.f35725OooO00o;
                if (str4 != null) {
                    List<String> requestedPathSegments = deepLink.getPathSegments();
                    List<String> uriPathSegments = Uri.parse(str4).getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
                    Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
                    size = CollectionsKt.intersect(requestedPathSegments, uriPathSegments).size();
                }
                str = navDeepLinkRequest.f35757OooO0O0;
                if (str == null && Intrinsics.areEqual(str, o000o0oo2.f35726OooO0O0)) {
                    z = true;
                } else {
                    z = false;
                }
                mimeType = navDeepLinkRequest.f35758OooO0OO;
                if (mimeType != null) {
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                    mimeType2 = o000o0oo2.f35727OooO0OO;
                    if (mimeType2 != null) {
                        pattern2 = (Pattern) o000o0oo2.f35736OooOOO.getValue();
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
                            other = new o000O0Oo.OooO00o(mimeType);
                            Intrinsics.checkNotNullParameter(other, "other");
                            i = Intrinsics.areEqual(str5, other.f35739OooO0Oo) ? 2 : 0;
                            if (Intrinsics.areEqual(str2, other.f35740OooO0o0)) {
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
                    oooO0O0 = new OooO0O0(this, bundle, o000o0oo2.f35738OooOOOO, size, z, i);
                    if (oooO0O1 != null || oooO0O0.compareTo(oooO0O1) > 0) {
                        oooO0O1 = oooO0O0;
                    }
                } else if (z || i > -1) {
                    arguments = OooO0OO();
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    bundle2 = new Bundle();
                    if (deepLink != null) {
                        pattern = (Pattern) o000o0oo2.f35729OooO0o.getValue();
                        if (pattern != null) {
                            matcher = pattern.matcher(deepLink.toString());
                        } else {
                            matcher = null;
                        }
                        if (matcher != null && matcher.matches()) {
                            o000o0oo2.OooO0O0(matcher, bundle2, arguments);
                            if (((Boolean) o000o0oo2.f35731OooO0oO.getValue()).booleanValue()) {
                                o000o0oo2.OooO0OO(deepLink, bundle2, arguments);
                            }
                        }
                    }
                    if (o0000O0O.OooO00o(arguments, new o00O000o(bundle2)).isEmpty()) {
                        oooO0O0 = new OooO0O0(this, bundle, o000o0oo2.f35738OooOOOO, size, z, i);
                        if (oooO0O1 != null) {
                            oooO0O1 = oooO0O0;
                        } else {
                            oooO0O1 = oooO0O0;
                        }
                    }
                }
                matcher2 = null;
            } else {
                o000o0oo2.getClass();
            }
            size = 0;
            str = navDeepLinkRequest.f35757OooO0O0;
            if (str == null) {
                z = false;
            } else {
                z = false;
            }
            mimeType = navDeepLinkRequest.f35758OooO0OO;
            if (mimeType != null) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                mimeType2 = o000o0oo2.f35727OooO0OO;
                if (mimeType2 != null) {
                    pattern2 = (Pattern) o000o0oo2.f35736OooOOO.getValue();
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
                        other = new o000O0Oo.OooO00o(mimeType);
                        Intrinsics.checkNotNullParameter(other, "other");
                        if (Intrinsics.areEqual(str6, other.f35739OooO0Oo)) {
                        }
                        if (Intrinsics.areEqual(str2, other.f35740OooO0o0)) {
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
                oooO0O0 = new OooO0O0(this, bundle, o000o0oo2.f35738OooOOOO, size, z, i);
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
                    pattern = (Pattern) o000o0oo2.f35729OooO0o.getValue();
                    if (pattern != null) {
                        matcher = pattern.matcher(deepLink.toString());
                    } else {
                        matcher = null;
                    }
                    if (matcher != null) {
                        o000o0oo2.OooO0O0(matcher, bundle2, arguments);
                        if (((Boolean) o000o0oo2.f35731OooO0oO.getValue()).booleanValue()) {
                            o000o0oo2.OooO0OO(deepLink, bundle2, arguments);
                        }
                    }
                }
                if (o0000O0O.OooO00o(arguments, new o00O000o(bundle2)).isEmpty()) {
                    oooO0O0 = new OooO0O0(this, bundle, o000o0oo2.f35738OooOOOO, size, z, i);
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
                    pattern = (Pattern) o000o0oo2.f35729OooO0o.getValue();
                    if (pattern != null) {
                        matcher = pattern.matcher(deepLink.toString());
                    } else {
                        matcher = null;
                    }
                    if (matcher != null) {
                        o000o0oo2.OooO0O0(matcher, bundle2, arguments);
                        if (((Boolean) o000o0oo2.f35731OooO0oO.getValue()).booleanValue()) {
                            o000o0oo2.OooO0OO(deepLink, bundle2, arguments);
                        }
                    }
                }
                if (o0000O0O.OooO00o(arguments, new o00O000o(bundle2)).isEmpty()) {
                    oooO0O0 = new OooO0O0(this, bundle, o000o0oo2.f35738OooOOOO, size, z, i);
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
        ArrayList arrayList = this.f9913OooO0oO;
        NavDestination navDestination = (NavDestination) obj;
        boolean z7 = CollectionsKt.intersect(arrayList, navDestination.f9913OooO0oO).size() == arrayList.size();
        Oooo000<o0000oo> oooo000 = this.f9914OooO0oo;
        int iOooO = oooo000.OooO();
        Oooo000<o0000oo> oooo001 = navDestination.f9914OooO0oo;
        if (iOooO == oooo001.OooO()) {
            Iterator it = SequencesKt.asSequence(o000oOoO.OooO00o(oooo000)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = true;
                    break;
                }
                o0000oo o0000ooVar = (o0000oo) it.next();
                if (oooo001.f38581OooO0Oo) {
                    oooo001.OooO0o0();
                }
                int i = 0;
                while (true) {
                    if (i >= oooo001.f38584OooO0oO) {
                        i = -1;
                        break;
                    }
                    if (oooo001.f38582OooO0o[i] == o0000ooVar) {
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
                Iterator it2 = SequencesKt.asSequence(o000oOoO.OooO00o(oooo001)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z6 = true;
                        break;
                    }
                    o0000oo o0000ooVar2 = (o0000oo) it2.next();
                    if (oooo000.f38581OooO0Oo) {
                        oooo000.OooO0o0();
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= oooo000.f38584OooO0oO) {
                            i2 = -1;
                            break;
                        }
                        if (oooo000.f38582OooO0o[i2] == o0000ooVar2) {
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
        return this.f9915OooOO0 == navDestination.f9915OooOO0 && Intrinsics.areEqual(this.f9916OooOO0O, navDestination.f9916OooOO0O) && z7 && z && z2;
    }

    public int hashCode() {
        int i = this.f9915OooOO0 * 31;
        String str = this.f9916OooOO0O;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (o000O0Oo o000o0oo2 : this.f9913OooO0oO) {
            int i2 = iHashCode * 31;
            String str2 = o000o0oo2.f35725OooO00o;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = o000o0oo2.f35726OooO0O0;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = o000o0oo2.f35727OooO0OO;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        Oooo0 oooo0OooO00o = o000oOoO.OooO00o(this.f9914OooO0oo);
        while (oooo0OooO00o.hasNext()) {
            ((o0000oo) oooo0OooO00o.next()).getClass();
            iHashCode = (((iHashCode * 31) + 0) * 31) + 0;
        }
        for (String str5 : OooO0OO().keySet()) {
            int iOooO00o = androidx.compose.animation.OooO0O0.OooO00o(str5, iHashCode * 31, 31);
            o0000O0 o0000o1 = OooO0OO().get(str5);
            iHashCode = iOooO00o + (o0000o1 != null ? o0000o1.hashCode() : 0);
        }
        return iHashCode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.f9915OooOO0));
        sb.append(")");
        String str = this.f9916OooOO0O;
        if (!(str == null || StringsKt.isBlank(str))) {
            sb.append(" route=");
            sb.append(this.f9916OooOO0O);
        }
        if (this.f9911OooO0o != null) {
            sb.append(" label=");
            sb.append(this.f9911OooO0o);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
