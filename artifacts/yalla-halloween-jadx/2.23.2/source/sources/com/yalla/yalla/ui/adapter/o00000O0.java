package com.yalla.yalla.ui.adapter;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f27007OooO00o;

    public o00000O0(PrivateChatAdapter privateChatAdapter) {
        this.f27007OooO00o = privateChatAdapter;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull o0OO0O0O.o00Ooo videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        this.f27007OooO00o.f26973OooOo00 = videoItem;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void onError() {
    }
}
