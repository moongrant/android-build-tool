package p524o0o0OO0o;

import com.yalla.yalla.ui.vm.RoomMemberVM;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53511OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(o0O00 o0o01) {
        super(0);
        this.f53511OooO0Oo = o0o01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00 o0o01 = this.f53511OooO0Oo;
        o0o01.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = o0o01.f53468OooOOOO.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
        }
        ((RoomMemberVM) o0o01.f53467OooOOO0.getValue()).conveneBarMember(o0o01.f53466OooOOO, arrayList).observe(o0o01.f53464OooOO0O, new o0000OO0(new o0O00OOO(o0o01), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
