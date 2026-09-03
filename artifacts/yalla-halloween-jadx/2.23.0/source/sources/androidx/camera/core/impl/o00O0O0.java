package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0O0 implements o0o0Oo<androidx.camera.core.OooOOOO>, ImageOutputConfig, p034OoooOO0.o0OO00O {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final o00O0 f3723OooOooo;

    public o00O0O0(@NonNull o00O0 o00o1) {
        this.f3723OooOooo = o00o1;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final ResolutionSelector OooO() {
        int i = o000OO0O.f3706OooO00o;
        return (ResolutionSelector) OooOoO(ImageOutputConfig.f3549OooOOoo, null);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final List OooO00o() {
        int i = o000OO0O.f3706OooO00o;
        return (List) OooOoO(ImageOutputConfig.f3547OooOOo, null);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0O0(Config.OooO00o oooO00o) {
        return ((o00O0) getConfig()).OooO0O0(oooO00o);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final ResolutionSelector OooO0OO() {
        int i = o000OO0O.f3706OooO00o;
        return (ResolutionSelector) OooO0O0(ImageOutputConfig.f3549OooOOoo);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ Range OooO0Oo() {
        return o00OOO0O.OooO(this);
    }

    @Override // androidx.camera.core.impl.o000O0Oo
    public final int OooO0o() {
        return ((Integer) ((o00O0) getConfig()).OooO0O0(o000O0Oo.f3702OooO)).intValue();
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean OooO0o0(Config.OooO00o oooO00o) {
        return ((o00O0) getConfig()).OooO0o0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0oO(Config.OooO00o oooO00o, Config.OptionPriority optionPriority) {
        return ((o00O0) getConfig()).OooO0oO(oooO00o, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooO0oo() {
        return ((o00O0) getConfig()).OooO0oo();
    }

    @Override // p034OoooOO0.o0Oo0oo
    public final /* synthetic */ String OooOO0(String str) {
        return p034OoooOO0.o0OOO0o.OooO00o(this, str);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size OooOO0O() {
        int i = o000OO0O.f3706OooO00o;
        return (Size) OooOoO(ImageOutputConfig.f3546OooOOOo, null);
    }

    @Override // androidx.camera.core.impl.Config
    public final /* synthetic */ void OooOO0o(p026Oooo0o.OooOOOO oooOOOO) {
        oo0o0O0.OooO00o(this, oooOOOO);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int OooOOO() {
        return o000OO0O.OooO0o0(this);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooOOO0(Config.OooO00o oooO00o) {
        return ((o00O0) getConfig()).OooOOO0(oooO00o);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size OooOOOO() {
        int i = o000OO0O.f3706OooO00o;
        return (Size) OooOoO(ImageOutputConfig.f3545OooOOOO, null);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final boolean OooOOOo() {
        int i = o000OO0O.f3706OooO00o;
        return OooO0o0(ImageOutputConfig.f3541OooOO0O);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size OooOOo() {
        int i = o000OO0O.f3706OooO00o;
        return (Size) OooOoO(ImageOutputConfig.f3548OooOOo0, null);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int OooOOo0() {
        return o000OO0O.OooO0Oo(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ boolean OooOOoo() {
        return o00OOO0O.OooOO0O(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ SessionConfig OooOo() {
        return o00OOO0O.OooO0o0(this);
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
        return ((o00O0) getConfig()).OooOoO(oooO00o, obj);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ int OooOoO0() {
        return o00OOO0O.OooO0oO(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ SessionConfig.OooO0o OooOoOO() {
        return o00OOO0O.OooO0o(this);
    }

    @Override // androidx.camera.core.impl.Config
    public final Config.OptionPriority OooOoo(Config.OooO00o oooO00o) {
        return ((o00O0) getConfig()).OooOoo(oooO00o);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ ArrayList OooOoo0() {
        return o000OO0O.OooO0O0(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ CameraSelector OooOooO() {
        return o00OOO0O.OooO00o(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ boolean OooOooo() {
        return o00OOO0O.OooOO0(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int Oooo0() {
        return o000OO0O.OooO00o(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ o000000O Oooo000() {
        return o00OOO0O.OooO0Oo(this);
    }

    @Override // p034OoooOO0.o0Oo0oo
    public final /* synthetic */ String Oooo00O() {
        return p034OoooOO0.o0OOO0o.OooO0O0(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ int Oooo00o() {
        return o00OOO0O.OooO0oo(this);
    }

    @Override // androidx.camera.core.impl.o0o0Oo
    public final /* synthetic */ UseCaseConfigFactory.CaptureType getCaptureType() {
        return o00OOO0O.OooO0OO(this);
    }

    @Override // androidx.camera.core.impl.o00O0OO
    @NonNull
    public final Config getConfig() {
        return this.f3723OooOooo;
    }
}
