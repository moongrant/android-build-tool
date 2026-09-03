package p037OoooOo0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.o00Oo0;
import p031OoooO0.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00000<T> extends o000O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f1482OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O f1483OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1484OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Size f1485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1486OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f1487OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Matrix f1488OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00Oo0 f1489OooO0oo;

    public o00000(T t, @Nullable o00O0O o00o0o2, int i, Size size, Rect rect, int i2, Matrix matrix, o00Oo0 o00oo1) {
        if (t == null) {
            throw new NullPointerException("Null data");
        }
        this.f1482OooO00o = t;
        this.f1483OooO0O0 = o00o0o2;
        this.f1484OooO0OO = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f1485OooO0Oo = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f1487OooO0o0 = rect;
        this.f1486OooO0o = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f1488OooO0oO = matrix;
        if (o00oo1 == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f1489OooO0oo = o00oo1;
    }

    @Override // p037OoooOo0.o000O00
    @NonNull
    public final o00Oo0 OooO00o() {
        return this.f1489OooO0oo;
    }

    @Override // p037OoooOo0.o000O00
    @NonNull
    public final Rect OooO0O0() {
        return this.f1487OooO0o0;
    }

    @Override // p037OoooOo0.o000O00
    @NonNull
    public final T OooO0OO() {
        return this.f1482OooO00o;
    }

    @Override // p037OoooOo0.o000O00
    @Nullable
    public final o00O0O OooO0Oo() {
        return this.f1483OooO0O0;
    }

    @Override // p037OoooOo0.o000O00
    public final int OooO0o() {
        return this.f1486OooO0o;
    }

    @Override // p037OoooOo0.o000O00
    public final int OooO0o0() {
        return this.f1484OooO0OO;
    }

    @Override // p037OoooOo0.o000O00
    @NonNull
    public final Matrix OooO0oO() {
        return this.f1488OooO0oO;
    }

    @Override // p037OoooOo0.o000O00
    @NonNull
    public final Size OooO0oo() {
        return this.f1485OooO0Oo;
    }

    public final boolean equals(Object obj) {
        o00O0O o00o0o2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000O00)) {
            return false;
        }
        o000O00 o000o01 = (o000O00) obj;
        return this.f1482OooO00o.equals(o000o01.OooO0OO()) && ((o00o0o2 = this.f1483OooO0O0) != null ? o00o0o2.equals(o000o01.OooO0Oo()) : o000o01.OooO0Oo() == null) && this.f1484OooO0OO == o000o01.OooO0o0() && this.f1485OooO0Oo.equals(o000o01.OooO0oo()) && this.f1487OooO0o0.equals(o000o01.OooO0O0()) && this.f1486OooO0o == o000o01.OooO0o() && this.f1488OooO0oO.equals(o000o01.OooO0oO()) && this.f1489OooO0oo.equals(o000o01.OooO00o());
    }

    public final int hashCode() {
        int iHashCode = (this.f1482OooO00o.hashCode() ^ 1000003) * 1000003;
        o00O0O o00o0o2 = this.f1483OooO0O0;
        return ((((((((((((iHashCode ^ (o00o0o2 == null ? 0 : o00o0o2.hashCode())) * 1000003) ^ this.f1484OooO0OO) * 1000003) ^ this.f1485OooO0Oo.hashCode()) * 1000003) ^ this.f1487OooO0o0.hashCode()) * 1000003) ^ this.f1486OooO0o) * 1000003) ^ this.f1488OooO0oO.hashCode()) * 1000003) ^ this.f1489OooO0oo.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f1482OooO00o + ", exif=" + this.f1483OooO0O0 + ", format=" + this.f1484OooO0OO + ", size=" + this.f1485OooO0Oo + ", cropRect=" + this.f1487OooO0o0 + ", rotationDegrees=" + this.f1486OooO0o + ", sensorToBufferTransform=" + this.f1488OooO0oO + ", cameraCaptureResult=" + this.f1489OooO0oo + "}";
    }
}
