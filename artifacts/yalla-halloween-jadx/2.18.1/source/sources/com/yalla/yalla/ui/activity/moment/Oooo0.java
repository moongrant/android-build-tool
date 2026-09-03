package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f22415Oooo;

    public Oooo0(TopicInfoActivity topicInfoActivity) {
        this.f22415Oooo = topicInfoActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        TopicInfoActivity topicInfoActivity = this.f22415Oooo;
        TopicInfoActivity.OooO00o oooO00o = TopicInfoActivity.f22623OoooooO;
        topicInfoActivity.OooOooo().setFirstLoading(true);
        TopicInfoActivity.OooOoo(this.f22415Oooo, true);
    }
}
