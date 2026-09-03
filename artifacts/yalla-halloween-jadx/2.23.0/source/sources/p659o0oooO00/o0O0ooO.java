package p659o0oooO00;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final byte[] f60249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    public int f60250OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public int f60251OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    public boolean f60252OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0O0ooO f60253OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public final boolean f60254OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0O0ooO f60255OooO0oO;

    public o0O0ooO() {
        this.f60249OooO00o = new byte[8192];
        this.f60254OooO0o0 = true;
        this.f60252OooO0Oo = false;
    }

    @Nullable
    public final o0O0ooO OooO00o() {
        o0O0ooO o0o0ooo = this.f60253OooO0o;
        if (o0o0ooo == this) {
            o0o0ooo = null;
        }
        o0O0ooO o0o0ooo2 = this.f60255OooO0oO;
        Intrinsics.checkNotNull(o0o0ooo2);
        o0o0ooo2.f60253OooO0o = this.f60253OooO0o;
        o0O0ooO o0o0ooo3 = this.f60253OooO0o;
        Intrinsics.checkNotNull(o0o0ooo3);
        o0o0ooo3.f60255OooO0oO = this.f60255OooO0oO;
        this.f60253OooO0o = null;
        this.f60255OooO0oO = null;
        return o0o0ooo;
    }

    @NotNull
    public final void OooO0O0(@NotNull o0O0ooO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f60255OooO0oO = this;
        segment.f60253OooO0o = this.f60253OooO0o;
        o0O0ooO o0o0ooo = this.f60253OooO0o;
        Intrinsics.checkNotNull(o0o0ooo);
        o0o0ooo.f60255OooO0oO = segment;
        this.f60253OooO0o = segment;
    }

    @NotNull
    public final o0O0ooO OooO0OO() {
        this.f60252OooO0Oo = true;
        return new o0O0ooO(this.f60249OooO00o, this.f60250OooO0O0, this.f60251OooO0OO, true, false);
    }

    public final void OooO0Oo(@NotNull o0O0ooO sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f60254OooO0o0) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = sink.f60251OooO0OO;
        int i3 = i2 + i;
        byte[] bArr = sink.f60249OooO00o;
        if (i3 > 8192) {
            if (sink.f60252OooO0Oo) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.f60250OooO0O0;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
            sink.f60251OooO0OO -= sink.f60250OooO0O0;
            sink.f60250OooO0O0 = 0;
        }
        int i5 = sink.f60251OooO0OO;
        int i6 = this.f60250OooO0O0;
        ArraysKt.copyInto(this.f60249OooO00o, bArr, i5, i6, i6 + i);
        sink.f60251OooO0OO += i;
        this.f60250OooO0O0 += i;
    }

    public o0O0ooO(@NotNull byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f60249OooO00o = data;
        this.f60250OooO0O0 = i;
        this.f60251OooO0OO = i2;
        this.f60252OooO0Oo = z;
        this.f60254OooO0o0 = z2;
    }
}
