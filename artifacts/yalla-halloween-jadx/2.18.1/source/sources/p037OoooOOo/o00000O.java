package p037OoooOOo;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface o00000O<K, V> extends Map, KMappedMarker {

    public interface OooO00o<K, V> extends Map<K, V>, KMutableMap {
        @NotNull
        o00000O<K, V> build();
    }

    @NotNull
    OooO00o<K, V> OooO0o();
}
