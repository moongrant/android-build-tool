package com.facebook.appevents.codeless;

import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import p581o0oOoOOo.oo00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12756Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12757OoooO00;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f12756Oooo = i;
        this.f12757OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12756Oooo) {
            case 0:
                CodelessMatcher.m136startTracking$lambda1((CodelessMatcher) this.f12757OoooO00);
                break;
            case 1:
                oo00 this$0 = (oo00) this.f12757OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0O().f49730OooOoO0.scrollToPosition(0);
                break;
            default:
                PostDetailCommentFragment.m391smoothScrollToPositionCommentMessageIndex$lambda9((PostDetailCommentFragment) this.f12757OoooO00);
                break;
        }
    }
}
