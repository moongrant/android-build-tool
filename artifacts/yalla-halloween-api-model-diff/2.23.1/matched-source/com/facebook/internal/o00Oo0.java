package com.facebook.internal;

import android.view.View;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13728OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f13729OooO0o0;

    public /* synthetic */ o00Oo0(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.f13728OooO0Oo = i;
        this.f13729OooO0o0 = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f13728OooO0Oo;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f13729OooO0o0;
        switch (i) {
            case 0:
                WebDialog.m4142createCrossImage$lambda5((WebDialog) onCreateContextMenuListener, view);
                break;
            default:
                RoomInfoMemberListFragment.initView$lambda$1((RoomInfoMemberListFragment) onCreateContextMenuListener, view);
                break;
        }
    }
}
