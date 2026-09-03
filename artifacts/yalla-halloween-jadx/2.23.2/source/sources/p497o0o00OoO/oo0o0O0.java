package p497o0o00OoO;

import com.yalla.yalla.model.FriendCheckModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function1<FriendCheckModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49910OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f49911OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(oo0O oo0o, boolean z) {
        super(1);
        this.f49910OooO0Oo = oo0o;
        this.f49911OooO0o0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FriendCheckModel friendCheckModel) {
        FriendCheckModel friendCheckModel2 = friendCheckModel;
        Intrinsics.checkNotNull(friendCheckModel2);
        oo0O oo0o = this.f49910OooO0Oo;
        oo0o.f49903OooO0Oo = friendCheckModel2;
        oo0o.OooO0o0().OooOO0o(this.f49911OooO0o0, friendCheckModel2.isFriend);
        return Unit.INSTANCE;
    }
}
