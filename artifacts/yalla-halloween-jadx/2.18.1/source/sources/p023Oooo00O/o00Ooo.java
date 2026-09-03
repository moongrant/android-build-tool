package p023Oooo00O;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo<T, V extends o0O0O00> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1181OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO0O0<T, V> f1182OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final T f1183OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f1184OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f1185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public V f1186OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1187OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f1188OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f1189OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o00Ooo(Object obj, @NotNull o00OO0O0 typeConverter, @NotNull o0O0O00 initialVelocityVector, long j, Object obj2, long j2, @NotNull Function0 onCancel) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.f1182OooO00o = typeConverter;
        this.f1183OooO0O0 = obj2;
        this.f1184OooO0OO = j2;
        this.f1185OooO0Oo = onCancel;
        this.f1187OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(obj);
        this.f1186OooO0o = (V) o000OOo.OooO00o(initialVelocityVector);
        this.f1188OooO0oO = j;
        this.f1189OooO0oo = Long.MIN_VALUE;
        this.f1181OooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
    }

    public final void OooO00o() {
        OooO0o0();
        this.f1185OooO0Oo.invoke();
    }

    public final T OooO0O0() {
        return this.f1187OooO0o0.getValue();
    }

    public final T OooO0OO() {
        return this.f1182OooO00o.OooO0O0().invoke(this.f1186OooO0o);
    }

    public final boolean OooO0Oo() {
        return ((Boolean) this.f1181OooO.getValue()).booleanValue();
    }

    public final void OooO0o0() {
        this.f1181OooO.setValue(Boolean.FALSE);
    }
}
