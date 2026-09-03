package com.facebook.internal;

import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13709OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13710OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f13709OooO0Oo = i;
        this.f13710OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13709OooO0Oo;
        Object obj = this.f13710OooO0o0;
        switch (i) {
            case 0:
                FileLruCache.m4131clearCache$lambda1((File[]) obj);
                break;
            default:
                UserInfoTagActivity this$0 = (UserInfoTagActivity) obj;
                int i2 = UserInfoTagActivity.f26868Oooo0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f26885Oooo00o = true;
                break;
        }
    }
}
