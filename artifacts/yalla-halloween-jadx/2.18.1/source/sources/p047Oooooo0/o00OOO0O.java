package p047Oooooo0;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f4126Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(o00OOO0 o00ooo1) {
        super(0);
        this.f4126Oooo0o = o00ooo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000OOo<o00OOO0.OooO00o<?>> o000ooo2 = this.f4126Oooo0o.f4115OooO0Oo;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            o00OOO0.OooO00o<?>[] oooO00oArr = o000ooo2.f3662Oooo0o;
            do {
                o00OOO0.OooO00o<?> oooO00o = oooO00oArr[i2];
                HashSet<Object> scopes = oooO00o.f4121OooO0OO;
                if (!scopes.isEmpty()) {
                    Intrinsics.checkNotNullParameter(scopes, "scopes");
                    Iterator<Object> it = scopes.iterator();
                    while (it.hasNext()) {
                        oooO00o.f4119OooO00o.invoke(it.next());
                    }
                    scopes.clear();
                }
                i2++;
            } while (i2 < i);
        }
        return Unit.INSTANCE;
    }
}
