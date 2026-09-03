package com.yalla.yalla.module.media.music;

import android.app.Activity;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.media.SelectMusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p105o000oo0o.o00O00OO;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function1<MusicTable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24129OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(MusicTable musicTable) {
        super(1);
        this.f24129OooO0Oo = musicTable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicTable musicTable) {
        MusicTable it = musicTable;
        Intrinsics.checkNotNullParameter(it, "it");
        p190o00o0O.OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
        MusicTable musicTable2 = this.f24129OooO0Oo;
        long j = musicTable2.mDuration;
        String mDisplayName = musicTable2.mDisplayName;
        Intrinsics.checkNotNullExpressionValue(mDisplayName, "mDisplayName");
        String mTitleKey = musicTable2.mTitleKey;
        Intrinsics.checkNotNullExpressionValue(mTitleKey, "mTitleKey");
        String mPath = musicTable2.mPath;
        Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
        o00O00.OooO0o(new SelectMusicModel(j, mDisplayName, mTitleKey, 0L, mPath));
        o0oo0000.OooO00o.OooO0O0("106088");
        return Unit.INSTANCE;
    }
}
