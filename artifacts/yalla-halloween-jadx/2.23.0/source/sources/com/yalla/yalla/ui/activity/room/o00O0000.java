package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.model.MusicTable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p528o0o0OOOo.oOO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 implements BaseQuickAdapter.OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26860OooO0Oo;

    public o00O0000(MusicActivity musicActivity) {
        this.f26860OooO0Oo = musicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO
    public final boolean OooO00o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        final MusicActivity musicActivity = this.f26860OooO0Oo;
        if (musicActivity.f26581OooOOo0.getText().toString().length() != 0) {
            return false;
        }
        final MusicTable musicTable = (MusicTable) musicActivity.f26586OooOo0O.f10111OooOOoo.get(i);
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Sure_delete_selected_music);
        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(musicActivity);
        o0oo00o2.OooOo00(strOooO0OO);
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o000O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = MusicActivity.f26579OooOoO0;
                musicActivity.getClass();
                p587o0oOooo.o0OO000.OooO00o("102142");
                boolean z = oOO0.f54098OooO00o;
                MusicTable music = musicTable;
                Intrinsics.checkNotNullParameter(music, "music");
                oOO0.OooO00o(CollectionsKt.mutableListOf(music));
                return null;
            }
        });
        o0oo00o2.OooOO0o();
        return false;
    }
}
