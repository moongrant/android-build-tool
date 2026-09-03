package com.yalla.yalla.module.media.music;

import android.app.Activity;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.media.SelectMusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00.o00000O;
import p526o0o0OOO0.oo0oOO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<MusicTable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24590OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(MusicTable musicTable) {
        super(1);
        this.f24590OooO0Oo = musicTable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicTable musicTable) {
        MusicTable it = musicTable;
        Intrinsics.checkNotNullParameter(it, "it");
        p188o00o0O.OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
        MusicTable musicTable2 = this.f24590OooO0Oo;
        long j = musicTable2.mDuration;
        String mDisplayName = musicTable2.mDisplayName;
        Intrinsics.checkNotNullExpressionValue(mDisplayName, "mDisplayName");
        String mTitleKey = musicTable2.mTitleKey;
        Intrinsics.checkNotNullExpressionValue(mTitleKey, "mTitleKey");
        String mPath = musicTable2.mPath;
        Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
        oo0oOO0.OooO0o(new SelectMusicModel(j, mDisplayName, mTitleKey, 0L, mPath));
        o0OO000.OooO00o("106088");
        return Unit.INSTANCE;
    }
}
