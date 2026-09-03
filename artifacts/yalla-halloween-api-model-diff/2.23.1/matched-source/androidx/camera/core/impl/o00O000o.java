package androidx.camera.core.impl;

import android.media.MediaFormat;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O000o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3722OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f3723OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3724OooO0o0;

    public /* synthetic */ o00O000o(int i, Object obj, Object obj2) {
        this.f3722OooO0Oo = i;
        this.f3724OooO0o0 = obj;
        this.f3723OooO0o = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3722OooO0Oo;
        Object obj = this.f3723OooO0o;
        Object obj2 = this.f3724OooO0o0;
        switch (i) {
            case 0:
                o00O00.OooO00o oooO00o = (o00O00.OooO00o) obj2;
                o00O00.OooO0O0 oooO0O0 = (o00O00.OooO0O0) obj;
                if (oooO00o.f3714OooO0Oo.get()) {
                    Throwable th = oooO0O0.f3718OooO0O0;
                    boolean z = th == null;
                    o00O0.OooO00o<? super T> oooO00o2 = oooO00o.f3716OooO0o0;
                    if (!z) {
                        th.getClass();
                        oooO00o2.onError(th);
                        return;
                    } else {
                        if (!(th == null)) {
                            throw new IllegalStateException("Result contains an error. Does not contain a value.");
                        }
                        oooO00o2.OooO00o(oooO0O0.f3717OooO00o);
                        return;
                    }
                }
                return;
            case 1:
                int i2 = Oooooo.o0000Ooo.OooO.f1918OooOO0O;
                ((p045Oooooo.o00Oo0) obj2).OooO0o(new p022Oooo00O.o00OOO00((MediaFormat) obj, 1));
                return;
            default:
                o00O000.OooO00o(obj2);
                int i3 = AdsMediaSource.f8029OooOO0O;
                throw null;
        }
    }
}
