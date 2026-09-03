package p089o000o000;

import androidx.paging.LoadType;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000O0O<T> {

    public static final class OooO00o<T> extends o0000O0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final LoadType f28733OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f28734OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f28735OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f28736OooO0Oo;

        public OooO00o(@NotNull LoadType loadType, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            this.f28733OooO00o = loadType;
            this.f28734OooO0O0 = i;
            this.f28735OooO0OO = i2;
            this.f28736OooO0Oo = i3;
            if (!(loadType != LoadType.REFRESH)) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (OooO00o() > 0) {
                if (!(i3 >= 0)) {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid placeholdersRemaining ", i3).toString());
                }
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Drop count must be > 0, but was ");
                sbOooO0o0.append(OooO00o());
                throw new IllegalArgumentException(sbOooO0o0.toString().toString());
            }
        }

        public final int OooO00o() {
            return (this.f28735OooO0OO - this.f28734OooO0O0) + 1;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f28733OooO00o == oooO00o.f28733OooO00o && this.f28734OooO0O0 == oooO00o.f28734OooO0O0 && this.f28735OooO0OO == oooO00o.f28735OooO0OO && this.f28736OooO0Oo == oooO00o.f28736OooO0Oo;
        }

        public final int hashCode() {
            return (((((this.f28733OooO00o.hashCode() * 31) + this.f28734OooO0O0) * 31) + this.f28735OooO0OO) * 31) + this.f28736OooO0Oo;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Drop(loadType=");
            sbOooO0o0.append(this.f28733OooO00o);
            sbOooO0o0.append(", minPageOffset=");
            sbOooO0o0.append(this.f28734OooO0O0);
            sbOooO0o0.append(", maxPageOffset=");
            sbOooO0o0.append(this.f28735OooO0OO);
            sbOooO0o0.append(", placeholdersRemaining=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f28736OooO0Oo, ')');
        }
    }

    public static final class OooO0O0<T> extends o0000O0O<T> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public static final OooO00o f28737OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public static final OooO0O0<Object> f28738OooO0oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final LoadType f28739OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<o00O<T>> f28740OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f28741OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f28742OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final o000000O f28743OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final o000000O f28744OooO0o0;

        public static final class OooO00o {
            @NotNull
            public final <T> OooO0O0<T> OooO00o(@NotNull List<o00O<T>> pages, int i, int i2, @NotNull o000000O sourceLoadStates, @Nullable o000000O o000000o2) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new OooO0O0<>(LoadType.REFRESH, pages, i, i2, sourceLoadStates, o000000o2);
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            f28737OooO0oO = oooO00o;
            o00O.OooO00o oooO00o2 = o00O.f28896OooO0o0;
            List<o00O<T>> listListOf = CollectionsKt.listOf(o00O.f28895OooO0o);
            o000000.OooO0OO oooO0OO = o000000.OooO0OO.f28699OooO0OO;
            o000000.OooO0OO oooO0OO2 = o000000.OooO0OO.f28698OooO0O0;
            f28738OooO0oo = oooO00o.OooO00o(listListOf, 0, 0, new o000000O(oooO0OO, oooO0OO2, oooO0OO2), null);
        }

        public OooO0O0(LoadType loadType, List<o00O<T>> list, int i, int i2, o000000O o000000o2, o000000O o000000o3) {
            this.f28739OooO00o = loadType;
            this.f28740OooO0O0 = list;
            this.f28741OooO0OO = i;
            this.f28742OooO0Oo = i2;
            this.f28744OooO0o0 = o000000o2;
            this.f28743OooO0o = o000000o3;
            if (!(loadType == LoadType.APPEND || i >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Prepend insert defining placeholdersBefore must be > 0, but was ", i).toString());
            }
            if (!(loadType == LoadType.PREPEND || i2 >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Append insert defining placeholdersAfter must be > 0, but was ", i2).toString());
            }
            if (!(loadType != LoadType.REFRESH || (list.isEmpty() ^ true))) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f28739OooO00o == oooO0O0.f28739OooO00o && Intrinsics.areEqual(this.f28740OooO0O0, oooO0O0.f28740OooO0O0) && this.f28741OooO0OO == oooO0O0.f28741OooO0OO && this.f28742OooO0Oo == oooO0O0.f28742OooO0Oo && Intrinsics.areEqual(this.f28744OooO0o0, oooO0O0.f28744OooO0o0) && Intrinsics.areEqual(this.f28743OooO0o, oooO0O0.f28743OooO0o);
        }

        public final int hashCode() {
            int iHashCode = (this.f28744OooO0o0.hashCode() + ((((((this.f28740OooO0O0.hashCode() + (this.f28739OooO00o.hashCode() * 31)) * 31) + this.f28741OooO0OO) * 31) + this.f28742OooO0Oo) * 31)) * 31;
            o000000O o000000o2 = this.f28743OooO0o;
            return iHashCode + (o000000o2 == null ? 0 : o000000o2.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Insert(loadType=");
            sbOooO0o0.append(this.f28739OooO00o);
            sbOooO0o0.append(", pages=");
            sbOooO0o0.append(this.f28740OooO0O0);
            sbOooO0o0.append(", placeholdersBefore=");
            sbOooO0o0.append(this.f28741OooO0OO);
            sbOooO0o0.append(", placeholdersAfter=");
            sbOooO0o0.append(this.f28742OooO0Oo);
            sbOooO0o0.append(", sourceLoadStates=");
            sbOooO0o0.append(this.f28744OooO0o0);
            sbOooO0o0.append(", mediatorLoadStates=");
            sbOooO0o0.append(this.f28743OooO0o);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }

    public static final class OooO0OO<T> extends o0000O0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000000O f28745OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o000000O f28746OooO0O0;

        public OooO0OO(@NotNull o000000O source, @Nullable o000000O o000000o2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f28745OooO00o = source;
            this.f28746OooO0O0 = o000000o2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return Intrinsics.areEqual(this.f28745OooO00o, oooO0OO.f28745OooO00o) && Intrinsics.areEqual(this.f28746OooO0O0, oooO0OO.f28746OooO0O0);
        }

        public final int hashCode() {
            int iHashCode = this.f28745OooO00o.hashCode() * 31;
            o000000O o000000o2 = this.f28746OooO0O0;
            return iHashCode + (o000000o2 == null ? 0 : o000000o2.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LoadStateUpdate(source=");
            sbOooO0o0.append(this.f28745OooO00o);
            sbOooO0o0.append(", mediator=");
            sbOooO0o0.append(this.f28746OooO0O0);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }

    public static final class OooO0o<T> extends o0000O0O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<T> f28747OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o000000O f28748OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final o000000O f28749OooO0OO;

        public OooO0o(@NotNull List data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f28747OooO00o = data;
            this.f28748OooO0O0 = null;
            this.f28749OooO0OO = null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return Intrinsics.areEqual(this.f28747OooO00o, oooO0o.f28747OooO00o) && Intrinsics.areEqual(this.f28748OooO0O0, oooO0o.f28748OooO0O0) && Intrinsics.areEqual(this.f28749OooO0OO, oooO0o.f28749OooO0OO);
        }

        public final int hashCode() {
            int iHashCode = this.f28747OooO00o.hashCode() * 31;
            o000000O o000000o2 = this.f28748OooO0O0;
            int iHashCode2 = (iHashCode + (o000000o2 == null ? 0 : o000000o2.hashCode())) * 31;
            o000000O o000000o3 = this.f28749OooO0OO;
            return iHashCode2 + (o000000o3 != null ? o000000o3.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("StaticList(data=");
            sbOooO0o0.append(this.f28747OooO00o);
            sbOooO0o0.append(", sourceLoadStates=");
            sbOooO0o0.append(this.f28748OooO0O0);
            sbOooO0o0.append(", mediatorLoadStates=");
            sbOooO0o0.append(this.f28749OooO0OO);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }
}
