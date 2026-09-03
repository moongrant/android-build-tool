package com.code.android.util;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f13480OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(LayoutDirection layoutDirection) {
        super(1);
        this.f13480OooO0Oo = layoutDirection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayer = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationY(this.f13480OooO0Oo == LayoutDirection.Rtl ? 180.0f : 0.0f);
        return Unit.INSTANCE;
    }
}
