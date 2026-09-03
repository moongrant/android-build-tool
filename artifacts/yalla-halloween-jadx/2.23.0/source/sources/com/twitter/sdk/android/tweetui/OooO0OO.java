package com.twitter.sdk.android.tweetui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicInfoHeadView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f22297OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f22298OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f22299OooO0o0;

    public /* synthetic */ OooO0OO(int i, Object obj, Object obj2) {
        this.f22297OooO0Oo = i;
        this.f22299OooO0o0 = obj;
        this.f22298OooO0o = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22297OooO0Oo;
        Object obj = this.f22298OooO0o;
        Object obj2 = this.f22299OooO0o0;
        switch (i) {
            case 0:
                BaseTweetView baseTweetView = (BaseTweetView) obj2;
                int i2 = BaseTweetView.f22260Oooo00O;
                baseTweetView.getClass();
                if (!com.twitter.sdk.android.core.OooOO0.OooO00o(baseTweetView.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(o0000OO0.OooO00o(((com.twitter.sdk.android.core.models.OooOo) obj).f22093OooOooO.f22186Oooo0O0))))) {
                    com.twitter.sdk.android.core.o00Oo0.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open URL");
                }
                break;
            default:
                TopicInfoHeadView.OooO0O0((TopicInfoModel) obj2, (TopicInfoHeadView) obj);
                break;
        }
    }
}
