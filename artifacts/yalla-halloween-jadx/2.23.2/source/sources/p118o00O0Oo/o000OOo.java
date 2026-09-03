package p118o00O0Oo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import o00OO00O.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p122o00O0o.OooO0OO;
import p124o00O0o00.OooOOOO;
import p125o00O0o0O.o0ooOOo;
import p126o00O0o0o.o00000OO;
import p127o00O0oO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00000OO> f36402OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Pair<o0000O<? extends Object, ? extends Object>, Class<? extends Object>>> f36403OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<Pair<OooO0OO<? extends Object>, Class<? extends Object>>> f36404OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<Pair<o0ooOOo.OooO00o<? extends Object>, Class<? extends Object>>> f36405OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<OooOOOO.OooO00o> f36406OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public o000OOo(List<? extends o00000OO> list, List<? extends Pair<? extends o0000O<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends OooO0OO<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends o0ooOOo.OooO00o<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends OooOOOO.OooO00o> list5) {
        this.f36402OooO00o = list;
        this.f36403OooO0O0 = list2;
        this.f36404OooO0OO = list3;
        this.f36405OooO0Oo = list4;
        this.f36406OooO0o0 = list5;
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<o00000OO> f36407OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<Pair<o0000O<? extends Object, ?>, Class<? extends Object>>> f36408OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final List<Pair<OooO0OO<? extends Object>, Class<? extends Object>>> f36409OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final List<Pair<o0ooOOo.OooO00o<? extends Object>, Class<? extends Object>>> f36410OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final List<OooOOOO.OooO00o> f36411OooO0o0;

        public OooO00o() {
            this.f36407OooO00o = new ArrayList();
            this.f36408OooO0O0 = new ArrayList();
            this.f36409OooO0OO = new ArrayList();
            this.f36410OooO0Oo = new ArrayList();
            this.f36411OooO0o0 = new ArrayList();
        }

        @NotNull
        public final void OooO00o(@NotNull o0ooOOo.OooO00o oooO00o, @NotNull Class cls) {
            this.f36410OooO0Oo.add(TuplesKt.to(oooO00o, cls));
        }

        @NotNull
        public final void OooO0O0(@NotNull o0000O o0000o2, @NotNull Class cls) {
            this.f36408OooO0O0.add(TuplesKt.to(o0000o2, cls));
        }

        @NotNull
        public final o000OOo OooO0OO() {
            return new o000OOo(OooO0O0.OooO00o(this.f36407OooO00o), OooO0O0.OooO00o(this.f36408OooO0O0), OooO0O0.OooO00o(this.f36409OooO0OO), OooO0O0.OooO00o(this.f36410OooO0Oo), OooO0O0.OooO00o(this.f36411OooO0o0));
        }

        public OooO00o(@NotNull o000OOo o000ooo2) {
            this.f36407OooO00o = CollectionsKt.toMutableList((Collection) o000ooo2.f36402OooO00o);
            this.f36408OooO0O0 = CollectionsKt.toMutableList((Collection) o000ooo2.f36403OooO0O0);
            this.f36409OooO0OO = CollectionsKt.toMutableList((Collection) o000ooo2.f36404OooO0OO);
            this.f36410OooO0Oo = CollectionsKt.toMutableList((Collection) o000ooo2.f36405OooO0Oo);
            this.f36411OooO0o0 = CollectionsKt.toMutableList((Collection) o000ooo2.f36406OooO0o0);
        }
    }

    public o000OOo() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
