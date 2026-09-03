package p097o000o0oO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import p101o000oo.o00oO0o;
import p103o000oo00.o000oOoO;
import p105o000oo0o.o00O0OO0;
import p106o000ooO.OooOo00;
import p107o000ooO0.oo0o0Oo;
import p321o0O0ooO.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00oO0o> f35395OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Pair<OooOo00<? extends Object, ? extends Object>, Class<? extends Object>>> f35396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<Pair<oo0o0Oo<? extends Object>, Class<? extends Object>>> f35397OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<Pair<o00O0OO0.OooO00o<? extends Object>, Class<? extends Object>>> f35398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<o000oOoO.OooO00o> f35399OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000O0(List<? extends o00oO0o> list, List<? extends Pair<? extends OooOo00<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends oo0o0Oo<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends o00O0OO0.OooO00o<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends o000oOoO.OooO00o> list5) {
        this.f35395OooO00o = list;
        this.f35396OooO0O0 = list2;
        this.f35397OooO0OO = list3;
        this.f35398OooO0Oo = list4;
        this.f35399OooO0o0 = list5;
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<o00oO0o> f35400OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<Pair<OooOo00<? extends Object, ?>, Class<? extends Object>>> f35401OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final List<Pair<oo0o0Oo<? extends Object>, Class<? extends Object>>> f35402OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final List<Pair<o00O0OO0.OooO00o<? extends Object>, Class<? extends Object>>> f35403OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final List<o000oOoO.OooO00o> f35404OooO0o0;

        public OooO00o() {
            this.f35400OooO00o = new ArrayList();
            this.f35401OooO0O0 = new ArrayList();
            this.f35402OooO0OO = new ArrayList();
            this.f35403OooO0Oo = new ArrayList();
            this.f35404OooO0o0 = new ArrayList();
        }

        @NotNull
        public final void OooO00o(@NotNull o00O0OO0.OooO00o oooO00o, @NotNull Class cls) {
            this.f35403OooO0Oo.add(TuplesKt.to(oooO00o, cls));
        }

        @NotNull
        public final void OooO0O0(@NotNull OooOo00 oooOo00, @NotNull Class cls) {
            this.f35401OooO0O0.add(TuplesKt.to(oooOo00, cls));
        }

        @NotNull
        public final o0000O0 OooO0OO() {
            return new o0000O0(o000.OooO00o(this.f35400OooO00o), o000.OooO00o(this.f35401OooO0O0), o000.OooO00o(this.f35402OooO0OO), o000.OooO00o(this.f35403OooO0Oo), o000.OooO00o(this.f35404OooO0o0));
        }

        public OooO00o(@NotNull o0000O0 o0000o1) {
            this.f35400OooO00o = CollectionsKt.toMutableList((Collection) o0000o1.f35395OooO00o);
            this.f35401OooO0O0 = CollectionsKt.toMutableList((Collection) o0000o1.f35396OooO0O0);
            this.f35402OooO0OO = CollectionsKt.toMutableList((Collection) o0000o1.f35397OooO0OO);
            this.f35403OooO0Oo = CollectionsKt.toMutableList((Collection) o0000o1.f35398OooO0Oo);
            this.f35404OooO0o0 = CollectionsKt.toMutableList((Collection) o0000o1.f35399OooO0o0);
        }
    }

    public o0000O0() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
