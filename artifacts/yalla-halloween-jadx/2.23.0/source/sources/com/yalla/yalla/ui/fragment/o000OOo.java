package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.room.RoomIndexModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends Lambda implements Function1<RoomIndexModel, String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OOo f28927OooO0Oo = new o000OOo();

    public o000OOo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(RoomIndexModel roomIndexModel) {
        RoomIndexModel roomIndexModel2 = roomIndexModel;
        if (roomIndexModel2 != null) {
            return roomIndexModel2.barid;
        }
        return null;
    }
}
