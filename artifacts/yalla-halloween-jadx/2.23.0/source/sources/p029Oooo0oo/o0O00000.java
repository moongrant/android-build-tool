package p029Oooo0oo;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageCaptureException;
import p028Oooo0oO.o00O0;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00000 extends o0O00o00.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000O0o<ImageCaptureException> f1230OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Size f1231OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f1233OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1234OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O0 f1235OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O0o<o0OO000> f1236OooO0oo;

    public o0O00000(Size size, int i, int i2, boolean z, @Nullable o00O0 o00o1, o000O0o<o0OO000> o000o0o2, o000O0o<ImageCaptureException> o000o0o3) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f1231OooO0OO = size;
        this.f1232OooO0Oo = i;
        this.f1234OooO0o0 = i2;
        this.f1233OooO0o = z;
        this.f1235OooO0oO = o00o1;
        this.f1236OooO0oo = o000o0o2;
        this.f1230OooO = o000o0o3;
    }

    @Override // Oooo0oo.o0O00o00.OooO0O0
    @NonNull
    public final o000O0o<ImageCaptureException> OooO00o() {
        return this.f1230OooO;
    }

    @Override // Oooo0oo.o0O00o00.OooO0O0
    @Nullable
    public final o00O0 OooO0O0() {
        return this.f1235OooO0oO;
    }

    @Override // Oooo0oo.o0O00o00.OooO0O0
    public final int OooO0OO() {
        return this.f1232OooO0Oo;
    }

    @Override // Oooo0oo.o0O00o00.OooO0O0
    public final int OooO0Oo() {
        return this.f1234OooO0o0;
    }

    @Override // Oooo0oo.o0O00o00.OooO0O0
    public final Size OooO0o() {
        return this.f1231OooO0OO;
    }

    @Override // Oooo0oo.o0O00o00.OooO0O0
    @NonNull
    public final o000O0o<o0OO000> OooO0o0() {
        return this.f1236OooO0oo;
    }

    @Override // Oooo0oo.o0O00o00.OooO0O0
    public final boolean OooO0oO() {
        return this.f1233OooO0o;
    }

    public final boolean equals(Object obj) {
        o00O0 o00o1;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O00o00.OooO0O0)) {
            return false;
        }
        o0O00o00.OooO0O0 oooO0O0 = (o0O00o00.OooO0O0) obj;
        return this.f1231OooO0OO.equals(oooO0O0.OooO0o()) && this.f1232OooO0Oo == oooO0O0.OooO0OO() && this.f1234OooO0o0 == oooO0O0.OooO0Oo() && this.f1233OooO0o == oooO0O0.OooO0oO() && ((o00o1 = this.f1235OooO0oO) != null ? o00o1.equals(oooO0O0.OooO0O0()) : oooO0O0.OooO0O0() == null) && this.f1236OooO0oo.equals(oooO0O0.OooO0o0()) && this.f1230OooO.equals(oooO0O0.OooO00o());
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f1231OooO0OO.hashCode() ^ 1000003) * 1000003) ^ this.f1232OooO0Oo) * 1000003) ^ this.f1234OooO0o0) * 1000003) ^ (this.f1233OooO0o ? 1231 : 1237)) * 1000003;
        o00O0 o00o1 = this.f1235OooO0oO;
        return ((((iHashCode ^ (o00o1 == null ? 0 : o00o1.hashCode())) * 1000003) ^ this.f1236OooO0oo.hashCode()) * 1000003) ^ this.f1230OooO.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f1231OooO0OO + ", inputFormat=" + this.f1232OooO0Oo + ", outputFormat=" + this.f1234OooO0o0 + ", virtualCamera=" + this.f1233OooO0o + ", imageReaderProxyProvider=" + this.f1235OooO0oO + ", requestEdge=" + this.f1236OooO0oo + ", errorEdge=" + this.f1230OooO + "}";
    }
}
