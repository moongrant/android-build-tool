package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> PREDEFINED_STRINGS;

    @NotNull
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f26409kotlin;

    @NotNull
    private final Set<Integer> localNameIndices;

    @NotNull
    private final List<JvmProtoBuf.StringTableTypes.Record> records;

    @NotNull
    private final String[] strings;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        f26409kotlin = strJoinToString$default;
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{OooOo00.OooO0Oo(strJoinToString$default, "/Any"), OooOo00.OooO0Oo(strJoinToString$default, "/Nothing"), OooOo00.OooO0Oo(strJoinToString$default, "/Unit"), OooOo00.OooO0Oo(strJoinToString$default, "/Throwable"), OooOo00.OooO0Oo(strJoinToString$default, "/Number"), OooOo00.OooO0Oo(strJoinToString$default, "/Byte"), OooOo00.OooO0Oo(strJoinToString$default, "/Double"), OooOo00.OooO0Oo(strJoinToString$default, "/Float"), OooOo00.OooO0Oo(strJoinToString$default, "/Int"), OooOo00.OooO0Oo(strJoinToString$default, "/Long"), OooOo00.OooO0Oo(strJoinToString$default, "/Short"), OooOo00.OooO0Oo(strJoinToString$default, "/Boolean"), OooOo00.OooO0Oo(strJoinToString$default, "/Char"), OooOo00.OooO0Oo(strJoinToString$default, "/CharSequence"), OooOo00.OooO0Oo(strJoinToString$default, "/String"), OooOo00.OooO0Oo(strJoinToString$default, "/Comparable"), OooOo00.OooO0Oo(strJoinToString$default, "/Enum"), OooOo00.OooO0Oo(strJoinToString$default, "/Array"), OooOo00.OooO0Oo(strJoinToString$default, "/ByteArray"), OooOo00.OooO0Oo(strJoinToString$default, "/DoubleArray"), OooOo00.OooO0Oo(strJoinToString$default, "/FloatArray"), OooOo00.OooO0Oo(strJoinToString$default, "/IntArray"), OooOo00.OooO0Oo(strJoinToString$default, "/LongArray"), OooOo00.OooO0Oo(strJoinToString$default, "/ShortArray"), OooOo00.OooO0Oo(strJoinToString$default, "/BooleanArray"), OooOo00.OooO0Oo(strJoinToString$default, "/CharArray"), OooOo00.OooO0Oo(strJoinToString$default, "/Cloneable"), OooOo00.OooO0Oo(strJoinToString$default, "/Annotation"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/Iterable"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableIterable"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/Collection"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableCollection"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/List"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableList"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/Set"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableSet"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/Map"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableMap"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/Map.Entry"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableMap.MutableEntry"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/Iterator"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableIterator"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/ListIterator"), OooOo00.OooO0Oo(strJoinToString$default, "/collections/MutableListIterator")});
        PREDEFINED_STRINGS = listListOf;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(listListOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }

    public JvmNameResolverBase(@NotNull String[] strings, @NotNull Set<Integer> localNameIndices, @NotNull List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.strings = strings;
        this.localNameIndices = localNameIndices;
        this.records = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i) {
        String string;
        JvmProtoBuf.StringTableTypes.Record record = this.records.get(i);
        if (record.hasString()) {
            string = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List<String> list = PREDEFINED_STRINGS;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex >= 0 && predefinedIndex < size) {
                string = list.get(record.getPredefinedIndex());
            } else {
                string = this.strings[i];
            }
        } else {
            string = this.strings[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.checkNotNullExpressionValue(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            Intrinsics.checkNotNullExpressionValue(begin, "begin");
            if (begin.intValue() >= 0) {
                int iIntValue = begin.intValue();
                Intrinsics.checkNotNullExpressionValue(end, "end");
                if (iIntValue <= end.intValue() && end.intValue() <= string.length()) {
                    Intrinsics.checkNotNullExpressionValue(string, "string");
                    string = string.substring(begin.intValue(), end.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.checkNotNullExpressionValue(replaceCharList, "replaceCharList");
            Integer num = replaceCharList.get(0);
            Integer num2 = replaceCharList.get(1);
            Intrinsics.checkNotNullExpressionValue(string, "string");
            string = StringsKt__StringsJVMKt.replace$default(string, (char) num.intValue(), (char) num2.intValue(), false, 4, (Object) null);
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i2 == 2) {
            Intrinsics.checkNotNullExpressionValue(string, "string");
            string = StringsKt__StringsJVMKt.replace$default(string, Typography.dollar, '.', false, 4, (Object) null);
        } else if (i2 == 3) {
            if (string.length() >= 2) {
                Intrinsics.checkNotNullExpressionValue(string, "string");
                string = string.substring(1, string.length() - 1);
                Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(string, "string");
            string = StringsKt__StringsJVMKt.replace$default(string, Typography.dollar, '.', false, 4, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(string, "string");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }
}
