package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\b\u0010\u0006\u001a\u00020\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"eos", "", "deserializeScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "schemeParseError", "", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/SchemeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,419:1\n1#2:420\n*E\n"})
public final class SchemeKt {
    private static final char eos = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemKind.values().length];
            try {
                iArr[ItemKind.Token.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemKind.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final Scheme deserializeScheme(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SchemeStringSerializationReader schemeStringSerializationReader = new SchemeStringSerializationReader(value);
        try {
            Scheme schemeDeserializeScheme$scheme = deserializeScheme$scheme(schemeStringSerializationReader);
            schemeStringSerializationReader.end();
            return schemeDeserializeScheme$scheme;
        } catch (SchemeParseError unused) {
            return null;
        }
    }

    private static final <T> T deserializeScheme$delimited(SchemeStringSerializationReader schemeStringSerializationReader, ItemKind itemKind, ItemKind itemKind2, Function0<? extends T> function0) {
        schemeStringSerializationReader.expect(itemKind);
        T tInvoke = function0.invoke();
        schemeStringSerializationReader.expect(itemKind2);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deserializeScheme$isItem(SchemeStringSerializationReader schemeStringSerializationReader, ItemKind itemKind) {
        if (schemeStringSerializationReader.getKind() != itemKind) {
            return false;
        }
        schemeStringSerializationReader.expect(itemKind);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Item deserializeScheme$item(SchemeStringSerializationReader schemeStringSerializationReader) throws SchemeParseError {
        int i = WhenMappings.$EnumSwitchMapping$0[schemeStringSerializationReader.getKind().ordinal()];
        if (i == 1) {
            return new Token(schemeStringSerializationReader.token());
        }
        if (i == 2) {
            return new Open(schemeStringSerializationReader.number(), false, 2, null);
        }
        schemeParseError();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<T> deserializeScheme$list(SchemeStringSerializationReader schemeStringSerializationReader, Function0<? extends T> function0) {
        if (schemeStringSerializationReader.getKind() != ItemKind.Open) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (schemeStringSerializationReader.getKind() == ItemKind.Open) {
            arrayList.add(function0.invoke());
        }
        return arrayList;
    }

    private static final <T> T deserializeScheme$optional(SchemeStringSerializationReader schemeStringSerializationReader, ItemKind itemKind, ItemKind itemKind2, Function0<? extends T> function0) {
        if (schemeStringSerializationReader.getKind() == itemKind) {
            return (T) deserializeScheme$delimited(schemeStringSerializationReader, itemKind, itemKind2, function0);
        }
        return null;
    }

    public static /* synthetic */ Object deserializeScheme$optional$default(SchemeStringSerializationReader schemeStringSerializationReader, ItemKind itemKind, ItemKind itemKind2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            itemKind2 = ItemKind.Invalid;
        }
        return deserializeScheme$optional(schemeStringSerializationReader, itemKind, itemKind2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scheme deserializeScheme$scheme(final SchemeStringSerializationReader schemeStringSerializationReader) {
        return (Scheme) deserializeScheme$delimited(schemeStringSerializationReader, ItemKind.Open, ItemKind.Close, new Function0<Scheme>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.SchemeKt$deserializeScheme$scheme$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Scheme invoke() throws SchemeParseError {
                List listDeserializeScheme$list;
                Item itemDeserializeScheme$item = SchemeKt.deserializeScheme$item(schemeStringSerializationReader);
                boolean zDeserializeScheme$isItem = SchemeKt.deserializeScheme$isItem(schemeStringSerializationReader, ItemKind.AnyParameters);
                if (zDeserializeScheme$isItem) {
                    listDeserializeScheme$list = CollectionsKt.emptyList();
                } else {
                    final SchemeStringSerializationReader schemeStringSerializationReader2 = schemeStringSerializationReader;
                    listDeserializeScheme$list = SchemeKt.deserializeScheme$list(schemeStringSerializationReader2, new Function0<Scheme>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.SchemeKt$deserializeScheme$scheme$1$parameters$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Scheme invoke() {
                            return SchemeKt.deserializeScheme$scheme(schemeStringSerializationReader2);
                        }
                    });
                }
                final SchemeStringSerializationReader schemeStringSerializationReader3 = schemeStringSerializationReader;
                return new Scheme(itemDeserializeScheme$item, listDeserializeScheme$list, (Scheme) SchemeKt.deserializeScheme$optional$default(schemeStringSerializationReader3, ItemKind.ResultPrefix, null, new Function0<Scheme>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.SchemeKt$deserializeScheme$scheme$1$result$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Scheme invoke() {
                        return SchemeKt.deserializeScheme$scheme(schemeStringSerializationReader3);
                    }
                }, 4, null), zDeserializeScheme$isItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void schemeParseError() throws SchemeParseError {
        throw new SchemeParseError();
    }
}
