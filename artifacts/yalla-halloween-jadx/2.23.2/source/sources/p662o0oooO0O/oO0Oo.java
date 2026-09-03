package p662o0oooO0O;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final byte[] f59820OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    public int f59821OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public int f59822OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    public boolean f59823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @Nullable
    public oO0Oo f59824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public final boolean f59825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @Nullable
    public oO0Oo f59826OooO0oO;

    public oO0Oo() {
        this.f59820OooO00o = new byte[8192];
        this.f59825OooO0o0 = true;
        this.f59823OooO0Oo = false;
    }

    @Nullable
    public final oO0Oo OooO00o() {
        oO0Oo oo0oo = this.f59824OooO0o;
        if (oo0oo == this) {
            oo0oo = null;
        }
        oO0Oo oo0oo2 = this.f59826OooO0oO;
        Intrinsics.checkNotNull(oo0oo2);
        oo0oo2.f59824OooO0o = this.f59824OooO0o;
        oO0Oo oo0oo3 = this.f59824OooO0o;
        Intrinsics.checkNotNull(oo0oo3);
        oo0oo3.f59826OooO0oO = this.f59826OooO0oO;
        this.f59824OooO0o = null;
        this.f59826OooO0oO = null;
        return oo0oo;
    }

    @NotNull
    public final void OooO0O0(@NotNull oO0Oo segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f59826OooO0oO = this;
        segment.f59824OooO0o = this.f59824OooO0o;
        oO0Oo oo0oo = this.f59824OooO0o;
        Intrinsics.checkNotNull(oo0oo);
        oo0oo.f59826OooO0oO = segment;
        this.f59824OooO0o = segment;
    }

    @NotNull
    public final oO0Oo OooO0OO() {
        this.f59823OooO0Oo = true;
        return new oO0Oo(this.f59820OooO00o, this.f59821OooO0O0, this.f59822OooO0OO, true, false);
    }

    public final void OooO0Oo(@NotNull oO0Oo sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f59825OooO0o0) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = sink.f59822OooO0OO;
        int i3 = i2 + i;
        byte[] bArr = sink.f59820OooO00o;
        if (i3 > 8192) {
            if (sink.f59823OooO0Oo) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.f59821OooO0O0;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
            sink.f59822OooO0OO -= sink.f59821OooO0O0;
            sink.f59821OooO0O0 = 0;
        }
        int i5 = sink.f59822OooO0OO;
        int i6 = this.f59821OooO0O0;
        ArraysKt.copyInto(this.f59820OooO00o, bArr, i5, i6, i6 + i);
        sink.f59822OooO0OO += i;
        this.f59821OooO0O0 += i;
    }

    public oO0Oo(@NotNull byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f59820OooO00o = data;
        this.f59821OooO0O0 = i;
        this.f59822OooO0OO = i2;
        this.f59823OooO0Oo = z;
        this.f59825OooO0o0 = z2;
    }
}
