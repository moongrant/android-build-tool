package com.yalla.yalla.ui.activity.moment;

import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.o00oOoo;
import androidx.media3.common.Player;
import androidx.media3.ui.PlayerView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.yalla.yalla.ui.activity.moment.ExoPlayVideoActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o00O0O0;
import p535o0o0Oo0.oO0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/ExoPlayVideoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ExoPlayVideoActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f25594OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00O0O0 f25595OooO0o0;

    @NotNull
    public final o00O0O0 OooOOO0() {
        o00O0O0 o00o0o0 = this.f25595OooO0o0;
        if (o00o0o0 != null) {
            return o00o0o0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o00oOoo.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(-16777216);
        o00O0O0 o00o0o0Inflate = o00O0O0.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o00o0o0Inflate, "inflate(...)");
        Intrinsics.checkNotNullParameter(o00o0o0Inflate, "<set-?>");
        this.f25595OooO0o0 = o00o0o0Inflate;
        setContentView(OooOOO0().f44308OooO00o);
        String stringExtra = getIntent().getStringExtra("source_uri");
        if (stringExtra != null) {
            PlayerView playerView = OooOOO0().f44310OooO0OO;
            androidx.media3.exoplayer.OooO oooOOooO00o = new androidx.media3.exoplayer.OooO0o.OooO0O0(this).OooO00o();
            oooOOooO00o.f7132OooOO0o.OooO00o(new p492o0o00OO0.o0ooOOo());
            oooOOooO00o.Oooo0oo(0);
            oooOOooO00o.o0OOO0o(true);
            androidx.media3.common.OooOOO0.OooO0O0 oooO0O0 = new androidx.media3.common.OooOOO0.OooO0O0();
            oooO0O0.f6520OooO0O0 = Uri.parse(stringExtra);
            o0O00 o0o00OooOOOo = ImmutableList.OooOOOo(oooO0O0.OooO00o());
            oooOOooO00o.o00000();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < o0o00OooOOOo.f19062OooO0oO; i++) {
                arrayList.add(oooOOooO00o.f7138OooOOo0.OooO00o((androidx.media3.common.OooOOO0) o0o00OooOOOo.get(i)));
            }
            oooOOooO00o.o0ooOOo(arrayList);
            oooOOooO00o.OooO0o0();
            PlayerView playerView2 = OooOOO0().f44310OooO0OO;
            playerView2.OooO0o(playerView2.OooO0o0());
            playerView.setPlayer(oooOOooO00o);
        }
        OooOOO0().f44309OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00OO0.o00oO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ExoPlayVideoActivity.f25594OooO0o;
                ExoPlayVideoActivity this$0 = this.f49199OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        boolean z = oO0O00.f53970OooO00o;
        oO0O00.OooO0oo(true);
        com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48579OooO0Oo.setValue(Boolean.FALSE);
        Player player = OooOOO0().f44310OooO0OO.getPlayer();
        if (player != null) {
            player.release();
        }
        OooOOO0().f44310OooO0OO.setPlayer(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        View view = OooOOO0().f44310OooO0OO.f9738OooO0oO;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
        Player player = OooOOO0().f44310OooO0OO.getPlayer();
        if (player != null) {
            player.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        View view = OooOOO0().f44310OooO0OO.f9738OooO0oO;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
        Player player = OooOOO0().f44310OooO0OO.getPlayer();
        if (player != null) {
            player.OooO0Oo();
        }
        boolean z = oO0O00.f53970OooO00o;
        oO0O00.OooO0Oo(true);
        com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48579OooO0Oo.setValue(Boolean.TRUE);
    }
}
