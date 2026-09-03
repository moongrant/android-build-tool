package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.model.MusicTable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p535o0o0Oo0.oO0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 implements BaseQuickAdapter.OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26399OooO0Oo;

    public o000OOo0(MusicActivity musicActivity) {
        this.f26399OooO0Oo = musicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO
    public final boolean OooO00o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        final MusicActivity musicActivity = this.f26399OooO0Oo;
        if (musicActivity.f26129OooOOo0.getText().toString().length() != 0) {
            return false;
        }
        final MusicTable musicTable = (MusicTable) musicActivity.f26134OooOo0O.f13189OooOOoo.get(i);
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Sure_delete_selected_music);
        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(musicActivity);
        o000o.OooOo00(strOooO0OO);
        o000o.OooOo(true);
        o000o.OooOo0(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o000O00
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = MusicActivity.f26127OooOoO0;
                musicActivity.getClass();
                o0oo0000.OooO00o.OooO0O0("102142");
                boolean z = oO0O00.f53970OooO00o;
                MusicTable music = musicTable;
                Intrinsics.checkNotNullParameter(music, "music");
                oO0O00.OooO00o(CollectionsKt.mutableListOf(music));
                return null;
            }
        });
        o000o.OooOO0o();
        return false;
    }
}
