package o000000O;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O0.OooO0OO;
import o00000O0.OooOOOO;
import o00000O0.OooOo00;
import o00000O0.o00O0O;
import o00000O0.oo000o;
import o00O0O.OooO;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: o000000O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0281OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0281OooO00o f26738Oooo0o = new C0281OooO00o();

        public C0281OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean OooO00o(List<o00O0O> list) {
        ?? EmptyList;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            EmptyList = CollectionsKt.emptyList();
        } else {
            EmptyList = new ArrayList();
            o00O0O o00o0o2 = list.get(0);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i = 0;
            while (i < lastIndex) {
                i++;
                o00O0O o00o0o3 = list.get(i);
                o00O0O o00o0o4 = o00o0o3;
                o00O0O o00o0o5 = o00o0o2;
                EmptyList.add(new OooO(OooOO0.OooO00o(Math.abs(OooO.OooO0OO(o00o0o5.OooO0Oo().OooO00o()) - OooO.OooO0OO(o00o0o4.OooO0Oo().OooO00o())), Math.abs(OooO.OooO0Oo(o00o0o5.OooO0Oo().OooO00o()) - OooO.OooO0Oo(o00o0o4.OooO0Oo().OooO00o())))));
                o00o0o2 = o00o0o3;
            }
        }
        if (EmptyList.size() == 1) {
            j = ((OooO) CollectionsKt.first((List) EmptyList)).f30395OooO00o;
        } else {
            if (EmptyList.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objFirst = CollectionsKt.first((List<? extends Object>) EmptyList);
            int lastIndex2 = CollectionsKt.getLastIndex(EmptyList);
            if (1 <= lastIndex2) {
                int i2 = 1;
                while (true) {
                    objFirst = new OooO(OooO.OooO0oO(((OooO) objFirst).f30395OooO00o, ((OooO) EmptyList.get(i2)).f30395OooO00o));
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((OooO) objFirst).f30395OooO00o;
        }
        return OooO.OooO0Oo(j) < OooO.OooO0OO(j);
    }

    public static final boolean OooO0O0(@NotNull o00O0O o00o0o2) {
        Intrinsics.checkNotNullParameter(o00o0o2, "<this>");
        OooOOOO oooOOOOOooO0o = o00o0o2.OooO0o();
        oo000o oo000oVar = oo000o.f26973OooO00o;
        return (OooOo00.OooO00o(oooOOOOOooO0o, oo000o.f26979OooO0oO) == null && OooOo00.OooO00o(o00o0o2.OooO0o(), oo000o.f26977OooO0o) == null) ? false : true;
    }

    public static final void OooO0OO(@NotNull o00O0O node, @NotNull o0000OO0 info) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        OooOOOO oooOOOOOooO0o = node.OooO0o();
        oo000o oo000oVar = oo000o.f26973OooO00o;
        if (((OooO0OO) OooOo00.OooO00o(oooOOOOOooO0o, oo000o.f26980OooO0oo)) != null) {
            info.Oooo0(o0000OO0.OooO0OO.OooO00o(0, 0, 0, 0, ((Boolean) node.OooO0o().OooO0oO(oo000o.f26991OooOo, OooO0O0.f26739Oooo0o)).booleanValue()));
        }
        o00O0O o00o0oOooO0oO = node.OooO0oO();
        if (o00o0oOooO0oO == null || OooOo00.OooO00o(o00o0oOooO0oO.OooO0o(), oo000o.f26977OooO0o) == null) {
            return;
        }
        o00000O0.OooO0O0 oooO0O0 = (o00000O0.OooO0O0) OooOo00.OooO00o(o00o0oOooO0oO.OooO0o(), oo000o.f26979OooO0oO);
        if (oooO0O0 != null) {
            if (oooO0O0.f26906OooO00o < 0 || oooO0O0.f26907OooO0O0 < 0) {
                return;
            }
        }
        if (node.OooO0o().OooO0O0(oo000o.f26991OooOo)) {
            ArrayList arrayList = new ArrayList();
            List listOooO0o0 = o00o0oOooO0oO.OooO0o0(false);
            int size = listOooO0o0.size();
            for (int i = 0; i < size; i++) {
                o00O0O o00o0o2 = (o00O0O) listOooO0o0.get(i);
                OooOOOO oooOOOOOooO0o2 = o00o0o2.OooO0o();
                oo000o oo000oVar2 = oo000o.f26973OooO00o;
                if (oooOOOOOooO0o2.OooO0O0(oo000o.f26991OooOo)) {
                    arrayList.add(o00o0o2);
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zOooO00o = OooO00o(arrayList);
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    o00O0O o00o0o3 = (o00O0O) arrayList.get(i2);
                    if (o00o0o3.f26947OooO0o == node.f26947OooO0o) {
                        int i3 = zOooO00o ? 0 : i2;
                        int i4 = zOooO00o ? i2 : 0;
                        OooOOOO oooOOOOOooO0o3 = o00o0o3.OooO0o();
                        oo000o oo000oVar3 = oo000o.f26973OooO00o;
                        info.Oooo0(o0000OO0.OooO0OO.OooO00o(i3, 1, i4, 1, ((Boolean) oooOOOOOooO0o3.OooO0oO(oo000o.f26991OooOo, C0281OooO00o.f26738Oooo0o)).booleanValue()));
                    }
                }
            }
        }
    }
}
