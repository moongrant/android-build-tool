package p023Oooo00O;

import androidx.compose.runtime.Immutable;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00OO00O<T> implements o0000O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1172OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1173OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000oo f1174OooO0OO;

    public o00OO00O() {
        this(0, (o0000oo) null, 7);
    }

    public o00OO00O(int i, int i2, @NotNull o0000oo easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.f1172OooO00o = i;
        this.f1173OooO0O0 = i2;
        this.f1174OooO0OO = easing;
    }

    @Override // p023Oooo00O.oo000o
    public final o00OOO00 OooO00o(o00OO0O0 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new o0(this.f1172OooO00o, this.f1173OooO0O0, this.f1174OooO0OO);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o00OO00O)) {
            return false;
        }
        o00OO00O o00oo00o = (o00OO00O) obj;
        return o00oo00o.f1172OooO00o == this.f1172OooO00o && o00oo00o.f1173OooO0O0 == this.f1173OooO0O0 && Intrinsics.areEqual(o00oo00o.f1174OooO0OO, this.f1174OooO0OO);
    }

    public final int hashCode() {
        return ((this.f1174OooO0OO.hashCode() + (this.f1172OooO00o * 31)) * 31) + this.f1173OooO0O0;
    }

    @Override // p023Oooo00O.o0000O00, p023Oooo00O.oo000o
    public final o00Oo00 OooO00o(o00OO0O0 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new o0(this.f1172OooO00o, this.f1173OooO0O0, this.f1174OooO0OO);
    }

    public o00OO00O(int i, o0000oo easing, int i2) {
        i = (i2 & 1) != 0 ? ShopVehicleListModel.VehicleTagType_Vip300 : i;
        easing = (i2 & 4) != 0 ? o0000O0.f1051OooO00o : easing;
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.f1172OooO00o = i;
        this.f1173OooO0O0 = 0;
        this.f1174OooO0OO = easing;
    }
}
