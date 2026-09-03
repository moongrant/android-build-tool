package com.yalla.yalla.ui.activity.room;

import android.content.DialogInterface;
import android.view.View;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p473o0OoooOo.o0OOOO0o;
import p589o0oOooo.o0OO00o0;
import p650o0ooo.z2;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26444OooO0oO;

    public o0O000Oo(SearchMusicActivity searchMusicActivity) {
        this.f26444OooO0oO = searchMusicActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        com.yalla.yalla.util.permission.OooO00o.OooO0OO(this.f26444OooO0oO, PermissionGroupReveal.f32338OooO0Oo, new o0O000O(), new Function1() { // from class: com.yalla.yalla.ui.activity.room.o0OoOoOo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0O000Oo o0o000oo2 = this.f26480OooO0Oo;
                o0o000oo2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    int i = SearchMusicActivity.f26242OooOoO0;
                    final SearchMusicActivity searchMusicActivity = o0o000oo2.f26444OooO0oO;
                    searchMusicActivity.getClass();
                    z2 z2Var = new z2(searchMusicActivity);
                    if (searchMusicActivity.f26246OooOo == null) {
                        searchMusicActivity.f26246OooOo = new o0O00O(searchMusicActivity, z2Var);
                    }
                    z2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yalla.yalla.ui.activity.room.o0O000
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            searchMusicActivity.f26246OooOo = null;
                        }
                    });
                    if (p401o0Oo0O00.OooO.OooO(z2Var, searchMusicActivity)) {
                        z2Var.show();
                    }
                    o0OO00o0.OooO0O0(searchMusicActivity, searchMusicActivity.f26246OooOo);
                }
                return Unit.INSTANCE;
            }
        });
    }
}
