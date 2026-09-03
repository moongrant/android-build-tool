package com.google.android.material.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.OooO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p072o000O0o0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f16520OooO00o;

    public OooO00o(SwipeDismissBehavior swipeDismissBehavior) {
        this.f16520OooO00o = swipeDismissBehavior;
    }

    @Override // p072o000O0o0.o000Oo0
    public final boolean perform(@NonNull View view, @Nullable o000Oo0.OooO00o oooO00o) {
        boolean z = false;
        if (!this.f16520OooO00o.OooOo00(view)) {
            return false;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z2 = ViewCompat.OooO.OooO0Oo(view) == 1;
        int i = this.f16520OooO00o.f16524OooO0Oo;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        ViewCompat.OooOOOO(view, width);
        view.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        SwipeDismissBehavior.OooO0O0 oooO0O0 = this.f16520OooO00o.f16522OooO0O0;
        if (oooO0O0 != null) {
            ((OooO) oooO0O0).OooO00o(view);
        }
        return true;
    }
}
