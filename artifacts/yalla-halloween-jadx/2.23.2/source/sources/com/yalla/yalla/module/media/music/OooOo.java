package com.yalla.yalla.module.media.music;

import com.yalla.yalla.data.db.model.MusicTable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends Lambda implements Function1<MusicTable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOo f24128OooO0Oo = new OooOo();

    public OooOo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicTable musicTable) {
        MusicTable it = musicTable;
        Intrinsics.checkNotNullParameter(it, "it");
        MusicScreen.INSTANCE.sureDeleteMusic(it);
        return Unit.INSTANCE;
    }
}
