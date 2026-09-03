package p045OooooOo;

import OooO00o.OooO00o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p047Oooooo0.o00OO0O0;
import p100o000oOoO.o;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0O00OOO;
import p100o000oOoO.o0OO000;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Object> f4044Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0OO f4045Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f4046Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<o00O<Object, Object>> f4047Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo00o(o00O0OO o00o0oo2, String str, oO0Oo<? extends o00O<Object, Object>> oo0oo, oO0Oo<Object> oo0oo2) {
        super(1);
        this.f4045Oooo0o = o00o0oo2;
        this.f4046Oooo0oO = str;
        this.f4047Oooo0oo = oo0oo;
        this.f4044Oooo = oo0oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        String string;
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        o00O00o0 o00o00o1 = new o00O00o0(this.f4047Oooo0oo, this.f4044Oooo, this.f4045Oooo0o);
        o00O0OO o00o0oo2 = this.f4045Oooo0o;
        Object objInvoke = o00o00o1.invoke();
        if (objInvoke == null || o00o0oo2.canBeSaved(objInvoke)) {
            return new o00O00OO(this.f4045Oooo0o.OooO0OO(this.f4046Oooo0oO, o00o00o1));
        }
        if (objInvoke instanceof o00OO0O0) {
            o00OO0O0 o00oo0o1 = (o00OO0O0) objInvoke;
            if (o00oo0o1.OooO() == o0O00OOO.f29537OooO00o || o00oo0o1.OooO() == o.f29323OooO00o || o00oo0o1.OooO() == o0OO000.f29595OooO00o) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MutableState containing ");
                sbOooO0o0.append(o00oo0o1.getValue());
                sbOooO0o0.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                string = sbOooO0o0.toString();
            } else {
                string = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            string = objInvoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(string);
    }
}
