package androidx.compose.compiler.plugins.kotlin.analysis;

import java.util.Comparator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/KnownStableConstructs;", "", "()V", "stableFunctions", "", "", "", "getStableFunctions", "()Ljava/util/Map;", "stableTypes", "getStableTypes", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KnownStableConstructs {

    @NotNull
    public static final KnownStableConstructs INSTANCE = new KnownStableConstructs();

    @NotNull
    private static final Map<String, Integer> stableFunctions;

    @NotNull
    private static final Map<String, Integer> stableTypes;

    static {
        String qualifiedName = Reflection.getOrCreateKotlinClass(Pair.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        String qualifiedName2 = Reflection.getOrCreateKotlinClass(Triple.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName2);
        String qualifiedName3 = Reflection.getOrCreateKotlinClass(Comparator.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName3);
        String qualifiedName4 = Reflection.getOrCreateKotlinClass(Result.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName4);
        String qualifiedName5 = Reflection.getOrCreateKotlinClass(ClosedRange.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName5);
        String qualifiedName6 = Reflection.getOrCreateKotlinClass(ClosedFloatingPointRange.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName6);
        String qualifiedName7 = Reflection.getOrCreateKotlinClass(EmptyCoroutineContext.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName7);
        stableTypes = MapsKt.mapOf(TuplesKt.to(qualifiedName, 3), TuplesKt.to(qualifiedName2, 7), TuplesKt.to(qualifiedName3, 0), TuplesKt.to(qualifiedName4, 1), TuplesKt.to(qualifiedName5, 1), TuplesKt.to(qualifiedName6, 1), TuplesKt.to("com.google.common.collect.ImmutableList", 1), TuplesKt.to("com.google.common.collect.ImmutableEnumMap", 3), TuplesKt.to("com.google.common.collect.ImmutableMap", 3), TuplesKt.to("com.google.common.collect.ImmutableEnumSet", 1), TuplesKt.to("com.google.common.collect.ImmutableSet", 1), TuplesKt.to("kotlinx.collections.immutable.ImmutableCollection", 1), TuplesKt.to("kotlinx.collections.immutable.ImmutableList", 1), TuplesKt.to("kotlinx.collections.immutable.ImmutableSet", 1), TuplesKt.to("kotlinx.collections.immutable.ImmutableMap", 3), TuplesKt.to("kotlinx.collections.immutable.PersistentCollection", 1), TuplesKt.to("kotlinx.collections.immutable.PersistentList", 1), TuplesKt.to("kotlinx.collections.immutable.PersistentSet", 1), TuplesKt.to("kotlinx.collections.immutable.PersistentMap", 3), TuplesKt.to("dagger.Lazy", 1), TuplesKt.to(qualifiedName7, 0));
        stableFunctions = MapsKt.mapOf(TuplesKt.to("kotlin.collections.emptyList", 0), TuplesKt.to("kotlin.collections.listOf", 1), TuplesKt.to("kotlin.collections.listOfNotNull", 1), TuplesKt.to("kotlin.collections.mapOf", 3), TuplesKt.to("kotlin.collections.emptyMap", 0), TuplesKt.to("kotlin.collections.setOf", 1), TuplesKt.to("kotlin.collections.emptySet", 0), TuplesKt.to("kotlin.to", 3), TuplesKt.to("kotlinx.collections.immutable.immutableListOf", 1), TuplesKt.to("kotlinx.collections.immutable.immutableSetOf", 1), TuplesKt.to("kotlinx.collections.immutable.immutableMapOf", 3), TuplesKt.to("kotlinx.collections.immutable.persistentListOf", 1), TuplesKt.to("kotlinx.collections.immutable.persistentSetOf", 1), TuplesKt.to("kotlinx.collections.immutable.persistentMapOf", 3));
    }

    private KnownStableConstructs() {
    }

    @NotNull
    public final Map<String, Integer> getStableFunctions() {
        return stableFunctions;
    }

    @NotNull
    public final Map<String, Integer> getStableTypes() {
        return stableTypes;
    }
}
