package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.camera.core.impl.OooOOOO;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1208#2,2:107\n1238#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> PREDEFINED_STRINGS;

    @NotNull
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f33068kotlin;

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
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        f33068kotlin = strJoinToString$default;
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{OooOOOO.OooO00o(strJoinToString$default, "/Any"), OooOOOO.OooO00o(strJoinToString$default, "/Nothing"), OooOOOO.OooO00o(strJoinToString$default, "/Unit"), OooOOOO.OooO00o(strJoinToString$default, "/Throwable"), OooOOOO.OooO00o(strJoinToString$default, "/Number"), OooOOOO.OooO00o(strJoinToString$default, "/Byte"), OooOOOO.OooO00o(strJoinToString$default, "/Double"), OooOOOO.OooO00o(strJoinToString$default, "/Float"), OooOOOO.OooO00o(strJoinToString$default, "/Int"), OooOOOO.OooO00o(strJoinToString$default, "/Long"), OooOOOO.OooO00o(strJoinToString$default, "/Short"), OooOOOO.OooO00o(strJoinToString$default, "/Boolean"), OooOOOO.OooO00o(strJoinToString$default, "/Char"), OooOOOO.OooO00o(strJoinToString$default, "/CharSequence"), OooOOOO.OooO00o(strJoinToString$default, "/String"), OooOOOO.OooO00o(strJoinToString$default, "/Comparable"), OooOOOO.OooO00o(strJoinToString$default, "/Enum"), OooOOOO.OooO00o(strJoinToString$default, "/Array"), OooOOOO.OooO00o(strJoinToString$default, "/ByteArray"), OooOOOO.OooO00o(strJoinToString$default, "/DoubleArray"), OooOOOO.OooO00o(strJoinToString$default, "/FloatArray"), OooOOOO.OooO00o(strJoinToString$default, "/IntArray"), OooOOOO.OooO00o(strJoinToString$default, "/LongArray"), OooOOOO.OooO00o(strJoinToString$default, "/ShortArray"), OooOOOO.OooO00o(strJoinToString$default, "/BooleanArray"), OooOOOO.OooO00o(strJoinToString$default, "/CharArray"), OooOOOO.OooO00o(strJoinToString$default, "/Cloneable"), OooOOOO.OooO00o(strJoinToString$default, "/Annotation"), OooOOOO.OooO00o(strJoinToString$default, "/collections/Iterable"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableIterable"), OooOOOO.OooO00o(strJoinToString$default, "/collections/Collection"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableCollection"), OooOOOO.OooO00o(strJoinToString$default, "/collections/List"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableList"), OooOOOO.OooO00o(strJoinToString$default, "/collections/Set"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableSet"), OooOOOO.OooO00o(strJoinToString$default, "/collections/Map"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableMap"), OooOOOO.OooO00o(strJoinToString$default, "/collections/Map.Entry"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableMap.MutableEntry"), OooOOOO.OooO00o(strJoinToString$default, "/collections/Iterator"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableIterator"), OooOOOO.OooO00o(strJoinToString$default, "/collections/ListIterator"), OooOOOO.OooO00o(strJoinToString$default, "/collections/MutableListIterator")});
        PREDEFINED_STRINGS = listListOf;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(listListOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.OooO0oo(iterableWithIndex)), 16));
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
