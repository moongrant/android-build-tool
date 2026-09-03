package com.google.android.material.search;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements o0000O.OooO0o, OnSuccessListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f17492OooO0Oo;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Function1 tmp0 = (Function1) this.f17492OooO0Oo;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // o0000O.OooO0o
    public final void onTouchExplorationStateChanged(boolean z) {
        SearchBar searchBar = (SearchBar) this.f17492OooO0Oo;
        int i = SearchBar.f17507o00O0O;
        searchBar.setFocusableInTouchMode(z);
    }
}
