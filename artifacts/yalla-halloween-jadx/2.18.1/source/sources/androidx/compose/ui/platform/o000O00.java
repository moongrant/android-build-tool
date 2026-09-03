package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 implements p045OooooOo.o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f6432OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ p045OooooOo.o00O0OO f6433OooO0O0;

    public o000O00(@NotNull p045OooooOo.o00O0OO saveableStateRegistry, @NotNull Function0<Unit> onDispose) {
        Intrinsics.checkNotNullParameter(saveableStateRegistry, "saveableStateRegistry");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.f6432OooO00o = onDispose;
        this.f6433OooO0O0 = saveableStateRegistry;
    }

    @Override // p045OooooOo.o00O0OO
    @NotNull
    public final Map<String, List<Object>> OooO00o() {
        return this.f6433OooO0O0.OooO00o();
    }

    @Override // p045OooooOo.o00O0OO
    @Nullable
    public final Object OooO0O0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f6433OooO0O0.OooO0O0(key);
    }

    @Override // p045OooooOo.o00O0OO
    @NotNull
    public final OooooOo.o00O0OO.OooO00o OooO0OO(@NotNull String key, @NotNull Function0<? extends Object> valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        return this.f6433OooO0O0.OooO0OO(key, valueProvider);
    }

    @Override // p045OooooOo.o00O0OO
    public final boolean canBeSaved(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f6433OooO0O0.canBeSaved(value);
    }
}
