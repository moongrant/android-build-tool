package com.yalla.yalla.ui.activity.moment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends o00000 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PostDetailActivity f22412OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(PostDetailActivity postDetailActivity, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f22412OooO0oo = postDetailActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        return this.f22412OooO0oo.f22434o00ooo.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // androidx.fragment.app.o00000
    @NotNull
    public final Fragment OooOOOo(int i) {
        return (Fragment) this.f22412OooO0oo.f22434o00ooo.get(i);
    }
}
