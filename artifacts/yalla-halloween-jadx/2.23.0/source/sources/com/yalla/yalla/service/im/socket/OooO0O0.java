package com.yalla.yalla.service.im.socket;

import com.common.support.networkstate.NetworkState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<NetworkState, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ IMSocketManagerOld f24971OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(IMSocketManagerOld iMSocketManagerOld) {
        super(1);
        this.f24971OooO0Oo = iMSocketManagerOld;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NetworkState networkState) {
        NetworkState networkState2 = networkState;
        IMSocketManagerOld iMSocketManagerOld = this.f24971OooO0Oo;
        if (iMSocketManagerOld.f24955OooO0oO && networkState2.isConnected() && iMSocketManagerOld.f24953OooO0o.getValue() != IMSocketManagerOld.State.ConnectSuccess) {
            OooOOO0.OooO0O0("SocketManager netStatus = " + networkState2);
            iMSocketManagerOld.f24948OooO = 5000L;
            IMSocketManagerOld.OooO0oo(iMSocketManagerOld, false, true, 1);
        }
        return Unit.INSTANCE;
    }
}
