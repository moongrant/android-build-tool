package com.yalla.yalla.module.media.music;

import com.yalla.yalla.data.db.model.MusicTable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p460o0Ooo0o.o00OOO00;
import p584o0oOoo0O.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<MusicTable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0O0 f24127OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(oo0o0O0 oo0o0o0) {
        super(1);
        this.f24127OooO0Oo = oo0o0o0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicTable musicTable) {
        MusicTable it = musicTable;
        Intrinsics.checkNotNullParameter(it, "it");
        oo0o0O0 oo0o0o0 = this.f24127OooO0Oo;
        oo0o0o0.getClass();
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        oo0o0o0.f56699OooO0OO.setValue(it);
        oo0o0o0.f56698OooO0O0.setValue(Boolean.TRUE);
        it.isPlaying.setValue(Boolean.FALSE);
        p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
        o00OOO00.f47803OooO00o.pause();
        o0oo0000.OooO00o.OooO0O0("106087");
        return Unit.INSTANCE;
    }
}
