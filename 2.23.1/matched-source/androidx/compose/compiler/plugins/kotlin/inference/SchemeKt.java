package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\b\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"eos", "", "deserializeScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "schemeParseError", "", "mergeWith", "schemes", "", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/SchemeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,441:1\n1#2:442\n1855#3,2:443\n*S KotlinDebug\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/SchemeKt\n*L\n434#1:443,2\n*E\n"})
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
    public static final Scheme deserializeScheme(@NotNull String str) {
        SchemeStringSerializationReader schemeStringSerializationReader = new SchemeStringSerializationReader(str);
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

    @NotNull
    public static final Scheme mergeWith(@NotNull Scheme scheme, @NotNull List<Scheme> list) {
        if (list.isEmpty()) {
            return scheme;
        }
        LazyScheme lazyScheme = new LazyScheme(scheme, null, null, 6, null);
        Bindings bindings = lazyScheme.getBindings();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            mergeWith$unifySchemes(bindings, lazyScheme, new LazyScheme((Scheme) it.next(), null, lazyScheme.getBindings(), 2, null));
        }
        return lazyScheme.toScheme();
    }

    private static final void mergeWith$unifySchemes(Bindings bindings, LazyScheme lazyScheme, LazyScheme lazyScheme2) {
        bindings.unify(lazyScheme.getTarget(), lazyScheme2.getTarget());
        for (Pair pair : CollectionsKt.zip(lazyScheme.getParameters(), lazyScheme2.getParameters())) {
            mergeWith$unifySchemes(bindings, (LazyScheme) pair.component1(), (LazyScheme) pair.component2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void schemeParseError() throws SchemeParseError {
        throw new SchemeParseError();
    }
}
