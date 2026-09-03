package p059o0000Ooo;

import java.util.Map;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public int[] f27665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public Object[] f27666OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27667OooO0OO;

    @JvmOverloads
    public OooOo00() {
        this(0, 1, null);
    }

    public OooOo00(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f27665OooO00o = OooOOO.f27657OooO00o;
        this.f27666OooO0O0 = OooOOO.f27658OooO0O0;
        this.f27667OooO0OO = 0;
    }

    @Nullable
    public final V OooO00o(K k) {
        int iOooO0OO = k == null ? OooO0OO() : OooO0O0(k, k.hashCode());
        if (iOooO0OO >= 0) {
            return (V) this.f27666OooO0O0[(iOooO0OO << 1) + 1];
        }
        return null;
    }

    public final int OooO0O0(@NotNull Object key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i2 = this.f27667OooO0OO;
        if (i2 == 0) {
            return -1;
        }
        int iOooO00o = OooOOO.OooO00o(this.f27665OooO00o, i2, i);
        if (iOooO00o < 0 || Intrinsics.areEqual(key, this.f27666OooO0O0[iOooO00o << 1])) {
            return iOooO00o;
        }
        int i3 = iOooO00o + 1;
        while (i3 < i2 && this.f27665OooO00o[i3] == i) {
            if (Intrinsics.areEqual(key, this.f27666OooO0O0[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iOooO00o - 1; i4 >= 0 && this.f27665OooO00o[i4] == i; i4--) {
            if (Intrinsics.areEqual(key, this.f27666OooO0O0[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int OooO0OO() {
        int i = this.f27667OooO0OO;
        if (i == 0) {
            return -1;
        }
        int iOooO00o = OooOOO.OooO00o(this.f27665OooO00o, i, 0);
        if (iOooO00o < 0 || this.f27666OooO0O0[iOooO00o << 1] == null) {
            return iOooO00o;
        }
        int i2 = iOooO00o + 1;
        while (i2 < i && this.f27665OooO00o[i2] == 0) {
            if (this.f27666OooO0O0[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iOooO00o - 1; i3 >= 0 && this.f27665OooO00o[i3] == 0; i3--) {
            if (this.f27666OooO0O0[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final K OooO0Oo(int i) {
        return (K) this.f27666OooO0O0[i << 1];
    }

    public final V OooO0o0(int i) {
        return (V) this.f27666OooO0O0[(i << 1) + 1];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof OooOo00) {
                OooOo00 oooOo00 = (OooOo00) obj;
                int i = this.f27667OooO0OO;
                if (i != oooOo00.f27667OooO0OO) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K kOooO0Oo = OooO0Oo(i2);
                    V vOooO0o0 = OooO0o0(i2);
                    Object objOooO00o = oooOo00.OooO00o(kOooO0Oo);
                    if (vOooO0o0 == null) {
                        if (objOooO00o == null) {
                            if (!((kOooO0Oo == null ? oooOo00.OooO0OO() : oooOo00.OooO0O0(kOooO0Oo, kOooO0Oo.hashCode())) >= 0)) {
                            }
                        }
                        return false;
                    }
                    if (!Intrinsics.areEqual(vOooO0o0, objOooO00o)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f27667OooO0OO != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f27667OooO0OO;
            for (int i4 = 0; i4 < i3; i4++) {
                K kOooO0Oo2 = OooO0Oo(i4);
                V vOooO0o1 = OooO0o0(i4);
                Object obj2 = ((Map) obj).get(kOooO0Oo2);
                if (vOooO0o1 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(kOooO0Oo2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(vOooO0o1, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f27665OooO00o;
        Object[] objArr = this.f27666OooO0O0;
        int i = this.f27667OooO0OO;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    @NotNull
    public final String toString() {
        int i = this.f27667OooO0OO;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f27667OooO0OO;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            K kOooO0Oo = OooO0Oo(i3);
            if (kOooO0Oo != this) {
                sb.append(kOooO0Oo);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vOooO0o0 = OooO0o0(i3);
            if (vOooO0o0 != this) {
                sb.append(vOooO0o0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }
}
