package com.yalla.yalla.ui.screen.user;

import android.content.Intent;
import com.yalla.yalla.ui.vm.user.FollowingVM;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;
import p526o0o0OOO0.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FollowingVM f29974OooO00o;

    public OooO(FollowingVM followingVM) {
        this.f29974OooO00o = followingVM;
    }

    @Override // p526o0o0OOO0.o000OO00
    public final void OooO00o(int i, int i2, @Nullable Intent intent) {
        Unit unit;
        if (i != 1022 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("userid");
        boolean booleanExtra = intent.getBooleanExtra("follow", true);
        FollowingVM followingVM = this.f29974OooO00o;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (stringExtra != null) {
                followingVM.updateUser(Long.parseLong(stringExtra), booleanExtra);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m4213constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
    }
}
