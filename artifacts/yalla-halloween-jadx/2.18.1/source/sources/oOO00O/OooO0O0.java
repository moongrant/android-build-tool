package oOO00O;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00O0O00.OooO0O0> f52969OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Pair<o00O0O0.OooO0O0<? extends Object, ?>, Class<? extends Object>>> f52970OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<Pair<o00O0.OooOO0O<? extends Object>, Class<? extends Object>>> f52971OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<Oooo0> f52972OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<o00O0O00.OooO0O0> f52973OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<Pair<o00O0O0.OooO0O0<? extends Object, ?>, Class<? extends Object>>> f52974OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final List<Pair<o00O0.OooOO0O<? extends Object>, Class<? extends Object>>> f52975OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final List<Oooo0> f52976OooO0Oo;

        public OooO00o(@NotNull OooO0O0 registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f52973OooO00o = CollectionsKt.toMutableList((Collection) registry.f52969OooO00o);
            this.f52974OooO0O0 = CollectionsKt.toMutableList((Collection) registry.f52970OooO0O0);
            this.f52975OooO0OO = CollectionsKt.toMutableList((Collection) registry.f52971OooO0OO);
            this.f52976OooO0Oo = CollectionsKt.toMutableList((Collection) registry.f52972OooO0Oo);
        }

        @NotNull
        public final <T> OooO00o OooO00o(@NotNull o00O0.OooOO0O<T> fetcher, @NotNull Class<T> type) {
            Intrinsics.checkNotNullParameter(fetcher, "fetcher");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f52975OooO0OO.add(TuplesKt.to(fetcher, type));
            return this;
        }

        @NotNull
        public final OooO00o OooO0O0(@NotNull Oooo0 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            this.f52976OooO0Oo.add(decoder);
            return this;
        }

        @NotNull
        public final <T> OooO00o OooO0OO(@NotNull o00O0O0.OooO0O0<T, ?> mapper, @NotNull Class<T> type) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f52974OooO0O0.add(TuplesKt.to(mapper, type));
            return this;
        }

        @NotNull
        public final OooO0O0 OooO0Oo() {
            return new OooO0O0(CollectionsKt.toList(this.f52973OooO00o), CollectionsKt.toList(this.f52974OooO0O0), CollectionsKt.toList(this.f52975OooO0OO), CollectionsKt.toList(this.f52976OooO0Oo), null);
        }
    }

    public OooO0O0(List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f52969OooO00o = list;
        this.f52970OooO0O0 = list2;
        this.f52971OooO0OO = list3;
        this.f52972OooO0Oo = list4;
    }

    public OooO0O0() {
        List<o00O0O00.OooO0O0> listEmptyList = CollectionsKt.emptyList();
        List<Pair<o00O0O0.OooO0O0<? extends Object, ?>, Class<? extends Object>>> listEmptyList2 = CollectionsKt.emptyList();
        List<Pair<o00O0.OooOO0O<? extends Object>, Class<? extends Object>>> listEmptyList3 = CollectionsKt.emptyList();
        List<Oooo0> listEmptyList4 = CollectionsKt.emptyList();
        this.f52969OooO00o = listEmptyList;
        this.f52970OooO0O0 = listEmptyList2;
        this.f52971OooO0OO = listEmptyList3;
        this.f52972OooO0Oo = listEmptyList4;
    }
}
