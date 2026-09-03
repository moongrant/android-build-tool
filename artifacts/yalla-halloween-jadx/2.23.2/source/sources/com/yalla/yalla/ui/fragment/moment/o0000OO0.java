package com.yalla.yalla.ui.fragment.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentListFeaturedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment$initView$3$1$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class o0000OO0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Density f28314OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f28315OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(Density density, MutableState<Dp> mutableState) {
        super(1);
        this.f28314OooO0Oo = density;
        this.f28315OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f28315OooO0o0.setValue(Dp.m3773boximpl(this.f28314OooO0Oo.mo323toDpu2uoSUM(IntSize.m3934getHeightimpl(it.mo2811getSizeYbymL2g()))));
        return Unit.INSTANCE;
    }
}
