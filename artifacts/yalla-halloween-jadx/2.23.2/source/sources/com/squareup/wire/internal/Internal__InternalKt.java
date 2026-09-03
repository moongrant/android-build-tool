package com.squareup.wire.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p031OoooO0.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f\u001a\u0016\u0010\f\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011\u001a,\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u00010\u000fH\u0007\u001a>\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0016\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u0015\u001a\u00020\u00012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u0011H\u0007\u001a \u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00140\u000f\u001a2\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0016\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0011\u001a\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u001a$\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u001aK\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040 \"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010!\u001a\u001a\u0010\"\u001a\u00020#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u001a(\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00140\u000f\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00140\u000f\u001a:\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0011\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0011\u001a:\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0011\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0011\u001a!\u0010&\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010'\u001a\u0002H\u0014¢\u0006\u0002\u0010(\u001a'\u0010)\u001a\u00060*j\u0002`+2\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040 \"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010-\u001a\u0012\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u0014\u001a\u001e\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0016\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u0018\u001a\u000e\u00100\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0001\u001a\u0014\u00100\u001a\u00020\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f\u001a1\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00140\u000f\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u001404H\u0007¢\u0006\u0002\b5\u001aC\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u0011\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u0018*\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u001804H\u0007¢\u0006\u0002\b5\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\" \u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u00066"}, d2 = {"ESCAPED_CHARS", "", "typeName", "Lkotlin/reflect/KClass;", "", "getTypeName$Internal__InternalKt", "(Ljava/lang/Object;)Lkotlin/reflect/KClass;", "boxedOneOfClassName", "oneOfName", "boxedOneOfKeyFieldName", "fieldName", "boxedOneOfKeysFieldName", "checkElementsNotNull", "", "list", "", "map", "", "copyOf", "", "T", "name", "", "K", "V", "countNonNull", "", "a", "b", "c", "d", "rest", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)I", "equals", "", "immutableCopyOf", "immutableCopyOfMapWithStructValues", "immutableCopyOfStruct", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "missingRequiredFields", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "args", "([Ljava/lang/Object;)Ljava/lang/IllegalStateException;", "newMutableList", "newMutableMap", "sanitize", "values", "redactElements", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "-redactElements", "wire-runtime"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/wire/internal/Internal")
final /* synthetic */ class Internal__InternalKt {

    @NotNull
    private static final String ESCAPED_CHARS = ",[]{}\\";

    /* JADX INFO: renamed from: com.squareup.wire.internal.Internal__InternalKt$sanitize$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReference implements Function1<String, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "sanitize";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinPackage(Internal__InternalKt.class, "wire-runtime");
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "sanitize(Ljava/lang/String;)Ljava/lang/String;";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Internal.sanitize(p0);
        }
    }

    @JvmName(name = "-redactElements")
    @NotNull
    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m4194redactElements(@NotNull List<? extends T> list, @NotNull ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final String boxedOneOfClassName(@NotNull String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        return StringsKt.capitalize(oneOfName);
    }

    @NotNull
    public static final String boxedOneOfKeyFieldName(@NotNull String oneOfName, @NotNull String fieldName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String upperCase = (oneOfName + '_' + fieldName).toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    @NotNull
    public static final String boxedOneOfKeysFieldName(@NotNull String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        String upperCase = Intrinsics.stringPlus(oneOfName, "_keys").toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static final void checkElementsNotNull(@NotNull List<?> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (list.get(i) == null) {
                throw new NullPointerException(OooO0OO.OooO00o.OooO00o("Element at index ", i, " is null"));
            }
            i = i2;
        }
    }

    @Deprecated(message = "Please regenerate code using wire-compiler version 3.0.0 or higher.", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(list)", imports = {}))
    @NotNull
    public static final <T> List<T> copyOf(@NotNull String name, @Nullable List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(list);
        return Internal.copyOf(list);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 == null ? 0 : 1);
    }

    public static final boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && Intrinsics.areEqual(obj, obj2));
    }

    private static final KClass<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return Reflection.getOrCreateKotlinClass(obj.getClass());
    }

    @NotNull
    public static final <T> List<T> immutableCopyOf(@NotNull String name, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) {
            return (List<T>) list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (!immutableList.contains(null)) {
            return immutableList;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus(name, ".contains(null)").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(@NotNull String name, @NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (!(key != null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(name, ".containsKey(null)").toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(name, value));
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(this)");
        return mapUnmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(@NotNull String name, T t) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (t == null || (t instanceof Boolean) || (t instanceof Double) || (t instanceof String)) {
            return t;
        }
        if (t instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(name, it.next()));
            }
            T t2 = (T) Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(t2, "unmodifiableList(this)");
            return t2;
        }
        if (!(t instanceof Map)) {
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("struct value ", name, " must be a JSON type (null, Boolean, Double, String, List, or Map) but was ");
            sbOooO0O0.append(getTypeName$Internal__InternalKt(t));
            sbOooO0O0.append(": ");
            sbOooO0O0.append(t);
            throw new IllegalArgumentException(sbOooO0O0.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t).entrySet()) {
            linkedHashMap.put(Internal.immutableCopyOfStruct(name, entry.getKey()), Internal.immutableCopyOfStruct(name, entry.getValue()));
        }
        T t3 = (T) Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(t3, "unmodifiableMap(this)");
        return t3;
    }

    @NotNull
    public static final IllegalStateException missingRequiredFields(@NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        StringBuilder sb = new StringBuilder();
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt.until(0, args.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        String str = "";
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int i = first + step;
                if (args[first] == null) {
                    if (sb.length() > 0) {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(args[first + 1]);
                }
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(o00Ooo.OooO00o("Required field", str, " not set:", string));
    }

    @NotNull
    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(CollectionsKt.emptyList());
    }

    @NotNull
    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    @NotNull
    public static final String sanitize(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        int i = 0;
        while (i < value.length()) {
            char cCharAt = value.charAt(i);
            i++;
            if (StringsKt__StringsKt.contains$default(ESCAPED_CHARS, cCharAt, false, 2, (Object) null)) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @NotNull
    public static final <T> List<T> copyOf(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) ? new MutableOnWriteList(list) : new ArrayList(list);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 == null ? 0 : 1);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @NotNull Object... rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        int i = 0;
        int i2 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i2++;
        }
        if (obj3 != null) {
            i2++;
        }
        if (obj4 != null) {
            i2++;
        }
        int length = rest.length;
        while (i < length) {
            Object obj5 = rest[i];
            i++;
            if (obj5 != null) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName(name = "-redactElements")
    @NotNull
    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m4195redactElements(@NotNull Map<K, ? extends V> map, @NotNull ProtoAdapter<V> adapter) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), adapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    @Deprecated(message = "Please regenerate code using wire-compiler version 3.0.0 or higher.", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(map)", imports = {}))
    @NotNull
    public static final <K, V> Map<K, V> copyOf(@NotNull String name, @Nullable Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(map);
        return Internal.copyOf(map);
    }

    @NotNull
    public static final <K, V> Map<K, V> copyOf(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new LinkedHashMap(map);
    }

    @NotNull
    public static final <K, V> Map<K, V> immutableCopyOf(@NotNull String name, @NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (!linkedHashMap.keySet().contains(null)) {
            if (!linkedHashMap.values().contains(null)) {
                Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(this)");
                return mapUnmodifiableMap;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus(name, ".containsValue(null)").toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus(name, ".containsKey(null)").toString());
    }

    @NotNull
    public static final String sanitize(@NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return CollectionsKt___CollectionsKt.joinToString$default(values, null, "[", "]", 0, null, AnonymousClass2.INSTANCE, 25, null);
    }

    public static final void checkElementsNotNull(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException("Value for key " + key + " is null");
            }
        }
    }
}
