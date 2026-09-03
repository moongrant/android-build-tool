package com.yalla.yalla.developer;

import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TestVideoActivity f22850OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(TestVideoActivity testVideoActivity) {
        super(0);
        this.f22850OooO0Oo = testVideoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TestVideoActivity testVideoActivity = this.f22850OooO0Oo;
        testVideoActivity.f22859OooO0oo.addItem(new VideoModel(testVideoActivity.f22858OooO0oO, VideoType.Svga, 0, null, 12, null));
        return Unit.INSTANCE;
    }
}
