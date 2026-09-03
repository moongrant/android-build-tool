package p023Oooo00O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000O0O0<T> implements o0000O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0<T> f1067OooO00o;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f1068OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o0000oo f1069OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Object obj) {
            o0000O0.OooO00o easing = o0000O0.OooO00o.f1052OooO00o;
            Intrinsics.checkNotNullParameter(easing, "easing");
            this.f1068OooO00o = obj;
            this.f1069OooO0O0 = easing;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                if (Intrinsics.areEqual(oooO00o.f1068OooO00o, this.f1068OooO00o) && Intrinsics.areEqual(oooO00o.f1069OooO0O0, this.f1069OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            T t = this.f1068OooO00o;
            return this.f1069OooO0O0.hashCode() + ((t != null ? t.hashCode() : 0) * 31);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f1070OooO00o = ShopVehicleListModel.VehicleTagType_Vip300;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Map<Integer, OooO00o<T>> f1071OooO0O0 = new LinkedHashMap();

        @NotNull
        public final OooO00o<T> OooO00o(T t, int i) {
            OooO00o<T> oooO00o = new OooO00o<>(t);
            this.f1071OooO0O0.put(Integer.valueOf(i), oooO00o);
            return oooO00o;
        }

        public final void OooO0O0(@NotNull OooO00o<T> oooO00o, @NotNull o0000oo easing) {
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(easing, "easing");
            Intrinsics.checkNotNullParameter(easing, "<set-?>");
            oooO00o.f1069OooO0O0 = easing;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO0O0) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                Objects.requireNonNull(oooO0O0);
                if (this.f1070OooO00o == oooO0O0.f1070OooO00o && Intrinsics.areEqual(this.f1071OooO0O0, oooO0O0.f1071OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f1071OooO0O0.hashCode() + (((this.f1070OooO00o * 31) + 0) * 31);
        }
    }

    public o000O0O0(@NotNull OooO0O0<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f1067OooO00o = config;
    }

    @Override // p023Oooo00O.o0000O00, p023Oooo00O.oo000o
    @NotNull
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final <V extends o0O0O00> o0oOOo<V> OooO00o(@NotNull o00OO0O0<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        Map<Integer, OooO00o<T>> map = this.f1067OooO00o.f1071OooO0O0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            OooO00o oooO00o = (OooO00o) entry.getValue();
            Function1<T, V> convertToVector = converter.OooO00o();
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
            linkedHashMap.put(key, TuplesKt.to(convertToVector.invoke(oooO00o.f1068OooO00o), oooO00o.f1069OooO0O0));
        }
        return new o0oOOo<>(linkedHashMap, this.f1067OooO00o.f1070OooO00o);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o000O0O0) && Intrinsics.areEqual(this.f1067OooO00o, ((o000O0O0) obj).f1067OooO00o);
    }

    public final int hashCode() {
        return this.f1067OooO00o.hashCode();
    }
}
