package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O00 implements o00Oo00<ImageAnalysis>, ImageOutputConfig, p034OoooOO0.o0OO00O {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final o00O0O00 f3689OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO0o f3684Oooo000 = Config.OooO00o.OooO00o(ImageAnalysis.BackpressureStrategy.class, "camerax.core.imageAnalysis.backpressureStrategy");

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO0o f3685Oooo00O = Config.OooO00o.OooO00o(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO0o f3686Oooo00o = Config.OooO00o.OooO00o(p028Oooo0oO.o00O0.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO0o f3683Oooo0 = Config.OooO00o.OooO00o(ImageAnalysis.OutputImageFormat.class, "camerax.core.imageAnalysis.outputImageFormat");

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO0o f3687Oooo0O0 = Config.OooO00o.OooO00o(Boolean.class, "camerax.core.imageAnalysis.onePixelShiftEnabled");

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final OooO0o f3688Oooo0OO = Config.OooO00o.OooO00o(Boolean.class, "camerax.core.imageAnalysis.outputImageRotationEnabled");

    public o000O00(@NonNull o00O0O00 o00o0o01) {
        this.f3689OooOooo = o00o0o01;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final ResolutionSelector OooO() {
        int i = o000OO0O.f3705OooO00o;
        return (ResolutionSelector) OooOoO(ImageOutputConfig.f3547OooOOoo, null);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final List OooO00o() {
        int i = o000OO0O.f3705OooO00o;
        return (List) OooOoO(ImageOutputConfig.f3545OooOOo, null);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0O0(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooO0O0(oooO00o);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final ResolutionSelector OooO0OO() {
        int i = o000OO0O.f3705OooO00o;
        return (ResolutionSelector) OooO0O0(ImageOutputConfig.f3547OooOOoo);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ Range OooO0Oo() {
        return o00OOOOo.OooO(this);
    }

    @Override // androidx.camera.core.impl.o000O0Oo
    public final int OooO0o() {
        return 35;
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean OooO0o0(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooO0o0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0oO(Config.OooO00o oooO00o, Config.OptionPriority optionPriority) {
        return ((o00O0O00) getConfig()).OooO0oO(oooO00o, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooO0oo() {
        return ((o00O0O00) getConfig()).OooO0oo();
    }

    @Override // p034OoooOO0.o0Oo0oo
    public final /* synthetic */ String OooOO0(String str) {
        return p034OoooOO0.o0OOO0o.OooO00o(this, str);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size OooOO0O() {
        int i = o000OO0O.f3705OooO00o;
        return (Size) OooOoO(ImageOutputConfig.f3544OooOOOo, null);
    }

    @Override // androidx.camera.core.impl.Config
    public final /* synthetic */ void OooOO0o(p026Oooo0o.OooOOOO oooOOOO) {
        o00O0OO.OooO00o(this, oooOOOO);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int OooOOO() {
        return o000OO0O.OooO0o0(this);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooOOO0(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooOOO0(oooO00o);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size OooOOOO() {
        int i = o000OO0O.f3705OooO00o;
        return (Size) OooOoO(ImageOutputConfig.f3543OooOOOO, null);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final boolean OooOOOo() {
        int i = o000OO0O.f3705OooO00o;
        return OooO0o0(ImageOutputConfig.f3539OooOO0O);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size OooOOo() {
        int i = o000OO0O.f3705OooO00o;
        return (Size) OooOoO(ImageOutputConfig.f3546OooOOo0, null);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int OooOOo0() {
        return o000OO0O.OooO0Oo(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ boolean OooOOoo() {
        return o00OOOOo.OooOO0O(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ SessionConfig OooOo() {
        return o00OOOOo.OooO0o0(this);
    }

    @Override // androidx.camera.core.impl.o000O0Oo
    public final /* synthetic */ DynamicRange OooOo0() {
        return o000O0.OooO00o(this);
    }

    @Override // p034OoooOO0.o0O0O00
    public final /* synthetic */ androidx.camera.core.Oooo0.OooO0O0 OooOo00() {
        return p034OoooOO0.oo0o0Oo.OooO00o(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int OooOo0O() {
        return o000OO0O.OooO0OO(this);
    }

    @Override // androidx.camera.core.impl.o000O0Oo
    public final /* synthetic */ boolean OooOo0o() {
        return o000O0.OooO0O0(this);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooOoO(Config.OooO00o oooO00o, Object obj) {
        return ((o00O0O00) getConfig()).OooOoO(oooO00o, obj);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ int OooOoO0() {
        return o00OOOOo.OooO0oO(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ SessionConfig.OooO0o OooOoOO() {
        return o00OOOOo.OooO0o(this);
    }

    @Override // androidx.camera.core.impl.Config
    public final Config.OptionPriority OooOoo(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooOoo(oooO00o);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ ArrayList OooOoo0() {
        return o000OO0O.OooO0O0(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ CameraSelector OooOooO() {
        return o00OOOOo.OooO00o(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ boolean OooOooo() {
        return o00OOOOo.OooOO0(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int Oooo0() {
        return o000OO0O.OooO00o(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ o000000O Oooo000() {
        return o00OOOOo.OooO0Oo(this);
    }

    @Override // p034OoooOO0.o0Oo0oo
    public final /* synthetic */ String Oooo00O() {
        return p034OoooOO0.o0OOO0o.OooO0O0(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ int Oooo00o() {
        return o00OOOOo.OooO0oo(this);
    }

    @Override // androidx.camera.core.impl.o00Oo00
    public final /* synthetic */ UseCaseConfigFactory.CaptureType getCaptureType() {
        return o00OOOOo.OooO0OO(this);
    }

    @Override // androidx.camera.core.impl.o00O0OOO
    @NonNull
    public final Config getConfig() {
        return this.f3689OooOooo;
    }
}
