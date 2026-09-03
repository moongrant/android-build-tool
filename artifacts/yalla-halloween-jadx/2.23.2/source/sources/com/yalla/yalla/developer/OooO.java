package com.yalla.yalla.developer;

import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TestVideoActivity f22845OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(TestVideoActivity testVideoActivity) {
        super(0);
        this.f22845OooO0Oo = testVideoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TestVideoActivity testVideoActivity = this.f22845OooO0Oo;
        testVideoActivity.f22859OooO0oo.addItem(new VideoModel(testVideoActivity.f22856OooO0o, VideoType.YYEva, 0, null, 12, null));
        return Unit.INSTANCE;
    }
}
