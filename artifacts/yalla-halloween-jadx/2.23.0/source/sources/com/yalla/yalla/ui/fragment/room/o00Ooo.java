package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p564o0oOo0OO.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f29135OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f29136OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(RoomThemeStoreFragment roomThemeStoreFragment, ViewHolder viewHolder) {
        super(0);
        this.f29135OooO0Oo = roomThemeStoreFragment;
        this.f29136OooO0o0 = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> list;
        RoomThemeStoreFragment roomThemeStoreFragment = this.f29135OooO0Oo;
        o000O o000o = roomThemeStoreFragment.mAdapter;
        if (o000o != null && (list = o000o.f10111OooOOoo) != 0) {
            roomThemeStoreFragment.showThemeBigImageDialog(this.f29136OooO0o0.getLayoutPosition(), list);
        }
        return Unit.INSTANCE;
    }
}
