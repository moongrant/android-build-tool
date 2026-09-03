package com.yalla.yalla.mixedroom;

import com.yalla.yalla.model.room.RoomActivityModel;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        RoomActivityModel roomActivityModel = (RoomActivityModel) oOo00OO0.OooO00o(str, RoomActivityModel.class);
        if (roomActivityModel != null) {
            if (roomActivityModel.dataTop.size() > 0) {
                com.yalla.yalla.service.room.OooO00o.f24985OooOOO0.f47366OooO00o.setValue(roomActivityModel.dataTop);
            }
            if (roomActivityModel.dataRight.size() > 0) {
                com.yalla.yalla.service.room.OooO00o.f24985OooOOO0.f47367OooO0O0.setValue(roomActivityModel.dataRight.get(0));
            }
        }
    }
}
