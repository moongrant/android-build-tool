package com.yalla.yalla.ui.adapter;

import android.view.View;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.adapter.roomMemberManager.RoomMemberManagerTag;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f27475OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000O000 f27476OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f27477OooO0oo;

    public o0000O(o000O000 o000o001, RoomUserInfoModel roomUserInfoModel, ViewHolder viewHolder) {
        this.f27476OooO0oO = o000o001;
        this.f27477OooO0oo = roomUserInfoModel;
        this.f27475OooO = viewHolder;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Function3<? super RoomUserInfoModel, ? super Integer, ? super RoomMemberManagerTag, Unit> function3 = this.f27476OooO0oO.f27516OooOoo;
        if (function3 != null) {
            function3.invoke(this.f27477OooO0oo, Integer.valueOf(this.f27475OooO.getLayoutPosition()), RoomMemberManagerTag.del);
        }
    }
}
