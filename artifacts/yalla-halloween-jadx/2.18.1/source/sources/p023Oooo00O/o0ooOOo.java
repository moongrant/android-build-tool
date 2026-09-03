package p023Oooo00O;

import OooO00o.OooO00o;
import Oooo000.o000O0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0O0O00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo<T, V extends o0O0O00> implements oO0Oo<T> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f1236Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00OO0O0<T, V> f1237Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1238Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public V f1239Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f1240OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f1241OoooO00;

    public /* synthetic */ o0ooOOo(o00OO0O0 o00oo0o1, Object obj, o0O0O00 o0o0o00, int i) {
        this(o00oo0o1, obj, (i & 4) != 0 ? null : o0o0o00, (i & 8) != 0 ? Long.MIN_VALUE : 0L, (i & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public final T OooO00o() {
        return this.f1237Oooo0o.OooO0O0().invoke(this.f1239Oooo0oo);
    }

    public final void OooO0oo(T t) {
        this.f1238Oooo0oO.setValue(t);
    }

    @Override // p100o000oOoO.oO0Oo
    public final T getValue() {
        return this.f1238Oooo0oO.getValue();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AnimationState(value=");
        sbOooO0o0.append(getValue());
        sbOooO0o0.append(", velocity=");
        sbOooO0o0.append(OooO00o());
        sbOooO0o0.append(", isRunning=");
        sbOooO0o0.append(this.f1240OoooO0);
        sbOooO0o0.append(", lastFrameTimeNanos=");
        sbOooO0o0.append(this.f1236Oooo);
        sbOooO0o0.append(", finishedTimeNanos=");
        return o000O0.OooO0O0(sbOooO0o0, this.f1241OoooO00, ')');
    }

    public o0ooOOo(@NotNull o00OO0O0<T, V> typeConverter, T t, @Nullable V v, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.f1237Oooo0o = typeConverter;
        this.f1238Oooo0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(t);
        this.f1239Oooo0oo = v != null ? (V) o000OOo.OooO00o(v) : (V) o0OOO0o.OooO0OO(typeConverter, t);
        this.f1236Oooo = j;
        this.f1241OoooO00 = j2;
        this.f1240OoooO0 = z;
    }
}
