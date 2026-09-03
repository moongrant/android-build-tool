package com.yalla.yalla.ui.activity.room.live.side;

import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.data.constant.TurntableGameState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<String> f23116Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23117Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<BaseWebView> f23118Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23119Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23120OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o0O00OO<Boolean> o0o00oo2, o0O00OO<BaseWebView> o0o00oo3, MixedRoomActivity mixedRoomActivity, o0O00OO<String> o0o00oo4, o0O00OO<Boolean> o0o00oo5) {
        super(0);
        this.f23117Oooo0o = o0o00oo2;
        this.f23118Oooo0oO = o0o00oo3;
        this.f23119Oooo0oo = mixedRoomActivity;
        this.f23116Oooo = o0o00oo4;
        this.f23120OoooO00 = o0o00oo5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("InRoom_Sidebar_wheel");
        RoomTurntableGameManager roomTurntableGameManager = RoomTurntableGameManager.f23143OooO00o;
        o0O00OO<Boolean> o0o00oo2 = this.f23117Oooo0o;
        o0O00OO<BaseWebView> o0o00oo3 = this.f23118Oooo0oO;
        MixedRoomActivity mixedRoomActivity = this.f23119Oooo0oo;
        o0O00OO<String> o0o00oo4 = this.f23116Oooo;
        o0O00OO<Boolean> o0o00oo5 = this.f23120OoooO00;
        o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
        if (oooOOO0.OooO00o() == TurntableGameState.Close) {
            oooOOO0.OooO0Oo(TurntableGameState.Setting);
        }
        roomTurntableGameManager.OooO0OO(o0o00oo2, o0o00oo3, mixedRoomActivity, o0o00oo4, o0o00oo5);
        return Unit.INSTANCE;
    }
}
