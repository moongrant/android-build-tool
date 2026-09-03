package p053o00000oO;

import androidx.compose.runtime.Immutable;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o0000O00 implements Comparable<o0000O00> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f27124Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27125Oooo0oO = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f27126Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f27127OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f27128OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f27129OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f27130OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f27131OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public static final List<o0000O00> f27132o000oOoO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f27133Oooo0o;

    public static final class OooO00o {
        @NotNull
        public final o0000O00 OooO00o() {
            return o0000O00.f27131OoooOO0;
        }
    }

    static {
        o0000O00 o0000o00 = new o0000O00(100);
        o0000O00 o0000o01 = new o0000O00(200);
        o0000O00 o0000o02 = new o0000O00(ShopVehicleListModel.VehicleTagType_Vip300);
        o0000O00 o0000o03 = new o0000O00(ShopVehicleListModel.VehicleTagType_Vip400);
        o0000O00 o0000o04 = new o0000O00(500);
        f27126Oooo0oo = o0000o04;
        o0000O00 o0000o05 = new o0000O00(600);
        f27124Oooo = o0000o05;
        o0000O00 o0000o06 = new o0000O00(700);
        o0000O00 o0000o07 = new o0000O00(800);
        o0000O00 o0000o08 = new o0000O00(900);
        f27129OoooO00 = o0000o02;
        f27128OoooO0 = o0000o03;
        f27130OoooO0O = o0000o04;
        f27127OoooO = o0000o05;
        f27131OoooOO0 = o0000o06;
        f27132o000oOoO = CollectionsKt.listOf((Object[]) new o0000O00[]{o0000o00, o0000o01, o0000o02, o0000o03, o0000o04, o0000o05, o0000o06, o0000o07, o0000o08});
    }

    public o0000O00(int i) {
        this.f27133Oooo0o = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Font weight can be in range [1, 1000]. Current value: ", i).toString());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull o0000O00 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f27133Oooo0o, other.f27133Oooo0o);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0000O00) && this.f27133Oooo0o == ((o0000O00) obj).f27133Oooo0o;
    }

    public final int hashCode() {
        return this.f27133Oooo0o;
    }

    @NotNull
    public final String toString() {
        return o0O0ooO.OooO00o(OooO00o.OooO00o.OooO0o0("FontWeight(weight="), this.f27133Oooo0o, ')');
    }
}
