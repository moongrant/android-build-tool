package p167o00Ooo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f32556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f32557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f32558OooO0OO;

    public OooO(String str, long j, int i) {
        this.f32556OooO00o = str;
        this.f32557OooO0O0 = j;
        this.f32558OooO0OO = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    @NotNull
    public abstract float[] OooO00o(@NotNull float[] fArr);

    public abstract float OooO0O0(int i);

    public abstract float OooO0OO(int i);

    public boolean OooO0Oo() {
        return false;
    }

    @NotNull
    public abstract float[] OooO0o0(@NotNull float[] fArr);

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(getClass()), Reflection.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        OooO oooO = (OooO) obj;
        if (this.f32558OooO0OO == oooO.f32558OooO0OO && Intrinsics.areEqual(this.f32556OooO00o, oooO.f32556OooO00o)) {
            return OooO0o.OooO00o(this.f32557OooO0O0, oooO.f32557OooO0O0);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f32556OooO00o.hashCode() * 31;
        long j = this.f32557OooO0O0;
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f32558OooO0OO;
    }

    @NotNull
    public final String toString() {
        return this.f32556OooO00o + " (id=" + this.f32558OooO0OO + ", model=" + ((Object) OooO0o.OooO0O0(this.f32557OooO0O0)) + ')';
    }
}
