package p499o0o00OoO;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;
import p142o00OOooO.o000OO00;
import p142o00OOooO.o000OOo0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f41371OooO00o;

    public o0OOO0o(o0OO00O o0oo00o2) {
        this.f41371OooO00o = o0oo00o2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Boolean it = (Boolean) obj;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            o0OO00O o0oo00o2 = this.f41371OooO00o;
            o000OOo0.OooO00o(OooOOO.f41216OooO00o, o000OO00.OooO00o(o0oo00o2, "isPayEmojiHasRead"), o0oo00o2, true);
        }
    }
}
