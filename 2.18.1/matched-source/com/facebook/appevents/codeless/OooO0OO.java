package com.facebook.appevents.codeless;

import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12742Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12743Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12744Oooo0oo;

    public /* synthetic */ OooO0OO(Object obj, Object obj2, int i) {
        this.f12742Oooo0o = i;
        this.f12743Oooo0oO = obj;
        this.f12744Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12742Oooo0o) {
            case 0:
                ViewIndexer.m137schedule$lambda0((ViewIndexer) this.f12743Oooo0oO, (TimerTask) this.f12744Oooo0oo);
                break;
            default:
                PostDetailCommentFragment.m392toReplyComment$lambda5((PostDetailCommentFragment) this.f12743Oooo0oO, (PostCommentDetailModel) this.f12744Oooo0oo);
                break;
        }
    }
}
