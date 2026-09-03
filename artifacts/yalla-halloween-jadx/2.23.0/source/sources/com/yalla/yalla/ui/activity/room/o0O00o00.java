package com.yalla.yalla.ui.activity.room;

import android.content.DialogInterface;
import android.view.View;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p519o0o0O0oO.z2;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26905OooO0oO;

    public o0O00o00(SearchMusicActivity searchMusicActivity) {
        this.f26905OooO0oO = searchMusicActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        com.yalla.yalla.util.permission.OooO00o.OooO0OO(this.f26905OooO0oO, PermissionGroupReveal.f32882OooO0Oo, new o0O00OOO(), new Function1() { // from class: com.yalla.yalla.ui.activity.room.o0oO0Ooo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0O00o00 o0o00o01 = this.f26950OooO0Oo;
                o0o00o01.getClass();
                if (((Boolean) obj).booleanValue()) {
                    int i = SearchMusicActivity.f26696OooOoO0;
                    final SearchMusicActivity searchMusicActivity = o0o00o01.f26905OooO0oO;
                    searchMusicActivity.getClass();
                    z2 z2Var = new z2(searchMusicActivity);
                    if (searchMusicActivity.f26700OooOo == null) {
                        searchMusicActivity.f26700OooOo = new o0O0O0Oo(searchMusicActivity, z2Var);
                    }
                    z2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yalla.yalla.ui.activity.room.o0O00OO
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            searchMusicActivity.f26700OooOo = null;
                        }
                    });
                    if (p391o0Oo0.OooOO0.OooO(z2Var, searchMusicActivity)) {
                        z2Var.show();
                    }
                    p583o0oOooO.o0O.OooO0O0(searchMusicActivity, searchMusicActivity.f26700OooOo);
                }
                return Unit.INSTANCE;
            }
        });
    }
}
