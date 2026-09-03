package p452o0Ooo00O;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.module.media.camera.CameraActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p427o0OoOO00.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Boolean f46446OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f46447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f46448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f46449OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f46450OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f46451OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Boolean f46452OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(long j, long j2, Context context, Boolean bool, Boolean bool2, boolean z, boolean z2) {
        super(1);
        this.f46447OooO0Oo = context;
        this.f46449OooO0o0 = z;
        this.f46448OooO0o = z2;
        this.f46450OooO0oO = j;
        this.f46451OooO0oo = j2;
        this.f46446OooO = bool;
        this.f46452OooOO0 = bool2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        Context context = this.f46447OooO0Oo;
        Intent intent = new Intent(context, (Class<?>) CameraActivity.class);
        Bundle bundleOooO0O0 = o00Ooo.OooO0O0(new Pair("camera_take_picture", Boolean.valueOf(this.f46449OooO0o0)), new Pair("camera_recording_video", Boolean.valueOf(this.f46448OooO0o)), new Pair("camera_min_recording_video_time", Long.valueOf(this.f46450OooO0oO)), new Pair("camera_max_recording_video_time", Long.valueOf(this.f46451OooO0oo)));
        Boolean bool2 = this.f46446OooO;
        if (bool2 != null) {
            bundleOooO0O0.putBoolean("camera_first_show_take_picture", bool2.booleanValue());
        }
        Boolean bool3 = this.f46452OooOO0;
        if (bool3 != null) {
            bundleOooO0O0.putBoolean("camera_show_front", bool3.booleanValue());
        }
        intent.putExtra("compose_params", bundleOooO0O0);
        context.startActivity(intent);
        MutableState mutableState = o0OOO0o.f45698OooO00o;
        if (o0OOO0o.OooO0oO() != RoomState.Close) {
            o0OOO0o.OooO00o();
        }
        return Unit.INSTANCE;
    }
}
