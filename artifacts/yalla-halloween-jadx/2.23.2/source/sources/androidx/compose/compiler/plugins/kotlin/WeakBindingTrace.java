package androidx.compose.compiler.plugins.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.openapi.util.Key;
import org.jetbrains.kotlin.com.intellij.util.keyFMap.KeyFMap;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.util.slicedMap.ReadOnlySlice;
import org.jetbrains.kotlin.util.slicedMap.WritableSlice;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00070\u000b2\u0006\u0010\f\u001a\u0002H\bH\u0086\u0002¢\u0006\u0002\u0010\rJ?\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00070\u00102\u0006\u0010\f\u001a\u0002H\b2\u0006\u0010\u0011\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/WeakBindingTrace;", "", "()V", "map", "Ljava/util/WeakHashMap;", "Lorg/jetbrains/kotlin/com/intellij/util/keyFMap/KeyFMap;", "get", "V", "K", "Lorg/jetbrains/kotlin/ir/declarations/IrAttributeContainer;", "slice", "Lorg/jetbrains/kotlin/util/slicedMap/ReadOnlySlice;", "key", "(Lorg/jetbrains/kotlin/util/slicedMap/ReadOnlySlice;Lorg/jetbrains/kotlin/ir/declarations/IrAttributeContainer;)Ljava/lang/Object;", "record", "", "Lorg/jetbrains/kotlin/util/slicedMap/WritableSlice;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lorg/jetbrains/kotlin/util/slicedMap/WritableSlice;Lorg/jetbrains/kotlin/ir/declarations/IrAttributeContainer;Ljava/lang/Object;)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WeakBindingTrace {

    @NotNull
    private final WeakHashMap<Object, KeyFMap> map = new WeakHashMap<>();

    @Nullable
    public final <K extends IrAttributeContainer, V> V get(@NotNull ReadOnlySlice<K, V> slice, @NotNull K key) {
        KeyFMap keyFMap = this.map.get(key.getAttributeOwnerId());
        if (keyFMap != null) {
            return (V) keyFMap.get(slice.getKey());
        }
        return null;
    }

    public final <K extends IrAttributeContainer, V> void record(@NotNull WritableSlice<K, V> slice, @NotNull K key, V value) {
        KeyFMap keyFMapMinus = this.map.get(key.getAttributeOwnerId());
        if (keyFMapMinus == null) {
            keyFMapMinus = KeyFMap.EMPTY_MAP;
        }
        if (keyFMapMinus.get(slice.getKey()) != null) {
            keyFMapMinus = keyFMapMinus.minus(slice.getKey());
        }
        Key key2 = slice.getKey();
        Intrinsics.checkNotNull(value);
        this.map.put(key.getAttributeOwnerId(), keyFMapMinus.plus(key2, value));
    }
}
