package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function2<OooO0o.OooO00o, OooO0o.OooO00o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoadType f7094OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00000 f7095OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(LoadType loadType, o00000 o00000Var) {
        super(2);
        this.f7094OooO0Oo = loadType;
        this.f7095OooO0o0 = o00000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(OooO0o.OooO00o oooO00o, OooO0o.OooO00o oooO00o2) {
        OooO0o.OooO00o prependHint = oooO00o;
        OooO0o.OooO00o appendHint = oooO00o2;
        Intrinsics.checkNotNullParameter(prependHint, "prependHint");
        Intrinsics.checkNotNullParameter(appendHint, "appendHint");
        LoadType loadType = LoadType.PREPEND;
        LoadType loadType2 = this.f7094OooO0Oo;
        o00000 o00000Var = this.f7095OooO0o0;
        if (loadType2 == loadType) {
            prependHint.f7147OooO00o = o00000Var;
            if (o00000Var != null) {
                prependHint.f7148OooO0O0.tryEmit(o00000Var);
            }
        } else {
            appendHint.f7147OooO00o = o00000Var;
            if (o00000Var != null) {
                appendHint.f7148OooO0O0.tryEmit(o00000Var);
            }
        }
        return Unit.INSTANCE;
    }
}
