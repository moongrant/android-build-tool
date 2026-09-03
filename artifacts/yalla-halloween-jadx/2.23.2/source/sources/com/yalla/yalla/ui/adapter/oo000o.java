package com.yalla.yalla.ui.adapter;

import com.yalla.yalla.data.db.table.MomentMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends androidx.recyclerview.widget.Oooo000.OooO<MomentMessage> {
    @Override // androidx.recyclerview.widget.Oooo000.OooO
    public final boolean OooO00o(MomentMessage momentMessage, MomentMessage momentMessage2) {
        MomentMessage oldItem = momentMessage;
        MomentMessage newItem = momentMessage2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return true;
    }

    @Override // androidx.recyclerview.widget.Oooo000.OooO
    public final boolean OooO0O0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        MomentMessage oldItem = momentMessage;
        MomentMessage newItem = momentMessage2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getMid(), newItem.getMid());
    }
}
