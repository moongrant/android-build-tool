package p669oO0Oo;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o000O000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFollowAndJoinCheckVM f60777OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f60778OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f60777OooO0Oo = roomFollowAndJoinCheckVM;
        this.f60778OooO0o0 = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O000.OooO0Oo(this.f60777OooO0Oo.unJoinAndUnFollowRoom(OooO00o.f24978OooO0o0.OooO0o0()), this.f60778OooO0o0, false, null, null, oO00000o.f60776OooO0Oo, 14);
        return Unit.INSTANCE;
    }
}
