package com.yalla.yalla.module.media.music;

import com.yalla.yalla.data.db.model.MusicTable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p468o0OoooO0.o0OOo000;
import p575o0oOoOo.o0O0o00O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function1<MusicTable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f24588OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(o0O0o00O o0o0o00o) {
        super(1);
        this.f24588OooO0Oo = o0o0o00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicTable musicTable) {
        MusicTable it = musicTable;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O0o00O o0o0o00o = this.f24588OooO0Oo;
        o0o0o00o.getClass();
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        o0o0o00o.f56324OooO0O0.setValue(it);
        o0o0o00o.f56323OooO00o.setValue(Boolean.TRUE);
        it.isPlaying.setValue(Boolean.FALSE);
        o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
        o0OOo000.f46938OooO00o.pause();
        o0OO000.OooO00o("106087");
        return Unit.INSTANCE;
    }
}
