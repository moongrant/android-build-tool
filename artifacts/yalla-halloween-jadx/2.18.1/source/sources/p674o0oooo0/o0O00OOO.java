package p674o0oooo0;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final byte[] f52067OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    public int f52068OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public int f52069OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    public boolean f52070OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0O00OOO f52071OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public boolean f52072OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0O00OOO f52073OooO0oO;

    public o0O00OOO() {
        this.f52067OooO00o = new byte[8192];
        this.f52072OooO0o0 = true;
        this.f52070OooO0Oo = false;
    }

    @Nullable
    public final o0O00OOO OooO00o() {
        o0O00OOO o0o00ooo2 = this.f52071OooO0o;
        if (o0o00ooo2 == this) {
            o0o00ooo2 = null;
        }
        o0O00OOO o0o00ooo3 = this.f52073OooO0oO;
        Intrinsics.checkNotNull(o0o00ooo3);
        o0o00ooo3.f52071OooO0o = this.f52071OooO0o;
        o0O00OOO o0o00ooo4 = this.f52071OooO0o;
        Intrinsics.checkNotNull(o0o00ooo4);
        o0o00ooo4.f52073OooO0oO = this.f52073OooO0oO;
        this.f52071OooO0o = null;
        this.f52073OooO0oO = null;
        return o0o00ooo2;
    }

    @NotNull
    public final o0O00OOO OooO0O0(@NotNull o0O00OOO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f52073OooO0oO = this;
        segment.f52071OooO0o = this.f52071OooO0o;
        o0O00OOO o0o00ooo2 = this.f52071OooO0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        o0o00ooo2.f52073OooO0oO = segment;
        this.f52071OooO0o = segment;
        return segment;
    }

    @NotNull
    public final o0O00OOO OooO0OO() {
        this.f52070OooO0Oo = true;
        return new o0O00OOO(this.f52067OooO00o, this.f52068OooO0O0, this.f52069OooO0OO, true, false);
    }

    public final void OooO0Oo(@NotNull o0O00OOO sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f52072OooO0o0) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = sink.f52069OooO0OO;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (sink.f52070OooO0Oo) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.f52068OooO0O0;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f52067OooO00o;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
            sink.f52069OooO0OO -= sink.f52068OooO0O0;
            sink.f52068OooO0O0 = 0;
        }
        byte[] bArr2 = this.f52067OooO00o;
        byte[] bArr3 = sink.f52067OooO00o;
        int i5 = sink.f52069OooO0OO;
        int i6 = this.f52068OooO0O0;
        ArraysKt.copyInto(bArr2, bArr3, i5, i6, i6 + i);
        sink.f52069OooO0OO += i;
        this.f52068OooO0O0 += i;
    }

    public o0O00OOO(@NotNull byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f52067OooO00o = data;
        this.f52068OooO0O0 = i;
        this.f52069OooO0OO = i2;
        this.f52070OooO0Oo = z;
        this.f52072OooO0o0 = z2;
    }
}
