package p599o0oo00O0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.o000oOoO;
import p391o0OOooOo.o0O00000;
import p484o0o000OO.OooOOOO;
import p571o0oOo0o.oo00o;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f47996Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f47997Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f47998Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(LiveRoomVM liveRoomVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f47996Oooo0o = liveRoomVM;
        this.f47997Oooo0oO = oo0oo0oo;
        this.f47998Oooo0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("InRoom_roomProfile_follow");
        OooOOOO<ApiResult<Object>> oooOOOOFollowRoom = this.f47996Oooo0o.followRoom(true);
        oo00o.OooO0O0(oooOOOOFollowRoom, this.f47997Oooo0oO);
        o000oOoO.OooO0Oo(oooOOOOFollowRoom, this.f47998Oooo0oo, o0OO00O.f47967Oooo0o);
        return null;
    }
}
