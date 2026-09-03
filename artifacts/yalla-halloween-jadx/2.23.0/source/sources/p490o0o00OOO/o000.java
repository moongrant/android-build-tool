package p490o0o00OOO;

import com.yalla.yalla.model.FriendCheckModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function1<FriendCheckModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f48562OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(o000O o000o, boolean z) {
        super(1);
        this.f48561OooO0Oo = o000o;
        this.f48562OooO0o0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FriendCheckModel friendCheckModel) {
        FriendCheckModel it = friendCheckModel;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000O o000o = this.f48561OooO0Oo;
        o000o.f48595OooO0Oo = it;
        o000o.OooO0o0().OooOO0o(this.f48562OooO0o0, it.isFriend);
        return Unit.INSTANCE;
    }
}
