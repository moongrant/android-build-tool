package com.yalla.yalla.ui.fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24462Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(PostDetailCommentFragment postDetailCommentFragment) {
        super(0);
        this.f24462Oooo0o = postDetailCommentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f24462Oooo0o.loadData(true, false);
        return Unit.INSTANCE;
    }
}
