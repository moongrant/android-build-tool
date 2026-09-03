package p029Oooo0oO;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO0 extends Lambda implements Function1<o0OoO00O, ArrayList<Pair<? extends Integer, ? extends OooO0O0>>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f2332Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0o f2333Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(o00OOOO0 o00oooo1, o0O0o o0o0o) {
        super(1);
        this.f2332Oooo0o = o00oooo1;
        this.f2333Oooo0oO = o0o0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<Pair<? extends Integer, ? extends OooO0O0>> invoke(o0OoO00O o0ooo00o2) {
        o00OOOO0.OooO0OO oooO0OOOooO0O0 = this.f2332Oooo0o.OooO0O0(o0ooo00o2.f2457OooO00o);
        int i = oooO0OOOooO0O0.f2374OooO00o;
        ArrayList<Pair<? extends Integer, ? extends OooO0O0>> arrayList = new ArrayList<>(oooO0OOOooO0O0.f2375OooO0O0.size());
        List<o000OO0O> list = oooO0OOOooO0O0.f2375OooO0O0;
        o0O0o o0o0o = this.f2333Oooo0oO;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = (int) list.get(i3).f2271OooO00o;
            arrayList.add(TuplesKt.to(Integer.valueOf(i), o0o0o.f2451OooO0oO.invoke(Integer.valueOf(i2), Integer.valueOf(i4))));
            i++;
            i2 += i4;
        }
        return arrayList;
    }
}
