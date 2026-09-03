package com.yalla.yalla.ui.fragment;

import com.app.base.model.RoomIndexModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Lambda implements Function1<RoomIndexModel, String> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooOO0O f24063Oooo0o = new OooOO0O();

    public OooOO0O() {
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
