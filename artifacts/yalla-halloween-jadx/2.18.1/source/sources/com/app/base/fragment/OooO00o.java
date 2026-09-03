package com.app.base.fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainMomentFollowingFragment f11609Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(MainMomentFollowingFragment mainMomentFollowingFragment) {
        super(0);
        this.f11609Oooo0o = mainMomentFollowingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11609Oooo0o.followingNewPostDialog = null;
        return Unit.INSTANCE;
    }
}
