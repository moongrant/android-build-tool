package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26851OooO0oO;

    public class OooO00o implements p599o0oo00oo.o0000O {
        @Override // p599o0oo00oo.o0000O
        public final void onActivityResult(int i, Intent intent) {
        }
    }

    public o000OO00(MusicActivity musicActivity) {
        this.f26851OooO0oO = musicActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        p587o0oOooo.o0OO000.OooO00o("102141");
        p599o0oo00oo.o000OO o000oo2 = new p599o0oo00oo.o000OO(this.f26851OooO0oO);
        o000oo2.f56864OooO0O0 = DeleteMusicActivity.class;
        o000oo2.OooO0O0(new OooO00o());
    }
}
