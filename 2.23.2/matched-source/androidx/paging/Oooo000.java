package androidx.paging;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Oooo000<T> {

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Drop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
    public static final class OooO00o<T> extends Oooo000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final LoadType f10281OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f10282OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f10283OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f10284OooO0Oo;

        /* JADX INFO: renamed from: androidx.paging.Oooo000$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0172OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[LoadType.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadType.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OooO00o(@NotNull LoadType loadType, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            this.f10281OooO00o = loadType;
            this.f10282OooO0O0 = i;
            this.f10283OooO0OO = i2;
            this.f10284OooO0Oo = i3;
            if (!(loadType != LoadType.REFRESH)) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (OooO00o() > 0) {
                if (!(i3 >= 0)) {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid placeholdersRemaining ", i3).toString());
                }
            } else {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + OooO00o()).toString());
            }
        }

        public final int OooO00o() {
            return (this.f10283OooO0OO - this.f10282OooO0O0) + 1;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f10281OooO00o == oooO00o.f10281OooO00o && this.f10282OooO0O0 == oooO00o.f10282OooO0O0 && this.f10283OooO0OO == oooO00o.f10283OooO0OO && this.f10284OooO0Oo == oooO00o.f10284OooO0Oo;
        }

        public final int hashCode() {
            return (((((this.f10281OooO00o.hashCode() * 31) + this.f10282OooO0O0) * 31) + this.f10283OooO0OO) * 31) + this.f10284OooO0Oo;
        }

        @NotNull
        public final String toString() {
            String str;
            int i = C0172OooO00o.$EnumSwitchMapping$0[this.f10281OooO00o.ordinal()];
            if (i == 1) {
                str = "end";
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
            sbOooO0O0.append(this.f10282OooO0O0);
            sbOooO0O0.append("\n                    |   maxPageOffset: ");
            sbOooO0O0.append(this.f10283OooO0OO);
            sbOooO0O0.append("\n                    |   placeholdersRemaining: ");
            sbOooO0O0.append(this.f10284OooO0Oo);
            sbOooO0O0.append("\n                    |)");
            return StringsKt__IndentKt.trimMargin$default(sbOooO0O0.toString(), null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n116#1,3:319\n119#1,5:326\n112#1,7:331\n119#1,5:346\n112#1,7:351\n119#1,5:365\n112#1,7:370\n119#1,5:384\n1549#2:322\n1620#2,3:323\n1549#2:338\n1620#2,2:339\n1549#2:341\n1620#2,3:342\n1622#2:345\n1549#2:358\n1620#2,2:359\n1864#2,3:361\n1622#2:364\n1549#2:377\n1620#2,2:378\n1864#2,3:380\n1622#2:383\n1789#2,3:389\n27#3,5:392\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n*L\n112#1:319,3\n112#1:326,5\n125#1:331,7\n125#1:346,5\n136#1:351,7\n136#1:365,5\n154#1:370,7\n154#1:384,5\n112#1:322\n112#1:323,3\n125#1:338\n125#1:339,2\n128#1:341\n128#1:342,3\n125#1:345\n136#1:358\n136#1:359,2\n139#1:361,3\n136#1:364\n154#1:377\n154#1:378,2\n157#1:380,3\n154#1:383\n233#1:389,3\n236#1:392,5\n*E\n"})
    public static final class OooO0O0<T> extends Oooo000<T> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public static final OooO0O0<Object> f10285OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final LoadType f10286OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<o000000O<T>> f10287OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f10288OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f10289OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final OooOOO f10290OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final OooOOO f10291OooO0o0;

        public static final class OooO00o {
            @NotNull
            public static OooO0O0 OooO00o(@NotNull List pages, int i, int i2, @NotNull OooOOO sourceLoadStates, @Nullable OooOOO oooOOO) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new OooO0O0(LoadType.REFRESH, pages, i, i2, sourceLoadStates, oooOOO);
            }
        }

        static {
            List listListOf = CollectionsKt.listOf(o000000O.f10376OooO0o0);
            OooOOO0.OooO0OO oooO0OO = OooOOO0.OooO0OO.f10261OooO0OO;
            OooOOO0.OooO0OO oooO0OO2 = OooOOO0.OooO0OO.f10260OooO0O0;
            f10285OooO0oO = OooO00o.OooO00o(listListOf, 0, 0, new OooOOO(oooO0OO, oooO0OO2, oooO0OO2), null);
        }

        public /* synthetic */ OooO0O0() {
            throw null;
        }

        public OooO0O0(LoadType loadType, List<o000000O<T>> list, int i, int i2, OooOOO oooOOO, OooOOO oooOOO2) {
            this.f10286OooO00o = loadType;
            this.f10287OooO0O0 = list;
            this.f10288OooO0OO = i;
            this.f10289OooO0Oo = i2;
            this.f10291OooO0o0 = oooOOO;
            this.f10290OooO0o = oooOOO2;
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
            return this.f10286OooO00o == oooO0O0.f10286OooO00o && Intrinsics.areEqual(this.f10287OooO0O0, oooO0O0.f10287OooO0O0) && this.f10288OooO0OO == oooO0O0.f10288OooO0OO && this.f10289OooO0Oo == oooO0O0.f10289OooO0Oo && Intrinsics.areEqual(this.f10291OooO0o0, oooO0O0.f10291OooO0o0) && Intrinsics.areEqual(this.f10290OooO0o, oooO0O0.f10290OooO0o);
        }

        public final int hashCode() {
            int iHashCode = (this.f10291OooO0o0.hashCode() + ((((((this.f10287OooO0O0.hashCode() + (this.f10286OooO00o.hashCode() * 31)) * 31) + this.f10288OooO0OO) * 31) + this.f10289OooO0Oo) * 31)) * 31;
            OooOOO oooOOO = this.f10290OooO0o;
            return iHashCode + (oooOOO == null ? 0 : oooOOO.hashCode());
        }

        @NotNull
        public final String toString() {
            List<T> list;
            List<T> list2;
            List<o000000O<T>> list3 = this.f10287OooO0O0;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((o000000O) it.next()).f10378OooO0O0.size();
            }
            int i = this.f10288OooO0OO;
            String strValueOf = i != -1 ? String.valueOf(i) : "none";
            int i2 = this.f10289OooO0Oo;
            String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.f10286OooO00o);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            o000000O o000000o2 = (o000000O) CollectionsKt.firstOrNull((List) list3);
            Object objLastOrNull = null;
            sb.append((o000000o2 == null || (list2 = o000000o2.f10378OooO0O0) == null) ? null : CollectionsKt.firstOrNull((List) list2));
            sb.append("\n                    |   last item: ");
            o000000O o000000o3 = (o000000O) CollectionsKt.lastOrNull((List) list3);
            if (o000000o3 != null && (list = o000000o3.f10378OooO0O0) != null) {
                objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
            }
            sb.append(objLastOrNull);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.f10291OooO0o0);
            sb.append("\n                    ");
            String string = sb.toString();
            OooOOO oooOOO = this.f10290OooO0o;
            if (oooOOO != null) {
                string = string + "|   mediatorLoadStates: " + oooOOO + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(string + "|)", null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n+ 2 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n27#2,5:319\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n*L\n300#1:319,5\n*E\n"})
    public static final class OooO0OO<T> extends Oooo000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooOOO f10292OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooOOO f10293OooO0O0;

        public OooO0OO(@NotNull OooOOO source, @Nullable OooOOO oooOOO) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f10292OooO00o = source;
            this.f10293OooO0O0 = oooOOO;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return Intrinsics.areEqual(this.f10292OooO00o, oooO0OO.f10292OooO00o) && Intrinsics.areEqual(this.f10293OooO0O0, oooO0OO.f10293OooO0O0);
        }

        public final int hashCode() {
            int iHashCode = this.f10292OooO00o.hashCode() * 31;
            OooOOO oooOOO = this.f10293OooO0O0;
            return iHashCode + (oooOOO == null ? 0 : oooOOO.hashCode());
        }

        @NotNull
        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f10292OooO00o + "\n                    ";
            OooOOO oooOOO = this.f10293OooO0O0;
            if (oooOOO != null) {
                str = str + "|   mediatorLoadStates: " + oooOOO + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(str + "|)", null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n1549#2:319\n1620#2,3:320\n1360#2:323\n1446#2,5:324\n766#2:329\n857#2,2:330\n27#3,5:332\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n*L\n48#1:319\n48#1:320,3\n58#1:323\n58#1:324,5\n66#1:329\n66#1:330,2\n73#1:332,5\n*E\n"})
    public static final class OooO0o<T> extends Oooo000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<T> f10294OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooOOO f10295OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final OooOOO f10296OooO0OO;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(@NotNull List<? extends T> data, @Nullable OooOOO oooOOO, @Nullable OooOOO oooOOO2) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f10294OooO00o = data;
            this.f10295OooO0O0 = oooOOO;
            this.f10296OooO0OO = oooOOO2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return Intrinsics.areEqual(this.f10294OooO00o, oooO0o.f10294OooO00o) && Intrinsics.areEqual(this.f10295OooO0O0, oooO0o.f10295OooO0O0) && Intrinsics.areEqual(this.f10296OooO0OO, oooO0o.f10296OooO0OO);
        }

        public final int hashCode() {
            int iHashCode = this.f10294OooO00o.hashCode() * 31;
            OooOOO oooOOO = this.f10295OooO0O0;
            int iHashCode2 = (iHashCode + (oooOOO == null ? 0 : oooOOO.hashCode())) * 31;
            OooOOO oooOOO2 = this.f10296OooO0OO;
            return iHashCode2 + (oooOOO2 != null ? oooOOO2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
            List<T> list = this.f10294OooO00o;
            sb.append(list.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(CollectionsKt.firstOrNull((List) list));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.lastOrNull((List) list));
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.f10295OooO0O0);
            sb.append("\n                    ");
            String string = sb.toString();
            OooOOO oooOOO = this.f10296OooO0OO;
            if (oooOOO != null) {
                string = string + "|   mediatorLoadStates: " + oooOOO + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(string + "|)", null, 1, null);
        }
    }
}
