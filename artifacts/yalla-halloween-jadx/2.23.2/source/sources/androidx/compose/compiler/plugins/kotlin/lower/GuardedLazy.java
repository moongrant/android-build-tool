package androidx.compose.compiler.plugins.kotlin.lower;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0088\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/GuardedLazy;", "T", "", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_initializer", "_value", AppMeasurementSdk.ConditionalUserProperty.VALUE, "name", "", "(Ljava/lang/String;)Ljava/lang/Object;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class GuardedLazy<T> {

    @Nullable
    private Function0<? extends T> _initializer;

    @Nullable
    private Object _value = UNINITIALIZED_VALUE.INSTANCE;

    public GuardedLazy(@NotNull Function0<? extends T> function0) {
        this._initializer = function0;
    }

    public final T value(@NotNull String name) {
        if (this._value == UNINITIALIZED_VALUE.INSTANCE) {
            try {
                Function0<? extends T> function0 = this._initializer;
                Intrinsics.checkNotNull(function0);
                this._value = function0.invoke();
                this._initializer = null;
            } catch (Throwable th) {
                throw new IllegalStateException(o00O00OO.OooO00o("Error initializing ", name), th);
            }
        }
        return (T) this._value;
    }
}
