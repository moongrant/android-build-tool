package com.yalla.yalla.module.media.preview;

import com.yalla.yalla.model.media.SelectMusicFrom;
import com.yalla.yalla.model.media.SelectMusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p455o0Ooo0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SelectMusicModel f24622OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f24623OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(SelectMusicModel selectMusicModel, oo0o0Oo oo0o0oo) {
        super(1);
        this.f24622OooO0Oo = selectMusicModel;
        this.f24623OooO0o0 = oo0o0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        YLMediaPreViewScreen.INSTANCE.logDebug("select music back: " + this.f24622OooO0Oo);
        SelectMusicModel musicModel = obj instanceof SelectMusicModel ? (SelectMusicModel) obj : null;
        if (musicModel == null) {
            return null;
        }
        SelectMusicFrom mediaPreview = SelectMusicFrom.MEDIA_PREVIEW;
        oo0o0Oo oo0o0oo = this.f24623OooO0o0;
        oo0o0oo.getClass();
        Intrinsics.checkNotNullParameter(musicModel, "musicModel");
        Intrinsics.checkNotNullParameter(mediaPreview, "mediaPreview");
        oo0o0oo.f46603OooO0o.setValue(musicModel);
        oo0o0oo.f46605OooO0oO.setValue(mediaPreview);
        oo0o0oo.f46607OooOO0.setIntValue(100);
        return Unit.INSTANCE;
    }
}
