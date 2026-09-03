package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOo f26943OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f26944OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f26945OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00O0O f26946OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f26947OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOOOO f26948OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26949OooO0oO;

    public static final class OooO00o extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f26950Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            OooOOOO oooOOOOOooO0OO;
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            OooOo oooOoOooO0Oo = o00Oo0.OooO0Oo(it);
            return Boolean.valueOf((oooOoOooO0Oo == null || (oooOOOOOooO0OO = oooOoOooO0Oo.OooO0OO()) == null || !oooOOOOOooO0OO.f26935Oooo0oO) ? false : true);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f26951Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(o00Oo0.OooO0Oo(it) != null);
        }
    }

    public o00O0O(@NotNull OooOo outerSemanticsEntity, boolean z) {
        Intrinsics.checkNotNullParameter(outerSemanticsEntity, "outerSemanticsEntity");
        this.f26943OooO00o = outerSemanticsEntity;
        this.f26944OooO0O0 = z;
        this.f26948OooO0o0 = outerSemanticsEntity.OooO0OO();
        this.f26947OooO0o = ((Oooo000) outerSemanticsEntity.f26653Oooo0oO).getId();
        this.f26949OooO0oO = outerSemanticsEntity.f26652Oooo0o.f26702OoooO00;
    }

    public static List OooO0O0(o00O0O o00o0o2, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        List<o00O0O> listOooOO0O = o00o0o2.OooOO0O(z, false);
        int size = listOooOO0O.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00O0O o00o0o3 = listOooOO0O.get(i2);
            if (o00o0o3.OooO()) {
                list.add(o00o0o3);
            } else if (!o00o0o3.f26948OooO0o0.f26936Oooo0oo) {
                OooO0O0(o00o0o3, list, false, 2);
            }
        }
        return list;
    }

    public final boolean OooO() {
        return this.f26944OooO0O0 && this.f26948OooO0o0.f26935Oooo0oO;
    }

    public final o00O0O OooO00o(OooOO0O oooOO0O, Function1<? super o0OO00O, Unit> function1) {
        int i;
        int i2;
        o000000.OooOOO oooOOO = new LayoutNode(true).f6165o00Ooo;
        if (oooOO0O != null) {
            i = this.f26947OooO0o;
            i2 = 1000000000;
        } else {
            i = this.f26947OooO0o;
            i2 = 2000000000;
        }
        o00O0O o00o0o2 = new o00O0O(new OooOo(oooOOO, new Oooo0(i + i2, false, function1)), false);
        o00o0o2.f26945OooO0OO = true;
        o00o0o2.f26946OooO0Oo = this;
        return o00o0o2;
    }

    @NotNull
    public final o000000.oo000o OooO0OO() {
        if (!this.f26948OooO0o0.f26935Oooo0oO) {
            return this.f26943OooO00o.f26652Oooo0o;
        }
        OooOo oooOoOooO0OO = o00Oo0.OooO0OO(this.f26949OooO0oO);
        if (oooOoOooO0OO == null) {
            oooOoOooO0OO = this.f26943OooO00o;
        }
        return oooOoOooO0OO.f26652Oooo0o;
    }

    @NotNull
    public final o00O0O.OooOO0O OooO0Oo() {
        return !this.f26949OooO0oO.OooOoo0() ? o00O0O.OooOO0O.f30402OooO0o : o0O0O00.Oooo0.OooO0O0(OooO0OO());
    }

    @NotNull
    public final OooOOOO OooO0o() {
        if (!OooO()) {
            return this.f26948OooO0o0;
        }
        OooOOOO oooOOOOOooO0OO = this.f26948OooO0o0.OooO0OO();
        OooOO0(oooOOOOOooO0OO);
        return oooOOOOOooO0OO;
    }

    public final List OooO0o0(boolean z) {
        if (this.f26948OooO0o0.f26936Oooo0oo) {
            return CollectionsKt.emptyList();
        }
        return OooO() ? OooO0O0(this, null, z, 1) : OooOO0O(z, true);
    }

    @Nullable
    public final o00O0O OooO0oO() {
        o00O0O o00o0o2 = this.f26946OooO0Oo;
        if (o00o0o2 != null) {
            return o00o0o2;
        }
        LayoutNode layoutNodeOooO00o = this.f26944OooO0O0 ? o00Oo0.OooO00o(this.f26949OooO0oO, OooO00o.f26950Oooo0o) : null;
        if (layoutNodeOooO00o == null) {
            layoutNodeOooO00o = o00Oo0.OooO00o(this.f26949OooO0oO, OooO0O0.f26951Oooo0o);
        }
        OooOo oooOoOooO0Oo = layoutNodeOooO00o != null ? o00Oo0.OooO0Oo(layoutNodeOooO00o) : null;
        if (oooOoOooO0Oo == null) {
            return null;
        }
        return new o00O0O(oooOoOooO0Oo, this.f26944OooO0O0);
    }

    public final long OooO0oo() {
        if (this.f26949OooO0oO.OooOoo0()) {
            return o0O0O00.Oooo0.OooO0o0(OooO0OO());
        }
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        return o00O0O.OooO.f30392OooO0OO;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOO0(OooOOOO oooOOOO) {
        if (this.f26948OooO0o0.f26936Oooo0oo) {
            return;
        }
        List<o00O0O> listOooOO0O = OooOO0O(false, false);
        int size = listOooOO0O.size();
        for (int i = 0; i < size; i++) {
            o00O0O o00o0o2 = listOooOO0O.get(i);
            if (!o00o0o2.OooO()) {
                OooOOOO child = o00o0o2.f26948OooO0o0;
                Intrinsics.checkNotNullParameter(child, "child");
                for (Map.Entry<o0Oo0oo<?>, Object> entry : child.f26934Oooo0o.entrySet()) {
                    o0Oo0oo<?> key = entry.getKey();
                    Object value = entry.getValue();
                    Object objInvoke = key.f26958OooO0O0.invoke((T) oooOOOO.f26934Oooo0o.get(key), (T) value);
                    if (objInvoke != null) {
                        oooOOOO.f26934Oooo0o.put(key, objInvoke);
                    }
                }
                o00o0o2.OooOO0(oooOOOO);
            }
        }
    }

    @NotNull
    public final List<o00O0O> OooOO0O(boolean z, boolean z2) {
        ArrayList arrayList;
        if (this.f26945OooO0OO) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            LayoutNode layoutNode = this.f26949OooO0oO;
            arrayList = new ArrayList();
            oo0o0Oo.OooO0O0(layoutNode, arrayList);
        } else {
            LayoutNode layoutNode2 = this.f26949OooO0oO;
            arrayList = new ArrayList();
            o00Oo0.OooO0O0(layoutNode2, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new o00O0O((OooOo) arrayList.get(i), this.f26944OooO0O0));
        }
        if (z2) {
            OooOOOO oooOOOO = this.f26948OooO0o0;
            oo000o oo000oVar = oo000o.f26973OooO00o;
            OooOO0O oooOO0O = (OooOO0O) OooOo00.OooO00o(oooOOOO, oo000o.f26988OooOOo);
            if (oooOO0O != null && this.f26948OooO0o0.f26935Oooo0oO && (!arrayList2.isEmpty())) {
                arrayList2.add(OooO00o(oooOO0O, new o000oOoO(oooOO0O)));
            }
            OooOOOO oooOOOO2 = this.f26948OooO0o0;
            o0Oo0oo<List<String>> o0oo0oo2 = oo000o.f26974OooO0O0;
            if (oooOOOO2.OooO0O0(o0oo0oo2) && (!arrayList2.isEmpty())) {
                OooOOOO oooOOOO3 = this.f26948OooO0o0;
                if (oooOOOO3.f26935Oooo0oO) {
                    List list = (List) OooOo00.OooO00o(oooOOOO3, o0oo0oo2);
                    String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                    if (str != null) {
                        arrayList2.add(0, OooO00o(null, new o0OoOo0(str)));
                    }
                }
            }
        }
        return arrayList2;
    }
}
