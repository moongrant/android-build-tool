package com.facebook.appevents.codeless;

import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoOOo.O0000000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12740Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12741Oooo0oO;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f12740Oooo0o = i;
        this.f12741Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12740Oooo0o) {
            case 0:
                CodelessMatcher.m136startTracking$lambda1((CodelessMatcher) this.f12741Oooo0oO);
                break;
            case 1:
                O0000000 this$0 = (O0000000) this.f12741Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0O().f49793OooOoO0.scrollToPosition(0);
                break;
            default:
                PostDetailCommentFragment.m391smoothScrollToPositionCommentMessageIndex$lambda9((PostDetailCommentFragment) this.f12741Oooo0oO);
                break;
        }
    }
}
