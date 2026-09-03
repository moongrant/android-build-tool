package p530o0o0OOOO;

import com.yalla.yalla.ui.vm.RoomMemberVM;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53441OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(o0O00oO0 o0o00oo1) {
        super(0);
        this.f53441OooO0Oo = o0o00oo1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00oO0 o0o00oo1 = this.f53441OooO0Oo;
        o0o00oo1.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = o0o00oo1.f53402OooOOOO.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
        }
        ((RoomMemberVM) o0o00oo1.f53401OooOOO0.getValue()).conveneBarMember(o0o00oo1.f53400OooOOO, arrayList).observe(o0o00oo1.f53398OooOO0O, new o000oOoO(new o0O0O0o0(o0o00oo1), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
