package com.yalla.yalla.ui.fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailGiftFragment f24477Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(PostDetailGiftFragment postDetailGiftFragment) {
        super(0);
        this.f24477Oooo0o = postDetailGiftFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f24477Oooo0o.loadData(true, false);
        return Unit.INSTANCE;
    }
}
