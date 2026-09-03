package com.yalla.yalla.ui.adapter;

import android.view.View;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.adapter.roomMemberManager.RoomMemberManagerTag;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f26996OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000O000 f26997OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f26998OooO0oo;

    public o000(o000O000 o000o001, RoomUserInfoModel roomUserInfoModel, ViewHolder viewHolder) {
        this.f26997OooO0oO = o000o001;
        this.f26998OooO0oo = roomUserInfoModel;
        this.f26996OooO = viewHolder;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Function3<? super RoomUserInfoModel, ? super Integer, ? super RoomMemberManagerTag, Unit> function3 = this.f26997OooO0oO.f27057OooOoo;
        if (function3 != null) {
            function3.invoke(this.f26998OooO0oo, Integer.valueOf(this.f26996OooO.getLayoutPosition()), RoomMemberManagerTag.member);
        }
    }
}
