package com.yalla.yalla.ui.activity.moment;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.o000OO00;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.common.collect.ImmutableList;
import com.yalla.yalla.ui.activity.moment.ExoPlayVideoActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p245o00oo0o.o00O000o;
import p528o0o0OOOo.oOO0;
import p641o0ooOOOO.k0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/ExoPlayVideoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class ExoPlayVideoActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f26041OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public k0 f26042OooO0o0;

    @NotNull
    public final k0 OooOOO0() {
        k0 k0Var = this.f26042OooO0o0;
        if (k0Var != null) {
            return k0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000OO00.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(-16777216);
        k0 k0VarInflate = k0.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(k0VarInflate, "inflate(layoutInflater)");
        Intrinsics.checkNotNullParameter(k0VarInflate, "<set-?>");
        this.f26042OooO0o0 = k0VarInflate;
        setContentView(OooOOO0().f58213OooO00o);
        String stringExtra = getIntent().getStringExtra("source_uri");
        if (stringExtra != null) {
            StyledPlayerView styledPlayerView = OooOOO0().f58215OooO0OO;
            com.google.android.exoplayer2.OooOOO0.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.OooOOO0.OooO0O0(this);
            o00O000o.OooO0Oo(!oooO0O0.f11164OooOo00);
            oooO0O0.f11164OooOo00 = true;
            com.google.android.exoplayer2.OooOOO oooOOO = new com.google.android.exoplayer2.OooOOO(oooO0O0, null);
            oooOOO.f11087OooOO0o.OooO00o(new p485o0o00O0.o0Oo0oo());
            oooOOO.Oooooo0(0);
            oooOOO.Oooo00O(true);
            oooOOO.Oooooo(ImmutableList.OooOOOo(com.google.android.exoplayer2.o000oOoO.OooO00o(stringExtra)));
            oooOOO.OooO0OO();
            StyledPlayerView styledPlayerView2 = OooOOO0().f58215OooO0OO;
            styledPlayerView2.OooO0o(styledPlayerView2.OooO0o0());
            styledPlayerView.setPlayer(oooOOO);
        }
        OooOOO0().f58214OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0.o0OOO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ExoPlayVideoActivity.f26041OooO0o;
                ExoPlayVideoActivity this$0 = this.f47999OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        boolean z = oOO0.f54098OooO00o;
        oOO0.OooO0oo(true);
        com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47374OooO0Oo.setValue(Boolean.FALSE);
        Player player = OooOOO0().f58215OooO0OO.getPlayer();
        if (player != null) {
            player.release();
        }
        OooOOO0().f58215OooO0OO.setPlayer(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        View view = OooOOO0().f58215OooO0OO.f13976OooO0oO;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
        Player player = OooOOO0().f58215OooO0OO.getPlayer();
        if (player != null) {
            player.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        View view = OooOOO0().f58215OooO0OO.f13976OooO0oO;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
        Player player = OooOOO0().f58215OooO0OO.getPlayer();
        if (player != null) {
            player.OooO0O0();
        }
        boolean z = oOO0.f54098OooO00o;
        oOO0.OooO0Oo(true);
        com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47374OooO0Oo.setValue(Boolean.TRUE);
    }
}
