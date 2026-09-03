package com.yalla.yalla.ui.fragment;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO00O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f28417OooO0o0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f28416OooO0Oo = i;
        this.f28417OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f28416OooO0Oo;
        Object obj2 = this.f28417OooO0o0;
        switch (i) {
            case 0:
                MainSearchRoomFragment.observerSearchText$lambda$0((MainSearchRoomFragment) obj2, (String) obj);
                break;
            default:
                RoomThemeCustomScreen.MainContent$lambda$0((p107o000ooO0.OooOOOO) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
