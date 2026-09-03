package com.facebook.appevents.codeless;

import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12758Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12759OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12760OoooO00;

    public /* synthetic */ OooO0OO(Object obj, Object obj2, int i) {
        this.f12758Oooo = i;
        this.f12760OoooO00 = obj;
        this.f12759OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12758Oooo) {
            case 0:
                ViewIndexer.m137schedule$lambda0((ViewIndexer) this.f12760OoooO00, (TimerTask) this.f12759OoooO0);
                break;
            default:
                PostDetailCommentFragment.m392toReplyComment$lambda5((PostDetailCommentFragment) this.f12760OoooO00, (PostCommentDetailModel) this.f12759OoooO0);
                break;
        }
    }
}
