package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p337o0OO0o0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f16474OooO00o = {R.attr.stateListAnimator};

    public static void OooO00o(@NonNull View view, float f) {
        int integer = view.getResources().getInteger(OooOOO.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, p337o0OO0o0.OooO0o.state_liftable, -p337o0OO0o0.OooO0o.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
