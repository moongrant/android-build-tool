package com.yalla.yalla.mixedroom;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f23508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f23509OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f23510OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f23511OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23512OooO0oo;

    public o0000OO0(MixedRoomActivity mixedRoomActivity, RoomUserInfoModel roomUserInfoModel, int i, int i2, boolean z) {
        this.f23512OooO0oo = mixedRoomActivity;
        this.f23508OooO0Oo = roomUserInfoModel;
        this.f23510OooO0o0 = i;
        this.f23509OooO0o = i2;
        this.f23511OooO0oO = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f23512OooO0oo.f23432OooOo0O.OooO0O0(this.f23508OooO0Oo, this.f23510OooO0o0, this.f23509OooO0o, this.f23511OooO0oO);
        return null;
    }
}
