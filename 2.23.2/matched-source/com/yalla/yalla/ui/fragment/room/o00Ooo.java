package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f28601OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f28602OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(RoomThemeStoreFragment roomThemeStoreFragment, ViewHolder viewHolder) {
        super(0);
        this.f28601OooO0Oo = roomThemeStoreFragment;
        this.f28602OooO0o0 = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> list;
        RoomThemeStoreFragment roomThemeStoreFragment = this.f28601OooO0Oo;
        o0000oo o0000ooVar = roomThemeStoreFragment.mAdapter;
        if (o0000ooVar != null && (list = o0000ooVar.f13189OooOOoo) != 0) {
            roomThemeStoreFragment.showThemeBigImageDialog(this.f28602OooO0o0.getLayoutPosition(), list);
        }
        return Unit.INSTANCE;
    }
}
