package com.yalla.yalla.module.media.preview;

import com.yalla.yalla.model.media.SelectMusicFrom;
import com.yalla.yalla.model.media.SelectMusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p550o0oOOO0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SelectMusicModel f24160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f24161OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(SelectMusicModel selectMusicModel, o00O00OO o00o00oo2) {
        super(1);
        this.f24160OooO0Oo = selectMusicModel;
        this.f24161OooO0o0 = o00o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        YLMediaPreViewScreen.INSTANCE.logDebug("select music back: " + this.f24160OooO0Oo);
        SelectMusicModel musicModel = obj instanceof SelectMusicModel ? (SelectMusicModel) obj : null;
        if (musicModel == null) {
            return null;
        }
        SelectMusicFrom mediaPreview = SelectMusicFrom.MEDIA_PREVIEW;
        o00O00OO o00o00oo2 = this.f24161OooO0o0;
        o00o00oo2.getClass();
        Intrinsics.checkNotNullParameter(musicModel, "musicModel");
        Intrinsics.checkNotNullParameter(mediaPreview, "mediaPreview");
        o00o00oo2.f55974OooO0o.setValue(musicModel);
        o00o00oo2.f55976OooO0oO.setValue(mediaPreview);
        o00o00oo2.f55978OooOO0.setIntValue(100);
        return Unit.INSTANCE;
    }
}
