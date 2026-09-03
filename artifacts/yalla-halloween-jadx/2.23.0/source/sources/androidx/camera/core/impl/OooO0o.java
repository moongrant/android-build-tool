package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<T> extends Config.OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f3566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Class<T> f3567OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f3568OooO0OO;

    public OooO0o(String str, Class<T> cls, @Nullable Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f3566OooO00o = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f3567OooO0O0 = cls;
        this.f3568OooO0OO = obj;
    }

    @Override // androidx.camera.core.impl.Config.OooO00o
    @NonNull
    public final String OooO0O0() {
        return this.f3566OooO00o;
    }

    @Override // androidx.camera.core.impl.Config.OooO00o
    @Nullable
    public final Object OooO0OO() {
        return this.f3568OooO0OO;
    }

    @Override // androidx.camera.core.impl.Config.OooO00o
    @NonNull
    public final Class<T> OooO0Oo() {
        return this.f3567OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.OooO00o)) {
            return false;
        }
        Config.OooO00o oooO00o = (Config.OooO00o) obj;
        if (this.f3566OooO00o.equals(oooO00o.OooO0O0()) && this.f3567OooO0O0.equals(oooO00o.OooO0Oo())) {
            Object obj2 = this.f3568OooO0OO;
            if (obj2 == null) {
                if (oooO00o.OooO0OO() == null) {
                    return true;
                }
            } else if (obj2.equals(oooO00o.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f3566OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3567OooO0O0.hashCode()) * 1000003;
        Object obj = this.f3568OooO0OO;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f3566OooO00o + ", valueClass=" + this.f3567OooO0O0 + ", token=" + this.f3568OooO0OO + "}";
    }
}
